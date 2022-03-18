package com.ss.android.lark.voip.service.impl.statistics;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0007J \u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0007R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/voip/service/impl/statistics/KeypairFailEvent;", "", "()V", "hasRecorded", "", "getHasRecorded", "()Z", "setHasRecorded", "(Z)V", "clear", "", "report", "id", "", "isCaller", "obj", "Lorg/json/JSONObject;", "voip_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.voip.service.impl.d.c */
public final class KeypairFailEvent {

    /* renamed from: a */
    public static final KeypairFailEvent f143049a = new KeypairFailEvent();

    /* renamed from: b */
    private static boolean f143050b;

    @JvmStatic
    /* renamed from: a */
    public static final void m225586a() {
        f143050b = false;
    }

    private KeypairFailEvent() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m225587a(String str, boolean z, JSONObject jSONObject) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(jSONObject, "obj");
        if (!f143050b) {
            VoipHitPoint.m225616a(str, z, "packetconversionfailed", true, false, jSONObject);
            f143050b = true;
        }
    }
}
