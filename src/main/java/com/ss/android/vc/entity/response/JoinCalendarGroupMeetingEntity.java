package com.ss.android.vc.entity.response;

import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.module.lobby.pb.C62149b;

public class JoinCalendarGroupMeetingEntity {

    /* renamed from: a */
    public Type f152596a;

    /* renamed from: b */
    public Boolean f152597b;

    /* renamed from: c */
    public VideoChat f152598c;

    /* renamed from: d */
    public C62149b f152599d;

    public enum Type {
        CALENDAR_MEETING_UNKNOWN(0),
        CALENDAR_SUCCESS(1),
        CALENDAR_VC_BUSY(2),
        CALENDAR_VOIP_BUSY(3),
        CALENDAR_MEETING_ENDED(4),
        CALENDAR_PARTICIPANT_LIMIT_EXCEED(5),
        CALENDAR_MEETING_OUT_OF_DATE(6),
        CALENDAR_MEETING_NEED_EXTENSION(7),
        CALENDAR_VERSION_LOW(8);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public static Type fromValue(int i) {
            switch (i) {
                case 0:
                    return CALENDAR_MEETING_UNKNOWN;
                case 1:
                    return CALENDAR_SUCCESS;
                case 2:
                    return CALENDAR_VC_BUSY;
                case 3:
                    return CALENDAR_VOIP_BUSY;
                case 4:
                    return CALENDAR_MEETING_ENDED;
                case 5:
                    return CALENDAR_PARTICIPANT_LIMIT_EXCEED;
                case 6:
                    return CALENDAR_MEETING_OUT_OF_DATE;
                case 7:
                    return CALENDAR_MEETING_NEED_EXTENSION;
                case 8:
                    return CALENDAR_VERSION_LOW;
                default:
                    return null;
            }
        }

        private Type(int i) {
            this.value = i;
        }
    }
}
