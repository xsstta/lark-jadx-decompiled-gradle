package com.bytedance.pipeline.p859a;

import com.bytedance.pipeline.AbstractC20233b;
import com.bytedance.pipeline.AbstractC20235d;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.pipeline.a.b */
public final class C20232b extends AbstractC20231a {

    /* renamed from: a */
    private List<AbstractC20231a> f49508a;

    /* renamed from: a */
    public void mo68481a(AbstractC20231a aVar) {
        if (aVar != null) {
            this.f49508a.add(aVar);
        }
    }

    public C20232b(AbstractC20231a... aVarArr) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f49508a = copyOnWriteArrayList;
        if (aVarArr != null) {
            copyOnWriteArrayList.addAll(Arrays.asList(aVarArr));
        }
    }

    @Override // com.bytedance.pipeline.p859a.AbstractC20231a
    /* renamed from: a */
    public <T> void mo52253a(AbstractC20233b<T> bVar, AbstractC20235d dVar) {
        for (AbstractC20231a aVar : this.f49508a) {
            if (aVar != null) {
                aVar.mo52253a(bVar, dVar);
            }
        }
    }

    @Override // com.bytedance.pipeline.p859a.AbstractC20231a
    /* renamed from: b */
    public <T> void mo52254b(AbstractC20233b<T> bVar, AbstractC20235d dVar) {
        for (AbstractC20231a aVar : this.f49508a) {
            if (aVar != null) {
                aVar.mo52254b(bVar, dVar);
            }
        }
    }

    @Override // com.bytedance.pipeline.p859a.AbstractC20231a
    /* renamed from: c */
    public <T> void mo52255c(AbstractC20233b<T> bVar, AbstractC20235d dVar) {
        for (AbstractC20231a aVar : this.f49508a) {
            if (aVar != null) {
                aVar.mo52255c(bVar, dVar);
            }
        }
    }

    @Override // com.bytedance.pipeline.p859a.AbstractC20231a
    /* renamed from: f */
    public <T> void mo68480f(AbstractC20233b<T> bVar, AbstractC20235d dVar, Throwable th) {
        for (AbstractC20231a aVar : this.f49508a) {
            if (aVar != null) {
                aVar.mo68480f(bVar, dVar, th);
            }
        }
    }

    @Override // com.bytedance.pipeline.p859a.AbstractC20231a
    /* renamed from: a */
    public <T> void mo52251a(AbstractC20233b<T> bVar, AbstractC20235d dVar, Throwable th) {
        for (AbstractC20231a aVar : this.f49508a) {
            if (aVar != null) {
                aVar.mo52251a(bVar, dVar, th);
            }
        }
    }

    @Override // com.bytedance.pipeline.p859a.AbstractC20231a
    /* renamed from: b */
    public <T> void mo52252b(AbstractC20233b<T> bVar, AbstractC20235d dVar, Throwable th) {
        for (AbstractC20231a aVar : this.f49508a) {
            if (aVar != null) {
                aVar.mo52252b(bVar, dVar, th);
            }
        }
    }
}
