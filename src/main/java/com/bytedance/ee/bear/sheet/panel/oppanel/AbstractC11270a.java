package com.bytedance.ee.bear.sheet.panel.oppanel;

import android.os.Bundle;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.sheet.panel.AbstractC11257a;
import com.bytedance.ee.bear.sheet.panel.AbstractC11261b;
import com.bytedance.ee.bear.sheet.panel.SheetItem;

/* renamed from: com.bytedance.ee.bear.sheet.panel.oppanel.a */
public abstract class AbstractC11270a extends AbstractC11257a<SheetItem> {

    /* renamed from: a */
    protected C11271b f30312a;

    /* renamed from: b */
    private long f30313b;

    /* renamed from: c */
    private long f30314c;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.sheet.panel.AbstractC11257a
    /* renamed from: a */
    public void mo42707a() {
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.sheet.panel.AbstractC11257a
    /* renamed from: b */
    public AbstractC11261b<SheetItem> mo42710b() {
        return this.f30312a;
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (getUserVisibleHint()) {
            mo43172e();
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f30312a = (C11271b) C4950k.m20474a(this, C11271b.class);
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        if (z) {
            this.f30313b = System.currentTimeMillis();
        } else {
            this.f30314c = System.currentTimeMillis();
        }
        if (isVisible() && !z && this.f30314c - this.f30313b > 200) {
            mo43172e();
        }
        super.setUserVisibleHint(z);
    }
}
