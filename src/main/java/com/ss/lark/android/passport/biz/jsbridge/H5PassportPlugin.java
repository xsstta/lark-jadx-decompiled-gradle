package com.ss.lark.android.passport.biz.jsbridge;

import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.dybrid.h5api.api.AbstractC24158a;
import com.larksuite.component.dybrid.h5api.api.AbstractC24168k;
import com.larksuite.component.dybrid.h5api.api.AbstractC24169l;
import com.larksuite.component.dybrid.h5api.api.H5Event;
import com.ss.android.lark.http.p1953b.C38760a;
import com.ss.android.lark.passport.infra.base.architecture.C49032c;
import com.ss.android.lark.passport.infra.base.network.C49073c;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.AbstractC49128n;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49194j;
import com.ss.android.lark.passport.infra.util.storage.C49216a;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49392e;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.lark.android.passport.biz.compat.v2.http.base.BaseLoginHttpRequest;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONException;

public class H5PassportPlugin implements AbstractC24169l {

    /* renamed from: a */
    public final PassportLog f164068a = PassportLog.f123351c.mo171474a();

    public static class HeaderPassportToken implements Serializable {
        @JSONField(name = "X-Flow-Key")
        public String xFlowKey;
        @JSONField(name = "X-Passport-Token")
        public String xPassportToken;
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: d */
    public void mo86749d() {
    }

    /* renamed from: com.ss.lark.android.passport.biz.jsbridge.H5PassportPlugin$a */
    private static class C65151a implements C49032c.AbstractC49036b {

        /* renamed from: a */
        private final AbstractC24168k f164073a;

        @Override // com.ss.android.lark.passport.infra.base.architecture.C49032c.AbstractC49036b
        /* renamed from: b */
        public String mo171207b() {
            return "web_step";
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
            return this.f164073a.hashCode();
        }

        @Override // com.ss.android.lark.passport.infra.base.architecture.C49032c.AbstractC49036b
        /* renamed from: a */
        public void mo171206a() {
            AbstractC24168k kVar = this.f164073a;
            if (kVar != null) {
                kVar.mo86736a("h5PageClose", null);
            }
        }

