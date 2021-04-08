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
@Table(name = "pollutant")
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

			joinColumns = @JoinColumn(name = "id_pollutant", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "id_favorite", referencedColumnName = "id"))

	private List<Favorite> favorite = new ArrayList<>();

	public Pollutant(String entitled, double limiteSup, double indice, List<AirQuality> airQuality,
			List<Favorite> favorite) {
		super();
		this.entitled = entitled;
		this.limiteSup = limiteSup;
		this.indice = indice;
		this.airQuality = airQuality;
		this.favorite = favorite;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEntitled() {
		return entitled;
	}

	public void setEntitled(String entitled) {
		this.entitled = entitled;
	}

	public double getLimiteSup() {
		return limiteSup;
	}

	public void setLimiteSup(double limiteSup) {
		this.limiteSup = limiteSup;
	}

	public double getIndice() {
		return indice;
	}

	public void setIndice(double indice) {
		this.indice = indice;
	}

	public List<AirQuality> getAirQuality() {
		return airQuality;
	}

	public void setAirQuality(List<AirQuality> airQuality) {
		this.airQuality = airQuality;
	}

	public List<Favorite> getFavorite() {
		return favorite;
	}

	public void setFavorite(List<Favorite> favorite) {
		this.favorite = favorite;
	}

}
