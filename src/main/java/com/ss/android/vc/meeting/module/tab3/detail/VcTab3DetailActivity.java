package com.ss.android.vc.meeting.module.tab3.detail;

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
import com.ss.android.vc.meeting.basedialog.FullScreen.AbstractC61214a;
import com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63355d;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.Nullable;

public class VcTab3DetailActivity extends BaseActivity {

    /* renamed from: b */
    private C63355d f159778b;

    /* renamed from: c */
    private final String f159779c = UUID.randomUUID().toString();

    /* renamed from: d */
    private List<AbstractC61214a> f159780d = new CopyOnWriteArrayList();

    /* renamed from: a */
    public Context mo219117a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo219119a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.vc.common.base.BaseActivity
    public void attachBaseContext(Context context) {
        m248060a(this, context);
    }

    /* renamed from: c */
    public Resources mo219123c() {
        return super.getResources();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m248057a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo219125d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m248062c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m248061b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m248059a(this);
    }

    /* renamed from: a */
    public String mo219118a() {
        return this.f159779c;
    }

    /* renamed from: b */
    public void mo219121b() {
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
        C63355d dVar = this.f159778b;
        if (dVar != null) {
            dVar.destroy();
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.vc.common.base.BaseActivity
    public void onStart() {
        super.onStart();
        C60700b.m235851b("VideoChatTab_VcTabDetailActivity", "[onStart]", "onStart");
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
        if (this.f159780d.size() > 0) {
            List<AbstractC61214a> list = this.f159780d;
            list.get(list.size() - 1).bS_();
            return;
        }
        super.onBackPressed();
    }

    /* renamed from: b */
    public void mo219122b(AbstractC61214a aVar) {
        this.f159780d.remove(aVar);
    }

    /* renamed from: b */
    public static Resources m248061b(VcTab3DetailActivity vcTab3DetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(vcTab3DetailActivity);
        }
        return vcTab3DetailActivity.mo219123c();
    }

    /* renamed from: c */
    public static AssetManager m248062c(VcTab3DetailActivity vcTab3DetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(vcTab3DetailActivity);
        }
        return vcTab3DetailActivity.mo219125d();
    }

    /* renamed from: a */
    public static void m248059a(VcTab3DetailActivity vcTab3DetailActivity) {
        vcTab3DetailActivity.mo219121b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            VcTab3DetailActivity vcTab3DetailActivity2 = vcTab3DetailActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    vcTab3DetailActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
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
        C63355d dVar = new C63355d(this, (VcTabDetailEntryParam) getIntent().getSerializableExtra("parameter_entry_data"));
        this.f159778b = dVar;
        dVar.create();
    }

    /* renamed from: a */
    public void mo219120a(AbstractC61214a aVar) {
        this.f159780d.add(aVar);
    }

    /* renamed from: a */
    public static void m248058a(Context context, @Nullable VcTabDetailEntryParam vcTabDetailEntryParam) {
        Intent intent = new Intent(context, VcTab3DetailActivity.class);
        intent.putExtra("parameter_entry_data", vcTabDetailEntryParam);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public static void m248060a(VcTab3DetailActivity vcTab3DetailActivity, Context context) {
        vcTab3DetailActivity.mo219119a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(vcTab3DetailActivity);
        }
    }

    /* renamed from: a */
    public static Context m248057a(VcTab3DetailActivity vcTab3DetailActivity, Configuration configuration) {
        Context a = vcTab3DetailActivity.mo219117a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
