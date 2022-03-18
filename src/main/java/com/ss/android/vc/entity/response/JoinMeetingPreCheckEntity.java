package com.ss.android.vc.entity.response;

import com.huawei.hms.android.HwBuildEx;
import com.ss.android.vc.entity.VideoChat;
import java.util.List;

public class JoinMeetingPreCheckEntity {

    /* renamed from: a */
    public JoinMeetingCheckType f152604a;

    /* renamed from: b */
    public C60952a f152605b;

    /* renamed from: c */
    public VideoChat.VendorType f152606c;

    /* renamed from: com.ss.android.vc.entity.response.JoinMeetingPreCheckEntity$a */
    public static final class C60952a {

        /* renamed from: a */
        public List<VideoChat> f152607a;

        /* renamed from: b */
        public String f152608b;
    }

    public enum JoinMeetingCheckType {
        UNKNOEN(0),
        SUCCESS(1),
        MEETING_ENDED(2),
        PARTICIPANT_LIMIT_EXCEED(3),
        MEETING_LOCKED(4),
        MEETING_NUMBER_INVALID(5),
        VOIP_BUSY(6),
        VERSION_LOW(7),
        DEVICE_IN_MEETING(8),
        DEVICE_RINGING(9),
        CHAT_POST_NO_PERMISSION(10),
        TENANT_IN_BLACKLIST(11),
        CALENDAR_OUT_OF_DATE(12),
        INTERVIEW_NO_PERMISSION(13),
        INTERVIEW_OUT_OF_DATE(14),
        COLLABORATION_BLOCKED(16),
        COLLABORATION_NO_RIGHTS(17),
        COLLABORATION_BE_BLOCKED(18),
        RESERVATION_OUT_OF_DATE(19);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public static JoinMeetingCheckType fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOEN;
                case 1:
                    return SUCCESS;
                case 2:
                    return MEETING_ENDED;
                case 3:
                    return PARTICIPANT_LIMIT_EXCEED;
                case 4:
                    return MEETING_LOCKED;
                case 5:
                    return MEETING_NUMBER_INVALID;
                case 6:
                    return VOIP_BUSY;
                case 7:
                    return VERSION_LOW;
                case 8:
                    return DEVICE_IN_MEETING;
                case 9:
                    return DEVICE_RINGING;
                case 10:
                    return CHAT_POST_NO_PERMISSION;
                case 11:
                    return TENANT_IN_BLACKLIST;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    return CALENDAR_OUT_OF_DATE;
                case 13:
                    return INTERVIEW_NO_PERMISSION;
                case 14:
                    return INTERVIEW_OUT_OF_DATE;
                case 15:
                default:
                    return null;
                case 16:
                    return COLLABORATION_BLOCKED;
                case 17:
                    return COLLABORATION_NO_RIGHTS;
                case 18:
                    return COLLABORATION_BE_BLOCKED;
                case 19:
                    return RESERVATION_OUT_OF_DATE;
            }
        }

        private JoinMeetingCheckType(int i) {
            this.value = i;
        }
    }
}
