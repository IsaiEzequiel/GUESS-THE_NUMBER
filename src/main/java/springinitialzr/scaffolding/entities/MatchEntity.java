package springinitialzr.scaffolding.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import springinitialzr.scaffolding.models.MatchDifficulty;
import springinitialzr.scaffolding.models.MatchStatus;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="matches")
public class MatchEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @JoinColumn(name = "user_id")
    @ManyToOne
    private UserEntity userEntity;

    @Enumerated(EnumType.STRING)
    private MatchDifficulty difficulty;

    private int numberToGuess;

    private int remainingTries;

    @Enumerated(EnumType.STRING)
    private MatchStatus status;

    @Column
    private LocalDateTime createdAt;

    @Column
    private LocalDateTime updatedAt;




}
