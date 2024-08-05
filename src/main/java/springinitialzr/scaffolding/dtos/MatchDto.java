package springinitialzr.scaffolding.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import springinitialzr.scaffolding.models.MatchDifficulty;
import springinitialzr.scaffolding.models.MatchStatus;
import springinitialzr.scaffolding.models.User;

//Dto
@Getter
@Setter
@NoArgsConstructor
public class MatchDto {
    private Long id;

    private MatchDifficulty difficulty;

    private Integer remainingTries;

}
