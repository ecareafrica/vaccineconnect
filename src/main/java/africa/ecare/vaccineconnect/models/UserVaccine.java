package africa.ecare.vaccineconnect.models;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class UserVaccine {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne
	@JoinColumn(name = "vaccine_id")
	private Vaccine vaccine;

	private Date dateAdministered; // The date the vaccine was administered
	private int doseNumber; // The dose number (e.g., 1 for the first dose, 2 for the second)
	private String location; // Location where the vaccine was administered

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Vaccine getVaccine() {
		return vaccine;
	}

	public void setVaccine(Vaccine vaccine) {
		this.vaccine = vaccine;
	}

	public Date getDateAdministered() {
		return dateAdministered;
	}

	public void setDateAdministered(Date dateAdministered) {
		this.dateAdministered = dateAdministered;
	}

	public int getDoseNumber() {
		return doseNumber;
	}

	public void setDoseNumber(int doseNumber) {
		this.doseNumber = doseNumber;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
