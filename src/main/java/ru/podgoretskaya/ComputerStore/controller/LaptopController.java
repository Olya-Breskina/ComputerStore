package ru.podgoretskaya.ComputerStore.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.podgoretskaya.ComputerStore.dto.LaptopDTO;
import ru.podgoretskaya.ComputerStore.entity.LaptopEntity;
import ru.podgoretskaya.ComputerStore.service.LaptopService;

@RestController
@RequestMapping("/laptop")
public class LaptopController extends AbstractController<LaptopEntity, LaptopDTO> {
    public LaptopController(LaptopService laptopService) {
        super(laptopService);
    }
}
