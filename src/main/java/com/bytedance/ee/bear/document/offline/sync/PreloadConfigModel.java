package com.bytedance.ee.bear.document.offline.sync;

import java.io.Serializable;

public class PreloadConfigModel implements Serializable {
    private int favorite;
    private int pin;
    private int recent;

    public int getFavorite() {
        return this.favorite;
    }

    public int getPin() {
        return this.pin;
    }

    public int getRecent() {
        return this.recent;
    }

    public void setFavorite(int i) {
        this.favorite = i;
    }

    public void setPin(int i) {
        this.pin = i;
    }

    public void setRecent(int i) {
        this.recent = i;
    }
}
