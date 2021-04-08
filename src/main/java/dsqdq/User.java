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

	

	public User(Long id, String firstname, String lastname, String mail, String password, boolean role) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.mail = mail;
		this.password = password;
		this.role = role;
	}

	public User() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isRole() {
		return role;
	}

	public void setRole(boolean role) {
		this.role = role;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getTokenReset() {
		return tokenReset;
	}

	public void setTokenReset(String tokenReset) {
		this.tokenReset = tokenReset;
	}

	public LocalDateTime getConfirmetAt() {
		return confirmetAt;
	}

	public void setConfirmetAt(LocalDateTime confirmetAt) {
		this.confirmetAt = confirmetAt;
	}

	public List<Post> getPost() {
		return post;
	}

	public void setPost(List<Post> post) {
		this.post = post;
	}

	public List<Message> getMessage() {
		return message;
	}

	public void setMessage(List<Message> message) {
		this.message = message;
	}

	public List<Notification> getNotification() {
		return notification;
	}

	public void setNotification(List<Notification> notification) {
		this.notification = notification;
	}

	public List<Favorite> getFavorite() {
		return favorite;
	}

	public void setFavorite(List<Favorite> favorite) {
		this.favorite = favorite;
	}

	public Town getTown() {
		return town;
	}

	public void setTown(Town town) {
		this.town = town;
	}

}
