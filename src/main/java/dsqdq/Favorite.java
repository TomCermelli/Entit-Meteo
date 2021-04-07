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
@Table(name="favorite")
public class Favorite {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private long id;
	
	@Column(name = "indcator_type")
	private String indicatorType;
	
	@ManyToOne
	@JoinColumn(name="id_user")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="id_town")
	private Town town;
	
	@ManyToMany
	@JoinTable(name = "favorite_pollutant",

			joinColumns = @JoinColumn(name = "id_favorite", referencedColumnName = "id"), 
			inverseJoinColumns = @JoinColumn(name = "id_pollutant", referencedColumnName = "id"))
	
	private List<Pollutant> pollutant = new ArrayList<>();
	
	
	@ManyToMany
	@JoinTable(name = "favorite_weather_component",

			joinColumns = @JoinColumn(name = "id_faovite", referencedColumnName = "id"), 
			inverseJoinColumns = @JoinColumn(name = "id_weather_component", referencedColumnName = "id"))
	
	private List<WeatherComponent> weatherComponant = new ArrayList<>();

}
