package com.ss.android.lark.dynamicconfig.interfaces;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface IFeatureConfigService {

    @Retention(RetentionPolicy.SOURCE)
    public @interface FeatureKey {
    }
}
