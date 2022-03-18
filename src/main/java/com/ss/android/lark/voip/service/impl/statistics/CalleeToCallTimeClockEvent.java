package com.ss.android.lark.voip.service.impl.statistics;

import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0005H\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0006H\u0007J\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0006H\u0007R*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/voip/service/impl/statistics/CalleeToCallTimeClockEvent;", "", "()V", "calleeAcceptTime", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "getAcceptTime", "conferenceId", "sendDurationTime", "", "id", "duration", "setAcceptTime", "acceptTime", "voip_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.voip.service.impl.d.a */
public final class CalleeToCallTimeClockEvent {

    /* renamed from: a */
    public static final CalleeToCallTimeClockEvent f143045a = new CalleeToCallTimeClockEvent();

    /* renamed from: b */
    private static HashMap<String, Long> f143046b = new HashMap<>();

    private CalleeToCallTimeClockEvent() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final long m225581a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "conferenceId");
        Long l = f143046b.get(str);
        f143046b.remove(str);
        if (l != null) {
            return l.longValue();
        }
        return 0;
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m225583b(String str, long j) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        VoipHitPoint.m225603a(str, j);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m225582a(String str, long j) {
        Intrinsics.checkParameterIsNotNull(str, "conferenceId");
        f143046b.put(str, Long.valueOf(j));
    }
}
