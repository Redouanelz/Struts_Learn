package learn.struts.actions;

import learn.struts.model.*;
import learn.struts.work.*;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import org.apache.commons.lang.StringUtils;


public class LoginAction extends ActionSupport implements ModelDriven {
	
		/* declarations */		
		private user user = new user();
		
		public user getUser() {
			return user;
		}
		public void setUser(user user) {
			this.user = user;
		}
		
		/* validate */
		public void validate(){
			if( StringUtils.isEmpty(user.getUsername())){
				addFieldError("username", "nom d'utilisateur invalide, Veuillez remplire ce champ.");
			}
			if( StringUtils.isEmpty(user.getPassword())){
				addFieldError("password", "mot de passe invalide, Veuillez remplire ce champ.");
			}
		}
		/*  execute */
		public String execute(){
			System.out.println("Execute");
			return SUCCESS;
		}
		
		
		public String DoLogin(){
			loginwork loginwork = new loginwork();			
			if(loginwork.verifyLogin(user)){
				return SUCCESS;	
			}
			return LOGIN;	
		}		
		
		public String DoLogout(){
			System.out.println("Logout");
			return SUCCESS;
		}
		@Override
		public Object getModel() {
			// TODO Auto-generated method stub
			return user;
		}
	
}
