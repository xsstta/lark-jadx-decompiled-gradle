package com.ss.android.lark.biz.core.api;

public interface NetworkLevelListener {
    void onNetworkLevelChanged(NetworkLevel networkLevel);

    public enum NetworkLevel {
        EXCELLENT(1),
        EVALUATING(2),
        WEAK(3),
        NET_UNAVAILABLE(4),
        SERVICE_UNAVAILABLE(5),
        OFFLINE(6);
        
        private int status;

        public int getValue() {
            return this.status;
        }

        public static NetworkLevel forNumber(int i) {
            switch (i) {
                case 1:
                    return EXCELLENT;
                case 2:
                    return EVALUATING;
                case 3:
                    return WEAK;
                case 4:
                case 6:
                    return NET_UNAVAILABLE;
                case 5:
                    return SERVICE_UNAVAILABLE;
                default:
                    return EXCELLENT;
            }
        }

        private NetworkLevel(int i) {
            this.status = i;
        }
    }
}
