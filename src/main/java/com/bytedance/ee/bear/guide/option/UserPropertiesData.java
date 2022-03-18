package com.bytedance.ee.bear.guide.option;

import com.bytedance.ee.util.io.NonProguard;
import java.util.Map;

public class UserPropertiesData implements NonProguard {
    private OnBoardingData ext_properties;

    static class ChannelData extends OnBoardingData {
        private Map<String, Boolean> from_channel;

        public Map<String, Boolean> getFrom_channel() {
            return this.from_channel;
        }

        public void setFrom_channel(Map<String, Boolean> map) {
            this.from_channel = map;
        }

        public ChannelData(Map<String, Boolean> map) {
            this.from_channel = map;
        }
    }

    /* access modifiers changed from: package-private */
    public static class OnBoardingData implements NonProguard {
        OnBoardingData() {
        }
    }

    static class SceneData extends OnBoardingData {
        private Map<String, Boolean> onboarding;

        public Map<String, Boolean> getOnboarding() {
            return this.onboarding;
        }

        public void setOnboarding(Map<String, Boolean> map) {
            this.onboarding = map;
        }

        public SceneData(Map<String, Boolean> map) {
            this.onboarding = map;
        }
    }

    static class UsedProductData extends OnBoardingData {
        private Map<String, Boolean> used_product;

        public Map<String, Boolean> getUsed_product() {
            return this.used_product;
        }

        public void setUsed_product(Map<String, Boolean> map) {
            this.used_product = map;
        }

        public UsedProductData(Map<String, Boolean> map) {
            this.used_product = map;
        }
    }

    public OnBoardingData getExt_properties() {
        return this.ext_properties;
    }

    public void setExt_properties(OnBoardingData onBoardingData) {
        this.ext_properties = onBoardingData;
    }

    public UserPropertiesData(OnBoardingData onBoardingData) {
        this.ext_properties = onBoardingData;
    }
}
