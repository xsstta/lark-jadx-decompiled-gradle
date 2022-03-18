package com.ss.android.lark.biz.core.api;

import java.io.Serializable;
import java.util.Collections;
import java.util.Map;

public class AppConfig implements Serializable {
    private Section mSection;

    public static class FeatureConfig implements Serializable {
        private boolean mIsOn = true;
        private String mTraits;

        public String getTraits() {
            return this.mTraits;
        }

        public boolean isOn() {
            return this.mIsOn;
        }

        public void setOn(boolean z) {
            this.mIsOn = z;
        }

        public void setTraits(String str) {
            this.mTraits = str;
        }
    }

    public static class Section implements Serializable {
        public Map<String, FeatureConfig> mFeatures;

        public Map<String, FeatureConfig> getFeatures() {
            return this.mFeatures;
        }

        public void setFeatures(Map<String, FeatureConfig> map) {
            this.mFeatures = map;
        }
    }

    public Section getSection() {
        return this.mSection;
    }

    public Map<String, FeatureConfig> getFeatureConfigMap() {
        if (!isValid()) {
            return Collections.EMPTY_MAP;
        }
        return this.mSection.getFeatures();
    }

    public boolean isValid() {
        Section section = this.mSection;
        if (section == null || section.getFeatures() == null) {
            return false;
        }
        return true;
    }

    public void setSection(Section section) {
        this.mSection = section;
    }

    public FeatureConfig getFeatureConfig(String str) {
        Map<String, FeatureConfig> features;
        Section section = this.mSection;
        if (section == null || (features = section.getFeatures()) == null || !features.containsKey(str)) {
            return null;
        }
        return features.get(str);
    }

    public boolean isOn(String str, boolean z) {
        Map<String, FeatureConfig> map;
        FeatureConfig featureConfig;
        Section section = this.mSection;
        if (section == null || (map = section.mFeatures) == null || (featureConfig = map.get(str)) == null) {
            return z;
        }
        return featureConfig.isOn();
    }
}
