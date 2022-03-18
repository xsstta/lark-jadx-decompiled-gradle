package com.tt.refer.common.pkg;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.refer.common.download.engine.model.DownloadRequest;
import com.tt.refer.common.download.engine.p3421c.AbstractC67762a;
import com.tt.refer.common.download.engine.p3423d.AbstractC67776d;

/* renamed from: com.tt.refer.common.pkg.o */
public class C67850o implements AbstractC67776d<DownloadRequest> {

    /* renamed from: a */
    private IAppContext f170907a;

    public C67850o(IAppContext iAppContext) {
        this.f170907a = iAppContext;
    }

    /* renamed from: a */
    public AbstractC67762a<DownloadRequest> mo235207a(DownloadRequest downloadRequest) {
        return new C67848n(downloadRequest, this.f170907a);
    }
}
