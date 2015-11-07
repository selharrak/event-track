package ma.sven.technologie.view;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneConstraintValidator implements ConstraintValidator<Phone, String> {

	@Override
	public void initialize(Phone arg0) {
		
	}

	@Override
	public boolean isValid(String phoneField, ConstraintValidatorContext arg1) {
		if(phoneField == null){
			return false;
		}
		
		return phoneField.matches("[0-9()-]*");
	}

	
}
