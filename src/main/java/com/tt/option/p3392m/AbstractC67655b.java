package com.tt.option.p3392m;

import com.bytedance.ee.lark.infra.network.p628c.p629a.C12824b;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12825c;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12827e;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12830f;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;

/* renamed from: com.tt.option.m.b */
public interface AbstractC67655b {

    /* renamed from: com.tt.option.m.b$a */
    public interface AbstractC67656a {
        /* renamed from: a */
        void mo49677a(int i, long j, long j2);
    }

    C12827e convertMetaRequest(C12827e eVar);

    C12830f doGet(C12827e eVar, IAppContext iAppContext) throws Exception;

    C12830f doPostBody(C12827e eVar, IAppContext iAppContext) throws Exception;

    C12830f doPostUrlEncoded(C12827e eVar, IAppContext iAppContext) throws Exception;

    C12830f doRequest(C12827e eVar, IAppContext iAppContext) throws Exception;

    C12825c downloadFile(C12824b bVar, AbstractC67656a aVar, IAppContext iAppContext) throws Exception;

    C12830f postMultiPart(C12827e eVar, IAppContext iAppContext) throws Exception;
}
