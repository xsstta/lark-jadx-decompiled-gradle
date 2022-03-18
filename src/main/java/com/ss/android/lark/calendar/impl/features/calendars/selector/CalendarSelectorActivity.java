package com.ss.android.lark.calendar.impl.features.calendars.selector;

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
import com.ss.android.lark.biz.core.api.ICoreApi;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\nH\u0016J\u0012\u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\nH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorActivity;", "Lcom/ss/android/lark/calendar/impl/framework/components/CalendarBaseActivity;", "()V", "mFragment", "Lcom/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorFragment;", "getMFragment", "()Lcom/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorFragment;", "mFragment$delegate", "Lkotlin/Lazy;", "onActivityResult", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setupFragment", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarSelectorActivity extends CalendarBaseActivity {

    /* renamed from: a */
    private final Lazy f76080a = LazyKt.lazy(C30384a.INSTANCE);

    /* renamed from: b */
    private HashMap f76081b;

    /* renamed from: d */
    private final CalendarSelectorFragment m112946d() {
        return (CalendarSelectorFragment) this.f76080a.getValue();
    }

    /* renamed from: a */
    public Context mo109703a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo109704a() {
        return super.getResources();
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseActivity
    /* renamed from: a */
    public View mo108509a(int i) {
        if (this.f76081b == null) {
            this.f76081b = new HashMap();
        }
        View view = (View) this.f76081b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f76081b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo109705a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m112943a(this, context);
    }

    /* renamed from: b */
    public void mo109706b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo109707c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m112941a(this, configuration);
    }

    public AssetManager getAssets() {
        return m112945c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m112942a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m112944b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorFragment;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorActivity$a */
    static final class C30384a extends Lambda implements Function0<CalendarSelectorFragment> {
        public static final C30384a INSTANCE = new C30384a();

        C30384a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CalendarSelectorFragment invoke() {
            return new CalendarSelectorFragment();
        }
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        if (!m112946d().mo109785d()) {
            super.onBackPressed();
        }
    }

    /* renamed from: e */
    private final void m112947e() {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "supportFragmentManager.beginTransaction()");
        beginTransaction.add(16908290, m112946d(), "CalendarSelectorFragment");
        beginTransaction.commitNowAllowingStateLoss();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m112947e();
    }

    /* renamed from: a */
    public static Resources m112942a(CalendarSelectorActivity calendarSelectorActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(calendarSelectorActivity);
        }
        return calendarSelectorActivity.mo109704a();
    }

    /* renamed from: c */
    public static AssetManager m112945c(CalendarSelectorActivity calendarSelectorActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(calendarSelectorActivity);
        }
        return calendarSelectorActivity.mo109707c();
    }

    /* renamed from: b */
    public static void m112944b(CalendarSelectorActivity calendarSelectorActivity) {
        calendarSelectorActivity.mo109706b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            CalendarSelectorActivity calendarSelectorActivity2 = calendarSelectorActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    calendarSelectorActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m112943a(CalendarSelectorActivity calendarSelectorActivity, Context context) {
        calendarSelectorActivity.mo109705a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(calendarSelectorActivity);
        }
    }

    /* renamed from: a */
    public static Context m112941a(CalendarSelectorActivity calendarSelectorActivity, Configuration configuration) {
        Context a = calendarSelectorActivity.mo109703a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        m112946d().onActivityResult(i, i2, intent);
    }
}
