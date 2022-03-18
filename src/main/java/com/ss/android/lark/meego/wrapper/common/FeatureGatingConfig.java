package com.ss.android.lark.meego.wrapper.common;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\tR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/meego/wrapper/common/FeatureGatingConfig;", "", "()V", "FEATURE_KEY_MEEGO_ENTRANCE_APP_LINK", "", "featureGatingMap", "Ljava/util/HashMap;", "", "getFeatureGatingMap", "", "meego_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.meego.wrapper.a.b */
public final class FeatureGatingConfig {

    /* renamed from: a */
    public static final FeatureGatingConfig f113629a = new FeatureGatingConfig();

    /* renamed from: b */
    private static final HashMap<String, Boolean> f113630b;

    private FeatureGatingConfig() {
    }

    /* renamed from: a */
    public final Map<String, Boolean> mo158736a() {
        return f113630b;
    }

    static {
        HashMap<String, Boolean> hashMap = new HashMap<>();
        f113630b = hashMap;
        hashMap.put("lark.meego.entrance.applink", false);
    }
}
