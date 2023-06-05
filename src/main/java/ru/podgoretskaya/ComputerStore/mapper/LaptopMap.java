package ru.podgoretskaya.ComputerStore.mapper;

import org.springframework.stereotype.Component;
import ru.podgoretskaya.ComputerStore.dto.LaptopDTO;
import ru.podgoretskaya.ComputerStore.entity.LaptopEntity;

@Component
public class LaptopMap implements Mapper<LaptopEntity, LaptopDTO> {

    @Override
    public LaptopEntity toEntity(LaptopDTO dto) {
        LaptopEntity entity = new LaptopEntity();
        entity.setSize(dto.getSize());
        entity.setPrice(dto.getPrice());
        entity.setManufacturer(dto.getManufacturer());
        entity.setSerialNumber(dto.getSerialNumber());
        entity.setQuantityInStock(dto.getQuantityInStock());
        return entity;
    }

    @Override
    public LaptopDTO toDto(LaptopEntity entity) {
        LaptopDTO dto = new LaptopDTO();
        dto.setSize(entity.getSize());
        dto.setPrice(entity.getPrice());
        dto.setManufacturer(entity.getManufacturer());
        dto.setSerialNumber(entity.getSerialNumber());
        dto.setQuantityInStock(entity.getQuantityInStock());
        return dto;
    }
}
