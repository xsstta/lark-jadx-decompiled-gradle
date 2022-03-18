package org.webrtc;

public enum VideoCodecStatus {
    NO_OUTPUT(2008),
    OK(0),
    ERROR(2004),
    LEVEL_EXCEEDED(2001),
    MEMORY(2004),
    ERR_PARAMETER(2001),
    ERR_SIZE(2001),
    TIMEOUT(2004),
    UNINITIALIZED(2003),
    FALLBACK_SOFTWARE(2009);
    
    private final int number;

    public int getNumber() {
        return this.number;
    }

    private VideoCodecStatus(int i) {
        this.number = i;
    }
}
