package com.ss.android.lark.calendar.impl.features.meetingroom.signin;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.events.edit.EditActivityEntrance;
import com.ss.android.lark.calendar.impl.features.meetingroom.instance.RoomInstanceEntrance;
import com.ss.android.lark.calendar.impl.features.meetingroom.profile.MeetingRoomProfileActivityEntrance;
import com.ss.android.lark.calendar.impl.features.meetingroom.signin.listener.IActivityDependency;
import com.ss.android.lark.calendar.impl.framework.components.CalendarBaseActivity;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarBuilding;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\r\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\fH\u0014J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0014J\b\u0010\u0013\u001a\u00020\fH\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/MeetingRoomSignInActivity;", "Lcom/ss/android/lark/calendar/impl/framework/components/CalendarBaseActivity;", "()V", "mPresenter", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/MeetingRoomSignInPresenter;", "getActivityDependency", "com/ss/android/lark/calendar/impl/features/meetingroom/signin/MeetingRoomSignInActivity$getActivityDependency$1", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/MeetingRoomSignInActivity$getActivityDependency$1;", "getEnterAnimationConfig", "Lcom/ss/android/lark/base/activity/ActivityAnimationManager$AnimationConfig;", "getExitAnimationConfig", "initMVP", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onSaveInstanceState", "outState", "onStop", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MeetingRoomSignInActivity extends CalendarBaseActivity {

    /* renamed from: a */
    private MeetingRoomSignInPresenter f82194a;

    /* renamed from: b */
    private HashMap f82195b;

    /* renamed from: a */
    public Context mo117330a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseActivity
    /* renamed from: a */
    public View mo108509a(int i) {
        if (this.f82195b == null) {
            this.f82195b = new HashMap();
        }
        View view = (View) this.f82195b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f82195b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo117332a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m122349a(this, context);
    }

    /* renamed from: b */
    public Resources mo117333b() {
        return super.getResources();
    }

    /* renamed from: c */
    public AssetManager mo117334c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m122347a(this, configuration);
    }

    public AssetManager getAssets() {
        return m122351c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m122350b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m122348a(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\bH\u0016J4\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J$\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\bH\u0016¨\u0006\u0018"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/signin/MeetingRoomSignInActivity$getActivityDependency$1", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/listener/IActivityDependency;", "finishActivity", "", "getActivity", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/MeetingRoomSignInActivity;", "openActivateWebPage", "url", "", "openProfileByChatterId", BottomDialog.f17198f, "routeEditActivity", "eventStartTime", "", "eventEndTime", "selfChatterId", "calendarResource", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;", "calendarBuilding", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;", "routeLookActivity", "calendarId", "routeMtRoomProfileActivity", "resourceCalendarId", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.signin.MeetingRoomSignInActivity$a */
    public static final class C32153a implements IActivityDependency {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomSignInActivity f82196a;

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.listener.IActivityDependency
        /* renamed from: a */
        public void mo117337a() {
            this.f82196a.finish();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32153a(MeetingRoomSignInActivity meetingRoomSignInActivity) {
            this.f82196a = meetingRoomSignInActivity;
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.listener.IActivityDependency
        /* renamed from: a */
        public void mo117339a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "resourceCalendarId");
            MeetingRoomProfileActivityEntrance.f82147a.mo117232a(this.f82196a, str);
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.listener.IActivityDependency
        /* renamed from: b */
        public void mo117341b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "url");
            C30022a.f74882a.browserModuleDependency().mo108211a(this.f82196a, str);
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.listener.IActivityDependency
        /* renamed from: c */
        public void mo117342c(String str) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                C30022a.f74882a.oldModuleDependency().mo108285a(this.f82196a, str, "", "");
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.listener.IActivityDependency
        /* renamed from: a */
        public void mo117340a(String str, CalendarResource calendarResource, CalendarBuilding calendarBuilding) {
            String str2;
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            MeetingRoomSignInActivity meetingRoomSignInActivity = this.f82196a;
            if (calendarBuilding == null || (str2 = calendarBuilding.getName()) == null) {
                str2 = "";
            }
            RoomInstanceEntrance.m122116a(meetingRoomSignInActivity, str2, calendarResource, new CalendarDate().getJulianDay(), 0, 16, null);
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.listener.IActivityDependency
        /* renamed from: a */
        public void mo117338a(long j, long j2, String str, CalendarResource calendarResource, CalendarBuilding calendarBuilding) {
            String str2;
            Intrinsics.checkParameterIsNotNull(str, "selfChatterId");
            EditActivityEntrance.f79940a.mo114663a(this.f82196a, j, j2, str, calendarResource, calendarBuilding);
            if (calendarResource != null) {
                str2 = calendarResource.getCalendarId();
            } else {
                str2 = null;
            }
            GeneralHitPoint.m124207a("code_calendar", "new", (CalendarEvent) null, (Calendar.Type) null, str2, 8, (Object) null);
        }
    }

    /* renamed from: e */
    private final C32153a m122353e() {
        return new C32153a(this);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_UP_IN);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_BOTTOM_OUT);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onResume() {
        super.onResume();
        MeetingRoomSignInPresenter eVar = this.f82194a;
        if (eVar != null) {
            eVar.mo117456c();
        }
    }

    /* renamed from: a */
    public void mo117331a() {
        super.onStop();
        MeetingRoomSignInPresenter eVar = this.f82194a;
        if (eVar != null) {
            eVar.mo117457d();
        }
    }

    /* renamed from: d */
    private final void m122352d() {
        ScrollView scrollView = (ScrollView) mo108509a(R.id.signInRootView);
        Intrinsics.checkExpressionValueIsNotNull(scrollView, "signInRootView");
        MeetingRoomSignInPresenter eVar = new MeetingRoomSignInPresenter(new MeetingRoomSignInView(scrollView, this), new MeetingRoomSignInModel(this.mBundle), m122353e());
        this.f82194a = eVar;
        if (eVar != null) {
            eVar.create();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_calenda_meeting_room_sign);
        m122352d();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onSaveInstanceState(Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(bundle, "outState");
        MeetingRoomSignInPresenter eVar = this.f82194a;
        if (eVar != null) {
            eVar.mo117454a(bundle);
        }
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: b */
    public static Resources m122350b(MeetingRoomSignInActivity meetingRoomSignInActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(meetingRoomSignInActivity);
        }
        return meetingRoomSignInActivity.mo117333b();
    }

    /* renamed from: c */
    public static AssetManager m122351c(MeetingRoomSignInActivity meetingRoomSignInActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(meetingRoomSignInActivity);
        }
        return meetingRoomSignInActivity.mo117334c();
    }

    /* renamed from: a */
    public static void m122348a(MeetingRoomSignInActivity meetingRoomSignInActivity) {
        meetingRoomSignInActivity.mo117331a();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MeetingRoomSignInActivity meetingRoomSignInActivity2 = meetingRoomSignInActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    meetingRoomSignInActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m122349a(MeetingRoomSignInActivity meetingRoomSignInActivity, Context context) {
        meetingRoomSignInActivity.mo117332a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(meetingRoomSignInActivity);
        }
    }

    /* renamed from: a */
    public static Context m122347a(MeetingRoomSignInActivity meetingRoomSignInActivity, Configuration configuration) {
        Context a = meetingRoomSignInActivity.mo117330a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
