package com.ss.android.lark.invitation.v2.feat.edu.nonDirectional;

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
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.inv.export.ui.InvBaseFragmentActivity;
import com.ss.android.lark.inv.export.util.C40108g;
import com.ss.android.lark.inv.export.util.C40118l;
import com.ss.android.lark.inv.export.util.C40124o;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.invitation.v2.feat.external.main1.InviteParentNonDirectionFragment;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/edu/nonDirectional/InviteParentNonDirectionActivity;", "Lcom/ss/android/lark/inv/export/ui/InvBaseFragmentActivity;", "()V", "isSlideEnable", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class InviteParentNonDirectionActivity extends InvBaseFragmentActivity {

    /* renamed from: a */
    public static final Companion f102093a = new Companion(null);

    /* renamed from: a */
    public Context mo145822a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo145823a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo145824a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m159284a(this, context);
    }

    /* renamed from: b */
    public void mo145825b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo145826c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m159282a(this, configuration);
    }

    public AssetManager getAssets() {
        return m159286c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m159283a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public boolean isSlideEnable() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m159285b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/edu/nonDirectional/InviteParentNonDirectionActivity$Companion;", "", "()V", "TAG", "", "start", "", "context", "Landroid/content/Context;", "from", ShareHitPoint.f121869d, "departments", "chatId", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.edu.nonDirectional.InviteParentNonDirectionActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo145829a(Context context, String str, String str2, String str3, String str4) {
            Intrinsics.checkParameterIsNotNull(str, "from");
            Intrinsics.checkParameterIsNotNull(str2, ShareHitPoint.f121869d);
            Intrinsics.checkParameterIsNotNull(str3, "departments");
            Intrinsics.checkParameterIsNotNull(str4, "chatId");
            HashMap a = C40108g.m159014a(Pair.create("from_scenes", str), Pair.create(ShareHitPoint.f121869d, str2), Pair.create("departments", str3), Pair.create("chat_id", str4));
            if (C40147z.m159165e()) {
                FloatWindowParams a2 = new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134945a("test").mo134930b();
                C36512a.m144041a().mo134762a(InviteParentNonDirectionFragment.f102186a.mo145905a(C40108g.m159013a(a)), a2);
                return;
            }
            C40118l.m159074a(context, "//client/invite/parent/nondirection", a);
        }
    }

    /* renamed from: a */
    public static Resources m159283a(InviteParentNonDirectionActivity inviteParentNonDirectionActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteParentNonDirectionActivity);
        }
        return inviteParentNonDirectionActivity.mo145823a();
    }

    /* renamed from: c */
    public static AssetManager m159286c(InviteParentNonDirectionActivity inviteParentNonDirectionActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteParentNonDirectionActivity);
        }
        return inviteParentNonDirectionActivity.mo145826c();
    }

    /* renamed from: b */
    public static void m159285b(InviteParentNonDirectionActivity inviteParentNonDirectionActivity) {
        inviteParentNonDirectionActivity.mo145825b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            InviteParentNonDirectionActivity inviteParentNonDirectionActivity2 = inviteParentNonDirectionActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    inviteParentNonDirectionActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
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
        C40124o.m159088a((FragmentActivity) this, 16908290, (Fragment) InviteParentNonDirectionFragment.f102186a.mo145905a(intent.getExtras()), false, false);
    }

    /* renamed from: a */
    public static void m159284a(InviteParentNonDirectionActivity inviteParentNonDirectionActivity, Context context) {
        inviteParentNonDirectionActivity.mo145824a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteParentNonDirectionActivity);
        }
    }

    /* renamed from: a */
    public static Context m159282a(InviteParentNonDirectionActivity inviteParentNonDirectionActivity, Configuration configuration) {
        Context a = inviteParentNonDirectionActivity.mo145822a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
