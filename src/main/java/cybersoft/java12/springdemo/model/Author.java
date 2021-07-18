package cybersoft.java12.springdemo.model;

public class Author {
	private String name;
	private String email;
	private String facebook;
	
	public Author() {
		name = "Tuan Phan";
		email = "contact@tuanphan.dev";
		facebook = "https://www.facebook.com/pth.tuan";
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getFacebook() {
		return facebook;
	}
	
}
