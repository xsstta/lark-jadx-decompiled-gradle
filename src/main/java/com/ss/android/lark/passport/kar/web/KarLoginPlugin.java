package com.ss.android.lark.passport.kar.web;

import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.larksuite.component.dybrid.h5api.api.AbstractC24158a;
import com.larksuite.component.dybrid.h5api.api.AbstractC24168k;
import com.larksuite.component.dybrid.h5api.api.AbstractC24169l;
import com.larksuite.component.dybrid.h5api.api.H5Event;
import com.larksuite.component.dybrid.h5core.p1076d.C24214b;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.http.p1953b.C38760a;
import com.ss.android.lark.passport.infra.base.architecture.C49032c;
import com.ss.android.lark.passport.infra.base.network.p2431a.C49069a;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.ka.C49298b;
import com.ss.android.lark.passport.ka.model.DecodedIdPLoginModel;
import com.ss.android.lark.passport.ka.p2452a.C49296c;
import com.ss.android.lark.passport.kar.KarLoadingActivity;
import com.ss.android.lark.passport.kar.model.KaConfig;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.utils.C57878s;
import com.ss.lark.android.passport.biz.compat.web.jsbridge.BaseJSModel;
import java.nio.charset.StandardCharsets;
import org.json.JSONException;

public class KarLoginPlugin implements AbstractC24169l {

    /* renamed from: a */
    private final PassportLog f123817a = PassportLog.f123351c.mo171474a();

    public static class SwitchModel extends BaseJSModel {
        @JSONField(name = "idp_type")
        public String idpType;
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: d */
    public void mo86749d() {
    }

    /* renamed from: com.ss.android.lark.passport.kar.web.KarLoginPlugin$a */
    private static class C49333a implements C49032c.AbstractC49036b {

        /* renamed from: a */
        private final AbstractC24168k f123822a;

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
            return this.f123822a.hashCode();
        }

        @Override // com.ss.android.lark.passport.infra.base.architecture.C49032c.AbstractC49036b
        /* renamed from: a */
        public void mo171206a() {
            AbstractC24168k kVar = this.f123822a;
            if (kVar != null) {
                kVar.mo86736a("h5PageClose", null);
            }
        }

        public C49333a(AbstractC24168k kVar) {
            this.f123822a = kVar;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C49333a) {
                return this.f123822a.equals(((C49333a) obj).f123822a);
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
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: a */
    public boolean mo86747a(H5Event h5Event) throws JSONException {
        String b = h5Event.mo86707b();
        if (!(h5Event.mo86711e() instanceof AbstractC24168k)) {
            return false;
        }
        AbstractC24168k kVar = (AbstractC24168k) h5Event.mo86711e();
        C49333a aVar = new C49333a(kVar);
        if ("h5PageClosed".equals(b)) {
            PassportLog passportLog = this.f123817a;
            passportLog.mo171461a("KarLoginPlugin", "H5_PAGE_CLOSED---->" + kVar.mo86759l().toString());
            C49032c.m193132a().mo171197b(aVar);
            return false;
        } else if (!"h5PageCreated".equals(b)) {
            return false;
        } else {
            PassportLog passportLog2 = this.f123817a;
            passportLog2.mo171461a("KarLoginPlugin", "H5_PAGE_CREATED---->" + kVar.mo86759l().toString());
            C49032c.m193132a().mo171192a(aVar);
            return false;
        }
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: b */
    public boolean mo86748b(final H5Event h5Event) throws JSONException {
        if (h5Event == null) {
            this.f123817a.mo171465b("KarLoginPlugin", "handleEvent is null");
            return false;
        }
        PassportLog passportLog = this.f123817a;
        passportLog.mo171465b("KarLoginPlugin", "handleEvent" + h5Event.mo86707b());
        String b = h5Event.mo86707b();
        b.hashCode();
        char c = 65535;
        switch (b.hashCode()) {
            case -1326514615:
                if (b.equals("biz.account.h5_login_result")) {
                    c = 0;
                    break;
                }
                break;
            case -1077803450:
                if (b.equals("biz.account.switch_idp")) {
                    c = 1;
                    break;
                }
                break;
            case -259200933:
                if (b.equals("biz.account.ka_info")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                String str = null;
                try {
                    str = new String(Base64.decode(h5Event.mo86710d().optString("idp_context"), 0), StandardCharsets.UTF_8);
                } catch (IllegalArgumentException e) {
                    this.f123817a.mo171462a("KarLoginPlugin", "handle login result, base64 decode failed", e);
                }
                DecodedIdPLoginModel decodedIdPLoginModel = (DecodedIdPLoginModel) C57878s.m224590a(str, DecodedIdPLoginModel.class);
                if (decodedIdPLoginModel == null) {
                    this.f123817a.mo171471d("KarLoginPlugin", "empty module");
                    break;
                } else {
                    KarLoadingActivity.m194285b(C24214b.m88460a(), decodedIdPLoginModel);
                    break;
                }
            case 1:
                PassportLog passportLog2 = this.f123817a;
                passportLog2.mo171465b("KarLoginPlugin", "OpenUrlJsHandler: " + h5Event.mo86710d().toString());
                SwitchModel switchModel = (SwitchModel) C38760a.m153056a(h5Event.mo86710d().toString(), SwitchModel.class);
                if (switchModel != null && !TextUtils.isEmpty(switchModel.idpType)) {
                    C49296c.m194232a().mo171909a(switchModel.idpType, new AbstractC49352d<String>() {
                        /* class com.ss.android.lark.passport.kar.web.KarLoginPlugin.C493322 */

                        @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
                        /* renamed from: a */
                        public void mo145178a(NetworkErrorResult networkErrorResult) {
                            LKUIToast.show(C24214b.m88460a(), C49069a.m193382a(C24214b.m88460a(), networkErrorResult));
                        }

                        /* renamed from: a */
                        public void mo145179a(String str) {
                            ServiceFinder.m193752g().onHostEnvClear(null);
                            C49298b.m194253a().mo171922a(C24214b.m88460a(), str, null, false);
                            C49298b.m194253a().mo171923b();
                        }
                    });
                    break;
                } else {
                    PassportLog passportLog3 = this.f123817a;
                    passportLog3.mo171471d("KarLoginPlugin", "error switch_idp params" + h5Event.mo86710d().toString());
                    break;
                }
                break;
            case 2:
                KaConfig kaConfig = (KaConfig) C49296c.m194232a().mo171905a(KaConfig.class);
                final org.json.JSONObject jSONObject = new org.json.JSONObject(kaConfig.ext);
                if (!(kaConfig == null || kaConfig.ext == null)) {
                    CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                        /* class com.ss.android.lark.passport.kar.web.KarLoginPlugin.RunnableC493311 */

                        public void run() {
                            h5Event.mo86708b(jSONObject);
                        }
                    });
                    break;
                }
        }
        return true;
    }
}
