package com.ss.android.vc.entity.response;

public class MeetingEntity {

    public enum Version {
        NONE_VERSION(0),
        V3(1);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public int getValue() {
            return this.value;
        }

        public static Version fromValue(int i) {
            if (i == 0) {
                return NONE_VERSION;
            }
            if (i != 1) {
                return null;
            }
            return V3;
        }

        private Version(int i) {
            this.value = i;
        }
    }
}
