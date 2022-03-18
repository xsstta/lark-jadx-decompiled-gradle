package com.ss.android.vc.entity;

import com.ss.android.vc.net.service.VideoChatUser;
import java.io.Serializable;

public class VideoChatPrompt implements Serializable {
    private static final long serialVersionUID = 1;
    public Action action;
    public CalendarStartPrompt calendarStartPrompt;
    public String promptId;
    public String pushSid;
    public Type type;

    public static class CalendarStartPrompt implements Serializable {
        private static final long serialVersionUID = 1;
        public long eventStartTime;
        public String eventTitle;
        public String meetingId;
        public long promptCreateTime;
        public ByteviewUser startUser;
        public String uniqueId;
        public VideoChatUser videoChatUser;
    }

    public enum Action {
        UNKNOWN_ACTION(0),
        SHOW(1),
        DISMISS(2);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Action valueOf(int i) {
            return forNumber(i);
        }

        public static Action forNumber(int i) {
            if (i == 0) {
                return UNKNOWN_ACTION;
            }
            if (i == 1) {
                return SHOW;
            }
            if (i != 2) {
                return null;
            }
            return DISMISS;
        }

        private Action(int i) {
            this.value = i;
        }
    }

    public enum Type {
        UNKNOWN_TYPE(0),
        CALENDAR_START(1);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Type valueOf(int i) {
            return forNumber(i);
        }

        public static Type forNumber(int i) {
            if (i == 0) {
                return UNKNOWN_TYPE;
            }
            if (i != 1) {
                return null;
            }
            return CALENDAR_START;
        }

        private Type(int i) {
            this.value = i;
        }
    }
}
