package com.bytedance.ee.util.url;

import android.text.TextUtils;
import com.bytedance.ee.log.C13479a;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/util/url/UrlRouteReportParam;", "", "()V", "EventID_LINK_CLICKED", "", "ParamKey_LOCATION", "ParamKey_SCENE", "TAG", "getCCMLinkParamsMap", "", "scene", "location", "util_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.util.u.a */
public final class UrlRouteReportParam {

    /* renamed from: a */
    public static final UrlRouteReportParam f35948a = new UrlRouteReportParam();

    private UrlRouteReportParam() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final Map<String, String> m55765a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "scene");
        Intrinsics.checkParameterIsNotNull(str2, "location");
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            C13479a.m54764b("RouteReport", "empty scene or location");
            return hashMap;
        }
        HashMap hashMap2 = hashMap;
        hashMap2.put("scene", str);
        hashMap2.put("location", str2);
        return hashMap2;
    }
}
