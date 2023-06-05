package ru.podgoretskaya.ComputerStore.entity;

import jakarta.persistence.*;
import lombok.*;
import ru.podgoretskaya.ComputerStore.dto.Enum.FormFactor;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "desktop")
public class DesktopEntity extends AbstractEntity{

    @Column(name = "form_factor")
    FormFactor formFactor;

}
