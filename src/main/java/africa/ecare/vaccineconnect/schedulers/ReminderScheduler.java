package africa.ecare.vaccineconnect.schedulers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import africa.ecare.vaccineconnect.models.UserVaccineSchedule;
import africa.ecare.vaccineconnect.services.UserService;
import africa.ecare.vaccineconnect.services.UserVaccineScheduleService;

@Component
public class ReminderScheduler {
	@Autowired
	private UserService userService;
	@Autowired
	private UserVaccineScheduleService userVaccineScheduleService;

	// This will run every day at 12:00 PM
	@Scheduled(cron = "0 0 12 * * ?")
	public void sendVaccineReminders() {
		Date today = new Date();

		List<UserVaccineSchedule> usersToRemind = userVaccineScheduleService.getUsersScheduledForDate(today);

		for (UserVaccineSchedule userSchedule : usersToRemind) {
			userService.sendReminder(userSchedule.getUserId());
		}
	}
}
