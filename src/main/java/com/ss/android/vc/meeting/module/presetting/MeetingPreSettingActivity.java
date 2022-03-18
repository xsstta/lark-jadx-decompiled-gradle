package com.ss.android.vc.meeting.module.presetting;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.vcxp.C63801c;

public class MeetingPreSettingActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private C62629b f157665a;

    /* renamed from: a */
    public Context mo216451a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo216452a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo216453a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m245015a(this, context);
    }

    /* renamed from: b */
    public void mo216454b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo216455c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m245013a(this, configuration);
    }

    public AssetManager getAssets() {
        return m245017c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m245014a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m245016b(this);
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        super.onBackPressed();
        C62629b bVar = this.f157665a;
        if (bVar != null) {
            bVar.mo216463a();
        }
    }

    /* renamed from: d */
    private void m245018d() {
        C62629b bVar = new C62629b();
        this.f157665a = bVar;
        bVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, this.f157665a, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* renamed from: a */
    public static Resources m245014a(MeetingPreSettingActivity meetingPreSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(meetingPreSettingActivity);
        }
        return meetingPreSettingActivity.mo216452a();
    }

    /* renamed from: c */
    public static AssetManager m245017c(MeetingPreSettingActivity meetingPreSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(meetingPreSettingActivity);
        }
        return meetingPreSettingActivity.mo216455c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        if (!C63801c.m250499a(this, bundle)) {
            finish();
            return;
        }
        super.onCreate(bundle);
        m245018d();
    }

    /* renamed from: b */
    public static void m245016b(MeetingPreSettingActivity meetingPreSettingActivity) {
        meetingPreSettingActivity.mo216454b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MeetingPreSettingActivity meetingPreSettingActivity2 = meetingPreSettingActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    meetingPreSettingActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m245015a(MeetingPreSettingActivity meetingPreSettingActivity, Context context) {
        meetingPreSettingActivity.mo216453a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(meetingPreSettingActivity);
        }
    }

    /* renamed from: a */
    public static Context m245013a(MeetingPreSettingActivity meetingPreSettingActivity, Configuration configuration) {
        Context a = meetingPreSettingActivity.mo216451a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
