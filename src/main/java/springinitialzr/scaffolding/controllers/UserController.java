package springinitialzr.scaffolding.controllers;


import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springinitialzr.scaffolding.dtos.CreateUseMatchDto;
import springinitialzr.scaffolding.dtos.MatchDto;
import springinitialzr.scaffolding.dtos.UserDto;
import springinitialzr.scaffolding.models.Match;
import springinitialzr.scaffolding.models.User;
import springinitialzr.scaffolding.services.UserService;

@RestController
@RequestMapping("/guess-number/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping("")
    public ResponseEntity<UserDto> createUser(@Valid @RequestBody UserDto userDto) {
        User user = userService.createUser(userDto.getUsername(), userDto.getEmail());
        UserDto userDtoCreated = modelMapper.map(user, UserDto.class);
        return ResponseEntity.ok(userDtoCreated);
    }

    @PostMapping("/{userId}/matches")
    public ResponseEntity<MatchDto> createUserMatch(@PathVariable Long userId,
                                                    @RequestBody CreateUseMatchDto createUseMatchDto) {
        Match match = userService.createUserMatch(userId, createUseMatchDto.getDifficulty());
        MatchDto matchDto = modelMapper.map(match, MatchDto.class);
        return ResponseEntity.ok(matchDto);
    }

    @PostMapping("/{userId}/matches/{matchId}")
    public ResponseEntity<MatchDto> createUserMatch(@PathVariable Long userId,
                                                    @PathVariable Long matchId) {
        return null;
    }
}
