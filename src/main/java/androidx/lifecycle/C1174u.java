package androidx.lifecycle;

import androidx.p011a.p012a.p014b.C0186b;
import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.lifecycle.u */
public class C1174u<T> extends C1177w<T> {

    /* renamed from: a */
    private C0186b<LiveData<?>, C1175a<?>> f4297a = new C0186b<>();

    /* renamed from: androidx.lifecycle.u$a */
    private static class C1175a<V> implements AbstractC1178x<V> {

        /* renamed from: a */
        final LiveData<V> f4298a;

        /* renamed from: b */
        final AbstractC1178x<? super V> f4299b;

        /* renamed from: c */
        int f4300c = -1;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6043a() {
            this.f4298a.mo5925a(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo6044b() {
            this.f4298a.mo5928b(this);
        }

        @Override // androidx.lifecycle.AbstractC1178x
        public void onChanged(V v) {
            if (this.f4300c != this.f4298a.mo5930c()) {
                this.f4300c = this.f4298a.mo5930c();
                this.f4299b.onChanged(v);
            }
        }

        C1175a(LiveData<V> liveData, AbstractC1178x<? super V> xVar) {
            this.f4298a = liveData;
            this.f4299b = xVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    /* renamed from: a */
    public void mo5920a() {
        Iterator<Map.Entry<LiveData<?>, C1175a<?>>> it = this.f4297a.iterator();
        while (it.hasNext()) {
            it.next().getValue().mo6043a();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    /* renamed from: d */
    public void mo5931d() {
        Iterator<Map.Entry<LiveData<?>, C1175a<?>>> it = this.f4297a.iterator();
        while (it.hasNext()) {
            it.next().getValue().mo6044b();
        }
    }

    /* renamed from: a */
    public <S> void mo6041a(LiveData<S> liveData) {
        C1175a<?> b = this.f4297a.mo557b(liveData);
        if (b != null) {
            b.mo6044b();
        }
    }

    /* renamed from: a */
    public <S> void mo6042a(LiveData<S> liveData, AbstractC1178x<? super S> xVar) {
        C1175a<?> aVar = new C1175a<>(liveData, xVar);
        C1175a<?> a = this.f4297a.mo556a(liveData, aVar);
        if (a != null && a.f4299b != xVar) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        } else if (a == null && mo5932e()) {
            aVar.mo6043a();
        }
    }
}
