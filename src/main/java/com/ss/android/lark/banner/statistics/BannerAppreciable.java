package com.ss.android.lark.banner.statistics;

import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.banner.statistics.UGAppreciable;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\f¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/banner/statistics/BannerAppreciable;", "Lcom/ss/android/lark/banner/statistics/UGAppreciable;", "()V", "bannerBizError", "", ShareHitPoint.f121869d, "", "getBiz", "Lcom/ss/android/lark/appreciablelib/Biz;", "getScene", "Lcom/ss/android/lark/appreciablelib/Scene;", "newFetchPoint", "Lcom/ss/android/lark/banner/statistics/UGAppreciable$NetPoint;", "newSetStatusPoint", "core_banner_banner_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.banner.h.b */
public final class BannerAppreciable extends UGAppreciable {

    /* renamed from: a */
    public static final BannerAppreciable f73690a = new BannerAppreciable();

    private BannerAppreciable() {
    }

    @Override // com.ss.android.lark.banner.statistics.UGAppreciable
    /* renamed from: a */
    public Biz mo104464a() {
        return Biz.UserGrowth;
    }

    @Override // com.ss.android.lark.banner.statistics.UGAppreciable
    /* renamed from: b */
    public Scene mo104466b() {
        return Scene.UGCenter;
    }

    /* renamed from: c */
    public final UGAppreciable.NetPoint mo104467c() {
        return new UGAppreciable.NetPoint(Event.ug_banner_fetch, this);
    }

    /* renamed from: d */
    public final UGAppreciable.NetPoint mo104468d() {
        return new UGAppreciable.NetPoint(Event.ug_banner_set_status, this);
    }

    /* renamed from: a */
    public final void mo104465a(String str) {
        Event event = Event.ug_banner_biz_error;
        if (str == null) {
            str = "";
        }
        UGAppreciable.m108614a(this, event, 0, null, null, null, MapsKt.mapOf(TuplesKt.to(ShareHitPoint.f121869d, str)), 28, null);
    }
}
