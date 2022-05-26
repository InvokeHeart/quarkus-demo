package org.stop.repo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "student")
@Data
public class Student {
    @Id
    private Integer id;
    private String name;
    @Column(name = "clazz_id")
    private String clazzId;

}
