package com.ss.android.lark.main.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1168n;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.ad.splash.C27453m;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.base.activity.AppActivity;
import com.ss.android.lark.base.p1400a.AbstractC29524c;
import com.ss.android.lark.base.p1400a.C29520a;
import com.ss.android.lark.base.p1400a.C29521b;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.main.C44134a;
import com.ss.android.lark.main.app.fragment.C44280h;
import com.ss.android.lark.main.app.fragment.phone.C44300b;
import com.ss.android.lark.main.p2231a.AbstractC44136a;
import com.ss.android.lark.main.router.OnPostLaunchActionRegistry;
import com.ss.android.lark.main.router.OpenUriPostLaunchAction;
import com.ss.android.lark.main.splash.SplashAdActivity;
import com.ss.android.lark.main.splash.SplashAdManagerHolder;
import com.ss.android.lark.main.statistics.MainHitPointHelper;
import com.ss.android.lark.main.widget.WidgetRefreshController;
import com.ss.android.lark.maincore.AbstractC44544a;
import com.ss.android.lark.passport.signinsdk_api.entity.SigninParams;
import com.ss.android.lark.slideback.ActivitySlideHelper;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.MagicWindowUtil;
import com.ss.android.lark.widget.ILifeCycleEventObserve;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainActivity extends AppActivity implements ILifeCycleEventObserve {

    /* renamed from: a */
    public static boolean f112089a;

    /* renamed from: i */
    private static boolean f112090i;

    /* renamed from: b */
    final AbstractC44136a f112091b = C44134a.m174959a();

    /* renamed from: c */
    public C29521b f112092c;

    /* renamed from: d */
    public ActivitySlideHelper f112093d;

    /* renamed from: e */
    public boolean f112094e;

    /* renamed from: f */
    public boolean f112095f;

    /* renamed from: g */
    AbstractC44544a f112096g = new AbstractC44544a() {
        /* class com.ss.android.lark.main.app.MainActivity.C441792 */

        @Override // com.ss.android.lark.maincore.AbstractC44544a
        /* renamed from: a */
        public void mo102546a() {
        }

        @Override // com.ss.android.lark.maincore.AbstractC44544a
        /* renamed from: a */
        public void mo102547a(String str) {
        }

        @Override // com.ss.android.lark.maincore.AbstractC44544a
        /* renamed from: b */
        public void mo102548b() {
            C44325i.m175831a().mo157444b(this);
            if (MainActivity.f112089a) {
                MainActivity.this.f112091b.mo133182B().mo133366d("wait_load_data", "wait_load_data");
                MainActivity.f112089a = false;
            }
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.main.app.MainActivity.C441792.RunnableC441801 */

                public void run() {
                    MainActivity.this.mo157152c();
                }
            });
            MainActivity.this.f112091b.mo133257m().mo133349a((Activity) MainActivity.this);
        }
    };

    /* renamed from: h */
    Map<ILifeCycleEventObserve.AbstractC58308a, AbstractC44544a> f112097h = new HashMap();

    /* renamed from: j */
    private int f112098j;

    /* renamed from: k */
    private AbstractC29524c f112099k;

    /* renamed from: l */
    private boolean f112100l;

    /* renamed from: m */
    private Handler f112101m;

    /* renamed from: n */
    private final C29521b.AbstractC29523a f112102n = new C29521b.AbstractC29523a() {
        /* class com.ss.android.lark.main.app.$$Lambda$MainActivity$OeZ6yOdQLZ6TvItrT1BOKuYI */

        @Override // com.ss.android.lark.base.p1400a.C29521b.AbstractC29523a
        public final void onShowPageChanged(AbstractC29524c cVar) {
            MainActivity.this.m175274a((MainActivity) cVar);
        }
    };

    /* renamed from: o */
    private Bundle f112103o;

    /* renamed from: p */
    private AbstractC1168n f112104p = new AbstractC1168n() {
        /* class com.ss.android.lark.main.app.MainActivity.C441781 */

        @Override // androidx.lifecycle.AbstractC1168n
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_STOP) {
                MainActivity.this.f112094e = true;
            } else if (event == Lifecycle.Event.ON_RESUME) {
                MainActivity.this.f112094e = false;
                if (MainActivity.this.f112095f) {
                    MainActivity.this.f112095f = false;
                    MainActivity.this.mo157152c();
                }
            }
        }
    };

    /* renamed from: q */
    private MainActivityWatermarkController f112105q;

    /* renamed from: a */
    public Context mo157149a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo157150a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m175276a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m175273a(this, configuration);
    }

    /* renamed from: e */
    public Resources mo157155e() {
        return super.getResources();
    }

    @Override // com.ss.android.lark.base.watermark.IWatermarkable, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public boolean enableGlobalWatermark() {
        return false;
    }

    /* renamed from: f */
    public AssetManager mo157156f() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m175283c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m175281b(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public boolean isNeedLoginStatus() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m175275a(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo157154d() {
        this.f112105q.mo157169a();
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_FADE_OUT);
    }

    /* renamed from: m */
    private boolean m175291m() {
        return C44134a.m174959a().mo133270z().mo133361a("lark.android.offline.push.sync.chat");
    }

    /* renamed from: n */
    private void m175292n() {
        if (!MagicWindowUtil.m224685a()) {
            MagicWindowUtil.m224684a(this);
            MagicWindowUtil.m224683a(1);
        }
    }

    /* renamed from: o */
    private void m175293o() {
        C44325i a = C44325i.m175831a();
        if (a != null) {
            a.mo157441a($$Lambda$MainActivity$e79BFh3OYO4qGPGGaKieS59tvzA.INSTANCE);
        }
    }

    /* renamed from: p */
    private void m175294p() {
        this.f112101m = new Handler(Looper.getMainLooper()) {
            /* class com.ss.android.lark.main.app.MainActivity.HandlerC441835 */

            public void handleMessage(Message message) {
                if (message.what == 67977) {
                    MainActivity.this.mo157152c();
                }
                super.handleMessage(message);
            }
        };
    }

    /* renamed from: h */
    private void m175286h() {
        this.f112091b.mo133182B().mo133362a();
        this.f112105q.mo157171c();
        m175287i();
    }

    /* renamed from: j */
    private boolean m175288j() {
        Activity activity = DualActivityManager.f112116a.mo157167a().get();
        if (!MagicWindowUtil.m224687e(this) || activity == null || !activity.isTaskRoot()) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    private void m175289k() {
        if (MagicWindowUtil.m224687e(this) || MagicWindowUtil.m224686d(this)) {
            Log.m165383e("MainModule_MainActivity", "in magic-window mode, MainActivity finish is invalid");
        } else {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onPause() {
        C29520a aVar;
        super.onPause();
        if (this.f112099k != null && (aVar = (C29520a) getSupportFragmentManager().findFragmentByTag(this.f112099k.mo104616b())) != null) {
            aVar.onPause();
        }
    }

    static {
        Context i = C44134a.m174959a().mo133253i();
        if (C44134a.m174959a().mo133198R() && !C44134a.m174959a().mo133259o().mo133357a(i)) {
            C44134a.m174959a().mo133182B().mo133366d("wait_main_activity_start", "wait_main_activity_start");
            C44134a.m174959a().mo133182B().mo133365c("handle_main_activity_start", "handle_main_activity_start");
        }
    }

    /* renamed from: g */
    private void m175285g() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }
        if (extras.getBoolean("key_privacy_authorization", false)) {
            Log.m165389i("MainModule_MainActivity", "accept privacy authorization");
            MainHitPointHelper.m176676f();
            return;
        }
        Log.m165389i("MainModule_MainActivity", "not accept privacy authorization");
    }

    /* renamed from: l */
    private void m175290l() {
        SparseArray<AbstractC29524c> a = this.f112091b.mo133261q().mo133325a();
        a.append(4097, new C44280h());
        this.f112099k = a.get(4097);
        this.f112092c = new C29521b(this, this.f112102n, a, 4097);
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        try {
            Log.m165389i("MainModule_MainActivity", "onBackPressed" + this.f112099k);
            if (!this.f112092c.mo104608a()) {
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.setFlags(268435456);
                intent.addCategory("android.intent.category.HOME");
                startActivity(intent);
            }
        } catch (Exception unused) {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        Log.m165389i("MainModule_MainActivity", "onDestroy");
        if (!C44134a.m174959a().mo133198R()) {
            super.onDestroy();
            return;
        }
        MainActivityWatermarkController cVar = this.f112105q;
        if (cVar != null) {
            cVar.mo157170b();
        }
        super.onDestroy();
        C44321g.m175828a().mo157435b();
        C44325i.m175831a().mo157444b(this.f112096g);
        Handler handler = this.f112101m;
        if (handler != null) {
            handler.removeMessages(67977);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onResume() {
        this.f112091b.mo133182B().mo133363a("MainActivityResume", null);
        super.onResume();
        this.f112091b.mo133182B().mo133362a();
        if (!f112090i) {
            C44134a.m174959a().mo133182B().mo133366d("handle_main_activity_start", "handle_main_activity_start");
            f112090i = true;
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStart() {
        this.f112091b.mo133182B().mo133363a("MainActivityStart", null);
        super.onStart();
        this.f112091b.mo133182B().mo133362a();
        if (DesktopUtil.m144301a((Context) this)) {
            C36512a.m144041a().mo134768a(false);
        }
    }

    /* renamed from: i */
    private void m175287i() {
        boolean z;
        Uri uri;
        Intent intent = getIntent();
        if (intent != null) {
            uri = (Uri) intent.getParcelableExtra("extra_uri_from_link");
            z = intent.getBooleanExtra("key_passport_upgrade", false);
        } else {
            uri = null;
            z = false;
        }
        Log.m165389i("MainModule_MainActivity", "handleLinkAfterCreate extra_uri_from_link = " + uri);
        boolean a = this.f112091b.mo133257m().mo133348a();
        if (z && uri != null && a) {
            OnPostLaunchActionRegistry.m176546a(new OpenUriPostLaunchAction(uri, true, getIntent().getExtras()));
        }
        OnPostLaunchActionRegistry.m176545a(this);
        if (intent != null && uri != null) {
            this.f112091b.mo133225a((Context) this, uri, false);
            if (intent.getBooleanExtra("key_privacy_authorization", false) || (z && !a)) {
                OnPostLaunchActionRegistry.m176546a(new OpenUriPostLaunchAction(uri, true, intent.getExtras()));
            }
        }
    }

    /* renamed from: b */
    public void mo157151b() {
        Log.m165389i("MainModule_MainActivity", "onStop");
        if (DesktopUtil.m144301a((Context) this)) {
            C36512a.m144041a().mo134768a(true);
        }
        super.onStop();
    }

    /* renamed from: c */
    public void mo157152c() {
        if (!this.f112100l) {
            if (this.f112094e) {
                this.f112095f = true;
                return;
            }
            getLifecycle().removeObserver(this.f112104p);
            this.f112100l = true;
            Log.m165389i("MainModule_MainActivity", "route next page start");
            this.f112092c.mo104605a(getIntent());
            getWindow().setBackgroundDrawable(getResources().getDrawable(R.color.lkui_N00));
            mo157154d();
            m175292n();
        }
    }

    @Override // com.ss.android.lark.base.activity.AppActivity
    /* renamed from: a */
    public void mo104623a() {
        super.mo104623a();
        try {
            C44321g.m175828a().mo157434a(this, false);
        } catch (Throwable th) {
            Log.m165383e("MainModule_MainActivity", "preloadUI: " + th.getMessage());
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m175277a(AbstractC44324h hVar) {
        if (hVar != null) {
            hVar.onBeforeFirstRoutePage();
        }
    }

    /* renamed from: b */
    private boolean m175282b(Intent intent) {
        if (intent == null) {
            return true;
        }
        try {
            intent.getIntExtra("checkParamsValidity", 0);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        Log.m165389i("MainModule_MainActivity", "onRestoreInstanceState ");
        super.onRestoreInstanceState(bundle);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m175274a(AbstractC29524c cVar) {
        this.f112099k = cVar;
        if (this.f112093d != null && cVar != null && cVar.mo104613a() == 4098) {
            this.f112093d.mo187272a(true);
        }
    }

    /* renamed from: b */
    private int m175280b(Bundle bundle) {
        if (bundle == null) {
            if (getIntent() == null) {
                bundle = null;
            } else {
                bundle = getIntent().getExtras();
            }
        }
        if (bundle == null) {
            return 0;
        }
        return bundle.getInt("key_source_from", 0);
    }

    /* renamed from: c */
    public static AssetManager m175283c(MainActivity mainActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mainActivity);
        }
        return mainActivity.mo157156f();
    }

    @Override // androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C29520a aVar;
        if (!(this.f112099k == null || (aVar = (C29520a) getSupportFragmentManager().findFragmentByTag(this.f112099k.mo104616b())) == null)) {
            aVar.mo104597a(keyEvent);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public void onWindowFocusChanged(boolean z) {
        C29520a aVar;
        if (!(this.f112099k == null || (aVar = (C29520a) getSupportFragmentManager().findFragmentByTag(this.f112099k.mo104616b())) == null || !z)) {
            aVar.mo104602c();
        }
        super.onWindowFocusChanged(z);
    }

    /* renamed from: b */
    public static Resources m175281b(MainActivity mainActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mainActivity);
        }
        return mainActivity.mo157155e();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onNewIntent(Intent intent) {
        Log.m165389i("MainModule_MainActivity", "onNewIntent");
        if (m175282b(intent)) {
            super.onNewIntent(intent);
            AbstractC44136a.AbstractC44160o m = this.f112091b.mo133257m();
            if (!m.mo133348a()) {
                m.mo133341a((Context) this);
                Log.m165379d("MainModule_MainActivity", "onNewIntent -> isLogin -> finish");
                m175289k();
            } else if (!m175278a(intent)) {
                setIntent(intent);
                C29521b bVar = this.f112092c;
                if (bVar != null) {
                    bVar.mo104605a(intent);
                }
                m175292n();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        if (C44134a.m174959a().mo133270z().mo133361a("lark.show.chat.in.fragment")) {
            ActivitySlideHelper aVar = new ActivitySlideHelper(this);
            this.f112093d = aVar;
            aVar.mo187272a(true);
            this.f112093d.mo187271a(new ActivitySlideHelper.IPageManager() {
                /* class com.ss.android.lark.main.app.MainActivity.C441824 */

                @Override // com.ss.android.lark.slideback.ActivitySlideHelper.IPageManager
                /* renamed from: a */
                public Fragment mo157161a() {
                    return MainActivity.this.f112092c.mo104610b();
                }

                @Override // com.ss.android.lark.slideback.ActivitySlideHelper.IPageManager
                /* renamed from: b */
                public void mo157162b() {
                    MainActivity.this.f112092c.mo104609a(false);
                    MainActivity.this.f112093d.mo187272a(false);
                }
            });
        }
    }

    /* renamed from: a */
    public static void m175275a(MainActivity mainActivity) {
        mainActivity.mo157151b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MainActivity mainActivity2 = mainActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    mainActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onSaveInstanceState(Bundle bundle) {
        if (this.f112099k != null) {
            C29520a aVar = (C29520a) getSupportFragmentManager().findFragmentByTag(this.f112099k.mo104616b());
            if (aVar != null) {
                bundle.putBundle("key_active_fragment_saved_state", aVar.mo104603d());
            }
            bundle.putInt("key_current_active_fragment", this.f112099k.mo104613a());
        }
        Log.m165389i("MainModule_MainActivity", "onSaveInstanceState : " + this.f112099k);
        try {
            super.onSaveInstanceState(bundle);
        } catch (IllegalStateException unused) {
        }
    }

    /* renamed from: a */
    private boolean m175278a(Intent intent) {
        if (intent == null) {
            return false;
        }
        String action = intent.getAction();
        Set<String> categories = intent.getCategories();
        if (TextUtils.equals(action, "android.intent.action.MAIN") && categories != null && categories.contains("android.intent.category.LAUNCHER")) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.widget.ILifeCycleEventObserve
    /* renamed from: b */
    public void mo129678b(ILifeCycleEventObserve.AbstractC58308a aVar) {
        C44325i.m175831a().mo157444b(this.f112097h.remove(aVar));
    }

    /* renamed from: a */
    private boolean m175279a(Bundle bundle) {
        this.f112098j = m175280b(bundle);
        Log.m165389i("MainModule_MainActivity", "isRepeatInstance: source = " + this.f112098j);
        int i = this.f112098j;
        if (i == 1 || i == 2 || i == 3 || isTaskRoot() || m175288j()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private void m175284c(Bundle bundle) {
        Bundle bundle2;
        this.f112091b.mo133182B().mo133363a("SplashRoute", null);
        if (!(bundle == null || (bundle2 = bundle.getBundle("key_active_fragment_saved_state")) == null)) {
            int i = bundle.getInt("key_current_active_fragment", 4097);
            Log.m165389i("MainModule_MainActivity", "splashRoute onRestoreInstanceState: " + i);
            bundle2.remove("switch_fragment_with_anim");
            bundle2.putInt("open_fragment_id", i);
            getIntent().putExtras(bundle2);
        }
        getLifecycle().addObserver(this.f112104p);
        if (this.f112091b.mo133257m().mo133348a()) {
            if (getIntent().getBooleanExtra("is_simplify_login", false)) {
                C44134a.m174959a().mo133181A().mo143224b(this, getIntent().getStringExtra("user_name"), getIntent().getStringExtra("meeting_id"));
            }
            int intExtra = getIntent().getIntExtra("open_fragment_id", 4097);
            if (intExtra != 4097) {
                this.f112091b.mo133184D();
            }
            boolean booleanExtra = getIntent().getBooleanExtra("key_param_from_offline_push", false);
            if (intExtra == 4098 && m175291m() && booleanExtra) {
                Log.m165389i("MainModule_MainActivity", "launch to chat, try to wait data sync, launch main first");
                Intent intent = new Intent();
                intent.putExtra("open_fragment_id", 4097);
                this.f112092c.mo104605a(intent);
            }
            if (intExtra != 4097 || this.f112098j == 1 || this.f112091b.mo133258n()) {
                Log.m165389i("MainModule_MainActivity", "routePage to " + intExtra);
                mo157152c();
            } else {
                C44325i.m175831a().mo157440a(this.f112096g);
                f112089a = true;
                this.f112091b.mo133182B().mo133365c("wait_load_data", "wait_load_data");
                this.f112101m.sendEmptyMessageDelayed(67977, 3000);
                m175292n();
            }
            C44238f.m175446b((Activity) this);
        } else {
            if (!this.f112091b.mo133230a(this)) {
                Log.m165383e("MainModule_MainActivity", "MainLauncher.hasRelaunchIntent():" + C44238f.m175447c());
                this.f112091b.mo133257m().mo133343a(this, SigninParams.newBuilder().mo172354d(C44238f.m175447c()).mo172350a());
            }
            Log.m165379d("MainModule_MainActivity", "splashRoute -> showGuidePageBeforeLoginIfNeed ->finish");
            m175289k();
        }
        this.f112091b.mo133182B().mo133362a();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        WidgetRefreshController.f112910b.mo158009a(getApplication());
        if (!this.f112091b.mo133198R()) {
            super.onCreate(bundle);
            this.f112091b.mo133241c(this, getIntent());
            Log.m165379d("MainModule_MainActivity", "onCreate -> isAuthorized -> finish");
            m175289k();
        } else if (this.f112091b.mo133199S()) {
            super.onCreate(bundle);
            this.f112091b.mo133234b(this, getIntent());
            Log.m165379d("MainModule_MainActivity", "onCreate -> isPassportNeedUpgrade -> finish");
            m175289k();
        } else if (this.f112091b.mo133259o().mo133357a((Context) this)) {
            super.onCreate(bundle);
            this.f112091b.mo133259o().mo133358b(this);
            Log.m165379d("MainModule_MainActivity", "onCreate -> isSimpleMode -> finish");
            m175289k();
        } else {
            this.f112091b.mo133182B().mo133364b("main_activity_create", null);
            AppCompatYogaViewLayoutFactory.m175313a(this);
            if (!m175282b(getIntent())) {
                getIntent().replaceExtras((Bundle) null);
                Log.m165397w("MainModule_MainActivity", "checkParamsValidity: true");
            }
            if (m175279a(bundle)) {
                super.onCreate(bundle);
                Log.m165389i("MainModule_MainActivity", "isRepeatInstance: true");
                Log.m165379d("MainModule_MainActivity", "onCreate -> isRepeatInstance -> finish");
                m175289k();
                this.f112091b.mo133182B().mo133362a();
                return;
            }
            C44330j.m175848a(this, this.f112091b);
            m175293o();
            if (bundle != null) {
                bundle.remove("switch_fragment_with_anim");
                bundle.remove("android:support:fragments");
            }
            super.onCreate(bundle);
            m175294p();
            m175290l();
            this.f112105q = new MainActivityWatermarkController(this);
            if (!DesktopUtil.m144301a((Context) this) && this.f112091b.mo133257m().mo133348a()) {
                SplashAdManagerHolder.f112876a.mo157978a(this);
                this.f112103o = bundle;
                if (C27453m.m100199a(this).mo97616c()) {
                    startActivityForResult(new Intent(this, SplashAdActivity.class), 31416);
                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                    return;
                }
            }
            m175284c(bundle);
            m175286h();
            m175285g();
        }
    }

    @Override // com.ss.android.lark.widget.ILifeCycleEventObserve
    /* renamed from: a */
    public void mo129675a(final ILifeCycleEventObserve.AbstractC58308a aVar) {
        C441813 r0 = new AbstractC44544a() {
            /* class com.ss.android.lark.main.app.MainActivity.C441813 */

            @Override // com.ss.android.lark.maincore.AbstractC44544a
            /* renamed from: a */
            public void mo102546a() {
                aVar.mo103142a(ILifeCycleEventObserve.Event.FIRST_FRAME_SHOWED);
            }

            @Override // com.ss.android.lark.maincore.AbstractC44544a
            /* renamed from: b */
            public void mo102548b() {
                aVar.mo103142a(ILifeCycleEventObserve.Event.FIRST_DATA_LOADED);
            }

            @Override // com.ss.android.lark.maincore.AbstractC44544a
            /* renamed from: a */
            public void mo102547a(String str) {
                aVar.mo103142a(ILifeCycleEventObserve.Event.FIRST_CONTENT_SHOWED);
            }
        };
        this.f112097h.put(aVar, r0);
        C44325i.m175831a().mo157440a(r0);
    }

    /* renamed from: a */
    public static void m175276a(MainActivity mainActivity, Context context) {
        mainActivity.mo157150a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mainActivity);
        }
    }

    /* renamed from: a */
    public static Context m175273a(MainActivity mainActivity, Configuration configuration) {
        Context a = mainActivity.mo157149a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 31416) {
            m175284c(this.f112103o);
            m175286h();
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (!(i != 31417 || supportFragmentManager == null || intent == null)) {
            C29520a aVar = (C29520a) supportFragmentManager.findFragmentByTag(this.f112099k.mo104616b());
            boolean booleanExtra = intent.getBooleanExtra("key_is_from_logout", false);
            if ((aVar instanceof C44300b) && booleanExtra) {
                ((C44300b) aVar).mo157270a(true);
            }
        }
        this.f112092c.mo104604a(i, i2, intent);
    }
}
