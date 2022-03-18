package com.bytedance.ee.bear.document;

import com.bytedance.ee.bear.browser.BaseWebPlugin;
import com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import java.util.Map;

public class DocumentPlugin extends BaseWebPlugin<C6095s> implements AbstractC4952a {
    @Override // com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
    }

    public DocViewModel getDocViewModel() {
        return ((C6095s) getHost()).mo24598m();
    }

    /* access modifiers changed from: protected */
    public String getUrl() {
        DocViewModel docViewModel = getDocViewModel();
        if (docViewModel != null) {
            return docViewModel.getUrl();
        }
        C13479a.m54775e("DocumentPlugin", "getUrl: docViewModel is null");
        return "";
    }

    /* access modifiers changed from: protected */
    public String getDocumentTitle() {
        if (getDocViewModel() == null || getDocViewModel().getDocName() == null) {
            return null;
        }
        return getDocViewModel().getDocName().mo5927b();
    }

    public <T> AbstractC68307f<T> getServiceFlowable(Class<T> cls) {
        return ((C6095s) getHost()).mo24601p().mo41507b(cls);
    }
}
