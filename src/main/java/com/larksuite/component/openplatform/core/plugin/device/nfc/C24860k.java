package com.larksuite.component.openplatform.core.plugin.device.nfc;

import android.nfc.Tag;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import com.tt.refer.p3400a.p3401a.p3402a.C67706e;
import com.tt.refer.p3400a.p3411h.AbstractC67730a;
import com.tt.refer.p3400a.p3411h.AbstractC67732c;
import java.util.Collections;
import java.util.List;
import okio.ByteString;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ApiSupportType(apiName = {"nfcStartDiscovery"}, support = {AppType.GadgetAPP, AppType.WebAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.device.nfc.k */
public class C24860k extends AbstractC65797c {
    public C24860k() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("nfcStartDiscovery");
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        AbstractC67730a aVar = (AbstractC67730a) mo230473f().findServiceByInterface(AbstractC67730a.class);
        if (aVar == null) {
            AppBrandLogger.m52830i("NfcStartDiscoveryAsyncHandler", "nfc service is null");
            mo230493c("nfc service is null");
            return;
        }
        aVar.mo87908a(new AbstractC67732c() {
            /* class com.larksuite.component.openplatform.core.plugin.device.nfc.C24860k.C248611 */

            @Override // com.tt.refer.p3400a.p3411h.AbstractC67732c
            /* renamed from: a */
            public void mo87888a() {
                C24860k.this.mo230491b("start to listener nfc card");
            }

            @Override // com.tt.refer.p3400a.p3411h.AbstractC67732c
            /* renamed from: a */
            public void mo87890a(String str) {
                C24860k.this.mo230493c(str);
            }

            @Override // com.tt.refer.p3400a.p3411h.AbstractC67732c
            /* renamed from: a */
            public void mo87889a(Tag tag) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    JSONArray jSONArray = new JSONArray();
                    String str = null;
                    String[] techList = tag != null ? tag.getTechList() : null;
                    if (techList != null) {
                        for (int i = 0; i < techList.length; i++) {
                            if (!TextUtils.isEmpty(techList[i])) {
                                jSONArray.put(C24851e.m89990a(techList[i]));
                            }
                        }
                    }
                    jSONObject.put("techs", jSONArray);
                    byte[] id = tag != null ? tag.getId() : null;
                    if (id != null && id.length > 0) {
                        str = ByteString.of(id).base64();
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("key", "uid");
                    jSONObject2.put("base64", str);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put(jSONObject2);
                    jSONObject.put("__nativeBuffers__", jSONArray2);
                    jSONObject.put("messages", new JSONArray());
                    C24860k.this.mo230475h().mo235028a(C67706e.C67708a.m263377a("nfcFoundDevice", jSONObject).mo235009a());
                } catch (JSONException e) {
                    AppBrandLogger.m52829e("NfcStartDiscoveryAsyncHandler", "", e);
                }
            }
        });
    }

    public C24860k(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }
}
