package ru.podgoretskaya.ComputerStore.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "монитор")
public class MonitorDTO extends AbstractDTO {

    @Schema(description = "диагональ")
    double diagonal;
}
