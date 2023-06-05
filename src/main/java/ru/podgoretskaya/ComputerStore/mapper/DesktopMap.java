package ru.podgoretskaya.ComputerStore.mapper;

import org.springframework.stereotype.Component;
import ru.podgoretskaya.ComputerStore.dto.DesktopDTO;
import ru.podgoretskaya.ComputerStore.entity.DesktopEntity;

@Component
public class DesktopMap implements Mapper<DesktopEntity,DesktopDTO> {

    @Override
    public DesktopEntity toEntity(DesktopDTO dto) {
        DesktopEntity entity = new DesktopEntity();
        entity.setFormFactor(dto.getFormFactor());
        entity.setPrice(dto.getPrice());
        entity.setManufacturer(dto.getManufacturer());
        entity.setSerialNumber(dto.getSerialNumber());
        entity.setQuantityInStock(dto.getQuantityInStock());
        return entity;
    }

    @Override
    public DesktopDTO toDto(DesktopEntity entity) {
        DesktopDTO dto=new DesktopDTO();
        dto.setFormFactor(entity.getFormFactor());
        dto.setPrice(entity.getPrice());
        dto.setManufacturer(entity.getManufacturer());
        dto.setSerialNumber(entity.getSerialNumber());
        dto.setQuantityInStock(entity.getQuantityInStock());
        return dto;
    }
}

