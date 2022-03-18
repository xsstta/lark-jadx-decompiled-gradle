package com.ss.android.appcenter.business.activity.appaddv2;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.monitor.statistics.C27710b;
import com.ss.android.appcenter.common.base.FunctionActivity;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class AddAppActivity extends FunctionActivity {

    /* renamed from: a */
    private C27584a f68798a;

    /* renamed from: a */
    public Context mo98267a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m100675a(this, context);
    }

    /* renamed from: b */
    public void mo98270b(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: c */
    public Resources mo98271c() {
        return super.getResources();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m100672a(this, configuration);
    }

    /* renamed from: d */
    public void mo98273d() {
        super.onStop();
    }

    /* renamed from: e */
    public AssetManager mo98274e() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m100677c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m100673a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m100676b(this);
    }

    /* renamed from: f */
    private void m100678f() {
        C27584a aVar = (C27584a) aj.m5366a(this).mo6005a(C27584a.class);
        this.f68798a = aVar;
        aVar.getShowSearchFragmentLiveData().mo5923a(this, new AbstractC1178x<Boolean>() {
            /* class com.ss.android.appcenter.business.activity.appaddv2.AddAppActivity.C275831 */

            /* renamed from: a */
            public void onChanged(Boolean bool) {
                if (bool.booleanValue()) {
                    AddAppActivity.this.mo98269b();
                } else {
                    AddAppActivity.this.mo98268a();
                }
            }
        });
    }

    /* renamed from: b */
    public void mo98269b() {
        C28184h.m103250d("App_Add_Page", "showSearchFragment");
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C27596b bVar = (C27596b) supportFragmentManager.findFragmentByTag(C27596b.class.getSimpleName());
        C27603d dVar = (C27603d) supportFragmentManager.findFragmentByTag(C27603d.class.getSimpleName());
        if (bVar != null) {
            supportFragmentManager.beginTransaction().hide(bVar).commitAllowingStateLoss();
        }
        if (dVar == null) {
            supportFragmentManager.beginTransaction().add(R.id.container, C27603d.m100728a(), C27603d.class.getSimpleName()).commitAllowingStateLoss();
        } else if (dVar.isHidden()) {
            supportFragmentManager.beginTransaction().show(dVar).commitAllowingStateLoss();
        } else {
            C28184h.m103250d("App_Add_Page", "showSearchFragment->searchFragment is not hidden!");
        }
    }

    /* renamed from: a */
    public void mo98268a() {
        C28184h.m103250d("App_Add_Page", "showAddFragment");
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C27596b bVar = (C27596b) supportFragmentManager.findFragmentByTag(C27596b.class.getSimpleName());
        C27603d dVar = (C27603d) supportFragmentManager.findFragmentByTag(C27603d.class.getSimpleName());
        if (dVar != null) {
            supportFragmentManager.beginTransaction().hide(dVar).commitAllowingStateLoss();
        }
        if (bVar == null) {
            supportFragmentManager.beginTransaction().add(R.id.container, C27596b.m100704a(), C27596b.class.getSimpleName()).commitAllowingStateLoss();
        } else if (bVar.isHidden()) {
            supportFragmentManager.beginTransaction().show(bVar).commitAllowingStateLoss();
        } else {
            C28184h.m103250d("App_Add_Page", "showHistroyFragment->histroyFragment is not hidden!");
        }
    }

    /* renamed from: a */
    public static Resources m100673a(AddAppActivity addAppActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(addAppActivity);
        }
        return addAppActivity.mo98271c();
    }

    /* renamed from: c */
    public static AssetManager m100677c(AddAppActivity addAppActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(addAppActivity);
        }
        return addAppActivity.mo98274e();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.appcenter.common.base.BaseActivity, com.ss.android.appcenter.common.base.FunctionActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.workplace_addapp_activity);
        m100678f();
        mo98268a();
        C27710b.m101308l();
    }

    /* renamed from: b */
    public static void m100676b(AddAppActivity addAppActivity) {
        addAppActivity.mo98273d();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            AddAppActivity addAppActivity2 = addAppActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    addAppActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m100674a(Context context) {
        C28184h.m103250d("App_Add_Page", "startActivity");
        context.startActivity(new Intent(context, AddAppActivity.class));
    }

    /* renamed from: a */
    public static void m100675a(AddAppActivity addAppActivity, Context context) {
        addAppActivity.mo98270b(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(addAppActivity);
        }
    }

    /* renamed from: a */
    public static Context m100672a(AddAppActivity addAppActivity, Configuration configuration) {
        Context a = addAppActivity.mo98267a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
