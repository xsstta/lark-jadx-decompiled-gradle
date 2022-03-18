package com.larksuite.component.openplatform.core.plugin.device.nfc;

import android.nfc.Tag;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.tt.refer.p3400a.p3401a.p3402a.C67706e;
import com.tt.refer.p3400a.p3411h.AbstractC67730a;
import com.tt.refer.p3400a.p3411h.AbstractC67732c;
import okio.ByteString;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class NfcStartDiscoveryAsyncPlugin extends OPPlugin {
    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    public void callbackFail(String str, AbstractC25897h<C25921b> hVar) {
        C25921b bVar = new C25921b();
        bVar.mErrorMessage = str;
        hVar.callback(bVar);
    }

    public void callbackOk(String str, LKEvent lKEvent) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("nfcSuccess", str);
            lKEvent.mo92127a(jSONObject);
        } catch (JSONException unused) {
            AppBrandLogger.m52829e("NfcStartDiscoveryAsyncPlugin", "put json string error, callback ok directly");
            lKEvent.mo92153t();
        }
    }

    @LKPluginFunction(async = true, eventName = {"nfcStartDiscovery"})
    public void nfcStartDiscovery(final LKEvent lKEvent, final AbstractC25897h<C25921b> hVar) {
        AbstractC67730a aVar = (AbstractC67730a) getAppContext().findServiceByInterface(AbstractC67730a.class);
        if (aVar == null) {
            AppBrandLogger.m52830i("NfcStartDiscoveryAsyncPlugin", "nfc service is null");
            callbackFail("nfc service is null", hVar);
            return;
        }
        aVar.mo87908a(new AbstractC67732c() {
            /* class com.larksuite.component.openplatform.core.plugin.device.nfc.NfcStartDiscoveryAsyncPlugin.C248451 */

            @Override // com.tt.refer.p3400a.p3411h.AbstractC67732c
            /* renamed from: a */
            public void mo87888a() {
                NfcStartDiscoveryAsyncPlugin.this.callbackOk("start to listener nfc card", lKEvent);
            }

            @Override // com.tt.refer.p3400a.p3411h.AbstractC67732c
            /* renamed from: a */
            public void mo87890a(String str) {
                NfcStartDiscoveryAsyncPlugin.this.callbackFail(str, hVar);
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
                    NfcStartDiscoveryAsyncPlugin.this.getApiDependency().mo235028a(C67706e.C67708a.m263377a("nfcFoundDevice", jSONObject).mo235009a());
                } catch (JSONException e) {
                    AppBrandLogger.m52829e("NfcStartDiscoveryAsyncPlugin", "", e);
                }
            }
        });
    }
}
