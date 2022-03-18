package com.bytedance.ee.bear.list.share;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.C1138ae;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.facade.common.C7718l;
import com.bytedance.ee.bear.list.C8277e;
import com.bytedance.ee.bear.list.DocumentListInfo;
import com.bytedance.ee.bear.list.cache.C8153a;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.list.AbstractC8531b;
import com.bytedance.ee.bear.list.sort.FilterType;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.list.share.at */
public class C8721at extends AbstractC8531b<ar> implements AbstractC8743q {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: b */
    public String mo32588b() {
        return "/space/api/explorer/v2/share/list/";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: g */
    public String mo32589g() {
        return "shared";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: h */
    public String mo32590h() {
        return "SharedModel";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: i */
    public C8277e mo32730i() {
        return new C8753y();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public ar mo32592n() {
        return new ar();
    }

    @Override // com.bytedance.ee.bear.list.share.AbstractC8743q
    public AbstractC68307f<ArrayList<Document>> D_() {
        return ((ar) this.f23126g).mo33771b();
    }

    /* renamed from: k */
    private AbstractC68307f<Boolean> m36590k() {
        return AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.list.share.$$Lambda$at$L923oFPo3_vYjt97E41RwSHPaYA */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8721at.this.m36585a((Boolean) obj);
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: d */
    public AbstractC68307f<DocumentListInfo> mo32740d() {
        if (this.f23123d == null || this.f23123d.mo31554d() == FilterType.ALL.getType()) {
            return AbstractC68307f.m265092a(m36590k().mo238014c(new Function() {
                /* class com.bytedance.ee.bear.list.share.$$Lambda$at$wmoxdzFnpGbe9LJdQrClsmyLoY */

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return C8721at.this.m36589c((Boolean) obj);
                }
            }), m36590k().mo238014c(new Function() {
                /* class com.bytedance.ee.bear.list.share.$$Lambda$at$HQYmHML_Hp7QFGg25nXzClNA8 */

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return C8721at.this.m36588b((Boolean) obj);
                }
            }), new BiFunction() {
                /* class com.bytedance.ee.bear.list.share.$$Lambda$at$UKJLwZgcLmPbQND9U7gp0wFrZ4 */

                @Override // io.reactivex.functions.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return C8721at.this.m36584a((DocumentListInfo) obj, (DocumentListInfo) obj2);
                }
            });
        }
        return super.mo32740d();
    }

    @Override // com.bytedance.ee.bear.list.share.AbstractC8743q
    /* renamed from: e */
    public AbstractC68307f<Integer> mo33773e() {
        NetService.C5077f fVar = new NetService.C5077f("/api/explorer/share/folder/newlist/");
        fVar.mo20145a("be_shared", String.valueOf(true));
        return ((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20117a(new C8713af()).mo20141a(fVar).mo238020d($$Lambda$at$e8VBGj2BOfUTVder6p6_5aPYPHU.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8542h
    /* renamed from: a */
    public LiveData<ArrayList<Document>> mo32587a() {
        return C1138ae.m5354a(C8153a.m32844b().mo31574a(10), $$Lambda$8hh2XxIY6BsfWOqZONdgoQZzF8w.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Integer m36586a(DocumentListInfo documentListInfo) throws Exception {
        return Integer.valueOf(C13657b.m55424c(documentListInfo.getDocumentList()));
    }

    /* renamed from: b */
    private NetService.C5076e m36587b(NetService.C5076e eVar) {
        eVar.mo20145a("forbidden_obj_type", String.valueOf(C8275a.f22370c.mo32555b()));
        return eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ AbstractC70020b m36589c(Boolean bool) throws Exception {
        return this.f23127h.mo20141a(m36583a(mo32729c()));
    }

    /* renamed from: a */
    private NetService.C5076e m36583a(NetService.C5076e eVar) {
        eVar.mo20145a("obj_type", String.valueOf(C8275a.f22370c.mo32555b()));
        eVar.mo20145a("length", "800");
        return eVar;
    }

    /* access modifiers changed from: private */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: b */
    public /* synthetic */ AbstractC70020b m36588b(Boolean bool) throws Exception {
        return this.f23127h.mo20141a(m36587b(mo32729c()));
    }

    /* access modifiers changed from: private */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: a */
    public /* synthetic */ Boolean m36585a(Boolean bool) throws Exception {
        if (this.f23123d == null) {
            this.f23123d = ((ar) this.f23126g).mo32619a();
            if (this.f23123d != null) {
                this.f23124e.postSortStrategy(this.f23123d);
            }
        }
        return bool;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: a */
    public void mo33356a(FolderSortStrategy folderSortStrategy) {
        super.mo33356a(folderSortStrategy);
        if (folderSortStrategy != null && TextUtils.equals(mo32589g(), folderSortStrategy.mo31545a())) {
            ((ar) this.f23126g).mo33770a(folderSortStrategy);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ DocumentListInfo m36584a(DocumentListInfo documentListInfo, DocumentListInfo documentListInfo2) throws Exception {
        C13479a.m54764b(mo32590h(), "zip()...success");
        DocumentListInfo documentListInfo3 = new DocumentListInfo();
        ArrayList<Document> arrayList = new ArrayList<>();
        arrayList.addAll(documentListInfo.getDocumentList());
        arrayList.addAll(documentListInfo2.getDocumentList());
        documentListInfo3.setDocumentList(arrayList);
        documentListInfo3.setTotal(documentListInfo.getTotal() + documentListInfo2.getTotal());
        documentListInfo3.setHasMore(documentListInfo2.isHasMore());
        documentListInfo3.setLastLabel(documentListInfo2.getLastLabel());
        documentListInfo3.setCheckId(documentListInfo2.getCheckId());
        documentListInfo3.setNextId(documentListInfo2.getNextId());
        return documentListInfo3;
    }

    public C8721at(C7718l lVar, Context context, C10917c cVar) {
        super(lVar, context, cVar);
    }
}
