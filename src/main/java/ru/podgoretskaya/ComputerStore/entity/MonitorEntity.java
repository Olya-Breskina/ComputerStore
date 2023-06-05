package ru.podgoretskaya.ComputerStore.entity;

import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "monitor")
public class MonitorEntity extends AbstractEntity {

    @Column(name = "diagonal")
    double diagonal;
}
