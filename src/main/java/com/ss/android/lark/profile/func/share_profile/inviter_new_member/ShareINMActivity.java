package com.ss.android.lark.profile.func.share_profile.inviter_new_member;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import butterknife.ButterKnife;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.profile.func.share_profile.inviter_new_member.mvp.C52481b;
import com.ss.android.lark.profile.func.share_profile.inviter_new_member.mvp.C52482c;
import com.ss.android.lark.profile.func.share_profile.inviter_new_member.mvp.ShareINMView;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class ShareINMActivity extends BaseFragmentActivity {

    /* renamed from: a */
    ShareINMView.AbstractC52477a f129930a = new ShareINMView.AbstractC52477a() {
        /* class com.ss.android.lark.profile.func.share_profile.inviter_new_member.$$Lambda$ShareINMActivity$5kv042iGgmU5Vf83_Ti2Kvjj4U */

        @Override // com.ss.android.lark.profile.func.share_profile.inviter_new_member.mvp.ShareINMView.AbstractC52477a
        public final void injectView(ShareINMView shareINMView) {
            ShareINMActivity.m270910lambda$5kv042iGgmU5Vf83_Ti2Kvjj4U(ShareINMActivity.this, shareINMView);
        }
    };

    /* renamed from: b */
    private C52482c f129931b;

    /* renamed from: a */
    public Context mo179481a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo179482a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo179483a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m203286a(this, context);
    }

    /* renamed from: b */
    public void mo179484b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo179485c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m203284a(this, configuration);
    }

    public AssetManager getAssets() {
        return m203289c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m203285a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m203288b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        C52482c cVar = this.f129931b;
        if (cVar != null) {
            cVar.destroy();
        }
        this.f129930a = null;
    }

    /* renamed from: d */
    private void m203290d() {
        C52481b bVar = new C52481b();
        Fragment a = bVar.mo179500a();
        a.setArguments(getIntent().getExtras());
        C52482c cVar = new C52482c(bVar, new ShareINMView(getSupportFragmentManager(), this.f129930a, a));
        this.f129931b = cVar;
        cVar.create();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m203287a(ShareINMView shareINMView) {
        ButterKnife.bind(shareINMView, this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_share_inviter_new_member);
        m203290d();
    }

    /* renamed from: a */
    public static Resources m203285a(ShareINMActivity shareINMActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(shareINMActivity);
        }
        return shareINMActivity.mo179482a();
    }

    /* renamed from: c */
    public static AssetManager m203289c(ShareINMActivity shareINMActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(shareINMActivity);
        }
        return shareINMActivity.mo179485c();
    }

    /* renamed from: b */
    public static void m203288b(ShareINMActivity shareINMActivity) {
        shareINMActivity.mo179484b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            ShareINMActivity shareINMActivity2 = shareINMActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    shareINMActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m203286a(ShareINMActivity shareINMActivity, Context context) {
        shareINMActivity.mo179483a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(shareINMActivity);
        }
    }

    /* renamed from: a */
    public static Context m203284a(ShareINMActivity shareINMActivity, Configuration configuration) {
        Context a = shareINMActivity.mo179481a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
