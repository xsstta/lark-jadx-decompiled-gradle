package com.bytedance.ee.bear.document.offline.create;

import com.bytedance.ee.bear.contract.offline.ModifyDocBean;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.document.offline.create.a */
public class C5915a implements AbstractC7945d<ModifyDocBean> {

    /* renamed from: a */
    private String f16564a = "Offline#Modify#";

    /* renamed from: b */
    private C10917c f16565b;

    /* renamed from: c */
    private AbstractC5917c f16566c;

    /* renamed from: a */
    public void mo23891a(AbstractC5917c cVar) {
        this.f16566c = cVar;
    }

    /* renamed from: a */
    public void handle(ModifyDocBean modifyDocBean, AbstractC7947h hVar) {
        String str = this.f16564a;
        C13479a.m54764b(str, "handle:" + modifyDocBean);
    }

    public C5915a(C10917c cVar, String str) {
        String str2 = this.f16564a + str + Integer.toHexString(hashCode());
        this.f16564a = str2;
        C13479a.m54764b(str2, "construct");
        this.f16565b = cVar;
    }
}
