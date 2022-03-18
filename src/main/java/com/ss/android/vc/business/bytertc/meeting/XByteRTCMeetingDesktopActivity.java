package com.ss.android.vc.business.bytertc.meeting;

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

public class XByteRTCMeetingDesktopActivity extends ByteRTCMeetingDesktopActivity {
    /* renamed from: a */
    public Context mo208254a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo208255a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.vc.common.base.BaseActivity
    public void attachBaseContext(Context context) {
        m235804a(this, context);
    }

    /* renamed from: b */
    public Resources mo208256b() {
        return super.getResources();
    }

    /* renamed from: c */
    public void mo208257c() {
        super.onStop();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m235802a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo208259d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m235806c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m235803a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.base.MeetingActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m235805b(this);
    }

    /* renamed from: a */
    public static Resources m235803a(XByteRTCMeetingDesktopActivity xByteRTCMeetingDesktopActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(xByteRTCMeetingDesktopActivity);
        }
        return xByteRTCMeetingDesktopActivity.mo208256b();
    }

    /* renamed from: c */
    public static AssetManager m235806c(XByteRTCMeetingDesktopActivity xByteRTCMeetingDesktopActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(xByteRTCMeetingDesktopActivity);
        }
        return xByteRTCMeetingDesktopActivity.mo208259d();
    }

    /* renamed from: b */
    public static void m235805b(XByteRTCMeetingDesktopActivity xByteRTCMeetingDesktopActivity) {
        xByteRTCMeetingDesktopActivity.mo208257c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            XByteRTCMeetingDesktopActivity xByteRTCMeetingDesktopActivity2 = xByteRTCMeetingDesktopActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    xByteRTCMeetingDesktopActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m235804a(XByteRTCMeetingDesktopActivity xByteRTCMeetingDesktopActivity, Context context) {
        xByteRTCMeetingDesktopActivity.mo208255a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(xByteRTCMeetingDesktopActivity);
        }
    }

    /* renamed from: a */
    public static Context m235802a(XByteRTCMeetingDesktopActivity xByteRTCMeetingDesktopActivity, Configuration configuration) {
        Context a = xByteRTCMeetingDesktopActivity.mo208254a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
