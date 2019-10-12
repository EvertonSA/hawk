package in.arakaki.hawk.dto.mapper;

import in.arakaki.hawk.dto.model.user.UserDto;
import in.arakaki.hawk.model.user.User;
import org.springframework.stereotype.Component;

/**
 * Created by Everton Arakaki.
 */
@Component
public class UserMapper {

	public static UserDto toUserDto(User user) {
        return new UserDto().setId(user.getId()).setLang(user.getLang()).setLocation(user.getLocation()).setName(user.getName());
    }

}
