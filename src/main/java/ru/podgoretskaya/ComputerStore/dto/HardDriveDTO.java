package ru.podgoretskaya.ComputerStore.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "жесткий диск")
public class HardDriveDTO extends AbstractDTO{

    @Schema(description = "объем памяти ")
    int volume;
}
