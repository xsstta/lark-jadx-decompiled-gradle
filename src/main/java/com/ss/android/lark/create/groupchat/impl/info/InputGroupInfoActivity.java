package com.ss.android.lark.create.groupchat.impl.info;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.framework.utils.KeyboardUtils;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.create.groupchat.impl.p1779b.C36275a;
import com.ss.android.lark.create.groupchat.impl.select_member.GroupCreateActivity;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\n\u001a\u00020\u0006H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/info/InputGroupInfoActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "mFragment", "Lcom/ss/android/lark/create/groupchat/impl/info/InputGroupInfoFragment;", "finish", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setupFragment", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class InputGroupInfoActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private InputGroupInfoFragment f93703a;

    /* renamed from: a */
    public Context mo133973a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo133974a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo133975a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m143010a(this, context);
    }

    /* renamed from: b */
    public void mo133976b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo133977c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m143008a(this, configuration);
    }

    public AssetManager getAssets() {
        return m143012c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m143009a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m143011b(this);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void finish() {
        KeyboardUtils.hideKeyboard(this);
        C36275a.m142817a(GroupCreateActivity.class.getSimpleName());
        super.finish();
    }

    /* renamed from: d */
    private final void m143013d() {
        InputGroupInfoFragment bVar = new InputGroupInfoFragment();
        this.f93703a = bVar;
        if (bVar != null) {
            Intent intent = getIntent();
            Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
            bVar.setArguments(intent.getExtras());
        }
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "supportFragmentManager.beginTransaction()");
        InputGroupInfoFragment bVar2 = this.f93703a;
        if (bVar2 == null) {
            Intrinsics.throwNpe();
        }
        beginTransaction.add(16908290, bVar2, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m143013d();
    }

    /* renamed from: a */
    public static Resources m143009a(InputGroupInfoActivity inputGroupInfoActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inputGroupInfoActivity);
        }
        return inputGroupInfoActivity.mo133974a();
    }

    /* renamed from: c */
    public static AssetManager m143012c(InputGroupInfoActivity inputGroupInfoActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inputGroupInfoActivity);
        }
        return inputGroupInfoActivity.mo133977c();
    }

    /* renamed from: b */
    public static void m143011b(InputGroupInfoActivity inputGroupInfoActivity) {
        inputGroupInfoActivity.mo133976b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            InputGroupInfoActivity inputGroupInfoActivity2 = inputGroupInfoActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    inputGroupInfoActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m143010a(InputGroupInfoActivity inputGroupInfoActivity, Context context) {
        inputGroupInfoActivity.mo133975a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inputGroupInfoActivity);
        }
    }

    /* renamed from: a */
    public static Context m143008a(InputGroupInfoActivity inputGroupInfoActivity, Configuration configuration) {
        Context a = inputGroupInfoActivity.mo133973a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
