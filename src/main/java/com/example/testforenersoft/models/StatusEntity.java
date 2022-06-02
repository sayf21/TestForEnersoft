package com.example.testforenersoft.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;
import javax.persistence.*;
import java.util.Date;
import java.util.UUID;


@Getter
@Setter
@Table(name = "status")
@Entity
public class StatusEntity {
    @Id
    @Column(name = "id")
    @Type(type = "uuid-char")
    private UUID uuid = UUID.randomUUID();

    @Column(name = "dateTime")
    private Date dateTime;

    @Column(name = "reason")
    private String reason;

    @Column(name = "remark")
    private String remark;

    @Column(name = "value")
    private String value;
}
