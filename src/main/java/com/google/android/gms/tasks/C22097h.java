package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.h */
final class C22097h extends AbstractC22083a {

    /* renamed from: a */
    private final C22085ab<Void> f53739a = new C22085ab<>();

    C22097h() {
    }

    @Override // com.google.android.gms.tasks.AbstractC22083a
    /* renamed from: a */
    public final boolean mo75030a() {
        return this.f53739a.isComplete();
    }

    @Override // com.google.android.gms.tasks.AbstractC22083a
    /* renamed from: a */
    public final AbstractC22083a mo75029a(AbstractC22094f fVar) {
        this.f53739a.addOnSuccessListener(new C22098i(this, fVar));
        return this;
    }

    /* renamed from: b */
    public final void mo75043b() {
        this.f53739a.mo75036b((Void) null);
    }
}
