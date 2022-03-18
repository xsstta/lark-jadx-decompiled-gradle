package com.ss.android.lark.invitation.v2.feat.external.contact.v1;

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
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.contact.entity.api.ContactMobileApi;
import com.ss.android.lark.contact.entity.mobile.ContactMobileBean;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency;
import com.ss.android.lark.inv.export.ui.InvBaseFragmentActivity;
import com.ss.android.lark.inv.export.util.C40108g;
import com.ss.android.lark.inv.export.util.C40124o;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.invitation.v2.feat.external.common.InviteExternalViewDependency;
import com.ss.android.lark.invitation.v2.feat.external.contact.v1.AbstractC40220a;
import com.ss.android.lark.invitation.v2.feat.external.p2054a.C40205c;
import com.ss.android.lark.invitation.v2.statistic.InvHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.signinsdk_api.country.CountryBean;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57783ah;
import com.ss.android.lark.utils.C57805b;
import com.ss.android.lark.utils.C57824f;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InviteExternalContactActivity extends InvBaseFragmentActivity implements ContactMobileApi.AbstractC35403b {

    /* renamed from: a */
    protected C40225c f102191a;

    /* renamed from: b */
    protected AbstractC40220a.AbstractC40222b f102192b;

    /* renamed from: c */
    private String f102193c;

    /* renamed from: d */
    private String f102194d;

    /* renamed from: e */
    private boolean f102195e;

    /* renamed from: a */
    public Context mo145915a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo145916a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo145917a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m159407a(this, context);
    }

    /* renamed from: b */
    public void mo145918b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo145919c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m159401a(this, configuration);
    }

    public AssetManager getAssets() {
        return m159410c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m159402a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m159409b(this);
    }

    @Override // com.ss.android.lark.contact.entity.api.ContactMobileApi.AbstractC35403b
    /* renamed from: a */
    public void mo130580a(long j) {
        C53241h.m205898b("InvitationModule", j + "");
    }

    @Override // com.ss.android.lark.contact.entity.api.ContactMobileApi.AbstractC35403b
    /* renamed from: a */
    public void mo130581a(List<ContactMobileBean> list) {
        finish();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.inv.export.ui.InvBaseFragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        this.f102191a.destroy();
    }

    /* renamed from: d */
    private void m159411d() {
        C40224b bVar = new C40224b();
        C40230d dVar = new C40230d(new InviteExternalViewDependency(getWindow().getDecorView(), this));
        this.f102192b = dVar;
        C40225c cVar = new C40225c(bVar, dVar);
        this.f102191a = cVar;
        cVar.mo145935b(this.f102193c);
        this.f102191a.mo145936c(this.f102194d);
        this.f102191a.create();
    }

    @Override // com.ss.android.lark.contact.entity.api.ContactMobileApi.AbstractC35403b
    /* renamed from: b */
    public void mo130582b(List<ContactMobileBean> list) {
        this.f102191a.mo145932a(list.get(0));
    }

    /* renamed from: a */
    public static Resources m159402a(InviteExternalContactActivity inviteExternalContactActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteExternalContactActivity);
        }
        return inviteExternalContactActivity.mo145916a();
    }

    /* renamed from: c */
    public static AssetManager m159410c(InviteExternalContactActivity inviteExternalContactActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteExternalContactActivity);
        }
        return inviteExternalContactActivity.mo145919c();
    }

    /* renamed from: b */
    public static void m159409b(InviteExternalContactActivity inviteExternalContactActivity) {
        inviteExternalContactActivity.mo145918b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            InviteExternalContactActivity inviteExternalContactActivity2 = inviteExternalContactActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    inviteExternalContactActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        ContactMobileApi.ContactType contactType;
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.f102193c = intent.getStringExtra("invite_msg");
        this.f102194d = intent.getStringExtra("unique_id");
        this.f102195e = intent.getBooleanExtra("is_email", false);
        Map<String, Serializable> a = C40108g.m159015a(getIntent().getExtras());
        C53241h.m205898b("InvitationModule", "onCreate InviteExternalContactActivity params: " + a);
        if (C40147z.m159165e()) {
            InviteExternalContainerFragment eVar = new InviteExternalContainerFragment();
            eVar.setArguments(intent.getExtras());
            C40124o.m159088a((FragmentActivity) this, 16908290, (Fragment) eVar, false, false);
            return;
        }
        setContentView(R.layout.inv_invite_external_contact_view);
        IInvitationModuleDependency.AbstractC40086b contactDependency = C40147z.m159160a().getContactDependency();
        if (this.f102195e) {
            contactType = ContactMobileApi.ContactType.EMAIL;
        } else {
            contactType = ContactMobileApi.ContactType.PHONE;
        }
        C40124o.m159088a((FragmentActivity) this, (int) R.id.iecFragmentContanier, contactDependency.mo145576a(contactType, ContactMobileApi.C35402a.m138368a(), "invite_external"), false, false);
        m159411d();
    }

    /* renamed from: a */
    public static void m159403a(Activity activity, String str) {
        m159405a(activity, "", "", str);
    }

    /* renamed from: a */
    public static Context m159401a(InviteExternalContactActivity inviteExternalContactActivity, Configuration configuration) {
        Context a = inviteExternalContactActivity.mo145915a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    private static void m159406a(Context context, Bundle bundle) {
        Intent intent = new Intent(context, InviteExternalContactActivity.class);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public static void m159407a(InviteExternalContactActivity inviteExternalContactActivity, Context context) {
        inviteExternalContactActivity.mo145917a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteExternalContactActivity);
        }
    }

    /* renamed from: a */
    public static void m159404a(Activity activity, String str, String str2) {
        m159405a(activity, str, "", str2);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 10086) {
            return;
        }
        if (i2 == -1) {
            C57783ah.m224245a().mo196093a(C40205c.f102145a, ((CountryBean) intent.getSerializableExtra(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)).getCode());
        } else {
            C57783ah.m224245a().mo196091a(C40205c.f102145a);
        }
    }

    /* renamed from: a */
    public static void m159405a(Activity activity, String str, String str2, String str3) {
        C57805b.m224332c(activity, new C57805b.AbstractC57809a(str, str2, activity, str3) {
            /* class com.ss.android.lark.invitation.v2.feat.external.contact.v1.$$Lambda$InviteExternalContactActivity$OgP18T7Fk1xMiWHDR61U4oqZ_cY */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ String f$1;
            public final /* synthetic */ Activity f$2;
            public final /* synthetic */ String f$3;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
            public final void permissionGranted(boolean z) {
                InviteExternalContactActivity.lambda$OgP18T7Fk1xMiWHDR61U4oqZ_cY(this.f$0, this.f$1, this.f$2, this.f$3, z);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m159408a(String str, String str2, Activity activity, String str3, boolean z) {
        if (z) {
            HashMap a = C40108g.m159014a(Pair.create("invite_msg", str), Pair.create("is_email", String.valueOf(C40147z.m159160a().isLarkEnv())), Pair.create("unique_id", str2));
            C53241h.m205898b("InvitationModule", "start InviteExternalContactV2Activity params: " + a);
            Bundle a2 = C40108g.m159013a(a);
            if (C40147z.m159165e()) {
                C36512a.m144041a().mo134762a(InviteExternalContainerFragment.f102209a.mo145942a(a2), new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134930b());
            } else {
                m159406a(activity, a2);
            }
        }
        InvHitPoint.m160368b(z, str3);
    }
}
