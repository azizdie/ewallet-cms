package com.ewallet.cms.enumeration;

import org.apache.commons.lang3.StringUtils;

public enum Sexe {
	Masculin("M"),
    Feminin("F"),
    Inconnu(StringUtils.EMPTY);
	
	private String genre;

	Sexe(String genre) {
        this.genre = genre;
    }

    public String genre() {
        return genre;
    }
}
