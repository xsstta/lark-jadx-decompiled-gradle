package com.ss.android.lark.littleapp;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.C12941a;
import com.bytedance.ee.larkbrand.permission.AbstractC13281a;
import com.bytedance.ee.larkbrand.permission.C13284b;
import com.bytedance.ee.larkbrand.permission.C13286d;
import com.bytedance.ee.larkbrand.permission.C13288e;
import com.bytedance.ee.larkbrand.permission.C13301k;
import com.tt.miniapp.manager.C66375a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.p3362a.p3364b.C67440a;
import com.tt.miniapphost.p3362a.p3365c.C67448a;
import com.tt.miniapphost.util.MiniAppProcessUtils;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.refer.common.base.AppType;

/* renamed from: com.ss.android.lark.littleapp.c */
public class ComponentCallbacks2C41313c extends FragmentManager.AbstractC1010b implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: e */
    private static volatile boolean f105091e;

    /* renamed from: a */
    private Activity f105092a;

    /* renamed from: b */
    private int f105093b;

    /* renamed from: c */
    private int f105094c;

    /* renamed from: d */
    private AbstractC13281a f105095d = new C13284b();

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        AppBrandLogger.m52829e("LifecycleLittleApp", "---onLowMemory");
    }

    /* renamed from: a */
    private IAppContext m163778a(Activity activity) {
        return C67448a.m262353a().mo234181b(C67440a.m262344a(AppType.GadgetAPP, C66375a.m259513a(activity.getIntent().getStringExtra("microapp_url")).appId));
    }

    public void onTrimMemory(int i) {
        AppBrandLogger.m52830i("LifecycleLittleApp", "---onTrimMemory---level==" + i);
    }

    private ComponentCallbacks2C41313c(Application application) {
        if (C12941a.m53329c(ProcessUtil.getCurProcessName(application))) {
            ((C13284b) this.f105095d).mo49521a(new C13286d());
            ((C13284b) this.f105095d).mo49521a(C13301k.m54149a());
        }
    }

    /* renamed from: a */
    public static void m163779a(Application application) {
        if (!f105091e) {
            f105091e = true;
            ComponentCallbacks2C41313c cVar = new ComponentCallbacks2C41313c(application);
            application.registerActivityLifecycleCallbacks(cVar);
            application.registerComponentCallbacks(cVar);
        }
    }

    public void onActivityPaused(Activity activity) {
        AppBrandLogger.m52830i("LifecycleLittleApp", activity.getClass().getSimpleName() + " onActivityPaused");
    }

    public void onActivityResumed(Activity activity) {
        AppBrandLogger.m52830i("LifecycleLittleApp", activity.getClass().getSimpleName() + " resumed");
        this.f105092a = activity;
    }

    public void onActivityStopped(Activity activity) {
        AppBrandLogger.m52830i("LifecycleLittleApp", activity.getClass().getSimpleName() + " onActivityStopped");
        this.f105092a = null;
        int i = this.f105094c - 1;
        this.f105094c = i;
        if (i == 0) {
            AppBrandLogger.m52830i("LifecycleLittleApp", "app change to background");
        }
    }

    public void onActivityDestroyed(Activity activity) {
        AppBrandLogger.m52830i("LifecycleLittleApp", activity.getClass().getSimpleName() + " onActivityDestroyed");
        String canonicalName = activity.getClass().getCanonicalName();
        if (canonicalName.substring(canonicalName.lastIndexOf(".") + 1).matches("MiniappTabActivity\\d")) {
            String stringExtra = activity.getIntent().getStringExtra("microapp_url");
            if (!TextUtils.isEmpty(stringExtra)) {
                this.f105095d.mo49519b(m163778a(activity));
                AppInfoEntity a = C66375a.m259513a(stringExtra);
                if (a != null) {
                    C13288e.m54115a().mo49526a(a.appId);
                }
            }
        }
    }

    public void onActivityStarted(Activity activity) {
        this.f105092a = activity;
        int i = this.f105094c;
        this.f105094c = i + 1;
        if (i == 0) {
            AppBrandLogger.m52830i("LifecycleLittleApp", "app change to forground");
        }
        String canonicalName = activity.getClass().getCanonicalName();
        if (canonicalName.substring(canonicalName.lastIndexOf(".") + 1).matches("MiniappTabActivity\\d")) {
            if (!TextUtils.isEmpty(activity.getIntent().getStringExtra("microapp_url"))) {
                IAppContext a = m163778a(activity);
                if (a != null) {
                    this.f105095d.mo49518a(a);
                } else {
                    AppBrandLogger.m52829e("LifecycleLittleApp", "onActivityStarted, appContext is null");
                }
            } else {
                return;
            }
        }
        this.f105093b++;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.f105092a = activity;
        if (MiniAppProcessUtils.isMicroAppActivity(activity)) {
            ProcessUtil.getCurProcessName(activity);
            if (TextUtils.isEmpty(activity.getIntent().getStringExtra("microapp_url"))) {
            }
        }
    }

    @Override // androidx.fragment.app.FragmentManager.AbstractC1010b
    /* renamed from: b */
    public void mo5404b(FragmentManager fragmentManager, Fragment fragment) {
        AppBrandLogger.m52830i("LifecycleLittleApp", fragment.getClass().getSimpleName() + " onFragmentResumed");
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        AppBrandLogger.m52830i("LifecycleLittleApp", activity.getClass().getSimpleName() + " onActivitySaveInstanceState");
    }
}
