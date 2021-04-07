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
@Table(name="post")
public class Post {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private long id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="date")
	private LocalDateTime date;
	
	@OneToMany(mappedBy = "post")
	private List<Message> message;
	
	@ManyToOne
	@JoinColumn(name="id_heading")
	private Heading heading;
	
	@ManyToOne
	@JoinColumn(name="id_user")
	private User user;
	
	
}
