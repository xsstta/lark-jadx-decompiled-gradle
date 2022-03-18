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
import com.ss.android.lark.C29990c;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.chat.preview.entity.component.property.VideoProperty;
import com.ss.android.lark.chat.video.InnerVideoPreviewFragment;
import com.ss.android.lark.chat.video.YoutubeVideoPreviewFragment;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.StatusBarUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u00012\u00020\u0002:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0014J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\t\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010\f\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0002¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/chat/video/VideoPreviewActivity2;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "Lcom/ss/android/lark/chat/video/OnFragmentInteractListener;", "()V", "isDoAnimationWithDefault", "", "onBackPressed", "", "onClosed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onFragmentInflated", "setupShareElementCallback", "listener", "Lcom/ss/android/lark/chat/video/SharedElementListener;", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class VideoPreviewActivity2 extends BaseFragmentActivity implements OnFragmentInteractListener {

    /* renamed from: a */
    public static final Companion f88777a = new Companion(null);

    /* renamed from: a */
    public Context mo126973a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo126974a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m133337a(this, context);
    }

    /* renamed from: c */
    public Resources mo126975c() {
        return super.getResources();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m133335a(this, configuration);
    }

    /* renamed from: d */
    public void mo126977d() {
        super.onStop();
    }

    /* renamed from: e */
    public AssetManager mo126978e() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m133340c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m133336a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public boolean isDoAnimationWithDefault() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m133339b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chat/video/VideoPreviewActivity2$Companion;", "", "()V", "VIDEO_TAG", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.video.VideoPreviewActivity2$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
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
    public static Resources m133336a(VideoPreviewActivity2 videoPreviewActivity2) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(videoPreviewActivity2);
        }
        return videoPreviewActivity2.mo126975c();
    }

    /* renamed from: c */
    public static AssetManager m133340c(VideoPreviewActivity2 videoPreviewActivity2) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(videoPreviewActivity2);
        }
        return videoPreviewActivity2.mo126978e();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/chat/video/VideoPreviewActivity2$setupShareElementCallback$1", "Landroid/transition/Transition$TransitionListener;", "onTransitionCancel", "", "transition", "Landroid/transition/Transition;", "onTransitionEnd", "onTransitionPause", "onTransitionResume", "onTransitionStart", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.video.VideoPreviewActivity2$b */
    public static final class C34385b implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ VideoPreviewActivity2 f88778a;

        /* renamed from: b */
        final /* synthetic */ SharedElementListener f88779b;

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            this.f88779b.mo126995g();
            this.f88778a.setRequestedOrientation(-1);
            Window window = this.f88778a.getWindow();
            Intrinsics.checkExpressionValueIsNotNull(window, "window");
            window.getSharedElementEnterTransition().removeListener(this);
        }

        C34385b(VideoPreviewActivity2 videoPreviewActivity2, SharedElementListener gVar) {
            this.f88778a = videoPreviewActivity2;
            this.f88779b = gVar;
        }
    }

    /* renamed from: b */
    public static void m133339b(VideoPreviewActivity2 videoPreviewActivity2) {
        videoPreviewActivity2.mo126977d();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            VideoPreviewActivity2 videoPreviewActivity22 = videoPreviewActivity2;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    videoPreviewActivity22.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private final void m133338a(SharedElementListener gVar) {
        Window window = getWindow();
        Intrinsics.checkExpressionValueIsNotNull(window, "window");
        window.getSharedElementEnterTransition().addListener(new C34385b(this, gVar));
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        disableBlackStatusBarBeforeOnCreate();
        super.onCreate(bundle);
        setContentView(R.layout.activity_video_preview);
        StatusBarUtil.setTranslucentForImageView(this, 255, findViewById(R.id.fragment_container));
        postponeEnterTransition();
        String stringExtra = getIntent().getStringExtra("preview_video_url");
        Image image = (Image) getIntent().getSerializableExtra("preview_cover");
        String stringExtra2 = getIntent().getStringExtra("preview_i_frame_url");
        String stringExtra3 = getIntent().getStringExtra("preview_vid");
        int intExtra = getIntent().getIntExtra("preview_site", 0);
        int intExtra2 = getIntent().getIntExtra("previwee_source_type", -1);
        String stringExtra4 = getIntent().getStringExtra("preview_origin_url");
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "supportFragmentManager.beginTransaction()");
        int i = C34409h.f88848a[VideoProperty.Site.Companion.mo126534a(intExtra).ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                if (!TextUtils.isEmpty(stringExtra)) {
                    InnerVideoPreviewFragment.Companion aVar = InnerVideoPreviewFragment.f88780e;
                    if (stringExtra == null) {
                        Intrinsics.throwNpe();
                    }
                    InnerVideoPreviewFragment a = aVar.mo126999a(stringExtra, image);
                    beginTransaction.add(R.id.fragment_container, a);
                    beginTransaction.commitNowAllowingStateLoss();
                    m133338a(a);
                    return;
                }
                Log.m165389i("VideoPreviewActivity2", "site is: " + intExtra + ",srcUrl is null");
                finish();
            } else if (i != 4) {
                if (TextUtils.isEmpty(stringExtra)) {
                    stringExtra = stringExtra4;
                }
                if (TextUtils.isEmpty(stringExtra)) {
                    Log.m165389i("VideoPreviewActivity2", "playUrl is null");
                } else {
                    AbstractC36474h b = C29990c.m110930b();
                    Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                    b.mo134593u().mo134333b(this, stringExtra, intExtra2);
                }
                finish();
            } else if (!TextUtils.isEmpty(stringExtra)) {
                InnerVideoPreviewFragment.Companion aVar2 = InnerVideoPreviewFragment.f88780e;
                if (stringExtra == null) {
                    Intrinsics.throwNpe();
                }
                InnerVideoPreviewFragment a2 = aVar2.mo126999a(stringExtra, image);
                beginTransaction.add(R.id.fragment_container, a2);
                beginTransaction.commitNowAllowingStateLoss();
                m133338a(a2);
            } else if (!TextUtils.isEmpty(stringExtra4)) {
                AbstractC36474h b2 = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
                b2.mo134593u().mo134333b(this, stringExtra4, intExtra2);
                finish();
            } else {
                Log.m165389i("VideoPreviewActivity2", "site is: " + intExtra + ",srcUrl and originUrl are null");
                finish();
            }
        } else if (TextUtils.isEmpty(stringExtra2)) {
            YoutubeVideoPreviewFragment.Companion aVar3 = YoutubeVideoPreviewFragment.f88849f;
            if (stringExtra2 == null) {
                Intrinsics.throwNpe();
            }
            YoutubeVideoPreviewFragment a3 = aVar3.mo127048a(stringExtra2, stringExtra3, image);
            beginTransaction.add(R.id.fragment_container, a3);
            beginTransaction.commitNowAllowingStateLoss();
            m133338a(a3);
        } else {
            Log.m165389i("VideoPreviewActivity2", "site is:" + intExtra + ",iFrameUrl is null");
            finish();
        }
    }

    /* renamed from: a */
    public static void m133337a(VideoPreviewActivity2 videoPreviewActivity2, Context context) {
        videoPreviewActivity2.mo126974a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(videoPreviewActivity2);
        }
    }

    /* renamed from: a */
    public static Context m133335a(VideoPreviewActivity2 videoPreviewActivity2, Configuration configuration) {
        Context a = videoPreviewActivity2.mo126973a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
