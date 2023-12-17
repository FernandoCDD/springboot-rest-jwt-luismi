package net.openwebinars.springboot.restjwt.security.jwt.refresh;

import jakarta.persistence.*;
import lombok.*;
import net.openwebinars.springboot.restjwt.user.model.User;
import org.hibernate.annotations.NaturalId;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.Instant;
import java.util.UUID;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor @AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class RefreshToken {

    @Id
    private UUID id;

    @MapsId //Sirve para sincronizar el id de la clase con el valor de la asociación user.
    @OneToOne
    @JoinColumn(name = "user_id", columnDefinition = "uuid")
    private User user;

    @NaturalId //No debe repetirse
    @JoinColumn(nullable = false, unique = true)
    private String token;

    @Column(nullable = false)
    private Instant expiryDate;

    @CreatedDate
    private Instant createdAt;

}
