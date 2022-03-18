package com.lark.falcon.engine.inspect;

import com.huawei.hms.location.LocationRequest;
import com.lark.falcon.engine.common.C23971a;
import com.lark.falcon.engine.inspect.p1062a.C24010d;
import com.lark.falcon.engine.inspect.p1062a.p1063a.AbstractC23981c;
import com.lark.falcon.engine.inspect.p1062a.p1063a.AbstractC23982d;
import com.lark.falcon.engine.inspect.p1062a.p1063a.C23979a;
import com.lark.falcon.engine.inspect.p1062a.p1063a.C23980b;
import com.lark.falcon.engine.inspect.p1062a.p1063a.C23985f;
import com.lark.falcon.engine.inspect.p1062a.p1063a.C23986g;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.lark.falcon.engine.inspect.b */
public class C24011b implements AbstractC23981c {

    /* renamed from: a */
    private AbstractC23982d f59384a;

    /* renamed from: b */
    private final List<InspectorClient> f59385b = new ArrayList();

    /* renamed from: b */
    public void mo86183b(InspectorClient inspectorClient) {
        synchronized (this.f59385b) {
            this.f59385b.remove(inspectorClient);
        }
    }

    /* renamed from: a */
    public void mo86181a(InspectorClient inspectorClient) {
        synchronized (this.f59385b) {
            if (!this.f59385b.contains(inspectorClient)) {
                this.f59385b.add(inspectorClient);
            }
        }
    }

    /* renamed from: a */
    private void m87775a(C23986g gVar) throws JSONException {
        if (this.f59384a == null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Browser", "JsEngine Debugger");
            jSONObject.put("Protocol-Version", "1.3");
            jSONObject.put("Android-Package", C23971a.m87624a());
            jSONObject.put("V8-Version", "7.2.1");
            this.f59384a = AbstractC23982d.m87686a(jSONObject.toString(), "application/json");
        }
        m87776a(gVar, this.f59384a);
    }

    /* renamed from: a */
    public void mo86182a(C23980b bVar) {
        bVar.mo86138a(new C23979a("/json"), this);
        bVar.mo86138a(new C23979a("/json/version"), this);
    }

    /* renamed from: b */
    private void m87777b(C23986g gVar) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.f59385b) {
            for (int i = 0; i < this.f59385b.size(); i++) {
                InspectorClient inspectorClient = this.f59385b.get(i);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ShareHitPoint.f121869d, "page");
                jSONObject.put("title", inspectorClient.mo86110a());
                jSONObject.put("id", "" + i);
                jSONObject.put("description", "");
                jSONObject.put("webSocketDebuggerUrl", "ws://" + inspectorClient.mo86114b());
                jSONObject.put("devtoolsFrontendUrl", "/devtools/inspector.html?ws=" + inspectorClient.mo86114b());
                jSONArray.put(jSONObject);
            }
        }
        m87776a(gVar, AbstractC23982d.m87686a(jSONArray.toString(), "application/json"));
    }

    /* renamed from: a */
    private static void m87776a(C23986g gVar, AbstractC23982d dVar) {
        gVar.f59339c = LocationRequest.PRIORITY_HD_ACCURACY;
        gVar.f59340d = "OK";
        gVar.f59341e = dVar;
    }

    @Override // com.lark.falcon.engine.inspect.p1062a.p1063a.AbstractC23981c
    /* renamed from: a */
    public boolean mo86140a(C24010d dVar, C23985f fVar, C23986g gVar) throws IOException {
        String path = fVar.f59337d.getPath();
        try {
            if ("/json/version".equals(path)) {
                m87775a(gVar);
                return true;
            } else if ("/json".equals(path)) {
                m87777b(gVar);
                return true;
            } else {
                gVar.f59339c = 501;
                gVar.f59340d = "Not implemented";
                gVar.f59341e = AbstractC23982d.m87686a("No support for " + path + "\n", "text/plain");
                return true;
            }
        } catch (JSONException e) {
            gVar.f59339c = ParticipantRepo.f117150c;
            gVar.f59340d = "Internal server error";
            gVar.f59341e = AbstractC23982d.m87686a(e.toString() + "\n", "text/plain");
            return true;
        }
    }
}
