package com.ss.android.vc.entity.breakoutroom;

import com.ss.android.vc.entity.VideoChat;
import java.io.Serializable;

public class VCBreakoutRoomJoinEntity implements Serializable {
    private static final long serialVersionUID = 1;
    private VideoChat videoChatInfo;

    public VideoChat getVideoChatInfo() {
        return this.videoChatInfo;
    }

    public void setVideoChatInfo(VideoChat videoChat) {
        this.videoChatInfo = videoChat;
    }
}
