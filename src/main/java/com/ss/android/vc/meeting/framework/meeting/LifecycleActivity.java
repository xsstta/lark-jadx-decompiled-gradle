package com.ss.android.vc.meeting.framework.meeting;

import android.os.Bundle;
import com.ss.android.vc.common.base.BaseActivity;

public abstract class LifecycleActivity extends BaseActivity {

    /* renamed from: b */
    protected int f153546b;

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo212039g();

    public void finish() {
        super.finish();
        this.f153546b = 4;
        mo212039g();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.vc.common.base.BaseActivity
    public void onDestroy() {
        super.onDestroy();
        this.f153546b = 4;
        mo212039g();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onPause() {
        super.onPause();
        if (this.f153546b != 4) {
            this.f153546b = 3;
        }
        mo212039g();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onResume() {
        super.onResume();
        if (this.f153546b != 4) {
            this.f153546b = 2;
        }
        mo212039g();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.vc.common.base.BaseActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f153546b != 4) {
            this.f153546b = 1;
        }
        mo212039g();
    }
}
