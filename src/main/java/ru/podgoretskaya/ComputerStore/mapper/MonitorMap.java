package ru.podgoretskaya.ComputerStore.mapper;

import org.springframework.stereotype.Component;
import ru.podgoretskaya.ComputerStore.dto.MonitorDTO;
import ru.podgoretskaya.ComputerStore.entity.MonitorEntity;

@Component
public class MonitorMap implements Mapper<MonitorEntity, MonitorDTO> {

    @Override
    public MonitorEntity toEntity(MonitorDTO dto) {
        MonitorEntity entity = new MonitorEntity();
        entity.setDiagonal(dto.getDiagonal());
        entity.setPrice(dto.getPrice());
        entity.setManufacturer(dto.getManufacturer());
        entity.setSerialNumber(dto.getSerialNumber());
        entity.setQuantityInStock(dto.getQuantityInStock());
        return entity;
    }

    @Override
    public MonitorDTO toDto(MonitorEntity entity) {
        MonitorDTO dto = new MonitorDTO();
        dto.setDiagonal(entity.getDiagonal());
        dto.setPrice(entity.getPrice());
        dto.setManufacturer(entity.getManufacturer());
        dto.setSerialNumber(entity.getSerialNumber());
        dto.setQuantityInStock(entity.getQuantityInStock());
        return dto;
    }
}
