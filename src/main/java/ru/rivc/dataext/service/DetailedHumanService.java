package ru.rivc.dataext.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.rivc.dataext.dto.DetailedHumanEntityDto;
import ru.rivc.dataext.repository.DetailedHumanRepository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DetailedHumanService {
    private final DetailedHumanRepository repository;

    public Optional<DetailedHumanEntityDto> findHumanById(Integer id){
        // ToDo
        return Optional.empty();
    }

    public List<DetailedHumanEntityDto> findHumans(Collection<Integer> humanIds){
        // ToDo
        return null;
    }
}
