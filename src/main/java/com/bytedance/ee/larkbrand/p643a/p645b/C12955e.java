package com.bytedance.ee.larkbrand.p643a.p645b;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.p649d.C12988a;
import com.ss.android.lark.littleapp.C41397o;
import com.tt.miniapp.settings.v2.handler.C66767d;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.a.b.e */
public class C12955e {

    /* renamed from: a */
    private boolean f34508a;

    /* renamed from: b */
    private HashMap<String, Boolean> f34509b;

    /* renamed from: c */
    private IAppContext f34510c;

    /* renamed from: a */
    private void m53357a() {
        this.f34508a = false;
        this.f34509b = new HashMap<>();
        String a = C66767d.m260606a().mo232673a("default");
        AppBrandLogger.m52828d("SafeDomainChecker", "SafeDomainChecker checkDomainData: " + a);
        if (!TextUtils.isEmpty(a) && !TextUtils.equals(a, "default")) {
            try {
                JSONObject jSONObject = new JSONObject(a);
                this.f34508a = jSONObject.optBoolean("default");
                JSONObject optJSONObject = jSONObject.optJSONObject("appIDs");
                if (optJSONObject != null) {
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        this.f34509b.put(next, Boolean.valueOf(optJSONObject.optBoolean(next)));
                    }
                }
                AppBrandLogger.m52828d("SafeDomainChecker", "SafeDomainChecker setCheckDomainData: default = " + this.f34508a + " appIds = " + this.f34509b.toString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public C12955e(IAppContext iAppContext) {
        this.f34510c = iAppContext;
    }

    /* renamed from: a */
    public static C12955e m53356a(IAppContext iAppContext) {
        return C12988a.m53439a(iAppContext).mo48908d();
    }

    /* renamed from: a */
    public boolean mo48856a(String str, String str2, String str3) {
        if (!"schema_host".equals(str2)) {
            if (this.f34509b == null) {
                m53357a();
            }
            if (this.f34509b.containsKey(str)) {
                return this.f34509b.get(str).booleanValue();
            }
            return this.f34508a;
        } else if (str3 == null) {
            return true;
        } else {
            if (!"microapp".equals(Uri.parse(str3).getHost()) && !LarkExtensionManager.getInstance().getExtension().mo49612g(str3)) {
                return !C41397o.m164169a(str, str3, this.f34510c);
            }
            return false;
        }
    }
}
