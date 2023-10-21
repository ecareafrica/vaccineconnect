package africa.ecare.vaccineconnect.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import africa.ecare.vaccineconnect.models.User;
import africa.ecare.vaccineconnect.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	// Method to save a new user
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	// Method to update an existing user
	public User updateUser(Long id, User updatedUser) {
		if (userRepository.existsById(id)) {
			updatedUser.setId(id);
			return userRepository.save(updatedUser);
		} else {
			// Handle the case where the user does not exist
			return null;
		}
	}
}
