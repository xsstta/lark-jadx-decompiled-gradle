package com.ss.android.vc.meeting.module.preview.facade;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class MeetingPreviewDesktopActivity extends MeetingPreviewActivity {
    /* renamed from: a */
    public Context mo216700a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo216701a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.vc.common.base.BaseActivity
    public void attachBaseContext(Context context) {
        m245455a(this, context);
    }

    /* renamed from: b */
    public Resources mo216702b() {
        return super.getResources();
    }

    /* renamed from: c */
    public void mo216703c() {
        super.onStop();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m245453a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo216705d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m245457c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m245454a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.vc.meeting.module.preview.facade.MeetingPreviewActivity
    public void onStop() {
        m245456b(this);
    }

    /* renamed from: a */
    public static Resources m245454a(MeetingPreviewDesktopActivity meetingPreviewDesktopActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(meetingPreviewDesktopActivity);
        }
        return meetingPreviewDesktopActivity.mo216702b();
    }

    /* renamed from: c */
    public static AssetManager m245457c(MeetingPreviewDesktopActivity meetingPreviewDesktopActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(meetingPreviewDesktopActivity);
        }
        return meetingPreviewDesktopActivity.mo216705d();
    }

    /* renamed from: b */
    public static void m245456b(MeetingPreviewDesktopActivity meetingPreviewDesktopActivity) {
        meetingPreviewDesktopActivity.mo216703c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MeetingPreviewDesktopActivity meetingPreviewDesktopActivity2 = meetingPreviewDesktopActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    meetingPreviewDesktopActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m245455a(MeetingPreviewDesktopActivity meetingPreviewDesktopActivity, Context context) {
        meetingPreviewDesktopActivity.mo216701a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(meetingPreviewDesktopActivity);
        }
    }

    /* renamed from: a */
    public static Context m245453a(MeetingPreviewDesktopActivity meetingPreviewDesktopActivity, Configuration configuration) {
        Context a = meetingPreviewDesktopActivity.mo216700a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
