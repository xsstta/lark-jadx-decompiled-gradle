package com.ss.ugc.effectplatform.p3244e;

import com.ss.ugc.effectplatform.EffectConfig;
import com.ss.ugc.effectplatform.model.Effect;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ss.ugc.effectplatform.e.b */
public final class C65510b {
    /* renamed from: a */
    public static /* synthetic */ void m256824a(IMonitorReport aVar, boolean z, EffectConfig effectConfig, String str, Map map, String str2, int i, Object obj) {
        if ((i & 16) != 0) {
            str2 = "";
        }
        m256823a(aVar, z, effectConfig, str, map, str2);
    }

    /* renamed from: a */
    public static final void m256817a(IMonitorReport aVar, boolean z, EffectConfig effectConfig, Effect effect, String str) {
        Intrinsics.checkParameterIsNotNull(aVar, "$this$mobEffectUnzip");
        Intrinsics.checkParameterIsNotNull(effectConfig, "config");
        Intrinsics.checkParameterIsNotNull(effect, "effect");
        Pair[] pairArr = new Pair[5];
        pairArr[0] = TuplesKt.to("effect_id", effect.getEffect_id());
        pairArr[1] = TuplesKt.to("effect_name", effect.getName());
        pairArr[2] = TuplesKt.to("effect_platform_type", 1);
        String k = effectConfig.mo227564k();
        if (k == null) {
            k = "";
        }
        pairArr[3] = TuplesKt.to("app_id", k);
        String b = effectConfig.mo227555b();
        if (b == null) {
            b = "";
        }
        pairArr[4] = TuplesKt.to("access_key", b);
        Map<String, ? extends Object> mutableMapOf = MapsKt.mutableMapOf(pairArr);
        if (!z) {
            if (str == null) {
                str = "";
            }
            mutableMapOf.put("error_msg", str);
        }
        aVar.mo227791a("effect_resource_unzip_success_rate", !z ? 1 : 0, mutableMapOf);
    }

    /* renamed from: a */
    public static final void m256819a(IMonitorReport aVar, boolean z, EffectConfig effectConfig, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(aVar, "$this$mobModelFind");
        Intrinsics.checkParameterIsNotNull(effectConfig, "config");
        Intrinsics.checkParameterIsNotNull(str, "modelName");
        Pair[] pairArr = new Pair[4];
        String k = effectConfig.mo227564k();
        if (k == null) {
            k = "";
        }
        pairArr[0] = TuplesKt.to("app_id", k);
        String b = effectConfig.mo227555b();
        if (b == null) {
            b = "";
        }
        pairArr[1] = TuplesKt.to("access_key", b);
        pairArr[2] = TuplesKt.to("effect_platform_type", 1);
        pairArr[3] = TuplesKt.to("model_name", str);
        Map<String, ? extends Object> mutableMapOf = MapsKt.mutableMapOf(pairArr);
        if (!z) {
            if (str2 == null) {
                str2 = "";
            }
            mutableMapOf.put("error_msg", str2);
        }
        aVar.mo227791a("find_resource_uri_success_rate", !z ? 1 : 0, mutableMapOf);
    }

    /* renamed from: a */
    public static final void m256816a(IMonitorReport aVar, String str, String str2, String str3, int i, String str4) {
        Intrinsics.checkParameterIsNotNull(aVar, "$this$mobDecryptError");
        Intrinsics.checkParameterIsNotNull(str3, "stackTrackString");
        Pair[] pairArr = new Pair[5];
        if (str == null) {
            str = "";
        }
        pairArr[0] = TuplesKt.to("content", str);
        if (str2 == null) {
            str2 = "";
        }
        pairArr[1] = TuplesKt.to("error_msg", str2);
        pairArr[2] = TuplesKt.to("stack_trace", str3);
        pairArr[3] = TuplesKt.to("effect_platform_type", Integer.valueOf(i));
        if (str4 == null) {
            str4 = "";
        }
        pairArr[4] = TuplesKt.to("platform_sdk_version", str4);
        aVar.mo227791a("effectplatform_decrypt_fail", 1, MapsKt.mutableMapOf(pairArr));
    }

