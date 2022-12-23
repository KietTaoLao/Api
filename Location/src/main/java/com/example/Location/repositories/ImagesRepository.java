package com.example.Location.repositories;

import com.example.Location.models.Images;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImagesRepository extends JpaRepository<Images, Integer> {
   @Query("select m.image from Images m where idDetail =:idDetail")
    List<String> findByIdDetail(Long idDetail);

    //Images findByImages(Long idDetail);

   // List<Images> findByImages(Long idDetail);

}

