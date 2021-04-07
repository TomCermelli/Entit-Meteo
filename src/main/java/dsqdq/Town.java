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
	
	@Column(name="latitude")
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

}
