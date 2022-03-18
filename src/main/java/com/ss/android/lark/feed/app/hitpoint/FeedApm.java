package com.ss.android.lark.feed.app.hitpoint;

import com.bytedance.apm.ApmAgent;
import com.ss.android.lark.feed.app.entity.FeedFilter;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import com.ss.android.lark.feed.app.filter.C37548b;
import com.ss.android.lark.feed.app.model.C37731d;
import com.ss.android.lark.feed.app.model.common.UpdateRecord;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0007J*\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J*\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/feed/app/hitpoint/FeedApm;", "", "()V", "KEY_FEED_MONITOR_BADGE", "", "KEY_FEED_NEXT_UNREAD_BADGE", "PARAM_KEY_CONTEXT_ID", "PARAM_KEY_LIST_BADGE", "PARAM_KEY_TAB", "PARAM_KEY_TOTAL_BADGE", "TAG", "sendFeedMonitorBadge", "", "feedFilter", "Lcom/ss/android/lark/feed/app/entity/FeedFilter;", "totalBadge", "", "listBadge", "contextId", "listTotalBadge", "noNextUnread", "", "sendFeedNoNextUnreadBadge", "CheckMonitorBadgeRunnable", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.app.a.a */
public final class FeedApm {

    /* renamed from: a */
    public static final FeedApm f95776a = new FeedApm();

    private FeedApm() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/feed/app/hitpoint/FeedApm$CheckMonitorBadgeRunnable;", "Ljava/lang/Runnable;", "feedFilter", "Lcom/ss/android/lark/feed/app/entity/FeedFilter;", "contextId", "", "noNextUnread", "", "(Lcom/ss/android/lark/feed/app/entity/FeedFilter;Ljava/lang/String;Z)V", "getContextId", "()Ljava/lang/String;", "getFeedFilter", "()Lcom/ss/android/lark/feed/app/entity/FeedFilter;", "run", "", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.a.a$a */
    public static final class CheckMonitorBadgeRunnable implements Runnable {

        /* renamed from: a */
        private final FeedFilter f95777a;

        /* renamed from: b */
        private final String f95778b;

        /* renamed from: c */
        private final boolean f95779c;

        public void run() {
            List<UIFeedCard> c;
            Log.m165379d("FeedApm", "CheckMonitorBadgeRunnable");
            try {
                FeedFilter feedFilter = this.f95777a;
                if (feedFilter != null) {
                    List<UIFeedCard> list = null;
                    int i = 0;
                    switch (C37288b.f95780a[feedFilter.ordinal()]) {
                        case 1:
                            UpdateRecord a = C37731d.m148488a().mo138394a(this.f95777a);
                            if (!(a == null || (c = a.mo138376c()) == null)) {
                                i = c.size();
                            }
                            FeedApm.f95776a.mo137115a(this.f95777a, i, this.f95778b, this.f95779c);
                            return;
                        case 2:
                            UpdateRecord a2 = C37731d.m148488a().mo138394a(this.f95777a);
                            if (a2 != null) {
                                list = a2.mo138376c();
                            }
                            if (list != null) {
                                for (UIFeedCard uIFeedCard : list) {
                                    if ((uIFeedCard instanceof FeedPreview) && ((FeedPreview) uIFeedCard).isRemind()) {
                                        i += ((FeedPreview) uIFeedCard).getAtInfoCount();
                                    }
                                }
                            }
                            FeedApm.f95776a.mo137115a(this.f95777a, i, this.f95778b, this.f95779c);
                            return;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                            UpdateRecord a3 = C37731d.m148488a().mo138394a(this.f95777a);
                            if (a3 != null) {
                                list = a3.mo138376c();
                            }
                            if (list != null) {
                                for (UIFeedCard uIFeedCard2 : list) {
                                    if ((uIFeedCard2 instanceof FeedPreview) && ((FeedPreview) uIFeedCard2).isRemind()) {
                                        i += ((FeedPreview) uIFeedCard2).getBadgeCount();
                                    }
                                }
                            }
                            FeedApm.f95776a.mo137115a(this.f95777a, i, this.f95778b, this.f95779c);
                            return;
                        default:
                            return;
                    }
                }
            } catch (Exception e) {
                Log.m165384e("FeedApm", "CheckMonitorBadgeRunnable", e);
            }
        }

        public CheckMonitorBadgeRunnable(FeedFilter feedFilter, String str, boolean z) {
            this.f95777a = feedFilter;
            this.f95778b = str;
            this.f95779c = z;
        }
    }

    /* renamed from: a */
    public final void mo137115a(FeedFilter feedFilter, int i, String str, boolean z) {
        int b = C37548b.m147657a().mo137791b(feedFilter);
        if (b >= 0 && b != i) {
            if (z) {
                m146900a(feedFilter, b, i, str);
            } else {
                m146901b(feedFilter, b, i, str);
            }
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m146900a(FeedFilter feedFilter, int i, int i2, String str) {
        Intrinsics.checkParameterIsNotNull(feedFilter, "feedFilter");
        try {
            Log.m165389i("FeedApm", "sendFeedNoNextUnreadBadge:" + feedFilter + ':' + i + ':' + i2 + ':' + str);
            JSONObject jSONObject = new JSONObject();
            String name = feedFilter.name();
            if (name != null) {
                String lowerCase = name.toLowerCase();
                Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
                jSONObject.put("tab", lowerCase);
                jSONObject.put("total_badge", i);
                jSONObject.put("list_badge", i2);
                jSONObject.put("context_id", str);
                ApmAgent.monitorEvent("feed_next_unread_badge", jSONObject, new JSONObject(), new JSONObject());
                Statistics.sendEvent("im_feed_next_unread_badge_dev", jSONObject);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        } catch (Exception e) {
            Log.m165384e("FeedApm", "sendFeedNoNextUnreadBadge", e);
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m146901b(FeedFilter feedFilter, int i, int i2, String str) {
        Intrinsics.checkParameterIsNotNull(feedFilter, "feedFilter");
        try {
            Log.m165389i("FeedApm", "sendFeedMonitorBadge:" + feedFilter + ':' + i + ':' + i2 + ':' + str);
            JSONObject jSONObject = new JSONObject();
            String name = feedFilter.name();
            if (name != null) {
                String lowerCase = name.toLowerCase();
                Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
                jSONObject.put("tab", lowerCase);
                jSONObject.put("total_badge", i);
                jSONObject.put("list_badge", i2);
                jSONObject.put("context_id", str);
                ApmAgent.monitorEvent("feed_monitor_badge", jSONObject, new JSONObject(), new JSONObject());
                Statistics.sendEvent("im_feed_monitor_badge_dev", jSONObject);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        } catch (Exception e) {
            Log.m165384e("FeedApm", "sendFeedMonitorBadge", e);
        }
    }
}
