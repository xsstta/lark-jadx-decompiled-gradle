package com.ss.android.lark.qrcode.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.monitor.p2372a.C48211b;
import com.ss.android.lark.permission.C51326e;
import com.ss.android.lark.permission.rxPermission.C51331a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.widget.photo_picker.C58557a;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.Map;

public class QRCodeScanActivity extends BaseFragmentActivity {

    /* renamed from: a */
    static String f130794a;

    /* renamed from: a */
    public Context mo180863a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m204985a(this, context);
    }

    /* renamed from: b */
    public Resources mo180864b() {
        return super.getResources();
    }

    /* renamed from: c */
    public void mo180865c() {
        super.onStop();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m204979a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo180867d() {
        return super.getAssets();
    }

    /* renamed from: d */
    public void mo180868d(Context context) {
        super.attachBaseContext(context);
    }

    public AssetManager getAssets() {
        return m204988c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m204980a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public boolean isNeedLoginStatus() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m204987b(this);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void finish() {
        super.finish();
    }

    /* renamed from: a */
    public static void m204981a() {
        HashMap hashMap = new HashMap();
        hashMap.put("latency", "timeStart");
        f130794a = AppreciableKit.m107394b().mo103510a(Biz.Messenger, Scene.Scanner, Event.scaner_ready, "QRCodeScanActivity", false, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) hashMap, (Map<String, ? extends Object>) null);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C48211b.m190251a().mo168690c();
    }

    /* renamed from: a */
    public static Resources m204980a(QRCodeScanActivity qRCodeScanActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(qRCodeScanActivity);
        }
        return qRCodeScanActivity.mo180864b();
    }

    /* renamed from: c */
    public static AssetManager m204988c(QRCodeScanActivity qRCodeScanActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(qRCodeScanActivity);
        }
        return qRCodeScanActivity.mo180867d();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        C48211b.m190252a("QRCodeScanActivity").mo168688b();
        disableBlackStatusBarBeforeOnCreate();
        super.onCreate(bundle);
        QRCodeScanFragment.m205050a(this);
    }

    /* renamed from: b */
    public static void m204986b(Context context) {
        C58557a.m227127a().mo198506a(1).mo198526i(false).mo198524g(false).mo198525h(false).mo198529l(false).mo198528k(false).mo198517c(false).mo198522f(3).mo198510a((Activity) context, 233);
    }

    /* renamed from: c */
    public static void m204989c(Context context) {
        Intent intent = new Intent(context, QRCodeScanActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
        m204981a();
    }

    /* renamed from: b */
    public static void m204987b(QRCodeScanActivity qRCodeScanActivity) {
        qRCodeScanActivity.mo180865c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            QRCodeScanActivity qRCodeScanActivity2 = qRCodeScanActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    qRCodeScanActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m204982a(long j) {
        if (!TextUtils.isEmpty(f130794a)) {
            HashMap hashMap = new HashMap();
            hashMap.put("latency", "timeEnd");
            HashMap hashMap2 = new HashMap();
            hashMap2.put("camera_ready_cost", Long.valueOf(j));
            AppreciableKit.m107394b().mo103523c(f130794a, hashMap2, null, hashMap, null);
            f130794a = null;
        }
    }

    /* renamed from: a */
    public static void m204983a(final Context context) {
        C51331a aVar = new C51331a((Activity) context);
        boolean z = false;
        if (aVar.mo176921a(C51326e.f127824e[0]) && aVar.mo176921a(C51326e.f127824e[1])) {
            z = true;
        }
        if (!z) {
            aVar.mo176924c(C51326e.f127824e).subscribe(new Consumer<Boolean>() {
                /* class com.ss.android.lark.qrcode.ui.QRCodeScanActivity.C529401 */

                /* renamed from: a */
                public void accept(Boolean bool) throws Exception {
                    if (bool.booleanValue()) {
                        QRCodeScanActivity.m204986b(context);
                    }
                }
            });
        } else {
            m204986b(context);
        }
    }

    /* renamed from: a */
    public static void m204985a(QRCodeScanActivity qRCodeScanActivity, Context context) {
        qRCodeScanActivity.mo180868d(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(qRCodeScanActivity);
        }
    }

    /* renamed from: a */
    public static Context m204979a(QRCodeScanActivity qRCodeScanActivity, Configuration configuration) {
        Context a = qRCodeScanActivity.mo180863a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public static void m204984a(Context context, int[] iArr) {
        Intent intent = new Intent(context, QRCodeScanActivity.class);
        intent.putExtra("key_code_format", iArr);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
        m204981a();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        Fragment findFragmentById;
        super.onActivityResult(i, i2, intent);
        if (intent != null && i2 == -1 && i == 233 && (findFragmentById = getSupportFragmentManager().findFragmentById(16908290)) != null) {
            findFragmentById.onActivityResult(i, i2, intent);
        }
    }
}
