package ru.podgoretskaya.ComputerStore.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.podgoretskaya.ComputerStore.dto.HardDriveDTO;
import ru.podgoretskaya.ComputerStore.entity.HardDriveEntity;
import ru.podgoretskaya.ComputerStore.service.HardDriveService;

@RestController
@RequestMapping("/hd")
public class HardDriveController extends AbstractController<HardDriveEntity, HardDriveDTO> {
    public HardDriveController(HardDriveService hardDriveService) {
        super(hardDriveService);
    }
}
