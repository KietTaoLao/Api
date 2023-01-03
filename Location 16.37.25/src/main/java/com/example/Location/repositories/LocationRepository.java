package com.example.Location.repositories;

import com.example.Location.models.Content;
import com.example.Location.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {

    Location getById(Long id);

    @Query("select m from Location m where m.LocationId=:LocationId")
    Location findByLocationId(Long LocationId);
    @Modifying
    @Transactional
    @Query(value = "DELETE from Location m where m.LocationId=:LocationId")
    Integer DeleteByLocationId(@Param("LocationId") Long LocationId);


}

