package ru.podgoretskaya.ComputerStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.podgoretskaya.ComputerStore.entity.HardDriveEntity;

public interface HardDriveRepo extends JpaRepository<HardDriveEntity, Long> {

}
