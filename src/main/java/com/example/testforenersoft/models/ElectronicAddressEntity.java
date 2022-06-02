package com.example.testforenersoft.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;
import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@Table(name = "electronicAddressEntity")
@Entity
public class ElectronicAddressEntity {
    @Id
    @Column(name = "id")
    @Type(type = "uuid-char")
    private UUID uuid = UUID.randomUUID();

    @Column(name = "address")
    private String address;
}
