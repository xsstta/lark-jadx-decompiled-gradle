package com.bytedance.ee.bear.middleground.record.viewhistory;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.ee.bear.facade.common.BaseActivity;
import com.bytedance.ee.bear.middleground.record.C10115a;
import com.bytedance.ee.log.C13479a;

public class ViewHistoryActivity extends BaseActivity {

    /* renamed from: a */
    private final String f27391a = "ViewHistoryActivity";

    /* renamed from: b */
    private int f27392b;

    /* renamed from: c */
    private String f27393c;

    @Override // androidx.activity.ComponentActivity, com.bytedance.ee.bear.facade.common.BaseCommonActivity
    public void onBackPressed() {
        super.onBackPressed();
        C10115a.m42133a("basic", "ccm_space_docs_details_view");
    }

    /* renamed from: b */
    private void mo38566b() {
        getSupportFragmentManager().beginTransaction().replace(16908290, C10148d.m42210a(this.f27392b, this.f27393c)).commitAllowingStateLoss();
    }

    /* renamed from: a */
    private void mo38564a() {
        Intent intent = getIntent();
        if (getIntent() == null) {
            C13479a.m54764b("ViewHistoryActivity", "onDoCreate() intent == null");
            finish();
            return;
        }
        try {
            this.f27392b = intent.getIntExtra("TYPE", -1);
            this.f27393c = intent.getStringExtra("TOKEN");
        } catch (Exception e) {
            C13479a.m54759a("ViewHistoryActivity", "resolveIntent: ", e);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.BaseActivity
    /* renamed from: a */
    public void mo16851a(Bundle bundle) {
        super.mo16851a(bundle);
        mo38564a();
        mo38566b();
    }
}
