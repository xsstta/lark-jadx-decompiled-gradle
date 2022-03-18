package com.ss.texturerender.effect;

import com.ss.texturerender.TextureRenderLog;
import java.util.HashMap;
import java.util.Map;

public class EffectConfig {
    private HashMap<Integer, Integer> mEffectOpenMap = new HashMap<>();
    private boolean openSR;
    private boolean openSharpen;

    public HashMap getEffectConfigMap() {
        return this.mEffectOpenMap;
    }

    public boolean isOpenSR() {
        return this.openSR;
    }

    public boolean isOpenSharpen() {
        return this.openSharpen;
    }

    public boolean hasFboEffect() {
        for (Map.Entry<Integer, Integer> entry : this.mEffectOpenMap.entrySet()) {
            if (!(entry.getKey().intValue() == 1 || entry.getKey().intValue() == 5)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "Config:[opengSR:" + this.openSR + " opengSharpen:" + this.openSharpen + "]";
    }

    public boolean getEffectOpen(int i) {
        Integer num = this.mEffectOpenMap.get(Integer.valueOf(i));
        if (num != null && num.intValue() == 1) {
            return true;
        }
        return false;
    }

    public EffectConfig setOpenSR(boolean z) {
        this.openSR = z;
        this.mEffectOpenMap.put(5, Integer.valueOf(z ? 1 : 0));
        return this;
    }

    public EffectConfig setOpenSharpen(boolean z) {
        this.openSharpen = z;
        this.mEffectOpenMap.put(1, Integer.valueOf(z ? 1 : 0));
        return this;
    }

    public boolean isSubSet(EffectConfig effectConfig) {
        boolean z = effectConfig.openSR;
        if (z && !this.openSR) {
            return false;
        }
        boolean z2 = effectConfig.openSharpen;
        if (z2 && !this.openSharpen) {
            return false;
        }
        if (z2 || z) {
            return true;
        }
        if (this.openSR || this.openSharpen) {
            return false;
        }
        return true;
    }

    public EffectConfig setEffectOpen(int i, int i2) {
        boolean z;
        TextureRenderLog.m256492d("EffectConfig", "setEffectOpen effect:" + i + ",isOpen:" + i2);
        boolean z2 = false;
        if (i == 1) {
            if (i2 == 1) {
                z = true;
            } else {
                z = false;
            }
            this.openSharpen = z;
        }
        if (i == 5) {
            if (i2 == 1) {
                z2 = true;
            }
            this.openSR = z2;
        }
        this.mEffectOpenMap.put(Integer.valueOf(i), Integer.valueOf(i2));
        return this;
    }
}
