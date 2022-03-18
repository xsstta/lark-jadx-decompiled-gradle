package com.ss.android.lark.calendar.impl.features.events.detail;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact;
import com.ss.android.lark.calendar.impl.features.events.detail.presenter.BaseDetailPresenter;
import com.ss.android.lark.calendar.impl.framework.components.CalendarBaseActivity;
import com.ss.android.lark.calendar.impl.framework.hitpoint.appreciable.AppreciableHitPoint;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\b\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\"\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\u0012\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u0017\u001a\u00020\u000bH\u0014J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0013H\u0014J\b\u0010\u001a\u001a\u00020\u000bH\u0014J\u0010\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\rH\u0014J\b\u0010\u001d\u001a\u00020\u000bH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/EventDetailActivity;", "Lcom/ss/android/lark/calendar/impl/framework/components/CalendarBaseActivity;", "()V", "mIsPresenterDestroy", "", "mPresenter", "Lcom/ss/android/lark/calendar/impl/features/events/detail/presenter/BaseDetailPresenter;", "viewDependencyImpl", "com/ss/android/lark/calendar/impl/features/events/detail/EventDetailActivity$viewDependencyImpl$1", "Lcom/ss/android/lark/calendar/impl/features/events/detail/EventDetailActivity$viewDependencyImpl$1;", "initMVP", "", "initData", "Landroid/os/Bundle;", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "onDestroy", "onNewIntent", "intent", "onResume", "onSaveInstanceState", "outState", "onStop", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public class EventDetailActivity extends CalendarBaseActivity {

    /* renamed from: a */
    private boolean f79064a;

    /* renamed from: b */
    private final C31235a f79065b = new C31235a(this);

    /* renamed from: c */
    private BaseDetailPresenter f79066c;

    /* renamed from: d */
    private HashMap f79067d;

    /* renamed from: a */
    public Context mo113360a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseActivity
    /* renamed from: a */
    public View mo108509a(int i) {
        if (this.f79067d == null) {
            this.f79067d = new HashMap();
        }
        View view = (View) this.f79067d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f79067d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo113362a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m116827a(this, context);
    }

    /* renamed from: b */
    public Resources mo113363b() {
        return super.getResources();
    }

    /* renamed from: c */
    public AssetManager mo113364c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m116824a(this, configuration);
    }

    public AssetManager getAssets() {
        return m116829c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m116828b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m116826a(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010\r\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\u000e\u001a\u00020\u0005H\u0002J\b\u0010\u000f\u001a\u00020\u0005H\u0002J2\u0010\u0010\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0002J\"\u0010\u0010\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/EventDetailActivity$viewDependencyImpl$1", "Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$ViewDependency;", "mFragmentContainerId", "", "addFragment", "", "fragment", "Landroidx/fragment/app/Fragment;", "enterAnimation", "outAnimation", "finishActivity", "getActivity", "Landroid/app/Activity;", "hideFragment", "setBlackTextStatusBar", "setWhiteTextStatusBar", "showFragment", "containerId", "isAdd", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.EventDetailActivity$a */
    public static final class C31235a implements ICalendarDetailContact.ViewDependency {

        /* renamed from: a */
        final /* synthetic */ EventDetailActivity f79068a;

        /* renamed from: b */
        private final int f79069b = R.id.fragment_container;

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.ViewDependency
        /* renamed from: a */
        public void mo113367a() {
            this.f79068a.finish();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.ViewDependency
        /* renamed from: b */
        public Activity mo113369b() {
            return this.f79068a;
        }

        /* renamed from: c */
        private final void m116837c() {
            EventDetailActivity eventDetailActivity = this.f79068a;
            eventDetailActivity.setLightTextStatusBar(UIUtils.getColor(eventDetailActivity, R.color.transparent));
        }

        /* renamed from: d */
        private final void m116838d() {
            if (UDUiModeUtils.m93319a(this.f79068a)) {
                EventDetailActivity eventDetailActivity = this.f79068a;
                eventDetailActivity.setLightTextStatusBar(UIUtils.getColor(eventDetailActivity, R.color.transparent));
                return;
            }
            EventDetailActivity eventDetailActivity2 = this.f79068a;
            eventDetailActivity2.setDarkTextStatusBar(UIUtils.getColor(eventDetailActivity2, R.color.transparent));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31235a(EventDetailActivity eventDetailActivity) {
            this.f79068a = eventDetailActivity;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.ViewDependency
        /* renamed from: a */
        public void mo113368a(Fragment fragment, int i, int i2) {
            m116838d();
            m116836a(fragment, this.f79069b, false, i, i2);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.ViewDependency
        /* renamed from: b */
        public void mo113370b(Fragment fragment, int i, int i2) {
            m116838d();
            m116836a(fragment, this.f79069b, true, i, i2);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.ViewDependency
        /* renamed from: c */
        public void mo113371c(Fragment fragment, int i, int i2) {
            C10548d.m43696a((Context) this.f79068a);
            if (fragment != null) {
                m116837c();
                this.f79068a.getSupportFragmentManager().beginTransaction().setCustomAnimations(i, i2).hide(fragment).commitAllowingStateLoss();
                this.f79068a.getSupportFragmentManager().executePendingTransactions();
            }
        }

        /* renamed from: a */
        private final void m116836a(Fragment fragment, int i, boolean z, int i2, int i3) {
            if (fragment != null) {
                FragmentTransaction beginTransaction = this.f79068a.getSupportFragmentManager().beginTransaction();
                Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "supportFragmentManager.beginTransaction()");
                beginTransaction.setCustomAnimations(i2, i3);
                if (z) {
                    beginTransaction.add(i, fragment, (String) null);
                } else {
                    beginTransaction.show(fragment);
                }
                beginTransaction.commitAllowingStateLoss();
                this.f79068a.getSupportFragmentManager().executePendingTransactions();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        BaseDetailPresenter baseDetailPresenter = this.f79066c;
        if (baseDetailPresenter != null) {
            baseDetailPresenter.mo113862j();
        }
    }

    /* renamed from: a */
    public void mo113361a() {
        super.onStop();
        BaseDetailPresenter baseDetailPresenter = this.f79066c;
        if (baseDetailPresenter != null) {
            baseDetailPresenter.mo113864l();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        if (!this.f79064a) {
            BaseDetailPresenter baseDetailPresenter = this.f79066c;
            if (baseDetailPresenter != null) {
                baseDetailPresenter.destroy();
            }
            this.f79064a = true;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onResume() {
        super.onResume();
        BaseDetailPresenter baseDetailPresenter = this.f79066c;
        if (baseDetailPresenter != null) {
            baseDetailPresenter.mo113863k();
        }
        AppreciableHitPoint.f83321a.mo118696l();
        AppreciableHitPoint.f83321a.mo118700p();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onNewIntent(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        startActivity(intent);
        super.onNewIntent(intent);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onSaveInstanceState(Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(bundle, "outState");
        super.onSaveInstanceState(new Bundle());
    }

    /* renamed from: b */
    public static Resources m116828b(EventDetailActivity eventDetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(eventDetailActivity);
        }
        return eventDetailActivity.mo113363b();
    }

    /* renamed from: c */
    public static AssetManager m116829c(EventDetailActivity eventDetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(eventDetailActivity);
        }
        return eventDetailActivity.mo113364c();
    }

    /* renamed from: a */
    public static void m116826a(EventDetailActivity eventDetailActivity) {
        eventDetailActivity.mo113361a();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            EventDetailActivity eventDetailActivity2 = eventDetailActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    eventDetailActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_event_detail_main_view);
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            Intrinsics.checkExpressionValueIsNotNull(extras, "it");
            m116825a(extras);
            BaseDetailPresenter baseDetailPresenter = this.f79066c;
            if (baseDetailPresenter != null) {
                baseDetailPresenter.mo113849a(true);
            }
            BaseDetailPresenter baseDetailPresenter2 = this.f79066c;
            if (baseDetailPresenter2 != null) {
                baseDetailPresenter2.mo113843a(bundle);
            }
        }
        this.f79064a = false;
        Window window = getWindow();
        Intrinsics.checkExpressionValueIsNotNull(window, "this.window");
        window.getDecorView().setBackgroundColor(C32634ae.m125178a(R.color.bg_body));
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m116825a(android.os.Bundle r5) {
        /*
        // Method dump skipped, instructions count: 236
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.events.detail.EventDetailActivity.m116825a(android.os.Bundle):void");
    }

    /* renamed from: a */
    public static void m116827a(EventDetailActivity eventDetailActivity, Context context) {
        eventDetailActivity.mo113362a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(eventDetailActivity);
        }
    }

    /* renamed from: a */
    public static Context m116824a(EventDetailActivity eventDetailActivity, Configuration configuration) {
        Context a = eventDetailActivity.mo113360a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        BaseDetailPresenter baseDetailPresenter = this.f79066c;
        if (baseDetailPresenter != null) {
            baseDetailPresenter.mo113840a(i, i2, intent);
        }
    }
}
