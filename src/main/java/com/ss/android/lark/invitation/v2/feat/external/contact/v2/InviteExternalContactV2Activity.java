package com.ss.android.lark.invitation.v2.feat.external.contact.v2;

import android.app.Activity;
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
import com.google.firebase.messaging.Constants;
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
import com.ss.android.lark.invitation.v2.feat.external.contact.v2.InviteExternalContactV2Fragment;
import com.ss.android.lark.invitation.v2.feat.external.p2054a.C40205c;
import com.ss.android.lark.invitation.v2.statistic.InvHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.signinsdk_api.country.CountryBean;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57783ah;
import com.ss.android.lark.utils.C57805b;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.C57832h;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010\f\u001a\u00020\u0006H\u0016J\u0012\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/external/contact/v2/InviteExternalContactV2Activity;", "Lcom/ss/android/lark/inv/export/ui/InvBaseFragmentActivity;", "()V", "mFrom", "", "onActivityResult", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class InviteExternalContactV2Activity extends InvBaseFragmentActivity {

    /* renamed from: a */
    public static final Companion f102212a = new Companion(null);

    /* renamed from: b */
    private String f102213b;

    @JvmStatic
    /* renamed from: a */
    public static final void m159459a(Activity activity, String str) {
        f102212a.mo145950a(activity, str);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m159460a(Activity activity, String str, String str2, String str3) {
        f102212a.mo145951a(activity, str, str2, str3);
    }

    /* renamed from: a */
    public Context mo145943a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo145944a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo145945a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m159461a(this, context);
    }

    /* renamed from: b */
    public void mo145946b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo145947c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m159457a(this, configuration);
    }

    public AssetManager getAssets() {
        return m159463c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m159458a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m159462b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007J(\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/external/contact/v2/InviteExternalContactV2Activity$Companion;", "", "()V", "MTAG", "", "realStart", "", "activity", "Landroid/app/Activity;", "inviteMsg", "uniqueId", "from", "start", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.external.contact.v2.InviteExternalContactV2Activity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isGranted", "", "permissionGranted"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.invitation.v2.feat.external.contact.v2.InviteExternalContactV2Activity$a$a */
        public static final class C40232a implements C57805b.AbstractC57809a {

            /* renamed from: a */
            final /* synthetic */ Activity f102214a;

            /* renamed from: b */
            final /* synthetic */ String f102215b;

            /* renamed from: c */
            final /* synthetic */ String f102216c;

            /* renamed from: d */
            final /* synthetic */ String f102217d;

            C40232a(Activity activity, String str, String str2, String str3) {
                this.f102214a = activity;
                this.f102215b = str;
                this.f102216c = str2;
                this.f102217d = str3;
            }

            @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
            public final void permissionGranted(boolean z) {
                if (z) {
                    InviteExternalContactV2Activity.f102212a.mo145952b(this.f102214a, this.f102215b, this.f102216c, this.f102217d);
                }
                InvHitPoint.m160368b(z, this.f102217d);
            }
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo145950a(Activity activity, String str) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            Intrinsics.checkParameterIsNotNull(str, "from");
            mo145951a(activity, "", "", str);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo145951a(Activity activity, String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            Intrinsics.checkParameterIsNotNull(str, "inviteMsg");
            Intrinsics.checkParameterIsNotNull(str2, "uniqueId");
            Intrinsics.checkParameterIsNotNull(str3, "from");
            C57805b.m224332c(activity, new C40232a(activity, str, str2, str3));
        }

        /* renamed from: b */
        public final void mo145952b(Activity activity, String str, String str2, String str3) {
            HashMap a = C40108g.m159014a(Pair.create("invite_msg", str), Pair.create("unique_id", str2), Pair.create("from_scenes", str3));
            C53241h.m205898b("InvitationModule", "start InviteExternalContactV2Activity params: " + a);
            if (C40147z.m159165e()) {
                C36512a.m144041a().mo134762a(InviteExternalContactV2Fragment.f102218f.mo145958a(C40108g.m159013a(a)), new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134930b());
            } else if (Intrinsics.areEqual("onboarding", str3)) {
                C40118l.m159075a(activity, "//client/invite/external/contact", a, 255);
            } else {
                C40118l.m159074a(activity, "//client/invite/external/contact", a);
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        if (Intrinsics.areEqual("onboarding", this.f102213b)) {
            C57832h.m224485a();
        } else {
            super.onBackPressed();
        }
    }

    /* renamed from: a */
    public static Resources m159458a(InviteExternalContactV2Activity inviteExternalContactV2Activity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteExternalContactV2Activity);
        }
        return inviteExternalContactV2Activity.mo145944a();
    }

    /* renamed from: c */
    public static AssetManager m159463c(InviteExternalContactV2Activity inviteExternalContactV2Activity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteExternalContactV2Activity);
        }
        return inviteExternalContactV2Activity.mo145947c();
    }

    /* renamed from: b */
    public static void m159462b(InviteExternalContactV2Activity inviteExternalContactV2Activity) {
        inviteExternalContactV2Activity.mo145946b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            InviteExternalContactV2Activity inviteExternalContactV2Activity2 = inviteExternalContactV2Activity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    inviteExternalContactV2Activity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        InviteExternalContactV2Fragment.Companion aVar = InviteExternalContactV2Fragment.f102218f;
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        C40124o.m159088a((FragmentActivity) this, 16908290, (Fragment) aVar.mo145958a(intent.getExtras()), false, false);
        String stringExtra = getIntent().getStringExtra("from_scenes");
        if (stringExtra == null) {
            Intrinsics.throwNpe();
        }
        this.f102213b = stringExtra;
    }

    /* renamed from: a */
    public static Context m159457a(InviteExternalContactV2Activity inviteExternalContactV2Activity, Configuration configuration) {
        Context a = inviteExternalContactV2Activity.mo145943a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public static void m159461a(InviteExternalContactV2Activity inviteExternalContactV2Activity, Context context) {
        inviteExternalContactV2Activity.mo145945a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteExternalContactV2Activity);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        Serializable serializable;
        super.onActivityResult(i, i2, intent);
        if (i != 10086) {
            return;
        }
        if (i2 == -1) {
            if (intent != null) {
                serializable = intent.getSerializableExtra(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            } else {
                serializable = null;
            }
            if (serializable != null) {
                C57783ah.m224245a().mo196093a(C40205c.f102145a, ((CountryBean) serializable).getCode());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.passport.signinsdk_api.country.CountryBean");
        }
        C57783ah.m224245a().mo196091a(C40205c.f102145a);
    }
}
