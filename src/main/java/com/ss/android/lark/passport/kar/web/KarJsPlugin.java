package com.ss.android.lark.passport.kar.web;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.larksuite.component.dybrid.h5api.api.AbstractC24158a;
import com.larksuite.component.dybrid.h5api.api.AbstractC24168k;
import com.larksuite.component.dybrid.h5api.api.AbstractC24169l;
import com.larksuite.component.dybrid.h5api.api.H5Event;
import com.larksuite.component.dybrid.h5core.p1076d.C24214b;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.http.p1953b.C38760a;
import com.ss.android.lark.passport.infra.base.architecture.C49032c;
import com.ss.android.lark.passport.infra.base.statistics.C49096b;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.util.C49185d;
import com.ss.android.lark.passport.infra.util.C49194j;
import com.ss.android.lark.passport.ka.C49298b;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49392e;
import com.ss.lark.android.passport.biz.compat.web.jsbridge.BaseJSModel;
import org.json.JSONException;

public class KarJsPlugin implements AbstractC24169l {

    /* renamed from: a */
    public final PassportLog f123811a = PassportLog.f123351c.mo171474a();

    public static class LogModel extends BaseJSModel {
        public String level;
        public String msg;
    }

    public static class OpenUrlModel extends BaseJSModel {
        public String url;
    }

    public static class TeaModel extends BaseJSModel {
        @JSONField(name = "tea_key")
        public String teaKey;
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: d */
    public void mo86749d() {
    }

    /* renamed from: com.ss.android.lark.passport.kar.web.KarJsPlugin$a */
    private static class C49329a implements C49032c.AbstractC49036b {

        /* renamed from: a */
        private final AbstractC24168k f123816a;

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
            return this.f123816a.hashCode();
        }

        @Override // com.ss.android.lark.passport.infra.base.architecture.C49032c.AbstractC49036b
        /* renamed from: a */
        public void mo171206a() {
            AbstractC24168k kVar = this.f123816a;
            if (kVar != null) {
                kVar.mo86736a("h5PageClose", null);
            }
        }

