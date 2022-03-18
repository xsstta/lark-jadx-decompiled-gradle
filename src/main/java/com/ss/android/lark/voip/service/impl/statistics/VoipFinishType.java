package com.ss.android.lark.voip.service.impl.statistics;

import com.bytedance.common.utility.NetworkUtils;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.voip.C57977a;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\nH\u0007J \u0010\u0010\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004H\u0007J\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0018\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R*\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004`\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/voip/service/impl/statistics/VoipFinishType;", "", "()V", "TYPE_INITIATIVE", "", "TYPE_NETWORK_UNAVAILABLE", "TYPE_OTHER", "TYPE_SDK_ERROR", "conferenceFinishType", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "clearFinishType", "", "getConferenceFinishType", "id", "sendVoipFinishType", "isCaller", "", "finishType", "sendVoipHangup", "setConferenceFinishType", ShareHitPoint.f121869d, "voip_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.voip.service.impl.d.f */
public final class VoipFinishType {

    /* renamed from: a */
    public static final VoipFinishType f143054a = new VoipFinishType();

    /* renamed from: b */
    private static final HashMap<String, Integer> f143055b = new HashMap<>();

    private VoipFinishType() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m225596a() {
        f143055b.clear();
    }

    @JvmStatic
    /* renamed from: a */
    public static final int m225595a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Integer num = f143055b.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 100;
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m225598a(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        VoipHitPoint.m225629d(str, z);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m225597a(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        f143055b.put(str, Integer.valueOf(i));
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m225599a(String str, boolean z, int i) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        if (!NetworkUtils.isNetworkAvailable(C57977a.m224905c().getContext())) {
            i = 3;
        }
        VoipHitPoint.m225624b(str, z, i);
    }
}
