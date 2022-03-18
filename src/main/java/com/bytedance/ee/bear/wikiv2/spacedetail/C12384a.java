package com.bytedance.ee.bear.wikiv2.spacedetail;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.service.C10917c;
import io.reactivex.AbstractC68307f;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.wikiv2.spacedetail.a */
public class C12384a {

    /* renamed from: a */
    private C10917c f33239a;

    public C12384a(C10917c cVar) {
        this.f33239a = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ WikiSpaceInfo m51526a(NetService.Result result) throws Exception {
        return (WikiSpaceInfo) result.data;
    }

    /* renamed from: a */
    public AbstractC68307f<WikiSpaceInfo> mo47193a(String str) {
        NetService.AbstractC5075d a = ((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20117a(new C12385b());
        NetService.C5077f fVar = new NetService.C5077f("/space/api/wiki/v2/space/get_member/");
        fVar.mo20143a(2);
        fVar.mo20145a("space_id", str);
        return a.mo20141a(fVar).mo238020d($$Lambda$a$3OK3UTSSin5iluKsV4CB8r52DP8.INSTANCE);
    }
}
