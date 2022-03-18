package com.tt.miniapp.settings.v2.handler;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.AbstractC12790g;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.settings.v2.handler.aa */
public class C66757aa extends AbstractC12744b {

    /* renamed from: b */
    private static final AbstractC12790g<C66757aa> f168509b = new AbstractC12790g<C66757aa>() {
        /* class com.tt.miniapp.settings.v2.handler.C66757aa.C667581 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C66757aa mo48227b(Context... contextArr) {
            return new C66757aa();
        }
    };

    /* renamed from: a */
    private JSONObject f168510a;

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public String getSettingKey() {
        return "openplatform_gadget_v8port";
    }

    /* renamed from: a */
    public static C66757aa m260586a() {
        return f168509b.mo48348c(new Context[0]);
    }

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public void saveSettingFromRemote(String str) {
        C12782a.m52834a("openplatform_gadget_v8port", str);
    }

    /* renamed from: a */
    public Boolean mo232663a(String str) {
        if (str == null) {
            return null;
        }
        if (this.f168510a == null) {
            String settingFromLocal = getSettingFromLocal("openplatform_gadget_v8port", "");
            if (TextUtils.isEmpty(settingFromLocal)) {
                return null;
            }
            try {
                this.f168510a = new JSONObject(settingFromLocal);
            } catch (JSONException e) {
                AppBrandLogger.m52829e("V8PortSettingHandler", e);
            }
        }
        JSONObject jSONObject = this.f168510a;
        if (jSONObject == null) {
            return null;
        }
        if (jSONObject.optBoolean("forceAll", false)) {
            return true;
        }
        try {
            JSONObject jSONObject2 = this.f168510a.getJSONObject("apps");
            if (!jSONObject2.has(str)) {
                return null;
            }
            return Boolean.valueOf(jSONObject2.getBoolean(str));
        } catch (JSONException e2) {
            AppBrandLogger.m52829e("V8PortSettingHandler", "getResult form apps", e2);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b
    public String loadConfig(String str, String str2) {
        return C12782a.m52838b(str, str2);
    }
}
