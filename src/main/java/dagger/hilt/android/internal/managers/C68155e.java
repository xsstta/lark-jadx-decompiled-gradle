package dagger.hilt.android.internal.managers;

import dagger.hilt.internal.AbstractC68167b;

/* renamed from: dagger.hilt.android.internal.managers.e */
public final class C68155e implements AbstractC68167b<Object> {

    /* renamed from: a */
    private volatile Object f171392a;

    /* renamed from: b */
    private final Object f171393b = new Object();

    /* renamed from: c */
    private final AbstractC68156f f171394c;

    @Override // dagger.hilt.internal.AbstractC68167b
    public Object generatedComponent() {
        if (this.f171392a == null) {
            synchronized (this.f171393b) {
                if (this.f171392a == null) {
                    this.f171392a = this.f171394c.mo102514a();
                }
            }
        }
        return this.f171392a;
    }

    public C68155e(AbstractC68156f fVar) {
        this.f171394c = fVar;
    }
}
