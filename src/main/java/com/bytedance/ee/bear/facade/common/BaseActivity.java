package com.bytedance.ee.bear.facade.common;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.ee.bear.facade.common.extension.ActivityTitleBarReporter;
import com.bytedance.ee.bear.p288d.C5240a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.log.C13479a;

public abstract class BaseActivity extends BaseCommonActivity implements AbstractC7710h {

    /* renamed from: a */
    private C10929e f20771a;

    /* renamed from: b */
    private C10917c f20772b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16851a(Bundle bundle) {
    }

    /* renamed from: n */
    public C10917c mo30076n() {
        return this.f20772b;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        if (C10929e.f29412b.get()) {
            C10929e eVar = new C10929e();
            this.f20771a = eVar;
            this.f20772b = new C10917c(eVar);
            C5240a.AbstractC5241a a = C5240a.m21422a();
            if (a != null) {
                context = a.injectBaseContext(context);
            }
        }
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.bytedance.ee.bear.facade.common.LifeCycleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public final void onCreate(Bundle bundle) {
        mo22315b(bundle);
        mo30077a(new ActivityTitleBarReporter(this));
        if (bundle != null && this.f20771a == null) {
            bundle = null;
        }
        super.onCreate(bundle);
        if (this.f20771a != null) {
            mo16851a(bundle);
            return;
        }
        C13479a.m54757a("Services hasn't initialized! please call Services.init() first!");
        finish();
    }
}
