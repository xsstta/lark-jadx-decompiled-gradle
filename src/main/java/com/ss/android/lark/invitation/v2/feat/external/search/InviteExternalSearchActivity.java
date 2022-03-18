package com.ss.android.lark.invitation.v2.feat.external.search;

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
import com.ss.android.lark.invitation.v2.feat.external.p2054a.C40205c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.signinsdk_api.country.CountryBean;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57783ah;
import com.ss.android.lark.utils.C57824f;
import java.util.HashMap;

public class InviteExternalSearchActivity extends InvBaseFragmentActivity {
    /* renamed from: a */
    public Context mo146119a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo146120a() {
        return super.getResources();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m159710a(this, context);
    }

    /* renamed from: b */
    public void mo146121b() {
        super.onStop();
    }

    /* renamed from: b */
    public void mo146122b(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: c */
    public AssetManager mo146123c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m159706a(this, configuration);
    }

    public AssetManager getAssets() {
        return m159712c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m159707a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m159711b(this);
    }

    /* renamed from: a */
    public static void m159708a(Context context) {
        m159709a(context, "", "");
    }

    /* renamed from: a */
    public static Resources m159707a(InviteExternalSearchActivity inviteExternalSearchActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteExternalSearchActivity);
        }
        return inviteExternalSearchActivity.mo146120a();
    }

    /* renamed from: c */
    public static AssetManager m159712c(InviteExternalSearchActivity inviteExternalSearchActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteExternalSearchActivity);
        }
        return inviteExternalSearchActivity.mo146123c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C40124o.m159088a((FragmentActivity) this, 16908290, (Fragment) InviteExternalSearchFragment.f102385a.mo146143a(getIntent().getExtras()), false, false);
    }

    /* renamed from: b */
    public static void m159711b(InviteExternalSearchActivity inviteExternalSearchActivity) {
        inviteExternalSearchActivity.mo146121b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            InviteExternalSearchActivity inviteExternalSearchActivity2 = inviteExternalSearchActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    inviteExternalSearchActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m159710a(InviteExternalSearchActivity inviteExternalSearchActivity, Context context) {
        inviteExternalSearchActivity.mo146122b(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteExternalSearchActivity);
        }
    }

    /* renamed from: a */
    public static Context m159706a(InviteExternalSearchActivity inviteExternalSearchActivity, Configuration configuration) {
        Context a = inviteExternalSearchActivity.mo146119a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 10086) {
            Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag(InviteExternalSearchFragment.class.getName());
            if (findFragmentByTag != null) {
                findFragmentByTag.onActivityResult(i, i2, intent);
            }
        } else if (i2 == -1) {
            C57783ah.m224245a().mo196093a(C40205c.f102145a, ((CountryBean) intent.getSerializableExtra(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)).getCode());
        } else {
            C57783ah.m224245a().mo196091a(C40205c.f102145a);
        }
    }

    /* renamed from: a */
    public static void m159709a(Context context, String str, String str2) {
        HashMap a = C40108g.m159014a(Pair.create("invite_msg", str), Pair.create("unique_id", str2));
        if (C40147z.m159165e()) {
            C36512a.m144041a().mo134762a(InviteExternalSearchFragment.f102385a.mo146143a(C40108g.m159013a(a)), new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134930b());
            return;
        }
        C40118l.m159074a(context, "//client/invite/external/search", a);
    }
}
