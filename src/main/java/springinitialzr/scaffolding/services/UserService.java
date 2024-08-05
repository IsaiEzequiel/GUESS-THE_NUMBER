package springinitialzr.scaffolding.services;

import org.springframework.stereotype.Service;
import springinitialzr.scaffolding.models.Match;
import springinitialzr.scaffolding.models.MatchDifficulty;
import springinitialzr.scaffolding.models.User;

@Service
public interface UserService {

    User createUser(String userName, String email);

    Match createUserMatch(Long userId, MatchDifficulty matchDifficulty);
}
