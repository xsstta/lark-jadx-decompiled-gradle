package com.ss.android.lark.calendar.impl.features.calendars.subscribe;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.framework.utils.KeyboardUtils;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\rH\u0014J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0010H\u0014R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeActivity;", "Lcom/ss/android/lark/calendar/impl/framework/components/CalendarBaseActivity;", "()V", "mSubscribeFragment", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeFragment;", "getMSubscribeFragment", "()Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeFragment;", "mSubscribeFragment$delegate", "Lkotlin/Lazy;", "getEnterAnimationConfig", "Lcom/ss/android/lark/base/activity/ActivityAnimationManager$AnimationConfig;", "getExitAnimationConfig", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onSaveInstanceState", "outState", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarSubscribeActivity extends CalendarBaseActivity {

    /* renamed from: a */
    private final Lazy f76496a = LazyKt.lazy(C30579a.INSTANCE);

    /* renamed from: b */
    private HashMap f76497b;

    /* renamed from: d */
    private final CalendarSubscribeFragment m113622d() {
        return (CalendarSubscribeFragment) this.f76496a.getValue();
    }

    /* renamed from: a */
    public Context mo110311a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo110312a() {
        return super.getResources();
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseActivity
    /* renamed from: a */
    public View mo108509a(int i) {
        if (this.f76497b == null) {
            this.f76497b = new HashMap();
        }
        View view = (View) this.f76497b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f76497b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo110313a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m113619a(this, context);
    }

    /* renamed from: b */
    public void mo110314b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo110315c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m113617a(this, configuration);
    }

    public AssetManager getAssets() {
        return m113621c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m113618a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m113620b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeFragment;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeActivity$a */
    static final class C30579a extends Lambda implements Function0<CalendarSubscribeFragment> {
        public static final C30579a INSTANCE = new C30579a();

        C30579a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CalendarSubscribeFragment invoke() {
            return new CalendarSubscribeFragment();
        }
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_UP_IN);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_BOTTOM_OUT);
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        if (m113622d().mo110423c()) {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onPause() {
        KeyboardUtils.hideKeyboard(this);
        super.onPause();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onSaveInstanceState(Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(bundle, "outState");
        super.onSaveInstanceState(new Bundle());
    }

    /* renamed from: a */
    public static Resources m113618a(CalendarSubscribeActivity calendarSubscribeActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(calendarSubscribeActivity);
        }
        return calendarSubscribeActivity.mo110312a();
    }

    /* renamed from: c */
    public static AssetManager m113621c(CalendarSubscribeActivity calendarSubscribeActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(calendarSubscribeActivity);
        }
        return calendarSubscribeActivity.mo110315c();
    }

    /* renamed from: b */
    public static void m113620b(CalendarSubscribeActivity calendarSubscribeActivity) {
        calendarSubscribeActivity.mo110314b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            CalendarSubscribeActivity calendarSubscribeActivity2 = calendarSubscribeActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    calendarSubscribeActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "supportFragmentManager.beginTransaction()");
        beginTransaction.add(16908290, m113622d(), (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* renamed from: a */
    public static void m113619a(CalendarSubscribeActivity calendarSubscribeActivity, Context context) {
        calendarSubscribeActivity.mo110313a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(calendarSubscribeActivity);
        }
    }

    /* renamed from: a */
    public static Context m113617a(CalendarSubscribeActivity calendarSubscribeActivity, Configuration configuration) {
        Context a = calendarSubscribeActivity.mo110311a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
