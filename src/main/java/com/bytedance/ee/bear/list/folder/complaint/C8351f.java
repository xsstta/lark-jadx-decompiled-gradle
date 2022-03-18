package com.bytedance.ee.bear.list.folder.complaint;

import com.bytedance.ee.bear.contract.NetService;
import io.reactivex.AbstractC68307f;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.folder.complaint.f */
public class C8351f {
    /* renamed from: a */
    public AbstractC68307f<GetComplaintResult> mo32792a(int i, String str) {
        NetService.C5077f fVar = new NetService.C5077f("/space/api/platform/review/complaint/get/");
        fVar.mo20145a("obj_type", String.valueOf(i));
        fVar.mo20145a("obj_token", str);
        return ((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20117a(new C8352g()).mo20141a(fVar);
    }
}
