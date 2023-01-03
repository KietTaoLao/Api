package com.example.Location.service;

import com.example.Location.controllers.ContentController;
import com.example.Location.controllers.DetailController;
import com.example.Location.controllers.LocationController;
import com.example.Location.controllers.UtilityController;
import com.example.Location.models.Content;
import com.example.Location.models.Detail;
import com.example.Location.models.Location;
import com.example.Location.models.Utility;
import com.example.Location.models.models_view.DetailView;
import com.example.Location.models.models_view.FullView;
import com.example.Location.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FullService {

    private ContentController contentController;
    private DetailController detailController;
    private LocationController locationController;
    private UtilityController utilityController;


    @Autowired
    private ContentRepository contentRepository;

    @Autowired
    private LocationRepository locationRepository;

    @Autowired
    private ImagesRepository imagesRepository;

    @Autowired
    private DetailRepository detailRepository;

    @Autowired
    private UtilityRepository utilityRepository;

    public FullService(ContentController contentController, DetailController detailController, LocationController locationController, UtilityController utilityController) {
        this.contentController = contentController;
        this.detailController = detailController;
        this.locationController = locationController;
        this.utilityController = utilityController;
    }

    /**
     * public FullService(ContentController contentController, DetailController detailController, LocationController locationController, UtilityController utilityController) {
     * this.contentController = contentController;
     * this.detailController = detailController;
     * this.locationController = locationController;
     * this.utilityController = utilityController;
     * }
     */


    public FullView GetData(Long id) {

        FullView api = new FullView();
        api.setId(id);
        api.setContent(contentRepository.findByLocationId(id));
        api.setLocation(locationRepository.findByLocationId(id));

        Detail detail = detailRepository.findByLocationId(id);
        List<String> images = imagesRepository.findByIdDetail(detail.getIdDetail());

        DetailView detailView = new DetailView(detail,images);
        api.setDetail(detailView);
        api.setUtility(utilityRepository.findByLocationId(id));
        return api;

     //   return null;


    }


    public FullView DeleteFull(Long id){

        FullView api = new FullView();

        contentRepository.DeleteByLocationId(id);
        locationRepository.DeleteByLocationId(id);

        imagesRepository.DeleteByLocationId(id);
        detailRepository.DeleteByLocationId(id);

        utilityRepository.DeleteByLocationId(id);

        return null;
    }



}

