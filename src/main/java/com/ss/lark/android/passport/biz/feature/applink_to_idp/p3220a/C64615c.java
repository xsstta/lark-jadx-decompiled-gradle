package com.ss.lark.android.passport.biz.feature.applink_to_idp.p3220a;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.base.statistics.C49096b;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49154ag;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49382d;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.utils.UIHelper;
import com.ss.lark.android.passport.biz.compat.tenant.C64471a;
import com.ss.lark.android.passport.biz.feature.FeatureCApi;
import com.ss.lark.android.passport.biz.feature.applink_to_idp.p3220a.C64622d;
import com.ss.lark.android.passport.biz.utils.C65249d;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.lark.android.passport.biz.feature.applink_to_idp.a.c */
public class C64615c extends AbstractC49023c<C64622d.AbstractC64624b.AbstractC64625a> implements C64622d.AbstractC64624b {

    /* renamed from: c */
    private boolean f163080c;

    /* renamed from: d */
    private Activity f163081d;

    /* renamed from: e */
    private C64622d.AbstractC64624b.AbstractC64625a f163082e;

    /* renamed from: f */
    private AbstractC64621a f163083f;

    /* renamed from: g */
    private UDDialog f163084g;

    /* renamed from: h */
    private UniContext f163085h;

    /* renamed from: com.ss.lark.android.passport.biz.feature.applink_to_idp.a.c$a */
    public interface AbstractC64621a {
        /* renamed from: a */
        void mo223410a(C64615c cVar);
    }

