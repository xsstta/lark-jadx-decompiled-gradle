package com.ss.android.lark.feed.app.conversationbox;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.monitor.p2372a.C48211b;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class ConversationBoxActivity extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo137334a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo137335a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo137336a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m147294a(this, context);
    }

    /* renamed from: b */
    public void mo137337b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo137338c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m147292a(this, configuration);
    }

    public AssetManager getAssets() {
        return m147296c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m147293a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m147295b(this);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C48211b.m190251a().mo168690c();
    }

    /* renamed from: a */
    public static Resources m147293a(ConversationBoxActivity conversationBoxActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(conversationBoxActivity);
        }
        return conversationBoxActivity.mo137335a();
    }

    /* renamed from: c */
    public static AssetManager m147296c(ConversationBoxActivity conversationBoxActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(conversationBoxActivity);
        }
        return conversationBoxActivity.mo137338c();
    }

    /* renamed from: b */
    public static void m147295b(ConversationBoxActivity conversationBoxActivity) {
        conversationBoxActivity.mo137337b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            ConversationBoxActivity conversationBoxActivity2 = conversationBoxActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    conversationBoxActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        C48211b.m190252a("ConversationBoxActivity").mo168688b();
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("parent_card_id");
        Log.m165389i("ConversationBoxActivity", "parent_card_id = " + stringExtra);
        if (TextUtils.isEmpty(stringExtra)) {
            finish();
            return;
        }
        C48211b.m190251a().mo168689b("setUpFragment");
        C37435d dVar = new C37435d();
        dVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, dVar, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
        C48211b.m190251a().mo168691c("setUpFragment");
    }

    /* renamed from: a */
    public static void m147294a(ConversationBoxActivity conversationBoxActivity, Context context) {
        conversationBoxActivity.mo137336a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(conversationBoxActivity);
        }
    }

    /* renamed from: a */
    public static Context m147292a(ConversationBoxActivity conversationBoxActivity, Configuration configuration) {
        Context a = conversationBoxActivity.mo137334a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
