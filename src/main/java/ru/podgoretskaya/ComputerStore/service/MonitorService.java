package ru.podgoretskaya.ComputerStore.service;

import org.springframework.stereotype.Service;
import ru.podgoretskaya.ComputerStore.dto.MonitorDTO;
import ru.podgoretskaya.ComputerStore.entity.MonitorEntity;
import ru.podgoretskaya.ComputerStore.mapper.MonitorMap;
import ru.podgoretskaya.ComputerStore.repository.MonitorRepo;

@Service
public class MonitorService extends BaseService<MonitorEntity, MonitorDTO> {
    public MonitorService(MonitorRepo monitorRepo, MonitorMap monitorMap) {
        super(monitorRepo, monitorMap);
    }
}
