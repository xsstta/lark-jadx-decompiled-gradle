package com.ss.android.lark.littleapp.service.p2132a;

import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.littleapp.AbstractC41370i;
import com.ss.android.lark.littleapp.C41354g;

/* renamed from: com.ss.android.lark.littleapp.service.a.b */
public class C41425b implements AbstractC41370i {
    @Override // com.ss.android.lark.littleapp.AbstractC41370i
    /* renamed from: a */
    public <T> T mo148976a(Class<? extends AbstractC28490a> cls, boolean z) {
        return (T) C41354g.m163939a().getAbTestValue(cls, z);
    }
}
