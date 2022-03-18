package com.tt.refer.common.pkg;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.refer.common.download.engine.model.DownloadRequest;
import com.tt.refer.common.download.engine.p3421c.AbstractC67762a;
import com.tt.refer.common.download.engine.p3423d.AbstractC67776d;

/* renamed from: com.tt.refer.common.pkg.l */
public class C67844l implements AbstractC67776d<DownloadRequest> {

    /* renamed from: a */
    private IAppContext f170898a;

    public C67844l(IAppContext iAppContext) {
        this.f170898a = iAppContext;
    }

    /* renamed from: a */
    public AbstractC67762a<DownloadRequest> mo235207a(DownloadRequest downloadRequest) {
        return new C67845m(downloadRequest, this.f170898a);
    }
}
