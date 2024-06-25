package DigitalDao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;


import DigitalModel.Jobs;

@Component
public class JobsDao {

	 @Autowired
		private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
	public JobsDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JobsDao(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Transactional
    public  void insertNewAccount(Jobs jobs) {
		 hibernateTemplate.save(jobs);
		
		
	}
  
	@Transactional
	public  Jobs getAccount(int username) {
		return hibernateTemplate.get(Jobs.class, username);
	}

	 @Transactional
	public void deleteCustomer(int username1) {
		 Jobs jobs = hibernateTemplate.get(Jobs.class, username1); 
			hibernateTemplate.delete(jobs);
		
	}
	 
	 @Transactional
	    public List<Jobs> getAllAccounts() {
	    	return hibernateTemplate.loadAll( Jobs.class);
		}
	  

	 @Transactional
	public  void updateCustomer(Jobs accountsObj) {
		 hibernateTemplate.update(accountsObj);
		
	}

	


}
