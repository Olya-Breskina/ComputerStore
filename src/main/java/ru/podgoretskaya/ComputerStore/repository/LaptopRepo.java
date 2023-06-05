package ru.podgoretskaya.ComputerStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.podgoretskaya.ComputerStore.entity.LaptopEntity;

public interface LaptopRepo extends JpaRepository<LaptopEntity, Long> {

}
