package ru.podgoretskaya.ComputerStore.service;

import ru.podgoretskaya.ComputerStore.dto.AbstractDTO;
import ru.podgoretskaya.ComputerStore.entity.AbstractEntity;

import java.util.List;

public interface Service<T extends AbstractEntity, D extends AbstractDTO> {
    List<D> findAll();

    D findById(Long id);

    Long saveInDB(D dto);

    D edit(Long id, D dto);
}
