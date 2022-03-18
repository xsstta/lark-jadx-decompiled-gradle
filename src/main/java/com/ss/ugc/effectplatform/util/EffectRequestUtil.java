package com.ss.ugc.effectplatform.util;

import bytekn.foundation.utils.CollectionUtil;
import com.ss.ugc.effectplatform.EffectConfig;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b¨\u0006\f"}, d2 = {"Lcom/ss/ugc/effectplatform/util/EffectRequestUtil;", "", "()V", "addCommonParams", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "configuration", "Lcom/ss/ugc/effectplatform/EffectConfig;", "isModelOnlineEnv", "", "effectConfig", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.util.i */
public final class EffectRequestUtil {

    /* renamed from: a */
    public static final EffectRequestUtil f165111a = new EffectRequestUtil();

    private EffectRequestUtil() {
    }

    /* renamed from: a */
    public final HashMap<String, String> mo228311a(EffectConfig effectConfig) {
        Intrinsics.checkParameterIsNotNull(effectConfig, "configuration");
        HashMap<String, String> hashMap = new HashMap<>();
        if (!TextUtils.f165135a.mo228357a(effectConfig.mo227555b())) {
            HashMap<String, String> hashMap2 = hashMap;
            String b = effectConfig.mo227555b();
            if (b == null) {
                Intrinsics.throwNpe();
            }
            hashMap2.put("access_key", b);
        }
        if (!TextUtils.f165135a.mo228357a(effectConfig.mo227558e())) {
            HashMap<String, String> hashMap3 = hashMap;
            String e = effectConfig.mo227558e();
            if (e == null) {
                Intrinsics.throwNpe();
            }
            hashMap3.put("device_id", e);
        }
        if (!TextUtils.f165135a.mo228357a(effectConfig.mo227561h())) {
            HashMap<String, String> hashMap4 = hashMap;
            String h = effectConfig.mo227561h();
            if (h == null) {
                Intrinsics.throwNpe();
            }
            hashMap4.put("device_type", h);
        }
        if (!TextUtils.f165135a.mo228357a(effectConfig.mo227560g())) {
            HashMap<String, String> hashMap5 = hashMap;
            String g = effectConfig.mo227560g();
            if (g == null) {
                Intrinsics.throwNpe();
            }
            hashMap5.put("device_platform", g);
        }
        if (!TextUtils.f165135a.mo228357a(effectConfig.mo227563j())) {
            HashMap<String, String> hashMap6 = hashMap;
            String j = effectConfig.mo227563j();
            if (j == null) {
                Intrinsics.throwNpe();
            }
            hashMap6.put("region", j);
        }
        if (!TextUtils.f165135a.mo228357a(effectConfig.mo227556c())) {
            HashMap<String, String> hashMap7 = hashMap;
            String c = effectConfig.mo227556c();
            if (c == null) {
                Intrinsics.throwNpe();
            }
            hashMap7.put("sdk_version", c);
        }
        if (!TextUtils.f165135a.mo228357a(effectConfig.mo227557d())) {
            HashMap<String, String> hashMap8 = hashMap;
            String d = effectConfig.mo227557d();
            if (d == null) {
                Intrinsics.throwNpe();
            }
            hashMap8.put("app_version", d);
        }
        if (!TextUtils.f165135a.mo228357a(effectConfig.mo227559f())) {
            HashMap<String, String> hashMap9 = hashMap;
            String f = effectConfig.mo227559f();
            if (f == null) {
                Intrinsics.throwNpe();
            }
            hashMap9.put("channel", f);
        }
        if (!TextUtils.f165135a.mo228357a(effectConfig.mo227564k())) {
            HashMap<String, String> hashMap10 = hashMap;
            String k = effectConfig.mo227564k();
            if (k == null) {
                Intrinsics.throwNpe();
            }
            hashMap10.put("aid", k);
        }
        if (!TextUtils.f165135a.mo228357a(effectConfig.mo227565l())) {
            HashMap<String, String> hashMap11 = hashMap;
            String l = effectConfig.mo227565l();
            if (l == null) {
                Intrinsics.throwNpe();
            }
            hashMap11.put("app_language", l);
        }
        if (!CollectionUtil.f5763a.mo8669a(effectConfig.mo227566m())) {
            hashMap.putAll(effectConfig.mo227566m());
        }
        if (!TextUtils.f165135a.mo228357a(effectConfig.mo227577x())) {
            HashMap<String, String> hashMap12 = hashMap;
            String x = effectConfig.mo227577x();
            if (x == null) {
                Intrinsics.throwNpe();
            }
            hashMap12.put("gpu", x);
        }
        Integer K = effectConfig.mo227551K();
        if (K != null && K.intValue() > 0) {
            hashMap.put("filter_type", String.valueOf(effectConfig.mo227551K()));
        }
        String a = new DeviceInfoFetcher().mo228296a(effectConfig.mo227543C());
        if (a != null) {
            hashMap.put("device_info", a);
        }
        HashMap<String, String> hashMap13 = hashMap;
        hashMap13.put("platform_ab_params", String.valueOf(effectConfig.mo227569p()));
        String a2 = EffectPlatformAES.f165107a.mo228307a();
        if (a2 != null) {
            hashMap13.put("platform_sdk_version", a2);
        }
        return hashMap;
    }
}
