package com.ss.android.lark.feed.app.banner.statistics;

import com.ss.android.lark.feed.C37262a;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/feed/app/banner/statistics/BannerHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.app.banner.b.a */
public final class BannerHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final Companion f95814a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/feed/app/banner/statistics/BannerHitPoint$Companion;", "Lcom/ss/android/lark/feed/app/banner/statistics/IBannerHitPoint;", "()V", "getAttribution", "", "sendGuideUpgradeBannerClick", "", "sendGuideUpgradeBannerClose", "sendGuideUpgradeBannerCloseTip", "sendGuideUpgradeBannerShow", "sendNotificationBannerDisappearEvent", "reason", "sendNotificationBannerOpenClickEvent", "sendNotificationBannerShowEvent", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.banner.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public void mo137159a() {
            Statistics.sendEvent("notification_enable_click");
        }

        /* renamed from: b */
        public void mo137161b() {
            Statistics.sendEvent("notification_open_reminder_show");
        }

        /* renamed from: g */
        private final String m146972g() {
            AbstractC38037a a = C37262a.m146726a();
            Intrinsics.checkExpressionValueIsNotNull(a, "FeedModule.getDependency()");
            AbstractC38037a.AbstractC38065y J = a.mo139163J();
            Intrinsics.checkExpressionValueIsNotNull(J, "FeedModule.getDependency().ugDependency");
            String a2 = J.mo139326a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "FeedModule.getDependency….ugDependency.attribution");
            return a2;
        }

        /* renamed from: c */
        public void mo137162c() {
            Statistics.sendEvent("guide_upgrade_banner_show", new JSONObject().put("ug_cold_scene", m146972g()));
        }

        /* renamed from: d */
        public void mo137163d() {
            Statistics.sendEvent("guide_upgrade_banner_click", new JSONObject().put("ug_cold_scene", m146972g()).put("action", "upgrade"));
        }

        /* renamed from: e */
        public void mo137164e() {
            Statistics.sendEvent("guide_upgrade_banner_click", new JSONObject().put("ug_cold_scene", m146972g()).put("action", "close"));
        }

        /* renamed from: f */
        public void mo137165f() {
            Statistics.sendEvent("guide_upgrade_banner_closetip", new JSONObject().put("ug_cold_scene", m146972g()));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public void mo137160a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "reason");
            Statistics.sendEvent("notification_open_reminder_disappear", new JSONObject().put("reason", str));
        }
    }
}
