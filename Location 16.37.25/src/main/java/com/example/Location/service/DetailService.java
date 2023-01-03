
package com.example.Location.service;

import com.example.Location.models.Detail;
import com.example.Location.models.models_view.DetailView;
import com.example.Location.repositories.DetailRepository;
import com.example.Location.repositories.ImagesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailService {
    private final DetailRepository detailRepository;
    private final ImagesRepository imagesRepository;

    public DetailService(DetailRepository detailRepository, ImagesRepository imagesRepository) {
        this.detailRepository = detailRepository;
        this.imagesRepository = imagesRepository;
    }


    public DetailView getDetailView(Long id){
        Detail detail = detailRepository.findById(id).orElse(null);

      //  Images images = imagesRepository.findByImages(id);
        List<String> images = imagesRepository.findByIdDetail(id);

        DetailView rs = new DetailView();
        //List<Images> list = new ArrayList<>();
       // images.forEach(list::add);

        rs.setImage(images);
        rs.setIdDetail(id);
        rs.setBathrooms(detail.getBathrooms());
        rs.setBedrooms(detail.getBedrooms());
        rs.setRooms(detail.getRooms());
        rs.setLocationId(detail.getLocationId());
        return rs;
    }

//    public DetailView getDetailByLocationsId(Long LocationsId){
//        Detail detail = detailRepository.findById(LocationsId).orElse(null);
//
//        List<String> images = imagesRepository.findByIdDetail(LocationsId);
//
//        DetailView rs = new DetailView();
//        //List<Images> list = new ArrayList<>();
//        //images.forEach(list::add);
//
//        rs.setImage(images);
//        rs.setIdDetail(LocationsId);
//        rs.setBathrooms(detail.getBathrooms());
//        rs.setBedrooms(detail.getBedrooms());
//        rs.setRooms(detail.getRooms());
//
//
//        return rs;
//    }
}


