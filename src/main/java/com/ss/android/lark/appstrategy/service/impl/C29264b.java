package com.ss.android.lark.appstrategy.service.impl;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.ee.appstrategy.AbstractC4152d;
import com.bytedance.ee.appstrategy.C4149b;
import com.bytedance.ee.appstrategy.C4153e;
import com.bytedance.ee.appstrategy.OpenAppStrategyDataWrapper;
import com.bytedance.ee.appstrategy.p240a.AbstractC4146d;
import com.bytedance.ee.appstrategy.p240a.AbstractC4147e;
import com.bytedance.ee.appstrategy.p240a.C4145c;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.webapp.v2.AbstractC13836d;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.C26171w;
import com.ss.android.lark.appstrategy.C29231a;
import com.ss.android.lark.appstrategy.service.AbstractC29242a;
import com.ss.android.lark.appstrategy.service.AbstractC29245b;
import com.ss.android.lark.log.Log;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.appstrategy.service.impl.b */
public class C29264b implements AbstractC29245b {

    /* renamed from: a */
    private static String f73271a;

    /* renamed from: b */
    private static String f73272b;

    /* renamed from: com.ss.android.lark.appstrategy.service.impl.b$a */
    public static final class C29270a {

        /* renamed from: a */
        public static final C29264b f73289a = new C29264b();
    }

    /* renamed from: a */
    public static C29264b m107591a() {
        return C29270a.f73289a;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m107592a(final Activity activity, C4145c cVar, final Context context) {
        C4153e.m17260a(activity, cVar, new AbstractC4146d() {
            /* class com.ss.android.lark.appstrategy.service.impl.C29264b.C292695 */

            @Override // com.bytedance.ee.appstrategy.p240a.AbstractC4146d
            /* renamed from: c */
            public void mo16249c(String str, String str2) {
                C29231a.m107507a().openApplyVisibleActivity(activity, str, str2);
            }

            @Override // com.bytedance.ee.appstrategy.p240a.AbstractC4146d
            /* renamed from: a */
            public void mo16245a(String str, String str2) {
                if (!activity.isDestroyed() && !activity.isFinishing()) {
                    activity.finish();
                }
            }

            @Override // com.bytedance.ee.appstrategy.p240a.AbstractC4146d
            /* renamed from: b */
            public void mo16247b(String str, String str2) {
                if (!activity.isDestroyed() && !activity.isFinishing()) {
                    activity.finish();
                }
            }

            @Override // com.bytedance.ee.appstrategy.p240a.AbstractC4146d
            /* renamed from: a */
            public void mo16246a(String str, String str2, String str3) {
                C29231a.m107507a().openUrl(context, str3);
            }

            @Override // com.bytedance.ee.appstrategy.p240a.AbstractC4146d
            /* renamed from: b */
            public void mo16248b(String str, String str2, String str3) {
                C29231a.m107507a().startChatActivityByChatterId(context, str3);
            }
        });
    }

    /* renamed from: a */
    private boolean m107594a(int i, Object obj, boolean z, Activity activity) {
        if (i != 0 || obj == null) {
            return false;
        }
        if (z) {
            return true;
        }
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo103740a(Context context, int i, String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            Log.m165379d("WebLifecycleListener", "dialog data v2 null");
            return;
        }
        try {
            C4145c a = C4145c.m17243a(new JSONObject(str));
            Activity checkedBrowserActivity = C29231a.m107507a().getCheckedBrowserActivity();
            WeakReference<AbstractC13836d> webAppFragment = C29231a.m107507a().getWebAppFragment(a.f12599a);
            if (i == 10000) {
                i = 0;
            }
            boolean a2 = m107594a(i, a, z, checkedBrowserActivity);
            if (!(webAppFragment == null || webAppFragment.get() == null || !webAppFragment.get().mo50991a())) {
                UICallbackExecutor.post(new Runnable() {
                    /* class com.ss.android.lark.appstrategy.service.impl.C29264b.RunnableC292684 */

                    public void run() {
                    }
                });
                checkedBrowserActivity = webAppFragment.get().mo50999c();
            }
            if (a2) {
                C26171w.m94675a(new Runnable(checkedBrowserActivity, a, context) {
                    /* class com.ss.android.lark.appstrategy.service.impl.$$Lambda$b$v7FIktt4HHPt9JlToI1zbzk_j5Y */
                    public final /* synthetic */ Activity f$1;
                    public final /* synthetic */ C4145c f$2;
                    public final /* synthetic */ Context f$3;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                    }

                    public final void run() {
                        C29264b.lambda$v7FIktt4HHPt9JlToI1zbzk_j5Y(C29264b.this, this.f$1, this.f$2, this.f$3);
                    }
                });
            }
        } catch (JSONException e) {
            Log.m165384e("WebLifecycleListener", "h5 recv", e);
        }
    }

