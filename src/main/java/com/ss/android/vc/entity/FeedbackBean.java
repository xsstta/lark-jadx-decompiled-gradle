package com.ss.android.vc.entity;

public class FeedbackBean extends BaseFeedbackBean {
    public Network network;

    public enum Network {
        OTHER(0),
        DATA4G(1),
        WIFI(2),
        LAN(3);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Network valueOf(int i) {
            return fromNumber(i);
        }

        public static Network fromNumber(int i) {
            if (i == 0) {
                return OTHER;
            }
            if (i == 1) {
                return DATA4G;
            }
            if (i == 2) {
                return WIFI;
            }
            if (i != 3) {
                return null;
            }
            return LAN;
        }

        private Network(int i) {
            this.value = i;
        }
    }
}
