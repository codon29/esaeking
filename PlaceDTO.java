package Model;

public class PlaceDTO {

	private String name;
	private String p_time;
	private int star;
	private String location;
	private int category_id;
	private String p_num;
	private int money;
	private int o_time;
	
	public PlaceDTO(String name, String p_time, int star, String location, int category_id, String p_num, int money,
			int o_time) {
		this.name = name;
		this.p_time = p_time;
		this.star = star;
		this.location = location;
		this.category_id = category_id;
		this.p_num = p_num;
		this.money = money;
		this.o_time = o_time;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getP_time() {
		return p_time;
	}

	public void setP_time(String p_time) {
		this.p_time = p_time;
	}

	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public String getP_num() {
		return p_num;
	}

	public void setP_num(String p_num) {
		this.p_num = p_num;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getO_time() {
		return o_time;
	}

	public void setO_time(int o_time) {
		this.o_time = o_time;
	}
	
}
