package net.code.java.Cap1.database;

import java.util.List;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.code.java.Cap1.models.Admin;
import net.code.java.Cap1.repository.AdminRepositiry;

@Configuration
public class Database {
	/*
	private static final Logger logger = LoggerFactory.getLogger(Database.class);
	
	@Bean
	CommandLineRunner initDatabase (AdminRepositiry adminRepository) {
		
		
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				// TODO Auto-generated method stub
				Admin adminA = new Admin( "Tran Anh Kiet", "k94/1b Mai Lao Bang", "09/26/2001", 1, "0362507936", "taktak269217@gmail.com", "");
				Admin adminB = new Admin( "Tran Anh Khoi", "239 Nguyen Van Linh", "07/21/2008", 1, "0584563452", "tak_217@gmail.com", "");
				logger.info("insert data: " + adminRepository.save(adminA));
				logger.info("insert data: " + adminRepository.save(adminB));
				
				
			}
		};
	}
	*/
}
