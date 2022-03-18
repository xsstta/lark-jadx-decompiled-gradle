package com.ss.android.vc.entity;

import com.ss.android.vc.entity.InMeetingData;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.follow.FollowInfo;
import com.ss.android.vc.entity.livestream.LiveInfo;
import com.ss.android.vc.meeting.module.VCBreakoutRoomInfo;
import java.io.Serializable;
import java.util.List;

public class VideoChatInMeetingInfo implements Serializable {
    private static final long serialVersionUID = 1;
    private List<VCBreakoutRoomInfo> breakoutRoomInfos;
    private FollowInfo followInfo;
    private boolean hasRecorded;
    private String hostDeviceId;
    private String hostId;
    private ParticipantType hostType;
    private String id;
    private boolean isRecording;
    private boolean isSubtitleOn;
    private LiveInfo liveInfo;
    private String meetingUrl;
    private List<Participant> participants;
    private InMeetingData.RecordMeetingData recordMeetingData;
    private InMeetingData.ScreenSharedData screenSharedData;
    private boolean shouldPullSuggested;
    private VideoChat.Type type;
    private String version;
    private VideoChatSettings videoChatSettings;

    public List<VCBreakoutRoomInfo> getBreakoutRoomInfos() {
        return this.breakoutRoomInfos;
    }

    public FollowInfo getFollowInfo() {
        return this.followInfo;
    }

    public String getHostDeviceId() {
        return this.hostDeviceId;
    }

    public String getHostId() {
        return this.hostId;
    }

    public ParticipantType getHostType() {
        return this.hostType;
    }

    public String getId() {
        return this.id;
    }

    public LiveInfo getLiveInfo() {
        return this.liveInfo;
    }

    public String getMeetingUrl() {
        return this.meetingUrl;
    }

    public List<Participant> getParticipants() {
        return this.participants;
    }

    public InMeetingData.RecordMeetingData getRecordMeetingData() {
        return this.recordMeetingData;
    }

    public InMeetingData.ScreenSharedData getScreenSharedData() {
        return this.screenSharedData;
    }

    public VideoChat.Type getType() {
        return this.type;
    }

    public String getVersion() {
        return this.version;
    }

    public VideoChatSettings getVideoChatSettings() {
        return this.videoChatSettings;
    }

    public boolean isHasRecorded() {
        return this.hasRecorded;
    }

    public boolean isRecording() {
        return this.isRecording;
    }

    public boolean isShouldPullSuggested() {
        return this.shouldPullSuggested;
    }

    public boolean isSubtitleOn() {
        return this.isSubtitleOn;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("{id = ");
        sb.append(this.id);
        sb.append(", hostId = ");
        sb.append(this.hostId);
        sb.append(", hostType = ");
        sb.append(this.hostType);
        sb.append(", videoChatSettings = ");
        VideoChatSettings videoChatSettings2 = this.videoChatSettings;
        if (videoChatSettings2 == null) {
            str = "null";
        } else {
            str = videoChatSettings2.toString();
        }
        sb.append(str);
        sb.append(", shareScreenData = ");
        sb.append(this.screenSharedData);
        sb.append(", type = ");
        sb.append(this.type);
        return sb.toString() + "}";
    }

    public void setBreakoutRoomInfos(List<VCBreakoutRoomInfo> list) {
        this.breakoutRoomInfos = list;
    }

    public void setFollowInfo(FollowInfo followInfo2) {
        this.followInfo = followInfo2;
    }

    public void setHasRecorded(boolean z) {
        this.hasRecorded = z;
    }

    public void setHostDeviceId(String str) {
        this.hostDeviceId = str;
    }

    public void setHostId(String str) {
        this.hostId = str;
    }

    public void setHostType(ParticipantType participantType) {
        this.hostType = participantType;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setLiveInfo(LiveInfo aVar) {
        this.liveInfo = aVar;
    }

    public void setMeetingUrl(String str) {
        this.meetingUrl = str;
    }

    public void setParticipants(List<Participant> list) {
        this.participants = list;
    }

    public void setRecordMeetingData(InMeetingData.RecordMeetingData recordMeetingData2) {
        this.recordMeetingData = recordMeetingData2;
    }

    public void setRecording(boolean z) {
        this.isRecording = z;
    }

    public void setScreenSharedData(InMeetingData.ScreenSharedData screenSharedData2) {
        this.screenSharedData = screenSharedData2;
    }

    public void setShouldPullSuggested(boolean z) {
        this.shouldPullSuggested = z;
    }

    public void setSubtitleOn(boolean z) {
        this.isSubtitleOn = z;
    }

    public void setType(VideoChat.Type type2) {
        this.type = type2;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public void setVideoChatSettings(VideoChatSettings videoChatSettings2) {
        this.videoChatSettings = videoChatSettings2;
    }
}
