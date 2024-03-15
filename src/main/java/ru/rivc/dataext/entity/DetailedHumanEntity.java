package ru.rivc.dataext.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class DetailedHumanEntity {
    @Id
    private Integer id;

    private String name;
    private Instant birthDate;
    @OneToMany(mappedBy = "detailedHumanEntity")
    private List<ContactInfoEntity> contactInfoEntities = new ArrayList<>();
}
