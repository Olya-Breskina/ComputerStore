package ru.podgoretskaya.ComputerStore.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.podgoretskaya.ComputerStore.dto.LaptopDTO;
import ru.podgoretskaya.ComputerStore.entity.LaptopEntity;
import ru.podgoretskaya.ComputerStore.service.LaptopService;

@RestController
@RequestMapping("/laptop")
@Tag(name = "ноутбук", description = "Методы разделены по типу операции")
public class LaptopController extends AbstractController<LaptopEntity, LaptopDTO> {
    public LaptopController(LaptopService laptopService) {
        super(laptopService);
    }
}
