package com.ss.android.lark.calendar.impl.features.calendars.profile;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1144ai;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.calendar.impl.framework.components.CalendarBaseActivity;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.p1430a.C30022a;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0018\u0018\u00002\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\r\u0010\u0017\u001a\u00020\u0018H\u0002¢\u0006\u0002\u0010\u0019J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8FX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108FX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/profile/CalendarProfileActivity;", "Lcom/ss/android/lark/calendar/impl/framework/components/CalendarBaseActivity;", "()V", "calendarId", "", "getCalendarId", "()Ljava/lang/String;", "setCalendarId", "(Ljava/lang/String;)V", "profileViewModel", "Lcom/ss/android/lark/calendar/impl/features/calendars/profile/CalendarProfileViewModel;", "getProfileViewModel", "()Lcom/ss/android/lark/calendar/impl/features/calendars/profile/CalendarProfileViewModel;", "profileViewModel$delegate", "Lkotlin/Lazy;", "viewModelProvider", "Landroidx/lifecycle/ViewModelProvider;", "getViewModelProvider", "()Landroidx/lifecycle/ViewModelProvider;", "viewModelProvider$delegate", "getEnterAnimationConfig", "Lcom/ss/android/lark/base/activity/ActivityAnimationManager$AnimationConfig;", "getExitAnimationConfig", "getProfileActivityDependency", "com/ss/android/lark/calendar/impl/features/calendars/profile/CalendarProfileActivity$getProfileActivityDependency$1", "()Lcom/ss/android/lark/calendar/impl/features/calendars/profile/CalendarProfileActivity$getProfileActivityDependency$1;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "ActivityDependency", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarProfileActivity extends CalendarBaseActivity {

    /* renamed from: a */
    private String f76055a = "";

    /* renamed from: b */
    private final Lazy f76056b = LazyKt.lazy(new C30372d(this));

    /* renamed from: c */
    private final Lazy f76057c = LazyKt.lazy(new C30371c(this));

    /* renamed from: d */
    private HashMap f76058d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/profile/CalendarProfileActivity$ActivityDependency;", "", "routeCalendarSelectorActivity", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.profile.CalendarProfileActivity$a */
    public interface ActivityDependency {
        /* renamed from: a */
        void mo109674a();
    }

    /* renamed from: a */
    public Context mo109664a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseActivity
    /* renamed from: a */
    public View mo108509a(int i) {
        if (this.f76058d == null) {
            this.f76058d = new HashMap();
        }
        View view = (View) this.f76058d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f76058d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo109666a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m112905a(this, context);
    }

    /* renamed from: b */
    public final C1144ai mo109667b() {
        return (C1144ai) this.f76056b.getValue();
    }

    /* renamed from: c */
    public final CalendarProfileViewModel mo109668c() {
        return (CalendarProfileViewModel) this.f76057c.getValue();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m112903a(this, configuration);
    }

    /* renamed from: d */
    public Resources mo109670d() {
        return super.getResources();
    }

    /* renamed from: e */
    public void mo109671e() {
        super.onStop();
    }

    /* renamed from: f */
    public AssetManager mo109672f() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m112907c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m112904a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m112906b(this);
    }

    /* renamed from: a */
    public final String mo109665a() {
        return this.f76055a;
    }

    /* renamed from: g */
    private final C30370b m112908g() {
        return new C30370b(this);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_UP_IN);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_BOTTOM_OUT);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/calendars/profile/CalendarProfileViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.profile.CalendarProfileActivity$c */
    static final class C30371c extends Lambda implements Function0<CalendarProfileViewModel> {
        final /* synthetic */ CalendarProfileActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30371c(CalendarProfileActivity calendarProfileActivity) {
            super(0);
            this.this$0 = calendarProfileActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CalendarProfileViewModel invoke() {
            return (CalendarProfileViewModel) this.this$0.mo109667b().mo6005a(CalendarProfileViewModel.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.profile.CalendarProfileActivity$d */
    static final class C30372d extends Lambda implements Function0<C1144ai> {
        final /* synthetic */ CalendarProfileActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30372d(CalendarProfileActivity calendarProfileActivity) {
            super(0);
            this.this$0 = calendarProfileActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C1144ai invoke() {
            return new C1144ai(this.this$0, new C1144ai.AbstractC1146b(this) {
                /* class com.ss.android.lark.calendar.impl.features.calendars.profile.CalendarProfileActivity.C30372d.C303731 */

                /* renamed from: a */
                final /* synthetic */ C30372d f76060a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f76060a = r1;
                }

                @Override // androidx.lifecycle.C1144ai.AbstractC1146b
                public <T extends AbstractC1142af> T create(Class<T> cls) {
                    Intrinsics.checkParameterIsNotNull(cls, "modelClass");
                    return new CalendarProfileViewModel(this.f76060a.this$0.mo109665a());
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/profile/CalendarProfileActivity$getProfileActivityDependency$1", "Lcom/ss/android/lark/calendar/impl/features/calendars/profile/CalendarProfileActivity$ActivityDependency;", "routeCalendarSelectorActivity", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.profile.CalendarProfileActivity$b */
    public static final class C30370b implements ActivityDependency {

        /* renamed from: a */
        final /* synthetic */ CalendarProfileActivity f76059a;

        @Override // com.ss.android.lark.calendar.impl.features.calendars.profile.CalendarProfileActivity.ActivityDependency
        /* renamed from: a */
        public void mo109674a() {
            GeneralHitPoint.m124222a(false, this.f76059a.mo109665a());
            Bundle bundle = new Bundle();
            bundle.putBoolean("cal_route_calendar_list_from_tab", true);
            bundle.putString("calendar_id", this.f76059a.mo109665a());
            C30022a.f74882a.mainModuleDependency().mo108278a(this.f76059a, bundle);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30370b(CalendarProfileActivity calendarProfileActivity) {
            this.f76059a = calendarProfileActivity;
        }
    }

    /* renamed from: a */
    public static Resources m112904a(CalendarProfileActivity calendarProfileActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(calendarProfileActivity);
        }
        return calendarProfileActivity.mo109670d();
    }

    /* renamed from: c */
    public static AssetManager m112907c(CalendarProfileActivity calendarProfileActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(calendarProfileActivity);
        }
        return calendarProfileActivity.mo109672f();
    }

    /* renamed from: b */
    public static void m112906b(CalendarProfileActivity calendarProfileActivity) {
        calendarProfileActivity.mo109671e();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            CalendarProfileActivity calendarProfileActivity2 = calendarProfileActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    calendarProfileActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        setContentView(R.layout.activity_calendar_profile_layout);
        Bundle bundle2 = this.mBundle;
        String str = "";
        if (!(bundle2 == null || (string = bundle2.getString("calendar_id", str)) == null)) {
            str = string;
        }
        this.f76055a = str;
        RelativeLayout relativeLayout = (RelativeLayout) mo108509a(R.id.profileRootView);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "profileRootView");
        new CalendarProfileView(relativeLayout, this, m112908g(), mo109667b()).mo109678b();
        mo109668c().create();
    }

    /* renamed from: a */
    public static void m112905a(CalendarProfileActivity calendarProfileActivity, Context context) {
        calendarProfileActivity.mo109666a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(calendarProfileActivity);
        }
    }

    /* renamed from: a */
    public static Context m112903a(CalendarProfileActivity calendarProfileActivity, Configuration configuration) {
        Context a = calendarProfileActivity.mo109664a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
