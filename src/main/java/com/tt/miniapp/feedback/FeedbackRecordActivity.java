package com.tt.miniapp.feedback;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.MediaCodecInfo;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.tt.miniapp.feedback.screenrecord.C66169e;
import com.tt.miniapp.feedback.screenrecord.C66172f;
import com.tt.miniapp.feedback.screenrecord.C66177g;
import com.tt.miniapp.view.swipeback.SwipeBackActivity;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.feedback.IFeedbackRecordCallback;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.p3362a.p3365c.C67448a;
import com.tt.miniapphost.util.C67590h;
import java.io.File;

public class FeedbackRecordActivity extends SwipeBackActivity {

    /* renamed from: d */
    private static IFeedbackRecordCallback f166815d;

    /* renamed from: a */
    public MediaProjectionManager f166816a;

    /* renamed from: b */
    public MediaCodecInfo[] f166817b;

    /* renamed from: c */
    public C66172f f166818c;

    /* renamed from: n */
    private int m258829n() {
        return 30;
    }

    /* renamed from: p */
    private int m258831p() {
        return 1;
    }

    /* renamed from: q */
    private MediaCodecInfo.CodecProfileLevel m258832q() {
        return null;
    }

    /* renamed from: a */
    public Context mo231243a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo231245a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void attachBaseContext(Context context) {
        m258818a(this, context);
    }

    /* renamed from: c */
    public Resources mo231247c() {
        return super.getResources();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m258814a(this, configuration);
    }

    /* renamed from: d */
    public void mo231249d() {
        super.onStop();
    }

    /* renamed from: e */
    public AssetManager mo231250e() {
        return super.getAssets();
    }

    @Override // com.tt.miniapphost.view.BaseActivity
    public AssetManager getAssets() {
        return m258822c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity, com.tt.miniapphost.view.BaseActivity
    public Resources getResources() {
        return m258815a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m258820b(this);
    }

    /* renamed from: g */
    private void m258824g() {
        f166815d = null;
        finish();
    }

    /* renamed from: f */
    private void m258823f() {
        AppbrandContext.getMainHandler().post(new Runnable() {
            /* class com.tt.miniapp.feedback.FeedbackRecordActivity.RunnableC660861 */

            public void run() {
                FeedbackRecordActivity.this.f166816a = (MediaProjectionManager) AppbrandContext.getInst().getApplicationContext().getSystemService("media_projection");
                C66169e.m259097a("video/avc", new C66169e.AbstractC66170a() {
                    /* class com.tt.miniapp.feedback.FeedbackRecordActivity.RunnableC660861.C660871 */

                    @Override // com.tt.miniapp.feedback.screenrecord.C66169e.AbstractC66170a
                    /* renamed from: a */
                    public void mo231252a(MediaCodecInfo[] mediaCodecInfoArr) {
                        FeedbackRecordActivity.this.f166817b = mediaCodecInfoArr;
                        if (FeedbackRecordActivity.this.f166818c != null) {
                            FeedbackRecordActivity.this.mo231246b();
                        }
                        FeedbackRecordActivity.this.mo231244a();
                    }
                });
            }
        });
    }

    /* renamed from: i */
    private void m258826i() {
        C66172f fVar = this.f166818c;
        if (fVar != null) {
            fVar.mo231492b();
            AppBrandLogger.m52828d("tma_FeedbackRecordActivity", "start Recorder");
        }
    }

    /* renamed from: l */
    private void m258827l() {
        if (this.f166818c != null) {
            AppBrandLogger.m52828d("tma_FeedbackRecordActivity", "Storage Permission denied! Screen recorder is cancel");
            mo231246b();
        }
    }

    /* renamed from: o */
    private int m258830o() {
        int e = C67590h.m263091e(this);
        if (e <= 480) {
            return 500000;
        }
        if (e <= 640) {
            return 1024000;
        }
        if (e <= 1280) {
            return 2048000;
        }
        return 4096000;
    }

    /* renamed from: r */
    private int[] m258833r() {
        return new int[]{C67590h.m263091e(this), C67590h.m263090d(this)};
    }

    /* renamed from: b */
    public void mo231246b() {
        C66172f fVar = this.f166818c;
        if (fVar != null) {
            fVar.mo231491a();
        }
        this.f166818c = null;
        AppBrandLogger.m52828d("tma_FeedbackRecordActivity", "stop Recorder");
    }

    /* renamed from: h */
    private C66177g m258825h() {
        String m = m258828m();
        if (m == null) {
            return null;
        }
        int[] r = m258833r();
        return new C66177g(r[1], r[0], m258830o(), m258829n(), m258831p(), m, "video/avc", m258832q());
    }

    /* renamed from: m */
    private String m258828m() {
        MediaCodecInfo[] mediaCodecInfoArr = this.f166817b;
        int length = mediaCodecInfoArr.length;
        String str = "";
        int i = 0;
        while (i < length) {
            MediaCodecInfo mediaCodecInfo = mediaCodecInfoArr[i];
            String name = this.f166817b[0].getName();
            if (mediaCodecInfo.getName().equals("OMX.google.h264.encoder")) {
                return "OMX.google.h264.encoder";
            }
            i++;
            str = name;
        }
        return str;
    }

    /* renamed from: a */
    public void mo231244a() {
        startActivityForResult(this.f166816a.createScreenCaptureIntent(), 101);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tt.miniapp.view.swipeback.SwipeBackActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.microapp_m_activity_feedback_record_activity);
        m258823f();
    }

