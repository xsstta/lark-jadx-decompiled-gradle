package com.ss.android.lark.invitation.v2.feat.external.main;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.inv.export.ui.InvBaseFragmentActivity;
import com.ss.android.lark.inv.export.util.C40108g;
import com.ss.android.lark.inv.export.util.C40118l;
import com.ss.android.lark.inv.export.util.C40124o;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.invitation.v2.feat.external.main.feishu.InviteExternalFeishuActivity;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/external/main/InviteExternalActivity;", "Lcom/ss/android/lark/inv/export/ui/InvBaseFragmentActivity;", "()V", "isSlideEnable", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class InviteExternalActivity extends InvBaseFragmentActivity {

    /* renamed from: a */
    public static final Companion f102305a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final void m159555a(Context context, String str, boolean z) {
        f102305a.mo146047a(context, str, z);
    }

    /* renamed from: a */
    public Context mo146040a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo146041a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo146042a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m159556a(this, context);
    }

    /* renamed from: b */
    public void mo146043b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo146044c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m159553a(this, configuration);
    }

    public AssetManager getAssets() {
        return m159558c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m159554a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public boolean isSlideEnable() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m159557b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007J4\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\"\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\rj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/external/main/InviteExternalActivity$Companion;", "", "()V", "MY_QRCODE", "", "start", "", "context", "Landroid/content/Context;", "from", "isMyQrcode", "", "params", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.external.main.InviteExternalActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo146048a(Context context, HashMap<String, String> hashMap) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(hashMap, "params");
            if (!hashMap.containsKey("IS_MY_QR")) {
                hashMap.put("IS_MY_QR", String.valueOf(Intrinsics.areEqual("my_qrcode", hashMap.get("scenes"))));
            }
            if (C40147z.m159165e()) {
                FloatWindowParams a = new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134945a("test").mo134930b();
                C36512a.m144041a().mo134762a(InviteExternalFragment.f102334b.mo146082a(C40108g.m159013a(hashMap)), a);
            } else if (Boolean.parseBoolean(hashMap.get("IS_MY_QR"))) {
                C40118l.m159074a(context, "//client/invite/external", hashMap);
            } else {
                InviteExternalFeishuActivity.f102366a.mo146103a(context, hashMap.get("from_scenes"));
            }
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo146047a(Context context, String str, boolean z) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            HashMap<String, String> a = C40108g.m159014a(Pair.create("from_scenes", str), Pair.create("IS_MY_QR", String.valueOf(z)));
            Intrinsics.checkExpressionValueIsNotNull(a, "params");
            mo146048a(context, a);
        }
    }

    /* renamed from: a */
    public static Resources m159554a(InviteExternalActivity inviteExternalActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteExternalActivity);
        }
        return inviteExternalActivity.mo146041a();
    }

    /* renamed from: c */
    public static AssetManager m159558c(InviteExternalActivity inviteExternalActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteExternalActivity);
        }
        return inviteExternalActivity.mo146044c();
    }

    /* renamed from: b */
    public static void m159557b(InviteExternalActivity inviteExternalActivity) {
        inviteExternalActivity.mo146043b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            InviteExternalActivity inviteExternalActivity2 = inviteExternalActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    inviteExternalActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
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
        boolean z = false;
        C40124o.m159088a((FragmentActivity) this, 16908290, (Fragment) InviteExternalFragment.f102334b.mo146082a(intent.getExtras()), false, false);
        String stringExtra = getIntent().getStringExtra("IS_MY_QR");
        if (stringExtra != null) {
            z = Boolean.parseBoolean(stringExtra);
        }
        if (z) {
            setStatusBarColorResource(R.color.bg_base);
        }
    }

    /* renamed from: a */
    public static void m159556a(InviteExternalActivity inviteExternalActivity, Context context) {
        inviteExternalActivity.mo146042a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteExternalActivity);
        }
    }

    /* renamed from: a */
    public static Context m159553a(InviteExternalActivity inviteExternalActivity, Configuration configuration) {
        Context a = inviteExternalActivity.mo146040a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
