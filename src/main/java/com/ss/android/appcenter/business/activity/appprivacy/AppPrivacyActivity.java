package com.ss.android.appcenter.business.activity.appprivacy;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.dto.C27697d;
import com.ss.android.appcenter.business.dto.OnboardingAppInfo;
import com.ss.android.appcenter.business.dto.PrivacyGroupType;
import com.ss.android.appcenter.business.tab.fragmentv2.C28024b;
import com.ss.android.appcenter.common.base.FunctionActivity;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AppPrivacyActivity extends FunctionActivity {

    /* renamed from: a */
    private ImageView f69036a;

    /* renamed from: b */
    private RecyclerView f69037b;

    /* renamed from: c */
    private C28024b f69038c;

    /* renamed from: d */
    private List<C27697d> f69039d;

    /* renamed from: a */
    public Context mo98498a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo98268a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo98499a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m100995a(this, context);
    }

    /* renamed from: b */
    public void mo98500b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo98501c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m100991a(this, configuration);
    }

    public AssetManager getAssets() {
        return m100997c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m100992a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m100996b(this);
    }

    /* renamed from: d */
    private void m100998d() {
        this.f69036a = (ImageView) findViewById(R.id.back);
        this.f69037b = (RecyclerView) findViewById(R.id.recycler);
        this.f69038c = new C28024b(this, this.f69039d);
        this.f69037b.setLayoutManager(new LinearLayoutManager(this));
        this.f69037b.setAdapter(this.f69038c);
    }

    /* renamed from: a */
    public static Resources m100992a(AppPrivacyActivity appPrivacyActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(appPrivacyActivity);
        }
        return appPrivacyActivity.mo98268a();
    }

    /* renamed from: c */
    public static AssetManager m100997c(AppPrivacyActivity appPrivacyActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(appPrivacyActivity);
        }
        return appPrivacyActivity.mo98501c();
    }

    /* renamed from: b */
    public static void m100996b(AppPrivacyActivity appPrivacyActivity) {
        appPrivacyActivity.mo98500b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            AppPrivacyActivity appPrivacyActivity2 = appPrivacyActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    appPrivacyActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private List<C27697d> m100993a(List<OnboardingAppInfo> list) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (OnboardingAppInfo onboardingAppInfo : list) {
                if (onboardingAppInfo != null) {
                    C27697d dVar = new C27697d(PrivacyGroupType.APPINFO, onboardingAppInfo);
                    boolean hasNormalPermission = onboardingAppInfo.hasNormalPermission();
                    boolean hasHighPermission = onboardingAppInfo.hasHighPermission();
                    arrayList.add(dVar);
                    if (hasHighPermission || hasNormalPermission) {
                        z = false;
                    } else {
                        z = true;
                    }
                    dVar.mo98849a(z);
                    if (hasNormalPermission) {
                        C27697d dVar2 = new C27697d(PrivacyGroupType.NORMALLEVEL, onboardingAppInfo);
                        arrayList.add(dVar2);
                        dVar2.mo98849a(!hasHighPermission);
                    }
                    if (hasHighPermission) {
                        C27697d dVar3 = new C27697d(PrivacyGroupType.HIGHLEVEL, onboardingAppInfo);
                        arrayList.add(dVar3);
                        dVar3.mo98849a(true);
                    }
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.appcenter.common.base.BaseActivity, com.ss.android.appcenter.common.base.FunctionActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.appcenter_privacy_agreement_layout);
        if (getIntent() != null) {
            this.f69039d = m100993a((List) getIntent().getSerializableExtra("apps"));
        }
        if (CollectionUtils.isEmpty(this.f69039d)) {
            C28184h.m103248b("AppPrivacyActivity", " onboarding data null");
            finish();
        }
        m100998d();
        this.f69036a.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.appcenter.business.activity.appprivacy.AppPrivacyActivity.View$OnClickListenerC276551 */

            public void onClick(View view) {
                AppPrivacyActivity.this.finish();
            }
        });
    }

    /* renamed from: a */
    public static void m100995a(AppPrivacyActivity appPrivacyActivity, Context context) {
        appPrivacyActivity.mo98499a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(appPrivacyActivity);
        }
    }

    /* renamed from: a */
    public static Context m100991a(AppPrivacyActivity appPrivacyActivity, Configuration configuration) {
        Context a = appPrivacyActivity.mo98498a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public static void m100994a(Context context, List<OnboardingAppInfo> list) {
        if (context == null) {
            C28184h.m103248b("AppPrivacyActivity", "start AppPrivacyActivity context is null");
            return;
        }
        Intent intent = new Intent(context, AppPrivacyActivity.class);
        intent.putExtra("apps", (Serializable) list);
        context.startActivity(intent);
    }
}
