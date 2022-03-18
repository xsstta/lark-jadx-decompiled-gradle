package com.ss.android.appcenter.common.base;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;

public class BaseActivity extends BaseFragmentActivity {
    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo100273h() {
        Configuration configuration = getResources().getConfiguration();
        configuration.fontScale = 1.0f;
        getResources().updateConfiguration(configuration, null);
    }

    /* renamed from: a */
    private void mo98268a() {
        Resources resources;
        if (C27548m.m100547m().mo98218b() != null && (resources = getResources()) != null) {
            Configuration configuration = resources.getConfiguration();
            configuration.locale = C27548m.m100547m().mo98218b().mo98170a();
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo100273h();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo98268a();
        mo100273h();
    }
}
