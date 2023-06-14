package ru.podgoretskaya.ComputerStore.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.podgoretskaya.ComputerStore.dto.DesktopDTO;
import ru.podgoretskaya.ComputerStore.entity.DesktopEntity;
import ru.podgoretskaya.ComputerStore.service.DesktopService;

@RestController
@RequestMapping("/desktop")
@Tag(name = "пк", description = "Методы разделены по типу операции")
public class DesktopController extends AbstractController<DesktopEntity, DesktopDTO> {
    public DesktopController(DesktopService desktopService) {
        super(desktopService);
    }
}
