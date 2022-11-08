package net.code.java.Cap1.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Admin")
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Admin_ID;
	private String FullNameAdmin;
	private String Address_Admin;
	private String Datetime_Admin;
	private int Sex;
	private String Telephone;
	private String Gmail;
	private String Add_Wallet;
	
	public Admin() {}
	
	
	public Admin(String fullName_Admin, String address_Admin, String datetime_Admin, int sex,
			String telephone, String gmail, String add_Wallet) {
		
		
		FullNameAdmin = fullName_Admin;
		Address_Admin = address_Admin;
		Datetime_Admin = datetime_Admin;
		Sex = sex;
		Telephone = telephone;
		Gmail = gmail;
		Add_Wallet = add_Wallet;
	}
	



	public Long getAdmin_ID() {
		return Admin_ID;
	}


	public void setAdmin_ID(Long admin_ID) {
		Admin_ID = admin_ID;
	}


	public String getFullNameAdmin() {
		return FullNameAdmin;
	}


	public void setFullNameAdmin(String fullName_Admin) {
		FullNameAdmin = fullName_Admin;
	}


	public String getAddress_Admin() {
		return Address_Admin;
	}


	public void setAddress_Admin(String address_Admin) {
		Address_Admin = address_Admin;
	}


	public String getDatetime_Admin() {
		return Datetime_Admin;
	}


	public void setDatetime_Admin(String datetime_Admin) {
		Datetime_Admin = datetime_Admin;
	}


	public int getSex() {
		return Sex;
	}


	public void setSex(int sex) {
		Sex = sex;
	}


	public String getTelephone() {
		return Telephone;
	}


	public void setTelephone(String telephone) {
		Telephone = telephone;
	}


	public String getGmail() {
		return Gmail;
	}


	public void setGmail(String gmail) {
		Gmail = gmail;
	}


	public String getAdd_Wallet() {
		return Add_Wallet;
	}


	public void setAdd_Wallet(String add_Wallet) {
		Add_Wallet = add_Wallet;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Admin{" +
		"id=" + Admin_ID +
		",FullName Admin=" + FullNameAdmin +
		",Address Admin=" + Address_Admin +
		",Datetime= " + Datetime_Admin +
		",=" + Sex +
		",Telephone= " + Telephone +
		",Gmail= " + Gmail +
		",Add Wallet= " + Add_Wallet +
		"}";
	}
	
	
	
	
	
	
	
	
	
}
