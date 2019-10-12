package in.arakaki.hawk.service;

import in.arakaki.hawk.repository.user.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;

import static in.arakaki.hawk.exception.EntityType.USER;
import static in.arakaki.hawk.exception.ExceptionType.DUPLICATE_ENTITY;
import static in.arakaki.hawk.exception.ExceptionType.ENTITY_NOT_FOUND;

/**
 * Created by Everton Arakaki.
 */
@Component
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ModelMapper modelMapper;

}