        public C49329a(AbstractC24168k kVar) {
            this.f123816a = kVar;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C49329a) {
                return this.f123816a.equals(((C49329a) obj).f123816a);
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.lark.passport.kar.web.KarJsPlugin$b */
    private class C49330b extends BaseJSModel {
        public String appVersion;
        public String deviceID;
        public String model;
        public float pixelRatio;
        public String platform;
        public String system;

        private C49330b() {
        }
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24169l
    /* renamed from: a */
    public void mo86761a(AbstractC24158a aVar) {
        aVar.mo86723a("biz.account.openLink");
        aVar.mo86723a("biz.account.log");
        aVar.mo86723a("biz.account.teaStastics");
        aVar.mo86723a("biz.account.teaStatisticsError");
        aVar.mo86723a("device.base.getSystemInfo");
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
        C49329a aVar = new C49329a(kVar);
        if ("h5PageClosed".equals(b)) {
            PassportLog passportLog = this.f123811a;
            passportLog.mo171461a("KarJsPlugin", "H5_PAGE_CLOSED---->" + kVar.mo86759l().toString());
            C49032c.m193132a().mo171197b(aVar);
            return false;
        } else if (!"h5PageCreated".equals(b)) {
            return false;
        } else {
            PassportLog passportLog2 = this.f123811a;
            passportLog2.mo171461a("KarJsPlugin", "H5_PAGE_CREATED---->" + kVar.mo86759l().toString());
            C49032c.m193132a().mo171192a(aVar);
            return false;
        }
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: b */
    public boolean mo86748b(final H5Event h5Event) throws JSONException {
        this.f123811a.mo171465b("KarJsPlugin", "handleEvent event.getAction()");
        if (h5Event == null) {
            this.f123811a.mo171465b("KarJsPlugin", "handleEvent is null");
            return false;
        }
        String b = h5Event.mo86707b();
        b.hashCode();
        char c = 65535;
        switch (b.hashCode()) {
            case -460951680:
                if (b.equals("biz.account.openLink")) {
                    c = 0;
                    break;
                }
                break;
            case -393967186:
                if (b.equals("device.base.getSystemInfo")) {
                    c = 1;
                    break;
                }
                break;
            case 261467025:
                if (b.equals("biz.account.teaStatisticsError")) {
                    c = 2;
                    break;
                }
                break;
            case 310782732:
                if (b.equals("biz.account.teaStastics")) {
                    c = 3;
                    break;
                }
                break;
            case 1239574440:
                if (b.equals("biz.account.log")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                PassportLog passportLog = this.f123811a;
                passportLog.mo171465b("KarJsPlugin", "OpenUrlJsHandler: " + h5Event.mo86710d());
                OpenUrlModel openUrlModel = (OpenUrlModel) C38760a.m153056a(h5Event.mo86710d().toString(), OpenUrlModel.class);
                if (C24214b.m88460a() != null && openUrlModel != null) {
                    C49298b.m194253a().mo171922a(C24214b.m88460a(), openUrlModel.url, null, false);
                    break;
                } else {
                    PassportLog passportLog2 = this.f123811a;
                    passportLog2.mo171471d("KarJsPlugin", "openLink error params=" + h5Event.mo86710d().toString());
                    break;
                }
            case 1:
                PassportLog passportLog3 = this.f123811a;
                passportLog3.mo171465b("KarJsPlugin", "GetSystemInfoJsHandler: " + h5Event.mo86710d().toString());
                C49194j.m193951a(true, new AbstractC49392e() {
                    /* class com.ss.android.lark.passport.kar.web.KarJsPlugin.C493271 */

                    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49392e
                    /* renamed from: b */
                    public void mo171342b(String str) {
                        PassportLog passportLog = KarJsPlugin.this.f123811a;
                        passportLog.mo171471d("KarJsPlugin", "GetSystemInfoJsHandler error: " + str);
                    }

                    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49392e
                    /* renamed from: a */
                    public void mo171341a(String str) {
                        C49330b bVar = new C49330b();
                        bVar.system = C49185d.m193927b();
                        bVar.appVersion = C49185d.m193926a(C24214b.m88460a());
                        bVar.platform = "android";
                        bVar.model = C49185d.m193925a();
                        bVar.pixelRatio = C49185d.m193929c(C24214b.m88460a());
                        bVar.deviceID = str;
                        PassportLog passportLog = KarJsPlugin.this.f123811a;
                        passportLog.mo171465b("KarJsPlugin", "GetSystemInfoJsHandler: encrypt deviceId=" + str);
                        try {
                            final org.json.JSONObject jSONObject = new org.json.JSONObject(C38760a.m153057a(bVar));
                            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                                /* class com.ss.android.lark.passport.kar.web.KarJsPlugin.C493271.RunnableC493281 */

                                public void run() {
                                    h5Event.mo86708b(jSONObject);
                                }
                            });
                        } catch (Exception e) {
                            PassportLog passportLog2 = KarJsPlugin.this.f123811a;
                            passportLog2.mo171471d("KarJsPlugin", "GetSystemInfoJsHandler parse error: " + e.getMessage());
                        }
                    }
                });
                break;
            case 2:
                PassportLog passportLog4 = this.f123811a;
                passportLog4.mo171465b("KarJsPlugin", "TeaStatisticsErrorJsHandler:" + h5Event.mo86710d().toString());
                TeaModel teaModel = (TeaModel) C38760a.m153056a(h5Event.mo86710d().toString(), TeaModel.class);
                if (teaModel != null && !TextUtils.isEmpty(teaModel.teaKey)) {
                    C49096b.m193575a(teaModel.teaKey);
                    break;
                }
            case 3:
                PassportLog passportLog5 = this.f123811a;
                passportLog5.mo171465b("KarJsPlugin", "TeaStatisticsJsHandler:" + h5Event.mo86710d().toString());
                TeaModel teaModel2 = (TeaModel) C38760a.m153056a(h5Event.mo86710d().toString(), TeaModel.class);
                if (teaModel2 != null && !TextUtils.isEmpty(teaModel2.teaKey)) {
                    C49096b.m193585c(teaModel2.teaKey);
                    C49096b.m193581b(teaModel2.teaKey);
                    break;
                }
            case 4:
                LogModel logModel = (LogModel) C38760a.m153056a(h5Event.mo86710d().toString(), LogModel.class);
                if (logModel != null) {
                    this.f123811a.mo171473e(logModel.level, logModel.msg);
                    break;
                }
                break;
        }
        return true;
    }
}
