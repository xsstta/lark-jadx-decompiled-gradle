package com.ss.android.lark.biz.im.api.param;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class IMConstants {

    @Retention(RetentionPolicy.SOURCE)
    public @interface CallSelectClickType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface DownloadFileScene {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FolderManagerFrom {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface MERGE_FORWARD_FROM {
    }

    public enum NetworkLevel {
        EXCELLENT(1),
        EVALUATING(2),
        WEAK(3),
        NET_UNAVAILABLE(4),
        SERVICE_UNAVAILABLE(5);
        
        private final int status;

        public int getValue() {
            return this.status;
        }

        public static NetworkLevel forNumber(int i) {
            if (i == 1) {
                return EXCELLENT;
            }
            if (i == 2) {
                return EVALUATING;
            }
            if (i == 3) {
                return WEAK;
            }
            if (i == 4) {
                return NET_UNAVAILABLE;
            }
            if (i != 5) {
                return EXCELLENT;
            }
            return SERVICE_UNAVAILABLE;
        }

        private NetworkLevel(int i) {
            this.status = i;
        }
    }
}