    /* renamed from: c */
    public static final void m256829c(IMonitorReport aVar, boolean z, EffectConfig effectConfig, String str, Map<String, ? extends Object> map, String str2) {
        Intrinsics.checkParameterIsNotNull(aVar, "$this$mobEffectDownload");
        Intrinsics.checkParameterIsNotNull(effectConfig, "config");
        Intrinsics.checkParameterIsNotNull(str, "effectId");
        Intrinsics.checkParameterIsNotNull(map, "extraMap");
        Pair[] pairArr = new Pair[4];
        String k = effectConfig.mo227564k();
        if (k == null) {
            k = "";
        }
        pairArr[0] = TuplesKt.to("app_id", k);
        String b = effectConfig.mo227555b();
        if (b == null) {
            b = "";
        }
        pairArr[1] = TuplesKt.to("access_key", b);
        pairArr[2] = TuplesKt.to("effect_platform_type", 1);
        pairArr[3] = TuplesKt.to("effect_id", str);
        Map<String, ? extends Object> mutableMapOf = MapsKt.mutableMapOf(pairArr);
        mutableMapOf.putAll(map);
        if (!z) {
            if (str2 == null) {
                str2 = "";
            }
            mutableMapOf.put("error_msg", str2);
        }
        aVar.mo227791a("effect_download_success_rate", !z ? 1 : 0, mutableMapOf);
    }

    /* renamed from: b */
    public static final void m256827b(IMonitorReport aVar, boolean z, EffectConfig effectConfig, String str, Map<String, ? extends Object> map, String str2) {
        Intrinsics.checkParameterIsNotNull(aVar, "$this$mobEffectList");
        Intrinsics.checkParameterIsNotNull(effectConfig, "config");
        Intrinsics.checkParameterIsNotNull(str, "panel");
        Intrinsics.checkParameterIsNotNull(map, "extraMap");
        Pair[] pairArr = new Pair[4];
        String k = effectConfig.mo227564k();
        if (k == null) {
            k = "";
        }
        pairArr[0] = TuplesKt.to("app_id", k);
        String b = effectConfig.mo227555b();
        if (b == null) {
            b = "";
        }
        pairArr[1] = TuplesKt.to("access_key", b);
        pairArr[2] = TuplesKt.to("effect_platform_type", 1);
        pairArr[3] = TuplesKt.to("panel", str);
        Map<String, ? extends Object> mutableMapOf = MapsKt.mutableMapOf(pairArr);
        mutableMapOf.putAll(map);
        if (!z) {
            if (str2 == null) {
                str2 = "";
            }
            mutableMapOf.put("error_msg", str2);
        }
        aVar.mo227791a("effect_list_success_rate", !z ? 1 : 0, mutableMapOf);
    }

    /* renamed from: a */
    public static final void m256823a(IMonitorReport aVar, boolean z, EffectConfig effectConfig, String str, Map<String, ? extends Object> map, String str2) {
        Intrinsics.checkParameterIsNotNull(aVar, "$this$mobPanelInfo");
        Intrinsics.checkParameterIsNotNull(effectConfig, "config");
        Intrinsics.checkParameterIsNotNull(str, "panel");
        Intrinsics.checkParameterIsNotNull(map, "extraMap");
        Pair[] pairArr = new Pair[4];
        String k = effectConfig.mo227564k();
        if (k == null) {
            k = "";
        }
        pairArr[0] = TuplesKt.to("app_id", k);
        String b = effectConfig.mo227555b();
        if (b == null) {
            b = "";
        }
        pairArr[1] = TuplesKt.to("access_key", b);
        pairArr[2] = TuplesKt.to("effect_platform_type", 1);
        pairArr[3] = TuplesKt.to("panel", str);
        Map<String, ? extends Object> mutableMapOf = MapsKt.mutableMapOf(pairArr);
        mutableMapOf.putAll(map);
        if (!z) {
            if (str2 == null) {
                str2 = "";
            }
            mutableMapOf.put("error_msg", str2);
        }
        aVar.mo227791a("panel_info_success_rate", !z ? 1 : 0, mutableMapOf);
    }

    /* renamed from: a */
    public static /* synthetic */ void m256818a(IMonitorReport aVar, boolean z, EffectConfig effectConfig, Effect effect, String str, int i, Object obj) {
        if ((i & 8) != 0) {
            str = "";
        }
        m256817a(aVar, z, effectConfig, effect, str);
    }

    /* renamed from: a */
    public static /* synthetic */ void m256820a(IMonitorReport aVar, boolean z, EffectConfig effectConfig, String str, String str2, int i, Object obj) {
        if ((i & 8) != 0) {
            str2 = "";
        }
        m256819a(aVar, z, effectConfig, str, str2);
    }

