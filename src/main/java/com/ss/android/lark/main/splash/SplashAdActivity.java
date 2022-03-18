package com.ss.android.lark.main.splash;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.ad.splash.AbstractC27449i;
import com.ss.android.ad.splash.AbstractC27451k;
import com.ss.android.ad.splash.AbstractC27470u;
import com.ss.android.ad.splash.AbstractC27488v;
import com.ss.android.ad.splash.C27461q;
import com.ss.android.ad.splash.origin.AbstractC27456a;
import com.ss.android.ad.splash.utils.HandlerC27486n;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.main.C44134a;
import com.ss.android.lark.main.app.MainActivity;
import com.ss.android.lark.util.share_preference.UserSP;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.StatusBarUtil;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\tH\u0002J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\tH\u0014J\f\u0010\u0015\u001a\u00020\u0016*\u00020\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/main/splash/SplashAdActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "Lcom/ss/android/ad/splash/utils/WeakHandler$IHandler;", "()V", "directlyGoMain", "", "handler", "Lcom/ss/android/ad/splash/utils/WeakHandler;", "adaptStatusBarVisualEffects", "", "getEnterAnimationConfig", "Lcom/ss/android/lark/base/activity/ActivityAnimationManager$AnimationConfig;", "getExitAnimationConfig", "goMainActivity", "handleMsg", "msg", "Landroid/os/Message;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "init", "Lcom/ss/android/ad/splash/SplashAdNative;", "Companion", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class SplashAdActivity extends BaseFragmentActivity implements HandlerC27486n.AbstractC27487a {

    /* renamed from: c */
    public static final Companion f112870c = new Companion(null);

    /* renamed from: a */
    public final HandlerC27486n f112871a = new HandlerC27486n(this);

    /* renamed from: b */
    public boolean f112872b;

    /* renamed from: a */
    public Context mo157959a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo157961a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m176596a(this, context);
    }

    /* renamed from: b */
    public Resources mo157962b() {
        return super.getResources();
    }

    /* renamed from: c */
    public void mo157963c() {
        super.onStop();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m176593a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo157965d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m176598c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m176594a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m176597b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\u0014\u0010\f\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/main/splash/SplashAdActivity$Companion;", "", "()V", "LOG_TAG", "", "MSG_GO_MAIN_ACTIVITY", "", "openUrl", "", "context", "Landroid/content/Context;", "url", "isTheSameDayAs", "", "Ljava/util/Date;", "date", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.splash.SplashAdActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo157967a(Context context, String str) {
            Log.m165389i("SplashAd_Activity_i18n", "showSplashAd: navigating to url " + str);
            C44134a.m174959a().mo133213a(context, str);
        }

        /* renamed from: a */
        public final boolean mo157968a(Date date, Date date2) {
            if (date.getYear() == date2.getYear() && date.getMonth() == date2.getMonth() && date.getDate() == date2.getDate()) {
                return true;
            }
            return false;
        }
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_FADE_OUT);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(new int[]{R.anim.fade_in, R.anim.fade_out});
    }

    /* renamed from: e */
    private final void m176599e() {
        if (Build.VERSION.SDK_INT >= 28) {
            Window window = getWindow();
            Intrinsics.checkExpressionValueIsNotNull(window, "window");
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            Window window2 = getWindow();
            Intrinsics.checkExpressionValueIsNotNull(window2, "window");
            window2.setAttributes(attributes);
        }
        StatusBarUtil.setTransparentForImageView(this, null);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onResume() {
        super.onResume();
        Log.m165389i("SplashAd_Activity_i18n", "onResume, going to main activity: " + this.f112872b);
        if (this.f112872b) {
            mo157960a();
        }
    }

    /* renamed from: a */
    public final void mo157960a() {
        this.f112871a.removeCallbacksAndMessages(null);
        setResult(-1, new Intent(this, MainActivity.class));
        Log.m165389i("SplashAd_Activity_i18n", "returning to main activity");
        finish();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001c\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016¨\u0006\u0010¸\u0006\u0000"}, d2 = {"com/ss/android/lark/main/splash/SplashAdActivity$init$1$1", "Lcom/ss/android/ad/splash/SplashAdActionListener;", "onSplashAdClick", "", "splashAdView", "Landroid/view/View;", "splashAdInfo", "Lcom/ss/android/ad/splash/SplashAdInfo;", "onSplashAdEnd", "endExtra", "Lcom/ss/android/ad/splash/ISplashAdEndExtra;", "onSplashViewPreDraw", "cid", "", "logExtra", "", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.splash.SplashAdActivity$b */
    public static final class C44513b implements AbstractC27451k {

        /* renamed from: a */
        final /* synthetic */ SplashAdActivity f112873a;

        @Override // com.ss.android.ad.splash.AbstractC27451k
        /* renamed from: a */
        public void mo98019a(long j, String str) {
        }

        C44513b(SplashAdActivity splashAdActivity) {
            this.f112873a = splashAdActivity;
        }

        @Override // com.ss.android.ad.splash.AbstractC27451k
        /* renamed from: a */
        public void mo98020a(View view, AbstractC27449i iVar) {
            Log.m165389i("SplashAd_Activity_i18n", "showSplashAd end");
            this.f112873a.mo157960a();
        }

        @Override // com.ss.android.ad.splash.AbstractC27451k
        /* renamed from: a */
        public void mo98021a(View view, C27461q qVar) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(qVar, "splashAdInfo");
            List<C27461q.C27464b> a = qVar.mo98030a();
            Intrinsics.checkExpressionValueIsNotNull(a, "splashAdInfo.urlEntities");
            Iterator<T> it = a.iterator();
            boolean z2 = false;
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                String str = next.f68645a;
                String str2 = str;
                if (str2 == null || str2.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    List<C27461q.C27464b> a2 = qVar.mo98030a();
                    Intrinsics.checkExpressionValueIsNotNull(a2, "splashAdInfo.urlEntities");
                    if (i == CollectionsKt.getLastIndex(a2)) {
                        this.f112873a.f112871a.sendEmptyMessage(1);
                    }
                } else {
                    int i2 = next.f68646b;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            SplashAdActivity.f112870c.mo157967a(this.f112873a, str);
                        } else if (i2 == 2 || i2 == 5) {
                            SplashAdActivity.f112870c.mo157967a(this.f112873a, str);
                        } else {
                            this.f112873a.f112871a.sendEmptyMessage(1);
                        }
                        z2 = true;
                    }
                }
                i++;
            }
            if (z2) {
                this.f112873a.f112872b = true;
            }
        }
    }

    /* renamed from: a */
    private final AbstractC27488v m176595a(AbstractC27488v vVar) {
        vVar.mo97623a(new C44513b(this));
        return vVar;
    }

    /* renamed from: a */
    public static Resources m176594a(SplashAdActivity splashAdActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(splashAdActivity);
        }
        return splashAdActivity.mo157962b();
    }

    /* renamed from: c */
    public static AssetManager m176598c(SplashAdActivity splashAdActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(splashAdActivity);
        }
        return splashAdActivity.mo157965d();
    }

    /* renamed from: b */
    public static void m176597b(SplashAdActivity splashAdActivity) {
        splashAdActivity.mo157963c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            SplashAdActivity splashAdActivity2 = splashAdActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    splashAdActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        disableBlackStatusBarBeforeOnCreate();
        super.onCreate(bundle);
        setContentView(R.layout.splash_ad_layout);
        m176599e();
        AbstractC27470u b = SplashAdManagerHolder.f112876a.mo157979b(this);
        if (!b.mo97616c()) {
            Log.m165389i("SplashAd_Activity_i18n", "showSplashAd failed: no ad is to be displayed");
            this.f112871a.sendEmptyMessage(1);
            return;
        }
        AbstractC27456a d = b.mo97617d();
        Intrinsics.checkExpressionValueIsNotNull(d, "splashAdManager.currentSplashAd");
        Log.m165389i("SplashAd_Activity_i18n", "showSplashAd success: an ad " + d + " is to be displayed");
        AbstractC27488v b2 = b.mo97613b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "splashAdManager.splashAdNative");
        ViewGroup a = m176595a(b2).mo97621a(getBaseContext());
        long j = UserSP.getInstance().getLong("last_splash_ad_time");
        if (j == 0 || f112870c.mo157968a(new Date(j), new Date(System.currentTimeMillis()))) {
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.splash_main_root);
            if (a == null || viewGroup == null) {
                this.f112871a.sendEmptyMessage(1);
            } else {
                viewGroup.addView(a);
            }
        } else {
            Log.m165389i("SplashAd_Activity_i18n", "showSplashAd failed: the ad has expired with id " + d.mo97509v() + ", obtained at " + j);
            this.f112871a.sendEmptyMessage(1);
        }
    }

    @Override // com.ss.android.ad.splash.utils.HandlerC27486n.AbstractC27487a
    /* renamed from: a */
    public void mo97152a(Message message) {
        Intrinsics.checkParameterIsNotNull(message, "msg");
        if (message.what == 1) {
            mo157960a();
        }
    }

    /* renamed from: a */
    public static Context m176593a(SplashAdActivity splashAdActivity, Configuration configuration) {
        Context a = splashAdActivity.mo157959a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public static void m176596a(SplashAdActivity splashAdActivity, Context context) {
        splashAdActivity.mo157961a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(splashAdActivity);
        }
    }
}
