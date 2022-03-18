package com.ss.android.lark.passport.ka.web;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.larksuite.component.dybrid.h5api.api.AbstractC24158a;
import com.larksuite.component.dybrid.h5api.api.AbstractC24168k;
import com.larksuite.component.dybrid.h5api.api.AbstractC24169l;
import com.larksuite.component.dybrid.h5api.api.H5Event;
import com.larksuite.component.dybrid.h5core.p1076d.C24214b;
import com.larksuite.component.dybrid.h5core.p1082h.C24246a;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.http.p1191f.C26005c;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openapi.p2397a.C48758b;
import com.ss.android.lark.passport.infra.base.architecture.C49032c;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.ka.model.DecodedIdPLoginModel;
import com.ss.android.lark.passport.ka.model.KaConfig;
import com.ss.android.lark.passport.ka.p2452a.C49292b;
import com.ss.android.lark.passport.ka.p2452a.C49296c;
import com.ss.android.lark.passport.ka.transparent.KaLoadingActivity;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57878s;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.vpn.p2919a.AbstractC58198b;
import com.ss.android.lark.vpn.p2919a.p2920a.AbstractC58197a;
import com.ss.lark.android.passport.biz.compat.web.jsbridge.BaseJSModel;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

public class KaJsPlugin implements AbstractC24169l {

    /* renamed from: a */
    private static final PassportLog f123761a = PassportLog.f123351c.mo171474a();

    public static class SwitchIdpModel implements Serializable {
        @JSONField(name = "idp_type")
        public String idpType;
    }

    public static class VpnUserAuthResult extends BaseJSModel {
        public int authType;
        public int code;
        public String msg;
        public boolean succ;
    }

    public static class VpnUserJsModel extends BaseJSModel {
        public String password;
        public String userName;
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: d */
    public void mo86749d() {
    }

    /* renamed from: com.ss.android.lark.passport.ka.web.KaJsPlugin$a */
    private static class C49309a implements C49032c.AbstractC49036b {

        /* renamed from: a */
        private final AbstractC24168k f123773a;

        @Override // com.ss.android.lark.passport.infra.base.architecture.C49032c.AbstractC49036b
        /* renamed from: b */
        public String mo171207b() {
            return "idp_authentication";
        }

        @Override // com.ss.android.lark.passport.infra.base.architecture.C49032c.AbstractC49036b
        /* renamed from: c */
        public JSONObject mo171208c() {
            return null;
        }

        @Override // com.ss.android.lark.passport.infra.statistics.AbstractC49137a
        /* renamed from: k */
        public String mo171139k() {
            return "";
        }

        public int hashCode() {
            return this.f123773a.hashCode();
        }

        @Override // com.ss.android.lark.passport.infra.base.architecture.C49032c.AbstractC49036b
        /* renamed from: a */
        public void mo171206a() {
            AbstractC24168k kVar = this.f123773a;
            if (kVar != null) {
                kVar.mo86736a("h5PageClose", null);
            }
        }

        public C49309a(AbstractC24168k kVar) {
            this.f123773a = kVar;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C49309a) {
                return this.f123773a.equals(((C49309a) obj).f123773a);
            }
            return false;
        }
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24169l
    /* renamed from: a */
    public void mo86761a(AbstractC24158a aVar) {
        aVar.mo86723a("biz.account.h5_login_result");
        aVar.mo86723a("biz.account.ka_info");
        aVar.mo86723a("biz.account.switch_idp");
        aVar.mo86723a("h5PageClosed");
        aVar.mo86723a("h5PageCreated");
        aVar.mo86723a("biz.account.vpn_auth_user");
    }

