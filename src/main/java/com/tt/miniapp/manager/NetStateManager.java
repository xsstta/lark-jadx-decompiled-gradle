package com.tt.miniapp.manager;

import java.util.ArrayList;
import java.util.List;

public class NetStateManager {

    /* renamed from: a */
    private NetworkType f167522a = NetworkType.UNKNOWN;

    /* renamed from: b */
    private List<Object> f167523b = new ArrayList();

    public enum NetworkType {
        UNKNOWN(-1),
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5);
        
        final int nativeInt;

        public int getValue() {
            return this.nativeInt;
        }

        public boolean isWifi() {
            if (this == WIFI) {
                return true;
            }
            return false;
        }

        public boolean isAvailable() {
            if (this == UNKNOWN || this == NONE) {
                return false;
            }
            return true;
        }

        private NetworkType(int i) {
            this.nativeInt = i;
        }
    }
}
