package dsqdq;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="weather_database")
public class WeatherDatabase extends Response{
	 
	@Column(name="value")
	private String value;
	
	@Column(name="unit")
	private String unit;
	
	@ManyToOne
	@JoinColumn(name="id_weather_component")
	private WeatherComponent weatherComponent;


}
