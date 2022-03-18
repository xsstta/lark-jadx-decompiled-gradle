package com.ss.android.lark.profile.dto;

public class ProfileChatApplication {

    public enum Status {
        UNKNOWN_STATUS(0),
        PEDING(1),
        AGREED(2),
        REFUSED(3),
        DELETED(4),
        EXPIRED(5);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Status valueOf(int i) {
            return forNumber(i);
        }

        public static Status forNumber(int i) {
            if (i == 0) {
                return UNKNOWN_STATUS;
            }
            if (i == 1) {
                return PEDING;
            }
            if (i == 2) {
                return AGREED;
            }
            if (i == 3) {
                return REFUSED;
            }
            if (i == 4) {
                return DELETED;
            }
            if (i != 5) {
                return null;
            }
            return EXPIRED;
        }

        private Status(int i) {
            this.value = i;
        }
    }
}
