package com.ss.android.lark.favorite.detail;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import butterknife.ButterKnife;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.dependency.IForwardDependency;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.favorite.detail.FavoriteDetailView;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1820e.C36913c;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class FavoriteDetailActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private C37193d f95545a;

    /* renamed from: b */
    private FavoriteMessageInfo f95546b;

    /* renamed from: c */
    private final FavoriteDetailView.AbstractC37188a f95547c = new FavoriteDetailView.AbstractC37188a() {
        /* class com.ss.android.lark.favorite.detail.FavoriteDetailActivity.C371821 */

        @Override // com.ss.android.lark.favorite.detail.FavoriteDetailView.AbstractC37188a
        /* renamed from: a */
        public void mo136843a(FavoriteDetailView favoriteDetailView) {
            ButterKnife.bind(favoriteDetailView, FavoriteDetailActivity.this);
        }

        @Override // com.ss.android.lark.favorite.detail.FavoriteDetailView.AbstractC37188a
        /* renamed from: a */
        public void mo136842a(FavoriteMessageInfo favoriteMessageInfo) {
            IForwardDependency E = C29990c.m110930b().mo134506E();
            E.mo134369a(FavoriteDetailActivity.this, favoriteMessageInfo, E.mo134366a(), "quick_click", true, 2304);
        }

        @Override // com.ss.android.lark.favorite.detail.FavoriteDetailView.AbstractC37188a
        /* renamed from: a */
        public void mo136844a(String str) {
            if (UIUtils.isActivityRunning(FavoriteDetailActivity.this)) {
                Intent intent = new Intent();
                intent.putExtra("params_favorites", str);
                if (DesktopUtil.m144301a((Context) FavoriteDetailActivity.this)) {
                    EventBus.getDefault().trigger(new C37189a(str));
                }
                FavoriteDetailActivity.this.setResult(-1, intent);
                FavoriteDetailActivity.this.finish();
            }
        }
    };

    /* renamed from: a */
    public Context mo136835a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo136837a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m146467a(this, context);
    }

    /* renamed from: b */
    public Resources mo136838b() {
        return super.getResources();
    }

    /* renamed from: c */
    public AssetManager mo136839c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m146465a(this, configuration);
    }

    public AssetManager getAssets() {
        return m146470c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m146469b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m146466a(this);
    }

    /* renamed from: d */
    private void m146471d() {
        C37193d dVar = new C37193d(this.f95547c, this, this.f95546b);
        this.f95545a = dVar;
        dVar.create();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        C37193d dVar = this.f95545a;
        if (dVar != null) {
            dVar.destroy();
        }
        C36913c.m145732a(this).mo136289b();
    }

    /* renamed from: a */
    public void mo136836a() {
        super.onStop();
        C36913c.m145732a(this).mo136286a();
    }

    /* renamed from: a */
    private boolean m146468a(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        FavoriteMessageInfo favoriteMessageInfo = (FavoriteMessageInfo) bundle.get("params_favorites");
        this.f95546b = favoriteMessageInfo;
        if (favoriteMessageInfo == null) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static Resources m146469b(FavoriteDetailActivity favoriteDetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(favoriteDetailActivity);
        }
        return favoriteDetailActivity.mo136838b();
    }

    /* renamed from: c */
    public static AssetManager m146470c(FavoriteDetailActivity favoriteDetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(favoriteDetailActivity);
        }
        return favoriteDetailActivity.mo136839c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!m146468a(getIntent().getExtras())) {
            finish();
            return;
        }
        setContentView(R.layout.activity_savebox_detail);
        m146471d();
    }

    /* renamed from: a */
    public static void m146466a(FavoriteDetailActivity favoriteDetailActivity) {
        favoriteDetailActivity.mo136836a();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            FavoriteDetailActivity favoriteDetailActivity2 = favoriteDetailActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    favoriteDetailActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m146467a(FavoriteDetailActivity favoriteDetailActivity, Context context) {
        favoriteDetailActivity.mo136837a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(favoriteDetailActivity);
        }
    }

    /* renamed from: a */
    public static Context m146465a(FavoriteDetailActivity favoriteDetailActivity, Configuration configuration) {
        Context a = favoriteDetailActivity.mo136835a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && intent != null && i == 1) {
            String stringExtra = intent.getStringExtra("params_favorites");
            if (!TextUtils.isEmpty(stringExtra)) {
                this.f95547c.mo136844a(stringExtra);
            }
        }
    }
}
