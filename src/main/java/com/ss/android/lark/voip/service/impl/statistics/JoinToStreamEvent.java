package com.ss.android.lark.voip.service.impl.statistics;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\nH\u0007R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/voip/service/impl/statistics/JoinToStreamEvent;", "", "()V", "mStartTime", "", "getMStartTime", "()J", "setMStartTime", "(J)V", "end", "", "id", "", "isCaller", "", "start", "voip_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.voip.service.impl.d.b */
public final class JoinToStreamEvent {

    /* renamed from: a */
    public static final JoinToStreamEvent f143047a = new JoinToStreamEvent();

    /* renamed from: b */
    private static long f143048b;

    private JoinToStreamEvent() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m225584a() {
        f143048b = System.currentTimeMillis();
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m225585a(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        VoipHitPoint.m225611a(str, z, System.currentTimeMillis() - f143048b);
        f143048b = 0;
    }
}
