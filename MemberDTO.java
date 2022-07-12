package Model;

public class MemberDTO {

	private String id;
	private String pw;
	private String m_name;
	private String birth; // date??
	private String email;
	private String m_num;
	
	
	// 생성자 메소드 생성
	public MemberDTO(String id, String pw, String m_name, String birth, String email, String m_num) {
		this.id = id;
		this.pw = pw;
		this.m_name = m_name;
		this.birth = birth;
		this.email = email;
		this.m_num = m_num;
	}
	
	
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
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getM_num() {
		return m_num;
	}
	public void setM_num(String m_num) {
		this.m_num = m_num;
	}
}
