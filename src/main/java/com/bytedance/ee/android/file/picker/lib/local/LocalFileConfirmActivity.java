package com.bytedance.ee.android.file.picker.lib.local;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.huawei.hms.android.HwBuildEx;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.ArrayList;
import java.util.List;

public class LocalFileConfirmActivity extends BaseFragmentActivity {

    /* renamed from: a */
    public static ArrayList<C4059a> f12300a = new ArrayList<>();

    /* renamed from: b */
    public static ArrayList<C4059a> f12301b = new ArrayList<>();

    /* renamed from: c */
    public static ArrayList<C4059a> f12302c = new ArrayList<>();

    /* renamed from: a */
    public Context mo15905a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo15906a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo15907a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m16875a(this, context);
    }

    /* renamed from: b */
    public void mo15908b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo15909c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m16872a(this, configuration);
    }

    public AssetManager getAssets() {
        return m16877c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m16873a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m16876b(this);
    }

    /* renamed from: e */
    private static void m16879e() {
        f12300a.clear();
        f12301b.clear();
        f12302c.clear();
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void finish() {
        super.finish();
        ActivityAnimationManager.doAnimation(this, new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_LEFT_OUT));
        m16879e();
    }

    /* renamed from: d */
    private void m16878d() {
        LocalFileConfirmFragment cVar = new LocalFileConfirmFragment();
        cVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(16908290, cVar);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* renamed from: a */
    public static Resources m16873a(LocalFileConfirmActivity localFileConfirmActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(localFileConfirmActivity);
        }
        return localFileConfirmActivity.mo15906a();
    }

    /* renamed from: c */
    public static AssetManager m16877c(LocalFileConfirmActivity localFileConfirmActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(localFileConfirmActivity);
        }
        return localFileConfirmActivity.mo15909c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityAnimationManager.doAnimation(this, new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_RIGHT_IN));
        m16878d();
    }

    /* renamed from: b */
    public static void m16876b(LocalFileConfirmActivity localFileConfirmActivity) {
        localFileConfirmActivity.mo15908b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            LocalFileConfirmActivity localFileConfirmActivity2 = localFileConfirmActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    localFileConfirmActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m16875a(LocalFileConfirmActivity localFileConfirmActivity, Context context) {
        localFileConfirmActivity.mo15907a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(localFileConfirmActivity);
        }
    }

    /* renamed from: a */
    public static Context m16872a(LocalFileConfirmActivity localFileConfirmActivity, Configuration configuration) {
        Context a = localFileConfirmActivity.mo15905a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public static void m16874a(Fragment fragment, List<C4059a> list, List<C4059a> list2, List<C4059a> list3) {
        f12300a.clear();
        f12300a.addAll(list);
        f12301b.clear();
        f12301b.addAll(list2);
        f12302c.clear();
        f12302c.addAll(list3);
        fragment.startActivityForResult(new Intent(fragment.getContext(), LocalFileConfirmActivity.class), HwBuildEx.VersionCodes.CUR_DEVELOPMENT);
    }
}
