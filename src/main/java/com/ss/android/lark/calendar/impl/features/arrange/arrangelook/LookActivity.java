package com.ss.android.lark.calendar.impl.features.arrange.arrangelook;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import butterknife.ButterKnife;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.framework.ui.dragger.C26213k;
import com.larksuite.suite.R;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.ILookContract;
import com.ss.android.lark.calendar.impl.features.arrange.arrangetime.util.ArrangeUtil;
import com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.TouchListenerFrameLayout;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.EventChipViewData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.EventMeetingRoomData;
import com.ss.android.lark.calendar.impl.features.events.edit.helper.EditDateHelper;
import com.ss.android.lark.calendar.impl.framework.components.CalendarBaseActivity;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.CalendarHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.ProfileFreeBusyHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30054s;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0002J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0014J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u000bH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/LookActivity;", "Lcom/ss/android/lark/calendar/impl/framework/components/CalendarBaseActivity;", "()V", "mDragger", "Lcom/larksuite/framework/ui/dragger/Dragger;", "mLookPresenter", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/LookPresenter;", "getEnterAnimationConfig", "Lcom/ss/android/lark/base/activity/ActivityAnimationManager$AnimationConfig;", "getExitAnimationConfig", "initMVP", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onNewIntent", "intent", "Landroid/content/Intent;", "onResume", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public class LookActivity extends CalendarBaseActivity {

    /* renamed from: a */
    private C26213k f75057a;

    /* renamed from: b */
    private LookPresenter f75058b;

    /* renamed from: c */
    private HashMap f75059c;

    /* renamed from: a */
    public Context mo108507a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo108508a() {
        return super.getResources();
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseActivity
    /* renamed from: a */
    public View mo108509a(int i) {
        if (this.f75059c == null) {
            this.f75059c = new HashMap();
        }
        View view = (View) this.f75059c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f75059c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo108510a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m111401a(this, context);
    }

    /* renamed from: b */
    public void mo108511b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo108512c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m111399a(this, configuration);
    }

    public AssetManager getAssets() {
        return m111403c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m111400a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m111402b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        LookPresenter cVar = this.f75058b;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLookPresenter");
        }
        cVar.destroy();
        C26213k kVar = this.f75057a;
        if (kVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDragger");
        }
        kVar.mo93233a();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onResume() {
        super.onResume();
        LookPresenter cVar = this.f75058b;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLookPresenter");
        }
        cVar.mo108560a(true);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        Bundle extras;
        int[] intArray;
        boolean z;
        Intent intent = getIntent();
        if (!(intent == null || (extras = intent.getExtras()) == null || (intArray = extras.getIntArray("look_animation_in_array")) == null)) {
            Intrinsics.checkExpressionValueIsNotNull(intArray, "it");
            if (intArray.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!(!z)) {
                intArray = null;
            }
            if (intArray != null) {
                return new ActivityAnimationManager.AnimationConfig(intArray);
            }
        }
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_UP_IN);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        Bundle extras;
        int[] intArray;
        boolean z;
        Intent intent = getIntent();
        if (!(intent == null || (extras = intent.getExtras()) == null || (intArray = extras.getIntArray("look_animation_out_array")) == null)) {
            Intrinsics.checkExpressionValueIsNotNull(intArray, "it");
            if (intArray.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!(!z)) {
                intArray = null;
            }
            if (intArray != null) {
                return new ActivityAnimationManager.AnimationConfig(intArray);
            }
        }
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_BOTTOM_OUT);
    }

    /* renamed from: d */
    private final void m111404d() {
        Bundle bundle;
        Intent intent = getIntent();
        if (intent != null) {
            bundle = intent.getExtras();
        } else {
            bundle = null;
        }
        LookModel bVar = new LookModel(bundle);
        C30102a aVar = new C30102a(this, bVar);
        TouchListenerFrameLayout touchListenerFrameLayout = (TouchListenerFrameLayout) mo108509a(R.id.lookRootView);
        Intrinsics.checkExpressionValueIsNotNull(touchListenerFrameLayout, "lookRootView");
        TouchListenerFrameLayout touchListenerFrameLayout2 = touchListenerFrameLayout;
        C26213k kVar = this.f75057a;
        if (kVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDragger");
        }
        LookPresenter cVar = new LookPresenter(bVar, new LookView(touchListenerFrameLayout2, kVar, aVar));
        this.f75058b = cVar;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLookPresenter");
        }
        cVar.create();
        if (bVar.mo108529f()) {
            ProfileFreeBusyHitPoint.m124402a();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onNewIntent(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        super.onNewIntent(intent);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000W\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0003H\u0016J\u0018\u0010\u0016\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0003H\u0016J\"\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u0003H\u0016J\u001a\u0010\u001e\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010\u0017\u001a\u00020\u0003H\u0016J\u0012\u0010!\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010\u001aH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"com/ss/android/lark/calendar/impl/features/arrange/arrangelook/LookActivity$initMVP$viewDependency$1", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/ILookContract$ViewDependency;", "mHasOutWorkHourAttendee", "", "addEditActivityParam", "", "lookModel", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/LookModel;", "intent", "Landroid/content/Intent;", "addEditActivityParamFromSignIn", "getActivity", "Landroid/app/Activity;", "getDINAlternateBoldTypeface", "Landroid/graphics/Typeface;", "injectView", "annotationTarget", "", "container", "Landroid/view/View;", "setHasOutWorkHourAttendee", "hasOutWorkHourAttendee", "startActivityByIntent", "isOpenNearbyClick", "startAppendEventActivity", "selectedDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "context", "Landroid/content/Context;", "fromPlusBtn", "startEventDetailActivity", "chipViewData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/EventChipViewData;", "updateTabView", "currentDate", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.LookActivity$a */
    public static final class C30102a implements ILookContract.ViewDependency {

        /* renamed from: a */
        final /* synthetic */ LookActivity f75060a;

        /* renamed from: b */
        final /* synthetic */ LookModel f75061b;

        /* renamed from: c */
        private boolean f75062c;

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract.AbstractC30658d
        /* renamed from: a */
        public void mo108516a(CalendarDate calendarDate, Context context, boolean z) {
            Intrinsics.checkParameterIsNotNull(calendarDate, "selectedDate");
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract.AbstractC30658d
        /* renamed from: a */
        public void mo108517a(EventChipViewData eventChipViewData, boolean z) {
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.ILookContract.ViewDependency
        /* renamed from: a */
        public void mo108519a(boolean z) {
            this.f75062c = z;
        }

        C30102a(LookActivity lookActivity, LookModel bVar) {
            this.f75060a = lookActivity;
            this.f75061b = bVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract.AbstractC30658d
        /* renamed from: a */
        public void mo108518a(Object obj, View view) {
            Intrinsics.checkParameterIsNotNull(obj, "annotationTarget");
            Intrinsics.checkParameterIsNotNull(view, "container");
            ButterKnife.bind(obj, view);
        }

        /* renamed from: a */
        private final void m111411a(LookModel bVar, Intent intent) {
            if (bVar.mo108529f()) {
                intent.putExtra("calendar_attendees", ArrangeUtil.f75376a.mo108931a(bVar.mo108525b()));
                intent.putExtra("calendar_attendee_related_chatter_ids", bVar.mo108554h());
                return;
            }
            m111412b(bVar, intent);
        }

        /* renamed from: b */
        private final void m111412b(LookModel bVar, Intent intent) {
            boolean z;
            EventMeetingRoomData a = EditDateHelper.f79932a.mo114614a(bVar.mo108555i(), bVar.mo108556j());
            if (a != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(a);
                intent.putExtra("key_params_resource_list", arrayList);
            }
            AbstractC30054s loginDependency = C30022a.f74882a.loginDependency();
            Intrinsics.checkExpressionValueIsNotNull(loginDependency, "CalendarDependencyHolder…endency.loginDependency()");
            String a2 = loginDependency.mo108269a();
            if (a2 != null) {
                if (a2.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    a2 = null;
                }
                if (a2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(a2);
                    intent.putExtra("calendar_attendee_chatter_ids", arrayList2);
                }
            }
            intent.putExtra("edit_hitpoint_action_source", "code_calendar");
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract.AbstractC30658d
        /* renamed from: a */
        public void mo108515a(Intent intent, boolean z) {
            String str;
            Intrinsics.checkParameterIsNotNull(intent, "intent");
            m111411a(this.f75061b, intent);
            this.f75060a.startActivity(intent);
            if (!this.f75061b.mo108529f()) {
                str = "code_calendar";
            } else {
                str = "cal_profile";
            }
            GeneralHitPoint.m124207a(str, "new", (CalendarEvent) null, (Calendar.Type) null, (String) null, 24, (Object) null);
            CalendarHitPoint.m124107I();
            if (this.f75061b.mo108529f()) {
                ProfileFreeBusyHitPoint.m124403a("full_create_event");
            }
            if (this.f75062c) {
                CalendarHitPoint.m124112N();
            }
        }
    }

    /* renamed from: a */
    public static Resources m111400a(LookActivity lookActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(lookActivity);
        }
        return lookActivity.mo108508a();
    }

    /* renamed from: c */
    public static AssetManager m111403c(LookActivity lookActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(lookActivity);
        }
        return lookActivity.mo108512c();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.calendar_activity_look_over);
        this.f75057a = new C26213k(getWindow());
        m111404d();
        CalendarHitPoint.m124106H();
    }

    /* renamed from: b */
    public static void m111402b(LookActivity lookActivity) {
        lookActivity.mo108511b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            LookActivity lookActivity2 = lookActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    lookActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m111401a(LookActivity lookActivity, Context context) {
        lookActivity.mo108510a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(lookActivity);
        }
    }

    /* renamed from: a */
    public static Context m111399a(LookActivity lookActivity, Configuration configuration) {
        Context a = lookActivity.mo108507a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
