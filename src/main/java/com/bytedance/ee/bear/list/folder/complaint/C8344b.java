package com.bytedance.ee.bear.list.folder.complaint;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.larksuite.framework.mvp.BaseModel;
import io.reactivex.AbstractC68307f;
import java.util.HashMap;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.folder.complaint.b */
public class C8344b extends BaseModel implements AbstractC8353h {

    /* renamed from: a */
    private final String f22549a;

    @Override // com.bytedance.ee.bear.list.folder.complaint.AbstractC8353h
    /* renamed from: a */
    public AbstractC68307f<SendComplaintResult> mo32786a() {
        NetService.C5077f fVar = new NetService.C5077f("/space/api/platform/review/complaint/");
        fVar.mo20143a(1);
        HashMap hashMap = new HashMap();
        hashMap.put("obj_type", String.valueOf(C8275a.f22370c.mo32555b()));
        hashMap.put("obj_token", this.f22549a);
        fVar.mo20147a(hashMap);
        return ((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20117a(new C8356j()).mo20141a(fVar);
    }

    C8344b(String str) {
        this.f22549a = str;
    }
}
