package com.bytedance.ee.bear.document.fail;

import com.bytedance.ee.bear.document.AbstractC5887o;
import com.bytedance.ee.bear.document.C6057p;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.log.C13479a;
import java.util.Map;

public class FailTipPlugin extends DocumentPlugin implements AbstractC7945d<FailEventData> {
    @Override // com.bytedance.ee.bear.document.DocumentPlugin, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        map.put("biz.util.failEvent", this);
    }

    public void handle(FailEventData failEventData, AbstractC7947h hVar) {
        C13479a.m54775e("FailTipPlugin", "fail" + failEventData);
        if (failEventData != null) {
            AbstractC5887o o = ((C6095s) getHost()).mo24600o();
            if (o instanceof C6057p) {
                ((C6057p) o).mo24475a(failEventData.result_code, (Throwable) null);
            }
        }
    }
}
