package com.bytedance.ee.bear.document.offline.create;

import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.functions.Consumer;
import java.io.Serializable;
import org.koin.java.KoinJavaComponent;

public class GetCreatedDocHandler implements AbstractC7945d<OfflineJSData> {

    /* renamed from: a */
    private C10917c f16562a;

    /* renamed from: b */
    private AbstractC7947h f16563b;

    public static class OfflineJSData implements Serializable {
        private String fakeToken;

        public String getFakeToken() {
            return this.fakeToken;
        }

        public String toString() {
            return "OfflineJSData{fakeToken='" + this.fakeToken + '\'' + '}';
        }

        public void setFakeToken(String str) {
            this.fakeToken = str;
        }
    }

    public GetCreatedDocHandler(C10917c cVar) {
        this.f16562a = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m23811a(OfflineDoc offlineDoc) throws Exception {
        AbstractC7947h hVar = this.f16563b;
        if (hVar != null) {
            hVar.mo17189a(offlineDoc);
            C13479a.m54764b("GetCreatedDocHandler", "GetCreatedDocHandler.accept: 47 " + JSON.toJSONString(offlineDoc));
            return;
        }
        C13479a.m54764b("GetCreatedDocHandler", "GetCreatedDocHandler.accept: 48 ");
    }

    /* renamed from: a */
    public void handle(OfflineJSData offlineJSData, AbstractC7947h hVar) {
        C13479a.m54764b("GetCreatedDocHandler", "GetCreatedDocHandler.handle: 35 ");
        this.f16563b = hVar;
        if (this.f16562a == null) {
            C13479a.m54764b("GetCreatedDocHandler", "GetCreatedDocHandler.handle: mServiceContext is null");
        } else {
            ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31487a(offlineJSData.getFakeToken()).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
                /* class com.bytedance.ee.bear.document.offline.create.$$Lambda$GetCreatedDocHandler$rOjBYbcXAYQexCpU_tVEjtdG8yw */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    GetCreatedDocHandler.this.m23811a((GetCreatedDocHandler) ((OfflineDoc) obj));
                }
            }, $$Lambda$GetCreatedDocHandler$c73Udb1Rxi9h7uvkdbr1n7mmds.INSTANCE);
        }
    }
}
