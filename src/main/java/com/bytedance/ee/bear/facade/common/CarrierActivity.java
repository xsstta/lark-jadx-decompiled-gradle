package com.bytedance.ee.bear.facade.common;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.ee.log.C13479a;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import com.larksuite.suite.R;

public class CarrierActivity extends BaseActivity {

    /* renamed from: a */
    protected Class<?> f20775a;

    /* renamed from: b */
    private C7667e f20776b;

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.BaseActivity
    /* renamed from: a */
    public void mo16851a(Bundle bundle) {
        super.mo16851a(bundle);
        setContentView(R.layout.facade_activity_carrier);
        mo30081a(getIntent());
        if (this.f20775a != null && this.f20776b != null) {
            mo30082c(bundle);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo30082c(Bundle bundle) {
        if (bundle == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.content, this.f20776b, this.f20775a.getName()).commitAllowingStateLoss();
        } else if (getSupportFragmentManager().findFragmentByTag(this.f20775a.getName()) == null) {
            finish();
        }
    }

    /* renamed from: a */
    public void mo30081a(Intent intent) {
        Object obj;
        if (intent == null || intent.getExtras() == null) {
            obj = null;
        } else {
            obj = intent.getExtras().get("class_fragment_content");
            Bundle a = m30689a(intent, "class_fragment_extras");
            if (obj instanceof Class) {
                Class<?> cls = (Class) obj;
                if (C7667e.class.isAssignableFrom(cls)) {
                    this.f20775a = cls;
                    try {
                        C7667e eVar = (C7667e) cls.newInstance();
                        this.f20776b = eVar;
                        eVar.setArguments(a);
                        return;
                    } catch (Exception e) {
                        C13479a.m54758a("CarrierActivity", "initialize content fragment error, msg: " + e.getMessage());
                    }
                }
            }
        }
        C13479a.m54758a("CarrierActivity", "parseIntent fail, invalid input. object: " + obj);
        finish();
    }

    /* renamed from: a */
    public static Bundle m30689a(Intent intent, String str) {
        Bundle bundleExtra = intent.getBundleExtra(str);
        Context context = BadParcelableCrashOptimizer.getContext();
        if (!(bundleExtra == null || context == null)) {
            bundleExtra.setClassLoader(context.getClassLoader());
        }
        return bundleExtra;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity, com.bytedance.ee.bear.facade.common.BaseCommonActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }
}
