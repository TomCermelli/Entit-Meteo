package dsqdq;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

public class WeatherComponent extends Response {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private long id;
	
	@Column(name = "entitled")
	private String entitled;
	
	@OneToMany(mappedBy = "weatherComponent")
	private List<WeatherDatabase> weatherDatabase;
	
	
	@ManyToMany
	@JoinTable(name = "favorite_pollutant",

			joinColumns = @JoinColumn(name = "id_weather_component", referencedColumnName = "id"), 
			inverseJoinColumns = @JoinColumn(name = "id_favorite", referencedColumnName = "id"))
	
	private List<Favorite> favorite = new ArrayList<>();

}
