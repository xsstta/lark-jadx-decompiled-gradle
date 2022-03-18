package com.ss.android.lark.calendar.impl.features.calendars.detail;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.jaeger.library.StatusBarUtil;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.calendar.impl.features.calendars.detail.fragment.CalendarDetailFragment;
import com.ss.android.lark.calendar.impl.features.calendars.edit.fragment.CalendarEditFragment;
import com.ss.android.lark.calendar.impl.framework.fragment.BaseHostActivity;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0014R\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/detail/CalendarDetailActivity;", "Lcom/ss/android/lark/calendar/impl/framework/fragment/BaseHostActivity;", "()V", "bundle", "Landroid/os/Bundle;", "getBundle", "()Landroid/os/Bundle;", "bundle$delegate", "Lkotlin/Lazy;", "getEnterAnimationConfig", "Lcom/ss/android/lark/base/activity/ActivityAnimationManager$AnimationConfig;", "getExitAnimationConfig", "onCreate", "", "savedInstanceState", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarDetailActivity extends BaseHostActivity {

    /* renamed from: a */
    private final Lazy f75594a = LazyKt.lazy(new C30239a(this));

    /* renamed from: b */
    private HashMap f75595b;

    /* renamed from: g */
    private final Bundle m112322g() {
        return (Bundle) this.f75594a.getValue();
    }

    /* renamed from: a */
    public Context mo109157a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo109158a() {
        return super.getResources();
    }

    @Override // com.ss.android.lark.calendar.impl.framework.fragment.BaseHostActivity, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseActivity
    /* renamed from: a */
    public View mo108509a(int i) {
        if (this.f75595b == null) {
            this.f75595b = new HashMap();
        }
        View view = (View) this.f75595b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f75595b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo109159a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m112319a(this, context);
    }

    /* renamed from: b */
    public void mo109160b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo109161c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m112317a(this, configuration);
    }

    public AssetManager getAssets() {
        return m112321c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m112318a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m112320b(this);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_UP_IN);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_BOTTOM_OUT);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/os/Bundle;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.detail.CalendarDetailActivity$a */
    static final class C30239a extends Lambda implements Function0<Bundle> {
        final /* synthetic */ CalendarDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30239a(CalendarDetailActivity calendarDetailActivity) {
            super(0);
            this.this$0 = calendarDetailActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Bundle invoke() {
            Intent intent = this.this$0.getIntent();
            Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
            return intent.getExtras();
        }
    }

    /* renamed from: a */
    public static Resources m112318a(CalendarDetailActivity calendarDetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(calendarDetailActivity);
        }
        return calendarDetailActivity.mo109158a();
    }

    /* renamed from: c */
    public static AssetManager m112321c(CalendarDetailActivity calendarDetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(calendarDetailActivity);
        }
        return calendarDetailActivity.mo109161c();
    }

    /* renamed from: b */
    public static void m112320b(CalendarDetailActivity calendarDetailActivity) {
        calendarDetailActivity.mo109160b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            CalendarDetailActivity calendarDetailActivity2 = calendarDetailActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    calendarDetailActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.calendar.impl.framework.fragment.BaseHostActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        if (bundle != null) {
            bundle.clear();
        }
        super.onCreate(bundle);
        String str = null;
        StatusBarUtil.setTransparentForImageView(this, null);
        Bundle g = m112322g();
        if (g != null) {
            str = g.getString("KEY_CALENDAR_ACTION_TYPE");
        }
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 424051992) {
                if (hashCode == 441121901 && str.equals("ACTION_TYPE_DETAIL")) {
                    mo118659e().mo118662a(CalendarDetailFragment.class, m112322g());
                    return;
                }
            } else if (str.equals("ACTION_TYPE_CREATE")) {
                mo118659e().mo118662a(CalendarEditFragment.class, m112322g());
                return;
            }
        }
        finish();
    }

    /* renamed from: a */
    public static void m112319a(CalendarDetailActivity calendarDetailActivity, Context context) {
        calendarDetailActivity.mo109159a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(calendarDetailActivity);
        }
    }

    /* renamed from: a */
    public static Context m112317a(CalendarDetailActivity calendarDetailActivity, Configuration configuration) {
        Context a = calendarDetailActivity.mo109157a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
