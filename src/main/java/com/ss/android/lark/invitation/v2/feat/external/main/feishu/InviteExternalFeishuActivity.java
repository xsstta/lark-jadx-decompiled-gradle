package com.ss.android.lark.invitation.v2.feat.external.main.feishu;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.inv.export.ui.InvBaseFragmentActivity;
import com.ss.android.lark.inv.export.util.C40124o;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/external/main/feishu/InviteExternalFeishuActivity;", "Lcom/ss/android/lark/inv/export/ui/InvBaseFragmentActivity;", "()V", "isSlideEnable", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class InviteExternalFeishuActivity extends InvBaseFragmentActivity {

    /* renamed from: a */
    public static final Companion f102366a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final void m159664a(Context context, String str) {
        f102366a.mo146103a(context, str);
    }

    /* renamed from: a */
    public Context mo146096a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo146097a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo146098a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m159665a(this, context);
    }

    /* renamed from: b */
    public void mo146099b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo146100c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m159662a(this, configuration);
    }

    public AssetManager getAssets() {
        return m159667c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m159663a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public boolean isSlideEnable() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m159666b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/external/main/feishu/InviteExternalFeishuActivity$Companion;", "", "()V", "start", "", "context", "Landroid/content/Context;", "from", "", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.external.main.feishu.InviteExternalFeishuActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo146103a(Context context, String str) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            if (C40147z.m159165e()) {
                FloatWindowParams a = new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134945a("test").mo134930b();
                Bundle bundle = new Bundle();
                bundle.putString("from_scenes", str);
                C36512a.m144041a().mo134762a(InviteExternalFeishuFragment.f102367a.mo146112a(bundle), a);
                return;
            }
            Intent intent = new Intent(context, InviteExternalFeishuActivity.class);
            intent.putExtra("from_scenes", str);
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    public static Resources m159663a(InviteExternalFeishuActivity inviteExternalFeishuActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteExternalFeishuActivity);
        }
        return inviteExternalFeishuActivity.mo146097a();
    }

    /* renamed from: c */
    public static AssetManager m159667c(InviteExternalFeishuActivity inviteExternalFeishuActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteExternalFeishuActivity);
        }
        return inviteExternalFeishuActivity.mo146100c();
    }

    /* renamed from: b */
    public static void m159666b(InviteExternalFeishuActivity inviteExternalFeishuActivity) {
        inviteExternalFeishuActivity.mo146099b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            InviteExternalFeishuActivity inviteExternalFeishuActivity2 = inviteExternalFeishuActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    inviteExternalFeishuActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        C40124o.m159088a((FragmentActivity) this, 16908290, (Fragment) InviteExternalFeishuFragment.f102367a.mo146112a(intent.getExtras()), false, false);
    }

    /* renamed from: a */
    public static void m159665a(InviteExternalFeishuActivity inviteExternalFeishuActivity, Context context) {
        inviteExternalFeishuActivity.mo146098a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteExternalFeishuActivity);
        }
    }

    /* renamed from: a */
    public static Context m159662a(InviteExternalFeishuActivity inviteExternalFeishuActivity, Configuration configuration) {
        Context a = inviteExternalFeishuActivity.mo146096a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
