package africa.ecare.vaccineconnect.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import africa.ecare.vaccineconnect.models.UserVaccineSchedule;
import africa.ecare.vaccineconnect.services.UserVaccineScheduleService;

@RestController
@RequestMapping("/api/user-vaccine-schedule")
public class UserVaccineScheduleController {
	@Autowired
	private UserVaccineScheduleService userVaccineScheduleService;

	@PostMapping
	public UserVaccineSchedule createSchedule(@RequestBody UserVaccineSchedule schedule) {
		return userVaccineScheduleService.saveUserVaccineSchedule(schedule);
	}

	@GetMapping("/user/{userId}")
	public List<UserVaccineSchedule> getUserVaccineSchedules(@PathVariable Long userId) {
		return userVaccineScheduleService.getScheduledVaccinesByUserId(userId);
	}
}
