package com.ss.android.lark.larkconfig.p2098a.p2099a;

import com.bytedance.lark.pb.basic.v1.AppConfigV2;
import com.ss.android.lark.biz.core.api.AppConfig;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.larkconfig.a.a.a */
public class C41129a {
    /* renamed from: a */
    public static AppConfig m163207a(AppConfigV2 appConfigV2) {
        AppConfigV2.Section section;
        Map<String, AppConfigV2.FeatureConf> map;
        AppConfig appConfig = new AppConfig();
        if (appConfigV2 == null || (section = appConfigV2.section) == null || (map = section.features) == null) {
            return appConfig;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, AppConfigV2.FeatureConf> entry : map.entrySet()) {
            String key = entry.getKey();
            AppConfigV2.FeatureConf value = entry.getValue();
            if (value != null) {
                AppConfig.FeatureConfig featureConfig = new AppConfig.FeatureConfig();
                featureConfig.setOn(value.isOn.booleanValue());
                featureConfig.setTraits(value.traits);
                hashMap.put(key, featureConfig);
            }
        }
        if (hashMap.isEmpty()) {
            return appConfig;
        }
        AppConfig.Section section2 = new AppConfig.Section();
        section2.setFeatures(hashMap);
        appConfig.setSection(section2);
        return appConfig;
    }
}
