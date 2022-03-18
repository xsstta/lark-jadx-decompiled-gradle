package com.ss.android.vc.entity.response;

import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.module.lobby.pb.C62149b;

public class RejoinVideoChatEntity {

    /* renamed from: a */
    public VideoChat f152611a;

    /* renamed from: b */
    public StatusCode f152612b;

    /* renamed from: c */
    public C62149b f152613c;

    public enum StatusCode {
        UNKNOWN(0),
        SUCCESS(1),
        VC_BUSY_ERROR(2),
        VoIP_BUSY_ERROR(3),
        MEETING_END_ERROR(4),
        PARTICIPANT_LIMIT_EXCEED_ERROR(5);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public static StatusCode fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return SUCCESS;
            }
            if (i == 2) {
                return VC_BUSY_ERROR;
            }
            if (i == 3) {
                return VoIP_BUSY_ERROR;
            }
            if (i == 4) {
                return MEETING_END_ERROR;
            }
            if (i != 5) {
                return null;
            }
            return PARTICIPANT_LIMIT_EXCEED_ERROR;
        }

        private StatusCode(int i) {
            this.value = i;
        }
    }
}
