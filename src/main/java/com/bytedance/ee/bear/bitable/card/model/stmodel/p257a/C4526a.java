package com.bytedance.ee.bear.bitable.card.model.stmodel.p257a;

import com.bytedance.ee.bear.bitable.card.model.enums.EFieldType;
import com.bytedance.ee.bear.bitable.card.model.stmodel.C4535b;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.bitable.card.model.stmodel.a.a */
public class C4526a extends C4533g {

    /* renamed from: a */
    private final List<String> f13308a;

    /* renamed from: a */
    public boolean mo17718a() {
        List<String> list = this.f13308a;
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    public C4526a(C4535b bVar, String str, String str2, boolean z, List<String> list) {
        super(bVar, EFieldType.ATTACHMENT, str, str2, z);
        this.f13308a = list;
    }
}
