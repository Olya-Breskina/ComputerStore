package ru.podgoretskaya.ComputerStore.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class AbstractEntity {
    @Column(name = "serial_number")
    String serialNumber;
    @Column(name = "manufacturer")
    String manufacturer;
    @Column(name = "price")
    BigDecimal price;
    @Column(name = "quantity_in_stock")
    int quantityInStock;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
