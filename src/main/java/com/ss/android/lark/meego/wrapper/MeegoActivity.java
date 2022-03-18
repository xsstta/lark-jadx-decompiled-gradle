package com.ss.android.lark.meego.wrapper;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.larksuite.component.ui.loading.LKUIStatus;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.flutter.container.api.ILKFlutter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.meego.wrapper.common.MeegoApm;
import com.ss.android.lark.meego.wrapper.p2248c.C44860a;
import com.ss.android.lark.meego.wrapper.p2250e.C44866a;
import com.ss.android.lark.mira.UIGetPluginCallback;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\rH\u0002J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0005H\u0002J\"\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\u0012\u0010\u001a\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J-\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u000e\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u001f2\u0006\u0010 \u001a\u00020!H\u0016¢\u0006\u0002\u0010\"J\b\u0010#\u001a\u00020\rH\u0002J\b\u0010$\u001a\u00020\rH\u0002J\u0010\u0010%\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010&\u001a\u00020\rH\u0002R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/ss/android/lark/meego/wrapper/MeegoActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "hasReportStages", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "lkuiStatus", "Lcom/larksuite/component/ui/loading/LKUIStatus;", "params", "Ljava/io/Serializable;", "route", "configureStatusBarForFullscreenFlutterExperience", "", "handleLoadSuccess", "lkFlutter", "Lcom/ss/android/lark/flutter/container/api/ILKFlutter;", "loadPlugin", "monitor", "stage", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "parseParams", "removeLoading", "showFlutterFragment", "showLoading", "Companion", "meego_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MeegoActivity extends BaseFragmentActivity {

    /* renamed from: a */
    public static final Companion f113621a = new Companion(null);

    /* renamed from: b */
    private LKUIStatus f113622b;

    /* renamed from: c */
    private String f113623c = "/";

    /* renamed from: d */
    private Serializable f113624d;

    /* renamed from: e */
    private final ArrayList<String> f113625e = new ArrayList<>();

    /* renamed from: a */
    public Context mo158717a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo158718a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo158719a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m177805a(this, context);
    }

    /* renamed from: b */
    public void mo158721b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo158722c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m177803a(this, configuration);
    }

    public AssetManager getAssets() {
        return m177809c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m177804a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m177808b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/meego/wrapper/MeegoActivity$Companion;", "", "()V", "DEFAULT_ROUTE", "", "ENTRY_POINT", "FLUTTER_FRAGMENT_TAG", "KEY_PARAMS", "KEY_ROUTE", "KEY_TRIGGER_TIME", "start", "", "context", "Landroid/content/Context;", "route", "params", "Ljava/io/Serializable;", "meego_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.meego.wrapper.MeegoActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo158725a(Context context, String str, Serializable serializable) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intent intent = new Intent(context, MeegoActivity.class);
            intent.addFlags(268435456);
            intent.putExtra("trigger_time", SystemClock.uptimeMillis());
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                intent.putExtra("route", str);
            }
            if (serializable != null) {
                intent.putExtra("params", serializable);
            }
            context.startActivity(intent);
        }
    }

    /* renamed from: h */
    private final void m177814h() {
        LKUIStatus lKUIStatus = this.f113622b;
        if (lKUIStatus != null) {
            lKUIStatus.mo89849f();
        }
    }

    public MeegoActivity() {
        this.TAG = "MeegoActivity";
    }

    /* renamed from: d */
    private final void m177810d() {
        Window window = getWindow();
        Intrinsics.checkExpressionValueIsNotNull(window, "window");
        View decorView = window.getDecorView();
        Intrinsics.checkExpressionValueIsNotNull(decorView, "window.decorView");
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1024 | DynamicModule.f58006b);
    }

    /* renamed from: f */
    private final void m177812f() {
        MeegoApm.f113631a.mo158740b();
        C44866a.m177884a(new C44858b(this, SystemClock.uptimeMillis()));
    }

    /* renamed from: g */
    private final void m177813g() {
        LKUIStatus a = new LKUIStatus.C25680a((ViewGroup) findViewById(16908290)).mo89859a();
        this.f113622b = a;
        if (a != null) {
            a.mo89837a();
        }
    }

    /* renamed from: e */
    private final void m177811e() {
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("route");
            if (stringExtra == null) {
                stringExtra = "/";
            }
            this.f113623c = stringExtra;
            this.f113624d = intent.getSerializableExtra("params");
            return;
        }
        Log.m165383e(this.TAG, "intent is null");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/meego/wrapper/MeegoActivity$loadPlugin$1", "Lcom/ss/android/lark/mira/UIGetPluginCallback;", "Lcom/ss/android/lark/flutter/container/api/ILKFlutter;", "onErrored", "", "error", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onPluginLoading", "onSuccessed", "mgFlutter", "meego_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.meego.wrapper.MeegoActivity$b */
    public static final class C44858b extends UIGetPluginCallback<ILKFlutter> {

        /* renamed from: a */
        final /* synthetic */ MeegoActivity f113626a;

        /* renamed from: b */
        final /* synthetic */ long f113627b;

        @Override // com.ss.android.lark.mira.UIGetPluginCallback
        /* renamed from: a */
        public void mo143154a() {
        }

        /* renamed from: a */
        public void onSuccessed(ILKFlutter iLKFlutter) {
            if (iLKFlutter == null) {
                this.f113626a.finish();
                return;
            }
            MeegoApm.m177837a(MeegoApm.f113631a, true, SystemClock.uptimeMillis() - this.f113627b, null, 4, null);
            this.f113626a.mo158720a(iLKFlutter);
        }

        @Override // com.larksuite.framework.callback.UIGetDataCallback
        public void onErrored(ErrorResult errorResult) {
            String str;
            Log.m165384e(this.f113626a.TAG, "loadPlugin error", errorResult);
            long uptimeMillis = SystemClock.uptimeMillis() - this.f113627b;
            MeegoApm cVar = MeegoApm.f113631a;
            if (errorResult != null) {
                str = errorResult.getDebugMsg();
            } else {
                str = null;
            }
            cVar.mo158741b(false, uptimeMillis, str);
            this.f113626a.finish();
        }

        C44858b(MeegoActivity meegoActivity, long j) {
            this.f113626a = meegoActivity;
            this.f113627b = j;
        }
    }

    /* renamed from: a */
    public static Resources m177804a(MeegoActivity meegoActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(meegoActivity);
        }
        return meegoActivity.mo158718a();
    }

    /* renamed from: c */
    public static AssetManager m177809c(MeegoActivity meegoActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(meegoActivity);
        }
        return meegoActivity.mo158722c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        m177806a("start");
        super.onCreate(bundle);
        m177813g();
        m177811e();
        m177812f();
        m177810d();
    }

    /* renamed from: b */
    private final void m177807b(ILKFlutter iLKFlutter) {
        m177814h();
        getSupportFragmentManager().beginTransaction().replace(16908290, iLKFlutter.newFragment(this.f113623c, this.f113624d, "meego"), "flutter_fragment").commit();
        m177806a("show");
    }

    /* renamed from: a */
    private final void m177806a(String str) {
        long j;
        if (!this.f113625e.contains(str)) {
            Intent intent = getIntent();
            if (intent != null) {
                j = intent.getLongExtra("trigger_time", 0);
            } else {
                j = 0;
            }
            if (j > 0) {
                this.f113625e.add(str);
                long uptimeMillis = SystemClock.uptimeMillis() - j;
                MeegoApm.f113631a.mo158738a(str, uptimeMillis);
                Log.m165389i(this.TAG, "stage:" + str + ", cost:" + uptimeMillis);
            }
        }
    }

    /* renamed from: b */
    public static void m177808b(MeegoActivity meegoActivity) {
        meegoActivity.mo158721b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MeegoActivity meegoActivity2 = meegoActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    meegoActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo158720a(ILKFlutter iLKFlutter) {
        Log.m165389i(this.TAG, "handlePluginSuccess");
        Context context = MeegoModule.f113628a.mo158735a().getContext();
        if (context != null) {
            C44860a.m177849a((Application) context, iLKFlutter);
            m177807b(iLKFlutter);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Application");
    }

    /* renamed from: a */
    public static void m177805a(MeegoActivity meegoActivity, Context context) {
        meegoActivity.mo158719a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(meegoActivity);
        }
    }

    /* renamed from: a */
    public static Context m177803a(MeegoActivity meegoActivity, Configuration configuration) {
        Context a = meegoActivity.mo158717a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag("flutter_fragment");
        if (findFragmentByTag != null) {
            findFragmentByTag.onActivityResult(i, i2, intent);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback, androidx.fragment.app.FragmentActivity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Intrinsics.checkParameterIsNotNull(strArr, "permissions");
        Intrinsics.checkParameterIsNotNull(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag("flutter_fragment");
        if (findFragmentByTag != null) {
            findFragmentByTag.onRequestPermissionsResult(i, strArr, iArr);
        }
    }
}
