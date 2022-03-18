package com.ss.android.lark.multitask.floating;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.floating.PermissionUtils;
import com.ss.android.lark.floating.interfaces.OnPermissionResult;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.C57865c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\n\u001a\u00020\u0006H\u0002¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/multitask/floating/MultiTaskCheckPermissionActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "enableGlobalWatermark", "", "finish", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showPermissionCheckDialog", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MultiTaskCheckPermissionActivity extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo168913a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo168914a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo168915a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m190507a(this, context);
    }

    /* renamed from: b */
    public void mo168916b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo168917c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m190505a(this, configuration);
    }

    @Override // com.ss.android.lark.base.watermark.IWatermarkable, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public boolean enableGlobalWatermark() {
        return false;
    }

    public AssetManager getAssets() {
        return m190509c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m190506a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m190508b(this);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "produce"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.floating.MultiTaskCheckPermissionActivity$a */
    public static final class C48288a<T> implements C57865c.AbstractC57873d<T> {

        /* renamed from: a */
        final /* synthetic */ MultiTaskCheckPermissionActivity f121603a;

        C48288a(MultiTaskCheckPermissionActivity multiTaskCheckPermissionActivity) {
            this.f121603a = multiTaskCheckPermissionActivity;
        }

        /* renamed from: a */
        public final boolean mo168920a() {
            return PermissionUtils.m150948a(this.f121603a);
        }

        @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
        public /* synthetic */ Object produce() {
            return Boolean.valueOf(mo168920a());
        }
    }

    /* renamed from: d */
    private final void m190510d() {
        C57865c.m224574a(new C48288a(this), new C48289b(this));
    }

    /* renamed from: a */
    public static Resources m190506a(MultiTaskCheckPermissionActivity multiTaskCheckPermissionActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(multiTaskCheckPermissionActivity);
        }
        return multiTaskCheckPermissionActivity.mo168914a();
    }

    /* renamed from: c */
    public static AssetManager m190509c(MultiTaskCheckPermissionActivity multiTaskCheckPermissionActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(multiTaskCheckPermissionActivity);
        }
        return multiTaskCheckPermissionActivity.mo168917c();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "result", "", "kotlin.jvm.PlatformType", "consume", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.floating.MultiTaskCheckPermissionActivity$b */
    public static final class C48289b<T> implements C57865c.AbstractC57871b<T> {

        /* renamed from: a */
        final /* synthetic */ MultiTaskCheckPermissionActivity f121604a;

        C48289b(MultiTaskCheckPermissionActivity multiTaskCheckPermissionActivity) {
            this.f121604a = multiTaskCheckPermissionActivity;
        }

        /* renamed from: a */
        public final void consume(Boolean bool) {
            Intrinsics.checkExpressionValueIsNotNull(bool, "result");
            if (bool.booleanValue()) {
                FloatingManager.f121676a.mo169019c();
                this.f121604a.finish();
                return;
            }
            UICallbackExecutor.execute(new Runnable(this) {
                /* class com.ss.android.lark.multitask.floating.MultiTaskCheckPermissionActivity.C48289b.RunnableC482901 */

                /* renamed from: a */
                final /* synthetic */ C48289b f121605a;

                {
                    this.f121605a = r1;
                }

                public final void run() {
                    DialogC25637f b = new C25639g(this.f121605a.f121604a).mo89248g(R.string.View_N_FloatingWindowPermission).mo89238b(true).mo89242c(UIHelper.mustacheFormat((int) R.string.View_G_PopupPermission, "appName", UIHelper.getAppName())).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_Confirm, new DialogInterface$OnClickListenerC48291a(this)).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_Cancel, new DialogInterface$OnClickListenerC48293b(this)).mo89233b();
                    Intrinsics.checkExpressionValueIsNotNull(b, "LKUIDialogBuilder<LKUIDi…                 .build()");
                    b.show();
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
                /* renamed from: com.ss.android.lark.multitask.floating.MultiTaskCheckPermissionActivity$b$1$b */
                static final class DialogInterface$OnClickListenerC48293b implements DialogInterface.OnClickListener {

                    /* renamed from: a */
                    final /* synthetic */ RunnableC482901 f121608a;

                    DialogInterface$OnClickListenerC48293b(RunnableC482901 r1) {
                        this.f121608a = r1;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        FloatingManager.f121676a.mo169020d();
                        this.f121608a.f121605a.f121604a.finish();
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
                /* renamed from: com.ss.android.lark.multitask.floating.MultiTaskCheckPermissionActivity$b$1$a */
                static final class DialogInterface$OnClickListenerC48291a implements DialogInterface.OnClickListener {

                    /* renamed from: a */
                    final /* synthetic */ RunnableC482901 f121606a;

                    DialogInterface$OnClickListenerC48291a(RunnableC482901 r1) {
                        this.f121606a = r1;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        PermissionUtils.m150947a(this.f121606a.f121605a.f121604a, new OnPermissionResult(this) {
                            /* class com.ss.android.lark.multitask.floating.MultiTaskCheckPermissionActivity.C48289b.RunnableC482901.DialogInterface$OnClickListenerC48291a.C482921 */

                            /* renamed from: a */
                            final /* synthetic */ DialogInterface$OnClickListenerC48291a f121607a;

                            /* JADX WARN: Incorrect args count in method signature: ()V */
                            {
                                this.f121607a = r1;
                            }

                            @Override // com.ss.android.lark.floating.interfaces.OnPermissionResult
                            /* renamed from: d */
                            public void mo140140d(boolean z) {
                                if (z) {
                                    FloatingManager.f121676a.mo169019c();
                                } else {
                                    FloatingManager.f121676a.mo169020d();
                                }
                                this.f121607a.f121606a.f121605a.f121604a.finish();
                            }
                        });
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public static void m190508b(MultiTaskCheckPermissionActivity multiTaskCheckPermissionActivity) {
        multiTaskCheckPermissionActivity.mo168916b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MultiTaskCheckPermissionActivity multiTaskCheckPermissionActivity2 = multiTaskCheckPermissionActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    multiTaskCheckPermissionActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setBackgroundColor(UIHelper.getColor(R.color.lkui_transparent));
        setContentView(frameLayout);
        overridePendingTransition(0, 0);
        m190510d();
    }

    /* renamed from: a */
    public static void m190507a(MultiTaskCheckPermissionActivity multiTaskCheckPermissionActivity, Context context) {
        multiTaskCheckPermissionActivity.mo168915a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(multiTaskCheckPermissionActivity);
        }
    }

    /* renamed from: a */
    public static Context m190505a(MultiTaskCheckPermissionActivity multiTaskCheckPermissionActivity, Configuration configuration) {
        Context a = multiTaskCheckPermissionActivity.mo168913a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
