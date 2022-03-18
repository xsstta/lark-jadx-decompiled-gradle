package com.ss.android.lark.calendar.impl.features.events.edit.mail;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.calendar.impl.features.events.edit.mail.AddMailAttendeePresenter;
import com.ss.android.lark.calendar.impl.framework.components.CalendarBaseActivity;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeActivity;", "Lcom/ss/android/lark/calendar/impl/framework/components/CalendarBaseActivity;", "()V", "model", "Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeModel;", "getModel", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeModel;", "model$delegate", "Lkotlin/Lazy;", "presenter", "Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeePresenter;", "getPresenter", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeePresenter;", "presenter$delegate", "view", "Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeView;", "getView", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeView;", "view$delegate", "getEnterAnimationConfig", "Lcom/ss/android/lark/base/activity/ActivityAnimationManager$AnimationConfig;", "getExitAnimationConfig", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AddMailAttendeeActivity extends CalendarBaseActivity {

    /* renamed from: a */
    private final Lazy f81214a = LazyKt.lazy(new C31869d(this));

    /* renamed from: b */
    private final Lazy f81215b = LazyKt.lazy(C31866a.INSTANCE);

    /* renamed from: c */
    private final Lazy f81216c = LazyKt.lazy(new C31868c(this));

    /* renamed from: d */
    private HashMap f81217d;

    /* renamed from: f */
    private final AddMailAttendeePresenter m120994f() {
        return (AddMailAttendeePresenter) this.f81216c.getValue();
    }

    /* renamed from: a */
    public Context mo116132a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseActivity
    /* renamed from: a */
    public View mo108509a(int i) {
        if (this.f81217d == null) {
            this.f81217d = new HashMap();
        }
        View view = (View) this.f81217d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f81217d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final AddMailAttendeeView mo116133a() {
        return (AddMailAttendeeView) this.f81214a.getValue();
    }

    /* renamed from: a */
    public void mo116134a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m120991a(this, context);
    }

    /* renamed from: b */
    public final AddMailAttendeeModel mo116135b() {
        return (AddMailAttendeeModel) this.f81215b.getValue();
    }

    /* renamed from: c */
    public Resources mo116136c() {
        return super.getResources();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m120989a(this, configuration);
    }

    /* renamed from: d */
    public void mo116138d() {
        super.onStop();
    }

    /* renamed from: e */
    public AssetManager mo116139e() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m120993c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m120990a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m120992b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.mail.AddMailAttendeeActivity$a */
    static final class C31866a extends Lambda implements Function0<AddMailAttendeeModel> {
        public static final C31866a INSTANCE = new C31866a();

        C31866a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AddMailAttendeeModel invoke() {
            return new AddMailAttendeeModel();
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
        super.onBackPressed();
        finish();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeePresenter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.mail.AddMailAttendeeActivity$c */
    static final class C31868c extends Lambda implements Function0<AddMailAttendeePresenter> {
        final /* synthetic */ AddMailAttendeeActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31868c(AddMailAttendeeActivity addMailAttendeeActivity) {
            super(0);
            this.this$0 = addMailAttendeeActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final AddMailAttendeePresenter invoke() {
            return new AddMailAttendeePresenter(this.this$0.mo116133a(), this.this$0.mo116135b());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.mail.AddMailAttendeeActivity$d */
    static final class C31869d extends Lambda implements Function0<AddMailAttendeeView> {
        final /* synthetic */ AddMailAttendeeActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31869d(AddMailAttendeeActivity addMailAttendeeActivity) {
            super(0);
            this.this$0 = addMailAttendeeActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final AddMailAttendeeView invoke() {
            LinearLayout linearLayout = (LinearLayout) this.this$0.mo108509a(R.id.activityRoot);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "activityRoot");
            return new AddMailAttendeeView(linearLayout, this.this$0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeActivity$onCreate$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeePresenter$ActivityDependency;", "finishActivityWithIntent", "", "intent", "Landroid/content/Intent;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.mail.AddMailAttendeeActivity$b */
    public static final class C31867b implements AddMailAttendeePresenter.ActivityDependency {

        /* renamed from: a */
        final /* synthetic */ AddMailAttendeeActivity f81218a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31867b(AddMailAttendeeActivity addMailAttendeeActivity) {
            this.f81218a = addMailAttendeeActivity;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.mail.AddMailAttendeePresenter.ActivityDependency
        /* renamed from: a */
        public void mo116141a(Intent intent) {
            Intrinsics.checkParameterIsNotNull(intent, "intent");
            this.f81218a.setResult(-1, intent);
            this.f81218a.finish();
        }
    }

    /* renamed from: a */
    public static Resources m120990a(AddMailAttendeeActivity addMailAttendeeActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(addMailAttendeeActivity);
        }
        return addMailAttendeeActivity.mo116136c();
    }

    /* renamed from: c */
    public static AssetManager m120993c(AddMailAttendeeActivity addMailAttendeeActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(addMailAttendeeActivity);
        }
        return addMailAttendeeActivity.mo116139e();
    }

    /* renamed from: b */
    public static void m120992b(AddMailAttendeeActivity addMailAttendeeActivity) {
        addMailAttendeeActivity.mo116138d();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            AddMailAttendeeActivity addMailAttendeeActivity2 = addMailAttendeeActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    addMailAttendeeActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activty_append_add_mail_attendee);
        AddMailAttendeeModel b = mo116135b();
        Serializable serializableExtra = getIntent().getSerializableExtra("external_attendee_emails");
        if (serializableExtra != null) {
            b.mo116167a((ArrayList) serializableExtra);
            m120994f().mo116170a(new C31867b(this));
            m120994f().create();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.ArrayList<com.ss.android.lark.calendar.impl.features.events.edit.mail.AddMailAttendeeData> /* = java.util.ArrayList<com.ss.android.lark.calendar.impl.features.events.edit.mail.AddMailAttendeeData> */");
    }

    /* renamed from: a */
    public static void m120991a(AddMailAttendeeActivity addMailAttendeeActivity, Context context) {
        addMailAttendeeActivity.mo116134a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(addMailAttendeeActivity);
        }
    }

    /* renamed from: a */
    public static Context m120989a(AddMailAttendeeActivity addMailAttendeeActivity, Configuration configuration) {
        Context a = addMailAttendeeActivity.mo116132a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
