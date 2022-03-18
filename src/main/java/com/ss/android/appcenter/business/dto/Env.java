package com.ss.android.appcenter.business.dto;

import com.ss.android.appcenter.p1262a.p1263a.C27548m;

public enum Env {
    ONLINE(0),
    STAGING(1),
    OVERSEA(2);
    
    private int value;

    public static Env getEnv() {
        if (C27548m.m100547m().mo98218b() != null && C27548m.m100547m().mo98218b().mo98172c()) {
            return OVERSEA;
        }
        if (C27548m.m100547m().mo98218b() == null || !C27548m.m100547m().mo98218b().mo98173d()) {
            return ONLINE;
        }
        return STAGING;
    }

    private Env(int i) {
        this.value = i;
    }
}
