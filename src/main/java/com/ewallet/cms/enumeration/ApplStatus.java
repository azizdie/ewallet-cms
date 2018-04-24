package com.ewallet.cms.enumeration;

public enum ApplStatus {
	PENDING("PENDING"),
    ACTIVE("ACTIVE"),
    INACTIVE("INACTIVE"),
    PUBLISH("INACTIVE"),
    DELETED("INACTIVE");
	
	private String status;

	ApplStatus(String status) {
        this.status = status;
    }

    public String status() {
        return status;
    }
}
