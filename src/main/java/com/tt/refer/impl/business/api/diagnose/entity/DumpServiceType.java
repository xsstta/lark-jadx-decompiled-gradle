package com.tt.refer.impl.business.api.diagnose.entity;

public enum DumpServiceType {
    UNKNOWN("unknown"),
    LOG("log");
    
    String serviceType;

    public String type() {
        return this.serviceType;
    }

    public static DumpServiceType getServiceType(String str) {
        str.hashCode();
        if (!str.equals("log")) {
            return UNKNOWN;
        }
        return LOG;
    }

    private DumpServiceType(String str) {
        this.serviceType = str;
    }
}
