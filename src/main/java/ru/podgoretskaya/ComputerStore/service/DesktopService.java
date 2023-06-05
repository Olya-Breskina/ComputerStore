package ru.podgoretskaya.ComputerStore.service;

import org.springframework.stereotype.Service;
import ru.podgoretskaya.ComputerStore.dto.DesktopDTO;
import ru.podgoretskaya.ComputerStore.entity.DesktopEntity;
import ru.podgoretskaya.ComputerStore.mapper.DesktopMap;
import ru.podgoretskaya.ComputerStore.repository.DesktopRepo;

@Service
public class DesktopService extends BaseService<DesktopEntity, DesktopDTO> {
    public DesktopService(DesktopRepo desktopRepo, DesktopMap desktopMap) {
        super(desktopRepo, desktopMap);
    }
}
