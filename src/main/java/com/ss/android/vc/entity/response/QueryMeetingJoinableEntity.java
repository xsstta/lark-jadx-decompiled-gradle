package com.ss.android.vc.entity.response;

import java.io.Serializable;

public class QueryMeetingJoinableEntity implements Serializable {
    public Boolean is_joinable;
    public Reason reason;

    public enum Reason {
        UNKNOWN(0),
        LOCKED(1);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Reason fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i != 1) {
                return null;
            }
            return LOCKED;
        }

        private Reason(int i) {
            this.value = i;
        }
    }
}
