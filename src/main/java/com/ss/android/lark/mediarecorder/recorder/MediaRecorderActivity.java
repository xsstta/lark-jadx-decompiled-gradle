package com.ss.android.lark.mediarecorder.recorder;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mediarecorder.MediaRecorderConfig;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010\f\u001a\u00020\u0006H\u0014J\b\u0010\r\u001a\u00020\u0006H\u0014J\b\u0010\u000e\u001a\u00020\u0006H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/mediarecorder/recorder/MediaRecorderActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "config", "Lcom/ss/android/lark/mediarecorder/MediaRecorderConfig;", "finish", "", "initConfig", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "setupFragment", "Companion", "mediarecorder_release"}, mo238835k = 1, mv = {1, 1, 13})
public final class MediaRecorderActivity extends AppCompatActivity {

    /* renamed from: a */
    public static final Companion f113420a = new Companion(null);

    /* renamed from: b */
    private MediaRecorderConfig f113421b;

    /* renamed from: a */
    public Context mo158569a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo158571a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m177659a(this, context);
    }

    /* renamed from: b */
    public Resources mo158572b() {
        return super.getResources();
    }

    /* renamed from: c */
    public AssetManager mo158573c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m177657a(this, configuration);
    }

    public AssetManager getAssets() {
        return m177661c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public Resources getResources() {
        return m177660b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m177658a(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/mediarecorder/recorder/MediaRecorderActivity$Companion;", "", "()V", "PERMISSION_REQUEST", "", "REQUEST_TAKE_PHOTO", "mediarecorder_release"}, mo238835k = 1, mv = {1, 1, 13})
    /* renamed from: com.ss.android.lark.mediarecorder.recorder.MediaRecorderActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: e */
    private final void m177663e() {
        new Handler().post(new RunnableC44802b(this));
    }

    /* renamed from: d */
    private final boolean m177662d() {
        MediaRecorderConfig mediaRecorderConfig = (MediaRecorderConfig) getIntent().getParcelableExtra("MEDIA_TAKE_CONFIG");
        if (mediaRecorderConfig == null) {
            return false;
        }
        this.f113421b = mediaRecorderConfig;
        return true;
    }

    /* renamed from: a */
    public void mo158570a() {
        Window window = getWindow();
        Intrinsics.checkExpressionValueIsNotNull(window, "window");
        View decorView = window.getDecorView();
        Intrinsics.checkExpressionValueIsNotNull(decorView, "window.decorView");
        decorView.setSystemUiVisibility(0);
        super.onStop();
    }

    public void finish() {
        super.finish();
        MediaRecorderConfig mediaRecorderConfig = this.f113421b;
        if (mediaRecorderConfig != null && mediaRecorderConfig.f113394h != -1) {
            overridePendingTransition(R.anim.picker_stay, mediaRecorderConfig.f113394h);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStart() {
        super.onStart();
        Window window = getWindow();
        Intrinsics.checkExpressionValueIsNotNull(window, "window");
        View decorView = window.getDecorView();
        Intrinsics.checkExpressionValueIsNotNull(decorView, "window.decorView");
        decorView.setSystemUiVisibility(4);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 13})
    /* renamed from: com.ss.android.lark.mediarecorder.recorder.MediaRecorderActivity$b */
    public static final class RunnableC44802b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MediaRecorderActivity f113422a;

        RunnableC44802b(MediaRecorderActivity mediaRecorderActivity) {
            this.f113422a = mediaRecorderActivity;
        }

        public final void run() {
            MediaRecorderFragment aVar = new MediaRecorderFragment();
            Intent intent = this.f113422a.getIntent();
            Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
            aVar.setArguments(intent.getExtras());
            this.f113422a.getSupportFragmentManager().beginTransaction().replace(R.id.camera_view_fragment, aVar).commitAllowingStateLoss();
        }
    }

    /* renamed from: b */
    public static Resources m177660b(MediaRecorderActivity mediaRecorderActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mediaRecorderActivity);
        }
        return mediaRecorderActivity.mo158572b();
    }

    /* renamed from: c */
    public static AssetManager m177661c(MediaRecorderActivity mediaRecorderActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mediaRecorderActivity);
        }
        return mediaRecorderActivity.mo158573c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (m177662d()) {
            MediaRecorderConfig mediaRecorderConfig = this.f113421b;
            if (!(mediaRecorderConfig == null || mediaRecorderConfig.f113393g == -1)) {
                overridePendingTransition(mediaRecorderConfig.f113393g, R.anim.picker_stay);
            }
            setContentView(R.layout.recorder_activity_layout);
            m177663e();
            return;
        }
        finish();
    }

    /* renamed from: a */
    public static void m177658a(MediaRecorderActivity mediaRecorderActivity) {
        mediaRecorderActivity.mo158570a();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MediaRecorderActivity mediaRecorderActivity2 = mediaRecorderActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    mediaRecorderActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m177659a(MediaRecorderActivity mediaRecorderActivity, Context context) {
        mediaRecorderActivity.mo158571a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mediaRecorderActivity);
        }
    }

    /* renamed from: a */
    public static Context m177657a(MediaRecorderActivity mediaRecorderActivity, Configuration configuration) {
        Context a = mediaRecorderActivity.mo158569a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
