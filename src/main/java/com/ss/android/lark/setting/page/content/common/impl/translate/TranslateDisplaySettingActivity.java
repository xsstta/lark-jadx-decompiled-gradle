package com.ss.android.lark.setting.page.content.common.impl.translate;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import butterknife.ButterKnife;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.setting.page.content.common.dto.LanguageInfo;
import com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54279c;
import com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54292g;
import com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54297h;
import com.ss.android.lark.setting.page.content.common.impl.translate.mvp.TranslateDisplaySettingView;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class TranslateDisplaySettingActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private C54292g f134231a;

    /* renamed from: b */
    private final C54279c.AbstractC54280a f134232b = new C54279c.AbstractC54280a() {
        /* class com.ss.android.lark.setting.page.content.common.impl.translate.TranslateDisplaySettingActivity.C542231 */

        @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54279c.AbstractC54280a
        /* renamed from: a */
        public void mo185591a() {
            TranslateDisplaySettingActivity.this.finish();
        }

        @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54279c.AbstractC54280a
        /* renamed from: a */
        public void mo185592a(C54279c cVar) {
            ButterKnife.bind(cVar, TranslateDisplaySettingActivity.this);
        }
    };

    /* renamed from: a */
    public Context mo185583a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo185584a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo185585a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m210576a(this, context);
    }

    /* renamed from: b */
    public void mo185586b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo185587c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m210574a(this, configuration);
    }

    public AssetManager getAssets() {
        return m210578c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m210575a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m210577b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        this.f134231a.destroy();
    }

    /* renamed from: d */
    private void m210579d() {
        LanguageInfo languageInfo;
        Intent intent = getIntent();
        if (intent != null) {
            languageInfo = (LanguageInfo) intent.getSerializableExtra("extra_language_info");
        } else {
            languageInfo = null;
        }
        C54292g gVar = new C54292g(new C54297h(), new TranslateDisplaySettingView(this, this.f134232b), languageInfo);
        this.f134231a = gVar;
        gVar.create();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_setting_translate_display);
        m210579d();
    }

    public void openSpecificDisplaySetting(View view) {
        startActivity(new Intent(this, SpecificDisplaySettingActivity.class));
    }

    /* renamed from: a */
    public static Resources m210575a(TranslateDisplaySettingActivity translateDisplaySettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(translateDisplaySettingActivity);
        }
        return translateDisplaySettingActivity.mo185584a();
    }

    /* renamed from: c */
    public static AssetManager m210578c(TranslateDisplaySettingActivity translateDisplaySettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(translateDisplaySettingActivity);
        }
        return translateDisplaySettingActivity.mo185587c();
    }

    /* renamed from: b */
    public static void m210577b(TranslateDisplaySettingActivity translateDisplaySettingActivity) {
        translateDisplaySettingActivity.mo185586b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            TranslateDisplaySettingActivity translateDisplaySettingActivity2 = translateDisplaySettingActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    translateDisplaySettingActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m210576a(TranslateDisplaySettingActivity translateDisplaySettingActivity, Context context) {
        translateDisplaySettingActivity.mo185585a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(translateDisplaySettingActivity);
        }
    }

    /* renamed from: a */
    public static Context m210574a(TranslateDisplaySettingActivity translateDisplaySettingActivity, Configuration configuration) {
        Context a = translateDisplaySettingActivity.mo185583a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
