package com.bytedance.ee.bear.list.share;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.C1138ae;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.contract.leanmode.AbstractC5197b;
import com.bytedance.ee.bear.facade.common.C7718l;
import com.bytedance.ee.bear.list.C8277e;
import com.bytedance.ee.bear.list.cache.C8153a;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.list.AbstractC8531b;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import java.util.ArrayList;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.share.u */
public class C8747u extends AbstractC8531b<C8752x> implements AbstractC8738m {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: g */
    public String mo32589g() {
        return "shared_file";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: h */
    public String mo32590h() {
        return "ShareDocumentModel";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: i */
    public C8277e mo32730i() {
        return new C8753y();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C8752x mo32592n() {
        return new C8752x();
    }

    @Override // com.bytedance.ee.bear.list.share.AbstractC8738m
    public AbstractC68307f<ArrayList<Document>> C_() {
        return ((C8752x) this.f23126g).mo33783b();
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8542h
    /* renamed from: a */
    public LiveData<ArrayList<Document>> mo32587a() {
        return C1138ae.m5354a(C8153a.m32844b().mo31608c(), $$Lambda$8hh2XxIY6BsfWOqZONdgoQZzF8w.INSTANCE);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: b */
    public String mo32588b() {
        if (((AbstractC5197b) KoinJavaComponent.m268610a(AbstractC5197b.class)).mo20801b().mo20782g().f14914a) {
            return "/api/explorer/share/object/list/";
        }
        return "space/api/explorer/lean/share/object/list/";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: a */
    public void mo33356a(FolderSortStrategy folderSortStrategy) {
        super.mo33356a(folderSortStrategy);
        if (folderSortStrategy != null && TextUtils.equals(mo32589g(), folderSortStrategy.mo31545a())) {
            ((C8752x) this.f23126g).mo33782a(folderSortStrategy);
        }
    }

    @Override // com.bytedance.ee.bear.list.share.AbstractC8738m
    /* renamed from: a */
    public void mo33780a(String str) {
        C13479a.m54764b(mo32590h(), "removeItem()...");
        ((C8752x) this.f23126g).mo33765a(str);
    }

    public C8747u(C7718l lVar, Context context, C10917c cVar) {
        super(lVar, context, cVar);
    }
}
