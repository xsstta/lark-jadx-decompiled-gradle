package com.ss.android.lark.edu.creategroup.secondarypage;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\r\u001a\u00020\u0007H\u0016J\u0012\u0010\u000e\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/edu/creategroup/secondarypage/CreateGroupDetailActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "Lcom/ss/android/lark/edu/creategroup/secondarypage/IBackEventController;", "()V", "enableBack", "", "onActivityResult", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setEnableBackEvent", "enable", "setupFragment", "features_edu_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class CreateGroupDetailActivity extends BaseFragmentActivity implements IBackEventController {

    /* renamed from: a */
    private boolean f94976a = true;

    /* renamed from: a */
    public Context mo136361a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo136362a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo136363a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m145843a(this, context);
    }

    /* renamed from: b */
    public void mo136365b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo136366c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m145841a(this, configuration);
    }

    public AssetManager getAssets() {
        return m145845c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m145842a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m145844b(this);
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        if (this.f94976a) {
            super.onBackPressed();
        }
    }

    /* renamed from: d */
    private final void m145846d() {
        CreateGroupDetailFragment bVar = new CreateGroupDetailFragment(this);
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        bVar.setArguments(intent.getExtras());
        getSupportFragmentManager().beginTransaction().replace(16908290, bVar).commit();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m145846d();
    }

    /* renamed from: a */
    public static Resources m145842a(CreateGroupDetailActivity createGroupDetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(createGroupDetailActivity);
        }
        return createGroupDetailActivity.mo136362a();
    }

    /* renamed from: c */
    public static AssetManager m145845c(CreateGroupDetailActivity createGroupDetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(createGroupDetailActivity);
        }
        return createGroupDetailActivity.mo136366c();
    }

    /* renamed from: b */
    public static void m145844b(CreateGroupDetailActivity createGroupDetailActivity) {
        createGroupDetailActivity.mo136365b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            CreateGroupDetailActivity createGroupDetailActivity2 = createGroupDetailActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    createGroupDetailActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // com.ss.android.lark.edu.creategroup.secondarypage.IBackEventController
    /* renamed from: a */
    public void mo136364a(boolean z) {
        this.f94976a = z;
    }

    /* renamed from: a */
    public static void m145843a(CreateGroupDetailActivity createGroupDetailActivity, Context context) {
        createGroupDetailActivity.mo136363a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(createGroupDetailActivity);
        }
    }

    /* renamed from: a */
    public static Context m145841a(CreateGroupDetailActivity createGroupDetailActivity, Configuration configuration) {
        Context a = createGroupDetailActivity.mo136361a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(16908290);
        if (findFragmentById != null) {
            findFragmentById.onActivityResult(i, i2, intent);
        }
    }
}
