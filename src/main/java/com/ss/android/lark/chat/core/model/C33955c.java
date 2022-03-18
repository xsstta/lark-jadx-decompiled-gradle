package com.ss.android.lark.chat.core.model;

import com.ss.android.lark.chat.core.model.AbstractC33964i;
import com.ss.android.lark.utils.statistics.PerfLog;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.chat.core.model.c */
public class C33955c<T, S> implements AbstractC33964i.AbstractC33965a<AbstractC33964i<S>> {

    /* renamed from: a */
    private final AbstractC33959e<S, T> f87539a;

    /* renamed from: b */
    private volatile List<T> f87540b;

    /* renamed from: c */
    private volatile List<T> f87541c;

    /* renamed from: d */
    private volatile boolean f87542d;

    /* renamed from: e */
    private volatile boolean f87543e;

    /* renamed from: f */
    private AbstractC33957b f87544f;

    /* renamed from: g */
    private final List<AbstractC33956a<T>> f87545g;

    /* renamed from: h */
    private final List<AbstractC33961f<T>> f87546h;

    /* renamed from: com.ss.android.lark.chat.core.model.c$a */
    public interface AbstractC33956a<T> {
        /* renamed from: a */
        void mo122969a(List<T> list, int i, int i2);

        /* renamed from: b */
        void mo122970b(List<T> list, int i, int i2);

        /* renamed from: c */
        void mo122971c(List<T> list, int i, int i2);
    }

    /* renamed from: com.ss.android.lark.chat.core.model.c$b */
    public interface AbstractC33957b<T> {
        void onChanged(List<T> list);
    }

    /* renamed from: c */
    private void m131415c() {
        if (!this.f87542d && this.f87541c == null) {
            throw new IllegalStateException("should call updateBegin at first");
        }
    }

    /* renamed from: a */
    public void mo124066a() {
        if (this.f87544f != null) {
            if (this.f87542d) {
                this.f87543e = true;
            } else {
                this.f87544f.onChanged(mo124071b());
            }
        }
    }

    /* renamed from: b */
    public final List<T> mo124071b() {
        List<T> list = this.f87540b;
        for (AbstractC33961f<T> fVar : this.f87546h) {
            list = fVar.mo124080a(list);
        }
        return new ArrayList(list);
    }

    /* renamed from: a */
    public void mo124067a(AbstractC33957b<T> bVar) {
        this.f87544f = bVar;
    }

    /* renamed from: a */
    public synchronized void mo124068a(AbstractC33961f<T> fVar) {
        if (fVar != null) {
            this.f87546h.add(fVar);
        }
    }

    /* renamed from: c */
    private void m131416c(AbstractC33964i<S> iVar) {
        iVar.acquireReadAccess();
        iVar.removeOnListUpdateCallback(this);
        iVar.addOnListUpdateCallback(this);
        mo124069a(iVar);
        mo124073b(iVar, 0, iVar.size());
        mo124072b(iVar);
        iVar.releaseReadAccess();
    }

    @Override // com.ss.android.lark.chat.core.model.AbstractC33964i.AbstractC33965a
    /* renamed from: a */
    public void mo124069a(AbstractC33964i<S> iVar) {
        PerfLog.start("DataListPipeline_onUpdate", "");
        this.f87541c = new ArrayList(this.f87540b);
        this.f87543e = false;
        this.f87542d = true;
    }

    @Override // com.ss.android.lark.chat.core.model.AbstractC33964i.AbstractC33965a
    /* renamed from: b */
    public void mo124072b(AbstractC33964i<S> iVar) {
        this.f87542d = false;
        this.f87540b = this.f87541c;
        this.f87541c = null;
        if (this.f87544f != null && this.f87543e) {
            this.f87544f.onChanged(mo124071b());
        }
        PerfLog.end("DataListPipeline_onUpdate", "");
    }

    public C33955c(AbstractC33964i<S> iVar, AbstractC33959e<S, T> eVar) {
        this(iVar, eVar, null);
    }

    public C33955c(AbstractC33964i<S> iVar, AbstractC33959e<S, T> eVar, List<AbstractC33956a<T>> list) {
        this(iVar, eVar, list, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.ss.android.lark.chat.core.model.e<S, T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.lark.chat.core.model.AbstractC33964i.AbstractC33965a
    /* renamed from: a */
    public void mo124070a(AbstractC33964i<S> iVar, int i, int i2) {
        m131415c();
        this.f87543e = true;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i + i3;
            this.f87541c.set(i4, this.f87539a.mo122490a(iVar.get(i4), i4));
        }
        List<AbstractC33956a<T>> list = this.f87545g;
        if (!(list == null || list.isEmpty())) {
            for (AbstractC33956a<T> aVar : this.f87545g) {
                aVar.mo122971c(this.f87541c, i, i2);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.ss.android.lark.chat.core.model.e<S, T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.lark.chat.core.model.AbstractC33964i.AbstractC33965a
    /* renamed from: b */
    public void mo124073b(AbstractC33964i<S> iVar, int i, int i2) {
        if (i2 > 0) {
            m131415c();
            this.f87543e = true;
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = i + i3;
                this.f87541c.add(i4, this.f87539a.mo122490a(iVar.get(i4), i4));
            }
            List<AbstractC33956a<T>> list = this.f87545g;
            if (!(list == null || list.isEmpty())) {
                for (AbstractC33956a<T> aVar : this.f87545g) {
                    aVar.mo122969a(this.f87541c, i, i2);
                }
            }
        }
    }

    @Override // com.ss.android.lark.chat.core.model.AbstractC33964i.AbstractC33965a
    /* renamed from: c */
    public void mo124074c(AbstractC33964i<S> iVar, int i, int i2) {
        m131415c();
        this.f87543e = true;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f87541c.remove(i);
        }
        List<AbstractC33956a<T>> list = this.f87545g;
        if (!(list == null || list.isEmpty())) {
            for (AbstractC33956a<T> aVar : this.f87545g) {
                aVar.mo122970b(this.f87541c, i, i2);
            }
        }
    }

    public C33955c(AbstractC33964i<S> iVar, AbstractC33959e<S, T> eVar, List<AbstractC33956a<T>> list, AbstractC33957b<T> bVar) {
        this.f87540b = new ArrayList();
        this.f87542d = false;
        this.f87543e = false;
        this.f87546h = new ArrayList();
        this.f87539a = eVar;
        this.f87545g = list;
        this.f87544f = bVar;
        m131416c(iVar);
    }
}
