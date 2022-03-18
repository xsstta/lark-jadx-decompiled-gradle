package com.ss.android.lark.mm.module.detail.baseinfo;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.mm.module.participant.model.MmParticipants;
import com.ss.android.lark.mm.module.record.audiorecorder.MmAudioFileHelper;
import com.ss.android.lark.mm.net.HttpMmResponse;
import java.io.Serializable;
import java.util.List;

public class MmBaseInfo implements Serializable {
    @JSONField(name = "allow_external_share")
    private boolean allowExternalShare;
    @JSONField(name = "allow_link_share")
    private boolean allowLinkShare;
    @JSONField(name = "allow_share")
    private boolean allowShare;
    @JSONField(name = "audio_url")
    private String audioUrl;
    @JSONField(name = "can_comment")
    private boolean canComment;
    @JSONField(name = "can_modify")
    private boolean canModify;
    private long duration;
    private List<File> files;
    @JSONField(name = "guest_mode")
    private boolean guestMode;
    @JSONField(name = "has_statistics")
    private boolean hasStatistics;
    private boolean hasSummary;
    @JSONField(name = "is_admin")
    private boolean isAdmin;
    @JSONField(name = "is_object_creator")
    private boolean isCreator;
    @JSONField(name = "is_owner")
    private boolean isOwner;
    @JSONField(name = "is_recording_device")
    private boolean isRecordingDevice;
    private List<String> keywords;
    @JSONField(name = "media_type")
    private String mediaType;
    @JSONField(name = "meeting_id")
    private String meetingId;
    @JSONField(name = "object_status")
    private int objectStatus;
    @JSONField(name = "object_token")
    private String objectToken;
    @JSONField(name = "object_type")
    private int objectType;
    @JSONField(name = "object_version")
    private int objectVersion;
    @JSONField(name = "owner_id")
    private String ownerId;
    @JSONField(name = "owner_info")
    private OwnerInfo ownerInfo;
    private List<MmParticipants> participants;
    @JSONField(name = "review_status")
    private int reviewStatus;
    @JSONField(name = "show_external_tag")
    private boolean showExternalTag;
    @JSONField(name = "start_time")
    private long startTime;
    @JSONField(name = "stop_time")
    private long stopTime;
    @JSONField(name = "subtitle_languages")
    private List<SubtitleLanguage> subtitleLanguages;
    private String topic;
    @JSONField(name = "video_cover")
    private String videoCover;
    private int videoEncodingType;
    @JSONField(name = "video_url")
    private String videoUrl;

    public static class File implements Serializable {
        private List<FileInfo> list;
        private int total;

        public static class FileInfo implements Serializable {
            private String fid;
            @JSONField(name = "file_icon")
            private String fileIcon;
            @JSONField(name = "file_title")
            private String fileTitle;
            @JSONField(name = "file_type")
            private int fileType;
            @JSONField(name = "file_url")
            private String fileUrl;
            @JSONField(name = "is_added")
            public boolean isFileAdded;
            @JSONField(name = "share_name")
            private String shareName;

            public String getFid() {
                return this.fid;
            }

            public String getFileIcon() {
                return this.fileIcon;
            }

            public String getFileTitle() {
                return this.fileTitle;
            }

            public int getFileType() {
                return this.fileType;
            }

            public String getFileUrl() {
                return this.fileUrl;
            }

            public String getShareName() {
                return this.shareName;
            }

            public void setFid(String str) {
                this.fid = str;
            }

            public void setFileIcon(String str) {
                this.fileIcon = str;
            }

            public void setFileTitle(String str) {
                this.fileTitle = str;
            }

            public void setFileType(int i) {
                this.fileType = i;
            }

            public void setFileUrl(String str) {
                this.fileUrl = str;
            }

            public void setShareName(String str) {
                this.shareName = str;
            }
        }

        public List<FileInfo> getList() {
            return this.list;
        }

        public int getTotal() {
            return this.total;
        }

        public void setList(List<FileInfo> list2) {
            this.list = list2;
        }

