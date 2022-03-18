package com.ss.android.lark.simple.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.lark.webview.container.impl.C19857c;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.simple.SimpleModule;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/simple/ui/SimpleWebActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "mBrowserDependency", "Lcom/ss/android/lark/simple/SimpleModule$IBrowserDependency;", "getMBrowserDependency", "()Lcom/ss/android/lark/simple/SimpleModule$IBrowserDependency;", "mBrowserDependency$delegate", "Lkotlin/Lazy;", "mContainer", "Landroid/view/View;", "mFragment", "Landroidx/fragment/app/Fragment;", "mRootView", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onKeyDown", "", "keyCode", "", "event", "Landroid/view/KeyEvent;", "showSimpleContent", "intent", "Landroid/content/Intent;", "Companion", "core_simple_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class SimpleWebActivity extends BaseFragmentActivity {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f135479a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SimpleWebActivity.class), "mBrowserDependency", "getMBrowserDependency()Lcom/ss/android/lark/simple/SimpleModule$IBrowserDependency;"))};

    /* renamed from: b */
    public static final Companion f135480b = new Companion(null);

    /* renamed from: c */
    private View f135481c;

    /* renamed from: d */
    private View f135482d;

    /* renamed from: e */
    private Fragment f135483e;

    /* renamed from: f */
    private final Lazy f135484f = LazyKt.lazy(C54886b.INSTANCE);

    /* renamed from: d */
    private final SimpleModule.IBrowserDependency m212833d() {
        Lazy lazy = this.f135484f;
        KProperty kProperty = f135479a[0];
        return (SimpleModule.IBrowserDependency) lazy.getValue();
    }

    /* renamed from: a */
    public Context mo187153a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo187154a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo187155a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m212830a(this, context);
    }

    /* renamed from: b */
    public void mo187156b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo187157c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m212827a(this, configuration);
    }

    public AssetManager getAssets() {
        return m212832c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m212828a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m212831b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/simple/ui/SimpleWebActivity$Companion;", "", "()V", "SIMPLE_TAG", "", "core_simple_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.simple.ui.SimpleWebActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/simple/SimpleModule$IBrowserDependency;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.simple.ui.SimpleWebActivity$b */
    static final class C54886b extends Lambda implements Function0<SimpleModule.IBrowserDependency> {
        public static final C54886b INSTANCE = new C54886b();

        C54886b() {
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

    /* renamed from: a */
    public static Resources m212828a(SimpleWebActivity simpleWebActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(simpleWebActivity);
        }
        return simpleWebActivity.mo187154a();
    }

    /* renamed from: c */
    public static AssetManager m212832c(SimpleWebActivity simpleWebActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(simpleWebActivity);
        }
        return simpleWebActivity.mo187157c();
    }

    /* renamed from: b */
    public static void m212831b(SimpleWebActivity simpleWebActivity) {
        simpleWebActivity.mo187156b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            SimpleWebActivity simpleWebActivity2 = simpleWebActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    simpleWebActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
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
        this.f135482d = inflate.findViewById(R.id.webview_container);
        this.f135481c = inflate;
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        m212829a(intent);
    }

    /* renamed from: a */
    private final void m212829a(Intent intent) {
        String str;
        Fragment a;
        SimpleModule.IBrowserDependency b;
        if (this.f135483e == null) {
            Bundle extras = intent.getExtras();
            Fragment fragment = null;
            if (extras != null) {
                str = extras.getString("key_load_url");
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                Log.m165383e("SimpleWebActivity", "url is empty finish");
                finish();
                return;
            }
            SimpleModule.ISimpleModuleDependency a2 = SimpleModule.f135402b.mo187078a();
            if (!(a2 == null || (b = a2.mo187091b()) == null)) {
                b.mo187080a();
            }
            SimpleModeUrlParam a3 = SimpleMainLauncher.f135499c.mo187171a(intent.getExtras(), true);
            SimpleModule.IBrowserDependency d = m212833d();
            if (!(d == null || (a = d.mo187079a(this, a3, str)) == null)) {
                FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
                Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "supportFragmentManager.beginTransaction()");
                beginTransaction.add(16908290, a, (String) null);
                beginTransaction.commitNowAllowingStateLoss();
                fragment = a;
            }
            this.f135483e = fragment;
        }
    }

    /* renamed from: a */
    public static void m212830a(SimpleWebActivity simpleWebActivity, Context context) {
        simpleWebActivity.mo187155a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(simpleWebActivity);
        }
    }

    /* renamed from: a */
    public static Context m212827a(SimpleWebActivity simpleWebActivity, Configuration configuration) {
        Context a = simpleWebActivity.mo187153a(configuration);
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
        Fragment fragment = this.f135483e;
        if (fragment == null || !z) {
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
            return super.onKeyDown(i, keyEvent);
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.lark.webview.container.impl.WebContainerFragment");
    }
}
