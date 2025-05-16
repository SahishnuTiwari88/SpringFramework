package springmvcsearch.entity;

public class Address {

	private String Street;
	private String city;
	private String zip;
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "Address [Street=" + Street + ", city=" + city + ", zip=" + zip + "]";
	}
	
}
