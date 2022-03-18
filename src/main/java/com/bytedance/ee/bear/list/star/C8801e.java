package com.bytedance.ee.bear.list.star;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.C1138ae;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.facade.common.C7718l;
import com.bytedance.ee.bear.list.cache.C8153a;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.list.AbstractC8531b;
import com.bytedance.ee.bear.service.C10917c;
import io.reactivex.AbstractC68307f;
import java.util.ArrayList;

/* renamed from: com.bytedance.ee.bear.list.star.e */
public class C8801e extends AbstractC8531b<C8815m> implements AbstractC8807j {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: b */
    public String mo32588b() {
        return "/space/api/explorer/v2/star/list/";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: g */
    public String mo32589g() {
        return "star";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: h */
    public String mo32590h() {
        return "FavoriteModel";
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C8815m mo32592n() {
        return new C8815m();
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8542h
    /* renamed from: a */
    public LiveData<ArrayList<Document>> mo32587a() {
        return C1138ae.m5354a(C8153a.m32844b().mo31574a(6), $$Lambda$8hh2XxIY6BsfWOqZONdgoQZzF8w.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.list.star.AbstractC8807j
    /* renamed from: k */
    public AbstractC68307f<ArrayList<Document>> mo32720k() {
        return ((C8815m) this.f23126g).mo33866b();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: a */
    public void mo33356a(FolderSortStrategy folderSortStrategy) {
        super.mo33356a(folderSortStrategy);
        if (folderSortStrategy != null && TextUtils.equals(mo32589g(), folderSortStrategy.mo31545a())) {
            ((C8815m) this.f23126g).mo33865a(folderSortStrategy);
        }
    }

    public C8801e(C7718l lVar, Context context, C10917c cVar) {
        super(lVar, context, cVar);
    }
}