    @Override // com.ss.android.lark.appstrategy.service.AbstractC29245b
    /* renamed from: a */
    public void mo103698a(WebView webView, final Context context, String str, Map<String, String> map) {
        final String str2 = map.get("app_id");
        final boolean parseBoolean = Boolean.parseBoolean(map.get("is_Tab_Mode"));
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && webView != null && webView.getContext() != null) {
            if (!str2.equals(f73271a) || !TextUtils.equals(f73272b, webView.getContext().toString())) {
                f73271a = str2;
                f73272b = webView.getContext().toString();
                final C29252a c = C29252a.m107549c();
                c.mo103690a(str2, true, (AbstractC4147e) new AbstractC4147e() {
                    /* class com.ss.android.lark.appstrategy.service.impl.C29264b.C292651 */

                    @Override // com.bytedance.ee.appstrategy.p240a.AbstractC4147e
                    public void onResult(String str) {
                        Log.m165379d("WebLifecycleListener", "h5 recv open app data=" + str);
                        try {
                            JSONObject jSONObject = new JSONObject(str);
                            int optInt = jSONObject.optInt(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, -1);
                            int optInt2 = jSONObject.optInt("code", -1);
                            String optString = jSONObject.optString("content");
                            if (optInt == OpenAppStrategyDataWrapper.DataVersion.V1.ordinal()) {
                                C29264b.this.mo103739a(context, optInt2, optString, str2, parseBoolean, c);
                            } else if (optInt == OpenAppStrategyDataWrapper.DataVersion.V2.ordinal()) {
                                C29264b.this.mo103740a(context, optInt2, optString, parseBoolean);
                            } else {
                                AppBrandLogger.m52831w("WebLifecycleListener", "open app data wrapper type undefined");
                            }
                        } catch (JSONException e) {
                            Log.m165384e("WebLifecycleListener", "open app data wrapper to json err", e);
                        }
                    }
                });
            }
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m107593a(final Activity activity, final C4149b bVar, final Context context, final AbstractC29242a aVar, final String str) {
        C4153e.m17261a(activity, bVar, new AbstractC4152d() {
            /* class com.ss.android.lark.appstrategy.service.impl.C29264b.C292673 */

            @Override // com.bytedance.ee.appstrategy.AbstractC4152d
            /* renamed from: a */
            public void mo16254a() {
                C29231a.m107507a().openApplyVisibleActivity(activity, str, bVar.f12610d);
            }

            @Override // com.bytedance.ee.appstrategy.AbstractC4152d
            /* renamed from: a */
            public void mo16255a(String str) {
                C29231a.m107507a().startChatActivityByChatterId(context, str);
            }

            @Override // com.bytedance.ee.appstrategy.AbstractC4152d
            /* renamed from: a */
            public void mo16257a(boolean z) {
                if (z && !activity.isDestroyed() && !activity.isFinishing()) {
                    activity.finish();
                }
            }

            @Override // com.bytedance.ee.appstrategy.AbstractC4152d
            /* renamed from: a */
            public void mo16256a(String str, String str2) {
                aVar.mo103689a(str, str, str2);
            }
        });
    }

    /* renamed from: a */
    public void mo103739a(Context context, int i, String str, String str2, boolean z, AbstractC29242a aVar) {
        if (TextUtils.isEmpty(str)) {
            Log.m165397w("WebLifecycleListener", "h5 v1 recv open app data content null");
            return;
        }
        C4149b a = C4149b.m17250a(str);
        Activity checkedBrowserActivity = C29231a.m107507a().getCheckedBrowserActivity();
        WeakReference<AbstractC13836d> webAppFragment = C29231a.m107507a().getWebAppFragment(str2);
        boolean a2 = m107594a(i, a, z, checkedBrowserActivity);
        if (!(webAppFragment == null || webAppFragment.get() == null || !webAppFragment.get().mo50991a())) {
            UICallbackExecutor.post(new Runnable() {
                /* class com.ss.android.lark.appstrategy.service.impl.C29264b.RunnableC292662 */

                public void run() {
                }
            });
            checkedBrowserActivity = webAppFragment.get().mo50999c();
        }
        if (a2) {
            C26171w.m94675a(new Runnable(checkedBrowserActivity, a, context, aVar, str2) {
                /* class com.ss.android.lark.appstrategy.service.impl.$$Lambda$b$Mue8R6ZDpV5ov4ymYZVXm31w1Fw */
                public final /* synthetic */ Activity f$1;
                public final /* synthetic */ C4149b f$2;
                public final /* synthetic */ Context f$3;
                public final /* synthetic */ AbstractC29242a f$4;
                public final /* synthetic */ String f$5;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                    this.f$5 = r6;
                }

                public final void run() {
                    C29264b.lambda$Mue8R6ZDpV5ov4ymYZVXm31w1Fw(C29264b.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5);
                }
            });
        }
    }
}
