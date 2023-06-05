package ru.podgoretskaya.ComputerStore.entity;

import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name=  "hard_drive")
public class HardDriveEntity extends AbstractEntity{

    @Column(name = "volume")
    int volume;
}
