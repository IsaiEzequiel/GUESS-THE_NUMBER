package springinitialzr.scaffolding.services.impl;

import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import springinitialzr.scaffolding.entities.UserEntity;
import springinitialzr.scaffolding.models.Match;
import springinitialzr.scaffolding.models.MatchDifficulty;
import springinitialzr.scaffolding.models.User;
import springinitialzr.scaffolding.repositories.UserRepository;
import springinitialzr.scaffolding.services.MatchService;
import springinitialzr.scaffolding.services.UserService;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;
    @Qualifier("matchService")
    @Autowired
    private MatchService matchService;

    @Override
    public User createUser(String userName, String email) {
        Optional<UserEntity> userEntityOptional = userRepository.getByEmail(email);
        if(userEntityOptional.isPresent()){
            //TODO enviar error al usuario.
            throw new IllegalArgumentException("El usuario ya existe");
        }else {
            UserEntity userEntity = new UserEntity();
            userEntity.setUserName(userName);
            userEntity.setEmail(email);
            UserEntity userEntitySaved = userRepository.save(userEntity);
            return modelMapper.map(userEntitySaved, User.class);
        }
    }

    @Override
    public Match createUserMatch(Long userId, MatchDifficulty matchDifficulty) {
        Optional<UserEntity> userEntity = userRepository.findById(userId);
        if ((userEntity.isEmpty())){
            throw new EntityNotFoundException();
        }
        else {
            User user = modelMapper.map(userEntity.get(), User.class);
            return matchService.createMatch(user, matchDifficulty);
        }
    }
}
