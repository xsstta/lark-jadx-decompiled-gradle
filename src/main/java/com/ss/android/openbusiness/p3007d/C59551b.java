package com.ss.android.openbusiness.p3007d;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.utils.C26246a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.openbusiness.C59480b;
import com.ss.android.openbusiness.OpbScene;
import com.ss.android.openbusiness.data.netdata.C59569a;
import com.ss.android.openbusiness.data.netdata.C59573e;
import com.ss.android.openbusiness.p3006c.C59541d;
import com.ss.android.openbusiness.p3006c.C59545e;
import com.ss.android.openbusiness.p3007d.AbstractC59555c;
import com.ss.android.openbusiness.p3007d.C59558d;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.openbusiness.d.b */
public class C59551b extends C59558d implements AbstractC59555c {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.openbusiness.d.b$b */
    public static class C59554b {

        /* renamed from: a */
        public static C59551b f147840a = new C59551b();
    }

    /* renamed from: a */
    public static C59551b m231043a() {
        return C59554b.f147840a;
    }

    /* renamed from: e */
    private JsonObject m231044e() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("locale", C59480b.m230865a().mo144875b());
        jsonObject.addProperty("larkVersion", C26246a.m94977a(C59480b.m230865a().mo144878d()));
        return jsonObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.openbusiness.d.b$a */
    public static class C59553a<D extends C59569a> implements C59558d.AbstractC59560a {

        /* renamed from: a */
        private AbstractC59555c.AbstractC59556a<D> f147838a;

        /* renamed from: b */
        private TypeToken<C59573e<D>> f147839b;

        public C59553a(AbstractC59555c.AbstractC59556a<D> aVar, TypeToken<C59573e<D>> typeToken) {
            this.f147838a = aVar;
            this.f147839b = typeToken;
        }

        @Override // com.ss.android.openbusiness.p3007d.C59558d.AbstractC59560a
        /* renamed from: a */
        public void mo202859a(ErrorResult errorResult, C59558d.C59561b bVar) {
            Log.m165383e("Opb_Api", "server error, " + errorResult.getDisplayMsg() + ", " + bVar.f147844b);
            this.f147838a.mo202803a(errorResult.getDisplayMsg());
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v5, resolved type: com.ss.android.openbusiness.d.c$a<D extends com.ss.android.openbusiness.data.netdata.a> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ss.android.openbusiness.p3007d.C59558d.AbstractC59560a
        /* renamed from: a */
        public void mo202858a(SendHttpResponse sendHttpResponse, C59558d.C59561b bVar) {
            String str = sendHttpResponse.json_body;
            Gson gson = new Gson();
            if (TextUtils.isEmpty(str)) {
                Log.m165383e("Opb_Api", "response empty, " + bVar.f147844b);
                this.f147838a.mo202803a("server response empty");
                return;
            }
            try {
                C59573e eVar = (C59573e) gson.fromJson(str, this.f147839b.getType());
                if (eVar.mo202980a().intValue() != 0) {
                    Log.m165383e("Opb_Api", "server error, " + eVar.mo202980a() + ", " + eVar.mo202981b() + "," + bVar.f147844b);
                    this.f147838a.mo202803a(eVar.mo202981b());
                    return;
                }
                Log.m165389i("Opb_Api", "request success");
                this.f147838a.mo202801a(eVar.mo202982c());
            } catch (Exception e) {
                Log.m165383e("Opb_Api", "exception error, " + e);
                this.f147838a.mo202803a(e.toString());
            }
        }
    }

    /* renamed from: a */
    public <D extends C59569a> void mo202932a(OpbScene opbScene, TypeToken<C59573e<D>> typeToken, AbstractC59555c.AbstractC59556a<D> aVar) {
        Log.m165389i("Opb_Api", "request external item list: " + opbScene);
        String jsonObject = m231044e().toString();
        String a = C59562e.m231064a().mo202938a(opbScene);
        m231057a(m231059c().mo55528a(a).mo55533c(jsonObject), a, new C59553a(aVar, typeToken));
    }

