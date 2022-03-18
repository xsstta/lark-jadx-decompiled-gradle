package com.ss.android.lark.chat.video;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.transition.Transition;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.chat.video.InnerVideoPreviewFragment;
import com.ss.android.lark.chat.video.YoutubeVideoPreviewFragment;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.StatusBarUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0014J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\t\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010\f\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0002¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/chat/video/VideoPreviewActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "Lcom/ss/android/lark/chat/video/OnFragmentInteractListener;", "()V", "isDoAnimationWithDefault", "", "onBackPressed", "", "onClosed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onFragmentInflated", "setupShareElementCallback", "listener", "Lcom/ss/android/lark/chat/video/SharedElementListener;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class VideoPreviewActivity extends BaseFragmentActivity implements OnFragmentInteractListener {
    /* renamed from: a */
    public Context mo126959a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo126961a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m133324a(this, context);
    }

    /* renamed from: c */
    public Resources mo126963c() {
        return super.getResources();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m133322a(this, configuration);
    }

    /* renamed from: d */
    public void mo126965d() {
        super.onStop();
    }

    /* renamed from: e */
    public AssetManager mo126966e() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m133327c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m133323a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public boolean isDoAnimationWithDefault() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m133326b(this);
    }

    @Override // com.ss.android.lark.chat.video.OnFragmentInteractListener
    /* renamed from: a */
    public void mo126960a() {
        startPostponedEnterTransition();
    }

    @Override // com.ss.android.lark.chat.video.OnFragmentInteractListener
    /* renamed from: b */
    public void mo126962b() {
        StatusBarUtil.showStatusBar(this);
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        mo126962b();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "supportFragmentManager");
        for (Fragment fragment : supportFragmentManager.getFragments()) {
            if ((fragment instanceof BackListener) && ((BackListener) fragment).mo126985a()) {
                return;
            }
        }
        super.onBackPressed();
    }

    /* renamed from: a */
    public static Resources m133323a(VideoPreviewActivity videoPreviewActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(videoPreviewActivity);
        }
        return videoPreviewActivity.mo126963c();
    }

    /* renamed from: c */
    public static AssetManager m133327c(VideoPreviewActivity videoPreviewActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(videoPreviewActivity);
        }
        return videoPreviewActivity.mo126966e();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/chat/video/VideoPreviewActivity$setupShareElementCallback$1", "Landroid/transition/Transition$TransitionListener;", "onTransitionCancel", "", "transition", "Landroid/transition/Transition;", "onTransitionEnd", "onTransitionPause", "onTransitionResume", "onTransitionStart", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.video.VideoPreviewActivity$a */
    public static final class C34384a implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ VideoPreviewActivity f88775a;

        /* renamed from: b */
        final /* synthetic */ SharedElementListener f88776b;

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            this.f88776b.mo126995g();
            this.f88775a.setRequestedOrientation(-1);
            Window window = this.f88775a.getWindow();
            Intrinsics.checkExpressionValueIsNotNull(window, "window");
            window.getSharedElementEnterTransition().removeListener(this);
        }

        C34384a(VideoPreviewActivity videoPreviewActivity, SharedElementListener gVar) {
            this.f88775a = videoPreviewActivity;
            this.f88776b = gVar;
        }
    }

    /* renamed from: b */
    public static void m133326b(VideoPreviewActivity videoPreviewActivity) {
        videoPreviewActivity.mo126965d();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            VideoPreviewActivity videoPreviewActivity2 = videoPreviewActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    videoPreviewActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private final void m133325a(SharedElementListener gVar) {
        Window window = getWindow();
        Intrinsics.checkExpressionValueIsNotNull(window, "window");
        window.getSharedElementEnterTransition().addListener(new C34384a(this, gVar));
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        disableBlackStatusBarBeforeOnCreate();
        super.onCreate(bundle);
        setContentView(R.layout.activity_video_preview);
        StatusBarUtil.setTranslucentForImageView(this, 255, findViewById(R.id.fragment_container));
        postponeEnterTransition();
        String stringExtra = getIntent().getStringExtra("preview_origin_url");
        Image image = (Image) getIntent().getSerializableExtra("preview_cover");
        String stringExtra2 = getIntent().getStringExtra("preview_i_frame_url");
        String stringExtra3 = getIntent().getStringExtra("preview_vid");
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "supportFragmentManager.beginTransaction()");
        if (!TextUtils.isEmpty(stringExtra2)) {
            YoutubeVideoPreviewFragment.Companion aVar = YoutubeVideoPreviewFragment.f88849f;
            if (stringExtra2 == null) {
                Intrinsics.throwNpe();
            }
            YoutubeVideoPreviewFragment a = aVar.mo127048a(stringExtra2, stringExtra3, image);
            beginTransaction.add(R.id.fragment_container, a);
            beginTransaction.commitNowAllowingStateLoss();
            m133325a(a);
        } else if (!TextUtils.isEmpty(stringExtra)) {
            InnerVideoPreviewFragment.Companion aVar2 = InnerVideoPreviewFragment.f88780e;
            if (stringExtra == null) {
                Intrinsics.throwNpe();
            }
            InnerVideoPreviewFragment a2 = aVar2.mo126999a(stringExtra, image);
            beginTransaction.add(R.id.fragment_container, a2);
            beginTransaction.commitNowAllowingStateLoss();
            m133325a(a2);
        } else {
            finish();
        }
    }

    /* renamed from: a */
    public static void m133324a(VideoPreviewActivity videoPreviewActivity, Context context) {
        videoPreviewActivity.mo126961a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(videoPreviewActivity);
        }
    }

    /* renamed from: a */
    public static Context m133322a(VideoPreviewActivity videoPreviewActivity, Configuration configuration) {
        Context a = videoPreviewActivity.mo126959a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
