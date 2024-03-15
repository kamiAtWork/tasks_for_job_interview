package ru.rivc.dataext.entity;

import lombok.Getter;
import lombok.Setter;
import ru.rivc.dataext.ContactType;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class ContactInfoEntity {
    @Id
    private Integer id;

    private ContactType contactType;
    private String contactValue;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "humanId", nullable = false)
    private DetailedHumanEntity detailedHumanEntity;
}
