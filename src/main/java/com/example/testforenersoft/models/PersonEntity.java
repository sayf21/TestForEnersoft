package com.example.testforenersoft.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;
import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@Table(name = "person")
@Entity
public class PersonEntity {
    @Id
    @Column(name = "id")
    @Type(type = "uuid-char")
    private UUID uuid = UUID.randomUUID();

    @OneToOne
    @JoinColumn(name = "electronicAddress")
    private ElectronicAddressEntity electronicAddress;

    @Column(name = "firstName")
    private String firstName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "landlineNumber")
    private TelephoneNumber landlineNumber;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "mName")
    private String mName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mobilePhone")
    private TelephoneNumber mobilePhone;

    @Column(name = "prefix")
    private String prefix;

    @Column(name = "specialNeed")
    private String specialNeed;

    @Column(name = "suffix")
    private String suffix;
}
