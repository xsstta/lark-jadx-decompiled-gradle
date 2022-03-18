package com.ss.android.vc.meeting.module.multi;

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
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ss/android/vc/meeting/module/multi/XByteRTCMeetingActivity;", "Lcom/ss/android/vc/meeting/module/multi/ByteRTCMeetingActivity;", "()V", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public class XByteRTCMeetingActivity extends ByteRTCMeetingActivity {
    /* renamed from: a */
    public Context mo216027a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo216028a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.vc.common.base.BaseActivity
    public void attachBaseContext(Context context) {
        m244213a(this, context);
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
        return m244211a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo208259d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m244215c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m244212a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.base.MeetingActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m244214b(this);
    }

    /* renamed from: a */
    public static Resources m244212a(XByteRTCMeetingActivity xByteRTCMeetingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(xByteRTCMeetingActivity);
        }
        return xByteRTCMeetingActivity.mo208256b();
    }

    /* renamed from: c */
    public static AssetManager m244215c(XByteRTCMeetingActivity xByteRTCMeetingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(xByteRTCMeetingActivity);
        }
        return xByteRTCMeetingActivity.mo208259d();
    }

    /* renamed from: b */
    public static void m244214b(XByteRTCMeetingActivity xByteRTCMeetingActivity) {
        xByteRTCMeetingActivity.mo208257c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            XByteRTCMeetingActivity xByteRTCMeetingActivity2 = xByteRTCMeetingActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    xByteRTCMeetingActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m244213a(XByteRTCMeetingActivity xByteRTCMeetingActivity, Context context) {
        xByteRTCMeetingActivity.mo216028a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(xByteRTCMeetingActivity);
        }
    }

    /* renamed from: a */
    public static Context m244211a(XByteRTCMeetingActivity xByteRTCMeetingActivity, Configuration configuration) {
        Context a = xByteRTCMeetingActivity.mo216027a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
