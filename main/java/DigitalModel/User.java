package DigitalModel;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;


@Entity
@Component
public class User {
	
	private String name;
	@Id
	private String username;
	private String passward;
	private String mobNo;
	private String address;
	private String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassward() {
		return passward;
	}
	public void setPassward(String passward) {
		this.passward = passward;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", username=" + username + ", passward=" + passward + ", mobNo=" + mobNo
				+ ", address=" + address + ", city=" + city + "]";
	}
	public User(String name, String username, String passward, String mobNo, String address, String city) {
		super();
		this.name = name;
		this.username = username;
		this.passward = passward;
		this.mobNo = mobNo;
		this.address = address;
		this.city = city;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
