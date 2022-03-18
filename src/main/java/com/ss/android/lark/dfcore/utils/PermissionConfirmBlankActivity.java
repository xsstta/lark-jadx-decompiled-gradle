package com.ss.android.lark.dfcore.utils;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.dfcore.p1801c.AbstractC36602a;
import com.ss.android.lark.dfcore.p1801c.C36605c;
import com.ss.android.lark.dfcore.p1802d.C36612a;
import com.ss.android.lark.dfcore.task.DynamicFeatureTask;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class PermissionConfirmBlankActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private DynamicFeatureTask f94229a;

    /* renamed from: a */
    public Context mo135073a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo135074a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo135075a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m144479a(this, context);
    }

    /* renamed from: b */
    public void mo135076b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo135077c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m144477a(this, configuration);
    }

    public AssetManager getAssets() {
        return m144481c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m144478a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public boolean isNeedLoginStatus() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m144480b(this);
    }

    /* renamed from: a */
    public static Resources m144478a(PermissionConfirmBlankActivity permissionConfirmBlankActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(permissionConfirmBlankActivity);
        }
        return permissionConfirmBlankActivity.mo135074a();
    }

    /* renamed from: c */
    public static AssetManager m144481c(PermissionConfirmBlankActivity permissionConfirmBlankActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(permissionConfirmBlankActivity);
        }
        return permissionConfirmBlankActivity.mo135077c();
    }

    /* renamed from: b */
    public static void m144480b(PermissionConfirmBlankActivity permissionConfirmBlankActivity) {
        permissionConfirmBlankActivity.mo135076b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            PermissionConfirmBlankActivity permissionConfirmBlankActivity2 = permissionConfirmBlankActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    permissionConfirmBlankActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m165389i("DFCore", "PermissionConfirmBlankActivity onCreate");
        AbstractC36602a b = C36605c.m144424a().mo135033b(getIntent().getStringExtra("module_name"));
        if (b == null) {
            finish();
            return;
        }
        this.f94229a = b.mo135023a();
        if (!b.mo135026a(this)) {
            finish();
        }
    }

    /* renamed from: a */
    public static void m144479a(PermissionConfirmBlankActivity permissionConfirmBlankActivity, Context context) {
        permissionConfirmBlankActivity.mo135075a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(permissionConfirmBlankActivity);
        }
    }

    /* renamed from: a */
    public static Context m144477a(PermissionConfirmBlankActivity permissionConfirmBlankActivity, Configuration configuration) {
        Context a = permissionConfirmBlankActivity.mo135073a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        finish();
        C36612a.m144446b(this.f94229a, i2);
        if (i != 8) {
            return;
        }
        if (i2 == -1) {
            Log.m165389i("DFCore", "startConfirmationDialogForResult: confirm button has been clicked!");
        } else {
            Log.m165389i("DFCore", "startConfirmationDialogForResult: cancel button has been clicked!");
        }
    }
}
