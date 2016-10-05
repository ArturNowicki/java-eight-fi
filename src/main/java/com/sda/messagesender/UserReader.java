package com.sda.messagesender;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class UserReader {

    private final static Map<User.Contact, BiFunction<String, String, User>> READERS = new HashMap<>();

    static {
    	READERS.put(User.Contact.EMAIL, (name, emailAddress) -> {
    		EmailUser user = new EmailUser();
    		user.setName(name);
    		user.setEmailAddress(emailAddress);
    		return user;
    	});
    	READERS.put(User.Contact.MAIL, (name, mailAddress) -> {
    	MailUser user = new MailUser();
    		user.setName(name);
    		user.setPhysicallAddress(mailAddress);
    		return user;
    	});
    	READERS.put(User.Contact.SMS, (name, mobileNumber) -> {
    		SMSUser user = new SMSUser();
    		user.setName(name);
    		user.setMobileNumber(mobileNumber);
    		return user;
    	});
    }

    public User read(User.Contact contact, String name, String contactAddress) {
    	BiFunction<String, String, User>  createUserFunction = READERS.get(contact);
    	User createdUser = createUserFunction.apply(name, contactAddress);
    	return createdUser;
//        return READERS.get(contact).apply(name, contactAddress);
    }
}
