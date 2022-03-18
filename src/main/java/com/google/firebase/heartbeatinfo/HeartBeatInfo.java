package com.google.firebase.heartbeatinfo;

public interface HeartBeatInfo {
    /* renamed from: a */
    HeartBeat mo79223a(String str);

    public enum HeartBeat {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);
        
        private final int code;

        public int getCode() {
            return this.code;
        }

        private HeartBeat(int i) {
            this.code = i;
        }
    }
}
