package okio;

import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
/* renamed from: okio.n */
public final class C69714n extends C69724v {

    /* renamed from: a */
    private C69724v f174155a;

    /* renamed from: b */
    private boolean f174156b;

    /* renamed from: c */
    private long f174157c;

    /* renamed from: d */
    private long f174158d;

    C69714n() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo244601a() {
        this.f174155a.timeout(this.f174158d, TimeUnit.NANOSECONDS);
        if (this.f174156b) {
            this.f174155a.deadlineNanoTime(this.f174157c);
        } else {
            this.f174155a.clearDeadline();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo244602a(C69724v vVar) {
        long j;
        this.f174155a = vVar;
        boolean hasDeadline = vVar.hasDeadline();
        this.f174156b = hasDeadline;
        if (hasDeadline) {
            j = vVar.deadlineNanoTime();
        } else {
            j = -1;
        }
        this.f174157c = j;
        long timeoutNanos = vVar.timeoutNanos();
        this.f174158d = timeoutNanos;
        vVar.timeout(minTimeout(timeoutNanos, timeoutNanos()), TimeUnit.NANOSECONDS);
        if (this.f174156b && hasDeadline()) {
            vVar.deadlineNanoTime(Math.min(deadlineNanoTime(), this.f174157c));
        } else if (hasDeadline()) {
            vVar.deadlineNanoTime(deadlineNanoTime());
        }
    }
}
