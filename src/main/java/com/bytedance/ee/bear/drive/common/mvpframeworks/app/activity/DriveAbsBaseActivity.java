package com.bytedance.ee.bear.drive.common.mvpframeworks.app.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;

public abstract class DriveAbsBaseActivity extends DriveRootActivity {

    /* renamed from: a */
    private boolean f18673a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo25856a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo27136a(View view) {
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo25860b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo25861c();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo27137c(Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo25862d();

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract void mo27138j();

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo27139k() {
        this.f18673a = true;
    }

    /* access modifiers changed from: protected */
    public void q_() {
    }

    @Override // androidx.activity.ComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public void setContentView(int i) {
        throw new RuntimeException("You should init content view by getContentViewLayoutId()");
    }

    @Override // androidx.activity.ComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public void setContentView(View view) {
        throw new RuntimeException("You should init content view by getContentViewLayoutId()");
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.BaseActivity
    /* renamed from: a */
    public void mo16851a(Bundle bundle) {
        mo27138j();
        super.mo16851a(bundle);
        View a = mo27136a(LayoutInflater.from(this).inflate(mo25856a(), (ViewGroup) null));
        if (a != null && a.getId() == -1) {
            a.setId(R.id.content_view_wrapper);
        }
        super.setContentView(a);
        this.f18673a = false;
        q_();
        mo27137c(bundle);
        if (!this.f18673a) {
            mo25860b();
            if (!this.f18673a) {
                mo25861c();
                if (!this.f18673a) {
                    mo25862d();
                }
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.appcompat.app.AppCompatActivity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new RuntimeException("You should init content view by getContentViewLayoutId()");
    }
}
