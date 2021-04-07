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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="pollutant")
public class Pollutant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private long id;
	
	@Column(name = "entitle")
	private String entitled;
	
	@Column(name = "limite_sup")
	private double limiteSup;
	
	@Column(name = "indice")
	private double indice;
	
	@OneToMany(mappedBy = "pollutant")
	private List<AirQuality> airQuality;
	

	@ManyToMany
	@JoinTable(name = "favorite_pollutant",

			joinColumns = @JoinColumn(name = "id_pollutant", referencedColumnName = "id"), 
			inverseJoinColumns = @JoinColumn(name = "id_favorite", referencedColumnName = "id"))
	
	private List<Favorite> favorite = new ArrayList<>();
	
	
	

}
