package com.ss.android.vc.lark.message.meeting.cardview.attendee;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.vc.entity.AttendeeFromSource;
import com.ss.android.vc.lark.message.meeting.cardview.attendee.C61130f;
import com.ss.android.vc.meeting.utils.C63497j;
import com.ss.android.vcxp.C63801c;

public class MeetingAttendeeActivity extends BaseFragmentActivity implements C61130f.AbstractC61133a {

    /* renamed from: a */
    private C61127e f153083a;

    /* renamed from: a */
    public Context mo211384a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo211386a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m237677a(this, context);
    }

    /* renamed from: b */
    public Resources mo211388b() {
        return super.getResources();
    }

    /* renamed from: c */
    public void mo211389c() {
        super.onStop();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m237675a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo211391d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m237679c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m237676a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m237678b(this);
    }

    @Override // com.ss.android.vc.lark.message.meeting.cardview.attendee.C61130f.AbstractC61133a
    /* renamed from: a */
    public void mo211385a() {
        finish();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        C61127e eVar = this.f153083a;
        if (eVar != null) {
            eVar.destroy();
        }
        super.onDestroy();
    }

    /* renamed from: a */
    public static Resources m237676a(MeetingAttendeeActivity meetingAttendeeActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(meetingAttendeeActivity);
        }
        return meetingAttendeeActivity.mo211388b();
    }

    /* renamed from: c */
    public static AssetManager m237679c(MeetingAttendeeActivity meetingAttendeeActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(meetingAttendeeActivity);
        }
        return meetingAttendeeActivity.mo211391d();
    }

    /* renamed from: b */
    public static void m237678b(MeetingAttendeeActivity meetingAttendeeActivity) {
        meetingAttendeeActivity.mo211389c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MeetingAttendeeActivity meetingAttendeeActivity2 = meetingAttendeeActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    meetingAttendeeActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        String stringExtra;
        if (!C63801c.m250499a(this, bundle)) {
            finish();
            return;
        }
        super.onCreate(bundle);
        Intent intent = getIntent();
        AttendeeFromSource attendeeFromSource = AttendeeFromSource.UNKNOWN;
        if (!(intent == null || (stringExtra = intent.getStringExtra("extra.from.source")) == null)) {
            stringExtra.hashCode();
            char c = 65535;
            switch (stringExtra.hashCode()) {
                case 1716066039:
                    if (stringExtra.equals("VC_CARD_ATTENDEE")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1808007875:
                    if (stringExtra.equals("VC_PREVIEW_ATTENDEE")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1930469014:
                    if (stringExtra.equals("VC_TAB_ATTENDEE")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    attendeeFromSource = AttendeeFromSource.VC_CARD_ATTENDEE;
                    break;
                case 1:
                    attendeeFromSource = AttendeeFromSource.VC_PREVIEW_ATTENDEE;
                    break;
                case 2:
                    attendeeFromSource = AttendeeFromSource.VC_TAB_ATTENDEE;
                    break;
                default:
                    attendeeFromSource = AttendeeFromSource.UNKNOWN;
                    break;
            }
        }
        setContentView(R.layout.activity_videochat_card_attendee);
        C61127e eVar = new C61127e(this, getIntent(), attendeeFromSource, this);
        this.f153083a = eVar;
        eVar.create();
    }

    /* renamed from: a */
    public static void m237677a(MeetingAttendeeActivity meetingAttendeeActivity, Context context) {
        meetingAttendeeActivity.mo211386a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(meetingAttendeeActivity);
        }
    }

    /* renamed from: a */
    public static Context m237675a(MeetingAttendeeActivity meetingAttendeeActivity, Configuration configuration) {
        Context a = meetingAttendeeActivity.mo211384a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    @Override // com.ss.android.vc.lark.message.meeting.cardview.attendee.C61130f.AbstractC61133a
    /* renamed from: a */
    public void mo211387a(String str, String str2, String str3) {
        C63497j.m248854a(this, str, str2, str3, null);
    }
}
