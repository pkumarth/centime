package com.centime.valid;

import com.centime.ex.ErrorCode;
import com.centime.ex.ValidationException;
import com.centime.models.User;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.ObjectUtils;

@Slf4j
public class UserValidation {
    public static void validate(User user) {
        if (ObjectUtils.isEmpty(user.getName())) {
            log.error("error in validation - user name can not be empty", user.getName());
            //throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User Name Can not be Empty");
            throw new ValidationException(ErrorCode.EmptyName);
        }
        if (ObjectUtils.isEmpty(user.getSurname())) {
            log.error("error in validation - user surname can not be empty", user.getName());
            //throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "User SurName Can not be Empty");
            throw new ValidationException(ErrorCode.EmptySurName);
        }

    }
}
