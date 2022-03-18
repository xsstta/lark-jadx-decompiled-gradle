package com.ss.android.lark.calendar.impl.features.meetingroom.profile;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.calendar.impl.features.meetingroom.profile.MeetingRoomProfilePresenter;
import com.ss.android.lark.calendar.impl.framework.components.CalendarBaseActivity;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\r\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0002J\u0012\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\r\u001a\u00020\tH\u0014J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\fH\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/MeetingRoomProfileActivity;", "Lcom/ss/android/lark/calendar/impl/framework/components/CalendarBaseActivity;", "()V", "mPresenter", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/MeetingRoomProfilePresenter;", "getFragmentDependency", "com/ss/android/lark/calendar/impl/features/meetingroom/profile/MeetingRoomProfileActivity$getFragmentDependency$1", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/MeetingRoomProfileActivity$getFragmentDependency$1;", "initMVP", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onSaveInstanceState", "outState", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MeetingRoomProfileActivity extends CalendarBaseActivity {

    /* renamed from: a */
    private MeetingRoomProfilePresenter f82142a;

    /* renamed from: b */
    private HashMap f82143b;

    /* renamed from: a */
    public Context mo117217a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo117218a() {
        return super.getResources();
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseActivity
    /* renamed from: a */
    public View mo108509a(int i) {
        if (this.f82143b == null) {
            this.f82143b = new HashMap();
        }
        View view = (View) this.f82143b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f82143b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo117219a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m122179a(this, context);
    }

    /* renamed from: b */
    public void mo117220b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo117221c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m122177a(this, configuration);
    }

    public AssetManager getAssets() {
        return m122181c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m122178a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m122180b(this);
    }

    /* renamed from: e */
    private final C32132a m122183e() {
        return new C32132a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        MeetingRoomProfilePresenter dVar = this.f82142a;
        if (dVar != null) {
            dVar.destroy();
        }
    }

    /* renamed from: d */
    private final void m122182d() {
        RelativeLayout relativeLayout = (RelativeLayout) mo108509a(R.id.rootView);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "rootView");
        MeetingRoomProfileView eVar = new MeetingRoomProfileView(relativeLayout);
        Bundle bundle = this.mBundle;
        Intrinsics.checkExpressionValueIsNotNull(bundle, "mBundle");
        MeetingRoomProfilePresenter dVar = new MeetingRoomProfilePresenter(eVar, new MeetingRoomProfileModel(bundle), m122183e());
        this.f82142a = dVar;
        if (dVar != null) {
            dVar.create();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/profile/MeetingRoomProfileActivity$getFragmentDependency$1", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/MeetingRoomProfilePresenter$FragmentDependency;", "openChatByChatterId", "", BottomDialog.f17198f, "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.profile.MeetingRoomProfileActivity$a */
    public static final class C32132a implements MeetingRoomProfilePresenter.FragmentDependency {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomProfileActivity f82144a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32132a(MeetingRoomProfileActivity meetingRoomProfileActivity) {
            this.f82144a = meetingRoomProfileActivity;
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.profile.MeetingRoomProfilePresenter.FragmentDependency
        /* renamed from: a */
        public void mo117224a(String str) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                C30022a.f74882a.chatModuleDependency().mo108226b(this.f82144a, str);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_calendar_meetingroom);
        m122182d();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onSaveInstanceState(Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(bundle, "outState");
        MeetingRoomProfilePresenter dVar = this.f82142a;
        if (dVar != null) {
            dVar.mo117321a(bundle);
        }
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: a */
    public static Resources m122178a(MeetingRoomProfileActivity meetingRoomProfileActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(meetingRoomProfileActivity);
        }
        return meetingRoomProfileActivity.mo117218a();
    }

    /* renamed from: c */
    public static AssetManager m122181c(MeetingRoomProfileActivity meetingRoomProfileActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(meetingRoomProfileActivity);
        }
        return meetingRoomProfileActivity.mo117221c();
    }

    /* renamed from: b */
    public static void m122180b(MeetingRoomProfileActivity meetingRoomProfileActivity) {
        meetingRoomProfileActivity.mo117220b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MeetingRoomProfileActivity meetingRoomProfileActivity2 = meetingRoomProfileActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    meetingRoomProfileActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m122179a(MeetingRoomProfileActivity meetingRoomProfileActivity, Context context) {
        meetingRoomProfileActivity.mo117219a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(meetingRoomProfileActivity);
        }
    }

    /* renamed from: a */
    public static Context m122177a(MeetingRoomProfileActivity meetingRoomProfileActivity, Configuration configuration) {
        Context a = meetingRoomProfileActivity.mo117217a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
