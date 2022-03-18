package androidx.p011a.p012a.p013a;

/* renamed from: androidx.a.a.a.c */
public abstract class AbstractC0184c {
    /* renamed from: a */
    public abstract void mo548a(Runnable runnable);

    /* renamed from: b */
    public abstract void mo549b(Runnable runnable);

    /* renamed from: c */
    public abstract boolean mo550c();

    /* renamed from: c */
    public void mo554c(Runnable runnable) {
        if (mo550c()) {
            runnable.run();
        } else {
            mo549b(runnable);
        }
    }
}
