package com.ss.android.lark.mine.impl.statistics.favourite;

import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mine/impl/statistics/favourite/FavouriteHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.statistics.b.a */
public final class FavouriteHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final Companion f115574a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mine/impl/statistics/favourite/FavouriteHitPoint$Companion;", "", "()V", "sendIconFavouriteClick", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.statistics.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final void mo161017a() {
            Statistics.sendEvent("icon_favourite_click");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
