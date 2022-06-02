package com.example.testforenersoft.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;
import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@Table(name = "identifiedObject")
@Entity
public class IdentifiedObjectEntity {
    @Id
    @Column(name = "id")
    @Type(type = "uuid-char")
    private UUID uuid = UUID.randomUUID();

    @Column(name = "aliasName")
    private String aliasName;

    @Column(name = "description")
    private String description;

    @Column(name = "mRID")
    private String mRID;

    @Column(name = "name")
    private String name;
}