        public C65151a(AbstractC24168k kVar) {
            this.f164073a = kVar;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C65151a) {
                return this.f164073a.equals(((C65151a) obj).f164073a);
            }
            return false;
        }
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24169l
    /* renamed from: a */
    public void mo86761a(AbstractC24158a aVar) {
        aVar.mo86723a("biz.passport.stateMachine");
        aVar.mo86723a("biz.account.appInfo");
        aVar.mo86723a("h5PageClosed");
        aVar.mo86723a("h5PageCreated");
        aVar.mo86723a("biz.account.unRegisterFinish");
        aVar.mo86723a("biz.account.unRegisterRedPacket");
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: b */
    public boolean mo86748b(final H5Event h5Event) throws JSONException {
        this.f164068a.mo171465b("n_action_handle_event", "start");
        if (h5Event == null) {
            this.f164068a.mo171471d("n_action_handle_event", "event is Null");
            return true;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action", h5Event.mo86707b());
        PassportLog passportLog = this.f164068a;
        passportLog.mo171467b("n_action_handle_event", "action:" + h5Event.mo86707b(), hashMap);
        if ("biz.passport.stateMachine".equals(h5Event.mo86707b())) {
            org.json.JSONObject optJSONObject = h5Event.mo86710d().optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            org.json.JSONObject optJSONObject2 = h5Event.mo86710d().optJSONObject("header");
            boolean optBoolean = h5Event.mo86710d().optBoolean("isNeedCloseNativePage", false);
            if (optJSONObject == null) {
                h5Event.mo86706a(H5Event.Error.INVALID_PARAM);
                this.f164068a.mo171471d("H5PassportPlugin", "H5PassportPlugin stateMachine param error");
                return true;
            }
            BaseStepData baseStepData = (BaseStepData) C38760a.m153056a(optJSONObject.toString(), BaseStepData.class);
            if (baseStepData == null) {
                h5Event.mo86706a(H5Event.Error.INVALID_PARAM);
                this.f164068a.mo171471d("H5PassportPlugin", "H5PassportPlugin stateMachine param json parse error");
                return true;
            }
            h5Event.mo86701a(new H5Event.AbstractC24157b(baseStepData, optJSONObject2, optBoolean) {
                /* class com.ss.lark.android.passport.biz.jsbridge.$$Lambda$H5PassportPlugin$QGXDImJSGwajZz2K5APQ_jIjdQ4 */
                public final /* synthetic */ BaseStepData f$1;
                public final /* synthetic */ org.json.JSONObject f$2;
                public final /* synthetic */ boolean f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                @Override // com.larksuite.component.dybrid.h5api.api.H5Event.AbstractC24157b
                public final void onCreated(Activity activity, boolean z) {
                    H5PassportPlugin.this.m255905a(this.f$1, this.f$2, this.f$3, activity, z);
                }
            });
            return true;
        } else if ("biz.account.appInfo".equals(h5Event.mo86707b())) {
            C49194j.m193951a(false, new AbstractC49392e() {
                /* class com.ss.lark.android.passport.biz.jsbridge.H5PassportPlugin.C651491 */

                @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49392e
                /* renamed from: b */
                public void mo171342b(String str) {
                    H5PassportPlugin.this.f164068a.mo171471d("openCreateTeam-getDeviceId", str);
                }

                @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49392e
                /* renamed from: a */
                public void mo171341a(String str) {
                    String a = C49073c.m193390a(str);
                    try {
                        h5Event.mo86708b(new org.json.JSONObject(a));
                        PassportLog passportLog = H5PassportPlugin.this.f164068a;
                        passportLog.mo171465b("H5PassportPlugin", "getAppInfo success: " + a);
                    } catch (Exception unused) {
                        H5PassportPlugin.this.f164068a.mo171471d("H5PassportPlugin", "BIZ_GET_APPINFO parse Json is error");
                        h5Event.mo86706a(H5Event.Error.UNKNOWN_ERROR);
                    }
                }
            });
            return true;
        } else if ("biz.account.unRegisterFinish".equals(h5Event.mo86707b())) {
            this.f164068a.mo171465b("n_action_jsb_unregister_finish", "start");
            if (h5Event.mo86711e() instanceof AbstractC24168k) {
                this.f164068a.mo171465b("n_action_jsb_unregister_finish", "node is H5Page");
                AbstractC24168k kVar = (AbstractC24168k) h5Event.mo86711e();
                C65151a aVar = new C65151a(kVar);
                PassportLog passportLog2 = this.f164068a;
                passportLog2.mo171461a("n_action_jsb_unregister_finish", "H5_PAGE_CLOSED---->" + kVar.mo86759l().toString());
                C49032c.m193132a().mo171197b(aVar);
            }
            final AbstractC49128n nVar = (AbstractC49128n) ServiceFinder.m193746a(AbstractC49128n.class);
            if (nVar != null) {
                h5Event.mo86701a(new H5Event.AbstractC24157b() {
                    /* class com.ss.lark.android.passport.biz.jsbridge.H5PassportPlugin.C651502 */

                    @Override // com.larksuite.component.dybrid.h5api.api.H5Event.AbstractC24157b
                    public void onCreated(Activity activity, boolean z) {
                        H5PassportPlugin.this.f164068a.mo171460a("n_action_switch_to_next_valid_user");
                        nVar.switchToNextValidUser(activity, 6, 0, null);
                    }
                });
            } else {
                this.f164068a.mo171464b("n_action_find_switch_user_service_null");
            }
            this.f164068a.mo171465b("n_action_jsb_unregister_finish", "end");
            return true;
        } else if ("biz.account.unRegisterRedPacket".equals(h5Event.mo86707b())) {
            this.f164068a.mo171465b("n_action_jsb_unregister_redpacket", "start");
            org.json.JSONObject optJSONObject3 = h5Event.mo86710d().optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (optJSONObject3 == null) {
                h5Event.mo86706a(H5Event.Error.INVALID_PARAM);
                this.f164068a.mo171464b("n_action_get_data_from_jsb_null");
                return true;
            }
            String string = optJSONObject3.getString("url");
            if (TextUtils.isEmpty(string)) {
                this.f164068a.mo171464b("n_action_get_url_from_jsb_null");
                return true;
            }
            PassportLog passportLog3 = this.f164068a;
            passportLog3.mo171465b("n_action_jsb_unregister_redpacket", "url: " + string);
            h5Event.mo86701a(new H5Event.AbstractC24157b(string) {
                /* class com.ss.lark.android.passport.biz.jsbridge.$$Lambda$H5PassportPlugin$nfutrggT1Qg8ZXg7AALrx2dS9dg */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.larksuite.component.dybrid.h5api.api.H5Event.AbstractC24157b
                public final void onCreated(Activity activity, boolean z) {
                    H5PassportPlugin.this.m255906a(this.f$1, activity, z);
                }
            });
            this.f164068a.mo171465b("n_action_jsb_unregister_redpacket", "end");
            return true;
        } else {
            this.f164068a.mo171465b("n_action_handle_event", "end");
            return false;
        }
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: a */
    public boolean mo86747a(H5Event h5Event) throws JSONException {
        String b = h5Event.mo86707b();
        if (!(h5Event.mo86711e() instanceof AbstractC24168k)) {
            return false;
        }
        AbstractC24168k kVar = (AbstractC24168k) h5Event.mo86711e();
        C65151a aVar = new C65151a(kVar);
        if ("h5PageClosed".equals(b)) {
            PassportLog passportLog = this.f164068a;
            passportLog.mo171461a("H5PassportPlugin", "H5_PAGE_CLOSED---->" + kVar.mo86759l().toString());
            C49032c.m193132a().mo171197b(aVar);
            return false;
        } else if (!"h5PageCreated".equals(b)) {
            return false;
        } else {
            PassportLog passportLog2 = this.f164068a;
            passportLog2.mo171461a("H5PassportPlugin", "H5_PAGE_CREATED---->" + kVar.mo86759l().toString());
            C49032c.m193132a().mo171192a(aVar);
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m255902a(int i, Object obj) {
        if (i == -106) {
            this.f164068a.mo171465b("H5PassportPlugin", "joinTeamEmail enterApp & afterLogin success");
            return;
        }
        PassportLog passportLog = this.f164068a;
        passportLog.mo171471d("H5PassportPlugin", "joinTeamEmail afterLogin error: code=" + i);
    }

    /* renamed from: a */
    private void m255904a(BaseStepData baseStepData, org.json.JSONObject jSONObject) {
        if (baseStepData == null || jSONObject == null) {
            this.f164068a.mo171465b("H5PassportPlugin", "HeaderInfo is null, or step is null");
            return;
        }
        HeaderPassportToken headerPassportToken = (HeaderPassportToken) C38760a.m153056a(jSONObject.toString(), HeaderPassportToken.class);
        if (headerPassportToken != null && !TextUtils.isEmpty(headerPassportToken.xPassportToken)) {
            this.f164068a.mo171465b("H5PassportPlugin", "updateXPassportToken");
            BaseLoginHttpRequest.updateXPassportToken(headerPassportToken.xPassportToken);
        }
        if (headerPassportToken != null && !TextUtils.isEmpty(headerPassportToken.xFlowKey)) {
            this.f164068a.mo171465b("H5PassportPlugin", "updateXPassportToken");
            C49216a.m194036a().mo171740a("X-Flow-Key", headerPassportToken.xFlowKey);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m255906a(String str, Activity activity, boolean z) {
        this.f164068a.mo171465b("n_action_open_money_h5page", "start");
        ServiceFinder.m193752g().openMoneyH5Page(activity, str);
    }

    /* renamed from: a */
    private void m255903a(Activity activity, BaseStepData baseStepData, org.json.JSONObject jSONObject, boolean z) {
        m255904a(baseStepData, jSONObject);
        if (z) {
            C49092f.m193528a(activity, baseStepData, RouterScene.ALL.value, (UniContext) null);
        } else {
            C49092f.m193527a(activity, baseStepData, RouterScene.ALL.value, this.f164068a, new AbstractC49336a() {
                /* class com.ss.lark.android.passport.biz.jsbridge.$$Lambda$H5PassportPlugin$XgQFU3PC8iLd5l_HqkGa1nDvIy4 */

                @Override // com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a
                public final void onRouterResult(int i, Object obj) {
                    H5PassportPlugin.this.m255902a((H5PassportPlugin) i, (int) obj);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m255905a(BaseStepData baseStepData, org.json.JSONObject jSONObject, boolean z, Activity activity, boolean z2) {
        m255903a(activity, baseStepData, jSONObject, z);
    }
}
