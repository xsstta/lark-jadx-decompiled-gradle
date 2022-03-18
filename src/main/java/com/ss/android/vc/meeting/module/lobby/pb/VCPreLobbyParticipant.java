package com.ss.android.vc.meeting.module.lobby.pb;

import com.ss.android.vc.entity.ByteviewUser;

public class VCPreLobbyParticipant {

    /* renamed from: a */
    public ByteviewUser f156107a;

    /* renamed from: b */
    public String f156108b;

    /* renamed from: c */
    public boolean f156109c;

    /* renamed from: d */
    public long f156110d;

    /* renamed from: e */
    public String f156111e;

    /* renamed from: f */
    public LeaveReason f156112f;

    public enum LeaveReason {
        UNKNOWN(0),
        LEAVE(1),
        MEETING_START(2),
        HEARTBEAT_STOP(3);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static LeaveReason fromValue(int i) {
            if (i == 1) {
                return LEAVE;
            }
            if (i == 2) {
                return MEETING_START;
            }
            if (i != 3) {
                return UNKNOWN;
            }
            return HEARTBEAT_STOP;
        }

        private LeaveReason(int i) {
            this.value = i;
        }
    }
}
