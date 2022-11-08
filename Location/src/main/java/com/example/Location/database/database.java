package com.example.Location.database;


import com.example.Location.models.Location;

import com.example.Location.repositories.LocationRepository;
import org.hibernate.boot.model.relational.Database;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Configurable
public class database {
/*
    private static final Logger logger = LoggerFactory.getLogger(database.class);

    @Bean
    CommandLineRunner initDatabase(LocationRepository locationRepositiry) {
        return new CommandLineRunner() {

            @Override
            public void run(String... args) throws Exception {
                // TODO Auto-generated method stub
                Location locationA = new Location("k94/1b Mai Lão Bạng", "Hải Châu", "Đà Nẵng");
                Location locationB = new Location("239 Điện Biên Phủ ", "Thanh Khê", "Đà Nẵng");
                logger.info("insert data: " + locationRepositiry.save(locationA));
                logger.info("insert data: " + locationRepositiry.save(locationB));


            }
        };
    }

*/
}


