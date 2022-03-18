package com.ss.android.lark.sticker.dto;

import java.io.Serializable;

public class Sticker implements Serializable, Comparable {
    private String key;
    private int position;
    private long updateTime;

    public Sticker() {
    }

    public String getKey() {
        return this.key;
    }

    public int getPosition() {
        return this.position;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setPosition(int i) {
        this.position = i;
    }

    public void setUpdateTime(long j) {
        this.updateTime = j;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (obj instanceof Sticker) {
            Sticker sticker = (Sticker) obj;
            if (getPosition() < sticker.getPosition()) {
                return -1;
            }
            if (getPosition() > sticker.getPosition()) {
                return 1;
            }
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Sticker sticker = (Sticker) obj;
        if (this.position != sticker.position) {
            return false;
        }
        String str = this.key;
        String str2 = sticker.key;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public Sticker(String str, int i, long j) {
        this.key = str;
        this.position = i;
        this.updateTime = j;
    }
}
