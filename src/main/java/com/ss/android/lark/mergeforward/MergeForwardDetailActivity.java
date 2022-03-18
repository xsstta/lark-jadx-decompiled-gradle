package com.ss.android.lark.mergeforward;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.mvp.IView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.message.content.MergeForwardContent;
import com.ss.android.lark.chat.mergeforward.C34066e;
import com.ss.android.lark.dependency.IForwardDependency;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.monitor.p2372a.C48211b;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class MergeForwardDetailActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private MergeForwardContent f114615a;

    /* renamed from: b */
    private MergeForwardContent f114616b;

    /* renamed from: c */
    private AbstractC45274b f114617c;

    /* renamed from: d */
    private int f114618d;

    /* renamed from: e */
    private String f114619e;

    /* renamed from: f */
    private FavoriteMessageInfo f114620f;

    /* renamed from: g */
    private AbstractC45276d f114621g = new AbstractC45276d() {
        /* class com.ss.android.lark.mergeforward.MergeForwardDetailActivity.C452711 */

        @Override // com.ss.android.lark.mergeforward.AbstractC45276d
        /* renamed from: a */
        public void mo159971a(IView iView) {
            ButterKnife.bind(iView, MergeForwardDetailActivity.this);
        }

        @Override // com.ss.android.lark.mergeforward.AbstractC45276d
        /* renamed from: a */
        public void mo159973a(String str) {
            LKUIToast.show(MergeForwardDetailActivity.this, str);
        }

        @Override // com.ss.android.lark.mergeforward.AbstractC45276d
        /* renamed from: a */
        public void mo159972a(FavoriteMessageInfo favoriteMessageInfo) {
            IForwardDependency E = C29990c.m110930b().mo134506E();
            E.mo134369a(MergeForwardDetailActivity.this, favoriteMessageInfo, E.mo134366a(), "quick_click", true, -1);
        }

        @Override // com.ss.android.lark.mergeforward.AbstractC45276d
        /* renamed from: b */
        public void mo159974b(String str) {
            if (UIUtils.isActivityRunning(MergeForwardDetailActivity.this)) {
                Intent intent = new Intent();
                intent.putExtra("params_favorites", str);
                MergeForwardDetailActivity.this.setResult(-1, intent);
                MergeForwardDetailActivity.this.finish();
            }
        }
    };

    /* renamed from: a */
    public Context mo159963a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo159964a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo159965a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m179773a(this, context);
    }

    /* renamed from: b */
    public void mo159966b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo159967c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m179770a(this, configuration);
    }

    public AssetManager getAssets() {
        return m179776c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m179771a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m179775b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        AbstractC45274b bVar = this.f114617c;
        if (bVar != null) {
            bVar.destroy();
        }
        super.onDestroy();
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C48211b.m190251a().mo168690c();
    }

    /* renamed from: a */
    public static Resources m179771a(MergeForwardDetailActivity mergeForwardDetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mergeForwardDetailActivity);
        }
        return mergeForwardDetailActivity.mo159964a();
    }

    /* renamed from: c */
    public static AssetManager m179776c(MergeForwardDetailActivity mergeForwardDetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mergeForwardDetailActivity);
        }
        return mergeForwardDetailActivity.mo159967c();
    }

    /* renamed from: b */
    public static void m179775b(MergeForwardDetailActivity mergeForwardDetailActivity) {
        mergeForwardDetailActivity.mo159966b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MergeForwardDetailActivity mergeForwardDetailActivity2 = mergeForwardDetailActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    mergeForwardDetailActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        C48211b.m190252a(getClass().getSimpleName()).mo168688b();
        C48211b.m190251a().mo168689b("onCreate");
        super.onCreate(bundle);
        if (!m179774a(getIntent().getExtras())) {
            finish();
            return;
        }
        setContentView(R.layout.activity_merge_forward_detail);
        m179772a(this.f114615a, this.f114616b);
        C48211b.m190251a().mo168691c("onCreate");
    }

    /* renamed from: a */
    private boolean m179774a(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("key_merge_forward_message")) {
            return false;
        }
        int i = bundle.getInt("serializable_from_type", 0);
        this.f114618d = i;
        if (i == 1) {
            FavoriteMessageInfo favoriteMessageInfo = (FavoriteMessageInfo) bundle.get("serializable_favorite");
            this.f114620f = favoriteMessageInfo;
            if (favoriteMessageInfo == null) {
                return false;
            }
        }
        this.f114615a = (MergeForwardContent) bundle.getSerializable("key_merge_forward_message");
        this.f114616b = (MergeForwardContent) bundle.getSerializable("key_merge_forward_translate_message");
        this.f114619e = bundle.getString("key_merge_forward_chat_id");
        if (this.f114615a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m179773a(MergeForwardDetailActivity mergeForwardDetailActivity, Context context) {
        mergeForwardDetailActivity.mo159965a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mergeForwardDetailActivity);
        }
    }

    /* renamed from: a */
    public static Context m179770a(MergeForwardDetailActivity mergeForwardDetailActivity, Configuration configuration) {
        Context a = mergeForwardDetailActivity.mo159963a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    private void m179772a(MergeForwardContent mergeForwardContent, MergeForwardContent mergeForwardContent2) {
        C34066e eVar = new C34066e(this.f114621g, this, mergeForwardContent, mergeForwardContent2, this.f114618d, this.f114619e, this.f114620f);
        this.f114617c = eVar;
        eVar.create();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }
}
