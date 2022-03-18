package com.larksuite.component.ui.dialog;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\b\u0010\t\u001a\u00020\u0006H\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/larksuite/component/ui/dialog/LKUIGlobalDialogActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "mLKUIDialog", "Lcom/larksuite/component/ui/dialog/LKUIDialog;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "Companion", "suite-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class LKUIGlobalDialogActivity extends AppCompatActivity {

    /* renamed from: a */
    public static WeakReference<LKUIGlobalDialog> f62569a = new WeakReference<>(null);

    /* renamed from: b */
    public static final Companion f62570b = new Companion(null);

    /* renamed from: c */
    private DialogC25637f f62571c;

    /* renamed from: a */
    public Context mo89185a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo89186a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo89187a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m91723a(this, context);
    }

    /* renamed from: b */
    public void mo89188b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo89189c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m91721a(this, configuration);
    }

    public AssetManager getAssets() {
        return m91725c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public Resources getResources() {
        return m91722a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m91724b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0002\b\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005R\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/larksuite/component/ui/dialog/LKUIGlobalDialogActivity$Companion;", "", "()V", "lkuiDialogRef", "Ljava/lang/ref/WeakReference;", "Lcom/larksuite/component/ui/dialog/LKUIGlobalDialog;", "getDialog", "getDialog$suite_ui_release", "setDialog", "", "lkuiDialog", "suite-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.dialog.LKUIGlobalDialogActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo89192a(LKUIGlobalDialog iVar) {
            Intrinsics.checkParameterIsNotNull(iVar, "lkuiDialog");
            LKUIGlobalDialogActivity.f62569a = new WeakReference<>(iVar);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onDestroy() {
        super.onDestroy();
        DialogC25637f fVar = null;
        this.f62571c = fVar;
        LKUIGlobalDialog iVar = f62569a.get();
        if (iVar != null) {
            iVar.mo89278b(null);
            iVar.mo89276a(fVar);
            iVar.mo89277a(false);
        }
    }

    /* renamed from: a */
    public static Resources m91722a(LKUIGlobalDialogActivity lKUIGlobalDialogActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(lKUIGlobalDialogActivity);
        }
        return lKUIGlobalDialogActivity.mo89186a();
    }

    /* renamed from: c */
    public static AssetManager m91725c(LKUIGlobalDialogActivity lKUIGlobalDialogActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(lKUIGlobalDialogActivity);
        }
        return lKUIGlobalDialogActivity.mo89189c();
    }

    /* renamed from: b */
    public static void m91724b(LKUIGlobalDialogActivity lKUIGlobalDialogActivity) {
        lKUIGlobalDialogActivity.mo89188b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            LKUIGlobalDialogActivity lKUIGlobalDialogActivity2 = lKUIGlobalDialogActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    lKUIGlobalDialogActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        C25639g<?> gVar;
        super.onCreate(bundle);
        supportRequestWindowFeature(1);
        getWindow().addFlags(67108864);
        LKUIGlobalDialogActivity lKUIGlobalDialogActivity = this;
        setContentView(new View(lKUIGlobalDialogActivity));
        LKUIGlobalDialog iVar = f62569a.get();
        if (iVar != null) {
            gVar = iVar.mo89279c();
        } else {
            gVar = null;
        }
        if (gVar == null) {
            finish();
            return;
        }
        gVar.f62583b = lKUIGlobalDialogActivity;
        DialogC25637f c = gVar.mo89239c();
        LKUIGlobalDialog iVar2 = f62569a.get();
        if (iVar2 != null) {
            iVar2.mo89278b(lKUIGlobalDialogActivity);
            iVar2.mo89276a(c);
            iVar2.mo89277a(true);
        }
        c.mo89218a(this);
        this.f62571c = c;
    }

    /* renamed from: a */
    public static void m91723a(LKUIGlobalDialogActivity lKUIGlobalDialogActivity, Context context) {
        lKUIGlobalDialogActivity.mo89187a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(lKUIGlobalDialogActivity);
        }
    }

    /* renamed from: a */
    public static Context m91721a(LKUIGlobalDialogActivity lKUIGlobalDialogActivity, Configuration configuration) {
        Context a = lKUIGlobalDialogActivity.mo89185a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
