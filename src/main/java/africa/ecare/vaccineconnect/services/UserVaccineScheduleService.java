package africa.ecare.vaccineconnect.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import africa.ecare.vaccineconnect.models.UserVaccineSchedule;
import africa.ecare.vaccineconnect.repository.UserVaccineScheduleRepository;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class UserVaccineScheduleService {

	@Autowired
	private UserVaccineScheduleRepository userVaccineScheduleRepository;

	public UserVaccineSchedule saveUserVaccineSchedule(UserVaccineSchedule schedule) {
		return userVaccineScheduleRepository.save(schedule);
	}

	public List<UserVaccineSchedule> getScheduledVaccinesByUserId(Long userId) {
		return userVaccineScheduleRepository.findByUserId(userId);
	}

	public List<UserVaccineSchedule> getUsersScheduledForDate(Date date) {

		return userVaccineScheduleRepository.findByScheduledDate(date);
	}
}
