package com.ss.android.vc.entity.response;

import com.ss.android.vc.entity.ChannelMeta;

public class PushGrootChannelStatusEntity {

    /* renamed from: a */
    public ChannelMeta f152609a;

    /* renamed from: b */
    public Status f152610b;

    public enum Status {
        CONNECTING(1),
        CONNECTED(2),
        UNALAILABLE(3),
        WILL_BE_CLOSED(4),
        CLOSED(5);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Status fromValue(int i) {
            if (i == 1) {
                return CONNECTING;
            }
            if (i == 2) {
                return CONNECTED;
            }
            if (i == 3) {
                return UNALAILABLE;
            }
            if (i == 4) {
                return WILL_BE_CLOSED;
            }
            if (i != 5) {
                return null;
            }
            return CLOSED;
        }

        private Status(int i) {
            this.value = i;
        }
    }
}
