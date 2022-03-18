package com.ss.android.vc.meeting.module;

import java.io.Serializable;

public class VCBreakoutRoomInfo implements Serializable {
    private static final long serialVersionUID = 1;
    private String breakoutRoomId;
    private String channelId;
    private long countDownFromStartTime;
    private String roomTopic;
    private VCBreakoutRoomInfoSettings settings;
    private long startTime;
    private Status status;

    public enum Status {
        UNKNOWN(0),
        ON_THE_CALL(1),
        COUNT_DOWN(2),
        IDLE(3);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public int getValue() {
            return this.value;
        }

        public static Status fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return ON_THE_CALL;
            }
            if (i == 2) {
                return COUNT_DOWN;
            }
            if (i != 3) {
                return null;
            }
            return IDLE;
        }

        private Status(int i) {
            this.value = i;
        }
    }

    public String getBreakoutRoomId() {
        return this.breakoutRoomId;
    }

    public String getChannelId() {
        return this.channelId;
    }

    public long getCountDownFromStartTime() {
        return this.countDownFromStartTime;
    }

    public String getRoomTopic() {
        return this.roomTopic;
    }

    public VCBreakoutRoomInfoSettings getSettings() {
        return this.settings;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setBreakoutRoomId(String str) {
        this.breakoutRoomId = str;
    }

    public void setChannelId(String str) {
        this.channelId = str;
    }

    public void setCountDownFromStartTime(long j) {
        this.countDownFromStartTime = j;
    }

    public void setRoomTopic(String str) {
        this.roomTopic = str;
    }

    public void setSettings(VCBreakoutRoomInfoSettings vCBreakoutRoomInfoSettings) {
        this.settings = vCBreakoutRoomInfoSettings;
    }

    public void setStartTime(long j) {
        this.startTime = j;
    }

    public void setStatus(Status status2) {
        this.status = status2;
    }
}
