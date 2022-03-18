package com.bytedance.ee.bear.middleground.like.export;

import com.bytedance.ee.util.io.NonProguard;

public class LikeCountResult implements NonProguard {
    private int count;
    private String likeId;
    private int message_box_version;

    public int getCount() {
        return this.count;
    }

    public String getLikeId() {
        return this.likeId;
    }

    public int getMessageBoxVersion() {
        return this.message_box_version;
    }

    public void setCount(int i) {
        this.count = i;
    }

    public void setLikeId(String str) {
        this.likeId = str;
    }

    public void setMessageBoxVersion(int i) {
        this.message_box_version = i;
    }
}
