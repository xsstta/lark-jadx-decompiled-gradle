package com.ss.lark.android.passport.biz.feature.sso.loading;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.base.watermark.IWatermarkable;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.base.network.handler.UnknownCodeHandler;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.IUserListService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49154ag;
import com.ss.android.lark.passport.infra.widget.DialogC49246b;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49347c;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IQRLoginService;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.lark.android.passport.biz.feature.TeamConversionApi;
import java.lang.reflect.Type;

public class TransparentLoadingActivity extends BaseActivity implements IWatermarkable {

    /* renamed from: h */
    private DialogC49246b f163821h;

    /* renamed from: i */
    private AbstractC49347c f163822i;

    /* renamed from: a */
    public Context mo224127a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo170968a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m255390a(this, context);
    }

    /* renamed from: b */
    public Resources mo170969b() {
        return super.getResources();
    }

    /* renamed from: c */
    public void mo170970c() {
        super.onStop();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    public boolean cA_() {
        return false;
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m255386a(this, configuration);
    }

    @Override // com.ss.android.lark.base.watermark.IWatermarkable
    public boolean enableGlobalWatermark() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    /* renamed from: f */
    public boolean mo171133f() {
        return true;
    }

    public AssetManager getAssets() {
        return m255392c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m255387a(this);
    }

    @Override // com.ss.android.lark.base.watermark.IWatermarkable
    public int getWatermarkMode() {
        return 0;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m255391b(this);
    }

    /* renamed from: w */
    public AssetManager mo224132w() {
        return super.getAssets();
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    /* renamed from: A */
    private void m255385A() {
        AbstractC49347c cVar = this.f163822i;
        if (cVar != null) {
            cVar.mo171123a();
            this.f163822i = null;
        }
    }

    /* renamed from: x */
    private void m255393x() {
        if (this.f163821h == null) {
            DialogC49246b bVar = new DialogC49246b(this, true);
            this.f163821h = bVar;
            bVar.setOnDismissListener(new DialogInterface.OnDismissListener() {
                /* class com.ss.lark.android.passport.biz.feature.sso.loading.TransparentLoadingActivity.DialogInterface$OnDismissListenerC650411 */

                public void onDismiss(DialogInterface dialogInterface) {
                    TransparentLoadingActivity.this.finish();
                }
            });
        }
        this.f163821h.show();
    }

    /* renamed from: z */
    private void m255395z() {
        this.f123052c.mo171465b("n_action_discovery_req", "start");
        m255393x();
        TeamConversionApi.m254372a(UniContext.CONTEXT_SWITCH, new ICallback<BaseStepData>() {
            /* class com.ss.lark.android.passport.biz.feature.sso.loading.TransparentLoadingActivity.C650433 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public Type mo101474a() {
                return BaseStepData.class;
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public void mo101475a(NetworkErrorResult networkErrorResult) {
                TransparentLoadingActivity.this.mo170967a();
                PassportLog passportLog = TransparentLoadingActivity.this.f123052c;
                passportLog.mo171465b("n_action_discovery_error", "error_msg:" + networkErrorResult.getErrorMessage());
                UnknownCodeHandler.f123256a.mo171331c(ServiceFinder.m193748c().getApplicationContext(), networkErrorResult);
                ServiceFinder.m193752g().launchMainActivity(TransparentLoadingActivity.this);
                TransparentLoadingActivity.this.finish();
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public void mo101476a(ResponseModel<BaseStepData> responseModel) {
                TransparentLoadingActivity.this.f123052c.mo171460a("n_action_discovery_succ");
                TransparentLoadingActivity.this.mo170967a();
                BaseStepData data = responseModel.getData();
                if (data.stepInfo == null) {
                    TransparentLoadingActivity.this.f123052c.mo171471d("n_action_discovery_succ", "stepInfo is null");
                    data.stepInfo = new JSONObject();
                }
                C49092f.m193527a(TransparentLoadingActivity.this, data, RouterScene.INVITE.value, TransparentLoadingActivity.this.f123052c, new AbstractC49336a() {
                    /* class com.ss.lark.android.passport.biz.feature.sso.loading.TransparentLoadingActivity.C650433.C650441 */

                    @Override // com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a
                    public void onRouterResult(int i, Object obj) {
                        if (i == -100) {
                            TransparentLoadingActivity.this.f123052c.mo171465b("n_action_route_to_user_list", "succ");
                        } else {
                            TransparentLoadingActivity.this.f123052c.mo171471d("n_action_route_to_user_list", "err:code is not CODE_PAGE_SUCCESS");
                        }
                    }
                });
                TransparentLoadingActivity.this.finish();
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        m255385A();
        mo170967a();
        super.onDestroy();
        this.f123052c.mo171460a("n_page_transloading_end");
    }

    /* renamed from: y */
    private void m255394y() {
        if ("join_team".equals(getIntent().getStringExtra("activity_flag"))) {
            User foregroundUser = ((IUserListService) ServiceFinder.m193746a(IUserListService.class)).getForegroundUser();
            if (foregroundUser == null || !foregroundUser.isExcludeLogin()) {
                m255395z();
            } else {
                mo224128a(foregroundUser);
            }
        } else {
            final String stringExtra = getIntent().getStringExtra("token");
            if (TextUtils.isEmpty(stringExtra)) {
                this.f123052c.mo171471d("n_page_transloading_start", "token is empty ");
                return;
            }
            final IQRLoginService nVar = (IQRLoginService) ServiceFinder.m193746a(IQRLoginService.class);
            if (nVar != null) {
                m255393x();
                m255385A();
                this.f123052c.mo171465b("n_action_qrlogin_scan_req", "start in TransparentLoadingActivity");
                this.f163822i = nVar.qrLoginCheck(stringExtra, new IGetDataCallback<BaseStepData>() {
                    /* class com.ss.lark.android.passport.biz.feature.sso.loading.TransparentLoadingActivity.C650422 */

                    /* renamed from: a */
                    public void onSuccess(BaseStepData baseStepData) {
                        TransparentLoadingActivity.this.f123052c.mo171465b("n_action_qrlogin_scan_req", "succ in TransparentLoadingActivity");
                        TransparentLoadingActivity.this.mo170967a();
                        nVar.startSSOUrlConfirmActivity(TransparentLoadingActivity.this, stringExtra, baseStepData);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        TransparentLoadingActivity.this.f123052c.mo171471d("n_action_qrlogin_scan_req", "error=err.getDisplayMsg(),fail in TransparentLoadingActivity");
                        TransparentLoadingActivity.this.mo170967a();
                    }
                });
                return;
            }
            this.f123052c.mo171471d("n_action_qrlogin_scan_req", "QRLoginService is null -> not found in TransparentLoadingActivity");
        }
    }

    /* renamed from: a */
    public void mo170967a() {
        DialogC49246b bVar = this.f163821h;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f123052c.mo171460a("n_page_transloading_start");
        m255394y();
    }

    /* renamed from: a */
    public static Resources m255387a(TransparentLoadingActivity transparentLoadingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(transparentLoadingActivity);
        }
        return transparentLoadingActivity.mo170969b();
    }

    /* renamed from: c */
    public static AssetManager m255392c(TransparentLoadingActivity transparentLoadingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(transparentLoadingActivity);
        }
        return transparentLoadingActivity.mo224132w();
    }

    /* renamed from: b */
    public static void m255391b(TransparentLoadingActivity transparentLoadingActivity) {
        transparentLoadingActivity.mo170970c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            TransparentLoadingActivity transparentLoadingActivity2 = transparentLoadingActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    transparentLoadingActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: b */
    public void mo224129b(User user) {
        String str;
        if (user.tenant == null) {
            str = "";
        } else {
            str = user.tenant.name;
        }
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(this).titleBold(true)).message(C49154ag.m193831a(this, (int) R.string.Lark_Passport_MultipleAccount_ManualLogoutPopup, "TenantName", str, this.f123052c))).addActionButton(R.id.ud_dialog_btn_primary, getString(R.string.Lark_Passport_MultipleAccount_ManualLogoutPopup_GotButton), new DialogInterface.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.sso.loading.$$Lambda$TransparentLoadingActivity$wbkhLjBfF3KCDK2hobqWEx7wP3M */

            public final void onClick(DialogInterface dialogInterface, int i) {
                TransparentLoadingActivity.this.m255389a((TransparentLoadingActivity) dialogInterface, (DialogInterface) i);
            }
        })).show();
    }

    /* renamed from: a */
    public void mo224128a(final User user) {
        this.f123052c.mo171465b("TransparentLoadingActivity", "ForegroundUser is exclude login");
        if (user == null) {
            this.f123052c.mo171471d("TransparentLoadingActivity", "foregroundUser is null");
        } else {
            new Handler().postDelayed(new Runnable() {
                /* class com.ss.lark.android.passport.biz.feature.sso.loading.TransparentLoadingActivity.RunnableC650454 */

                public void run() {
                    TransparentLoadingActivity.this.mo224129b(user);
                }
            }, 100);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m255389a(DialogInterface dialogInterface, int i) {
        this.f123052c.mo171465b("TransparentLoadingActivity", "Exclude login cancel");
        dialogInterface.dismiss();
    }

    /* renamed from: a */
    public static Context m255386a(TransparentLoadingActivity transparentLoadingActivity, Configuration configuration) {
        Context a = transparentLoadingActivity.mo224127a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public static void m255390a(TransparentLoadingActivity transparentLoadingActivity, Context context) {
        transparentLoadingActivity.mo170968a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(transparentLoadingActivity);
        }
    }

    /* renamed from: a */
    public static void m255388a(Context context, String str, PassportLog passportLog) {
        if (TextUtils.isEmpty(str)) {
            passportLog.mo171471d("TransparentLoadingActivity", "the token is null");
            return;
        }
        Intent intent = new Intent(context, TransparentLoadingActivity.class);
        intent.putExtra("token", str);
        intent.addFlags(65536);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }
}
