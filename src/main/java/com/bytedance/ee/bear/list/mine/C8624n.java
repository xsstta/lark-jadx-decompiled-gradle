package com.bytedance.ee.bear.list.mine;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.C1138ae;
import androidx.lifecycle.LiveData;
import androidx.p011a.p012a.p015c.AbstractC0193a;
import com.bytedance.ee.bear.contract.leanmode.AbstractC5197b;
import com.bytedance.ee.bear.document.AbstractC6158t;
import com.bytedance.ee.bear.facade.common.C7718l;
import com.bytedance.ee.bear.list.C8277e;
import com.bytedance.ee.bear.list.DocumentListInfo;
import com.bytedance.ee.bear.list.cache.C8153a;
import com.bytedance.ee.bear.list.cache.C8200i;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.list.AbstractC8531b;
import com.bytedance.ee.bear.list.mine.C8624n;
import com.bytedance.ee.bear.list.sort.C8764f;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.bytedance.ee.util.p716r.C13721c;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.list.mine.n */
public class C8624n extends AbstractC8531b<C8619h> implements AbstractC8617f {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: g */
    public String mo32589g() {
        return "mine";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: h */
    public String mo32590h() {
        return "MyDocumentModel";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: i */
    public C8277e mo32730i() {
        return new C8277e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C8619h mo32592n() {
        return new C8619h();
    }

    @Override // com.bytedance.ee.bear.list.mine.AbstractC8617f
    public AbstractC68307f<ArrayList<Document>> A_() {
        return ((C8619h) this.f23126g).mo33576b();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: b */
    public String mo32588b() {
        if (((AbstractC5197b) KoinJavaComponent.m268610a(AbstractC5197b.class)).mo20801b().mo20782g().f14914a) {
            return "/api/explorer/my/object/list/";
        }
        return "space/api/explorer/lean/my/object/list/";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: d */
    public AbstractC68307f<DocumentListInfo> mo32740d() {
        return AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.list.mine.$$Lambda$n$Vw8Nb1uk5oyMKyETqeDApEc45lw */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8624n.this.m36024b((Boolean) obj);
            }
        }).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.list.mine.$$Lambda$n$PX7WOqy_lU08Ol4j7qqE3oaHHQ */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8624n.this.m36022a((Boolean) obj);
            }
        }).mo238014c(new Function() {
            /* class com.bytedance.ee.bear.list.mine.$$Lambda$n$aM9qp3Y7GZWY1F8WHJFvCLRq4U */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8624n.this.m36023a((Integer) obj);
            }
        });
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8542h
    /* renamed from: a */
    public LiveData<ArrayList<Document>> mo32587a() {
        return C1138ae.m5354a(C8153a.m32844b().mo31638i(), new C8626a());
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.list.mine.n$a */
    public class C8626a implements AbstractC0193a<List<C8200i>, ArrayList<Document>> {
        private C8626a() {
        }

        /* renamed from: a */
        public ArrayList<Document> apply(List<C8200i> list) {
            ArrayList<Document> a = C8764f.m36799a(C8624n.this.f23123d, C8200i.m33450a(list));
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator<Document> it = a.iterator();
            while (it.hasNext()) {
                Document next = it.next();
                if (((AbstractC6158t) KoinJavaComponent.m268610a(AbstractC6158t.class)).mo20317a(next.mo32472o())) {
                    arrayList.add(next);
                } else {
                    arrayList2.add(next);
                }
            }
            ArrayList<Document> arrayList3 = new ArrayList<>();
            try {
                Collections.sort(arrayList, $$Lambda$n$a$n1_Jypt2Gs8gqo20QSih8Re69A.INSTANCE);
                if (C8624n.this.f23123d != null) {
                    Collections.sort(arrayList2, new Comparator() {
                        /* class com.bytedance.ee.bear.list.mine.$$Lambda$n$a$6LVYYjEtJULCiXz3FvoqcHqTc8 */

                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            return C8624n.C8626a.this.m36035b((Document) obj, (Document) obj2);
                        }
                    });
                } else {
                    Collections.sort(arrayList2, $$Lambda$n$a$Y4EJMbqlHjuUJnTZ9ljnVMHY.INSTANCE);
                }
                arrayList3.addAll(arrayList);
                arrayList3.addAll(arrayList2);
                return arrayList3;
            } catch (Exception e) {
                C13479a.m54761a(C8624n.this.mo32590h(), e);
                return a;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ int m36034a(Document document, Document document2) {
            return C13721c.m55647b(document2.mo32479r(), document.mo32479r());
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static /* synthetic */ int m36036c(Document document, Document document2) {
            return (int) (Long.parseLong(document2.mo32479r()) - Long.parseLong(document.mo32479r()));
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ int m36035b(Document document, Document document2) {
            if (C8624n.this.f23123d.mo31549b() == MineSort.CREATE_TIME.getRank()) {
                if (C8624n.this.f23123d.mo31558e()) {
                    return C13721c.m55647b(document.mo32373A(), document2.mo32373A());
                }
                return C13721c.m55647b(document2.mo32373A(), document.mo32373A());
            } else if (C8624n.this.f23123d.mo31558e()) {
                return C13721c.m55647b(document.mo32479r(), document2.mo32479r());
            } else {
                return C13721c.m55647b(document2.mo32479r(), document.mo32479r());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ AbstractC70020b m36023a(Integer num) throws Exception {
        return this.f23127h.mo20141a(mo32729c()).mo238020d(new Function(num) {
            /* class com.bytedance.ee.bear.list.mine.$$Lambda$n$GTIVWuQ0Ad9RfOqVmtg6hk5wMM8 */
            public final /* synthetic */ Integer f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8624n.m36021a(this.f$0, (DocumentListInfo) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: b */
    public /* synthetic */ Boolean m36024b(Boolean bool) throws Exception {
        if (this.f23123d == null) {
            this.f23123d = ((C8619h) this.f23126g).mo32619a();
            if (this.f23123d != null) {
                this.f23124e.postSortStrategy(this.f23123d);
            }
        }
        return bool;
    }

    /* access modifiers changed from: private */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: a */
    public /* synthetic */ Integer m36022a(Boolean bool) throws Exception {
        int c = C13657b.m55424c(C8764f.m36799a(this.f23123d, C8200i.m33450a(C8153a.m32844b().mo31579a(2, "fake_", ""))));
        String h = mo32590h();
        C13479a.m54764b(h, "fakeTokenList size = " + c);
        return Integer.valueOf(c);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: a */
    public void mo33356a(FolderSortStrategy folderSortStrategy) {
        super.mo33356a(folderSortStrategy);
        if (folderSortStrategy != null && TextUtils.equals(mo32589g(), folderSortStrategy.mo31545a())) {
            ((C8619h) this.f23126g).mo33575a(folderSortStrategy);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ DocumentListInfo m36021a(Integer num, DocumentListInfo documentListInfo) throws Exception {
        documentListInfo.setTotal(documentListInfo.getTotal() + num.intValue());
        return documentListInfo;
    }

    public C8624n(C7718l lVar, Context context, C10917c cVar) {
        super(lVar, context, cVar);
    }
}
