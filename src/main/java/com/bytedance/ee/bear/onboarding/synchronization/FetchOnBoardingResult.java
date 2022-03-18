package com.bytedance.ee.bear.onboarding.synchronization;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.util.io.NonProguard;
import java.util.Map;

public class FetchOnBoardingResult extends NetService.Result<Data> implements NonProguard {

    public static class Data implements NonProguard {
        public Map<String, Guide> guides;
        public String profile;
        public String type;

        public String toString() {
            return "Data{type='" + this.type + '\'' + ", guides=" + this.guides + ", profile='" + this.profile + '\'' + '}';
        }
    }

    public static class Guide implements NonProguard {
        public String context;
        public boolean is_done;

        public String toString() {
            return "Guide{is_done=" + this.is_done + ", context='" + this.context + '\'' + '}';
        }
    }
}
