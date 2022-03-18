package com.ss.lark.android.passport.biz.feature.switch_user;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.infra.base.architecture.ReturnMarkerBaseActivity;
import com.ss.android.lark.passport.infra.base.network.handler.UnknownCodeHandler;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.AbstractC49128n;
import com.ss.android.lark.passport.infra.service.ILogoutUserService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.logout.C49376b;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class SwitchNextValidFlagActivity extends ReturnMarkerBaseActivity {

    /* renamed from: k */
    private static int f163897k;

    /* renamed from: l */
    private static boolean f163898l;

    /* renamed from: a */
    public Context mo224221a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo170967a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo170968a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m255581a(this, context);
    }

    /* renamed from: b */
    public void mo170969b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo170970c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m255579a(this, configuration);
    }

    public AssetManager getAssets() {
        return m255583c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m255580a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m255582b(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.ReturnMarkerBaseActivity
    /* renamed from: w */
    public void mo171166w() {
        this.f123052c.mo171465b("n_action_switch_to_valid_activity", "startJump");
        C49092f.m193532a(this, this.f123063i, this.f123062h, RouterScene.ALL.value, this.f123055f, this.f123052c, new AbstractC49336a() {
            /* class com.ss.lark.android.passport.biz.feature.switch_user.SwitchNextValidFlagActivity.C650842 */

            @Override // com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a
            public void onRouterResult(int i, Object obj) {
                if (i == -102) {
                    SwitchNextValidFlagActivity.this.mo171163a("router jump failed, please check it.");
                } else {
                    SwitchNextValidFlagActivity.this.f123052c.mo171465b("n_action_switch_to_valid_activity", "jump Success");
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.fragment.app.FragmentActivity
    public void onResume() {
        super.onResume();
        PassportLog passportLog = this.f123052c;
        passportLog.mo171465b("n_action_switch_to_valid_activity", "onResume, currentIndex is:" + f163897k + ",isFirstLaunch:" + f163898l);
        if (!f163898l) {
            PassportLog passportLog2 = this.f123052c;
            passportLog2.mo171465b("n_action_switch_to_valid_activity", "onResume, switchToNextValidUser, currentIndex is:" + (f163897k + 1));
            ((AbstractC49128n) ServiceFinder.m193746a(AbstractC49128n.class)).switchToNextValidUser(this, 1, f163897k + 1, new IGetDataCallback<User>() {
                /* class com.ss.lark.android.passport.biz.feature.switch_user.SwitchNextValidFlagActivity.C650831 */

                /* renamed from: a */
                public void onSuccess(User user) {
                    SwitchNextValidFlagActivity.this.f123052c.mo171465b("n_action_switch_to_valid_activity", "switchToNextValidUser success");
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    UnknownCodeHandler.f123256a.mo171331c(SwitchNextValidFlagActivity.this, new NetworkErrorResult(errorResult.getErrorCode(), errorResult.getDisplayMsg()));
                    SwitchNextValidFlagActivity.this.mo171163a("switchToNextValidUser onError");
                }
            });
        }
        f163898l = false;
    }

    /* renamed from: a */
    public static Resources m255580a(SwitchNextValidFlagActivity switchNextValidFlagActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(switchNextValidFlagActivity);
        }
        return switchNextValidFlagActivity.mo170967a();
    }

    /* renamed from: c */
    public static AssetManager m255583c(SwitchNextValidFlagActivity switchNextValidFlagActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(switchNextValidFlagActivity);
        }
        return switchNextValidFlagActivity.mo170970c();
    }

    /* renamed from: b */
    public static void m255582b(SwitchNextValidFlagActivity switchNextValidFlagActivity) {
        switchNextValidFlagActivity.mo170969b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            SwitchNextValidFlagActivity switchNextValidFlagActivity2 = switchNextValidFlagActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    switchNextValidFlagActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.passport.infra.base.architecture.ReturnMarkerBaseActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f163898l = true;
        PassportLog passportLog = this.f123052c;
        passportLog.mo171465b("n_action_switch_to_valid_activity", "isFirstLaunch is:" + f163898l);
        if (this.f123062h.get("current_index") instanceof Integer) {
            f163897k = ((Integer) this.f123062h.get("current_index")).intValue();
        }
        PassportLog passportLog2 = this.f123052c;
        passportLog2.mo171465b("n_action_switch_to_valid_activity", "currentIndex is:" + f163897k + "jump, nextStep is:" + this.f123063i);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.ReturnMarkerBaseActivity
    /* renamed from: a */
    public void mo171163a(String str) {
        this.f123052c.mo171471d("n_action_switch_to_valid_activity", str);
        ((ILogoutUserService) ServiceFinder.m193746a(ILogoutUserService.class)).logoutAll(this, new IGetDataCallback<C49376b>() {
            /* class com.ss.lark.android.passport.biz.feature.switch_user.SwitchNextValidFlagActivity.C650853 */

            /* renamed from: a */
            public void onSuccess(C49376b bVar) {
                SwitchNextValidFlagActivity.this.f123052c.mo171465b("n_action_switch_to_valid_activity", "logoutAll success");
                SwitchNextValidFlagActivity.this.finish();
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                String str;
                PassportLog passportLog = SwitchNextValidFlagActivity.this.f123052c;
                if (errorResult == null) {
                    str = "onError";
                } else {
                    str = errorResult.getDisplayMsg();
                }
                passportLog.mo171471d("n_action_switch_to_valid_activity", str);
                SwitchNextValidFlagActivity.this.finish();
            }
        });
    }

    /* renamed from: a */
    public static void m255581a(SwitchNextValidFlagActivity switchNextValidFlagActivity, Context context) {
        switchNextValidFlagActivity.mo170968a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(switchNextValidFlagActivity);
        }
    }

    /* renamed from: a */
    public static Context m255579a(SwitchNextValidFlagActivity switchNextValidFlagActivity, Configuration configuration) {
        Context a = switchNextValidFlagActivity.mo224221a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
