package pl.droidsonroids.gif;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
/* renamed from: pl.droidsonroids.gif.k */
public class C70167k extends AbstractRunnableC70168l {
    @Override // pl.droidsonroids.gif.AbstractRunnableC70168l
    /* renamed from: a */
    public void mo247310a() {
        long a = this.f175285c.f175253f.mo247196a(this.f175285c.f175252e);
        if (a >= 0) {
            this.f175285c.f175250c = SystemClock.uptimeMillis() + a;
            if (this.f175285c.isVisible() && this.f175285c.f175249b && !this.f175285c.f175255h) {
                this.f175285c.f175248a.remove(this);
                this.f175285c.f175257j = this.f175285c.f175248a.schedule(this, a, TimeUnit.MILLISECONDS);
            }
            if (!this.f175285c.f175254g.isEmpty() && this.f175285c.mo247281f() == this.f175285c.f175253f.mo247220r() - 1) {
                this.f175285c.f175256i.sendEmptyMessageAtTime(this.f175285c.mo247282g(), this.f175285c.f175250c);
            }
        } else {
            this.f175285c.f175250c = Long.MIN_VALUE;
            this.f175285c.f175249b = false;
        }
        if (this.f175285c.isVisible() && !this.f175285c.f175256i.hasMessages(-1)) {
            this.f175285c.f175256i.sendEmptyMessageAtTime(-1, 0);
        }
    }

    C70167k(C70149c cVar) {
        super(cVar);
    }
}
