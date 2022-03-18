package com.larksuite.component.openplatform.core.plugin.op;

import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.entity.LKPluginHandleResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25896g;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class ApiGetExtConfigPlugin extends OPPlugin {
    @Override // com.larksuite.framework.apiplugin.AbstractC25889a, com.larksuite.framework.apiplugin.AbstractC25937e
    public void addEvents(AbstractC25896g gVar) {
        super.addEvents(gVar);
        gVar.mo92192a("getExtConfigSync");
        gVar.mo92192a("getExtConfig");
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25889a, com.larksuite.framework.apiplugin.AbstractC25937e, com.larksuite.framework.apiplugin.p1175a.AbstractC25899j
    public LKPluginHandleResult handleEvent(LKEvent lKEvent) {
        LKPluginHandleResult handleEvent = super.handleEvent(lKEvent);
        String m = lKEvent.mo92146m();
        JSONObject jSONObject = new JSONObject();
        HashMap<String, Object> a = C25408l.m90921a(getAppContext());
        for (String str : a.keySet()) {
            try {
                jSONObject.put(str, a.get(str));
            } catch (JSONException e) {
                lKEvent.mo92134c().mo92190b().mo92223e("getExtConfig fail:", e);
            }
        }
        if ("getExtConfigSync".equals(m)) {
            return lKEvent.mo92131b(jSONObject);
        }
        if ("getExtConfig".equals(m)) {
            lKEvent.mo92132b((Object) jSONObject);
        }
        return handleEvent;
    }
}