    /* renamed from: b */
    public static final void m256825b(IMonitorReport aVar, boolean z, EffectConfig effectConfig, String str, String str2, Map<String, ? extends Object> map, String str3) {
        Intrinsics.checkParameterIsNotNull(aVar, "$this$mobModelDownload");
        Intrinsics.checkParameterIsNotNull(effectConfig, "config");
        Intrinsics.checkParameterIsNotNull(str, "modelName");
        Intrinsics.checkParameterIsNotNull(str2, "modelType");
        Intrinsics.checkParameterIsNotNull(map, "extraMap");
        Pair[] pairArr = new Pair[5];
        String k = effectConfig.mo227564k();
        if (k == null) {
            k = "";
        }
        pairArr[0] = TuplesKt.to("app_id", k);
        String b = effectConfig.mo227555b();
        if (b == null) {
            b = "";
        }
        pairArr[1] = TuplesKt.to("access_key", b);
        pairArr[2] = TuplesKt.to("effect_platform_type", 1);
        pairArr[3] = TuplesKt.to("resource_name", str);
        pairArr[4] = TuplesKt.to("resource_type", str2);
        Map<String, ? extends Object> mutableMapOf = MapsKt.mutableMapOf(pairArr);
        mutableMapOf.putAll(map);
        if (!z) {
            if (str3 == null) {
                str3 = "";
            }
            mutableMapOf.put("error_msg", str3);
        }
        aVar.mo227791a("resource_download_success_rate", !z ? 1 : 0, mutableMapOf);
    }

    /* renamed from: a */
    public static final void m256821a(IMonitorReport aVar, boolean z, EffectConfig effectConfig, String str, String str2, Map<String, ? extends Object> map, String str3) {
        Intrinsics.checkParameterIsNotNull(aVar, "$this$mobCategoryEffectList");
        Intrinsics.checkParameterIsNotNull(effectConfig, "config");
        Intrinsics.checkParameterIsNotNull(str, "panel");
        Intrinsics.checkParameterIsNotNull(str2, "category");
        Intrinsics.checkParameterIsNotNull(map, "extraMap");
        Pair[] pairArr = new Pair[5];
        String k = effectConfig.mo227564k();
        if (k == null) {
            k = "";
        }
        pairArr[0] = TuplesKt.to("app_id", k);
        String b = effectConfig.mo227555b();
        if (b == null) {
            b = "";
        }
        pairArr[1] = TuplesKt.to("access_key", b);
        pairArr[2] = TuplesKt.to("effect_platform_type", 1);
        pairArr[3] = TuplesKt.to("panel", str);
        pairArr[4] = TuplesKt.to("category", str2);
        Map<String, ? extends Object> mutableMapOf = MapsKt.mutableMapOf(pairArr);
        mutableMapOf.putAll(map);
        if (!z) {
            if (str3 == null) {
                str3 = "";
            }
            mutableMapOf.put("error_msg", str3);
        }
        aVar.mo227791a("category_list_success_rate", !z ? 1 : 0, mutableMapOf);
    }

    /* renamed from: b */
    public static /* synthetic */ void m256828b(IMonitorReport aVar, boolean z, EffectConfig effectConfig, String str, Map map, String str2, int i, Object obj) {
        if ((i & 16) != 0) {
            str2 = "";
        }
        m256827b(aVar, z, effectConfig, str, map, str2);
    }

    /* renamed from: c */
    public static /* synthetic */ void m256830c(IMonitorReport aVar, boolean z, EffectConfig effectConfig, String str, Map map, String str2, int i, Object obj) {
        if ((i & 16) != 0) {
            str2 = "";
        }
        m256829c(aVar, z, effectConfig, str, map, str2);
    }

    /* renamed from: b */
    public static /* synthetic */ void m256826b(IMonitorReport aVar, boolean z, EffectConfig effectConfig, String str, String str2, Map map, String str3, int i, Object obj) {
        if ((i & 32) != 0) {
            str3 = "";
        }
        m256825b(aVar, z, effectConfig, str, str2, map, str3);
    }

    /* renamed from: a */
    public static /* synthetic */ void m256822a(IMonitorReport aVar, boolean z, EffectConfig effectConfig, String str, String str2, Map map, String str3, int i, Object obj) {
        if ((i & 32) != 0) {
            str3 = "";
        }
        m256821a(aVar, z, effectConfig, str, str2, map, str3);
    }
}
