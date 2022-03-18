package com.bytedance.ee.bear.facade.common;

import android.os.Bundle;
import com.larksuite.component.air.AirActivity;

public class LifeCycleActivity extends AirActivity implements AbstractC7717k {

    /* renamed from: a */
    private boolean f20778a;

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        super.onDestroy();
        this.f20778a = false;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f20778a = true;
    }
}
