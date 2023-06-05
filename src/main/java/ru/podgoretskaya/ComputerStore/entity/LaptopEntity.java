package ru.podgoretskaya.ComputerStore.entity;

import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name=  "laptop")
public class LaptopEntity extends AbstractEntity {


    @Column(name = "size")
    double size;
}
