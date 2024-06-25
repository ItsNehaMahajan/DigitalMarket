package DigitalModel;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Jobs {
	@Id
	private int id;
	private String jobRole;
	private String jobDescription;
	private String jobLocation;
	private String salary;
	private String experience;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getJobRole() {
		return jobRole;
	}
	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	public String getJobLocation() {
		return jobLocation;
	}
	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Jobs [id=" + id + ", jobRole=" + jobRole + ", jobDescription=" + jobDescription + ", jobLocation="
				+ jobLocation + ", salary=" + salary + ", experience=" + experience + "]";
	}
	public Jobs(int id, String jobRole, String jobDescription, String jobLocation, String salary, String experience) {
		super();
		this.id = id;
		this.jobRole = jobRole;
		this.jobDescription = jobDescription;
		this.jobLocation = jobLocation;
		this.salary = salary;
		this.experience = experience;
	}
	public Jobs() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
