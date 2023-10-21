package africa.ecare.vaccineconnect.models;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vaccine {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	private double numberOfDoses;

	private String manufacturer; // Manufacturer, e.g., Pfizer Inc.
	private Date expiryDate; // Expiry date of the vaccine batch
	private int dosesRequired; // Number of doses required for full vaccination
	private double storageTemperature; // Temperature at which the vaccine needs to be stored
	private String countryOfOrigin; // The country where the vaccine was produced
	private String approvalStatus; // Status of approval by health organizations (Approved, Pending, etc.)
	private String sideEffects; // Common side effects
	private double vaccineInterval;
	private String targetVirusStrain; // Targeted virus strain, e.g., SARS-CoV-2
	private boolean boosterAvailable; // Indicates if a booster shot is available
	private String ageGroup; // Appropriate age group for the vaccine
	private String dosage; // Dosage in milliliters
	private String distributionChannel; // Channels through which the vaccine is being distributed
	private boolean pregnantFriendly; // Whether the vaccine is recommended for pregnant people

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getNumberOfDoses() {
		return numberOfDoses;
	}

	public void setNumberOfDoses(double numberOfDoses) {
		this.numberOfDoses = numberOfDoses;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public int getDosesRequired() {
		return dosesRequired;
	}

	public void setDosesRequired(int dosesRequired) {
		this.dosesRequired = dosesRequired;
	}

	public double getStorageTemperature() {
		return storageTemperature;
	}

	public void setStorageTemperature(double storageTemperature) {
		this.storageTemperature = storageTemperature;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	public String getApprovalStatus() {
		return approvalStatus;
	}

	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}

	public String getSideEffects() {
		return sideEffects;
	}

	public void setSideEffects(String sideEffects) {
		this.sideEffects = sideEffects;
	}

	public double getVaccineInterval() {
		return vaccineInterval;
	}

	public void setVaccineInterval(double vaccineInterval) {
		this.vaccineInterval = vaccineInterval;
	}

	public String getTargetVirusStrain() {
		return targetVirusStrain;
	}

	public void setTargetVirusStrain(String targetVirusStrain) {
		this.targetVirusStrain = targetVirusStrain;
	}

	public boolean isBoosterAvailable() {
		return boosterAvailable;
	}

	public void setBoosterAvailable(boolean boosterAvailable) {
		this.boosterAvailable = boosterAvailable;
	}

	public String getAgeGroup() {
		return ageGroup;
	}

	public void setAgeGroup(String ageGroup) {
		this.ageGroup = ageGroup;
	}

	public String getDosage() {
		return dosage;
	}

	public void setDosage(String dosage) {
		this.dosage = dosage;
	}

	public String getDistributionChannel() {
		return distributionChannel;
	}

	public void setDistributionChannel(String distributionChannel) {
		this.distributionChannel = distributionChannel;
	}

	public boolean isPregnantFriendly() {
		return pregnantFriendly;
	}

	public void setPregnantFriendly(boolean pregnantFriendly) {
		this.pregnantFriendly = pregnantFriendly;
	}

}
