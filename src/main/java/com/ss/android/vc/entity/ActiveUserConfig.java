package com.ss.android.vc.entity;

import com.huawei.hms.location.LocationRequest;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.io.Serializable;

public class ActiveUserConfig implements Serializable {
    private int maxRecordTime = SmEvents.EVENT_NW;
    private int minSpeakerVolume = -38;
    private int rankBase = 2;
    private int sampleInterval = LocationRequest.PRIORITY_HD_ACCURACY;
    private int tickTime = 2;
    private int timeBase = 2;

    public int getMaxRecordTime() {
        return this.maxRecordTime;
    }

    public int getMinSpeakerVolume() {
        return this.minSpeakerVolume;
    }

    public int getRankBase() {
        return this.rankBase;
    }

    public int getSampleInterval() {
        return this.sampleInterval;
    }

    public int getTickTime() {
        return this.tickTime;
    }

    public int getTimeBase() {
        return this.timeBase;
    }

    public String toString() {
        return "ActiveUserConfig{tickTime=" + this.tickTime + ", sampleInterval=" + this.sampleInterval + ", maxRecordTime=" + this.maxRecordTime + ", minSpeakerVolume=" + this.minSpeakerVolume + ", timeBase=" + this.timeBase + ", rankBase=" + this.rankBase + '}';
    }

    public void setMaxRecordTime(int i) {
        this.maxRecordTime = i;
    }

    public void setMinSpeakerVolume(int i) {
        this.minSpeakerVolume = i;
    }

    public void setRankBase(int i) {
        this.rankBase = i;
    }

    public void setSampleInterval(int i) {
        this.sampleInterval = i;
    }

    public void setTickTime(int i) {
        this.tickTime = i;
    }

    public void setTimeBase(int i) {
        this.timeBase = i;
    }
}
