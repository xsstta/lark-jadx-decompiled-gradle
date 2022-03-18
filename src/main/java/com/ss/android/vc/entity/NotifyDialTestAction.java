package com.ss.android.vc.entity;

public class NotifyDialTestAction {

    public enum NotifyAction {
        UNKNOWN(0),
        PULL_DIAL_TEST_SUITE(1),
        RESETTING(2);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public int getValue() {
            return this.value;
        }

        public static NotifyAction fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return PULL_DIAL_TEST_SUITE;
            }
            if (i != 2) {
                return null;
            }
            return RESETTING;
        }

        private NotifyAction(int i) {
            this.value = i;
        }
    }
}
