package com.example.Location.models.models_view;

import com.example.Location.models.Content;
import com.example.Location.models.Detail;
import com.example.Location.models.Location;
import com.example.Location.models.Utility;

import java.util.Optional;

public class FullView {
    private Long id;
    private Content content;
    private DetailView detail;
    private Location location;
    private Utility utility;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public DetailView getDetail() {
        return detail;
    }

    public void setDetail(DetailView detail) {
        this.detail = detail;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Utility getUtility() {
        return utility;
    }

    public void setUtility(Utility utility) {
        this.utility = utility;
    }
}
