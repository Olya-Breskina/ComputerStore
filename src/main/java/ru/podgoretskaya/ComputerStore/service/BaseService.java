package ru.podgoretskaya.ComputerStore.service;

import io.github.classgraph.ClassGraph;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.podgoretskaya.ComputerStore.dto.AbstractDTO;
import ru.podgoretskaya.ComputerStore.entity.AbstractEntity;
import ru.podgoretskaya.ComputerStore.mapper.Mapper;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Slf4j
public class BaseService<T extends AbstractEntity, D extends AbstractDTO> implements Service<T, D> {
    private final JpaRepository<T, Long> repo;
    private final Mapper<T, D> mapper;

    @Override
    public List<D> findAll() {
            List<T> all = repo.findAll();
            return all.stream().map(mapper::toDto).collect(Collectors.toList());
    }

    @Override
    public D findById(Long id) {
        T t = repo.findById(id).orElseThrow(NoSuchElementException::new);
        log.info("\n>>> поиск товара  по id:  " + id + ">>>\n");
        return mapper.toDto(t);
    }

    @Override
    public Long saveInDB(D dto) {
        log.info("\n>>> сохраниение  данных " + dto.toString() + ">>>\n");
        T saved = repo.save(mapper.toEntity(dto));
        return saved.getId();
    }

    @Override
    public D edit(Long id, D dto) {
        log.info("\n>>> редактирование товара по id:  " + id + ">>>\n"+"\n>>> сохраниение  данных " + dto.toString() + ">>>\n");
        T t = repo.findById(id).orElseThrow(NoSuchElementException::new);
        T t1 = mapper.toEntity(dto);
        t1.setId(t.getId());
        T saved = repo.save(t1);
        return mapper.toDto(saved);
    }
}
