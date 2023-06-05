package ru.podgoretskaya.ComputerStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.podgoretskaya.ComputerStore.entity.MonitorEntity;

public interface MonitorRepo extends JpaRepository<MonitorEntity, Long> {

}
