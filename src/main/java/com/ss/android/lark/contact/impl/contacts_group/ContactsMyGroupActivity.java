package com.ss.android.lark.contact.impl.contacts_group;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.monitor.p2372a.C48211b;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class ContactsMyGroupActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private C35593b f92041a;

    /* renamed from: a */
    public Context mo131240a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo131241a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo131242a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m139325a(this, context);
    }

    /* renamed from: b */
    public void mo131243b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo131244c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m139323a(this, configuration);
    }

    public AssetManager getAssets() {
        return m139327c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m139324a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m139326b(this);
    }

    /* renamed from: d */
    private void m139328d() {
        C35593b bVar = new C35593b();
        this.f92041a = bVar;
        bVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, this.f92041a, "ContactsMyGroupFragment");
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        C48211b.m190252a("ContactsMyGroupActivity").mo168688b();
        super.onCreate(bundle);
        m139328d();
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C48211b.m190251a().mo168690c();
    }

    /* renamed from: a */
    public static Resources m139324a(ContactsMyGroupActivity contactsMyGroupActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(contactsMyGroupActivity);
        }
        return contactsMyGroupActivity.mo131241a();
    }

    /* renamed from: c */
    public static AssetManager m139327c(ContactsMyGroupActivity contactsMyGroupActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(contactsMyGroupActivity);
        }
        return contactsMyGroupActivity.mo131244c();
    }

    /* renamed from: b */
    public static void m139326b(ContactsMyGroupActivity contactsMyGroupActivity) {
        contactsMyGroupActivity.mo131243b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            ContactsMyGroupActivity contactsMyGroupActivity2 = contactsMyGroupActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    contactsMyGroupActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m139325a(ContactsMyGroupActivity contactsMyGroupActivity, Context context) {
        contactsMyGroupActivity.mo131242a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(contactsMyGroupActivity);
        }
    }

    /* renamed from: a */
    public static Context m139323a(ContactsMyGroupActivity contactsMyGroupActivity, Configuration configuration) {
        Context a = contactsMyGroupActivity.mo131240a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
