package com.bytedance.ee.bear.list.share;

import android.content.Context;
import androidx.lifecycle.C1138ae;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.facade.common.C7718l;
import com.bytedance.ee.bear.list.C8277e;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.DocumentListInfo;
import com.bytedance.ee.bear.list.cache.C8153a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.list.AbstractC8531b;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13608f;
import com.bytedance.ee.util.p702e.C13657b;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.list.share.ai */
public class C8716ai extends AbstractC8531b<C8712ae> implements AbstractC8740o {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: g */
    public String mo32589g() {
        return "shared_folder";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: h */
    public String mo32590h() {
        return "ShareFolderModel";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    public boolean w_() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: b */
    public String mo32588b() {
        return C8292f.m34128a();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: i */
    public C8277e mo32730i() {
        return new C8713af();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C8712ae mo32592n() {
        return new C8712ae();
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8542h
    /* renamed from: a */
    public LiveData<ArrayList<Document>> mo32587a() {
        return C1138ae.m5354a(C8153a.m32844b().mo31617d(), $$Lambda$8hh2XxIY6BsfWOqZONdgoQZzF8w.INSTANCE);
    }

    /* renamed from: k */
    private AbstractC68307f<Boolean> m36491k() {
        return AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.list.share.$$Lambda$ai$sWhCqPqo8Dz85PdrxgF4TkdjcME */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8716ai.this.m36487a((Boolean) obj);
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: d */
    public AbstractC68307f<DocumentListInfo> mo32740d() {
        return AbstractC68307f.m265092a(m36491k().mo238014c(new Function() {
            /* class com.bytedance.ee.bear.list.share.$$Lambda$ai$p8vQ7rIs2esjfA9FWlSNWRMLXs */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8716ai.this.m36490c((Boolean) obj);
            }
        }), m36491k().mo238014c(new Function() {
            /* class com.bytedance.ee.bear.list.share.$$Lambda$ai$7ER6GfaWUlPrkR6g7cE39xpfkzQ */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8716ai.this.m36488b((Boolean) obj);
            }
        }), $$Lambda$ai$Ge8x_oI6QFNut4z_9s6uPjFI.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m36489b(String str) {
        C8153a.m32844b().mo31615d(str, true);
    }

    /* access modifiers changed from: private */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: a */
    public /* synthetic */ Boolean m36487a(Boolean bool) throws Exception {
        if (this.f23123d == null) {
            this.f23123d = ((C8712ae) this.f23126g).mo32619a();
            if (this.f23123d != null) {
                this.f23124e.postSortStrategy(this.f23123d);
            }
        }
        return bool;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ AbstractC70020b m36490c(Boolean bool) throws Exception {
        return this.f23127h.mo20141a(m36485a(mo32729c(), "0"));
    }

    /* access modifiers changed from: private */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: b */
    public /* synthetic */ AbstractC70020b m36488b(Boolean bool) throws Exception {
        return ((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20117a(new C8713af(true)).mo20141a(m36485a(mo32729c(), "1"));
    }

    @Override // com.bytedance.ee.bear.list.share.AbstractC8740o
    /* renamed from: a */
    public void mo33767a(String str) {
        C13479a.m54764b(mo32590h(), "removeItem()...");
        ((C8712ae) this.f23126g).mo33765a(str);
    }

    /* renamed from: a */
    private NetService.C5076e m36485a(NetService.C5076e eVar, String str) {
        eVar.mo20145a("hidden", str);
        return eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ DocumentListInfo m36486a(DocumentListInfo documentListInfo, DocumentListInfo documentListInfo2) throws Exception {
        DocumentListInfo documentListInfo3 = new DocumentListInfo();
        documentListInfo3.setTotal(documentListInfo.getTotal() + documentListInfo2.getTotal());
        ArrayList<Document> arrayList = new ArrayList<>();
        if (!C13657b.m55421a(documentListInfo.getDocumentList())) {
            arrayList.addAll(documentListInfo.getDocumentList());
        }
        if (!C13657b.m55421a(documentListInfo2.getDocumentList())) {
            arrayList.addAll(documentListInfo2.getDocumentList());
        }
        documentListInfo3.setHas_hidden(!C13657b.m55421a(documentListInfo2.getDocumentList()));
        documentListInfo3.setDocumentList(arrayList);
        return documentListInfo3;
    }

    @Override // com.bytedance.ee.bear.list.share.AbstractC8740o
    /* renamed from: a */
    public void mo33768a(String str, boolean z) {
        String h = mo32590h();
        C13479a.m54764b(h, "updateItemVisited()...visited = " + z);
        C13608f.m55249a(new Runnable(str) {
            /* class com.bytedance.ee.bear.list.share.$$Lambda$ai$OPLJdg1kybQD6NxO4Boih4yZJ2Q */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                C8716ai.m36489b(this.f$0);
            }
        });
    }

    C8716ai(C7718l lVar, Context context, C10917c cVar) {
        super(lVar, context, cVar);
    }
}
