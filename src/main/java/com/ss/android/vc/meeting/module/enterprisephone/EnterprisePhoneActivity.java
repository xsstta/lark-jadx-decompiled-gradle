package com.ss.android.vc.meeting.module.enterprisephone;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.base.watermark.IWatermarkable;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.vc.common.base.BaseActivity;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60752f;
import com.ss.android.vc.statistics.event.C63767p;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\u0014"}, d2 = {"Lcom/ss/android/vc/meeting/module/enterprisephone/EnterprisePhoneActivity;", "Lcom/ss/android/vc/common/base/BaseActivity;", "Lcom/ss/android/lark/base/watermark/IWatermarkable;", "()V", "addEnterprisePhoneCallingFragment", "", "intent", "Landroid/content/Intent;", "addEnterprisePhoneDialFragment", "addEnterprisePhoneLimitationFragment", "autoAdapterFullScreen", "", "enableGlobalWatermark", "getWatermarkMode", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showFragment", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class EnterprisePhoneActivity extends BaseActivity implements IWatermarkable {

    /* renamed from: b */
    public static final Companion f154552b = new Companion(null);

    /* renamed from: a */
    public Context mo213474a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo213475a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo213476a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.vc.common.base.BaseActivity
    public void attachBaseContext(Context context) {
        m240539a(this, context);
    }

    /* renamed from: b */
    public void mo213478b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo213479c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m240537a(this, configuration);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.common.base.BaseActivity
    /* renamed from: e */
    public boolean mo208278e() {
        return false;
    }

    @Override // com.ss.android.lark.base.watermark.IWatermarkable
    public boolean enableGlobalWatermark() {
        return true;
    }

    public AssetManager getAssets() {
        return m240542c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m240538a(this);
    }

    @Override // com.ss.android.lark.base.watermark.IWatermarkable
    public int getWatermarkMode() {
        return 0;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m240541b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/meeting/module/enterprisephone/EnterprisePhoneActivity$Companion;", "", "()V", "TAG", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.enterprisephone.EnterprisePhoneActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public static Resources m240538a(EnterprisePhoneActivity enterprisePhoneActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(enterprisePhoneActivity);
        }
        return enterprisePhoneActivity.mo213475a();
    }

    /* renamed from: b */
    private final void m240540b(Intent intent) {
        C63767p.m250331b();
        C61647c a = C61647c.m240601a(intent);
        Intrinsics.checkExpressionValueIsNotNull(a, "EnterprisePhoneDialFragm…PhoneDialInstance(intent)");
        C60752f.m236076a(this, R.id.container_enterprise_phone, a);
    }

    /* renamed from: c */
    public static AssetManager m240542c(EnterprisePhoneActivity enterprisePhoneActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(enterprisePhoneActivity);
        }
        return enterprisePhoneActivity.mo213479c();
    }

    /* renamed from: d */
    private final void m240544d(Intent intent) {
        C61648d a = C61648d.m240604a(intent);
        Intrinsics.checkExpressionValueIsNotNull(a, "EnterprisePhoneLimitatio…ceCallingInstance(intent)");
        C60752f.m236076a(this, R.id.container_enterprise_phone, a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.vc.common.base.BaseActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.vc_activity_enterprise_phone);
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        mo213477a(intent);
    }

    /* renamed from: b */
    public static void m240541b(EnterprisePhoneActivity enterprisePhoneActivity) {
        enterprisePhoneActivity.mo213478b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            EnterprisePhoneActivity enterprisePhoneActivity2 = enterprisePhoneActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    enterprisePhoneActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: c */
    private final void m240543c(Intent intent) {
        C61646b a = C61646b.m240598a(intent);
        Intrinsics.checkExpressionValueIsNotNull(a, "EnterprisePhoneCallingFr…neCallingInstance(intent)");
        C60752f.m236076a(this, R.id.container_enterprise_phone, a);
    }

    /* renamed from: a */
    public final void mo213477a(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        String stringExtra = intent.getStringExtra("fragment_type_key");
        if (TextUtils.equals(stringExtra, "fragment_type_normal_calling")) {
            C60700b.m235851b("EnterprisePhoneLog_EnterprisePhoneActivity", "[showFragment]", "replaceCallingFragment");
            m240543c(intent);
        } else if (TextUtils.equals(stringExtra, "fragment_type_limit")) {
            C60700b.m235851b("EnterprisePhoneLog_EnterprisePhoneActivity", "[showFragment2]", "replaceLimitationFragment");
            m240544d(intent);
        } else if (TextUtils.equals(stringExtra, "fragment_type_dial")) {
            C60700b.m235851b("EnterprisePhoneLog_EnterprisePhoneActivity", "[showFragment3]", "replaceDialFragment");
            m240540b(intent);
        } else if (TextUtils.equals(stringExtra, "fragment_type_dial_calling")) {
            C60700b.m235851b("EnterprisePhoneLog_EnterprisePhoneActivity", "[showFragment4]", "replaceCallingFragment from dial page");
            m240543c(intent);
        } else if (TextUtils.equals(stringExtra, "fragment_type_phone_calling")) {
            C60700b.m235851b("EnterprisePhoneLog_EnterprisePhoneActivity", "[showFragment5]", "replaceCallingFragment from other page");
            m240543c(intent);
        } else {
            C60700b.m235851b("EnterprisePhoneLog_EnterprisePhoneActivity", "[showFragment6]", "replace nothing");
        }
    }

    /* renamed from: a */
    public static void m240539a(EnterprisePhoneActivity enterprisePhoneActivity, Context context) {
        enterprisePhoneActivity.mo213476a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(enterprisePhoneActivity);
        }
    }

    /* renamed from: a */
    public static Context m240537a(EnterprisePhoneActivity enterprisePhoneActivity, Configuration configuration) {
        Context a = enterprisePhoneActivity.mo213474a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
