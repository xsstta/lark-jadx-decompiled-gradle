package com.ss.android.lark.chatsetting.impl.p2p;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class ChatP2pSettingActivity extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo129006a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo129007a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo129008a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m136328a(this, context);
    }

    /* renamed from: b */
    public void mo129009b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo129010c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m136326a(this, configuration);
    }

    public AssetManager getAssets() {
        return m136330c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m136327a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m136329b(this);
    }

    /* renamed from: d */
    private void m136331d() {
        C35018a aVar = new C35018a();
        aVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, aVar, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* renamed from: e */
    private boolean m136332e() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return false;
        }
        Chatter chatter = (Chatter) extras.get("chatter_info");
        if (((Chat) extras.get("key_chat")) == null || chatter == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static Resources m136327a(ChatP2pSettingActivity chatP2pSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(chatP2pSettingActivity);
        }
        return chatP2pSettingActivity.mo129007a();
    }

    /* renamed from: c */
    public static AssetManager m136330c(ChatP2pSettingActivity chatP2pSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(chatP2pSettingActivity);
        }
        return chatP2pSettingActivity.mo129010c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStatusBarColorResource(R.color.bg_base);
        if (!m136332e()) {
            finish();
        } else {
            m136331d();
        }
    }

    /* renamed from: b */
    public static void m136329b(ChatP2pSettingActivity chatP2pSettingActivity) {
        chatP2pSettingActivity.mo129009b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            ChatP2pSettingActivity chatP2pSettingActivity2 = chatP2pSettingActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    chatP2pSettingActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m136328a(ChatP2pSettingActivity chatP2pSettingActivity, Context context) {
        chatP2pSettingActivity.mo129008a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(chatP2pSettingActivity);
        }
    }

    /* renamed from: a */
    public static Context m136326a(ChatP2pSettingActivity chatP2pSettingActivity, Configuration configuration) {
        Context a = chatP2pSettingActivity.mo129006a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
