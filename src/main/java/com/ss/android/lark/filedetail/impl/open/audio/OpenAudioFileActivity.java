package com.ss.android.lark.filedetail.impl.open.audio;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import butterknife.ButterKnife;
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

public class OpenAudioFileActivity extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo140049a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo140050a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo140051a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m150675a(this, context);
    }

    /* renamed from: b */
    public void mo140052b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo140053c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m150671a(this, configuration);
    }

    public AssetManager getAssets() {
        return m150677c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m150672a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m150676b(this);
    }

    /* renamed from: a */
    public static Resources m150672a(OpenAudioFileActivity openAudioFileActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(openAudioFileActivity);
        }
        return openAudioFileActivity.mo140050a();
    }

    /* renamed from: c */
    public static AssetManager m150677c(OpenAudioFileActivity openAudioFileActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(openAudioFileActivity);
        }
        return openAudioFileActivity.mo140053c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_open_file);
        ButterKnife.bind(this);
        m150674a(getIntent().getExtras());
    }

    /* renamed from: b */
    public static void m150676b(OpenAudioFileActivity openAudioFileActivity) {
        openAudioFileActivity.mo140052b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            OpenAudioFileActivity openAudioFileActivity2 = openAudioFileActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    openAudioFileActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private void m150674a(Bundle bundle) {
        PlayAudioFragment playAudioFragment = new PlayAudioFragment();
        playAudioFragment.setArguments(bundle);
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.open_file_fg_layout, playAudioFragment);
        beginTransaction.commit();
    }

    /* renamed from: a */
    public static void m150675a(OpenAudioFileActivity openAudioFileActivity, Context context) {
        openAudioFileActivity.mo140051a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(openAudioFileActivity);
        }
    }

    /* renamed from: a */
    public static Context m150671a(OpenAudioFileActivity openAudioFileActivity, Configuration configuration) {
        Context a = openAudioFileActivity.mo140049a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public static void m150673a(Context context, OpenFileParams openFileParams) {
        if (openFileParams != null) {
            Bundle bundle = new Bundle();
            bundle.putSerializable("extra.open.params", openFileParams);
            if (DesktopUtil.m144301a(context)) {
                PlayAudioFragment playAudioFragment = new PlayAudioFragment();
                playAudioFragment.setArguments(bundle);
                C36512a.m144041a().mo134762a(playAudioFragment, new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134930b());
                return;
            }
            Intent intent = new Intent(context, OpenAudioFileActivity.class);
            intent.putExtras(bundle);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
        }
    }
}
