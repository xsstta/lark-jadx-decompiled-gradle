package com.bytedance.ee.bear.document.vibra;

import com.bytedance.ee.util.io.NonProguard;

public class VibrateMsg implements NonProguard {
    public int strength;
    public int time;

    public String toString() {
        return "VibrateMsg{time=" + this.time + ", strength=" + this.strength + '}';
    }
}
