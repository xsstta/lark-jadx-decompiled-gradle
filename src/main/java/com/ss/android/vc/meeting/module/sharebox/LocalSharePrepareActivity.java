package com.ss.android.vc.meeting.module.sharebox;

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
import com.ss.android.vc.meeting.module.base.C61426f;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class LocalSharePrepareActivity extends BaseActivity {

    /* renamed from: b */
    public String f158824b;

    /* renamed from: c */
    public String f158825c;

    /* renamed from: d */
    private LocalSharePreparePresenter f158826d;

    /* renamed from: e */
    private List<AbstractC61214a> f158827e = new CopyOnWriteArrayList();

    /* renamed from: a */
    public Context mo217740a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo217742a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.vc.common.base.BaseActivity
    public void attachBaseContext(Context context) {
        m246701a(this, context);
    }

    /* renamed from: c */
    public Resources mo217746c() {
        return super.getResources();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m246697a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo217748d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m246703c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m246702b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m246700a(this);
    }

    /* renamed from: b */
    public void mo217744b() {
        super.onStop();
        C60700b.m235851b("LocalSharePrepareActivity@", "[onStop]", "onStop");
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.activity_bottom_out);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.vc.common.base.BaseActivity
    public void onStart() {
        super.onStart();
        C60700b.m235851b("LocalSharePrepareActivity@", "[onStart]", "onStart");
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.vc.common.base.BaseActivity
    public void onDestroy() {
        C60700b.m235851b("LocalSharePrepareActivity@", "[onDestroy]", "onDestroy");
        LocalSharePreparePresenter kVar = this.f158826d;
        if (kVar != null) {
            kVar.destroy();
        }
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
        if (this.f158827e.size() > 0) {
            List<AbstractC61214a> list = this.f158827e;
            list.get(list.size() - 1).bS_();
            return;
        }
        C61426f.m239679a(getSupportFragmentManager());
    }

    /* renamed from: a */
    public void mo217741a() {
        C60700b.m235851b("LocalSharePrepareActivity@", "[initMVP]", "initMVP");
        LocalSharePreparePresenter kVar = this.f158826d;
        if (kVar != null) {
            kVar.destroy();
            this.f158826d = null;
        }
        LocalSharePreparePresenter kVar2 = new LocalSharePreparePresenter(this);
        this.f158826d = kVar2;
        kVar2.create();
    }

    /* renamed from: b */
    public void mo217745b(AbstractC61214a aVar) {
        this.f158827e.remove(aVar);
    }

    /* renamed from: b */
    public static Resources m246702b(LocalSharePrepareActivity localSharePrepareActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(localSharePrepareActivity);
        }
        return localSharePrepareActivity.mo217746c();
    }

    /* renamed from: c */
    public static AssetManager m246703c(LocalSharePrepareActivity localSharePrepareActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(localSharePrepareActivity);
        }
        return localSharePrepareActivity.mo217748d();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.vc.common.base.BaseActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C60700b.m235851b("LocalSharePrepareActivity@", "[onCreate]", "onCreate");
        overridePendingTransition(R.anim.vc_activity_bottom_in, R.anim.fix_black_screen_anim);
        getWindow().setSoftInputMode(16);
        m246699a(getIntent());
        setContentView(R.layout.activity_local_share_prepare);
        mo217741a();
    }

    /* renamed from: a */
    private void m246699a(Intent intent) {
        this.f158824b = intent.getStringExtra("extra_from_source");
        this.f158825c = intent.getStringExtra("param_env_id");
    }

    /* renamed from: a */
    public static void m246700a(LocalSharePrepareActivity localSharePrepareActivity) {
        localSharePrepareActivity.mo217744b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            LocalSharePrepareActivity localSharePrepareActivity2 = localSharePrepareActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    localSharePrepareActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public void mo217743a(AbstractC61214a aVar) {
        this.f158827e.add(aVar);
    }

    /* renamed from: a */
    public static void m246701a(LocalSharePrepareActivity localSharePrepareActivity, Context context) {
        localSharePrepareActivity.mo217742a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(localSharePrepareActivity);
        }
    }

    /* renamed from: a */
    public static Context m246697a(LocalSharePrepareActivity localSharePrepareActivity, Configuration configuration) {
        Context a = localSharePrepareActivity.mo217740a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public static void m246698a(Context context, String str, String str2) {
        C60700b.m235851b("LocalSharePrepareActivity@", "[launch]", "launch");
        Intent intent = new Intent(context, LocalSharePrepareActivity.class);
        intent.putExtra("extra_from_source", str);
        intent.putExtra("param_env_id", str2);
        context.startActivity(intent);
    }
}
