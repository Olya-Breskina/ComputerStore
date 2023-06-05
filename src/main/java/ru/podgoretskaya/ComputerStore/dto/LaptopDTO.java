package ru.podgoretskaya.ComputerStore.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "ноутбук")
public class LaptopDTO  extends AbstractDTO{

    @Schema(description = "размер")
    double size;
}
