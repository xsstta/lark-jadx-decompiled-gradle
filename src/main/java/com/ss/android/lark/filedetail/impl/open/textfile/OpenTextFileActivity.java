package com.ss.android.lark.filedetail.impl.open.textfile;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.filedetail.impl.open.OpenFileParams;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class OpenTextFileActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private C38328b f98395a;

    /* renamed from: a */
    public Context mo140104a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo140105a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo140106a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m150767a(this, context);
    }

    /* renamed from: b */
    public void mo140107b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo140108c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m150764a(this, configuration);
    }

    public AssetManager getAssets() {
        return m150769c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m150765a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m150768b(this);
    }

    /* renamed from: a */
    public static Resources m150765a(OpenTextFileActivity openTextFileActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(openTextFileActivity);
        }
        return openTextFileActivity.mo140105a();
    }

    /* renamed from: c */
    public static AssetManager m150769c(OpenTextFileActivity openTextFileActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(openTextFileActivity);
        }
        return openTextFileActivity.mo140108c();
    }

    /* renamed from: b */
    public static void m150768b(OpenTextFileActivity openTextFileActivity) {
        openTextFileActivity.mo140107b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            OpenTextFileActivity openTextFileActivity2 = openTextFileActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    openTextFileActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_fragment_container);
        this.f98395a = (C38328b) Fragment.instantiate(this, C38328b.class.getName(), parseArguments(getIntent()));
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, this.f98395a).commit();
    }

    /* renamed from: a */
    public static void m150767a(OpenTextFileActivity openTextFileActivity, Context context) {
        openTextFileActivity.mo140106a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(openTextFileActivity);
        }
    }

    /* renamed from: a */
    public static Context m150764a(OpenTextFileActivity openTextFileActivity, Configuration configuration) {
        Context a = openTextFileActivity.mo140104a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public static void m150766a(Context context, OpenFileParams openFileParams) {
        if (openFileParams != null) {
            Bundle bundle = new Bundle();
            bundle.putSerializable("extra.open.params", openFileParams);
            if (DesktopUtil.m144301a(context)) {
                C38328b bVar = new C38328b();
                bVar.setArguments(bundle);
                C36512a.m144041a().mo134762a(bVar, new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134930b());
                return;
            }
            Intent intent = new Intent(context, OpenTextFileActivity.class);
            intent.putExtras(bundle);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
        }
    }
}
