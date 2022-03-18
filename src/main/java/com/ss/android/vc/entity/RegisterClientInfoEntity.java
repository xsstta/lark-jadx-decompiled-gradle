package com.ss.android.vc.entity;

import java.io.Serializable;
import java.util.List;

public class RegisterClientInfoEntity implements Serializable {
    private String meetingId;
    private StatusCode statusCode;
    private List<VideoChatPrompt> videoChatPrompts;
    private List<VideoChat> videoChats;

    public enum StatusCode {
        UNKNOWN(0),
        ACTIVE(1),
        INACTIVE(2),
        MEETING_END(3),
        DUAL_CHANNEL_POLL(4);
        
        private final int value;

        public int getValue() {
            return this.value;
        }

        public static StatusCode fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return ACTIVE;
            }
            if (i == 2) {
                return INACTIVE;
            }
            if (i == 3) {
                return MEETING_END;
            }
            if (i != 4) {
                return null;
            }
            return DUAL_CHANNEL_POLL;
        }

        private StatusCode(int i) {
            this.value = i;
        }
    }

    public String getMeetingId() {
        return this.meetingId;
    }

    public StatusCode getStatusCode() {
        return this.statusCode;
    }

    public List<VideoChat> getVideoChat() {
        return this.videoChats;
    }

    public List<VideoChatPrompt> getVideoChatPrompts() {
        return this.videoChatPrompts;
    }

    public String toString() {
        return "RegisterClientInfoEntity{meetingId='" + this.meetingId + '\'' + ", statusCode=" + this.statusCode + ", videoChats=" + this.videoChats + ", videoChatPrompts=" + this.videoChatPrompts + '}';
    }

    public void setMeetingId(String str) {
        this.meetingId = str;
    }

    public void setStatusCode(StatusCode statusCode2) {
        this.statusCode = statusCode2;
    }

    public void setVideoChat(List<VideoChat> list) {
        this.videoChats = list;
    }

    public void setVideoChatPrompts(List<VideoChatPrompt> list) {
        this.videoChatPrompts = list;
    }
}