        public void setTotal(int i) {
            this.total = i;
        }
    }

    public static class MmBaseInfoResp extends HttpMmResponse<MmBaseInfo> {
    }

    public static class OwnerInfo implements Serializable {
        @JSONField(name = "avatar_url")
        private String avatarUrl;
        @JSONField(name = "user_id")
        private String userId;
        @JSONField(name = "user_name")
        private String userName;

        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public String getUserName() {
            return this.userName;
        }

        public void setAvatarUrl(String str) {
            this.avatarUrl = str;
        }

        public void setUserName(String str) {
            this.userName = str;
        }
    }

    public static class SubtitleLanguage implements Serializable {
        private String language;
        @JSONField(name = "language_name")
        private String languageName;

        public String getLanguage() {
            return this.language;
        }

        public String getLanguageName() {
            return this.languageName;
        }

        public void setLanguage(String str) {
            this.language = str;
        }

        public void setLanguageName(String str) {
            this.languageName = str;
        }
    }

    public long getDuration() {
        return this.duration;
    }

    public List<File> getFiles() {
        return this.files;
    }

    public List<String> getKeywords() {
        return this.keywords;
    }

    public String getMediaType() {
        return this.mediaType;
    }

    public String getMeetingId() {
        return this.meetingId;
    }

    public int getObjectStatus() {
        return this.objectStatus;
    }

    public String getObjectToken() {
        return this.objectToken;
    }

    public int getObjectType() {
        return this.objectType;
    }

    public int getObjectVersion() {
        return this.objectVersion;
    }

    public String getOwnerId() {
        return this.ownerId;
    }

    public OwnerInfo getOwnerInfo() {
        return this.ownerInfo;
    }

    public List<MmParticipants> getParticipants() {
        return this.participants;
    }

