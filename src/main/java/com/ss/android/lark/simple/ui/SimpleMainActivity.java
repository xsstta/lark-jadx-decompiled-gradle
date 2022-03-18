package com.ss.android.lark.simple.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.lark.webview.container.impl.C19857c;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.simple.SimpleModule;
import com.ss.android.lark.simple.switcher.SimpleModeSwitcher;
import com.ss.android.lark.simple.ui.SimpleMainLauncher;
import com.ss.android.lark.simple.web.SimpleModeUrlParam;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 '2\u00020\u0001:\u0001'B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u0012\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001bH\u0014J\u0018\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u001dH\u0002J\b\u0010%\u001a\u00020\u001dH\u0002J\u0012\u0010&\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u00108BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/ss/android/lark/simple/ui/SimpleMainActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "isMainViewPageShowed", "", "mBrowserDependency", "Lcom/ss/android/lark/simple/SimpleModule$IBrowserDependency;", "getMBrowserDependency", "()Lcom/ss/android/lark/simple/SimpleModule$IBrowserDependency;", "mBrowserDependency$delegate", "Lkotlin/Lazy;", "mContainer", "Landroid/view/View;", "mFragment", "Landroidx/fragment/app/Fragment;", "mLoadUrl", "", "getMLoadUrl", "()Ljava/lang/String;", "mLoadUrl$delegate", "mMainHandler", "Landroid/os/Handler;", "mRootView", "mSourceFrom", "", "getSourceFrom", "bundle", "Landroid/os/Bundle;", "initMainHandler", "", "onCreate", "savedInstanceState", "onKeyDown", "keyCode", "event", "Landroid/view/KeyEvent;", "showMainViewPage", "showSimpleContent", "splashRoute", "Companion", "core_simple_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class SimpleMainActivity extends BaseFragmentActivity {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f135466a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SimpleMainActivity.class), "mLoadUrl", "getMLoadUrl()Ljava/lang/String;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SimpleMainActivity.class), "mBrowserDependency", "getMBrowserDependency()Lcom/ss/android/lark/simple/SimpleModule$IBrowserDependency;"))};

    /* renamed from: b */
    public static final int f135467b = f135467b;

    /* renamed from: c */
    public static final Companion f135468c = new Companion(null);

    /* renamed from: d */
    private int f135469d;

    /* renamed from: e */
    private Handler f135470e;

    /* renamed from: f */
    private boolean f135471f;

    /* renamed from: g */
    private View f135472g;

    /* renamed from: h */
    private View f135473h;

    /* renamed from: i */
    private Fragment f135474i;

    /* renamed from: j */
    private final Lazy f135475j = LazyKt.lazy(C54884d.INSTANCE);

    /* renamed from: k */
    private final Lazy f135476k = LazyKt.lazy(C54883c.INSTANCE);

    /* renamed from: e */
    private final String m212817e() {
        Lazy lazy = this.f135475j;
        KProperty kProperty = f135466a[0];
        return (String) lazy.getValue();
    }

    /* renamed from: f */
    private final SimpleModule.IBrowserDependency m212818f() {
        Lazy lazy = this.f135476k;
        KProperty kProperty = f135466a[1];
        return (SimpleModule.IBrowserDependency) lazy.getValue();
    }

    /* renamed from: a */
    public Context mo187143a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo187145a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m212813a(this, context);
    }

    /* renamed from: b */
    public Resources mo187146b() {
        return super.getResources();
    }

    /* renamed from: c */
    public void mo187147c() {
        super.onStop();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m212810a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo187149d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m212816c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m212811a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m212815b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/simple/ui/SimpleMainActivity$Companion;", "", "()V", "MESSAGE_SHOW_MAIN_PAGE", "", "SIMPLE_TAG", "", "core_simple_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.simple.ui.SimpleMainActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/simple/SimpleModule$IBrowserDependency;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.simple.ui.SimpleMainActivity$c */
    static final class C54883c extends Lambda implements Function0<SimpleModule.IBrowserDependency> {
        public static final C54883c INSTANCE = new C54883c();

        C54883c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SimpleModule.IBrowserDependency invoke() {
            SimpleModule.ISimpleModuleDependency a = SimpleModule.f135402b.mo187078a();
            if (a != null) {
                return a.mo187091b();
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.simple.ui.SimpleMainActivity$d */
    static final class C54884d extends Lambda implements Function0<String> {
        public static final C54884d INSTANCE = new C54884d();

        C54884d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            SimpleModule.ISimpleModuleDependency a = SimpleModule.f135402b.mo187078a();
            if (a != null) {
                return a.mo187098i();
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.simple.ui.SimpleMainActivity$e */
    static final class RunnableC54885e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SimpleMainActivity f135478a;

        RunnableC54885e(SimpleMainActivity simpleMainActivity) {
            this.f135478a = simpleMainActivity;
        }

        public final void run() {
            SimpleModeSwitcher.m212745a(this.f135478a, 1);
        }
    }

    /* renamed from: g */
    private final void m212819g() {
        this.f135470e = new HandlerC54882b(this, Looper.getMainLooper());
    }

    /* renamed from: h */
    private final void m212820h() {
        Fragment a;
        SimpleModule.IBrowserDependency b;
        if (this.f135474i == null) {
            SimpleModule.ISimpleModuleDependency a2 = SimpleModule.f135402b.mo187078a();
            if (!(a2 == null || (b = a2.mo187091b()) == null)) {
                b.mo187080a();
            }
            SimpleMainLauncher.Companion aVar = SimpleMainLauncher.f135499c;
            Intent intent = getIntent();
            Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
            SimpleModeUrlParam a3 = aVar.mo187171a(intent.getExtras(), false);
            SimpleModule.IBrowserDependency f = m212818f();
            Fragment fragment = null;
            if (!(f == null || (a = f.mo187079a(this, a3, m212817e())) == null)) {
                FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
                Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "supportFragmentManager.beginTransaction()");
                beginTransaction.add(16908290, a, (String) null);
                beginTransaction.commitNowAllowingStateLoss();
                fragment = a;
            }
            this.f135474i = fragment;
        }
    }

    /* renamed from: a */
    public final void mo187144a() {
        if (!this.f135471f) {
            this.f135471f = true;
            m212820h();
            getWindow().setBackgroundDrawable(getResources().getDrawable(R.color.lkui_N00));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/simple/ui/SimpleMainActivity$initMainHandler$1", "Landroid/os/Handler;", "handleMessage", "", "msg", "Landroid/os/Message;", "core_simple_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.simple.ui.SimpleMainActivity$b */
    public static final class HandlerC54882b extends Handler {

        /* renamed from: a */
        final /* synthetic */ SimpleMainActivity f135477a;

        public void handleMessage(Message message) {
            Intrinsics.checkParameterIsNotNull(message, "msg");
            if (message.what == SimpleMainActivity.f135467b) {
                this.f135477a.mo187144a();
            }
            super.handleMessage(message);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        HandlerC54882b(SimpleMainActivity simpleMainActivity, Looper looper) {
            super(looper);
            this.f135477a = simpleMainActivity;
        }
    }

    /* renamed from: a */
    public static Resources m212811a(SimpleMainActivity simpleMainActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(simpleMainActivity);
        }
        return simpleMainActivity.mo187146b();
    }

    /* renamed from: c */
    public static AssetManager m212816c(SimpleMainActivity simpleMainActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(simpleMainActivity);
        }
        return simpleMainActivity.mo187149d();
    }

    /* renamed from: b */
    private final int m212814b(Bundle bundle) {
        if (bundle == null) {
            if (getIntent() == null) {
                bundle = null;
            } else {
                Intent intent = getIntent();
                Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
                bundle = intent.getExtras();
            }
        }
        if (bundle != null) {
            return bundle.getInt("key_source_from", 0);
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        if (bundle != null) {
            bundle.remove("switch_fragment_with_anim");
            bundle.remove("android:support:fragments");
        }
        super.onCreate(bundle);
        View inflate = LayoutInflater.from(this).inflate(R.layout.activity_simple_layout, (ViewGroup) null);
        this.f135473h = inflate.findViewById(R.id.webview_container);
        this.f135472g = inflate;
        m212819g();
        m212812a(bundle);
        UICallbackExecutor.executeDelayed(new RunnableC54885e(this), 500);
    }

    /* renamed from: a */
    private final void m212812a(Bundle bundle) {
        SimpleModule.ILoginDependency a;
        SimpleModule.ISimpleModuleDependency a2 = SimpleModule.f135402b.mo187078a();
        if (a2 != null && (a = a2.mo187090a()) != null && a.mo187086a()) {
            int b = m212814b(this.mBundle);
            this.f135469d = b;
            if (b != 1) {
                Handler handler = this.f135470e;
                if (handler == null) {
                    Intrinsics.throwNpe();
                }
                handler.sendEmptyMessageDelayed(f135467b, 1000);
                return;
            }
            mo187144a();
        }
    }

    /* renamed from: b */
    public static void m212815b(SimpleMainActivity simpleMainActivity) {
        simpleMainActivity.mo187147c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            SimpleMainActivity simpleMainActivity2 = simpleMainActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    simpleMainActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m212813a(SimpleMainActivity simpleMainActivity, Context context) {
        simpleMainActivity.mo187145a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(simpleMainActivity);
        }
    }

    /* renamed from: a */
    public static Context m212810a(SimpleMainActivity simpleMainActivity, Configuration configuration) {
        Context a = simpleMainActivity.mo187143a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(keyEvent, "event");
        boolean z2 = false;
        if (keyEvent.getKeyCode() == 4) {
            z = true;
        } else {
            z = false;
        }
        Fragment fragment = this.f135474i;
        if (fragment == null || !z || !(fragment instanceof C19857c)) {
            return super.onKeyDown(i, keyEvent);
        }
        if (fragment != null) {
            C19857c cVar = (C19857c) fragment;
            if (keyEvent.getRepeatCount() != 0) {
                z2 = true;
            }
            if (cVar.mo67290c(z2)) {
                return true;
            }
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.setFlags(268435456);
            intent.addCategory("android.intent.category.HOME");
            startActivity(intent);
            return true;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.lark.webview.container.impl.WebContainerFragment");
    }
}
