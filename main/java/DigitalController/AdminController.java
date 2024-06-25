package DigitalController;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import DigitalDao.AdminDao;
import DigitalDao.JobsDao;
import DigitalDao.UserDao;
import DigitalModel.Admin;
import DigitalModel.Jobs;
import DigitalModel.User;






@Controller
public class AdminController {

	
	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
	
	User user = (User) context.getBean("user");
	UserDao userDao = (UserDao) context.getBean("userDao");
	
	Jobs jobs = (Jobs) context.getBean("jobs");
	JobsDao jobsDao = (JobsDao) context.getBean("jobsDao");
	
	Admin admin = (Admin) context.getBean("admin");
	AdminDao adminDao = (AdminDao) context.getBean("adminDao");
	
	
	@RequestMapping("/")
	public String openHome()
	{
		return "Home";
	}
	
	@RequestMapping("/Home")
	public String openHome1()
	{
		return "Home";
	}
	
	
	
	@RequestMapping("/Login")
	public String AdminLogin()
	{
		return "Login";
	}
	
	
	
	@RequestMapping("/UserLogin")
	public String UserLogin()
	{
		return "UserLogin";
	}
	
	
	@RequestMapping("/UserSignup")
	public String UserSignup()
	{
		return "UserSignup";
	}
	
	@RequestMapping("/UserHome")
	public String UserHome()
	{
		return "UserHome";
	}
	
	
	
	
	@RequestMapping(path = "/afterLoginSubmitUser", method = RequestMethod.POST)
	public String checkAgentLogin(HttpServletRequest request,Model model) {
		  
		
		List<Jobs> jobs = jobsDao.getAllAccounts();
       model.addAttribute("Jobs", jobs);
	return "UserHome";
	    
	}
	

	@RequestMapping(path = "/afterSignupSubmit", method = RequestMethod.POST)
	public String checkAgentsignupH(HttpServletRequest request) {
	    
		
	    String name = request.getParameter("name");
	    String username = request.getParameter("username");
	    String passward= request.getParameter("passward");
	    String mobNo = request.getParameter("mobNo");
	    String address = request.getParameter("address");
	String city = request.getParameter("city");

	    
	    User user = new User( name, username, passward, mobNo, address,city);
	  userDao.insertNewAccount(user);

	    return "UserLogin";
	}
	

	
	@RequestMapping("/AdminHome")
	public String AdminAccount(Model model)
	{
		List<Jobs> jobs = jobsDao.getAllAccounts();
        model.addAttribute("Jobs", jobs);
	  		  
         return "AdminHome";
		
	}
	  

	@RequestMapping("/AddAccount")
	public String addaccount()
	{
		return "AddAccount";
	}
	
	
	@RequestMapping(path="/afterLoginSubmit",method=RequestMethod.POST)
	public String checkLogin(HttpServletRequest request,Model model)
	{
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		if(name.equals("admin@gmail.com") && password.equals("admin"))
		{  
			
	    List<Jobs> jobs = jobsDao.getAllAccounts();
        model.addAttribute("Jobs", jobs);
	  		  return "AdminHome";
			
			
		}
		else
		{
			return "error";
		}
	}
	
	@RequestMapping(path="/AddAccountSubmit",method=RequestMethod.POST)
	public String AddAccount(@ModelAttribute Jobs jobs,Model model)
	{
		try
		{
			jobsDao.insertNewAccount(jobs);
			System.out.println(" Added..!!");
			
			List<Jobs> jobs1 = jobsDao.getAllAccounts();
	        model.addAttribute("Jobs", jobs1);
		  		 
	        return "AdminHome";
			
		}
		catch(Exception e)
		{
			System.out.println("Failed to add..!!");
			e.printStackTrace();
			return "error";
		}
		
    }
	

	@RequestMapping(path="/disapproved/{id}", method=RequestMethod.GET)

	public RedirectView disapprove(@PathVariable("id") int id, HttpServletRequest request,Model model) {
		
		
		 List<Jobs> jobs = jobsDao.getAllAccounts();
		 model.addAttribute("Jobs", jobs);
	     jobsDao.deleteCustomer(id);

	RedirectView redirectview = new RedirectView();
	redirectview.setUrl(request.getContextPath() + "/AdminHome");
	return redirectview;

	
	
	
	
	
	

	
	
	
	}
}
	

	

