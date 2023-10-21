package africa.ecare.vaccineconnect.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import africa.ecare.vaccineconnect.models.Vaccine;
import africa.ecare.vaccineconnect.services.VaccineService;

@RestController
@RequestMapping("/api/vaccines")
public class VaccineController {

	@Autowired
	private VaccineService vaccineService;

	@PostMapping
	public Vaccine createVaccine(@RequestBody Vaccine vaccine) {
		return vaccineService.saveVaccine(vaccine);
	}

	@PutMapping("/{id}")
	public Vaccine updateVaccine(@PathVariable Long id, @RequestBody Vaccine vaccine) {
		return vaccineService.updateVaccine(id, vaccine);
	}
}
