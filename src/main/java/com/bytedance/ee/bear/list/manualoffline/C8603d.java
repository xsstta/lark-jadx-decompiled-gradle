package com.bytedance.ee.bear.list.manualoffline;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1138ae;
import androidx.lifecycle.C1174u;
import androidx.lifecycle.LiveData;
import androidx.p011a.p012a.p015c.AbstractC0193a;
import com.bytedance.ee.bear.facade.common.C7718l;
import com.bytedance.ee.bear.list.cache.C8153a;
import com.bytedance.ee.bear.list.cache.C8200i;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.list.AbstractC8531b;
import com.bytedance.ee.bear.list.manualoffline.C8603d;
import com.bytedance.ee.bear.list.sort.C8764f;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.bytedance.ee.util.p716r.C13721c;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.list.manualoffline.d */
public class C8603d extends AbstractC8531b<C8609h> {

    /* renamed from: k */
    public List<C8200i> f23353k = new ArrayList();

    /* renamed from: l */
    public List<Document> f23354l = new ArrayList();

    /* renamed from: m */
    private final C1174u<List<C8200i>> f23355m = new C1174u<>();

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: b */
    public String mo32588b() {
        return "";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: g */
    public String mo32589g() {
        return "manual_offline";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: h */
    public String mo32590h() {
        return "ManualOfflineDocumentModel";
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8542h, com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: o */
    public void mo33359o() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C8609h mo32592n() {
        return new C8609h();
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8542h, com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: q */
    public void mo33361q() {
        this.f23125f.mo237937a(AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.list.manualoffline.$$Lambda$d$0otj3hFJiJADBG47BVhWkeKraQ */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8603d.this.m35905a((Boolean) obj);
            }
        }).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.list.manualoffline.$$Lambda$d$TM0e3AsWqGwg0wc87RjTaJwGgk0 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8603d.this.m35906a((C8603d) ((Integer) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.list.manualoffline.$$Lambda$d$h8Z9LAteYh2DCTZOerqPT6X5ig */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8603d.this.m35907a((C8603d) ((Throwable) obj));
            }
        }));
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8542h
    /* renamed from: a */
    public LiveData<ArrayList<Document>> mo32587a() {
        C1174u<List<C8200i>> uVar = this.f23355m;
        uVar.getClass();
        this.f23355m.mo6042a((LiveData<S>) C8153a.m32844b().mo31574a(7), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.list.manualoffline.$$Lambda$bjIQg9NYQSjRWB8csjuRu8gX7D0 */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C1174u.this.mo5926a((List) obj);
            }
        });
        return C1138ae.m5354a(this.f23355m, new C8605a());
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.list.manualoffline.d$a */
    public class C8605a implements AbstractC0193a<List<C8200i>, ArrayList<Document>> {
        private C8605a() {
        }

        /* renamed from: a */
        public ArrayList<Document> apply(List<C8200i> list) {
            String h = C8603d.this.mo32590h();
            C13479a.m54764b(h, "TransformFun()...input = " + C13657b.m55424c(list));
            C8603d.this.f23353k = list;
            ArrayList<Document> a = C8764f.m36799a(C8603d.this.f23123d, C8200i.m33450a(list));
            C8603d.this.f23354l = a;
            if (!C13657b.m55421a(a) && C8603d.this.f23123d != null) {
                try {
                    Collections.sort(a, new Comparator() {
                        /* class com.bytedance.ee.bear.list.manualoffline.$$Lambda$d$a$K_qrqNqSvAehUCUfefRn9axVE0I */

                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            return C8603d.C8605a.this.m35917a((Document) obj, (Document) obj2);
                        }
                    });
                    return a;
                } catch (Exception e) {
                    C13479a.m54761a(C8603d.this.mo32590h(), e);
                }
            }
            return a;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ int m35917a(Document document, Document document2) {
            if (C8603d.this.f23123d.mo31549b() == ManualOfflineSort.MODIFIED.getRank()) {
                return C13721c.m55647b(document2.mo32479r(), document.mo32479r());
            }
            if (C8603d.this.f23123d.mo31549b() == ManualOfflineSort.CREATED.getRank()) {
                return C13721c.m55647b(document2.mo32373A(), document.mo32373A());
            }
            return C13721c.m55647b(document2.mo32406V(), document.mo32406V());
        }
    }

    /* access modifiers changed from: private */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: a */
    public /* synthetic */ void m35907a(Throwable th) throws Exception {
        C13479a.m54766b(mo32590h(), th);
        if (this.f23129j != null) {
            this.f23129j.mo32655a(th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m35906a(Integer num) throws Exception {
        String h = mo32590h();
        C13479a.m54764b(h, "refreshFromNet()...success, size = " + num);
        if (this.f23129j != null) {
            this.f23129j.mo32648a(num.intValue(), false);
        }
    }

    /* access modifiers changed from: private */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: a */
    public /* synthetic */ Integer m35905a(Boolean bool) throws Exception {
        int i;
        if (this.f23123d == null) {
            this.f23123d = ((C8609h) this.f23126g).mo32619a();
            if (this.f23123d != null) {
                this.f23124e.postSortStrategy(this.f23123d);
            }
        }
        if (C13657b.m55423b(this.f23354l)) {
            return Integer.valueOf(this.f23354l.size());
        }
        List<C8200i> k = C8153a.m32844b().mo31642k();
        if (k == null) {
            i = 0;
        } else {
            i = k.size();
        }
        return Integer.valueOf(i);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: a */
    public void mo33356a(FolderSortStrategy folderSortStrategy) {
        if (folderSortStrategy != null && TextUtils.equals(folderSortStrategy.mo31545a(), mo32589g()) && !folderSortStrategy.equals(this.f23123d)) {
            this.f23123d = folderSortStrategy;
            this.f23355m.mo5926a(this.f23353k);
        }
    }

    public C8603d(C7718l lVar, Context context, C10917c cVar) {
        super(lVar, context, cVar);
    }
}
