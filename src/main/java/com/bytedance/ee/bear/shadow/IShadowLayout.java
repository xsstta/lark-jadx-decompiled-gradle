package com.bytedance.ee.bear.shadow;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface IShadowLayout {

    @Retention(RetentionPolicy.SOURCE)
    public @interface HideRadiusSide {
    }
}
