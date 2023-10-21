package africa.ecare.vaccineconnect.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import africa.ecare.vaccineconnect.models.Vaccine;
import africa.ecare.vaccineconnect.repository.VaccineRepository;

@Service
public class VaccineService {
	@Autowired
	private VaccineRepository vaccineRepository;

	// Method to save a new vaccine
	public Vaccine saveVaccine(Vaccine vaccine) {
		return vaccineRepository.save(vaccine);
	}

	// Method to update an existing vaccine
	public Vaccine updateVaccine(Long id, Vaccine updatedVaccine) {
		if (vaccineRepository.existsById(id)) {
			updatedVaccine.setId(id);
			return vaccineRepository.save(updatedVaccine);
		} else {
			// Handle the case where the vaccine does not exist
			return null;
		}
	}

}
