package com.example.Location.repositories;

import com.example.Location.models.Content;
import com.example.Location.models.Location;
import com.example.Location.models.Utility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface UtilityRepository extends JpaRepository<Utility, Long> {

    Utility getById(Long id);

    @Query("select m from Utility m where m.LocationId=:LocationId")
    Utility findByLocationId(Long LocationId);
    @Modifying
    @Transactional
    @Query(value = "DELETE from Utility m where m.LocationId=:LocationId" )
    Integer DeleteByLocationId(@Param("LocationId") Long LocationId);

}
