package DigitalModel;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Admin {
     
	@Id
	private String username;
	private String passward;
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
	@Override
	public String toString() {
		return "Admin [username=" + username + ", passward=" + passward + "]";
	}
	public Admin(String username, String passward) {
		super();
		this.username = username;
		this.passward = passward;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
