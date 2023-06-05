package ru.podgoretskaya.ComputerStore.mapper;

import org.springframework.stereotype.Component;
import ru.podgoretskaya.ComputerStore.dto.HardDriveDTO;
import ru.podgoretskaya.ComputerStore.entity.HardDriveEntity;

@Component
public class HardDriveMap implements Mapper<HardDriveEntity, HardDriveDTO> {

    @Override
    public HardDriveEntity toEntity(HardDriveDTO dto) {
        HardDriveEntity entity = new HardDriveEntity();
        entity.setVolume(dto.getVolume());
        entity.setPrice(dto.getPrice());
        entity.setManufacturer(dto.getManufacturer());
        entity.setSerialNumber(dto.getSerialNumber());
        entity.setQuantityInStock(dto.getQuantityInStock());
        return entity;
    }

    @Override
    public HardDriveDTO toDto(HardDriveEntity entity) {
        HardDriveDTO dto = new HardDriveDTO();
        dto.setVolume(entity.getVolume());
        dto.setPrice(entity.getPrice());
        dto.setManufacturer(entity.getManufacturer());
        dto.setSerialNumber(entity.getSerialNumber());
        dto.setQuantityInStock(entity.getQuantityInStock());
        return dto;
    }
}
