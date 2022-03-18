package com.larksuite.component.openplatform.core.plugin.infra.network;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.p622a.p626b.C12810b;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.ac.C65727a;
import com.tt.miniapp.ac.C65738c;
import com.tt.miniapp.p3324r.p3326b.AbstractC66715a;
import com.tt.miniapp.util.C67053q;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.network.m */
public class C24944m extends AbstractC66715a {
    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: a */
    public String mo87633a() {
        return "createSocketTask";
    }

    public C24944m() {
    }

    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: b */
    public String mo87634b() {
        C12810b a = C65738c.m257722a(this.f168426a);
        if (a == null || TextUtils.isEmpty(a.f34201a)) {
            return mo88030a(false, -1);
        }
        if (!C67053q.m261326a("socket", a.f34201a, mo232455f())) {
            return mo88030a(false, -1);
        }
        return mo88030a(true, C65727a.m257684a(mo232455f()).mo230330a(a));
    }

    public C24944m(String str) {
        super(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo88030a(boolean z, int i) {
        return mo88031a(z, i, "");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo88031a(boolean z, int i, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                jSONObject.put("socketTaskId", i);
                jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, mo232452b("createSocketTask", "ok"));
            } else if (!TextUtils.isEmpty(str)) {
                jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, mo232452b("createSocketTask", "fail, " + str));
            } else {
                jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, mo232452b("createSocketTask", "fail"));
            }
            return jSONObject.toString();
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "SyncMsgCtrl", e.getStackTrace());
            return "";
        }
    }
}
