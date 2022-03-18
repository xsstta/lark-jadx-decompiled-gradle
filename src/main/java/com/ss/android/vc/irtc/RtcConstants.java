package com.ss.android.vc.irtc;

public class RtcConstants {

    public enum RemoteUserPriority {
        LOW,
        MEDIUM,
        HIGH
    }

    public enum Status {
        NONE(0),
        JOINED(1),
        INTERRUPTED(2),
        LOSS(3),
        ERROR(4);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Status valueOf(int i) {
            return forNumber(i);
        }

        public static Status forNumber(int i) {
            if (i == 0) {
                return NONE;
            }
            if (i == 1) {
                return JOINED;
            }
            if (i == 2) {
                return INTERRUPTED;
            }
            if (i == 3) {
                return LOSS;
            }
            if (i != 4) {
                return null;
            }
            return ERROR;
        }

        private Status(int i) {
            this.value = i;
        }
    }
}
