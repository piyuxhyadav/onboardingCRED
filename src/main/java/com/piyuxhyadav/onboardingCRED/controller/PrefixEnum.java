package com.piyuxhyadav.onboardingCRED.controller;

public enum PrefixEnum {
    FIRST_NAME("First Name"),
    LAST_NAME("Last Name"),
    PHONE_NUMBER("Phone Number");

    private final String value;

    PrefixEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
