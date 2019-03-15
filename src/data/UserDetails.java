package data;

import java.util.ArrayList;
import java.util.Random;

public class UserDetails {
	
    ArrayList<String> password_list = new ArrayList<>();
	private String password;
	Random rand = new Random();
	

		
	
	public String getPassword(){
		
		password_list.add("%pandamanuser1234%");
		password_list.add("$pandaman_tester4321");
		password_list.add("_1234userpass5678_");

		password =  password_list.get(rand.nextInt(password_list.size()));

		
		return password;
		
	}
	
	public void setPassword(String password){
		this.password = password;
	}

	



	


	

	
	
	
	

}
