package com.bytedance.ee.bear.drive.common.mvpframeworks.app.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.ee.bear.drive.common.mvpframeworks.base.mvp.AbstractC6908d;
import com.bytedance.ee.bear.drive.common.mvpframeworks.base.mvp.AbstractC6909e;

public abstract class DriveAbsMvpActivity<P extends AbstractC6908d> extends DriveAbsBaseActivity implements AbstractC6909e {

    /* renamed from: a */
    private P f18674a;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract P mo25859b(Context context);

    /* renamed from: l */
    public P mo27140l() {
        return this.f18674a;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.activity.DriveAbsBaseActivity
    /* renamed from: j */
    public final void mo27138j() {
        if (this.f18674a == null) {
            this.f18674a = mo25859b(this);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.LifeCycleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        super.onDestroy();
        P p = this.f18674a;
        if (p != null) {
            p.mo25893f();
            this.f18674a.mo26654b();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onPause() {
        super.onPause();
        P p = this.f18674a;
        if (p != null) {
            p.mo27150i();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onResume() {
        super.onResume();
        P p = this.f18674a;
        if (p != null) {
            p.mo27149h();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStart() {
        super.onStart();
        P p = this.f18674a;
        if (p != null) {
            p.mo27148g();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        super.onStop();
        P p = this.f18674a;
        if (p != null) {
            p.mo27151j();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        P p = this.f18674a;
        if (p != null) {
            p.mo27146a(bundle);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.activity.DriveAbsBaseActivity
    /* renamed from: c */
    public final void mo27137c(Bundle bundle) {
        if (this.f18674a == null) {
            this.f18674a = mo25859b(this);
        }
        this.f18674a.mo27147a(this);
        this.f18674a.mo25880a(getIntent().getExtras(), bundle);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity, com.bytedance.ee.bear.facade.common.BaseCommonActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        P p = this.f18674a;
        if (p != null) {
            p.mo27145a(i, i2, intent);
        }
    }
}
