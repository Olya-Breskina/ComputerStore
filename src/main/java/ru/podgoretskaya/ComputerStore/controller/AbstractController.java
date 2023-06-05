package ru.podgoretskaya.ComputerStore.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import ru.podgoretskaya.ComputerStore.dto.AbstractDTO;
import ru.podgoretskaya.ComputerStore.entity.AbstractEntity;
import ru.podgoretskaya.ComputerStore.service.Service;

import java.util.List;


@RequiredArgsConstructor
@Slf4j
@Tag(name = "Магазин", description = "Методы разделены по типу товара")
public class AbstractController<T extends AbstractEntity, D extends AbstractDTO> {
    private final Service<T, D> service;

    @PostMapping("/save")
    @Operation(summary = "добавление товара")
    public ResponseEntity<Long> save(@RequestBody D model) {
        return ResponseEntity.ok(service.saveInDB(model));
    }

    @PostMapping("/edit/{id}")
    @Operation(summary = "редактирование товара по идентификатору (id)")
    public ResponseEntity<D> edit(@RequestBody D model,@RequestParam("id") Long id) {
        return new ResponseEntity<>(service.edit(id,model), HttpStatus.OK);
    }

    @GetMapping("/view/{id}")
    @Operation(summary = "поиск товара по идентификатору (id)")
    public ResponseEntity<D> viewById(@RequestParam("id") Long id) {
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @GetMapping("/view")
    @Operation(summary = "просмотр товара")
    public ResponseEntity<List<D>> view() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }
}
