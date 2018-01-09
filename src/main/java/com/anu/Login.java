package com.anu;

public class Login {

	private String uname,upass;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpass() {
		return upass;
	}

	public void setUpass(String upass) {
		this.upass = upass;
	}
	
	public String execute(){
		
		if(LoginDao.validate(uname,upass)){
			return "success";
		}
		else{
			return "error";
			
		}
	}
}
