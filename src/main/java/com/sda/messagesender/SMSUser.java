package com.sda.messagesender;

public class SMSUser extends User {

    private String mobileNumber;

    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public Contact getPreferableContact() {
        return User.Contact.SMS;
    }

	@Override
	public String toString() {
		return "SMSUser [mobileNumber=" + mobileNumber + "]";
	}

}