    /* renamed from: a */
    public static Resources m258815a(FeedbackRecordActivity feedbackRecordActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(feedbackRecordActivity);
        }
        return feedbackRecordActivity.mo231247c();
    }

    /* renamed from: c */
    public static AssetManager m258822c(FeedbackRecordActivity feedbackRecordActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(feedbackRecordActivity);
        }
        return feedbackRecordActivity.mo231250e();
    }

    /* renamed from: b */
    public static void m258820b(FeedbackRecordActivity feedbackRecordActivity) {
        feedbackRecordActivity.mo231249d();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            FeedbackRecordActivity feedbackRecordActivity2 = feedbackRecordActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    feedbackRecordActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: b */
    private void m258821b(String str) {
        try {
            IFeedbackRecordCallback iFeedbackRecordCallback = f166815d;
            if (iFeedbackRecordCallback != null) {
                iFeedbackRecordCallback.onSuccess("ok" + str);
            }
        } catch (RemoteException e) {
            AppBrandLogger.stacktrace(6, "tma_FeedbackRecordActivity", e.getStackTrace());
        }
    }

    /* renamed from: a */
    private void m258819a(String str) {
        try {
            IFeedbackRecordCallback iFeedbackRecordCallback = f166815d;
            if (iFeedbackRecordCallback != null) {
                iFeedbackRecordCallback.onFail("fail" + str);
            }
        } catch (RemoteException e) {
            AppBrandLogger.stacktrace(6, "tma_FeedbackRecordActivity", e.getStackTrace());
        }
    }

    /* renamed from: a */
    public static void m258818a(FeedbackRecordActivity feedbackRecordActivity, Context context) {
        feedbackRecordActivity.mo231245a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(feedbackRecordActivity);
        }
    }

    /* renamed from: a */
    public static Context m258814a(FeedbackRecordActivity feedbackRecordActivity, Configuration configuration) {
        Context a = feedbackRecordActivity.mo231243a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public static void m258817a(Context context, IFeedbackRecordCallback iFeedbackRecordCallback) {
        f166815d = iFeedbackRecordCallback;
        Intent intent = new Intent(context, FeedbackRecordActivity.class);
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    /* renamed from: a */
    private C66172f m258816a(MediaProjection mediaProjection, C66177g gVar, File file) {
        AbstractC67433a k = C67448a.m262353a().mo234192k();
        if (k == null) {
            k = C67448a.m262353a().mo234190i();
        }
        C66172f a = C66172f.m259103a(k);
        a.mo231490a(gVar, 1, mediaProjection, file.getAbsolutePath());
        return a;
    }

    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity, com.tt.miniapp.view.swipeback.SwipeBackActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 101 && i2 == -1) {
            MediaProjection mediaProjection = this.f166816a.getMediaProjection(i2, intent);
            if (mediaProjection == null) {
                AppBrandLogger.m52829e("tma_FeedbackRecordActivity", "media projection is null");
                m258819a("media projection is null");
                m258824g();
                return;
            }
            C66177g h = m258825h();
            if (h == null) {
                AppBrandLogger.m52829e("tma_FeedbackRecordActivity", "Create ScreenRecorderManager failure");
                mediaProjection.stop();
                m258819a("Create ScreenRecorderManager failure");
                m258824g();
                return;
            }
            File file = new File(C66100e.f166842a);
            if (file.exists() || file.mkdirs()) {
                File file2 = new File(file, "ScreenCapture.mp4");
                AppBrandLogger.m52828d("tma_FeedbackRecordActivity", "Create recorder with :" + h + " \n \n " + file2);
                this.f166818c = m258816a(mediaProjection, h, file2);
                m258826i();
                m258821b("");
            } else {
                m258827l();
                m258819a("file path not exist");
                m258824g();
                return;
            }
        } else {
            m258819a("cancel");
        }
        m258824g();
    }
}
