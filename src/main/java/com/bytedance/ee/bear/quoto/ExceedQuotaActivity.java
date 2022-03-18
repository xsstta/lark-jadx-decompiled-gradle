package com.bytedance.ee.bear.quoto;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.ee.bear.facade.common.BaseActivity;
import com.bytedance.ee.bear.quoto.p525b.AbstractC10561a;
import com.bytedance.ee.bear.quoto.p525b.C10562b;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;

public class ExceedQuotaActivity extends BaseActivity {

    /* renamed from: a */
    private AbstractC10561a f28333a;

    /* renamed from: b */
    private int f28334b;

    /* renamed from: b */
    private void mo39967b() {
        this.f28333a.mo40009a(this);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    /* renamed from: a */
    private void mo39965a() {
        Intent intent = getIntent();
        if (intent != null) {
            int intExtra = intent.getIntExtra("exceed_quota_code", 0);
            this.f28334b = intExtra;
            this.f28333a = C10562b.m43768a(intent, intExtra);
            return;
        }
        C13479a.m54758a("ExceedQuotaActivity", "initData intent is null, finish activity");
        finish();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.BaseActivity
    /* renamed from: a */
    public void mo16851a(Bundle bundle) {
        super.mo16851a(bundle);
        setContentView(R.layout.activity_exceed_quota);
        mo39965a();
        mo39967b();
    }
}
