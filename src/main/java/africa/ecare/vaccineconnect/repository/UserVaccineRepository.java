package africa.ecare.vaccineconnect.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import africa.ecare.vaccineconnect.models.User;
import africa.ecare.vaccineconnect.models.UserVaccine;
import africa.ecare.vaccineconnect.models.Vaccine;

@Repository
public interface UserVaccineRepository extends JpaRepository<UserVaccine, Long> {

	List<UserVaccine> findByUserId(Long userId);

}
