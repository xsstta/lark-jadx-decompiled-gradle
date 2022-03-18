package com.ss.android.vesdk;

import com.ss.android.vesdk.VEConfigCenter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class VEConfigKeys {

    @Retention(RetentionPolicy.SOURCE)
    public @interface ConfigKeyItem {
        VEConfigCenter.ConfigType configType();

        VEConfigCenter.DataType dataType();

        String defaultValue();

        String description();
    }
}
