package ru.rivc.dataext.dto;

import ru.rivc.dataext.ContactType;

import java.io.Serializable;

public record ContactInfoEntityDto(Integer id, ContactType contactType, String contactValue) implements Serializable {
}
