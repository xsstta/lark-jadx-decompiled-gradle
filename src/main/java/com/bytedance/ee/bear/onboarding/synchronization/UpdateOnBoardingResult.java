package com.bytedance.ee.bear.onboarding.synchronization;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.util.io.NonProguard;

public class UpdateOnBoardingResult extends NetService.Result<Data> implements NonProguard {

    public static class Data implements NonProguard {
        public String context;
        public boolean is_done;

        public String toString() {
            return "UpdateOnBoardingResult.Data{is_done=" + this.is_done + ", context='" + this.context + '\'' + '}';
        }
    }
}
