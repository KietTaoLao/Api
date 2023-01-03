package com.example.Location.repositories;

import com.example.Location.models.Content;
import com.example.Location.models.Detail;
import com.example.Location.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface DetailRepository extends JpaRepository<Detail, Long> {

    Detail getById(Long id);

    @Query("select m from Detail m where m.LocationId=:LocationId")
    Detail findByLocationId(Long LocationId);
    @Modifying
    @Transactional
    @Query(value = "DELETE from Detail m where m.LocationId=:LocationId")
    Integer DeleteByLocationId(@Param("LocationId") Long LocationId);
}
