package in.arakaki.hawk.service;

import in.arakaki.hawk.dto.mapper.UserMapper;
import in.arakaki.hawk.dto.model.user.UserDto;
import in.arakaki.hawk.model.user.User;
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

    /**
     * Search an existing user
     *
     * @param email
     * @return
     */
    public UserDto findUserByEmail(String email) {
        Optional<User> user = Optional.ofNullable(userRepository.findByEmail(email));
        if (user.isPresent()) {
            return modelMapper.map(user.get(), UserDto.class);
        }
        throw exception(USER, ENTITY_NOT_FOUND, email);
    }

    /**
     * Returns a new RuntimeException
     *
     * @param entityType
     * @param exceptionType
     * @param args
     * @return
     */
    private RuntimeException exception(EntityType entityType, ExceptionType exceptionType, String... args) {
        return HawkException.throwException(entityType, exceptionType, args);
    }
}
