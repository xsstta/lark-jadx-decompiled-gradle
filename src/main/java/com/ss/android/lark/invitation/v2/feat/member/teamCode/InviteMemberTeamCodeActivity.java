package com.ss.android.lark.invitation.v2.feat.member.teamCode;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.inv.export.ui.InvBaseFragmentActivity;
import com.ss.android.lark.inv.export.util.C40108g;
import com.ss.android.lark.inv.export.util.C40118l;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class InviteMemberTeamCodeActivity extends InvBaseFragmentActivity {

    /* renamed from: a */
    private C40474c f102797a;

    /* renamed from: b */
    private String f102798b;

    /* renamed from: c */
    private String f102799c;

    /* renamed from: a */
    public Context mo146494a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo146495a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo146496a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m160193a(this, context);
    }

    /* renamed from: b */
    public void mo146497b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo146498c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m160190a(this, configuration);
    }

    public AssetManager getAssets() {
        return m160195c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m160191a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public boolean isSlideEnable() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m160194b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.inv.export.ui.InvBaseFragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        this.f102797a.destroy();
    }

    /* renamed from: d */
    private void m160196d() {
        C40474c cVar = new C40474c(new C40473b(), new C40477d(this, this.f102798b), this.f102799c);
        this.f102797a = cVar;
        cVar.create();
    }

    /* renamed from: a */
    public static Resources m160191a(InviteMemberTeamCodeActivity inviteMemberTeamCodeActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteMemberTeamCodeActivity);
        }
        return inviteMemberTeamCodeActivity.mo146495a();
    }

    /* renamed from: c */
    public static AssetManager m160195c(InviteMemberTeamCodeActivity inviteMemberTeamCodeActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteMemberTeamCodeActivity);
        }
        return inviteMemberTeamCodeActivity.mo146498c();
    }

    /* renamed from: b */
    public static void m160194b(InviteMemberTeamCodeActivity inviteMemberTeamCodeActivity) {
        inviteMemberTeamCodeActivity.mo146497b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            InviteMemberTeamCodeActivity inviteMemberTeamCodeActivity2 = inviteMemberTeamCodeActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    inviteMemberTeamCodeActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.inv_invite_member_team_code_view);
        this.f102798b = getIntent().getStringExtra("from_scenes");
        this.f102799c = getIntent().getStringExtra("departments");
        C53241h.m205898b("InvitationModule", "onCreate InviteMemberTeamCodeActivity from: " + this.f102798b);
        m160196d();
    }

    /* renamed from: a */
    public static void m160193a(InviteMemberTeamCodeActivity inviteMemberTeamCodeActivity, Context context) {
        inviteMemberTeamCodeActivity.mo146496a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteMemberTeamCodeActivity);
        }
    }

    /* renamed from: a */
    public static Context m160190a(InviteMemberTeamCodeActivity inviteMemberTeamCodeActivity, Configuration configuration) {
        Context a = inviteMemberTeamCodeActivity.mo146494a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public static void m160192a(Context context, String str, String str2) {
        C40118l.m159074a(context, "//client/invite/member/teamcode", C40108g.m159014a(Pair.create("from_scenes", str), Pair.create("departments", str2)));
    }
}
