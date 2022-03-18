package com.ss.android.vc.entity;

import com.huawei.hms.android.HwBuildEx;
import com.ss.android.vc.entity.LiveBindingData;
import com.ss.android.vc.entity.follow.FollowAction;
import com.ss.android.vc.entity.follow.FollowInfo;
import com.ss.android.vc.entity.livestream.LiveInfo;
import com.ss.android.vc.entity.sketch.SketchTransferMode;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class InMeetingData implements Serializable {
    private static final long serialVersionUID = 1;
    private AllMicrophoneMutedData allMicrophoneMutedData;
    private FollowData followData;
    private HostTransferredData hostTransferredData;
    private LiveMeetingData mLiveMeetingData;
    private RecordMeetingData mRecordMeetingData;
    private SubtitleStatusData mSubtitleStatusData;
    private String meetingId;
    private ByteviewUser meetingOwner;
    private ParticipantsChangedData participantsChangedData;
    private ScreenSharedData screenSharedData;
    private SettingsChangedData settingsChangedData;
    private Type type;

    public static class LiveMeetingData {

        /* renamed from: a */
        private LiveInfo f152427a;

        /* renamed from: b */
        private Type f152428b;

        /* renamed from: c */
        private ByteviewUser f152429c;

        /* renamed from: com.ss.android.vc.entity.InMeetingData$LiveMeetingData$a */
        public static final class C60921a {

            /* renamed from: a */
            public Map<String, LiveBindingData.C60922a> f152430a;

            /* renamed from: b */
            public Map<String, LiveBindingData.C60923b> f152431b;
        }

        public enum LayoutStyle {
            STYLE_UNKNOWN(0),
            LIST(1),
            GALLERY(2),
            SIMPLE(3),
            PORTRAIT(4);
            
            private int value;

            public int getNumber() {
                return this.value;
            }

            public int getValue() {
                return this.value;
            }

            public static LayoutStyle fromValue(int i) {
                if (i == 0) {
                    return STYLE_UNKNOWN;
                }
                if (i == 1) {
                    return LIST;
                }
                if (i == 2) {
                    return GALLERY;
                }
                if (i == 3) {
                    return SIMPLE;
                }
                if (i != 4) {
                    return null;
                }
                return PORTRAIT;
            }

            private LayoutStyle(int i) {
                this.value = i;
            }
        }

        public enum Privilege {
            PREVILEGE_UNKNOWN(0),
            ANONYMOUS(1),
            EMPLOYEE(2);
            
            private int value;

            public int getNumber() {
                return this.value;
            }

            public int getValue() {
                return this.value;
            }

            public static Privilege fromValue(int i) {
                if (i == 0) {
                    return PREVILEGE_UNKNOWN;
                }
                if (i == 1) {
                    return ANONYMOUS;
                }
                if (i != 2) {
                    return null;
                }
                return EMPLOYEE;
            }

            private Privilege(int i) {
                this.value = i;
            }
        }

        public enum Type {
            UNKNOWN(0),
            LIVE_INFO_CHANGE(1),
            PARTICIPANT_REQUEST(2),
            HOST_RESPONSE(3);
            
            private int value;

            public int getNumber() {
                return this.value;
            }

            public Type valueOf(int i) {
                return forNumber(i);
            }

            public static Type forNumber(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return LIVE_INFO_CHANGE;
                }
                if (i == 2) {
                    return PARTICIPANT_REQUEST;
                }
                if (i == 3) {
                    return HOST_RESPONSE;
                }
                return UNKNOWN;
            }

            private Type(int i) {
                this.value = i;
            }
        }

        /* renamed from: a */
        public LiveInfo mo209029a() {
            return this.f152427a;
        }

        /* renamed from: b */
        public Type mo209033b() {
            return this.f152428b;
        }

        /* renamed from: d */
        public ByteviewUser mo209035d() {
            return this.f152429c;
        }

        /* renamed from: c */
        public boolean mo209034c() {
            LiveInfo aVar = this.f152427a;
            if (aVar != null) {
                return aVar.mo209943b();
            }
            return false;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("isLiving " + mo209034c());
            sb.append(" ");
            if (this.f152428b != null) {
                sb.append("type " + this.f152428b);
                sb.append(" ");
            }
            if (this.f152429c != null) {
                sb.append("user " + this.f152429c);
                sb.append(" ");
            }
            if (this.f152427a != null) {
                sb.append("mLiveInfo " + this.f152427a);
                sb.append(" ");
            }
            return sb.toString();
        }

        /* renamed from: a */
        public void mo209030a(ByteviewUser byteviewUser) {
            this.f152429c = byteviewUser;
        }

        /* renamed from: a */
        public void mo209031a(Type type) {
            this.f152428b = type;
        }

        /* renamed from: a */
        public void mo209032a(LiveInfo aVar) {
            this.f152427a = aVar;
        }
    }

    public static class RecordMeetingData {

        /* renamed from: a */
        private Type f152432a;

        /* renamed from: b */
        private boolean f152433b;

        /* renamed from: c */
        private ByteviewUser f152434c;

        /* renamed from: d */
        private String f152435d;

        /* renamed from: e */
        private VcI18nKeyInfo f152436e;

        /* renamed from: f */
        private VcMsgInfo f152437f;

        public enum Type {
            UNKNOWN(0),
            RECORDING_STATUS_CHANGE(1),
            PARTICIPANT_REQUEST(2),
            HOST_RESPONSE(3),
            RECORDING_INFO(10);
            
            private int value;

            public int getNumber() {
                return this.value;
            }

            public Type valueOf(int i) {
                return forNumber(i);
            }

            public static Type forNumber(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return RECORDING_STATUS_CHANGE;
                }
                if (i == 2) {
                    return PARTICIPANT_REQUEST;
                }
                if (i == 3) {
                    return HOST_RESPONSE;
                }
                if (i == 10) {
                    return RECORDING_INFO;
                }
                return UNKNOWN;
            }

            private Type(int i) {
                this.value = i;
            }
        }

        /* renamed from: a */
        public Type mo209046a() {
            return this.f152432a;
        }

        /* renamed from: b */
        public boolean mo209053b() {
            return this.f152433b;
        }

        /* renamed from: c */
        public ByteviewUser mo209054c() {
            return this.f152434c;
        }

        /* renamed from: d */
        public String mo209055d() {
            return this.f152435d;
        }

        /* renamed from: e */
        public VcMsgInfo mo209056e() {
            return this.f152437f;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("isRecording " + this.f152433b);
            sb.append(" ");
            if (this.f152432a != null) {
                sb.append("type " + this.f152432a);
                sb.append(" ");
            }
            if (this.f152434c != null) {
                sb.append("user " + this.f152434c);
                sb.append(" ");
            }
            return sb.toString();
        }

        /* renamed from: a */
        public void mo209047a(ByteviewUser byteviewUser) {
            this.f152434c = byteviewUser;
        }

        /* renamed from: a */
        public void mo209048a(Type type) {
            this.f152432a = type;
        }

        /* renamed from: a */
        public void mo209049a(VcI18nKeyInfo vcI18nKeyInfo) {
            this.f152436e = vcI18nKeyInfo;
        }

        /* renamed from: a */
        public void mo209050a(VcMsgInfo vcMsgInfo) {
            this.f152437f = vcMsgInfo;
        }

        /* renamed from: a */
        public void mo209051a(String str) {
            this.f152435d = str;
        }

        /* renamed from: a */
        public void mo209052a(boolean z) {
            this.f152433b = z;
        }
    }

    public static class SubtitleStatusData {

        /* renamed from: a */
        public Status f152438a;

        /* renamed from: b */
        public LangDetectInfo f152439b;

        /* renamed from: c */
        public boolean f152440c;

        /* renamed from: d */
        public String f152441d;

        /* renamed from: e */
        public ByteviewUser f152442e;

        public enum Status {
            STATUS_UNKNOWN(0),
            OPEN_SUCCESS(1),
            OPEN_FAILED(2),
            EXCEPTION(3),
            RECOVERABLE_EXCEPTION(4),
            RECOVER_SUCCESS(5),
            LANG_DETECTED(6),
            FIRST_OPEN(7),
            MEETING_SUBTITLE_STATUS_CHANGE(8),
            APPLY_GLOBAL_SPOKEN_LANGUAGE(9),
            SUBTITLE_RECV(10);
            
            int value;

            public int getNumber() {
                return this.value;
            }

            public static Status valueOf(int i) {
                switch (i) {
                    case 0:
                        return STATUS_UNKNOWN;
                    case 1:
                        return OPEN_SUCCESS;
                    case 2:
                        return OPEN_FAILED;
                    case 3:
                        return EXCEPTION;
                    case 4:
                        return RECOVERABLE_EXCEPTION;
                    case 5:
                        return RECOVER_SUCCESS;
                    case 6:
                        return LANG_DETECTED;
                    case 7:
                        return FIRST_OPEN;
                    case 8:
                        return MEETING_SUBTITLE_STATUS_CHANGE;
                    case 9:
                        return APPLY_GLOBAL_SPOKEN_LANGUAGE;
                    case 10:
                        return SUBTITLE_RECV;
                    default:
                        return STATUS_UNKNOWN;
                }
            }

            private Status(int i) {
                this.value = i;
            }
        }
    }

    public static class AllMicrophoneMutedData implements Serializable {
        private static final long serialVersionUID = 1;
        private boolean isMuted;
        private ByteviewUser operationUser;

        public ByteviewUser getOperationUser() {
            return this.operationUser;
        }

        public boolean isMuted() {
            return this.isMuted;
        }

        public String toString() {
            return "AllMicrophoneMutedData{isMuted=" + this.isMuted + ", operationUser=" + this.operationUser + '}';
        }

        public void setMuted(boolean z) {
            this.isMuted = z;
        }

        public void setOperationUser(ByteviewUser byteviewUser) {
            this.operationUser = byteviewUser;
        }
    }

    public static class FollowData implements Serializable {
        private static final long serialVersionUID = 1;
        private List<FollowAction> followActions;
        private FollowInfo followInfo;
        private ByteviewUser tokenGranter;
        private ByteviewUser tokenRequester;

        public List<FollowAction> getFollowActions() {
            return this.followActions;
        }

        public FollowInfo getFollowInfo() {
            return this.followInfo;
        }

        public ByteviewUser getTokenGranter() {
            return this.tokenGranter;
        }

        public ByteviewUser getTokenRequester() {
            return this.tokenRequester;
        }

        public String toString() {
            return "FollowData{followInfo=" + this.followInfo + ", followActions=" + this.followActions + ", tokenRequester=" + this.tokenRequester + ", tokenGranter=" + this.tokenGranter + '}';
        }

        public void setFollowActions(List<FollowAction> list) {
            this.followActions = list;
        }

        public void setFollowInfo(FollowInfo followInfo2) {
            this.followInfo = followInfo2;
        }

        public void setTokenGranter(ByteviewUser byteviewUser) {
            this.tokenGranter = byteviewUser;
        }

        public void setTokenRequester(ByteviewUser byteviewUser) {
            this.tokenRequester = byteviewUser;
        }
    }

    public static class HostTransferredData implements Serializable {
        private static final long serialVersionUID = 1;
        private String hostDeviceId;
        private String hostId;
        private ParticipantType hostType;

        public String getHostDeviceId() {
            return this.hostDeviceId;
        }

        public String getHostId() {
            return this.hostId;
        }

        public ParticipantType getHostType() {
            return this.hostType;
        }

        public String toString() {
            return "HostTransferredData{hostId='" + this.hostId + '\'' + ", hostDeviceId='" + this.hostDeviceId + '\'' + ", hostType=" + this.hostType + '}';
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
    }

    public static class ParticipantsChangedData implements Serializable {
        private static final long serialVersionUID = 1;
        private List<Participant> participants;

        public List<Participant> getParticipants() {
            return this.participants;
        }

        public String toString() {
            return "ParticipantsChangedData{participants=" + this.participants + '}';
        }

        public void setParticipants(List<Participant> list) {
            this.participants = list;
        }
    }

    public static class ScreenSharedData implements Serializable {
        private static final long serialVersionUID = 1;
        private boolean accessibility;
        private boolean canSketch;
        private int height;
        private boolean isPortraitMode;
        private boolean isSharing;
        private boolean isSketch;
        private String participantDeviceId;
        private String participantId;
        private ParticipantType participantType;
        private String shareScreenId;
        private SketchTransferMode sketchTransferMode;
        private int width;

        public int getHeight() {
            return this.height;
        }

        public boolean getIsPortraitMode() {
            return this.isPortraitMode;
        }

        public String getParticipantDeviceId() {
            return this.participantDeviceId;
        }

        public String getParticipantId() {
            return this.participantId;
        }

        public ParticipantType getParticipantType() {
            return this.participantType;
        }

        public String getShareScreenId() {
            return this.shareScreenId;
        }

        public SketchTransferMode getSketchTransferMode() {
            return this.sketchTransferMode;
        }

        public int getWidth() {
            return this.width;
        }

        public boolean isAccessibility() {
            return this.accessibility;
        }

        public boolean isCanSketch() {
            return this.canSketch;
        }

        public boolean isSharing() {
            return this.isSharing;
        }

        public boolean isSketch() {
            return this.isSketch;
        }

        public String toString() {
            return "ScreenSharedData{isSharing=" + this.isSharing + ", participantId='" + this.participantId + '\'' + ", participantDeviceId='" + this.participantDeviceId + '\'' + ", participantType=" + this.participantType + ", width=" + this.width + ", height=" + this.height + ", shareScreenId='" + this.shareScreenId + '\'' + ", isSketch=" + this.isSketch + ", canSketch=" + this.canSketch + ", accessibility=" + this.accessibility + ", isPortraitMode=" + this.isPortraitMode + ", sketchTransferMode=" + this.sketchTransferMode + '}';
        }

        public void setAccessibility(boolean z) {
            this.accessibility = z;
        }

        public void setCanSketch(boolean z) {
            this.canSketch = z;
        }

        public void setHeight(int i) {
            this.height = i;
        }

        public void setParticipantDeviceId(String str) {
            this.participantDeviceId = str;
        }

        public void setParticipantId(String str) {
            this.participantId = str;
        }

        public void setParticipantType(ParticipantType participantType2) {
            this.participantType = participantType2;
        }

        public void setPortraitMode(boolean z) {
            this.isPortraitMode = z;
        }

        public void setShareScreenId(String str) {
            this.shareScreenId = str;
        }

        public void setSharing(boolean z) {
            this.isSharing = z;
        }

        public void setSketch(boolean z) {
            this.isSketch = z;
        }

        public void setSketchTransferMode(SketchTransferMode sketchTransferMode2) {
            this.sketchTransferMode = sketchTransferMode2;
        }

        public void setWidth(int i) {
            this.width = i;
        }
    }

    public static class SettingsChangedData implements Serializable {
        private static final long serialVersionUID = 1;
        private VideoChatSettings videoChatSettings;

        public VideoChatSettings getVideoChatSettings() {
            return this.videoChatSettings;
        }

        public String toString() {
            return "SettingsChangedData{videoChatSettings=" + this.videoChatSettings + '}';
        }

        public void setVideoChatSettings(VideoChatSettings videoChatSettings2) {
            this.videoChatSettings = videoChatSettings2;
        }
    }

    public enum Type {
        UNKNOWN(0),
        SETTINGS_CHANGED(1),
        PARTICIPANTS_CHANGED(2),
        HOST_TRANSFERRED(3),
        ALL_MICROPHONE_MUTED(4),
        SCREEN_SHARED(5),
        UNMUTE_CAMERA_CONFIRMED(6),
        UPGRADE_MEETING(7),
        FOLLOW_CHANGED(8),
        FOLLOW_ACTION_CHANGED(9),
        UNMUTE_MICROPHONE_CONFIRMED(10),
        RECORD_MEETING(11),
        REQUEST_FOLLOW_TOKEN(12),
        GRANT_FOLLOW_TOKEN(13),
        SUBTITLE_STATUS_CONFIRMED(14),
        APPLY_REMOTE_CONTROL(15),
        LIVE_MEETING(16),
        SUBTITLE_STATUS_CHANGE(20),
        HOST_MUTE_MIC(101),
        HOST_MUTE_CAMERA(102),
        SECURITY_LEVEL_FASTEN(103),
        SECURITY_LEVEL_UNFASTEN(104);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Type valueOf(int i) {
            return forNumber(i);
        }

        public static Type forNumber(int i) {
            if (i == 20) {
                return SUBTITLE_STATUS_CHANGE;
            }
            switch (i) {
                case 0:
                    return UNKNOWN;
                case 1:
                    return SETTINGS_CHANGED;
                case 2:
                    return PARTICIPANTS_CHANGED;
                case 3:
                    return HOST_TRANSFERRED;
                case 4:
                    return ALL_MICROPHONE_MUTED;
                case 5:
                    return SCREEN_SHARED;
                case 6:
                    return UNMUTE_CAMERA_CONFIRMED;
                case 7:
                    return UPGRADE_MEETING;
                case 8:
                    return FOLLOW_CHANGED;
                case 9:
                    return FOLLOW_ACTION_CHANGED;
                case 10:
                    return UNMUTE_MICROPHONE_CONFIRMED;
                case 11:
                    return RECORD_MEETING;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    return REQUEST_FOLLOW_TOKEN;
                case 13:
                    return GRANT_FOLLOW_TOKEN;
                case 14:
                    return SUBTITLE_STATUS_CONFIRMED;
                case 15:
                    return APPLY_REMOTE_CONTROL;
                case 16:
                    return LIVE_MEETING;
                default:
                    switch (i) {
                        case 101:
                            return HOST_MUTE_MIC;
                        case 102:
                            return HOST_MUTE_CAMERA;
                        case 103:
                            return SECURITY_LEVEL_FASTEN;
                        case 104:
                            return SECURITY_LEVEL_UNFASTEN;
                        default:
                            return null;
                    }
            }
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public AllMicrophoneMutedData getAllMicrophoneMutedData() {
        return this.allMicrophoneMutedData;
    }

    public FollowData getFollowData() {
        return this.followData;
    }

    public HostTransferredData getHostTransferredData() {
        return this.hostTransferredData;
    }

    public LiveMeetingData getLiveMeetingData() {
        return this.mLiveMeetingData;
    }

    public String getMeetingId() {
        return this.meetingId;
    }

    public ByteviewUser getMeetingOwner() {
        return this.meetingOwner;
    }

    public ParticipantsChangedData getParticipantsChangedData() {
        return this.participantsChangedData;
    }

    public RecordMeetingData getRecordMeetingData() {
        return this.mRecordMeetingData;
    }

    public ScreenSharedData getScreenSharedData() {
        return this.screenSharedData;
    }

    public SettingsChangedData getSettingsChangedData() {
        return this.settingsChangedData;
    }

    public SubtitleStatusData getSubtitleStatusData() {
        return this.mSubtitleStatusData;
    }

    public Type getType() {
        return this.type;
    }

    public String toString() {
        return "InMeetingData{type=" + this.type + ", meetingId='" + this.meetingId + '\'' + ", settingsChangedData=" + this.settingsChangedData + ", participantsChangedData=" + this.participantsChangedData + ", hostTransferredData=" + this.hostTransferredData + ", allMicrophoneMutedData=" + this.allMicrophoneMutedData + ", screenSharedData=" + this.screenSharedData + ", followData=" + this.followData + ", mRecordMeetingData=" + this.mRecordMeetingData + ", mSubtitleStatusData=" + this.mSubtitleStatusData + ", mLiveMeetingData=" + this.mLiveMeetingData + ", meetingOwner=" + this.meetingOwner + '}';
    }

    public void setAllMicrophoneMutedData(AllMicrophoneMutedData allMicrophoneMutedData2) {
        this.allMicrophoneMutedData = allMicrophoneMutedData2;
    }

    public void setFollowData(FollowData followData2) {
        this.followData = followData2;
    }

    public void setHostTransferredData(HostTransferredData hostTransferredData2) {
        this.hostTransferredData = hostTransferredData2;
    }

    public void setLiveMeetingData(LiveMeetingData liveMeetingData) {
        this.mLiveMeetingData = liveMeetingData;
    }

    public void setMeetingId(String str) {
        this.meetingId = str;
    }

    public void setMeetingOwner(ByteviewUser byteviewUser) {
        this.meetingOwner = byteviewUser;
    }

    public void setParticipantsChangedData(ParticipantsChangedData participantsChangedData2) {
        this.participantsChangedData = participantsChangedData2;
    }

    public void setRecordMeetingData(RecordMeetingData recordMeetingData) {
        this.mRecordMeetingData = recordMeetingData;
    }

    public void setScreenSharedData(ScreenSharedData screenSharedData2) {
        this.screenSharedData = screenSharedData2;
    }

    public void setSettingsChangedData(SettingsChangedData settingsChangedData2) {
        this.settingsChangedData = settingsChangedData2;
    }

    public void setSubtitleStatusData(SubtitleStatusData subtitleStatusData) {
        this.mSubtitleStatusData = subtitleStatusData;
    }

    public void setType(Type type2) {
        this.type = type2;
    }
}
