package com.forms.validators;

import com.forms.model.Contact;
import org.hibernate.validator.internal.constraintvalidators.EmailValidator;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.util.Date;

/**
 * Created by D on 4/9/2017.
 */
public class ContactValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }

    @Override
    public void validate(Object obj, Errors e) {
        Contact cmd = (Contact) obj;

        ValidationUtils.rejectIfEmpty(e, "firstName", "firstName.empty");
        ValidationUtils.rejectIfEmpty(e, "lastName", "lastName.empty");
        ValidationUtils.rejectIfEmpty(e, "studentId", "studentId.empty");
        ValidationUtils.rejectIfEmpty(e, "email", "email.empty");
        ValidationUtils.rejectIfEmpty(e, "birthDate", "birthDate.empty");

   /*     String email = cmd.getEmail();
        if (StringUtils.hasLength(email)) {
            EmailValidator emailValidator = EmailValidator.;
            if (!emailValidator.isValid(cmd.getEmail()))
                e.rejectValue("email", "email.invalid", new Object[] { email },
                        "Invalid email format.");
        }*/

        Date birthDate = cmd.getBirthDate();
        if (birthDate != null && birthDate.after(new Date())) {
            e.rejectValue("birthDate", "birthDate.future");
        }
    }

}