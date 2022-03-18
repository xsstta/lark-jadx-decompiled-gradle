package com.ss.android.vc.entity.response;

import com.huawei.hms.android.HwBuildEx;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.module.lobby.pb.C62149b;
import java.util.List;

public class JoinMeetingEntity {

    /* renamed from: a */
    public Type f152600a;

    /* renamed from: b */
    public VideoChat f152601b;

    /* renamed from: c */
    public List<ClientExtraActionEntity> f152602c;

    /* renamed from: d */
    public C62149b f152603d;

    public enum Type {
        UNKNOWN(0),
        SUCCESS(1),
        VC_BUSY(2),
        VOIP_BUSY(3),
        PARTICIPANT_LIMIT_EXCEED(4),
        MEETING_ENDED(5),
        MEETING_OUT_OF_DATE(6),
        MEETING_NEED_EXTENSION(7),
        VERSION_LOW(8),
        MEETING_NUMBER_INVALID(9),
        DEVICE_RINGING(10),
        MEETING_LOCKED(11),
        CHAT_POST_NO_PERMISSION(12),
        TENANT_IN_BLACKLIST(13),
        MEETING_NUMBER_NOT_CERTIFICATED(14),
        VERSION_INCOMPATIBLE(15);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public static Type fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN;
                case 1:
                    return SUCCESS;
                case 2:
                    return VC_BUSY;
                case 3:
                    return VOIP_BUSY;
                case 4:
                    return PARTICIPANT_LIMIT_EXCEED;
                case 5:
                    return MEETING_ENDED;
                case 6:
                    return MEETING_OUT_OF_DATE;
                case 7:
                    return MEETING_NEED_EXTENSION;
                case 8:
                    return VERSION_LOW;
                case 9:
                    return MEETING_NUMBER_INVALID;
                case 10:
                    return DEVICE_RINGING;
                case 11:
                    return MEETING_LOCKED;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    return CHAT_POST_NO_PERMISSION;
                case 13:
                    return TENANT_IN_BLACKLIST;
                case 14:
                    return MEETING_NUMBER_NOT_CERTIFICATED;
                case 15:
                    return VERSION_INCOMPATIBLE;
                default:
                    return null;
            }
        }

        private Type(int i) {
            this.value = i;
        }
    }
}
