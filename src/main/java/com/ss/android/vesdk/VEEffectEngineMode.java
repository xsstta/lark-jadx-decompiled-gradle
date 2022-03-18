package com.ss.android.vesdk;

public enum VEEffectEngineMode {
    EFFECT_NEW_ENGINE(1),
    EFFECT_NEW_OLD_ENGINE_COEXIST(2);
    
    public int mode;

    private VEEffectEngineMode(int i) {
        this.mode = i;
    }
}
