package ru.podgoretskaya.ComputerStore.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import ru.podgoretskaya.ComputerStore.dto.Enum.FormFactor;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "настольный компьютер")
public class DesktopDTO extends AbstractDTO{

    @Schema(description = "форм-фактор: десктопы, неттопы, моноблоки")
    FormFactor formFactor;


}
