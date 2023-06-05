package ru.podgoretskaya.ComputerStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.podgoretskaya.ComputerStore.entity.DesktopEntity;

public interface DesktopRepo extends JpaRepository<DesktopEntity, Long> {

}
