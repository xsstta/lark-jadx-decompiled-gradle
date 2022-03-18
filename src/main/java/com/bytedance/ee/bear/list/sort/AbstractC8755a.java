package com.bytedance.ee.bear.list.sort;

import com.bytedance.ee.bear.document.AbstractC6158t;
import com.bytedance.ee.bear.list.C8677r;
import com.bytedance.ee.bear.list.cache.C8153a;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.sort.AbstractC8765g;
import com.bytedance.ee.bear.service.C10917c;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.sort.a */
public abstract class AbstractC8755a implements AbstractC8765g.AbstractC8766a {

    /* renamed from: a */
    protected C10917c f23609a;

    /* renamed from: b */
    protected AbstractC6158t f23610b = ((AbstractC6158t) KoinJavaComponent.m268610a(AbstractC6158t.class));

    /* renamed from: c */
    private final boolean f23611c;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.list.sort.AbstractC8765g.AbstractC8766a
    /* renamed from: b */
    public List<FilterType> mo33058b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(FilterType.ALL);
        arrayList.add(FilterType.DOC);
        arrayList.add(FilterType.SHEET);
        if (C8677r.m36258a().mo33682a(C8275a.f22373f.mo32555b())) {
            arrayList.add(FilterType.BITABLE);
        }
        if (!this.f23610b.mo20318b(C8275a.f22376i.mo32555b())) {
            arrayList.add(FilterType.SLIDE);
        }
        if (!this.f23610b.mo20318b(C8275a.f22374g.mo32555b())) {
            arrayList.add(FilterType.MINDNOTE);
        }
        arrayList.add(FilterType.FILE);
        arrayList.add(FilterType.PHOTO);
        if (this.f23611c) {
            arrayList.add(FilterType.FOLDER);
        }
        return arrayList;
    }

    @Override // com.bytedance.ee.bear.list.sort.AbstractC8765g.AbstractC8766a
    /* renamed from: a */
    public void mo33801a(FolderSortStrategy folderSortStrategy) {
        if (folderSortStrategy != null) {
            C8153a.m32844b().mo31582a(folderSortStrategy);
        }
    }

    public AbstractC8755a(C10917c cVar, boolean z) {
        this.f23609a = cVar;
        this.f23611c = z;
    }
}
