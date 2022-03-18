package com.bytedance.ee.bear.document.offline.file.upload;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.document.offline.file.p319a.C5937c;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5955d;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.document.offline.file.upload.a */
public class C5944a implements AbstractC7945d<CancelUploadModel> {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Integer m23970a(String str) throws Exception {
        C5937c d = C5955d.m24025b().mo24097d(str);
        int a = ((AbstractC9349a) KoinJavaComponent.m268610a(AbstractC9349a.class)).mo35617a(new String[]{d.mo23969h()});
        C13479a.m54764b("CancelUploadHandler", "cancel upload result: " + a);
        C5955d.m24025b().mo24101f(d.mo23957b());
        return Integer.valueOf(a);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m23971a(AbstractC7947h hVar, Integer num) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", (Object) num);
        hVar.mo17188a(jSONObject);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m23972a(AbstractC7947h hVar, Throwable th) throws Exception {
        C13479a.m54759a("CancelUploadHandler", "cancel upload fail", th);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", (Object) -1);
        jSONObject.put("message", (Object) th.getMessage());
        hVar.mo17188a(jSONObject);
    }

    /* renamed from: a */
    public void handle(CancelUploadModel cancelUploadModel, AbstractC7947h hVar) {
        AbstractC68307f.m265083a(cancelUploadModel.getFileUrl()).mo237985a(C11678b.m48477a()).mo238020d($$Lambda$a$UpkhJdhTyA6KCJFvtTy9oGwoHnM.INSTANCE).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.document.offline.file.upload.$$Lambda$a$TzVJRGpJ__VV2zvJJmkhFmyeL7A */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5944a.m23971a(AbstractC7947h.this, (Integer) obj);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.document.offline.file.upload.$$Lambda$a$0h7DEMXK4IM8whVUfaF3uhhA_0k */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5944a.m23972a(AbstractC7947h.this, (Throwable) obj);
            }
        });
    }
}
