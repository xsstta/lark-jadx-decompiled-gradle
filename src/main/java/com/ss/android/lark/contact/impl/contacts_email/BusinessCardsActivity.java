package com.ss.android.lark.contact.impl.contacts_email;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\u0012\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_email/BusinessCardsActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "fragment", "Lcom/ss/android/lark/contact/impl/contacts_email/BusinessCardsFragment;", "onActivityResult", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setupFragment", "Companion", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class BusinessCardsActivity extends BaseFragmentActivity {

    /* renamed from: a */
    public static final Companion f91839a = new Companion(null);

    /* renamed from: b */
    private BusinessCardsFragment f91840b;

    /* renamed from: a */
    public Context mo130975a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo130976a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo130977a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m138956a(this, context);
    }

    /* renamed from: b */
    public void mo130978b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo130979c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m138954a(this, configuration);
    }

    public AssetManager getAssets() {
        return m138958c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m138955a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m138957b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_email/BusinessCardsActivity$Companion;", "", "()V", "KEY_CARD_EDITED", "", "REQUEST_CODE_CREATE_CARD", "", "REQUEST_CODE_PROFILE", "TAG", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.BusinessCardsActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: d */
    private final void m138959d() {
        BusinessCardsFragment bVar = new BusinessCardsFragment();
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        bVar.setArguments(intent.getExtras());
        this.f91840b = bVar;
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "supportFragmentManager.beginTransaction()");
        BusinessCardsFragment bVar2 = this.f91840b;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragment");
        }
        beginTransaction.add(16908290, bVar2, "BusinessCardsFragment");
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m138959d();
    }

    /* renamed from: a */
    public static Resources m138955a(BusinessCardsActivity businessCardsActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(businessCardsActivity);
        }
        return businessCardsActivity.mo130976a();
    }

    /* renamed from: c */
    public static AssetManager m138958c(BusinessCardsActivity businessCardsActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(businessCardsActivity);
        }
        return businessCardsActivity.mo130979c();
    }

    /* renamed from: b */
    public static void m138957b(BusinessCardsActivity businessCardsActivity) {
        businessCardsActivity.mo130978b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            BusinessCardsActivity businessCardsActivity2 = businessCardsActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    businessCardsActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m138956a(BusinessCardsActivity businessCardsActivity, Context context) {
        businessCardsActivity.mo130977a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(businessCardsActivity);
        }
    }

    /* renamed from: a */
    public static Context m138954a(BusinessCardsActivity businessCardsActivity, Configuration configuration) {
        Context a = businessCardsActivity.mo130975a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        BusinessCardsFragment bVar = this.f91840b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragment");
        }
        bVar.onActivityResult(i, i2, intent);
    }
}
