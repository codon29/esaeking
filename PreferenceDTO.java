package Model;

public class PreferenceDTO {

	private String id;
	private int money;
	private int o_time;
	private int bob;
	private int drink;
	private int play;
	private int culture;
	private int sports;
	private int fv;
	
	// 생성자 메소드 자리 
	public PreferenceDTO(String id, int money, int o_time, int bob, int drink, int play, int culture, int sports,
			int fv) {
		this.id = id;
		this.money = money;
		this.o_time = o_time;
		this.bob = bob;
		this.drink = drink;
		this.play = play;
		this.culture = culture;
		this.sports = sports;
		this.fv = fv;
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public int getBob() {
		return bob;
	}

	public void setBob(int bob) {
		this.bob = bob;
	}

	public int getDrink() {
		return drink;
	}

	public void setDrink(int drink) {
		this.drink = drink;
	}

	public int getPlay() {
		return play;
	}

	public void setPlay(int play) {
		this.play = play;
	}

	public int getCulture() {
		return culture;
	}

	public void setCulture(int culture) {
		this.culture = culture;
	}

	public int getSports() {
		return sports;
	}

	public void setSports(int sports) {
		this.sports = sports;
	}

	public int getFv() {
		return fv;
	}

	public void setFv(int fv) {
		this.fv = fv;
	}
	
}
