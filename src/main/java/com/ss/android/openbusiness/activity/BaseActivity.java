package com.ss.android.openbusiness.activity;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.openbusiness.C59480b;

public class BaseActivity extends BaseFragmentActivity {

    /* renamed from: a */
    public String f147658a = "BaseActivity";

    /* renamed from: b */
    private void mo202776b() {
        Resources resources = getResources();
        if (resources != null) {
            Configuration configuration = resources.getConfiguration();
            configuration.locale = C59480b.m230865a().mo144879e();
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo202773a() {
        Configuration configuration = getResources().getConfiguration();
        configuration.fontScale = 1.0f;
        getResources().updateConfiguration(configuration, null);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo202773a();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo202773a();
        mo202776b();
    }
}
