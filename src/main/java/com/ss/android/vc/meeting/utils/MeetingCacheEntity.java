package com.ss.android.vc.meeting.utils;

import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.VideoChat;
import java.io.Serializable;

public class MeetingCacheEntity implements Serializable {
    private static final long serialVersionUID = 1;
    private Participant.Status status;
    private VideoChat videoChat;

    public MeetingCacheEntity() {
    }

    public Participant.Status getStatus() {
        return this.status;
    }

    public VideoChat getVideoChat() {
        return this.videoChat;
    }

    public void setStatus(Participant.Status status2) {
        this.status = status2;
    }

    public void setVideoChat(VideoChat videoChat2) {
        this.videoChat = videoChat2;
    }

    public MeetingCacheEntity(VideoChat videoChat2, Participant.Status status2) {
        this.videoChat = videoChat2;
        this.status = status2;
    }
}
