package com.ss.android.ugc.effectmanager.common.utils;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.C60549e;
import com.ss.android.ugc.effectmanager.common.p3053h.C60526d;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u0012\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0007¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/effectmanager/common/utils/EffectRequestUtil;", "", "()V", "addCommonParams", "Ljava/util/HashMap;", "", "configuration", "Lcom/ss/android/ugc/effectmanager/EffectConfiguration;", "buildDeviceInfo", "context", "Landroid/content/Context;", "isOnlineEnv", "", "effectConfiguration", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.common.h.i */
public final class EffectRequestUtil {

    /* renamed from: a */
    public static final EffectRequestUtil f151340a = new EffectRequestUtil();

    private EffectRequestUtil() {
    }

    /* renamed from: a */
    private final String m235258a(Context context) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = hashMap;
        hashMap2.put("platform", 1);
        try {
            hashMap.put("gl_version", Float.valueOf(Float.parseFloat(GPUUtils.f151347b.mo207262b())));
        } catch (Exception unused) {
        }
        hashMap2.put("gl_vendor", GPUUtils.f151347b.mo207263c());
        hashMap2.put("gl_renderer", GPUUtils.f151347b.mo207261a());
        hashMap2.put("gl_extension", GPUUtils.f151347b.mo207264d());
        if (context != null) {
            C60526d.C60528a c = C60526d.m235245c(context);
            Intrinsics.checkExpressionValueIsNotNull(c, "DeviceUtil.getMemoryInfo(context)");
            long a = c.mo207234a();
            if (a > 0) {
                hashMap2.put("memory_total_size", Long.valueOf(a));
            }
        }
        String a2 = C60526d.m235241a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "DeviceUtil.getCpuModel()");
        hashMap2.put("cpu_vendor", a2);
        String str = Build.VERSION.RELEASE;
        Intrinsics.checkExpressionValueIsNotNull(str, "Build.VERSION.RELEASE");
        hashMap2.put("os_version", str);
        String jSONObject = new JSONObject(hashMap2).toString();
        Intrinsics.checkExpressionValueIsNotNull(jSONObject, "JSONObject(deviceInfoMap).toString()");
        return jSONObject;
    }

    /* renamed from: a */
    public final HashMap<String, String> mo207238a(C60549e eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "configuration");
        HashMap<String, String> hashMap = new HashMap<>();
        if (!TextUtils.isEmpty(eVar.mo207318c())) {
            String c = eVar.mo207318c();
            Intrinsics.checkExpressionValueIsNotNull(c, "configuration.accessKey");
            hashMap.put("access_key", c);
        }
        if (!TextUtils.isEmpty(eVar.mo207321f())) {
            String f = eVar.mo207321f();
            Intrinsics.checkExpressionValueIsNotNull(f, "configuration.deviceId");
            hashMap.put("device_id", f);
        }
        if (!TextUtils.isEmpty(eVar.mo207324i())) {
            String i = eVar.mo207324i();
            Intrinsics.checkExpressionValueIsNotNull(i, "configuration.deviceType");
            hashMap.put("device_type", i);
        }
        if (!TextUtils.isEmpty(eVar.mo207323h())) {
            String h = eVar.mo207323h();
            Intrinsics.checkExpressionValueIsNotNull(h, "configuration.platform");
            hashMap.put("device_platform", h);
        }
        if (!TextUtils.isEmpty(eVar.mo207328m())) {
            String m = eVar.mo207328m();
            Intrinsics.checkExpressionValueIsNotNull(m, "configuration.region");
            hashMap.put("region", m);
        }
        if (!TextUtils.isEmpty(eVar.mo207319d())) {
            String d = eVar.mo207319d();
            Intrinsics.checkExpressionValueIsNotNull(d, "configuration.sdkVersion");
            hashMap.put("sdk_version", d);
        }
        if (!TextUtils.isEmpty(eVar.mo207320e())) {
            String e = eVar.mo207320e();
            Intrinsics.checkExpressionValueIsNotNull(e, "configuration.appVersion");
            hashMap.put("app_version", e);
        }
        if (!TextUtils.isEmpty(eVar.mo207322g())) {
            String g = eVar.mo207322g();
            Intrinsics.checkExpressionValueIsNotNull(g, "configuration.channel");
            hashMap.put("channel", g);
        }
        if (!TextUtils.isEmpty(eVar.mo207329n())) {
            String n = eVar.mo207329n();
            Intrinsics.checkExpressionValueIsNotNull(n, "configuration.appID");
            hashMap.put("aid", n);
        }
        if (!TextUtils.isEmpty(eVar.mo207330o())) {
            String o = eVar.mo207330o();
            Intrinsics.checkExpressionValueIsNotNull(o, "configuration.appLanguage");
            hashMap.put("app_language", o);
        }
        if (!C60525c.m235235a((Map) eVar.mo207337v())) {
            hashMap.putAll(eVar.mo207337v());
        }
        if (!TextUtils.isEmpty(eVar.mo207341z())) {
            String z = eVar.mo207341z();
            Intrinsics.checkExpressionValueIsNotNull(z, "configuration.gpuVersion");
            hashMap.put("gpu", z);
        }
        if (eVar.mo207313D() > 0) {
            hashMap.put("filter_type", String.valueOf(eVar.mo207313D()));
        }
        HashMap<String, String> hashMap2 = hashMap;
        hashMap2.put("platform_ab_params", String.valueOf(eVar.mo207310A()));
        hashMap2.put("platform_sdk_version", EPUtils.m235253a());
        hashMap2.put("device_info", m235258a(eVar.mo207311B()));
        return hashMap;
    }
}
