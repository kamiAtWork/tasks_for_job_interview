package ru.rivc.dataext.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

public record DetailedHumanEntityDto(
        Integer id,
        String name,
        Instant birthDate,
        List<ContactInfoEntityDto> contactInfoEntities)
        implements Serializable {
}
