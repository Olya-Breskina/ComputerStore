package ru.podgoretskaya.ComputerStore.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.podgoretskaya.ComputerStore.dto.HardDriveDTO;
import ru.podgoretskaya.ComputerStore.entity.HardDriveEntity;
import ru.podgoretskaya.ComputerStore.service.HardDriveService;

@RestController
@Tag(name = "Магазин", description = "Методы для работы с товаром - жесткий диск")
@RequestMapping("/hd")
public class HardDriveController extends AbstractController<HardDriveEntity, HardDriveDTO> {
    public HardDriveController(HardDriveService hardDriveService) {
        super(hardDriveService);
    }
}