    /* renamed from: d */
    public void mo223419d() {
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g
    /* renamed from: c */
    public UniContext mo171187c() {
        return this.f163085h;
    }

    @Override // com.ss.lark.android.passport.biz.feature.applink_to_idp.p3220a.C64622d.AbstractC64624b
    /* renamed from: a */
    public void mo223416a(JSONObject jSONObject) {
        if (jSONObject.getString("applink_url") == null) {
            mo223420e();
        }
        Uri parse = Uri.parse(jSONObject.getString("applink_url"));
        String queryParameter = parse.getQueryParameter("sso_domain");
        String queryParameter2 = parse.getQueryParameter("tenant_name");
        if (TextUtils.isEmpty(queryParameter)) {
            mo223420e();
        }
        if (C65249d.m256139a() == 0) {
            mo223415a(this.f163081d, queryParameter);
        } else {
            mo223418a(queryParameter, queryParameter2);
        }
    }

    /* renamed from: a */
    public void mo223418a(String str, String str2) {
        User foregroundUser = ServiceFinder.m193744a().getForegroundUser();
        TenantInfo a = C64471a.f162788a.mo223057a(foregroundUser != null ? foregroundUser.userId : null);
        if (str == null || a == null) {
            this.f123085b.mo171471d("LoadingJumpView", "ssoDomainName or currentTenantInfo is null");
            mo223420e();
        } else if (a.getSuitFullDomain() == null || !a.getSuitFullDomain().equals(str)) {
            ArrayList arrayList = new ArrayList();
            List<TenantInfo> c = C64471a.f162788a.mo223068c();
            for (int i = 0; i < c.size(); i++) {
                arrayList.add(c.get(i).getSuitFullDomain() == null ? "" : c.get(i).getSuitFullDomain());
            }
            if (arrayList.contains(str)) {
                m253889a(str, str2, c, arrayList);
            } else if (!this.f163080c) {
                this.f163080c = m253891b(str, str2);
            } else {
                mo223415a(this.f163081d, str);
            }
        } else {
            this.f123085b.mo171465b("LoadingJumpView", "suite for now full Domain");
            mo223420e();
        }
    }

    /* renamed from: a */
    public void mo171188a(C64622d.AbstractC64624b.AbstractC64625a aVar) {
        this.f163082e = aVar;
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    public void cn_() {
        this.f163082e = null;
        this.f163083f = null;
    }

    /* renamed from: e */
    public void mo223420e() {
        this.f163081d.finish();
    }

    /* renamed from: f */
    public void mo223421f() {
        if (C49154ag.m193835a(this.f163081d)) {
            Activity activity = this.f163081d;
            if (activity instanceof BaseActivity) {
                ((BaseActivity) activity).mo171141m();
            }
        }
    }

    /* renamed from: g */
    public void mo223422g() {
        if (C49154ag.m193835a(this.f163081d)) {
            Activity activity = this.f163081d;
            if (activity instanceof BaseActivity) {
                ((BaseActivity) activity).mo171143o();
            }
        }
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    /* renamed from: a */
    public void mo171169a() {
        this.f163083f.mo223410a(this);
        mo223419d();
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g
    /* renamed from: a */
    public void mo171186a(UniContext uniContext) {
        this.f163085h = uniContext;
    }

    /* renamed from: a */
    private void m253887a(TenantInfo tenantInfo) {
        if (tenantInfo == null || TextUtils.isEmpty(tenantInfo.getUserId())) {
            this.f123085b.mo171471d("LoadingJumpView", "tenantInfo is null");
            mo223420e();
            return;
        }
        ServiceFinder.m193753h().switchUser(this.f163081d, tenantInfo.getUserId(), new IGetDataCallback<C49382d>() {
            /* class com.ss.lark.android.passport.biz.feature.applink_to_idp.p3220a.C64615c.C646183 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C64615c.this.f123085b.mo171471d("LoadingJumpView", "switchUser onSuccess, but userSwitchSuccessContext is null");
                C64615c.this.mo223420e();
            }

            /* renamed from: a */
            public void onSuccess(C49382d dVar) {
                if (dVar != null) {
                    C64615c.this.f123085b.mo171465b("LoadingJumpView", "switchLoginTenantUser SwitchUser onSuccess");
                    Statistics.sendEvent("applink_sso_switchteam_succ");
                } else {
                    C64615c.this.f123085b.mo171471d("LoadingJumpView", "switchUser onSuccess, but userSwitchSuccessContext is null");
                }
                C64615c.this.mo223420e();
            }
        });
    }

    /* renamed from: a */
    private void m253888a(String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("action_name", str);
            Statistics.sendEvent("applink_sso_switchteam", jSONObject);
        } catch (Exception e) {
            PassportLog passportLog = this.f123085b;
            passportLog.mo171471d("LoadingJumpView", "switchUserDialogBuryingPoint " + e.getMessage());
        }
    }

    public C64615c(Activity activity, AbstractC64621a aVar) {
        this.f163081d = activity;
        this.f163083f = aVar;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m253886a(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f123085b.mo171465b("LoadingJumpView", "you clicked negative button");
        mo223420e();
    }

    /* renamed from: b */
    private boolean m253891b(final String str, final String str2) {
        User foregroundUser = ServiceFinder.m193744a().getForegroundUser();
        if (foregroundUser == null) {
            this.f123085b.mo171471d("LoadingJumpView", "foregroundUser is null");
            mo223420e();
            return false;
        }
        mo223421f();
        C64471a.f162788a.mo223062a(ServiceFinder.m193752g().generateContextId(), foregroundUser.userId, new IGetDataCallback<TenantInfo>() {
            /* class com.ss.lark.android.passport.biz.feature.applink_to_idp.p3220a.C64615c.C646161 */

            /* renamed from: a */
            public void onSuccess(TenantInfo tenantInfo) {
                C64615c.this.mo223422g();
                C64615c.this.mo223418a(str, str2);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C64615c.this.mo223422g();
                C64615c.this.mo223420e();
                C64615c.this.f123085b.mo171471d("LoadingJumpView", "refreshTenantData onError");
            }
        });
        return true;
    }

    /* renamed from: a */
    public void mo223415a(final Context context, String str) {
        final UniContext uniContext = UniContext.CONTEXT_GLOBAL;
        mo223421f();
        FeatureCApi.IdP.m253715a(null, null, str, "", "", uniContext, false, new ICallback<BaseStepData>() {
            /* class com.ss.lark.android.passport.biz.feature.applink_to_idp.p3220a.C64615c.C646194 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public Type mo101474a() {
                return BaseStepData.class;
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public void mo101475a(NetworkErrorResult networkErrorResult) {
                C64615c.this.mo223422g();
                C49096b.m193609u();
                C64615c.this.f123085b.mo171471d("LoadingJumpView", PassportLog.m193687a("fetchAuthUrl error", networkErrorResult));
                C64615c.this.mo223420e();
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public void mo101476a(ResponseModel<BaseStepData> responseModel) {
                if (responseModel == null || responseModel.getData() == null) {
                    C64615c.this.mo223422g();
                    C64615c.this.f123085b.mo171471d("LoadingJumpView", "empty nextStep");
                    C64615c.this.mo223420e();
                    return;
                }
                BaseStepData data = responseModel.getData();
                PassportLog passportLog = C64615c.this.f123085b;
                passportLog.mo171465b("LoadingJumpView", "nextStep: " + data.nextStep);
                C49092f.m193529a(context, data, RouterScene.ALL.value, uniContext, C64615c.this.f123085b, new AbstractC49336a() {
                    /* class com.ss.lark.android.passport.biz.feature.applink_to_idp.p3220a.C64615c.C646194.C646201 */

                    @Override // com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a
                    public void onRouterResult(int i, Object obj) {
                        C64615c.this.mo223422g();
                        C64615c.this.f123085b.mo171465b("LoadingJumpView", "jump to auth_url success");
                        C64615c.this.mo223420e();
                    }
                });
            }
        });
    }

    /* renamed from: a */
    private int m253885a(List<TenantInfo> list, List<String> list2, String str) {
        if (list == null || list2 == null || str == null) {
            this.f123085b.mo171471d("LoadingJumpView", "tenantInfoList or tenantFullDomainList or ssoDomainName is null");
            return 0;
        } else if (list2.indexOf(str) == list2.lastIndexOf(str)) {
            return list2.indexOf(str);
        } else {
            long j = 0;
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                TenantInfo tenantInfo = list.get(i2);
                if (str.equals(tenantInfo.getSuitFullDomain()) && tenantInfo.getLastUseTimestamp() >= j) {
                    j = tenantInfo.getLastUseTimestamp();
                    i = i2;
                }
            }
            return i;
        }
    }

