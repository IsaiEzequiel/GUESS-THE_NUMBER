package springinitialzr.scaffolding.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springinitialzr.scaffolding.dtos.DummyDto;
import springinitialzr.scaffolding.dtos.MatchDto;
import springinitialzr.scaffolding.dtos.UserDto;
import springinitialzr.scaffolding.models.Dummy;
import springinitialzr.scaffolding.models.Match;
import springinitialzr.scaffolding.models.User;
import springinitialzr.scaffolding.services.MatchService;

@RestController
@RequestMapping("/guess-number/matches")
public class MatchController {

    @Autowired
    private MatchService matchService;

    @PostMapping("")
    public ResponseEntity<MatchDto> createUserMatch(MatchDto matchDto) {
        return null;
    }


}
