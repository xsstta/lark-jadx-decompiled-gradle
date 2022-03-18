package com.bytedance.android.monitor.constant;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface ReportConst {

    @Retention(RetentionPolicy.SOURCE)
    public @interface ContainerType {
    }

    public interface Event {

        @Retention(RetentionPolicy.SOURCE)
        public @interface EventType {
        }
    }

    public interface FallbackPage {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Container {
        }
    }

    public interface GeckoInfo {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Container {
        }

        @Retention(RetentionPolicy.SOURCE)
        public @interface ResStatus {
        }

        @Retention(RetentionPolicy.SOURCE)
        public @interface ResType {
        }
    }

    public interface ResourceLoadFail {

        @Retention(RetentionPolicy.SOURCE)
        public @interface ResStatus {
        }
    }
}
