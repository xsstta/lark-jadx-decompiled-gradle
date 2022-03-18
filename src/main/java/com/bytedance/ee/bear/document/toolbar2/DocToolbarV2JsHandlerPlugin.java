package com.bytedance.ee.bear.document.toolbar2;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.DocumentPluginV2;
import com.bytedance.ee.bear.document.model.toolbar.ToolbarV2;
import com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7644k;
import com.bytedance.ee.bear.edit.component.toolbar2.ToolBarV2Type;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.ReflectUtils;
import java.util.ArrayList;
import java.util.List;

public class DocToolbarV2JsHandlerPlugin extends DocumentPluginV2 {
    public final List<AbstractC7644k<? extends ToolbarV2>> jsHandlers = new ArrayList();

    /* renamed from: com.bytedance.ee.bear.document.toolbar2.DocToolbarV2JsHandlerPlugin$a */
    private class C6276a implements AbstractC7945d<JSONObject> {
        private C6276a() {
        }

        /* renamed from: a */
        public void handle(JSONObject jSONObject, AbstractC7947h hVar) {
            C13479a.m54764b("DocToolbarV2JsHandlerPlugin", "[ToolbarV2]=" + jSONObject);
            if (!(DocToolbarV2JsHandlerPlugin.this.jsHandlers == null || DocToolbarV2JsHandlerPlugin.this.jsHandlers.size() == 0)) {
                for (AbstractC7644k<? extends ToolbarV2> kVar : DocToolbarV2JsHandlerPlugin.this.jsHandlers) {
                    if (jSONObject == null || jSONObject.isEmpty()) {
                        for (AbstractC7644k<? extends ToolbarV2> kVar2 : DocToolbarV2JsHandlerPlugin.this.jsHandlers) {
                            if (kVar2 != kVar) {
                                C13479a.m54764b("DocToolbarV2JsHandlerPlugin", "all hide " + ToolBarV2Type.getName(kVar2.getType()) + " toolbar ");
                                kVar2.handle(null, hVar);
                                C10548d.m43696a(DocToolbarV2JsHandlerPlugin.this.getContext());
                            }
                        }
                    } else {
                        Class a = ReflectUtils.m55227a(kVar);
                        if (a == null) {
                            a = ReflectUtils.m55228b(kVar);
                        }
                        try {
                            Object parseObject = JSON.parseObject(jSONObject.toString(), a);
                            if ((parseObject instanceof ToolbarV2) && ((ToolbarV2) parseObject).getType() == kVar.getType()) {
                                for (AbstractC7644k<? extends ToolbarV2> kVar3 : DocToolbarV2JsHandlerPlugin.this.jsHandlers) {
                                    if (kVar3 != kVar) {
                                        C13479a.m54764b("DocToolbarV2JsHandlerPlugin", "hide " + ToolBarV2Type.getName(kVar3.getType()) + " toolbar ");
                                        kVar3.handle(null, hVar);
                                    }
                                }
                                kVar.handle(parseObject, hVar);
                            }
                        } catch (Throwable th) {
                            C13479a.m54758a("DocToolbarV2JsHandlerPlugin", "ToolbarJsHandler PARSE_DATA_ERR  data： " + jSONObject + "    clazz： " + a + "  e: " + th);
                        }
                    }
                }
            }
        }
    }

    public void unRegisterHandler(AbstractC7644k<? extends ToolbarV2> kVar) {
        if (this.jsHandlers.contains(kVar)) {
            this.jsHandlers.remove(kVar);
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onAttachToHost(C4943e eVar) {
        super.onAttachToHost(eVar);
        getBridge().mo19349a("biz.navigation.setDocToolbarV2", new C6276a());
    }

    public void registerHandler(AbstractC7644k<? extends ToolbarV2> kVar) {
        if (this.jsHandlers.contains(kVar)) {
            this.jsHandlers.remove(kVar);
        }
        this.jsHandlers.add(kVar);
    }
}
