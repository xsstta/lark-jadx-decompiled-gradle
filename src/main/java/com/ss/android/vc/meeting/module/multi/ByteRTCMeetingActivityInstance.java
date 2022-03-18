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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ss/android/vc/meeting/module/multi/ByteRTCMeetingActivityInstance;", "Lcom/ss/android/vc/meeting/module/multi/ByteRTCMeetingActivity;", "()V", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class ByteRTCMeetingActivityInstance extends ByteRTCMeetingActivity {
    /* renamed from: a */
    public Context mo215885a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo215886a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.vc.common.base.BaseActivity
    public void attachBaseContext(Context context) {
        m244070a(this, context);
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
        return m244068a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo208259d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m244072c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m244069a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.base.MeetingActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m244071b(this);
    }

    /* renamed from: a */
    public static Resources m244069a(ByteRTCMeetingActivityInstance byteRTCMeetingActivityInstance) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(byteRTCMeetingActivityInstance);
        }
        return byteRTCMeetingActivityInstance.mo208256b();
    }

    /* renamed from: c */
    public static AssetManager m244072c(ByteRTCMeetingActivityInstance byteRTCMeetingActivityInstance) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(byteRTCMeetingActivityInstance);
        }
        return byteRTCMeetingActivityInstance.mo208259d();
    }

    /* renamed from: b */
    public static void m244071b(ByteRTCMeetingActivityInstance byteRTCMeetingActivityInstance) {
        byteRTCMeetingActivityInstance.mo208257c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            ByteRTCMeetingActivityInstance byteRTCMeetingActivityInstance2 = byteRTCMeetingActivityInstance;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    byteRTCMeetingActivityInstance2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m244070a(ByteRTCMeetingActivityInstance byteRTCMeetingActivityInstance, Context context) {
        byteRTCMeetingActivityInstance.mo215886a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(byteRTCMeetingActivityInstance);
        }
    }

    /* renamed from: a */
    public static Context m244068a(ByteRTCMeetingActivityInstance byteRTCMeetingActivityInstance, Configuration configuration) {
        Context a = byteRTCMeetingActivityInstance.mo215885a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
