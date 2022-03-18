package com.bytedance.ee.bear.middleground.record.privacy;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.ee.bear.facade.common.BaseActivity;
import com.bytedance.ee.bear.facade.common.extension.C7705f;
import com.bytedance.ee.bear.middleground.record.C10115a;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;

public class PrivacyActivity extends BaseActivity {

    /* renamed from: a */
    private final String f27360a = "PrivacyActivity";

    /* renamed from: b */
    private int f27361b;

    /* renamed from: c */
    private String f27362c;

    /* renamed from: d */
    private String f27363d;

    @Override // androidx.activity.ComponentActivity, com.bytedance.ee.bear.facade.common.BaseCommonActivity
    public void onBackPressed() {
        super.onBackPressed();
        C10115a.m42132a(this.f27363d);
    }

    /* renamed from: b */
    private void mo38548b() {
        C10115a.m42131a();
        getSupportFragmentManager().beginTransaction().replace(16908290, C10135a.m42176a(this.f27361b, this.f27362c)).commitAllowingStateLoss();
    }

    /* renamed from: a */
    private void mo38546a() {
        Intent intent = getIntent();
        if (getIntent() == null) {
            C13479a.m54764b("PrivacyActivity", "onDoCreate() intent == null");
            finish();
            return;
        }
        try {
            this.f27361b = intent.getIntExtra("TYPE", -1);
            this.f27362c = intent.getStringExtra("TOKEN");
            this.f27363d = intent.getStringExtra("FROM");
        } catch (Exception e) {
            C13479a.m54759a("PrivacyActivity", "resolveIntent: ", e);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.BaseActivity
    /* renamed from: a */
    public void mo16851a(Bundle bundle) {
        super.mo16851a(bundle);
        mo30078b(R.color.bg_body_overlay);
        mo38546a();
        mo38548b();
    }

    @Override // com.bytedance.ee.bear.facade.common.BaseCommonActivity
    /* renamed from: b */
    public void mo30078b(int i) {
        C7705f fVar = (C7705f) mo17222a(C7705f.class);
        if (fVar != null) {
            fVar.mo30186c(i);
        }
    }
}
