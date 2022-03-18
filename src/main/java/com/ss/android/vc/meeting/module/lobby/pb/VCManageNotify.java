package com.ss.android.vc.meeting.module.lobby.pb;

import java.io.Serializable;
import java.util.List;

public class VCManageNotify implements Serializable {
    public List<VCLobbyParticipant> lobby_participants;
    public String meeting_id;
    public NotificationType notification_type;

    public enum NotificationType {
        UNKNOWN(0),
        MEETINGLOBBY(1);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public int getValue() {
            return this.value;
        }

        public static NotificationType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i != 1) {
                return null;
            }
            return MEETINGLOBBY;
        }

        private NotificationType(int i) {
            this.value = i;
        }
    }

    public String toString() {
        return "VCManageNotify{notification_type=" + this.notification_type + ", meeting_id='" + this.meeting_id + '\'' + ", lobby_participants=" + this.lobby_participants + '}';
    }
}
