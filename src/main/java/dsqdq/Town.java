package dsqdq;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="town")
public class Town {
	  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private long id;
	
	@Column(name="population")
	private int population;
	
	@Column(name="longitude")
	private double longitude;
	
	@Column(name="latitude")
	private double latitude;
	
	@Column(name="postalCode")
	private String postalCode;
	
	@OneToMany(mappedBy = "town")
	private List<Favorite> favorite;
	
	@OneToMany(mappedBy = "town")
	private List<User> user;
	
	@OneToMany(mappedBy = "town")
	private List<Response> response;
	
	@ManyToOne
	@JoinColumn(name="id_region")
	private Region region;

	public Town(int population, double longitude, double latitude, String postalCode, List<Favorite> favorite,
			List<User> user, List<Response> response, Region region) {
		super();
		this.population = population;
		this.longitude = longitude;
		this.latitude = latitude;
		this.postalCode = postalCode;
		this.favorite = favorite;
		this.user = user;
		this.response = response;
		this.region = region;
	}

	public Town() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public List<Favorite> getFavorite() {
		return favorite;
	}

	public void setFavorite(List<Favorite> favorite) {
		this.favorite = favorite;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

	public List<Response> getResponse() {
		return response;
	}

	public void setResponse(List<Response> response) {
		this.response = response;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

}
