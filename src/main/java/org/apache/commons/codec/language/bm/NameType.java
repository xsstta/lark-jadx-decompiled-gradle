package org.apache.commons.codec.language.bm;

public enum NameType {
    ASHKENAZI("ash"),
    GENERIC("gen"),
    SEPHARDIC("sep");
    
    private final String name;

    public String getName() {
        return this.name;
    }

    private NameType(String str) {
        this.name = str;
    }
}
