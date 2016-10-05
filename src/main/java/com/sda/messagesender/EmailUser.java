package com.sda.messagesender;

public class EmailUser extends User {

    private String emailAddress;

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public Contact getPreferableContact() {
        return User.Contact.EMAIL;
    }

	@Override
	public String toString() {
		return "EmailUser [emailAddress=" + emailAddress + "]";
	}

}
