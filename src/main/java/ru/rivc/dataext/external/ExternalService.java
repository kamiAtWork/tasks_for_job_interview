package ru.rivc.dataext.external;

import lombok.RequiredArgsConstructor;
import ru.rivc.dataext.dto.DetailedHumanEntityDto;
import ru.rivc.dataext.service.DetailedHumanService;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class ExternalService {
    private final DetailedHumanService service;

    public Optional<DetailedHumanEntityDto> findHumanById(Integer id){
        return service.findHumanById(id);
    }

    public List<DetailedHumanEntityDto> findHumans(List<Integer> humanIds) {
        //ToDo
        return Collections.emptyList();
    }
}
