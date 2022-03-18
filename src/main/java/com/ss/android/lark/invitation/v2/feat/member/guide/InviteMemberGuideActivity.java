package com.ss.android.lark.invitation.v2.feat.member.guide;

import android.app.Activity;
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
import com.larksuite.suite.R;
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
import com.ss.android.lark.utils.C57832h;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/member/guide/InviteMemberGuideActivity;", "Lcom/ss/android/lark/inv/export/ui/InvBaseFragmentActivity;", "()V", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class InviteMemberGuideActivity extends InvBaseFragmentActivity {

    /* renamed from: a */
    public static final Companion f102546a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final void m159968a(Context context, String str, Bundle bundle) {
        f102546a.mo146290a(context, str, bundle);
    }

    /* renamed from: a */
    public Context mo146283a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo146284a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo146285a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m159969a(this, context);
    }

    /* renamed from: b */
    public void mo146286b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo146287c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m159966a(this, configuration);
    }

    public AssetManager getAssets() {
        return m159971c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m159967a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m159970b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u0007¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/member/guide/InviteMemberGuideActivity$Companion;", "", "()V", "start", "", "context", "Landroid/content/Context;", "from", "", "bundle", "Landroid/os/Bundle;", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.guide.InviteMemberGuideActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo146290a(Context context, String str, Bundle bundle) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            if (C40147z.m159165e()) {
                FloatWindowParams a = new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134930b();
                Bundle bundle2 = new Bundle();
                bundle2.putString("from_scenes", str);
                C36512a.m144041a().mo134762a(InviteMemberGuideFragment.f102547c.mo146296a(bundle2), a);
                return;
            }
            Intent intent = new Intent(context, InviteMemberGuideActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.putExtra("from_scenes", str);
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            context.startActivity(intent);
        }
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        C57832h.m224485a();
    }

    /* renamed from: a */
    public static Resources m159967a(InviteMemberGuideActivity inviteMemberGuideActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteMemberGuideActivity);
        }
        return inviteMemberGuideActivity.mo146284a();
    }

    /* renamed from: c */
    public static AssetManager m159971c(InviteMemberGuideActivity inviteMemberGuideActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteMemberGuideActivity);
        }
        return inviteMemberGuideActivity.mo146287c();
    }

    /* renamed from: b */
    public static void m159970b(InviteMemberGuideActivity inviteMemberGuideActivity) {
        inviteMemberGuideActivity.mo146286b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            InviteMemberGuideActivity inviteMemberGuideActivity2 = inviteMemberGuideActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    inviteMemberGuideActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStatusBarColorResource(R.color.bg_base);
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        C40124o.m159088a((FragmentActivity) this, 16908290, (Fragment) InviteMemberGuideFragment.f102547c.mo146296a(intent.getExtras()), false, false);
    }

    /* renamed from: a */
    public static void m159969a(InviteMemberGuideActivity inviteMemberGuideActivity, Context context) {
        inviteMemberGuideActivity.mo146285a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteMemberGuideActivity);
        }
    }

    /* renamed from: a */
    public static Context m159966a(InviteMemberGuideActivity inviteMemberGuideActivity, Configuration configuration) {
        Context a = inviteMemberGuideActivity.mo146283a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
