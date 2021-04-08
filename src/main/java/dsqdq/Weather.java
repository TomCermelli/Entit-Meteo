package dsqdq;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="weather_database")
public class Weather extends Response{
	 
	@Column(name="value")
	private String value;
	 
	@Column(name="unit")
	private String unit;
	
	@ManyToOne
	@JoinColumn(name="id_weather_component")
	private WeatherComponent weatherComponent;

	public Weather(LocalDateTime dateHour, Town town, String value, String unit,
			WeatherComponent weatherComponent) {
		super();
		this.value = value;
		this.unit = unit;
		this.weatherComponent = weatherComponent;
	}

	public Weather() {
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

	public WeatherComponent getWeatherComponent() {
		return weatherComponent;
	}

	public void setWeatherComponent(WeatherComponent weatherComponent) {
		this.weatherComponent = weatherComponent;
	}


}
