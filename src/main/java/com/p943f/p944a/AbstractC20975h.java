package com.p943f.p944a;

import android.view.View;
import com.p943f.p944a.C20972g;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.f.a.h */
public abstract class AbstractC20975h<VH extends C20972g> implements AbstractC20966c {

    /* renamed from: b */
    private static AtomicLong f51347b = new AtomicLong(0);

    /* renamed from: a */
    protected AbstractC20970e f51348a;

    /* renamed from: c */
    private final long f51349c;

    /* renamed from: d */
    private Map<String, Object> f51350d;

    /* renamed from: a */
    public abstract int mo71038a();

    /* renamed from: a */
    public int mo71039a(int i, int i2) {
        return i;
    }

    /* renamed from: a */
    public abstract void mo71041a(VH vh, int i);

    /* renamed from: b */
    public int mo71045b() {
        return 0;
    }

    /* renamed from: b */
    public void mo71046b(VH vh) {
    }

    @Override // com.p943f.p944a.AbstractC20966c
    /* renamed from: c */
    public int mo71007c(AbstractC20975h hVar) {
        return this == hVar ? 0 : -1;
    }

    /* renamed from: c */
    public void mo71048c(VH vh) {
    }

    /* renamed from: c */
    public boolean mo71049c() {
        return true;
    }

    /* renamed from: d */
    public Object mo71050d(AbstractC20975h hVar) {
        return null;
    }

    @Override // com.p943f.p944a.AbstractC20966c
    /* renamed from: u */
    public int mo71008u() {
        return 1;
    }

    /* renamed from: v */
    public boolean mo71051v() {
        return true;
    }

    /* renamed from: w */
    public int mo71052w() {
        return 0;
    }

    /* renamed from: y */
    public boolean mo71054y() {
        return true;
    }

    /* renamed from: z */
    public long mo71055z() {
        return this.f51349c;
    }

    /* renamed from: x */
    public int mo71053x() {
        return mo71038a();
    }

    public AbstractC20975h() {
        this(f51347b.decrementAndGet());
    }

    /* renamed from: b */
    public VH mo71003b(View view) {
        return (VH) new C20972g(view);
    }

    @Override // com.p943f.p944a.AbstractC20966c
    /* renamed from: a */
    public void mo71005a(AbstractC20970e eVar) {
        this.f51348a = eVar;
    }

    @Override // com.p943f.p944a.AbstractC20966c
    /* renamed from: b */
    public void mo71006b(AbstractC20970e eVar) {
        this.f51348a = null;
    }

    protected AbstractC20975h(long j) {
        this.f51350d = new HashMap();
        this.f51349c = j;
    }

    @Override // com.p943f.p944a.AbstractC20966c
    /* renamed from: a */
    public AbstractC20975h mo71004a(int i) {
        if (i == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("Wanted item at position " + i + " but an Item is a Group of size 1");
    }

    /* renamed from: a */
    public void mo71040a(VH vh) {
        vh.mo71032h();
    }

    /* renamed from: b */
    public boolean mo71047b(AbstractC20975h hVar) {
        return equals(hVar);
    }

    /* renamed from: a */
    public boolean mo71044a(AbstractC20975h hVar) {
        if (mo71053x() == hVar.mo71053x() && mo71055z() == hVar.mo71055z()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo71042a(VH vh, int i, List<Object> list) {
        mo71041a(vh, i);
    }

    /* renamed from: a */
    public void mo71043a(VH vh, int i, List<Object> list, AbstractC20979j jVar, AbstractC20980k kVar) {
        vh.mo71031a(this, jVar, kVar);
        mo71042a(vh, i, list);
    }
}
