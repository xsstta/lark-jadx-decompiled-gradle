package com.tt.miniapp.settings.configs;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.google.gson.Gson;
import com.tt.miniapp.settings.v2.handler.C66782k;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class GadgetFGService implements IGadgetFgService {
    private IAppContext appContext;
    private Map<String, Boolean> featureMap = new ConcurrentHashMap();
    private JSONObject fgConfigJson = C66782k.m260640a().mo232692b();
    private Gson gson = new Gson();

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IBaseService
    public void release() {
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IBaseService
    public IAppContext getAppContext() {
        return this.appContext;
    }

    public GadgetFGService(IAppContext iAppContext) {
        this.appContext = iAppContext;
        AppBrandLogger.m52830i("GadgetFGService", "gadget fg config:", this.fgConfigJson);
    }

    @Override // com.tt.miniapp.settings.configs.IGadgetFgService
    public boolean getGadgetFG(String str, boolean z) {
        Boolean bool = this.featureMap.get(str);
        if (bool == null) {
            bool = Boolean.valueOf(z);
            JSONObject jSONObject = this.fgConfigJson;
            if (jSONObject != null) {
                try {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                    AppBrandLogger.m52830i("GadgetFGService", "gadget fg:", str, jSONObject2.toString());
                    bool = Boolean.valueOf(((GadgetFGFilter) this.gson.fromJson(jSONObject2.toString(), GadgetFGFilter.class)).isEnable(this.appContext, z));
                } catch (JSONException e) {
                    AppBrandLogger.m52829e("GadgetFGService", "JSON exception", e);
                } catch (Exception e2) {
                    AppBrandLogger.m52829e("GadgetFGService", "parse json str to object error", e2);
                }
            }
            this.featureMap.put(str, bool);
        }
        AppBrandLogger.m52830i("GadgetFGService", "gadget fg, key:", str, "value:", bool);
        return bool.booleanValue();
    }
}
