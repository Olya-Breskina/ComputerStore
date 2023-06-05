package ru.podgoretskaya.ComputerStore.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public  abstract class AbstractDTO {
    @Schema(description = "номер серии")
    String serialNumber;
    @Schema(description = "производитель")
    String manufacturer;
    @Schema(description = "цена")
    BigDecimal price;
    @Schema(description = "количество единиц продукции на складе")
    int quantityInStock;
}
