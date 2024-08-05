package springinitialzr.scaffolding.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import springinitialzr.scaffolding.models.MatchDifficulty;

@Getter
@Setter
@NoArgsConstructor
public class CreateUseMatchDto {
    private MatchDifficulty difficulty;
}