    /* renamed from: c */
    private boolean m194268c(H5Event h5Event) {
        if (!(h5Event.mo86711e() instanceof AbstractC24168k)) {
            return false;
        }
        Bundle l = ((AbstractC24168k) h5Event.mo86711e()).mo86759l();
        String a = C24246a.m88555a(l, "u");
        if (TextUtils.isEmpty(a)) {
            a = C24246a.m88555a(l, "url");
        }
        if (TextUtils.isEmpty(a)) {
            f123761a.mo171465b("KaJsPlugin", "isAllowedUrl return false : checkPermission but url is empty!!!");
            return false;
        }
        String f = C49296c.m194232a().mo171921f();
        ArrayList arrayList = new ArrayList();
        arrayList.add(f);
        boolean a2 = m194267a(a, arrayList);
        if (!a2) {
            f123761a.mo171465b("KaJsPlugin", "isAllowedUrl return false : unauthorized");
        }
        return a2;
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: a */
    public boolean mo86747a(H5Event h5Event) throws JSONException {
        String b = h5Event.mo86707b();
        if (!(h5Event.mo86711e() instanceof AbstractC24168k)) {
            return false;
        }
        AbstractC24168k kVar = (AbstractC24168k) h5Event.mo86711e();
        C49309a aVar = new C49309a(kVar);
        if ("h5PageClosed".equals(b)) {
            PassportLog passportLog = f123761a;
            passportLog.mo171461a("KaJsPlugin", "H5_PAGE_CLOSED---->" + kVar.mo86759l().toString());
            C49032c.m193132a().mo171197b(aVar);
            return false;
        } else if (!"h5PageCreated".equals(b)) {
            return false;
        } else {
            PassportLog passportLog2 = f123761a;
            passportLog2.mo171461a("KaJsPlugin", "H5_PAGE_CREATED---->" + kVar.mo86759l().toString());
            C49032c.m193132a().mo171192a(aVar);
            return false;
        }
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: b */
    public boolean mo86748b(final H5Event h5Event) throws JSONException {
        String str;
        if (h5Event == null) {
            Log.m165383e("KaJsPlugin", "handleEvnent Action event is null");
            return false;
        }
        f123761a.mo171465b("KaJsPlugin", "handleEvent" + h5Event.mo86707b());
        if ("biz.account.h5_login_result".equals(h5Event.mo86707b())) {
            try {
                str = new String(Base64.decode(h5Event.mo86710d().optString("idp_context"), 0), StandardCharsets.UTF_8);
            } catch (IllegalArgumentException e) {
                f123761a.mo171462a("n_action_idp_auth_web_auth_fail", "handle login result, base64 decode failed", e);
                str = null;
            }
            DecodedIdPLoginModel decodedIdPLoginModel = (DecodedIdPLoginModel) C57878s.m224590a(str, DecodedIdPLoginModel.class);
            if (decodedIdPLoginModel != null) {
                KaLoadingActivity.m194259a(C24214b.m88460a(), decodedIdPLoginModel);
            } else {
                f123761a.mo171471d("n_action_idp_auth_web_auth_fail", "login result is null");
            }
        }
        if ("biz.account.ka_info".equals(h5Event.mo86707b())) {
            PassportLog passportLog = f123761a;
            passportLog.mo171471d("KaJsPlugin", "handleEvent BRIGE_KA_INFO ");
            KaConfig kaConfig = (KaConfig) C49296c.m194232a().mo171905a(KaConfig.class);
            if (kaConfig == null || kaConfig.external == null) {
                passportLog.mo171471d("KaJsPlugin", "handlerEvent kaInfo config == null || external == null");
            } else {
                final org.json.JSONObject jSONObject = new org.json.JSONObject(kaConfig.external);
                CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                    /* class com.ss.android.lark.passport.ka.web.KaJsPlugin.RunnableC493051 */

                    public void run() {
                        h5Event.mo86708b(jSONObject);
                    }
                });
            }
        }
        if ("biz.account.switch_idp".equals(h5Event.mo86707b())) {
            String jSONObject2 = h5Event.mo86710d().toString();
            PassportLog passportLog2 = f123761a;
            passportLog2.mo171471d("KaJsPlugin", "handleEvent BRIGE_SWITCH_IDP " + jSONObject2);
            final SwitchIdpModel switchIdpModel = (SwitchIdpModel) C48758b.m192084a(jSONObject2, SwitchIdpModel.class);
            if (switchIdpModel == null || TextUtils.isEmpty(switchIdpModel.idpType)) {
                passportLog2.mo171471d("KaJsPlugin", "error switch_idp params");
            } else {
                C49292b.m194222a().mo171904a(null, switchIdpModel.idpType, "", "", new AbstractC49352d<BaseStepData>() {
                    /* class com.ss.android.lark.passport.ka.web.KaJsPlugin.C493062 */

                    /* renamed from: a */
                    public void mo145179a(BaseStepData baseStepData) {
                        C49292b.m194222a().mo171902a(C24214b.m88460a(), switchIdpModel.idpType, baseStepData);
                    }

                    @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
                    /* renamed from: a */
                    public void mo145178a(NetworkErrorResult networkErrorResult) {
                        LKUIToast.show(C24214b.m88460a(), networkErrorResult.getErrorMessage());
                    }
                });
            }
        }
        if ("biz.account.vpn_auth_user".equals(h5Event.mo86707b())) {
            final VpnUserAuthResult vpnUserAuthResult = new VpnUserAuthResult();
            if (!m194268c(h5Event)) {
                vpnUserAuthResult.succ = false;
                vpnUserAuthResult.code = -90000;
                vpnUserAuthResult.msg = "vpn_bridge unauthorized! ";
                mo171942a(vpnUserAuthResult, h5Event);
                return true;
            }
            String jSONObject3 = h5Event.mo86710d().toString();
            PassportLog passportLog3 = f123761a;
            passportLog3.mo171463a("KaJsPlugin", "handleEvent BRIDGE_VPN_AUTH", (Map<String, Object>) null);
            VpnUserJsModel vpnUserJsModel = (VpnUserJsModel) C48758b.m192084a(jSONObject3, VpnUserJsModel.class);
            AbstractC58198b bVar = (AbstractC58198b) ApiUtils.getApi(AbstractC58198b.class);
            bVar.getVPNSDKService().mo197211b(LarkContext.getApplication());
            if (bVar == null) {
                passportLog3.mo171471d("KaJsPlugin", "error BRIDGE_VPN_AUTH: vpnSdkModule get service is null");
            } else if (vpnUserJsModel == null || TextUtils.isEmpty(vpnUserJsModel.userName) || TextUtils.isEmpty(vpnUserJsModel.password)) {
                vpnUserAuthResult.succ = false;
                vpnUserAuthResult.code = -90001;
                vpnUserAuthResult.msg = "username and password must not be null!";
                mo171942a(vpnUserAuthResult, h5Event);
                passportLog3.mo171471d("KaJsPlugin", "error BRIDGE_VPN_AUTH: username or password is null");
            } else {
                bVar.getVPNSDKService().mo197209a(vpnUserJsModel.userName, vpnUserJsModel.password, new AbstractC58197a() {
                    /* class com.ss.android.lark.passport.ka.web.KaJsPlugin.C493073 */
                });
            }
        }
        return true;
    }

