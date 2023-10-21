package africa.ecare.vaccineconnect.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import africa.ecare.vaccineconnect.models.UserVaccine;
import africa.ecare.vaccineconnect.repository.UserRepository;
import africa.ecare.vaccineconnect.repository.UserVaccineRepository;

@Service
public class UserVaccineService {
	 @Autowired
	    private UserVaccineRepository userVaccineRepository;

	    // Method to save the information that a user has been vaccinated with a specific vaccine
	    public UserVaccine saveUserVaccine(UserVaccine userVaccine) {
	        return userVaccineRepository.save(userVaccine);
	    }

	    // Method to get the list of vaccines a user has been administered
	    public List<UserVaccine> getVaccinesByUserId(Long userId) {
	        return userVaccineRepository.findByUserId(userId);
	    }
}
