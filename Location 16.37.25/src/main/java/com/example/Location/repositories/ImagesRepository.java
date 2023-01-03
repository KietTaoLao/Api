package com.example.Location.repositories;

import com.example.Location.models.Images;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface ImagesRepository extends JpaRepository<Images, Integer> {
   @Query("select m.image from Images m where m.idDetail =:idDetail")
    List<String> findByIdDetail(Long idDetail);

    //Images findByImages(Long idDetail);

    @Query("select m from Images m where m.idDetail =:idDetail")
    List<Images> findByDetailId(Long idDetail);
    @Modifying
    @Transactional
    @Query(value = "DELETE from Images m where m.idDetail=:idDetail")
    Integer DeleteByLocationId(@Param("idDetail") Long idDetail);

}

