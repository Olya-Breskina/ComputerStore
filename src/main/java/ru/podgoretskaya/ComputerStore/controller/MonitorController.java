package ru.podgoretskaya.ComputerStore.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.podgoretskaya.ComputerStore.dto.MonitorDTO;
import ru.podgoretskaya.ComputerStore.entity.MonitorEntity;
import ru.podgoretskaya.ComputerStore.service.MonitorService;

@RestController
@RequestMapping("/monitor")
@Tag(name = "монитор", description = "Методы разделены по типу операции")
public class MonitorController extends AbstractController<MonitorEntity, MonitorDTO> {
    public MonitorController(MonitorService monitorService) {
        super(monitorService);
    }
}
