package dsqdq;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "favorite")
public class Favorite {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false) 
	private long id;

	@Column(name = "indcator_type")
	private String indicatorType;

	@ManyToOne
	@JoinColumn(name = "id_user")
	private User user;

	@ManyToOne
	@JoinColumn(name = "id_town")
	private Town town;

	@ManyToMany
	@JoinTable(name = "favorite_pollutant",

			joinColumns = @JoinColumn(name = "id_favorite", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "id_pollutant", referencedColumnName = "id"))

	private List<Pollutant> pollutant = new ArrayList<>();

	@ManyToMany
	@JoinTable(name = "favorite_weather_component",

			joinColumns = @JoinColumn(name = "id_faovite", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "id_weather_component", referencedColumnName = "id"))

	private List<WeatherComponent> weatherComponant = new ArrayList<>();

	public Favorite(String indicatorType, User user, Town town, List<Pollutant> pollutant,
			List<WeatherComponent> weatherComponant) {
		super();
		this.indicatorType = indicatorType;
		this.user = user;
		this.town = town;
		this.pollutant = pollutant;
		this.weatherComponant = weatherComponant;
	}

	public Favorite() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIndicatorType() {
		return indicatorType;
	}

	public void setIndicatorType(String indicatorType) {
		this.indicatorType = indicatorType;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Town getTown() {
		return town;
	}

	public void setTown(Town town) {
		this.town = town;
	}

	public List<Pollutant> getPollutant() {
		return pollutant;
	}

	public void setPollutant(List<Pollutant> pollutant) {
		this.pollutant = pollutant;
	}

	public List<WeatherComponent> getWeatherComponant() {
		return weatherComponant;
	}

	public void setWeatherComponant(List<WeatherComponent> weatherComponant) {
		this.weatherComponant = weatherComponant;
	}

}