    public int getReviewStatus() {
        return this.reviewStatus;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public long getStopTime() {
        return this.stopTime;
    }

    public List<SubtitleLanguage> getSubtitleLanguages() {
        return this.subtitleLanguages;
    }

    public String getTopic() {
        return this.topic;
    }

    public String getVideoCover() {
        return this.videoCover;
    }

    public int getVideoEncodingType() {
        return this.videoEncodingType;
    }

    public String getVideoUrl() {
        return this.videoUrl;
    }

    public boolean isAdmin() {
        return this.isAdmin;
    }

    public boolean isAllowExternalShare() {
        return this.allowExternalShare;
    }

    public boolean isAllowLinkShare() {
        return this.allowLinkShare;
    }

    public boolean isAllowShare() {
        return this.allowShare;
    }

    public boolean isCanComment() {
        return this.canComment;
    }

    public boolean isCanModify() {
        return this.canModify;
    }

    public boolean isCreator() {
        return this.isCreator;
    }

    public boolean isGuestMode() {
        return this.guestMode;
    }

    public boolean isHasStatistics() {
        return this.hasStatistics;
    }

    public boolean isHasSummary() {
        return this.hasSummary;
    }

    public boolean isOwner() {
        return this.isOwner;
    }

    public boolean isRecordingDevice() {
        return this.isRecordingDevice;
    }

    public boolean isShowExternalTag() {
        return this.showExternalTag;
    }

    public String getAudioUrl() {
        if (TextUtils.isEmpty(this.audioUrl)) {
            return getVideoUrlWithLocal();
        }
        return this.audioUrl;
    }

    public boolean isAudioType() {
        if (MediaType.fromValue(this.mediaType) == MediaType.Audio) {
            return true;
        }
        return false;
    }

    public boolean isCompletedState() {
        if (this.objectStatus == ObjectStatus.Complete.getValue()) {
            return true;
        }
        return false;
    }

    public boolean isRecordingObjectType() {
        if (this.objectType == MMObjectType.RECORDING.value) {
            return true;
        }
        return false;
    }

    public boolean isUncompletedRecordingType() {
        if (!isRecordingObjectType() || isCompletedState()) {
            return false;
        }
        return true;
    }

    public boolean isVideoType() {
        if (MediaType.fromValue(this.mediaType) == MediaType.Video) {
            return true;
        }
        return false;
    }

    public boolean isWaitingAsrState() {
        if (this.objectStatus == ObjectStatus.WaitASR.getValue()) {
            return true;
        }
        return false;
    }

    public String getVideoUrlWithLocal() {
        String videoUrl2 = getVideoUrl();
        if (!TextUtils.isEmpty(this.videoUrl) || this.objectType != MMObjectType.RECORDING.value) {
            return videoUrl2;
        }
        return MmAudioFileHelper.f117976a.mo164610g(this.objectToken);
    }

    public void setAdmin(boolean z) {
        this.isAdmin = z;
    }

    public void setAllowExternalShare(boolean z) {
        this.allowExternalShare = z;
    }

    public void setAllowLinkShare(boolean z) {
        this.allowLinkShare = z;
    }

    public void setAllowShare(boolean z) {
        this.allowShare = z;
    }

    public void setAudioUrl(String str) {
        this.audioUrl = str;
    }

    public void setCanComment(boolean z) {
        this.canComment = z;
    }

    public void setCanModify(boolean z) {
        this.canModify = z;
    }

    public void setCreator(boolean z) {
        this.isCreator = z;
    }

    public void setDuration(long j) {
        this.duration = j;
    }

    public void setFiles(List<File> list) {
        this.files = list;
    }

    public void setGuestMode(boolean z) {
        this.guestMode = z;
    }

    public void setHasStatistics(boolean z) {
        this.hasStatistics = z;
    }

    public void setHasSummary(boolean z) {
        this.hasSummary = z;
    }

    public void setKeywords(List<String> list) {
        this.keywords = list;
    }

    public void setMediaType(String str) {
        this.mediaType = str;
    }

    public void setMeetingId(String str) {
        this.meetingId = str;
    }

    public void setObjectStatus(int i) {
        this.objectStatus = i;
    }

    public void setObjectToken(String str) {
        this.objectToken = str;
    }

    public void setObjectType(int i) {
        this.objectType = i;
    }

    public void setObjectVersion(int i) {
        this.objectVersion = i;
    }

    public void setOwner(boolean z) {
        this.isOwner = z;
    }

    public void setOwnerId(String str) {
        this.ownerId = str;
    }

    public void setOwnerInfo(OwnerInfo ownerInfo2) {
        this.ownerInfo = ownerInfo2;
    }

    public void setParticipants(List<MmParticipants> list) {
        this.participants = list;
    }

    public void setRecordingDevice(boolean z) {
        this.isRecordingDevice = z;
    }

    public void setReviewStatus(int i) {
        this.reviewStatus = i;
    }

    public void setShowExternalTag(boolean z) {
        this.showExternalTag = z;
    }

    public void setStartTime(long j) {
        this.startTime = j;
    }

    public void setStopTime(long j) {
        this.stopTime = j;
    }

    public void setSubtitleLanguages(List<SubtitleLanguage> list) {
        this.subtitleLanguages = list;
    }

    public void setTopic(String str) {
        this.topic = str;
    }

    public void setVideoCover(String str) {
        this.videoCover = str;
    }

    public void setVideoUrl(String str) {
        this.videoUrl = str;
    }

    public enum MMObjectType {
        MEETING(0),
        UPLOAD(1),
        SAYS(2),
        DEMO(3),
        CCM(4),
        RECORDING(5),
        UNKNOWN(-1);
        
        public int value;

        public static MMObjectType fromValue(int i) {
            if (i == 0) {
                return MEETING;
            }
            if (i == 1) {
                return UPLOAD;
            }
            if (i == 2) {
                return SAYS;
            }
            if (i == 3) {
                return DEMO;
            }
            if (i == 4) {
                return CCM;
            }
            if (i != 5) {
                return UNKNOWN;
            }
            return RECORDING;
        }

        private MMObjectType(int i) {
            this.value = i;
        }
    }
}
