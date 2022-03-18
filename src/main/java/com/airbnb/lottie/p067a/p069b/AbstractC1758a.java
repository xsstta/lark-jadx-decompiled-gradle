package com.airbnb.lottie.p067a.p069b;

import com.airbnb.lottie.C1783c;
import com.airbnb.lottie.p072d.C1793a;
import com.airbnb.lottie.p072d.C1795c;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.a */
public abstract class AbstractC1758a<K, A> {

    /* renamed from: a */
    final List<AbstractC1760a> f6046a = new ArrayList(1);

    /* renamed from: b */
    protected float f6047b = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: c */
    protected C1795c<A> f6048c;

    /* renamed from: d */
    private boolean f6049d = false;

    /* renamed from: e */
    private final AbstractC1762c<K> f6050e;

    /* renamed from: f */
    private A f6051f = null;

    /* renamed from: g */
    private float f6052g = -1.0f;

    /* renamed from: h */
    private float f6053h = -1.0f;

    /* renamed from: com.airbnb.lottie.a.b.a$a */
    public interface AbstractC1760a {
        /* renamed from: a */
        void mo8931a();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.airbnb.lottie.a.b.a$c */
    public interface AbstractC1762c<T> {
        /* renamed from: a */
        boolean mo8962a();

        /* renamed from: a */
        boolean mo8963a(float f);

        /* renamed from: b */
        C1793a<T> mo8964b();

        /* renamed from: b */
        boolean mo8965b(float f);

        /* renamed from: c */
        float mo8966c();

        /* renamed from: d */
        float mo8967d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract A mo8950a(C1793a<K> aVar, float f);

    /* access modifiers changed from: private */
    /* renamed from: com.airbnb.lottie.a.b.a$b */
    public static final class C1761b<T> implements AbstractC1762c<T> {
        @Override // com.airbnb.lottie.p067a.p069b.AbstractC1758a.AbstractC1762c
        /* renamed from: a */
        public boolean mo8962a() {
            return true;
        }

        @Override // com.airbnb.lottie.p067a.p069b.AbstractC1758a.AbstractC1762c
        /* renamed from: a */
        public boolean mo8963a(float f) {
            return false;
        }

        @Override // com.airbnb.lottie.p067a.p069b.AbstractC1758a.AbstractC1762c
        /* renamed from: c */
        public float mo8966c() {
            return BitmapDescriptorFactory.HUE_RED;
        }

        @Override // com.airbnb.lottie.p067a.p069b.AbstractC1758a.AbstractC1762c
        /* renamed from: d */
        public float mo8967d() {
            return 1.0f;
        }

        private C1761b() {
        }