    /* renamed from: a */
    private void m253889a(String str, String str2, List<TenantInfo> list, List<String> list2) {
        m253888a("confirmcancel");
        String mustacheFormat = UIHelper.mustacheFormat(this.f163081d.getString(R.string.Lark_Login_SSOAppLinkConfirmPopUp2), "tenantName", str2);
        UDDialogBuilder eVar = new UDDialogBuilder(this.f163081d);
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) eVar.title(this.f163081d.getString(R.string.Lark_Login_SSOAppLinkConfirmPopUpTitle))).message(mustacheFormat)).titleBold(true)).onCancelListener(new DialogInterface.OnCancelListener() {
            /* class com.ss.lark.android.passport.biz.feature.applink_to_idp.p3220a.C64615c.DialogInterface$OnCancelListenerC646172 */

            public void onCancel(DialogInterface dialogInterface) {
                C64615c.this.mo223420e();
            }
        })).addActionButton(R.id.ud_dialog_btn_secondary, this.f163081d.getString(R.string.Lark_Login_JoinTeamSucceedCancelButton), new DialogInterface.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.applink_to_idp.p3220a.$$Lambda$c$vg30o2N2kRg3uBRxjUxa4Tjkvr0 */

            public final void onClick(DialogInterface dialogInterface, int i) {
                C64615c.lambda$vg30o2N2kRg3uBRxjUxa4Tjkvr0(C64615c.this, dialogInterface, i);
            }
        })).addActionButton(R.id.ud_dialog_btn_primary, this.f163081d.getString(R.string.Lark_Login_JoinTeamSucceedContinueButton), new DialogInterface.OnClickListener(list, list2, str) {
            /* class com.ss.lark.android.passport.biz.feature.applink_to_idp.p3220a.$$Lambda$c$QCwqW4_7RRo6znm0q6oKcGVd1A */
            public final /* synthetic */ List f$1;
            public final /* synthetic */ List f$2;
            public final /* synthetic */ String f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C64615c.m271525lambda$QCwqW4_7RRo6znm0q6oKcGVd1A(C64615c.this, this.f$1, this.f$2, this.f$3, dialogInterface, i);
            }
        });
        UDDialog build = eVar.build();
        this.f163084g = build;
        build.show();
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m253890a(List list, List list2, String str, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        m253887a((TenantInfo) list.get(m253885a(list, list2, str)));
    }
}
