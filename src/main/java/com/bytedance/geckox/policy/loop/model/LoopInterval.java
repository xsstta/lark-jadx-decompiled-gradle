package com.bytedance.geckox.policy.loop.model;

import com.google.gson.annotations.SerializedName;

public class LoopInterval {
    @SerializedName("interval")
    private int interval;

    public enum LoopLevel {
        lv_1(1),
        lv_2(2),
        lv_3(3);
        
        private int level;

        public int getLevel() {
            return this.level;
        }

        private LoopLevel(int i) {
            this.level = i;
        }
    }

    public int getInterval() {
        return this.interval;
    }

    public LoopInterval(int i) {
        this.interval = i;
    }
}
