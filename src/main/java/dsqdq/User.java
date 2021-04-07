package dsqdq;

import java.time.LocalDateTime;
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
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Column(name ="firstname", nullable = false)
	private String firstname;
	
	@Column(name ="lastname", nullable = false)
	private String lastname;
	
	@Column(name ="mail", nullable = false)
	private String mail;
	
	@Column(name ="password", nullable = false)
	private String password;
	
	@Column(name ="role", nullable = false)
	private boolean role;
	
	@Column(name="token")
	private String token;
	
	@Column(name="token_reset")
	private String tokenReset;
	
	@Column(name="confirmed_at")
	private LocalDateTime confirmetAt;
	
	
	@OneToMany(mappedBy = "user")
	private List<Post> post;
	
	@OneToMany(mappedBy = "user")
	private List<Message> message;
	
	@OneToMany(mappedBy = "user")
	private List<Notification> notification;
	
	@OneToMany(mappedBy = "user")
	private List<Favorite> favorite;
	
	@ManyToOne
	@JoinColumn(name="id_town")
	private Town town;

}
