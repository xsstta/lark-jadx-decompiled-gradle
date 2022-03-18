package com.ss.android.vc.entity.request;

public class RegisterClientInfoEntityRequest {

    public enum SourceType {
        UNKNOWN(0),
        LONG_CONNECTION_LOSS(1),
        CRASHED_STARTUP(2),
        KILLED_STARTUP(3),
        DUAL_CHANNEL_POLL(4);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static SourceType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return LONG_CONNECTION_LOSS;
            }
            if (i == 2) {
                return CRASHED_STARTUP;
            }
            if (i == 3) {
                return KILLED_STARTUP;
            }
            if (i != 4) {
                return null;
            }
            return DUAL_CHANNEL_POLL;
        }

        private SourceType(int i) {
            this.value = i;
        }
    }
}
