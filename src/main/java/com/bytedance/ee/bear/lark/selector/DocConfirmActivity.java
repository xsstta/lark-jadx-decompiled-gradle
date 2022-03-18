package com.bytedance.ee.bear.lark.selector;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.bytedance.ee.bear.lark.selector.base.AbstractC8101b;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.ArrayList;
import java.util.List;

public class DocConfirmActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private C8123f f21590a;

    /* renamed from: b */
    private AbstractC8101b.AbstractC8103b f21591b = new AbstractC8101b.AbstractC8103b<DocSelectorViewData, DocsConfirmView>() {
        /* class com.bytedance.ee.bear.lark.selector.DocConfirmActivity.C80641 */

        /* renamed from: a */
        public void mo31171a(DocsConfirmView docsConfirmView) {
            ButterKnife.bind(DocConfirmActivity.this);
        }

        @Override // com.bytedance.ee.bear.lark.selector.base.AbstractC8101b.AbstractC8103b
        /* renamed from: a */
        public void mo31172a(List<DocSelectorViewData> list) {
            Intent intent = new Intent();
            intent.putExtra("result_confirm_data", new ArrayList(list));
            DocConfirmActivity.this.setResult(-1, intent);
            DocConfirmActivity.this.finish();
        }
    };

    /* renamed from: a */
    public Context mo31163a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo31164a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo31165a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m32255a(this, context);
    }

    /* renamed from: b */
    public void mo31166b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo31167c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m32253a(this, configuration);
    }

    public AssetManager getAssets() {
        return m32259c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m32254a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m32258b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        C8123f fVar = this.f21590a;
        if (fVar != null) {
            fVar.destroy();
        }
        super.onDestroy();
    }

    /* renamed from: a */
    public static Resources m32254a(DocConfirmActivity docConfirmActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(docConfirmActivity);
        }
        return docConfirmActivity.mo31164a();
    }

    /* renamed from: c */
    public static AssetManager m32259c(DocConfirmActivity docConfirmActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(docConfirmActivity);
        }
        return docConfirmActivity.mo31167c();
    }

    /* renamed from: b */
    public static void m32258b(DocConfirmActivity docConfirmActivity) {
        docConfirmActivity.mo31166b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            DocConfirmActivity docConfirmActivity2 = docConfirmActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    docConfirmActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_doc_confirm);
        Bundle extras = getIntent().getExtras();
        if (!m32257a(extras)) {
            finish();
        } else {
            m32256a((List) extras.getSerializable("selected_items"));
        }
    }

    /* renamed from: a */
    private void m32256a(List<DocSelectorViewData> list) {
        C8123f fVar = new C8123f(this, list, this.f21591b);
        this.f21590a = fVar;
        fVar.create();
    }

    /* renamed from: a */
    private boolean m32257a(Bundle bundle) {
        if (bundle != null && !CollectionUtils.isEmpty((List) bundle.getSerializable("selected_items"))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m32255a(DocConfirmActivity docConfirmActivity, Context context) {
        docConfirmActivity.mo31165a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(docConfirmActivity);
        }
    }

    /* renamed from: a */
    public static Context m32253a(DocConfirmActivity docConfirmActivity, Configuration configuration) {
        Context a = docConfirmActivity.mo31163a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
