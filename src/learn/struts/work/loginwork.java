package learn.struts.work;
import learn.struts.model.user;

public class loginwork {

	
	public boolean verifyLogin(user user)
	{
		if(user.getUsername().equals("admin") && user.getPassword().equals("admin")){
			System.out.println("Login");
			return true;	
		}
		return false;	
	}
}
