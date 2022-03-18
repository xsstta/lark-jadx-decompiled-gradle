package androidx.room;

import androidx.p038g.p039a.AbstractC1090f;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.room.i */
public abstract class AbstractC1440i {

    /* renamed from: a */
    private final AtomicBoolean f5061a = new AtomicBoolean(false);

    /* renamed from: b */
    private final RoomDatabase f5062b;

    /* renamed from: c */
    private volatile AbstractC1090f f5063c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo7570a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7617b() {
        this.f5062b.mo7545f();
    }

    /* renamed from: d */
    private AbstractC1090f m6580d() {
        return this.f5062b.mo7534a(mo7570a());
    }

    /* renamed from: c */
    public AbstractC1090f mo7618c() {
        mo7617b();
        return m6579a(this.f5061a.compareAndSet(false, true));
    }

    public AbstractC1440i(RoomDatabase roomDatabase) {
        this.f5062b = roomDatabase;
    }

    /* renamed from: a */
    public void mo7616a(AbstractC1090f fVar) {
        if (fVar == this.f5063c) {
            this.f5061a.set(false);
        }
    }

    /* renamed from: a */
    private AbstractC1090f m6579a(boolean z) {
        if (!z) {
            return m6580d();
        }
        if (this.f5063c == null) {
            this.f5063c = m6580d();
        }
        return this.f5063c;
    }
}