        @Override // com.airbnb.lottie.p067a.p069b.AbstractC1758a.AbstractC1762c
        /* renamed from: b */
        public C1793a<T> mo8964b() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.airbnb.lottie.p067a.p069b.AbstractC1758a.AbstractC1762c
        /* renamed from: b */
        public boolean mo8965b(float f) {
            throw new IllegalStateException("not implemented");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.airbnb.lottie.a.b.a$d */
    public static final class C1763d<T> implements AbstractC1762c<T> {

        /* renamed from: a */
        private final List<? extends C1793a<T>> f6054a;

        /* renamed from: b */
        private C1793a<T> f6055b;

        /* renamed from: c */
        private C1793a<T> f6056c;

        /* renamed from: d */
        private float f6057d = -1.0f;

        @Override // com.airbnb.lottie.p067a.p069b.AbstractC1758a.AbstractC1762c
        /* renamed from: a */
        public boolean mo8962a() {
            return false;
        }

        @Override // com.airbnb.lottie.p067a.p069b.AbstractC1758a.AbstractC1762c
        /* renamed from: b */
        public C1793a<T> mo8964b() {
            return this.f6055b;
        }

        @Override // com.airbnb.lottie.p067a.p069b.AbstractC1758a.AbstractC1762c
        /* renamed from: c */
        public float mo8966c() {
            return ((C1793a) this.f6054a.get(0)).mo9074c();
        }

        @Override // com.airbnb.lottie.p067a.p069b.AbstractC1758a.AbstractC1762c
        /* renamed from: d */
        public float mo8967d() {
            List<? extends C1793a<T>> list = this.f6054a;
            return ((C1793a) list.get(list.size() - 1)).mo9075d();
        }

        C1763d(List<? extends C1793a<T>> list) {
            this.f6054a = list;
            this.f6055b = m7885c(BitmapDescriptorFactory.HUE_RED);
        }

        @Override // com.airbnb.lottie.p067a.p069b.AbstractC1758a.AbstractC1762c
        /* renamed from: a */
        public boolean mo8963a(float f) {
            if (this.f6055b.mo9073a(f)) {
                return !this.f6055b.mo9076e();
            }
            this.f6055b = m7885c(f);
            return true;
        }

        @Override // com.airbnb.lottie.p067a.p069b.AbstractC1758a.AbstractC1762c
        /* renamed from: b */
        public boolean mo8965b(float f) {
            C1793a<T> aVar = this.f6056c;
            C1793a<T> aVar2 = this.f6055b;
            if (aVar == aVar2 && this.f6057d == f) {
                return true;
            }
            this.f6056c = aVar2;
            this.f6057d = f;
            return false;
        }

        /* renamed from: c */
        private C1793a<T> m7885c(float f) {
            List<? extends C1793a<T>> list = this.f6054a;
            C1793a<T> aVar = (C1793a) list.get(list.size() - 1);
            if (f >= aVar.mo9074c()) {
                return aVar;
            }
            for (int size = this.f6054a.size() - 2; size >= 1; size--) {
                C1793a<T> aVar2 = (C1793a) this.f6054a.get(size);
                if (this.f6055b != aVar2 && aVar2.mo9073a(f)) {
                    return aVar2;
                }
            }
            return (C1793a) this.f6054a.get(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.airbnb.lottie.a.b.a$e */
    public static final class C1764e<T> implements AbstractC1762c<T> {

        /* renamed from: a */
        private final C1793a<T> f6058a;

        /* renamed from: b */
        private float f6059b = -1.0f;

        @Override // com.airbnb.lottie.p067a.p069b.AbstractC1758a.AbstractC1762c
        /* renamed from: a */
        public boolean mo8962a() {
            return false;
        }

        @Override // com.airbnb.lottie.p067a.p069b.AbstractC1758a.AbstractC1762c
        /* renamed from: b */
        public C1793a<T> mo8964b() {
            return this.f6058a;
        }

        @Override // com.airbnb.lottie.p067a.p069b.AbstractC1758a.AbstractC1762c
        /* renamed from: c */
        public float mo8966c() {
            return this.f6058a.mo9074c();
        }

        @Override // com.airbnb.lottie.p067a.p069b.AbstractC1758a.AbstractC1762c
        /* renamed from: d */
        public float mo8967d() {
            return this.f6058a.mo9075d();
        }

        @Override // com.airbnb.lottie.p067a.p069b.AbstractC1758a.AbstractC1762c
        /* renamed from: a */
        public boolean mo8963a(float f) {
            return !this.f6058a.mo9076e();
        }

        @Override // com.airbnb.lottie.p067a.p069b.AbstractC1758a.AbstractC1762c
        /* renamed from: b */
        public boolean mo8965b(float f) {
            if (this.f6059b == f) {
                return true;
            }
            this.f6059b = f;
            return false;
        }

        C1764e(List<? extends C1793a<T>> list) {
            this.f6058a = (C1793a) list.get(0);
        }
    }

    /* renamed from: h */
    public float mo8961h() {
        return this.f6047b;
    }

    /* renamed from: a */
    public void mo8951a() {
        this.f6049d = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C1793a<K> mo8956c() {
        C1783c.m7956a("BaseKeyframeAnimation#getCurrentKeyframe");
        C1793a<K> b = this.f6050e.mo8964b();
        C1783c.m7957b("BaseKeyframeAnimation#getCurrentKeyframe");
        return b;
    }

    /* renamed from: i */
    private float mo8970i() {
        if (this.f6052g == -1.0f) {
            this.f6052g = this.f6050e.mo8966c();
        }
        return this.f6052g;
    }

    /* renamed from: b */
    public void mo8955b() {
        for (int i = 0; i < this.f6046a.size(); i++) {
            this.f6046a.get(i).mo8931a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public float mo8958e() {
        C1793a<K> c = mo8956c();
        if (c.mo9076e()) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return c.f6149c.getInterpolation(mo8957d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public float mo8959f() {
        if (this.f6053h == -1.0f) {
            this.f6053h = this.f6050e.mo8967d();
        }
        return this.f6053h;
    }

    /* renamed from: g */
    public A mo8960g() {
        float e = mo8958e();
        if (this.f6048c == null && this.f6050e.mo8965b(e)) {
            return this.f6051f;
        }
        A a = mo8950a(mo8956c(), e);
        this.f6051f = a;
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public float mo8957d() {
        if (this.f6049d) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        C1793a<K> c = mo8956c();
        if (c.mo9076e()) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return (this.f6047b - c.mo9074c()) / (c.mo9075d() - c.mo9074c());
    }

    /* renamed from: a */
    public void mo8953a(AbstractC1760a aVar) {
        this.f6046a.add(aVar);
    }

    /* renamed from: a */
    private static <T> AbstractC1762c<T> m7858a(List<? extends C1793a<T>> list) {
        if (list.isEmpty()) {
            return new C1761b();
        }
        if (list.size() == 1) {
            return new C1764e(list);
        }
        return new C1763d(list);
    }

    AbstractC1758a(List<? extends C1793a<K>> list) {
        this.f6050e = m7858a(list);
    }

    /* renamed from: a */
    public void mo8952a(float f) {
        if (!this.f6050e.mo8962a()) {
            if (f < mo8970i()) {
                f = mo8970i();
            } else if (f > mo8959f()) {
                f = mo8959f();
            }
            if (f != this.f6047b) {
                this.f6047b = f;
                if (this.f6050e.mo8963a(f)) {
                    mo8955b();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo8954a(C1795c<A> cVar) {
        C1795c<A> cVar2 = this.f6048c;
        if (cVar2 != null) {
            cVar2.mo9084a((AbstractC1758a<?, ?>) null);
        }
        this.f6048c = cVar;
        if (cVar != null) {
            cVar.mo9084a((AbstractC1758a<?, ?>) this);
        }
    }
}
