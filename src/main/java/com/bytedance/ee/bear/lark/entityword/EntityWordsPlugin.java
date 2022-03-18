package com.bytedance.ee.bear.lark.entityword;

import android.graphics.RectF;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.DocumentPluginV2;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.lark.p414b.AbstractC7992e;
import com.bytedance.ee.log.C13479a;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import java.util.Map;
import org.koin.java.KoinJavaComponent;

public class EntityWordsPlugin extends DocumentPluginV2 {
    public AbstractC7947h callBack;
    public IGetDataCallback<String> getDataCallback;

    /* renamed from: com.bytedance.ee.bear.lark.entityword.EntityWordsPlugin$a */
    private static class C8037a implements AbstractC7945d<Void> {
        private C8037a() {
        }

        /* renamed from: a */
        public void handle(Void r1, AbstractC7947h hVar) {
            C13479a.m54764b("EntityWordsPlugin", "DismissEntityWordsHandler  : ");
            ((AbstractC7992e) KoinJavaComponent.m268610a(AbstractC7992e.class)).mo30984a();
        }
    }

    /* renamed from: com.bytedance.ee.bear.lark.entityword.EntityWordsPlugin$b */
    private class C8038b implements AbstractC7945d<EntityWordsData> {
        private C8038b() {
        }

        /* renamed from: a */
        public void handle(EntityWordsData entityWordsData, AbstractC7947h hVar) {
            C13479a.m54764b("EntityWordsPlugin", "ShowEntityWordsHandler data : " + entityWordsData);
            EntityWordsPlugin.this.callBack = hVar;
            if (entityWordsData != null) {
                ((AbstractC7992e) KoinJavaComponent.m268610a(AbstractC7992e.class)).mo30985a(entityWordsData.getQuery(), null, entityWordsData.getAbbrId(), new RectF(), EntityWordsPlugin.this.getActivity().findViewById(16908290), null, entityWordsData.getClientArgs(), EntityWordsPlugin.this.getDataCallback);
            } else {
                C13479a.m54758a("EntityWordsPlugin", "ShowEntityWordsHandler data : null");
            }
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onAttachToHost(C4943e eVar) {
        super.onAttachToHost(eVar);
        this.getDataCallback = new IGetDataCallback<String>() {
            /* class com.bytedance.ee.bear.lark.entityword.EntityWordsPlugin.C80361 */

            /* renamed from: a */
            public void onSuccess(String str) {
                if (EntityWordsPlugin.this.callBack != null) {
                    EntityWordsPlugin.this.callBack.mo17188a(JSONObject.parseObject(str));
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C13479a.m54758a("EntityWordsPlugin", "IGetDataCallback onError : " + errorResult);
            }
        };
    }

    @Override // com.bytedance.ee.bear.document.DocumentPluginV2, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        map.put("biz.util.showEnterpriseTopic", new C8038b());
        map.put("biz.util.dismissEnterpriseTopic", new C8037a());
    }
}
