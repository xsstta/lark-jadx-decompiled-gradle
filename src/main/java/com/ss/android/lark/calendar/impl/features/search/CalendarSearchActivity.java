package com.ss.android.lark.calendar.impl.features.search;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.calendar.impl.features.meetingroom.profile.MeetingRoomProfileActivityEntrance;
import com.ss.android.lark.calendar.impl.features.search.CalendarSearchPresenter;
import com.ss.android.lark.calendar.impl.framework.components.CalendarBaseActivity;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+B\u0005¢\u0006\u0002\u0010\u0003J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u000bH\u0016J\u0018\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0018\u001a\u00020\u000bH\u0002J\"\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u000bH\u0016J\u0012\u0010\u001f\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\b\u0010\"\u001a\u00020\u000bH\u0014J\u0010\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020!H\u0014J\u0018\u0010%\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010&\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020\u000bH\u0016J\u0018\u0010*\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006,"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/CalendarSearchActivity;", "Lcom/ss/android/lark/calendar/impl/framework/components/CalendarBaseActivity;", "Lcom/ss/android/lark/calendar/impl/features/search/CalendarSearchPresenter$ActivityDependency;", "()V", "presenter", "Lcom/ss/android/lark/calendar/impl/features/search/CalendarSearchPresenter;", "getPresenter", "()Lcom/ss/android/lark/calendar/impl/features/search/CalendarSearchPresenter;", "setPresenter", "(Lcom/ss/android/lark/calendar/impl/features/search/CalendarSearchPresenter;)V", "addFragment", "", "fragment", "Landroidx/fragment/app/Fragment;", "containerId", "", "isUseAnimation", "", "finishActivity", "finishAllSearchActivity", "getActivityContext", "Landroid/app/Activity;", "hideEditTextKeyBoard", "hideFragment", "initMvp", "onActivityResult", "requestCode", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onSaveInstanceState", "outState", "removeFragment", "routeMeetingRoomActivity", "calendarId", "", "showEditTextKeyBoard", "showFragment", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarSearchActivity extends CalendarBaseActivity implements CalendarSearchPresenter.ActivityDependency {

    /* renamed from: b */
    public static String f82566b;

    /* renamed from: c */
    public static final Companion f82567c = new Companion(null);

    /* renamed from: a */
    public CalendarSearchPresenter f82568a;

    /* renamed from: d */
    private HashMap f82569d;

    @Override // com.ss.android.lark.calendar.impl.features.search.CalendarSearchPresenter.ActivityDependency
    /* renamed from: a */
    public Activity mo117938a() {
        return this;
    }

    /* renamed from: a */
    public Context mo117939a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseActivity
    /* renamed from: a */
    public View mo108509a(int i) {
        if (this.f82569d == null) {
            this.f82569d = new HashMap();
        }
        View view = (View) this.f82569d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f82569d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo117940a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m123064a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m123062a(this, configuration);
    }

    /* renamed from: d */
    public Resources mo117950d() {
        return super.getResources();
    }

    /* renamed from: e */
    public void mo117951e() {
        super.onStop();
    }

    /* renamed from: f */
    public AssetManager mo117952f() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m123066c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m123063a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m123065b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/CalendarSearchActivity$Companion;", "", "()V", "ACTIVITY_PARAM_SEARCH_KEY", "", "tabPageName", "getTabPageName", "()Ljava/lang/String;", "setTabPageName", "(Ljava/lang/String;)V", "startCalendarSearchActivity", "", "context", "Landroid/content/Context;", "searchKey", "pageName", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.CalendarSearchActivity$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final void mo117955a(String str) {
            CalendarSearchActivity.f82566b = str;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo117954a(Context context, String str, String str2) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "searchKey");
            Intrinsics.checkParameterIsNotNull(str2, "pageName");
            Intent intent = new Intent(context, CalendarSearchActivity.class);
            intent.putExtra("search_key", str);
            if (context instanceof Activity) {
                context.startActivity(intent);
            } else {
                intent.addFlags(268435456);
                context.startActivity(intent);
            }
            mo117955a(str2);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.search.CalendarSearchPresenter.ActivityDependency
    /* renamed from: b */
    public void mo117945b() {
        KeyboardUtils.showKeyboard((EditText) mo108509a(R.id.etSearch));
    }

    @Override // com.ss.android.lark.calendar.impl.features.search.CalendarSearchPresenter.ActivityDependency
    /* renamed from: c */
    public void mo117947c() {
        KeyboardUtils.hideKeyboard(this, getCurrentFocus());
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        CalendarSearchPresenter calendarSearchPresenter = this.f82568a;
        if (calendarSearchPresenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        calendarSearchPresenter.mo117964c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        CalendarSearchPresenter calendarSearchPresenter = this.f82568a;
        if (calendarSearchPresenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        calendarSearchPresenter.destroy();
    }

    /* renamed from: g */
    private final void m123067g() {
        FrameLayout frameLayout = (FrameLayout) mo108509a(R.id.rootView);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "rootView");
        CalendarSearchView bVar = new CalendarSearchView(frameLayout);
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        CalendarSearchPresenter calendarSearchPresenter = new CalendarSearchPresenter(bVar, new CalendarSearchModel(), this, intent);
        this.f82568a = calendarSearchPresenter;
        if (calendarSearchPresenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        calendarSearchPresenter.create();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_calendar_search);
        m123067g();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onSaveInstanceState(Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(bundle, "outState");
        super.onSaveInstanceState(new Bundle());
    }

    /* renamed from: a */
    public static Resources m123063a(CalendarSearchActivity calendarSearchActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(calendarSearchActivity);
        }
        return calendarSearchActivity.mo117950d();
    }

    /* renamed from: c */
    public static AssetManager m123066c(CalendarSearchActivity calendarSearchActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(calendarSearchActivity);
        }
        return calendarSearchActivity.mo117952f();
    }

    /* renamed from: b */
    public static void m123065b(CalendarSearchActivity calendarSearchActivity) {
        calendarSearchActivity.mo117951e();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            CalendarSearchActivity calendarSearchActivity2 = calendarSearchActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    calendarSearchActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.search.CalendarSearchPresenter.ActivityDependency
    /* renamed from: a */
    public void mo117943a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        MeetingRoomProfileActivityEntrance.f82147a.mo117232a(this, str);
        GeneralHitPoint.m124201a("cal_mtroom_search", (String) null, 2, (Object) null);
    }

    @Override // com.ss.android.lark.calendar.impl.features.search.CalendarSearchPresenter.ActivityDependency
    /* renamed from: a */
    public void mo117944a(boolean z) {
        String str;
        finish();
        if (z && (str = f82566b) != null) {
            C30022a.f74882a.searchModuleDependency().mo108175a(mo117938a(), str);
        }
        mo117947c();
    }

    /* renamed from: a */
    public static void m123064a(CalendarSearchActivity calendarSearchActivity, Context context) {
        calendarSearchActivity.mo117940a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(calendarSearchActivity);
        }
    }

    /* renamed from: a */
    public static Context m123062a(CalendarSearchActivity calendarSearchActivity, Configuration configuration) {
        Context a = calendarSearchActivity.mo117939a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    @Override // com.ss.android.lark.calendar.impl.features.search.CalendarSearchPresenter.ActivityDependency
    /* renamed from: c */
    public void mo117948c(Fragment fragment, boolean z) {
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "supportFragmentManager.beginTransaction()");
        if (z) {
            beginTransaction.setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out);
        }
        beginTransaction.remove(fragment).commitAllowingStateLoss();
        getSupportFragmentManager().executePendingTransactions();
    }

    @Override // com.ss.android.lark.calendar.impl.features.search.CalendarSearchPresenter.ActivityDependency
    /* renamed from: b */
    public void mo117946b(Fragment fragment, boolean z) {
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "supportFragmentManager.beginTransaction()");
        if (z) {
            beginTransaction.setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out);
        }
        beginTransaction.hide(fragment).commitAllowingStateLoss();
        getSupportFragmentManager().executePendingTransactions();
    }

    @Override // com.ss.android.lark.calendar.impl.features.search.CalendarSearchPresenter.ActivityDependency
    /* renamed from: a */
    public void mo117942a(Fragment fragment, boolean z) {
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "supportFragmentManager.beginTransaction()");
        if (z) {
            beginTransaction.setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out);
        }
        beginTransaction.show(fragment).commitAllowingStateLoss();
        getSupportFragmentManager().executePendingTransactions();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        CalendarSearchPresenter calendarSearchPresenter = this.f82568a;
        if (calendarSearchPresenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        calendarSearchPresenter.mo117958a(i, i2, intent);
    }

    @Override // com.ss.android.lark.calendar.impl.features.search.CalendarSearchPresenter.ActivityDependency
    /* renamed from: a */
    public void mo117941a(Fragment fragment, int i, boolean z) {
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "supportFragmentManager.beginTransaction()");
        if (z) {
            beginTransaction.setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out);
        }
        beginTransaction.add(i, fragment, (String) null).commitAllowingStateLoss();
        getSupportFragmentManager().executePendingTransactions();
    }
}
