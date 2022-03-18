package com.ss.android.lark.setting.page.content.general.wheniviewachat;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.setting.page.content.general.wheniviewachat.WhenIViewAChatView;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0002J\u0012\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\r\u001a\u00020\tH\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/setting/page/content/general/wheniviewachat/WhenIViewAChatActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "presenter", "Lcom/ss/android/lark/setting/page/content/general/wheniviewachat/WhenIViewAChatPresenter;", "viewDependency", "com/ss/android/lark/setting/page/content/general/wheniviewachat/WhenIViewAChatActivity$viewDependency$1", "Lcom/ss/android/lark/setting/page/content/general/wheniviewachat/WhenIViewAChatActivity$viewDependency$1;", "initMVP", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class WhenIViewAChatActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private WhenIViewAChatPresenter f134805a;

    /* renamed from: b */
    private final C54525a f134806b = new C54525a(this);

    /* renamed from: a */
    public Context mo186339a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo186340a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo186341a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m211537a(this, context);
    }

    /* renamed from: b */
    public void mo186342b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo186343c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m211535a(this, configuration);
    }

    public AssetManager getAssets() {
        return m211539c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m211536a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m211538b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        WhenIViewAChatPresenter cVar = this.f134805a;
        if (cVar != null) {
            cVar.destroy();
        }
        super.onDestroy();
    }

    /* renamed from: d */
    private final void m211540d() {
        WhenIViewAChatPresenter cVar = new WhenIViewAChatPresenter(new WhenIViewAChatModel(), new WhenIViewAChatView(this, this.f134806b));
        this.f134805a = cVar;
        if (cVar != null) {
            cVar.create();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/setting/page/content/general/wheniviewachat/WhenIViewAChatActivity$viewDependency$1", "Lcom/ss/android/lark/setting/page/content/general/wheniviewachat/WhenIViewAChatView$ViewDependency;", "injectView", "", "view", "Lcom/ss/android/lark/setting/page/content/general/wheniviewachat/WhenIViewAChatView;", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.wheniviewachat.WhenIViewAChatActivity$a */
    public static final class C54525a extends WhenIViewAChatView.ViewDependency {

        /* renamed from: a */
        final /* synthetic */ WhenIViewAChatActivity f134807a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54525a(WhenIViewAChatActivity whenIViewAChatActivity) {
            this.f134807a = whenIViewAChatActivity;
        }

        @Override // com.ss.android.lark.setting.page.content.general.wheniviewachat.WhenIViewAChatView.ViewDependency
        /* renamed from: a */
        public void mo186346a(WhenIViewAChatView whenIViewAChatView) {
            Intrinsics.checkParameterIsNotNull(whenIViewAChatView, "view");
            ButterKnife.bind(whenIViewAChatView, this.f134807a);
        }
    }

    /* renamed from: a */
    public static Resources m211536a(WhenIViewAChatActivity whenIViewAChatActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(whenIViewAChatActivity);
        }
        return whenIViewAChatActivity.mo186340a();
    }

    /* renamed from: c */
    public static AssetManager m211539c(WhenIViewAChatActivity whenIViewAChatActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(whenIViewAChatActivity);
        }
        return whenIViewAChatActivity.mo186343c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStatusBarColorResource(R.color.bg_base);
        setContentView(R.layout.activity_when_i_view_a_chat);
        m211540d();
    }

    /* renamed from: b */
    public static void m211538b(WhenIViewAChatActivity whenIViewAChatActivity) {
        whenIViewAChatActivity.mo186342b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            WhenIViewAChatActivity whenIViewAChatActivity2 = whenIViewAChatActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    whenIViewAChatActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m211537a(WhenIViewAChatActivity whenIViewAChatActivity, Context context) {
        whenIViewAChatActivity.mo186341a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(whenIViewAChatActivity);
        }
    }

    /* renamed from: a */
    public static Context m211535a(WhenIViewAChatActivity whenIViewAChatActivity, Configuration configuration) {
        Context a = whenIViewAChatActivity.mo186339a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
