package com.larksuite.component.openplatform.core.plugin.container.p1128a;

import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.tt.miniapp.manager.C66467o;
import com.tt.miniapp.p3298k.C66262a;
import com.tt.miniapp.p3324r.p3326b.AbstractC66715a;
import com.tt.miniapp.titlemenu.item.C66919c;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.AppInfoEntity;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.container.a.d */
public class C24647d extends AbstractC66715a {
    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: a */
    public String mo87633a() {
        return "isInUserFavoritesSync";
    }

    public C24647d() {
    }

    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: b */
    public String mo87634b() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        String c = m89724c();
        try {
            jSONObject2.put("isIn", c.contentEquals(""));
            jSONObject2.put("msg", c);
            jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONObject2);
            return mo232446a(jSONObject);
        } catch (JSONException e) {
            return mo232445a(e);
        }
    }

    /* renamed from: c */
    private String m89724c() {
        String str;
        if (!C66467o.m259788a(mo232455f()).f167780f) {
            str = "Client NOT login";
        } else {
            str = "";
        }
        AppInfoEntity appInfo = C67432a.m262319a(mo232455f()).getAppInfo();
        if (appInfo == null) {
            return "common env error";
        }
        if (appInfo.isBox()) {
            str = "box app not support";
        }
        String str2 = "favorites function offline";
        if (!C66262a.m259264b()) {
            str = str2;
        }
        if (C66262a.m259265c()) {
            str2 = str;
        }
        if (TextUtils.isEmpty(appInfo.appId)) {
            str2 = "get appId error";
        }
        if (!C66919c.m260966a(mo232455f())) {
            return "not added to favorites list";
        }
        return str2;
    }

    public C24647d(String str) {
        super(str);
    }
}
