package com.bytedance.ee.bear.list.p429f;

import android.content.Context;
import androidx.lifecycle.C1138ae;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.facade.common.C7718l;
import com.bytedance.ee.bear.list.cache.C8153a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.list.AbstractC8531b;
import com.bytedance.ee.bear.list.list.AbstractC8542h;
import com.bytedance.ee.bear.service.C10917c;
import java.util.ArrayList;

/* renamed from: com.bytedance.ee.bear.list.f.c */
public class C8296c extends AbstractC8531b<C8304h> implements AbstractC8542h {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: b */
    public String mo32588b() {
        return "/space/api/explorer/v2/pin/list/";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: g */
    public String mo32589g() {
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: h */
    public String mo32590h() {
        return "PinDocumentModel";
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C8304h mo32592n() {
        return new C8304h();
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8542h
    /* renamed from: a */
    public LiveData<ArrayList<Document>> mo32587a() {
        return C1138ae.m5354a(C8153a.m32844b().mo31574a(5), $$Lambda$8hh2XxIY6BsfWOqZONdgoQZzF8w.INSTANCE);
    }

    C8296c(C7718l lVar, Context context, C10917c cVar) {
        super(lVar, context, cVar);
    }
}
