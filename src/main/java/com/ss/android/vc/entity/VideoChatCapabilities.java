package com.ss.android.vc.entity;

import java.io.Serializable;
import java.util.List;

public class VideoChatCapabilities implements Serializable {
    private static final long serialVersionUID = 1;
    private boolean becomeInterpreter;
    private boolean canBeCoHost;
    private boolean canBeHost;
    private boolean follow;
    private List<String> followConsumeStrategyIds;
    private List<String> followProduceStrategyIds;
    private boolean follow_presenter;
    private boolean joinLobby;
    private boolean shareScreen;
    private boolean supportHandManage;
    private boolean updateMeeting;

    public List<String> getFollowConsumeStrategyIds() {
        return this.followConsumeStrategyIds;
    }

    public List<String> getFollowProduceStrategyIds() {
        return this.followProduceStrategyIds;
    }

    public boolean getSupportHandManage() {
        return this.supportHandManage;
    }

    public boolean isBecomeInterpreter() {
        return this.becomeInterpreter;
    }

    public boolean isCanBeCoHost() {
        return this.canBeCoHost;
    }

    public boolean isCanBeHost() {
        return this.canBeHost;
    }

    public boolean isFollow() {
        return this.follow;
    }

    public boolean isFollowPresenter() {
        return this.follow_presenter;
    }

    public boolean isJoinLobby() {
        return this.joinLobby;
    }

    public boolean isShareScreen() {
        return this.shareScreen;
    }

    public boolean isUpdateMeeting() {
        return this.updateMeeting;
    }

    public String toString() {
        return "VideoChatCapabilities{shareScreen=" + this.shareScreen + ", updateMeeting=" + this.updateMeeting + ", follow=" + this.follow + ", follow_presenter=" + this.follow_presenter + ", joinLobby=" + this.joinLobby + ", supportHandManage=" + this.supportHandManage + ", becomeInterpreter=" + this.becomeInterpreter + ", canBeHost=" + this.canBeHost + ", canBeCoHost=" + this.canBeCoHost + '}';
    }

    public void setBecomeInterpreter(boolean z) {
        this.becomeInterpreter = z;
    }

    public void setCanBeCoHost(boolean z) {
        this.canBeCoHost = z;
    }

    public void setCanBeHost(boolean z) {
        this.canBeHost = z;
    }

    public void setFollow(boolean z) {
        this.follow = z;
    }

    public void setFollowConsumeStrategyIds(List<String> list) {
        this.followConsumeStrategyIds = list;
    }

    public void setFollowPresenter(boolean z) {
        this.follow_presenter = z;
    }

    public void setFollowProduceStrategyIds(List<String> list) {
        this.followProduceStrategyIds = list;
    }

    public void setJoinLobby(boolean z) {
        this.joinLobby = z;
    }

    public void setShareScreen(boolean z) {
        this.shareScreen = z;
    }

    public void setSupportHandManage(boolean z) {
        this.supportHandManage = z;
    }

    public void setUpdateMeeting(boolean z) {
        this.updateMeeting = z;
    }
}
