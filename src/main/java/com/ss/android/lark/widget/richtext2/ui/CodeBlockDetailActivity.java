package com.ss.android.lark.widget.richtext2.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.widget.richtext.RichTextElement;
import com.ss.android.lark.widget.richtext2.widget.C59089a;

public class CodeBlockDetailActivity extends AppCompatActivity {

    /* renamed from: a */
    private C59085a f146477a;

    /* renamed from: a */
    public Context mo200717a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo200718a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo200719a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m229469a(this, context);
    }

    /* renamed from: b */
    public void mo200720b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo200721c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m229466a(this, configuration);
    }

    public AssetManager getAssets() {
        return m229471c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public Resources getResources() {
        return m229467a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m229470b(this);
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
        this.f146477a.mo200725a();
    }

    public void finish() {
        super.finish();
        C59089a.m229510b(this);
        overridePendingTransition(0, R.anim.code_block_zoom_exit);
    }

    /* renamed from: d */
    private void m229472d() {
        C59089a.m229509a(this);
        getWindow().setNavigationBarColor(-1);
        if (Build.VERSION.SDK_INT >= 26) {
            View decorView = getWindow().getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
        }
    }

    /* renamed from: e */
    private void m229473e() {
        Bundle extras = getIntent().getExtras();
        C59085a aVar = new C59085a();
        this.f146477a = aVar;
        aVar.setArguments(extras);
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.code_block_detail_container_layout, this.f146477a);
        beginTransaction.commit();
    }

    /* renamed from: a */
    public static Resources m229467a(CodeBlockDetailActivity codeBlockDetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(codeBlockDetailActivity);
        }
        return codeBlockDetailActivity.mo200718a();
    }

    /* renamed from: c */
    public static AssetManager m229471c(CodeBlockDetailActivity codeBlockDetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(codeBlockDetailActivity);
        }
        return codeBlockDetailActivity.mo200721c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m229472d();
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(R.id.code_block_detail_container_layout);
        setContentView(frameLayout);
        m229473e();
    }

    /* renamed from: b */
    public static void m229470b(CodeBlockDetailActivity codeBlockDetailActivity) {
        codeBlockDetailActivity.mo200720b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            CodeBlockDetailActivity codeBlockDetailActivity2 = codeBlockDetailActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    codeBlockDetailActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m229469a(CodeBlockDetailActivity codeBlockDetailActivity, Context context) {
        codeBlockDetailActivity.mo200719a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(codeBlockDetailActivity);
        }
    }

    /* renamed from: a */
    public static Context m229466a(CodeBlockDetailActivity codeBlockDetailActivity, Configuration configuration) {
        Context a = codeBlockDetailActivity.mo200717a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public static void m229468a(Activity activity, RichTextElement.CodeBlockProperty codeBlockProperty) {
        Intent intent = new Intent(activity, CodeBlockDetailActivity.class);
        intent.putExtra("KEY_CODE_BLOCK_DATA", codeBlockProperty);
        activity.startActivity(intent);
        activity.overridePendingTransition(R.anim.code_block_zoom_enter, 0);
    }
}
