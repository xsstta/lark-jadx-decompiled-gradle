package com.bytedance.ee.bear.document.appsetting;

import com.bytedance.ee.util.io.NonProguard;
import java.util.List;

public class FeatureGatingKey implements NonProguard {
    private List<String> featureGatingKeys;

    public List<String> getFeatureGatingKeys() {
        return this.featureGatingKeys;
    }

    public void setFeatureGatingKeys(List<String> list) {
        this.featureGatingKeys = list;
    }
}
