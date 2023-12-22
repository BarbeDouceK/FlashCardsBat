package fr.dawan.flashcards.business.user;

import fr.dawan.flashcards.business.generic.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper extends GenericMapper<User, UserDto> {
  /*  @Override
    default UserDto toDto(User user){
        return new UserDto(user.getName(), );
    };*/
}
