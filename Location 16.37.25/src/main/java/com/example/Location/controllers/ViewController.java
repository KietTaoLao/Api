package com.example.Location.controllers;

import com.example.Location.models.*;
import com.example.Location.models.models_view.DetailView;
import com.example.Location.models.models_view.FullView;
import com.example.Location.repositories.*;
import com.example.Location.service.DetailService;
import com.example.Location.service.FullService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/view")
public class ViewController {

    @Autowired
    private DetailService detailService;

    @Autowired
    private FullService fullService;

    @Autowired
    private ContentRepository contentRepository;

    @Autowired
    private DetailRepository detailRepository;

    @Autowired
    private LocationRepository locationRepository;

    @Autowired
    private UtilityRepository utilityRepository;

   @Autowired
   private ImagesRepository imagesRepository;

    @GetMapping("/{id}")
    public ResponseEntity<FullView> getFullData(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).header("Access-Control-Allow-Origin","*").body(
                fullService.GetData(id)
        );

    }


    @GetMapping("")
    public ResponseEntity<List<FullView>> getFullData() {
        List<Location> list = locationRepository.findAll();
        List<FullView> rs = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
//            Optional<Content> temp = contentRepository.findById(list.get(i).getId());
            Long id = list.get(i).getId();
            System.out.println(fullService.GetData(id));
            rs.add(fullService.GetData(id));
        }
       // return new ResponseEntity<>(rs, HttpStatus.OK);
        return ResponseEntity.status(HttpStatus.OK).header("Access-Control-Allow-Origin","*").body(
                rs
        );
    }

    @PostMapping("/insert")
    ResponseEntity<ResponseObject> inserFull (@RequestBody FullView data){
        FullView fullView = new FullView();

        Location location = locationRepository.save(data.getLocation());

        //insert Content
        Content content = data.getContent() ;
        content.setLocationId(location.getId());
        contentRepository.save(content);

        //Insert Detail
        DetailView detailView = data.getDetail();
        detailView.setLocationId(location.getId());
        Detail detail = new Detail(detailView);

        detailRepository.save(detail);

        //Insert images
        List<String> listImages = data.getDetail().getImage();

        for(String imageUrl: listImages){
            Images images = new Images();
            images.setImage(imageUrl);
            images.setIdDetail(detail.getIdDetail());
            imagesRepository.save(images);
        }


        //insert Utility
        Utility utility = data.getUtility();
        utility.setLocationId(location.getId());
        utilityRepository.save(utility);


        fullView.setContent(content);
        fullView.setLocation(location);
        fullView.setUtility(utility);
        fullView.setDetail(detailView);


        return ResponseEntity.status(HttpStatus.OK).header("Access-Control-Allow-Origin","*").body(
                new ResponseObject("Ok", "Insert  successfully", fullView)
        );
    }

    @DeleteMapping("/delete/{id}")
    ResponseEntity<ResponseObject> deleteALL(@PathVariable Long id) {
        boolean exists = locationRepository.existsById(id);
        if(exists) {
            contentRepository.DeleteByLocationId(id);
            locationRepository.DeleteByLocationId(id);

            imagesRepository.DeleteByLocationId(id);
            detailRepository.DeleteByLocationId(id);

            utilityRepository.DeleteByLocationId(id);
            return ResponseEntity.status(HttpStatus.OK).header("Access-Control-Allow-Origin","*").body(
                    new ResponseObject("ok", "Delete Full successfully", "")
            );
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).header("Access-Control-Allow-Origin","*").body(
                new ResponseObject("failed", "Cannot find Full to delete", "")
        );
    }

}
