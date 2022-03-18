package com.ss.android.lark.calendar.impl.features.preempt;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.calendar.impl.features.events.detail.C31238b;
import com.ss.android.lark.calendar.impl.features.preempt.PreemptPresenter;
import com.ss.android.lark.calendar.impl.framework.components.CalendarBaseActivity;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0004\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u0012\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u001f\u001a\u00020\u001cH\u0014J\b\u0010 \u001a\u00020\u001cH\u0014J\b\u0010!\u001a\u00020\u001cH\u0014R\u0010\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0005R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/preempt/PreemptActivity;", "Lcom/ss/android/lark/calendar/impl/framework/components/CalendarBaseActivity;", "()V", "activityDependency", "com/ss/android/lark/calendar/impl/features/preempt/PreemptActivity$activityDependency$1", "Lcom/ss/android/lark/calendar/impl/features/preempt/PreemptActivity$activityDependency$1;", "mExtras", "Landroid/os/Bundle;", "preemptModel", "Lcom/ss/android/lark/calendar/impl/features/preempt/PreemptModel;", "getPreemptModel", "()Lcom/ss/android/lark/calendar/impl/features/preempt/PreemptModel;", "preemptModel$delegate", "Lkotlin/Lazy;", "preemptPresenter", "Lcom/ss/android/lark/calendar/impl/features/preempt/PreemptPresenter;", "getPreemptPresenter", "()Lcom/ss/android/lark/calendar/impl/features/preempt/PreemptPresenter;", "preemptPresenter$delegate", "preemptView", "Lcom/ss/android/lark/calendar/impl/features/preempt/PreemptView;", "getPreemptView", "()Lcom/ss/android/lark/calendar/impl/features/preempt/PreemptView;", "preemptView$delegate", "getEnterAnimationConfig", "Lcom/ss/android/lark/base/activity/ActivityAnimationManager$AnimationConfig;", "getExitAnimationConfig", "initMVP", "", "onCreate", "savedInstanceState", "onDestroy", "onStart", "onStop", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PreemptActivity extends CalendarBaseActivity {

    /* renamed from: c */
    public static final Companion f82416c = new Companion(null);

    /* renamed from: a */
    public Bundle f82417a;

    /* renamed from: b */
    public final C32226b f82418b = new C32226b(this);

    /* renamed from: d */
    private final Lazy f82419d = LazyKt.lazy(new C32229e(this));

    /* renamed from: e */
    private final Lazy f82420e = LazyKt.lazy(new C32227c(this));

    /* renamed from: f */
    private final Lazy f82421f = LazyKt.lazy(new C32228d(this));

    /* renamed from: g */
    private HashMap f82422g;

    /* renamed from: f */
    private final PreemptPresenter m122831f() {
        return (PreemptPresenter) this.f82421f.getValue();
    }

    /* renamed from: a */
    public Context mo117789a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseActivity
    /* renamed from: a */
    public View mo108509a(int i) {
        if (this.f82422g == null) {
            this.f82422g = new HashMap();
        }
        View view = (View) this.f82422g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f82422g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final PreemptView mo117790a() {
        return (PreemptView) this.f82419d.getValue();
    }

    /* renamed from: a */
    public void mo117791a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m122828a(this, context);
    }

    /* renamed from: b */
    public final PreemptModel mo117792b() {
        return (PreemptModel) this.f82420e.getValue();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m122826a(this, configuration);
    }

    /* renamed from: d */
    public Resources mo117795d() {
        return super.getResources();
    }

    /* renamed from: e */
    public AssetManager mo117796e() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m122830c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m122829b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m122827a(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/preempt/PreemptActivity$Companion;", "", "()V", "PATH_CALENDAR_PREEMPT", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.preempt.PreemptActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g */
    private final void m122832g() {
        m122831f().create();
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_RIGHT_IN);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_LEFT_OUT);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/preempt/PreemptModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.preempt.PreemptActivity$c */
    static final class C32227c extends Lambda implements Function0<PreemptModel> {
        final /* synthetic */ PreemptActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32227c(PreemptActivity preemptActivity) {
            super(0);
            this.this$0 = preemptActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final PreemptModel invoke() {
            return new PreemptModel(this.this$0.f82417a);
        }
    }

    /* renamed from: c */
    public void mo117793c() {
        super.onStop();
        m122831f().mo117881d();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        m122831f().destroy();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStart() {
        super.onStart();
        m122831f().mo117880c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/preempt/PreemptPresenter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.preempt.PreemptActivity$d */
    static final class C32228d extends Lambda implements Function0<PreemptPresenter> {
        final /* synthetic */ PreemptActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32228d(PreemptActivity preemptActivity) {
            super(0);
            this.this$0 = preemptActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final PreemptPresenter invoke() {
            return new PreemptPresenter(this.this$0.mo117792b(), this.this$0.mo117790a(), this.this$0.f82418b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/preempt/PreemptView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.preempt.PreemptActivity$e */
    static final class C32229e extends Lambda implements Function0<PreemptView> {
        final /* synthetic */ PreemptActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32229e(PreemptActivity preemptActivity) {
            super(0);
            this.this$0 = preemptActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final PreemptView invoke() {
            RelativeLayout relativeLayout = (RelativeLayout) this.this$0.mo108509a(R.id.preemptActivityRoot);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "preemptActivityRoot");
            return new PreemptView(relativeLayout);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/calendar/impl/features/preempt/PreemptActivity$activityDependency$1", "Lcom/ss/android/lark/calendar/impl/features/preempt/PreemptPresenter$ActivityDependency;", "finishActivity", "", "setActivityResult", "resultCode", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "startEventDetailActivity", "calendarEvent", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.preempt.PreemptActivity$b */
    public static final class C32226b implements PreemptPresenter.ActivityDependency {

        /* renamed from: a */
        final /* synthetic */ PreemptActivity f82423a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32226b(PreemptActivity preemptActivity) {
            this.f82423a = preemptActivity;
        }

        @Override // com.ss.android.lark.calendar.impl.features.preempt.PreemptPresenter.ActivityDependency
        /* renamed from: a */
        public void mo117798a(CalendarEvent calendarEvent) {
            Intrinsics.checkParameterIsNotNull(calendarEvent, "calendarEvent");
            C31238b.m116871a((Context) this.f82423a, calendarEvent);
            this.f82423a.finish();
        }
    }

    /* renamed from: b */
    public static Resources m122829b(PreemptActivity preemptActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(preemptActivity);
        }
        return preemptActivity.mo117795d();
    }

    /* renamed from: c */
    public static AssetManager m122830c(PreemptActivity preemptActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(preemptActivity);
        }
        return preemptActivity.mo117796e();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.calendar_preempt_meeting_room);
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        this.f82417a = intent.getExtras();
        m122832g();
    }

    /* renamed from: a */
    public static void m122827a(PreemptActivity preemptActivity) {
        preemptActivity.mo117793c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            PreemptActivity preemptActivity2 = preemptActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    preemptActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m122828a(PreemptActivity preemptActivity, Context context) {
        preemptActivity.mo117791a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(preemptActivity);
        }
    }

    /* renamed from: a */
    public static Context m122826a(PreemptActivity preemptActivity, Configuration configuration) {
        Context a = preemptActivity.mo117789a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
