package coolweather.model;

public class County {

	private int id;
	private String county_name;
	private String county_code;
	private int city_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCounty_name() {
		return county_name;
	}

	public void setCounty_name(String conty_name) {
		this.county_name = conty_name;
	}

	public String getCounty_code() {
		return county_code;
	}

	public void setCounty_code(String county_code) {
		this.county_code = county_code;
	}

	public int getCity_id() {
		return city_id;
	}

	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}

}