package com.ss.android.vc.entity;

public class MeetingFeedbackBean extends BaseFeedbackBean {
    public Network network;

    public enum Network {
        OTHER(0),
        G3(1),
        G4(2),
        G5(3),
        WIFI(4),
        LAN(5);
        
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
                return G3;
            }
            if (i == 2) {
                return G4;
            }
            if (i == 3) {
                return G5;
            }
            if (i == 4) {
                return WIFI;
            }
            if (i != 5) {
                return null;
            }
            return LAN;
        }

        private Network(int i) {
            this.value = i;
        }
    }
}
