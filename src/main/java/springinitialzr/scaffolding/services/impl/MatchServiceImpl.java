package springinitialzr.scaffolding.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springinitialzr.scaffolding.entities.MatchEntity;
import springinitialzr.scaffolding.entities.UserEntity;
import springinitialzr.scaffolding.models.Match;
import springinitialzr.scaffolding.models.MatchDifficulty;
import springinitialzr.scaffolding.models.MatchStatus;
import springinitialzr.scaffolding.models.User;
import springinitialzr.scaffolding.repositories.MatchRepository;
import springinitialzr.scaffolding.services.MatchService;

import java.time.LocalDateTime;
import java.util.Random;

@Service
public class MatchServiceImpl implements MatchService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private MatchRepository matchRepository;

    private final Random random = new Random();


    @Override
    public Match createMatch(User user, MatchDifficulty matchDifficulty) {
        MatchEntity matchEntity = new MatchEntity();
        matchEntity.setUserEntity(modelMapper.map(user, UserEntity.class));
        matchEntity.setDifficulty(matchDifficulty);
        switch (matchDifficulty) {
            case HARD -> matchEntity.setRemainingTries(5);
            case MEDIUM -> matchEntity.setRemainingTries(8);
            case EASY -> matchEntity.setRemainingTries(10);
        }
        matchEntity.setNumberToGuess(random.nextInt(101));
        matchEntity.setStatus(MatchStatus.PLAYING);
        matchEntity.setUpdatedAt(LocalDateTime.now());
        matchEntity.setCreatedAt(LocalDateTime.now());
        MatchEntity matchEntitySaved = matchRepository.save(matchEntity);
        return modelMapper.map(matchEntitySaved, Match.class);
    }

}
