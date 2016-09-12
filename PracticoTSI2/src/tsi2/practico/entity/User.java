package tsi2.practico.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.Email;

@Entity
@Table(name="usuario")
public class User implements Serializable{
	
	private static final long serialVersionUID = -8377874527796459051L;

	@Id 
	@Column(length=16)
	private String username;
	
	@Column(length=16)
	private String password;
	
	@Column(length=128)
	private String name;
	
	@Column(length=128)
	private String lastname;
	
	@Column(length=128)
	@Email
	private String email;
	
	@Temporal(TemporalType.DATE)
	private Date creationDate;
	
	@OneToOne
	@JoinColumn(name="roleId",nullable=false)
	private Role role;

	public User() {
		super();	
		this.creationDate = new Date();
	}
	
	public User(String username, String password, String name, String lastname, String email, Role role) {
		this();
		this.username = username;
		this.password = password;
		this.name = name;
		this.lastname = lastname;
		this.email = email;
		this.role = role;	
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
}
