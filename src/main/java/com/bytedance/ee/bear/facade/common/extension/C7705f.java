package com.bytedance.ee.bear.facade.common.extension;

import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.C0768a;
import com.bytedance.ee.bear.facade.common.C7661a;
import com.bytedance.ee.bear.widget.statusbar.C11789c;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.facade.common.extension.f */
public class C7705f extends C7661a {

    /* renamed from: a */
    private boolean f20819a = true;

    /* renamed from: c */
    private boolean f20820c = true;

    /* renamed from: d */
    private void m30818d() {
        mo30183b();
        mo30185c();
    }

    /* renamed from: b */
    public void mo30183b() {
        if (this.f20819a) {
            m30819d(R.color.bg_body);
        }
    }

    /* renamed from: c */
    public void mo30185c() {
        if (this.f20820c) {
            m30820e(R.color.bg_body);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo30182a(int i) {
        C11789c.m48865a((Activity) this.f20780b, i, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo30184b(int i) {
        C11789c.m48865a((Activity) this.f20780b, i, false);
    }

    /* renamed from: c */
    public void mo30186c(int i) {
        m30819d(i);
        m30820e(i);
    }

    public C7705f(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        m30818d();
    }

    /* renamed from: d */
    private void m30819d(int i) {
        int color = UIUtils.getColor(this.f20780b, i);
        if (C0768a.m3714b(-1, color) <= 3.0d) {
            mo30182a(color);
        } else {
            mo30184b(color);
        }
    }

    /* renamed from: e */
    private void m30820e(int i) {
        this.f20780b.getWindow().addFlags(Integer.MIN_VALUE);
        this.f20780b.getWindow().clearFlags(134217728);
        this.f20780b.getWindow().setNavigationBarColor(UIUtils.getColor(this.f20780b, i));
    }
}
