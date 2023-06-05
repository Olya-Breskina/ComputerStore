package ru.podgoretskaya.ComputerStore.service;

import org.springframework.stereotype.Service;
import ru.podgoretskaya.ComputerStore.dto.HardDriveDTO;
import ru.podgoretskaya.ComputerStore.entity.HardDriveEntity;
import ru.podgoretskaya.ComputerStore.mapper.HardDriveMap;
import ru.podgoretskaya.ComputerStore.repository.HardDriveRepo;

@Service
public class HardDriveService extends BaseService<HardDriveEntity, HardDriveDTO> {
    public HardDriveService(HardDriveRepo hardDriveRepo, HardDriveMap hardDriveMap) {
        super(hardDriveRepo, hardDriveMap);
    }
}
