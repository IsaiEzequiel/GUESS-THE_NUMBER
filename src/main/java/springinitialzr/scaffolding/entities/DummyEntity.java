package springinitialzr.scaffolding.entities;

import jakarta.persistence.*;
import org.springframework.web.servlet.resource.CssLinkResourceTransformer;

@Entity
public class DummyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String dummy;
}
