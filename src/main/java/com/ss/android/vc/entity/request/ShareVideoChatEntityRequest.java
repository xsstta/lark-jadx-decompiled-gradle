package com.ss.android.vc.entity.request;

public class ShareVideoChatEntityRequest {

    public enum ShareFrom {
        UNKNOWN(0),
        FROM_QR_CODE(1),
        FROM_VC(2);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static ShareFrom fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return FROM_QR_CODE;
            }
            if (i != 2) {
                return null;
            }
            return FROM_VC;
        }

        private ShareFrom(int i) {
            this.value = i;
        }
    }
}
