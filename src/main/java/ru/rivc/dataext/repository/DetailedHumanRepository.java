package ru.rivc.dataext.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.rivc.dataext.entity.DetailedHumanEntity;

public interface DetailedHumanRepository extends JpaRepository<DetailedHumanEntity, Integer> {

}
