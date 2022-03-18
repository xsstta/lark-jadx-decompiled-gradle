package com.ss.android.lark.contact.impl.contacts_email.edit;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\"\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\nH\u0016J\u0012\u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0014J\b\u0010\u0013\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_email/edit/CardEditActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "cardEditFragment", "Lcom/ss/android/lark/contact/impl/contacts_email/edit/CardEditFragment;", "checkValid", "", "bundle", "Landroid/os/Bundle;", "onActivityResult", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "setupFragment", "Companion", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CardEditActivity extends BaseFragmentActivity {

    /* renamed from: a */
    public static final Companion f91890a = new Companion(null);

    /* renamed from: b */
    private CardEditFragment f91891b;

    /* renamed from: a */
    public Context mo131041a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo131042a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo131043a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m139037a(this, context);
    }

    /* renamed from: b */
    public void mo131044b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo131045c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m139035a(this, configuration);
    }

    public AssetManager getAssets() {
        return m139040c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m139036a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m139039b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fXT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_email/edit/CardEditActivity$Companion;", "", "()V", "KEY_CARD_ID", "", "KEY_COUNTRY_BEAN", "KEY_EMAIL", "KEY_ENTER_MODE", "KEY_NAME", "MODE_CREATE", "MODE_EDIT", "REQUEST_CODE_COUNTRY_SELECT", "", "SOURCE_CARD_EDIT", "TAG", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.edit.CardEditActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        CardEditFragment aVar = this.f91891b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardEditFragment");
        }
        aVar.mo131049b();
    }

    /* renamed from: d */
    private final void m139041d() {
        CardEditFragment aVar = new CardEditFragment();
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        aVar.setArguments(intent.getExtras());
        this.f91891b = aVar;
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "supportFragmentManager.beginTransaction()");
        CardEditFragment aVar2 = this.f91891b;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardEditFragment");
        }
        beginTransaction.add(16908290, aVar2, "CardEditFragment");
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* renamed from: a */
    public static Resources m139036a(CardEditActivity cardEditActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(cardEditActivity);
        }
        return cardEditActivity.mo131042a();
    }

    /* renamed from: c */
    public static AssetManager m139040c(CardEditActivity cardEditActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(cardEditActivity);
        }
        return cardEditActivity.mo131045c();
    }

    /* renamed from: b */
    public static void m139039b(CardEditActivity cardEditActivity) {
        cardEditActivity.mo131044b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            CardEditActivity cardEditActivity2 = cardEditActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    cardEditActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            bundle2 = intent.getExtras();
        } else {
            bundle2 = null;
        }
        if (!m139038a(bundle2)) {
            Log.m165397w("BusinessCardEditActivity", "open business card edit failed");
            finish();
            return;
        }
        m139041d();
    }

    /* renamed from: a */
    private final boolean m139038a(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        String string = bundle.getString("key_enter_mode");
        String string2 = bundle.getString("card_id");
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        if ("mode_create".equals(string)) {
            return true;
        }
        return !TextUtils.isEmpty(string2);
    }

    /* renamed from: a */
    public static void m139037a(CardEditActivity cardEditActivity, Context context) {
        cardEditActivity.mo131043a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(cardEditActivity);
        }
    }

    /* renamed from: a */
    public static Context m139035a(CardEditActivity cardEditActivity, Configuration configuration) {
        Context a = cardEditActivity.mo131041a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        CardEditFragment aVar = this.f91891b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardEditFragment");
        }
        aVar.onActivityResult(i, i2, intent);
    }
}
