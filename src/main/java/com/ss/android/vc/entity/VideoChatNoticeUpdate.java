package com.ss.android.vc.entity;

import java.io.Serializable;

public class VideoChatNoticeUpdate implements Serializable {
    public Action action;
    public String key;
    public String meetingId;
    public String pushSid;
    public int type;

    public enum Action {
        UNKNOWN(0),
        DISMISS(1);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Action valueOf(int i) {
            if (i == 1) {
                return DISMISS;
            }
            return UNKNOWN;
        }

        private Action(int i) {
            this.value = i;
        }
    }
}
