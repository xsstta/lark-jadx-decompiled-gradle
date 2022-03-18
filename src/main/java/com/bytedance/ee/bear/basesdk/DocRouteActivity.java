package com.bytedance.ee.bear.basesdk;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.facade.common.LifeCycleActivity;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import java.io.Serializable;
import java.util.Map;
import org.koin.java.KoinJavaComponent;

public class DocRouteActivity extends LifeCycleActivity {

    /* renamed from: a */
    private AbstractC5233x f12957a;

    /* renamed from: b */
    private RouteBean f12958b;

    /* renamed from: c */
    private C10917c f12959c;

    /* renamed from: b */
    private void m17910b(String str) {
        C13479a.m54764b("DocRouteActivity", "navigation()...");
        ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17293a(str, this.f12958b);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ AbstractC68307f m17911c(String str) throws Exception {
        String v = C4511g.m18594d().mo17372v();
        if (v == null) {
            v = "";
        }
        return ((an) KoinJavaComponent.m268610a(an.class)).mo16396a(v);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        C13479a.m54764b("DocRouteActivity", "onNewIntent()...");
        if (intent != null) {
            intent.putExtra("doc_url", "");
        }
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m17907a(AbstractC68307f fVar) throws Exception {
        C13479a.m54764b("DocRouteActivity", "checkAndLogin " + fVar);
    }

    /* renamed from: a */
    private void m17908a(String str) {
        C13479a.m54764b("DocRouteActivity", "checkAndOpen()...");
        m17910b(str);
        getIntent().putExtra("doc_url", "");
        finish();
        AbstractC68307f.m265083a("").mo237985a(C11678b.m48480d()).mo238020d($$Lambda$DocRouteActivity$586jQbijApZfLDyEtKlWIRL3r5I.INSTANCE).mo238001b($$Lambda$DocRouteActivity$kthh1BugBeb1QckBXKsnsONu5ew.INSTANCE, $$Lambda$DocRouteActivity$wkSNl48wAWgx3XhTQoLbnOHWq6M.INSTANCE);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.bytedance.ee.bear.facade.common.LifeCycleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f12959c = new C10917c(new C10929e());
        C13479a.m54764b("DocRouteActivity", "onDoCreate: ");
        if (bundle != null) {
            C13479a.m54764b("DocRouteActivity", "onDoCreate: restore so finish");
            finish();
        } else if (!getIntent().getBooleanExtra("extra_sdk_has_inited", false)) {
            C13479a.m54764b("DocRouteActivity", "onDoCreate: doc have not init");
            finish();
        } else {
            String stringExtra = getIntent().getStringExtra("doc_url");
            if (TextUtils.isEmpty(stringExtra)) {
                C13479a.m54764b("DocRouteActivity", "onDoCreate: you have not pass url to extra");
                finish();
            } else if (!C10929e.f29412b.get()) {
                C13479a.m54764b("DocRouteActivity", "onDoCreate: you have not init service");
                finish();
            } else {
                AbstractC5233x b = C5234y.m21391b();
                this.f12957a = b;
                b.mo21077a("open_file");
                this.f12957a.mo21078a("open_file", "start_time", String.valueOf(SystemClock.uptimeMillis()));
                ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17288a(this);
                RouteBean routeBean = new RouteBean();
                this.f12958b = routeBean;
                routeBean.mo40614c(getIntent().getBooleanExtra("is_from_multi_task", false));
                this.f12958b.mo40616e(getIntent().getIntExtra("enter_anim", -1));
                this.f12958b.mo40618f(getIntent().getIntExtra("exit_anim", -1));
                this.f12958b.mo40611a(m17906a(getIntent(), "remind_binder"));
                this.f12958b.mo40617e(getIntent().getStringExtra("search_keyword"));
                this.f12958b.mo40621g(getIntent().getStringExtra("from"));
                this.f12958b.mo40622h(stringExtra);
                this.f12958b.mo40623i(getIntent().getStringExtra(ShareHitPoint.f121869d));
                this.f12958b.mo40619f(getIntent().getStringExtra("search_page_name"));
                Serializable serializableExtra = getIntent().getSerializableExtra("extra_data_map");
                if (serializableExtra != null) {
                    this.f12958b.mo40612a((Map) serializableExtra);
                }
                m17908a(stringExtra);
            }
        }
    }

    /* renamed from: a */
    public static Bundle m17906a(Intent intent, String str) {
        Bundle bundleExtra = intent.getBundleExtra(str);
        Context context = BadParcelableCrashOptimizer.getContext();
        if (!(bundleExtra == null || context == null)) {
            bundleExtra.setClassLoader(context.getClassLoader());
        }
        return bundleExtra;
    }
}
