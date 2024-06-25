package DigitalDao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import DigitalModel.User;



@Component
public class UserDao {


	 @Autowired
		private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
	public UserDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDao(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Transactional
    public  void insertNewAccount(User accounts) {
		 hibernateTemplate.save(accounts);
		
		
	}
  
	@Transactional
	public  User getAccount(String  username) {
		return hibernateTemplate.get(User.class, username);
	}

	 @Transactional
	public void deleteCustomer(int accno1) {
		 User accounts = hibernateTemplate.get(User.class, accno1); 
			hibernateTemplate.delete(accounts);
		
	}
	 
	 @Transactional
	    public List<User> getAllAccounts() {
	    	return hibernateTemplate.loadAll( User.class);
		}
	  

	 @Transactional
	public  void updateCustomer(User accountsObj) {
		 hibernateTemplate.update(accountsObj);
		
	}

}
