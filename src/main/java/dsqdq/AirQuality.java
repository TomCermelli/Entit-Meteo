package dsqdq;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "air_quality") 
public class AirQuality extends Response {

	@Column(name = "value")
	private String value;

	@Column(name = "unit")
	private String unit;

	@ManyToOne
	@JoinColumn(name = "id_pollutant")
	private Pollutant pollutant;

	
	public AirQuality(String value, String unit, Pollutant pollutant) {
		super();
		this.value = value;
		this.unit = unit;
		this.pollutant = pollutant;
	}

	public AirQuality() {
		super();
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Pollutant getPollutant() {
		return pollutant;
	}

	public void setPollutant(Pollutant pollutant) {
		this.pollutant = pollutant;
	}

}