    /* renamed from: a */
    public void mo171942a(VpnUserAuthResult vpnUserAuthResult, final H5Event h5Event) {
        try {
            String a = C48758b.m192085a(vpnUserAuthResult);
            final org.json.JSONObject jSONObject = new org.json.JSONObject(a);
            PassportLog passportLog = f123761a;
            passportLog.mo171465b("KaJsPlugin", "error BRIDGE_VPN_AUTH: onAuthSuccess resultStr = " + a);
            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                /* class com.ss.android.lark.passport.ka.web.KaJsPlugin.RunnableC493084 */

                public void run() {
                    ((AbstractC58198b) ApiUtils.getApi(AbstractC58198b.class)).getVPNSDKService().mo197211b(LarkContext.getApplication());
                    h5Event.mo86708b(jSONObject);
                }
            });
        } catch (JSONException e) {
            e.printStackTrace();
            f123761a.mo171471d("KaJsPlugin", "error BRIDGE_VPN_AUTH: onAuthSuccess resultStr jsonObject exp");
        }
    }

    /* renamed from: a */
    public static boolean m194267a(String str, List<String> list) {
        if (TextUtils.isEmpty(str)) {
            f123761a.mo171471d("KaJsPlugin", "isAllowedUrl return false : requestUrl is null");
            return false;
        } else if (list == null || list.size() <= 0) {
            f123761a.mo171471d("KaJsPlugin", "isAllowedUrl return false : allowUrlList is null");
            return false;
        } else {
            String a = C26005c.m94126a(str);
            for (String str2 : list) {
                String a2 = C26005c.m94126a(str2);
                if (a != null && a.equals(a2)) {
                    f123761a.mo171465b("KaJsPlugin", "isAllowedUrl host match return true");
                    return true;
                }
            }
            return false;
        }
    }
}
