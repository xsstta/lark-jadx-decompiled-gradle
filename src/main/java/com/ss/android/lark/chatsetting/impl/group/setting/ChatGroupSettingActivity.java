package com.ss.android.lark.chatsetting.impl.group.setting;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class ChatGroupSettingActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private C34937a f90100a;

    /* renamed from: a */
    public Context mo128734a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo128735a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo128736a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m135828a(this, context);
    }

    /* renamed from: b */
    public void mo128737b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo128738c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m135826a(this, configuration);
    }

    public AssetManager getAssets() {
        return m135831c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m135827a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m135830b(this);
    }

    /* renamed from: d */
    private void m135832d() {
        C34937a aVar = new C34937a();
        this.f90100a = aVar;
        aVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, this.f90100a, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* renamed from: a */
    public static Resources m135827a(ChatGroupSettingActivity chatGroupSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(chatGroupSettingActivity);
        }
        return chatGroupSettingActivity.mo128735a();
    }

    /* renamed from: c */
    public static AssetManager m135831c(ChatGroupSettingActivity chatGroupSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(chatGroupSettingActivity);
        }
        return chatGroupSettingActivity.mo128738c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStatusBarColorResource(R.color.bg_base);
        if (!m135829a(getIntent().getExtras())) {
            finish();
        } else {
            m135832d();
        }
    }

    /* renamed from: b */
    public static void m135830b(ChatGroupSettingActivity chatGroupSettingActivity) {
        chatGroupSettingActivity.mo128737b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            ChatGroupSettingActivity chatGroupSettingActivity2 = chatGroupSettingActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    chatGroupSettingActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m135829a(Bundle bundle) {
        if (bundle == null) {
            Log.m165383e("ChatGroupSettingActivity", "open group setting failed，bundle is null!!!");
            return false;
        } else if (!TextUtils.isEmpty(bundle.getString("chatID"))) {
            return true;
        } else {
            Log.m165383e("ChatGroupSettingActivity", "open gourp setting failed，chatId is null!!!");
            return false;
        }
    }

    /* renamed from: a */
    public static void m135828a(ChatGroupSettingActivity chatGroupSettingActivity, Context context) {
        chatGroupSettingActivity.mo128736a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(chatGroupSettingActivity);
        }
    }

    /* renamed from: a */
    public static Context m135826a(ChatGroupSettingActivity chatGroupSettingActivity, Configuration configuration) {
        Context a = chatGroupSettingActivity.mo128734a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C34937a aVar = this.f90100a;
        if (aVar != null && aVar.isAdded()) {
            this.f90100a.onActivityResult(i, i2, intent);
        }
    }
}
