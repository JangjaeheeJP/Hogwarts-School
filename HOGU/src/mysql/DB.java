package mysql;

public class DB {
	
	private String id;
	private String pw;
//	private String pwCheck;
	private String name;
	private String tel;
	private String email;
	private String magic;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	
//	public String getPwCheck() {
//		return pwCheck;
//	}
//	public void setPwCheck(String pwCheck) {
//		this.pwCheck = pwCheck;
//	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMagic() {
		return magic;
	}
	public void setMagic(String magic) {
		this.magic = magic;
	}
	
}
