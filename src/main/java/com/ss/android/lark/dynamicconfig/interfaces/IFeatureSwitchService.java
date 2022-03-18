package com.ss.android.lark.dynamicconfig.interfaces;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface IFeatureSwitchService {

    @Retention(RetentionPolicy.SOURCE)
    public @interface FeatureKey {
    }
}
