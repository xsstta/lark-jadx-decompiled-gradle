package com.ss.android.lark.ai.enterpriseTopic.listpage;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.ai.C28522a;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.ai.WordCards;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.ArrayList;

public class EntityWordsActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private C28563a f71832a;

    /* renamed from: a */
    public Context mo101697a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo101698a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo101699a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m104735a(this, context);
    }

    /* renamed from: b */
    public void mo101700b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo101701c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m104731a(this, configuration);
    }

    public AssetManager getAssets() {
        return m104737c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m104732a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m104736b(this);
    }

    /* renamed from: d */
    private void m104738d() {
        C28563a aVar = new C28563a(C28522a.m104531a());
        this.f71832a = aVar;
        aVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(16908290, this.f71832a, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStatusBarColorResource(R.color.ud_N00);
        m104738d();
    }

    /* renamed from: a */
    public static Resources m104732a(EntityWordsActivity entityWordsActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(entityWordsActivity);
        }
        return entityWordsActivity.mo101698a();
    }

    /* renamed from: c */
    public static AssetManager m104737c(EntityWordsActivity entityWordsActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(entityWordsActivity);
        }
        return entityWordsActivity.mo101701c();
    }

    /* renamed from: b */
    public static void m104736b(EntityWordsActivity entityWordsActivity) {
        entityWordsActivity.mo101700b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            EntityWordsActivity entityWordsActivity2 = entityWordsActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    entityWordsActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m104735a(EntityWordsActivity entityWordsActivity, Context context) {
        entityWordsActivity.mo101699a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(entityWordsActivity);
        }
    }

    /* renamed from: a */
    public static Context m104731a(EntityWordsActivity entityWordsActivity, Configuration configuration) {
        Context a = entityWordsActivity.mo101697a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public static void m104733a(Context context, String str, String str2) {
        Intent intent = new Intent(context, EntityWordsActivity.class);
        intent.putExtra("key_query_text", str);
        intent.putExtra("key_cards_list_v2", str2);
        intent.putExtra("key_from_entity_word", true);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public static void m104734a(Context context, ArrayList<WordCards> arrayList, String str, boolean z) {
        Intent intent = new Intent(context, EntityWordsActivity.class);
        intent.putExtra("key_cards_list", arrayList);
        intent.putExtra("key_query_text", str);
        intent.putExtra("key_from_entity_word", z);
        context.startActivity(intent);
    }
}
