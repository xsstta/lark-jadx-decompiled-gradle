package com.bytedance.ee.bear.facade.common.extension;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.facade.common.C7661a;
import com.bytedance.ee.bear.facade.common.extension.ActivityTitleBarReporter;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13608f;
import com.larksuite.suite.R;
import java.util.HashMap;
import java.util.Map;

public class ActivityTitleBarReporter extends C7661a implements LifecycleObserver {

    /* renamed from: a */
    public final AppCompatActivity f20813a;

    /* renamed from: c */
    private AbstractC5233x f20814c;

    /* renamed from: b */
    private void m30802b() {
        if (this.f20814c == null) {
            this.f20814c = C5234y.m21391b();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        this.f20813a.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.bytedance.ee.bear.facade.common.extension.ActivityTitleBarReporter.ViewTreeObserver$OnGlobalLayoutListenerC76991 */

            public void onGlobalLayout() {
                View decorView = ActivityTitleBarReporter.this.f20813a.getWindow().getDecorView();
                BaseTitleBar baseTitleBar = (BaseTitleBar) decorView.findViewWithTag("BaseTitleBar");
                if (baseTitleBar != null) {
                    decorView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    if (baseTitleBar.getLeftExtraClickListener() == null) {
                        baseTitleBar.setLeftExtraClickListener(new View.OnClickListener(baseTitleBar) {
                            /* class com.bytedance.ee.bear.facade.common.extension.$$Lambda$ActivityTitleBarReporter$1$00EcR14GV9fE7rHk9lFsUp3XXTk */
                            public final /* synthetic */ BaseTitleBar f$1;

                            {
                                this.f$1 = r2;
                            }

                            public final void onClick(View view) {
                                ActivityTitleBarReporter.ViewTreeObserver$OnGlobalLayoutListenerC76991.this.m30807a(this.f$1, view);
                            }
                        });
                    }
                    C13608f.m55249a(new Runnable(baseTitleBar) {
                        /* class com.bytedance.ee.bear.facade.common.extension.$$Lambda$ActivityTitleBarReporter$1$M0wCzAfvDYadOx1MHm9D3RsCTg */
                        public final /* synthetic */ BaseTitleBar f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            ActivityTitleBarReporter.ViewTreeObserver$OnGlobalLayoutListenerC76991.this.m30806a(this.f$1);
                        }
                    });
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m30806a(BaseTitleBar baseTitleBar) {
                ActivityTitleBarReporter.this.mo30177b(baseTitleBar);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m30807a(BaseTitleBar baseTitleBar, View view) {
                ActivityTitleBarReporter.this.mo30176a((View) baseTitleBar);
            }
        });
    }

    public ActivityTitleBarReporter(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        this.f20813a = appCompatActivity;
        appCompatActivity.getLifecycle().addObserver(this);
    }

    /* renamed from: c */
    private boolean m30803c(View view) {
        return Boolean.TRUE.equals(view.getTag(R.id.title_bar_report_view));
    }

    /* renamed from: b */
    public void mo30177b(View view) {
        if (!m30803c(view)) {
            m30802b();
            Map<String, String> a = m30801a(view.getTag(R.id.title_bar_common_params));
            this.f20814c.mo21084b("ccm_space_docs_topbar_view", a);
            C13479a.m54772d("ActivityTitleBarReporte", "reportTopBarViewEvent, params = " + a);
        }
    }

    /* renamed from: a */
    private Map<String, String> m30801a(Object obj) {
        Map map;
        HashMap hashMap = new HashMap();
        if (obj instanceof Map) {
            map = (Map) obj;
        } else {
            map = null;
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
                    hashMap.put((String) entry.getKey(), (String) entry.getValue());
                }
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public void mo30176a(View view) {
        m30802b();
        Object tag = view.getTag(R.id.title_bar_common_params);
        HashMap hashMap = new HashMap();
        hashMap.put("click", "back");
        hashMap.put("target", "none");
        hashMap.putAll(m30801a(tag));
        this.f20814c.mo21084b("ccm_space_docs_topbar_click", hashMap);
        C13479a.m54772d("ActivityTitleBarReporte", "reportTopBarClickBackEvent, params = " + hashMap);
    }
}
