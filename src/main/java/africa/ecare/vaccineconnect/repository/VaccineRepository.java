package africa.ecare.vaccineconnect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import africa.ecare.vaccineconnect.models.Vaccine;

@Repository
public interface VaccineRepository extends JpaRepository<Vaccine, Long> {

}
