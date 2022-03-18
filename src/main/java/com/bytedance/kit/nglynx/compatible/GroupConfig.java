package com.bytedance.kit.nglynx.compatible;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/bytedance/kit/nglynx/compatible/GroupConfig;", "", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "", "cardConfigs", "", "Lcom/bytedance/kit/nglynx/compatible/CardConfig;", "(Ljava/lang/String;Ljava/util/Map;)V", "getCardConfigs", "()Ljava/util/Map;", "getVersion", "()Ljava/lang/String;", "x-lynx-kit_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.kit.nglynx.a.c */
public final class GroupConfig {

    /* renamed from: a */
    private final String f38537a;

    /* renamed from: b */
    private final Map<String, CardConfig> f38538b;

    /* renamed from: a */
    public final Map<String, CardConfig> mo53713a() {
        return this.f38538b;
    }

    public GroupConfig(String str, Map<String, CardConfig> map) {
        Intrinsics.checkParameterIsNotNull(str, HiAnalyticsConstant.HaKey.BI_KEY_VERSION);
        Intrinsics.checkParameterIsNotNull(map, "cardConfigs");
        this.f38537a = str;
        this.f38538b = map;
    }
}
