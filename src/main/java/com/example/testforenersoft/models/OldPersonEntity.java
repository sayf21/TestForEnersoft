package com.example.testforenersoft.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;
import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@Table(name = "oldPerson")
@Entity
public class OldPersonEntity {
    @Id
    @Column(name = "id")
    @Type(type = "uuid-char")
    private UUID uuid = UUID.randomUUID();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "status")
    private StatusEntity status;

    @Column(name = "type")
    private String type;
}
