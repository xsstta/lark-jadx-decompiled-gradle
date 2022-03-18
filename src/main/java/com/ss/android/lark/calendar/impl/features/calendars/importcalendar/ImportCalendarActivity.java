package com.ss.android.lark.calendar.impl.features.calendars.importcalendar;

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
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.calendar.impl.features.calendars.importcalendar.ImportCalendarFragment;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u0012\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarActivity;", "Lcom/ss/android/lark/calendar/impl/framework/components/CalendarBaseActivity;", "()V", "mImportCalendarFragment", "Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarFragment;", "getMImportCalendarFragment", "()Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarFragment;", "mImportCalendarFragment$delegate", "Lkotlin/Lazy;", "getActivityFrom", "", "getEnterAnimationConfig", "Lcom/ss/android/lark/base/activity/ActivityAnimationManager$AnimationConfig;", "getExitAnimationConfig", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNewIntent", "intent", "Landroid/content/Intent;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ImportCalendarActivity extends CalendarBaseActivity {

    /* renamed from: a */
    private final Lazy f75977a = LazyKt.lazy(C30340a.INSTANCE);

    /* renamed from: b */
    private HashMap f75978b;

    /* renamed from: d */
    private final ImportCalendarFragment m112812d() {
        return (ImportCalendarFragment) this.f75977a.getValue();
    }

    /* renamed from: a */
    public Context mo109589a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo109590a() {
        return super.getResources();
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseActivity
    /* renamed from: a */
    public View mo108509a(int i) {
        if (this.f75978b == null) {
            this.f75978b = new HashMap();
        }
        View view = (View) this.f75978b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f75978b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo109591a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m112809a(this, context);
    }

    /* renamed from: b */
    public void mo109592b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo109593c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m112807a(this, configuration);
    }

    public AssetManager getAssets() {
        return m112811c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m112808a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m112810b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarFragment;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.ImportCalendarActivity$a */
    static final class C30340a extends Lambda implements Function0<ImportCalendarFragment> {
        public static final C30340a INSTANCE = new C30340a();

        C30340a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ImportCalendarFragment invoke() {
            return new ImportCalendarFragment();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarActivity$onCreate$1", "Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarFragment$ActivityDependency;", "getActivity", "Landroid/app/Activity;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.ImportCalendarActivity$b */
    public static final class C30341b implements ImportCalendarFragment.ActivityDependency {

        /* renamed from: a */
        final /* synthetic */ ImportCalendarActivity f75979a;

        @Override // com.ss.android.lark.calendar.impl.features.calendars.importcalendar.ImportCalendarFragment.ActivityDependency
        /* renamed from: a */
        public Activity mo109596a() {
            return this.f75979a;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30341b(ImportCalendarActivity importCalendarActivity) {
            this.f75979a = importCalendarActivity;
        }
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        m112812d().mo109619d();
    }

    /* renamed from: e */
    private final int m112813e() {
        return !getIntent().getBooleanExtra("sidebar", false);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        if (m112813e() == 0) {
            return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_UP_IN);
        }
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_RIGHT_IN);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        if (m112813e() == 0) {
            return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_BOTTOM_OUT);
        }
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_RIGHT_OUT);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            m112812d().mo109615a(intent);
        }
    }

    /* renamed from: a */
    public static Resources m112808a(ImportCalendarActivity importCalendarActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(importCalendarActivity);
        }
        return importCalendarActivity.mo109590a();
    }

    /* renamed from: c */
    public static AssetManager m112811c(ImportCalendarActivity importCalendarActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(importCalendarActivity);
        }
        return importCalendarActivity.mo109593c();
    }

    /* renamed from: b */
    public static void m112810b(ImportCalendarActivity importCalendarActivity) {
        importCalendarActivity.mo109592b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            ImportCalendarActivity importCalendarActivity2 = importCalendarActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    importCalendarActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ImportCalendarFragment d = m112812d();
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        d.setArguments(intent.getExtras());
        m112812d().mo109616a(new C30341b(this));
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "supportFragmentManager.beginTransaction()");
        beginTransaction.add(16908290, m112812d(), (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* renamed from: a */
    public static void m112809a(ImportCalendarActivity importCalendarActivity, Context context) {
        importCalendarActivity.mo109591a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(importCalendarActivity);
        }
    }

    /* renamed from: a */
    public static Context m112807a(ImportCalendarActivity importCalendarActivity, Configuration configuration) {
        Context a = importCalendarActivity.mo109589a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
