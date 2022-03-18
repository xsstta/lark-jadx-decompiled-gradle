package com.bytedance.ee.bear.guide.util;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.util.io.NonProguard;
import java.util.Map;

public class OnboardingNetworkDataPuller {

    public static class OnBoardingResult extends NetService.Result<Data> {

        public static class Data implements NonProguard {
            public Map<String, Long> firstlogin;
            public Map<String, Guide> guides;
        }

        public static class Guide implements NonProguard {
            public boolean is_done;
        }
    }
}