    /* renamed from: b */
    public <D extends C59569a> void mo202934b(OpbScene opbScene, TypeToken<C59573e<D>> typeToken, AbstractC59555c.AbstractC59556a<D> aVar) {
        Log.m165389i("Opb_Api", "request more item list: " + opbScene);
        String jsonObject = m231044e().toString();
        String b = C59562e.m231064a().mo202939b(opbScene);
        m231057a(m231059c().mo55528a(b).mo55533c(jsonObject), b, new C59553a(aVar, typeToken));
    }

    /* renamed from: a */
    public void mo202933a(final OpbScene opbScene, List<String> list, final AbstractC59555c.AbstractC59557b bVar) {
        String str;
        JsonObject e = m231044e();
        e.add("common_app_ids", new Gson().toJsonTree(list));
        if (opbScene == OpbScene.MESSAGE_ACTION) {
            str = "msg_action";
        } else {
            str = "plus_menu";
        }
        e.addProperty("scene", str);
        String c = C59562e.m231064a().mo202940c(opbScene);
        Log.m165389i("Opb_Api", "update user config, " + e);
        m231057a(m231059c().mo55528a(c).mo55533c(e.toString()), c, new C59558d.AbstractC59560a() {
            /* class com.ss.android.openbusiness.p3007d.C59551b.C595521 */

            @Override // com.ss.android.openbusiness.p3007d.C59558d.AbstractC59560a
            /* renamed from: a */
            public void mo202859a(ErrorResult errorResult, C59558d.C59561b bVar) {
                OPMonitorCode oPMonitorCode;
                Log.m165383e("Opb_Api", "update config result fail, " + errorResult.getDisplayMsg() + ", " + bVar.f147844b);
                if (opbScene == OpbScene.MESSAGE_ACTION) {
                    oPMonitorCode = C59545e.f147821h;
                } else {
                    oPMonitorCode = C59545e.f147830q;
                }
                C59541d.m231037a(oPMonitorCode).addCategoryValue("request_id", bVar.f147844b).flush();
                bVar.mo202936a(errorResult.getDisplayMsg());
            }

            @Override // com.ss.android.openbusiness.p3007d.C59558d.AbstractC59560a
            /* renamed from: a */
            public void mo202858a(SendHttpResponse sendHttpResponse, C59558d.C59561b bVar) {
                OPMonitorCode oPMonitorCode;
                OPMonitorCode oPMonitorCode2;
                OPMonitorCode oPMonitorCode3;
                String str = sendHttpResponse.json_body;
                Log.m165389i("Opb_Api", "update config result, " + str + ", " + bVar.f147844b);
                if (TextUtils.isEmpty(str)) {
                    bVar.mo202936a("server error");
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(sendHttpResponse.json_body);
                    if (jSONObject.optInt("code", -1) == 0) {
                        if (opbScene == OpbScene.MESSAGE_ACTION) {
                            oPMonitorCode3 = C59545e.f147820g;
                        } else {
                            oPMonitorCode3 = C59545e.f147829p;
                        }
                        C59541d.m231037a(oPMonitorCode3).flush();
                        bVar.mo202935a();
                        return;
                    }
                    if (opbScene == OpbScene.MESSAGE_ACTION) {
                        oPMonitorCode2 = C59545e.f147821h;
                    } else {
                        oPMonitorCode2 = C59545e.f147830q;
                    }
                    C59541d.m231037a(oPMonitorCode2).addCategoryValue("reqeust_id", bVar.f147844b).flush();
                    bVar.mo202936a(jSONObject.optString("msg"));
                } catch (JSONException e) {
                    Log.m165383e("Opb_Api", "json error" + e.getMessage());
                    if (opbScene == OpbScene.MESSAGE_ACTION) {
                        oPMonitorCode = C59545e.f147821h;
                    } else {
                        oPMonitorCode = C59545e.f147830q;
                    }
                    C59541d.m231037a(oPMonitorCode).addCategoryValue("reqeust_id", bVar.f147844b).flush();
                    bVar.mo202936a(e.toString());
                }
            }
        });
    }
}
