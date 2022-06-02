package com.example.testforenersoft.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;
import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@Table(name = "telephoneNumber")
@Entity
public class TelephoneNumber {
    @Id
    @Column(name = "id")
    @Type(type = "uuid-char")
    private UUID uuid = UUID.randomUUID();

    @Column(name = "number")
    private String number;
}
