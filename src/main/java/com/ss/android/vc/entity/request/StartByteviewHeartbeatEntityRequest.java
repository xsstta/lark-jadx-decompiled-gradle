package com.ss.android.vc.entity.request;

public class StartByteviewHeartbeatEntityRequest {

    public enum ServiceType {
        UNKNOWN(0),
        VOIP(1),
        VC(2),
        VCLOBBY(3);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public int getValue() {
            return this.value;
        }

        public static ServiceType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return VOIP;
            }
            if (i == 2) {
                return VC;
            }
            if (i != 3) {
                return null;
            }
            return VCLOBBY;
        }

        private ServiceType(int i) {
            this.value = i;
        }
    }
}
