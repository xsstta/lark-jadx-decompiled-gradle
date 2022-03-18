package com.ss.android.vc.meeting.module.tab.detail;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.vc.common.base.BaseActivity;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.module.tab.detail.p3169a.C63241c;
import java.util.UUID;
import javax.annotation.Nullable;

public class VcTabDetailActivity extends BaseActivity {

    /* renamed from: b */
    private C63241c f159422b;

    /* renamed from: c */
    private final String f159423c = UUID.randomUUID().toString();

    /* renamed from: a */
    public Context mo218821a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo218823a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.vc.common.base.BaseActivity
    public void attachBaseContext(Context context) {
        m247623a(this, context);
    }

    /* renamed from: c */
    public Resources mo218825c() {
        return super.getResources();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m247620a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo218827d() {
        return super.getAssets();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.common.base.BaseActivity
    /* renamed from: e */
    public boolean mo208278e() {
        return false;
    }

    public AssetManager getAssets() {
        return m247625c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m247624b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m247622a(this);
    }

    /* renamed from: a */
    public String mo218822a() {
        return this.f159423c;
    }

    /* renamed from: b */
    public void mo218824b() {
        super.onStop();
        C60700b.m235851b("VideoChatTab_VcTabDetailActivity", "[onStop]", "onStop");
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.frame_right_out);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.vc.common.base.BaseActivity
    public void onDestroy() {
        C63241c cVar = this.f159422b;
        if (cVar != null) {
            cVar.destroy();
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.vc.common.base.BaseActivity
    public void onStart() {
        super.onStart();
        C60700b.m235851b("VideoChatTab_VcTabDetailActivity", "[onStart]", "onStart");
    }

    /* renamed from: b */
    public static Resources m247624b(VcTabDetailActivity vcTabDetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(vcTabDetailActivity);
        }
        return vcTabDetailActivity.mo218825c();
    }

    /* renamed from: c */
    public static AssetManager m247625c(VcTabDetailActivity vcTabDetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(vcTabDetailActivity);
        }
        return vcTabDetailActivity.mo218827d();
    }

    /* renamed from: a */
    public static void m247622a(VcTabDetailActivity vcTabDetailActivity) {
        vcTabDetailActivity.mo218824b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            VcTabDetailActivity vcTabDetailActivity2 = vcTabDetailActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    vcTabDetailActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.vc.common.base.BaseActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        supportRequestWindowFeature(1);
        overridePendingTransition(R.anim.activity_right_in, R.anim.vc_activity_stay);
        getWindow().setSoftInputMode(16);
        getWindow().clearFlags(1024);
        getWindow().addFlags(6291584);
        C63241c cVar = new C63241c(this, (VcTabDetailEntryParam) getIntent().getSerializableExtra("parameter_entry_data"));
        this.f159422b = cVar;
        cVar.create();
    }

    /* renamed from: a */
    public static void m247621a(Context context, @Nullable VcTabDetailEntryParam vcTabDetailEntryParam) {
        Intent intent = new Intent(context, VcTabDetailActivity.class);
        intent.putExtra("parameter_entry_data", vcTabDetailEntryParam);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public static void m247623a(VcTabDetailActivity vcTabDetailActivity, Context context) {
        vcTabDetailActivity.mo218823a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(vcTabDetailActivity);
        }
    }

    /* renamed from: a */
    public static Context m247620a(VcTabDetailActivity vcTabDetailActivity, Configuration configuration) {
        Context a = vcTabDetailActivity.mo218821a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
