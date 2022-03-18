package com.ss.android.lark.mine.impl.statistics.zen;

import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\b\u001a\u00020\u0005H\u0007J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0007H\u0007J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/mine/impl/statistics/zen/ZenHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "sendDndAdjust", "", "timeInterval", "", "sendDndClick", "sendDndClose", "remainTime", "sendDndOpen", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.statistics.d.a */
public final class ZenHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final ZenHitPoint f115577a = new ZenHitPoint();

    private ZenHitPoint() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m181481a() {
        Statistics.sendEvent("dnd_click");
    }
}
