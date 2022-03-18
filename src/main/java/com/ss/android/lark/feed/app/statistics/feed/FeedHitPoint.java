package com.ss.android.lark.feed.app.statistics.feed;

import com.ss.android.lark.feed.app.filter.C37548b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0004H\u0007J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\b\u0010\u0013\u001a\u00020\rH\u0007J\b\u0010\u0014\u001a\u00020\rH\u0007J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0004H\u0007J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0004H\u0007J\b\u0010\u0018\u001a\u00020\rH\u0007J\b\u0010\u0019\u001a\u00020\rH\u0007J\b\u0010\u001a\u001a\u00020\rH\u0007J\b\u0010\u001b\u001a\u00020\rH\u0007J\b\u0010\u001c\u001a\u00020\rH\u0007J\b\u0010\u001d\u001a\u00020\rH\u0007J\b\u0010\u001e\u001a\u00020\rH\u0007J\b\u0010\u001f\u001a\u00020\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/lark/feed/app/statistics/feed/FeedHitPoint;", "", "()V", "CLICK", "", "CLICK_TYPE", "ESC", "FEED_GROUPING_EDIT_VIEW", "FEED_MAIN_VIEW", "LOG_TAG", "OPEN", "TARGET", "sendCompletedBoxView", "", "sendFeedChatClick", "feedId", "sendFeedDelayedPopupClick", "confirmed", "", "sendFeedDelayedPopupView", "sendFeedGroupingPClick", "sendFeedGroupingTabClick", "name", "sendFeedGroupingTabDoubleClick", "sendFeedGroupingTabSlide", "sendMeView", "sendNewTenantRefer", "sendNewTenantReward", "sendShowClickAvatarGuide", "sendShowNewTenantRefer", "sendShowNewTenantReward", "sendShowPickTenantGuideInFeed", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.app.statistics.feed.a */
public final class FeedHitPoint {

    /* renamed from: a */
    public static final FeedHitPoint f97027a = new FeedHitPoint();

    private FeedHitPoint() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m148861a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("enter_mode", "reward");
            Statistics.sendEvent("invite_tenant_enter_click", jSONObject);
        } catch (Throwable th) {
            Log.m165383e("FeedHitPoint", th.getMessage());
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m148864b() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("enter_mode", "refer");
            Statistics.sendEvent("invite_tenant_enter_click", jSONObject);
        } catch (Throwable th) {
            Log.m165383e("FeedHitPoint", th.getMessage());
        }
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m148866c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("enter_mode", "reward");
            Statistics.sendEvent("invite_tenant_enter_view", jSONObject);
        } catch (Throwable th) {
            Log.m165383e("FeedHitPoint", th.getMessage());
        }
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m148868d() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("enter_mode", "refer");
            Statistics.sendEvent("invite_tenant_enter_view", jSONObject);
        } catch (Throwable th) {
            Log.m165383e("FeedHitPoint", th.getMessage());
        }
    }

    @JvmStatic
    /* renamed from: e */
    public static final void m148869e() {
        try {
            Statistics.sendEvent("guide_new_team_show");
        } catch (Throwable th) {
            Log.m165383e("FeedHitPoint", th.getMessage());
        }
    }

    @JvmStatic
    /* renamed from: f */
    public static final void m148870f() {
        try {
            Statistics.sendEvent("feed_grouping_tab_slide");
        } catch (Throwable th) {
            Log.m165383e("FeedHitPoint", th.getMessage());
        }
    }

    @JvmStatic
    /* renamed from: g */
    public static final void m148871g() {
        try {
            Statistics.sendEvent("feed_grouping_PC_click");
        } catch (Throwable th) {
            Log.m165383e("FeedHitPoint", th.getMessage());
        }
    }

    @JvmStatic
    /* renamed from: h */
    public static final void m148872h() {
        try {
            Statistics.sendEvent("feed_delayed_popup_view");
        } catch (Throwable th) {
            Log.m165383e("FeedHitPoint", th.getMessage());
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m148863a(boolean z) {
        String str;
        String str2;
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                str = "open";
            } else {
                str = "esc";
            }
            JSONObject put = jSONObject.put("click", str);
            if (z) {
                str2 = "feed_grouping_edit_view";
            } else {
                str2 = "feed_main_view";
            }
            Statistics.sendEvent("feed_delayed_popup_click", put.put("target", str2).put("click_type", "click"));
        } catch (Throwable th) {
            Log.m165383e("FeedHitPoint", th.getMessage());
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m148865b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        try {
            JSONObject jSONObject = new JSONObject();
            Locale locale = Locale.ROOT;
            Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.ROOT");
            String lowerCase = str.toLowerCase(locale);
            Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            Statistics.sendEvent("feed_grouping_tab_click", jSONObject.put("feed_type", lowerCase));
        } catch (Throwable th) {
            Log.m165383e("FeedHitPoint", th.getMessage());
        }
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m148867c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        try {
            JSONObject jSONObject = new JSONObject();
            Locale locale = Locale.ROOT;
            Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.ROOT");
            String lowerCase = str.toLowerCase(locale);
            Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            Statistics.sendEvent("feed_grouping_tab_double_click", jSONObject.put("feed_type", lowerCase));
        } catch (Throwable th) {
            Log.m165383e("FeedHitPoint", th.getMessage());
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m148862a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "feedId");
        try {
            JSONObject put = new JSONObject().put("feed_id", str);
            C37548b a = C37548b.m147657a();
            Intrinsics.checkExpressionValueIsNotNull(a, "FilterStatusManager.inst()");
            String name = a.mo137792b().name();
            Locale locale = Locale.ROOT;
            Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.ROOT");
            if (name != null) {
                String lowerCase = name.toLowerCase(locale);
                Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                Statistics.sendEvent("feed_chat_click", put.put("feed_type", lowerCase));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        } catch (Throwable th) {
            Log.m165383e("FeedHitPoint", th.getMessage());
        }
    }
}
