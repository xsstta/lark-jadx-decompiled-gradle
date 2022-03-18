package com.ss.android.lark.calendar.impl.features.settings.account;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.calendar.impl.features.settings.account.AccountManageFragment;
import com.ss.android.lark.calendar.impl.framework.components.CalendarBaseActivity;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\"\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\rH\u0016J\u0012\u0010\u0014\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageActivity;", "Lcom/ss/android/lark/calendar/impl/framework/components/CalendarBaseActivity;", "()V", "mAccountManageFragment", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageFragment;", "getMAccountManageFragment", "()Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageFragment;", "mAccountManageFragment$delegate", "Lkotlin/Lazy;", "getEnterAnimationConfig", "Lcom/ss/android/lark/base/activity/ActivityAnimationManager$AnimationConfig;", "getExitAnimationConfig", "onActivityResult", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AccountManageActivity extends CalendarBaseActivity {

    /* renamed from: a */
    private final Lazy f83015a = LazyKt.lazy(C32399a.INSTANCE);

    /* renamed from: b */
    private HashMap f83016b;

    /* renamed from: d */
    private final AccountManageFragment m123654d() {
        return (AccountManageFragment) this.f83015a.getValue();
    }

    /* renamed from: a */
    public Context mo118389a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo118390a() {
        return super.getResources();
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseActivity
    /* renamed from: a */
    public View mo108509a(int i) {
        if (this.f83016b == null) {
            this.f83016b = new HashMap();
        }
        View view = (View) this.f83016b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f83016b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo118391a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m123651a(this, context);
    }

    /* renamed from: b */
    public void mo118392b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo118393c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m123649a(this, configuration);
    }

    public AssetManager getAssets() {
        return m123653c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m123650a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m123652b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageFragment;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.AccountManageActivity$a */
    static final class C32399a extends Lambda implements Function0<AccountManageFragment> {
        public static final C32399a INSTANCE = new C32399a();

        C32399a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AccountManageFragment invoke() {
            return new AccountManageFragment();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/impl/features/settings/account/AccountManageActivity$onCreate$1", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageFragment$ActivityDependency;", "getActivity", "Landroid/app/Activity;", "updateStatusBarColor", "", "colorRes", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.AccountManageActivity$b */
    public static final class C32400b implements AccountManageFragment.ActivityDependency {

        /* renamed from: a */
        final /* synthetic */ AccountManageActivity f83017a;

        @Override // com.ss.android.lark.calendar.impl.features.settings.account.AccountManageFragment.ActivityDependency
        /* renamed from: a */
        public Activity mo118396a() {
            return this.f83017a;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32400b(AccountManageActivity accountManageActivity) {
            this.f83017a = accountManageActivity;
        }

        @Override // com.ss.android.lark.calendar.impl.features.settings.account.AccountManageFragment.ActivityDependency
        /* renamed from: a */
        public void mo118397a(int i) {
            this.f83017a.setStatusBarColorResource(i);
        }
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_RIGHT_IN);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_RIGHT_OUT);
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        m123654d().mo118440d();
    }

    /* renamed from: a */
    public static Resources m123650a(AccountManageActivity accountManageActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(accountManageActivity);
        }
        return accountManageActivity.mo118390a();
    }

    /* renamed from: c */
    public static AssetManager m123653c(AccountManageActivity accountManageActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(accountManageActivity);
        }
        return accountManageActivity.mo118393c();
    }

    /* renamed from: b */
    public static void m123652b(AccountManageActivity accountManageActivity) {
        accountManageActivity.mo118392b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            AccountManageActivity accountManageActivity2 = accountManageActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    accountManageActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m123654d().mo118437a(new C32400b(this));
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "supportFragmentManager.beginTransaction()");
        beginTransaction.replace(16908290, m123654d(), (String) null);
        beginTransaction.commitNowAllowingStateLoss();
        setStatusBarColorResource(R.color.bg_base);
    }

    /* renamed from: a */
    public static void m123651a(AccountManageActivity accountManageActivity, Context context) {
        accountManageActivity.mo118391a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(accountManageActivity);
        }
    }

    /* renamed from: a */
    public static Context m123649a(AccountManageActivity accountManageActivity, Configuration configuration) {
        Context a = accountManageActivity.mo118389a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        m123654d().onActivityResult(i, i2, intent);
    }
}
