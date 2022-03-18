package com.larksuite.component.openplatform.core.plugin.infra.storage;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.storage.sp.base.AppBaseStorage;
import com.bytedance.ee.lark.infra.storage.sp.biz.AbstractC12910a;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.p3324r.p3326b.AbstractC66715a;
import com.tt.miniapp.util.C67070z;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.storage.f */
public class C24966f extends AbstractC66715a {
    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: a */
    public String mo87633a() {
        return "operateInternalStorageSync";
    }

    public C24966f() {
    }

    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: b */
    public String mo87634b() {
        try {
            JSONObject jSONObject = new JSONObject(this.f168426a);
            String optString = jSONObject.optString(ShareHitPoint.f121869d);
            AbstractC12910a aVar = (AbstractC12910a) mo232455f().findServiceByInterface(AbstractC12910a.class);
            if ("get".equalsIgnoreCase(optString)) {
                String optString2 = jSONObject.optString("key");
                if (TextUtils.isEmpty(optString2)) {
                    return mo232447a(false, "error params.key");
                }
                return m90224a(aVar.mo48687a(AppBaseStorage.StorageType.APP_ENGINE, optString2), aVar.mo48696b(AppBaseStorage.StorageType.APP_ENGINE, optString2));
            } else if ("set".equalsIgnoreCase(optString)) {
                String optString3 = jSONObject.optString("key");
                String optString4 = jSONObject.optString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                String optString5 = jSONObject.optString("dataType");
                if (TextUtils.isEmpty(optString3) || TextUtils.isEmpty(optString4) || TextUtils.isEmpty(optString5)) {
                    return mo232447a(false, "error params.");
                }
                try {
                    return mo232447a(aVar.mo48691a(AppBaseStorage.StorageType.APP_ENGINE, optString3, optString4, optString5), (String) null);
                } catch (IOException e) {
                    return mo232447a(false, e.getMessage());
                }
            } else if ("remove".equalsIgnoreCase(optString)) {
                String optString6 = jSONObject.optString("key");
                if (TextUtils.isEmpty(optString6)) {
                    return mo232447a(false, "error params.key");
                }
                return mo232447a(aVar.mo48701c(AppBaseStorage.StorageType.APP_ENGINE, optString6), (String) null);
            } else if ("clear".equalsIgnoreCase(optString)) {
                return mo232447a(aVar.mo48690a(AppBaseStorage.StorageType.APP_ENGINE), (String) null);
            } else {
                if (!"getInfo".equalsIgnoreCase(optString)) {
                    return mo232447a(false, "unknown params.type");
                }
                long a = C67070z.m261383a(aVar.mo48695b(AppBaseStorage.StorageType.APP_ENGINE), true);
                long a2 = C67070z.m261383a(aVar.mo48699c(AppBaseStorage.StorageType.APP_ENGINE), true);
                JSONArray d = aVar.mo48703d(AppBaseStorage.StorageType.APP_ENGINE);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("currentSize", a);
                jSONObject2.put("limitSize", a2);
                jSONObject2.put("keys", d);
                jSONObject2.put(ApiHandler.API_CALLBACK_ERRMSG, mo232452b(mo87633a(), "ok"));
                return jSONObject2.toString();
            }
        } catch (Throwable th) {
            AppBrandLogger.m52829e("ApiInternalStorage", th.getMessage(), Log.getStackTraceString(th));
            return mo232447a(false, "exp: " + th.getMessage());
        }
    }

    public C24966f(String str) {
        super(str);
    }

    /* renamed from: a */
    private String m90224a(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (str == null || str2 == null) {
            jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "");
            jSONObject.put("dataType", "String");
            jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, mo232452b("getStorageSync", "fail"));
        } else {
            jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, mo232452b("getStorageSync", "ok"));
            jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, str);
            jSONObject.put("dataType", str2);
        }
        return String.valueOf(jSONObject);
    }
}
