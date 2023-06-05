package ru.podgoretskaya.ComputerStore.service;

import org.springframework.stereotype.Service;
import ru.podgoretskaya.ComputerStore.dto.LaptopDTO;
import ru.podgoretskaya.ComputerStore.entity.LaptopEntity;
import ru.podgoretskaya.ComputerStore.mapper.LaptopMap;
import ru.podgoretskaya.ComputerStore.repository.LaptopRepo;

@Service
public class LaptopService extends BaseService<LaptopEntity, LaptopDTO> {
    public LaptopService(LaptopRepo laptopRepo, LaptopMap laptopMap) {
        super(laptopRepo, laptopMap);
    }
}
