package africa.ecare.vaccineconnect.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import africa.ecare.vaccineconnect.models.UserVaccineSchedule;

@Repository
public interface UserVaccineScheduleRepository extends JpaRepository<UserVaccineSchedule, Long> {
	List<UserVaccineSchedule> findByUserId(Long userId);

	@Query("SELECT u FROM UserVaccineSchedule u WHERE u.scheduledDate = :date")
	List<UserVaccineSchedule> findByScheduledDate(@Param("date") Date date);
}
