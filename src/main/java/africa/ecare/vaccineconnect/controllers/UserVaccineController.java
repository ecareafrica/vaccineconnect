package africa.ecare.vaccineconnect.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import africa.ecare.vaccineconnect.models.UserVaccine;
import africa.ecare.vaccineconnect.services.UserVaccineService;

import java.util.List;

@RestController
@RequestMapping("/api/user-vaccines")
public class UserVaccineController {

	@Autowired
	private UserVaccineService userVaccineService;

	@PostMapping
	public UserVaccine createUserVaccine(@RequestBody UserVaccine userVaccine) {
		return userVaccineService.saveUserVaccine(userVaccine);
	}

	@GetMapping("/user/{userId}")
	public List<UserVaccine> getUserVaccines(@PathVariable Long userId) {
		return userVaccineService.getVaccinesByUserId(userId);
	}
}
