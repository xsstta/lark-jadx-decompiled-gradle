package com.bytedance.ee.bear.widgets;

import android.view.View;
import com.bytedance.ee.log.C13479a;
import com.chad.library.adapter.base.BaseQuickAdapter;

/* renamed from: com.bytedance.ee.bear.widgets.f */
public abstract class AbstractC11840f implements BaseQuickAdapter.AbstractC20911a {

    /* renamed from: a */
    private long f31983a;

    /* renamed from: b */
    private long f31984b = 200;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo38328a(BaseQuickAdapter baseQuickAdapter, View view, int i);

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.AbstractC20911a
    public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        long currentTimeMillis = System.currentTimeMillis();
        this.f31983a = currentTimeMillis;
        if (currentTimeMillis - this.f31983a > this.f31984b) {
            mo38328a(baseQuickAdapter, view, i);
        } else {
            C13479a.m54775e("SafeClickListener", "So fast click , ignored !");
        }
    }
}
