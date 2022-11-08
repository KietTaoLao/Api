package net.code.java.Cap1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import net.code.java.Cap1.models.Admin;

public interface AdminRepositiry extends JpaRepository<Admin, Long> {
	//List<Admin> findByFullNameAdmin(String FullNameAdmin);
}
