package DigitalDao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;


import DigitalModel.Admin;

@Component
public class AdminDao {

	
	 @Autowired
		private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
	public AdminDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdminDao(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}

	
	@Transactional
    public  void insertNewAccount(Admin admin) {
		 hibernateTemplate.save(admin);
		
		
	}
  
	@Transactional
	public  Admin getAccount(int username) {
		return hibernateTemplate.get(Admin.class, username);
	}

	 @Transactional
	public void deleteCustomer(int username1) {
		 Admin admin = hibernateTemplate.get(Admin.class, username1); 
			hibernateTemplate.delete(admin);
		
	}
	 
	 @Transactional
	    public List<Admin> getAllAccounts() {
	    	return hibernateTemplate.loadAll( Admin.class);
		}
	  

	 @Transactional
	public  void updateCustomer(Admin accountsObj) {
		 hibernateTemplate.update(accountsObj);
		
	}

	
}
