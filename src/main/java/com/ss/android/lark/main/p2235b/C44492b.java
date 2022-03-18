package com.ss.android.lark.main.p2235b;

import android.app.Activity;
import android.util.Pair;
import android.view.View;
import com.larksuite.component.metriclogger.C24350k;
import com.larksuite.component.metriclogger_constants.domains.onboarding.tour.TourDomain;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.main.C44134a;
import com.ss.android.lark.main.app.tab.C44373s;
import com.ss.android.lark.main.app.tab.MainTab;
import com.ss.android.lark.widget.tab.MainTabItemView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.main.b.b */
public class C44492b {
    /* renamed from: a */
    public static void m176503a(Activity activity, IGetDataCallback<List<Pair<String, View>>> iGetDataCallback) {
        m176504a(activity, iGetDataCallback, 3);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m176505b(Activity activity, IGetDataCallback iGetDataCallback, int i) {
        m176504a(activity, iGetDataCallback, i - 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m176506c(Activity activity, IGetDataCallback iGetDataCallback, int i) {
        m176504a(activity, iGetDataCallback, i - 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m176507d(Activity activity, IGetDataCallback iGetDataCallback, int i) {
        m176504a(activity, iGetDataCallback, i - 1);
    }

    /* renamed from: a */
    private static void m176504a(Activity activity, IGetDataCallback<List<Pair<String, View>>> iGetDataCallback, int i) {
        View view = (View) C44373s.m176069a().mo157638b("conversation");
        if (!(view instanceof MainTabItemView) || ((MainTabItemView) view).isSelected()) {
            View a = C44134a.m174959a().mo133240c().mo133273a();
            if (a != null) {
                if (a.isAttachedToWindow()) {
                    int[] iArr = new int[2];
                    a.getLocationInWindow(iArr);
                    if (iArr[0] < 10) {
                        if (i > 0) {
                            a.postDelayed(new Runnable(activity, iGetDataCallback, i) {
                                /* class com.ss.android.lark.main.p2235b.$$Lambda$b$AN643avvAXBT6tp_xmpSr2PWs */
                                public final /* synthetic */ Activity f$0;
                                public final /* synthetic */ IGetDataCallback f$1;
                                public final /* synthetic */ int f$2;

                                {
                                    this.f$0 = r1;
                                    this.f$1 = r2;
                                    this.f$2 = r3;
                                }

                                public final void run() {
                                    C44492b.m176506c(this.f$0, this.f$1, this.f$2);
                                }
                            }, 660);
                            Log.m165389i("TabViewsFinder", "moreBtn location is incorrect, and retry at 2");
                            return;
                        }
                        Log.m165383e("TabViewsFinder", "moreBtn location is incorrect");
                    }
                } else if (i > 0) {
                    UICallbackExecutor.executeDelayed(new Runnable(activity, iGetDataCallback, i) {
                        /* class com.ss.android.lark.main.p2235b.$$Lambda$b$Kn836EmnOPJFra03WLoR9McqkOg */
                        public final /* synthetic */ Activity f$0;
                        public final /* synthetic */ IGetDataCallback f$1;
                        public final /* synthetic */ int f$2;

                        {
                            this.f$0 = r1;
                            this.f$1 = r2;
                            this.f$2 = r3;
                        }

                        public final void run() {
                            C44492b.m176507d(this.f$0, this.f$1, this.f$2);
                        }
                    }, 660);
                    C24350k.m88900a(TourDomain.f60069g).mo87079a();
                    Log.m165389i("TabViewsFinder", "moreBtn is not attached to window, and retry at 2");
                    return;
                } else {
                    Log.m165383e("TabViewsFinder", "moreBtn is not attached to window");
                }
                a = null;
            } else if (i > 0) {
                UICallbackExecutor.executeDelayed(new Runnable(activity, iGetDataCallback, i) {
                    /* class com.ss.android.lark.main.p2235b.$$Lambda$b$EnQZ8s2jFLFn14PD7C7XZpO6LvY */
                    public final /* synthetic */ Activity f$0;
                    public final /* synthetic */ IGetDataCallback f$1;
                    public final /* synthetic */ int f$2;

                    {
                        this.f$0 = r1;
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        C44492b.m176505b(this.f$0, this.f$1, this.f$2);
                    }
                }, 660);
                Log.m165389i("TabViewsFinder", "moreBtn not found, and retry at 2");
                return;
            } else {
                Log.m165389i("TabViewsFinder", "moreBtn not found");
            }
            View findViewById = activity.getWindow().getDecorView().findViewById(R.id.main_tab);
            if (!(findViewById instanceof MainTab)) {
                Log.m165383e("TabViewsFinder", "can not find MainTab by R.id.main_tab");
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(new ErrorResult("can not find MainTab by R.id.main_tab"));
                    return;
                }
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (a != null) {
                arrayList.add(new Pair<>("more_btn", a));
                Log.m165389i("TabViewsFinder", "find the moreBtn");
            }
            MainTab mainTab = (MainTab) findViewById;
            int childCount = mainTab.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = mainTab.getChildAt(i2);
                if (childAt instanceof MainTabItemView) {
                    arrayList.add(new Pair<>(String.valueOf(childAt.getTag(R.id.main_tab_sub_tab_tag)), childAt));
                }
            }
            if (iGetDataCallback != null) {
                Log.m165389i("TabViewsFinder", "onSuccess");
                iGetDataCallback.onSuccess(arrayList);
                return;
            }
            return;
        }
        Log.m165389i("TabViewsFinder", "feed tab not selected");
        if (iGetDataCallback != null) {
            iGetDataCallback.onError(new ErrorResult("feed tab not selected"));
        }
    }
}
