package com.ss.android.lark.voip.service.impl.statistics;

import com.bytedance.common.utility.NetworkUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.voip.C57977a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0006H\u0007J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0006H\u0007J\b\u0010\u0017\u001a\u00020\u0012H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/voip/service/impl/statistics/OnCallToStreamEvent;", "", "()V", "TAG", "", "mFirstRemoteAudio", "", "getMFirstRemoteAudio", "()Z", "setMFirstRemoteAudio", "(Z)V", "mStartTime", "", "getMStartTime", "()J", "setMStartTime", "(J)V", "clear", "", "endVoip", "id", "isCaller", "sendOnFirstRemoteAudio", "start", "voip_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.voip.service.impl.d.d */
public final class OnCallToStreamEvent {

    /* renamed from: a */
    public static final OnCallToStreamEvent f143051a = new OnCallToStreamEvent();

    /* renamed from: b */
    private static long f143052b;

    /* renamed from: c */
    private static boolean f143053c;

    private OnCallToStreamEvent() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m225588a() {
        Log.m165389i("OnCallToStreamEvent", "[start]");
        f143052b = System.currentTimeMillis();
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m225590b() {
        Log.m165389i("OnCallToStreamEvent", "[clear]");
        f143052b = 0;
        f143053c = false;
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m225589a(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        if (f143052b > 0 && !f143053c) {
            long currentTimeMillis = System.currentTimeMillis() - f143052b;
            Log.m165389i("OnCallToStreamEvent", "[sendOnFirstRemoteAudio] time = " + currentTimeMillis);
            VoipHitPoint.m225613a(str, z, "audio_duration", currentTimeMillis);
            f143053c = true;
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m225591b(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        if (!NetworkUtils.isNetworkAvailable(C57977a.m224905c().getContext())) {
            Log.m165389i("OnCallToStreamEvent", "[endVoip] no network");
        } else if (f143052b > 0 && !f143053c) {
            Log.m165389i("OnCallToStreamEvent", "[endVoip] no mFirstRemoteAudio");
            VoipHitPoint.m225613a(str, z, "audio_duration", 1000000);
        }
    }
}
