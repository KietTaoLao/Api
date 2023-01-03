package com.example.Location.repositories;

import com.example.Location.models.Content;
import com.example.Location.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface ContentRepository extends JpaRepository<Content, Long> {

    Content getById(Long id);

    @Query("select m from Content m where m.LocationId=:LocationId")
    Content findByLocationId(Long LocationId);
    @Modifying
    @Transactional
    @Query(value = "DELETE from Content m where m.LocationId=:LocationId")
    Integer DeleteByLocationId(@Param("LocationId") Long LocationId);


}
