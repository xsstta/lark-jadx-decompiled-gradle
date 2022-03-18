package okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: okio.h */
public class C69702h extends C69724v {

    /* renamed from: a */
    private C69724v f174126a;

    /* renamed from: a */
    public final C69724v mo244584a() {
        return this.f174126a;
    }

    @Override // okio.C69724v
    public C69724v clearDeadline() {
        return this.f174126a.clearDeadline();
    }

    @Override // okio.C69724v
    public C69724v clearTimeout() {
        return this.f174126a.clearTimeout();
    }

    @Override // okio.C69724v
    public long deadlineNanoTime() {
        return this.f174126a.deadlineNanoTime();
    }

    @Override // okio.C69724v
    public boolean hasDeadline() {
        return this.f174126a.hasDeadline();
    }

    @Override // okio.C69724v
    public void throwIfReached() throws IOException {
        this.f174126a.throwIfReached();
    }

    @Override // okio.C69724v
    public long timeoutNanos() {
        return this.f174126a.timeoutNanos();
    }

    public C69702h(C69724v vVar) {
        if (vVar != null) {
            this.f174126a = vVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    /* renamed from: a */
    public final C69702h mo244583a(C69724v vVar) {
        if (vVar != null) {
            this.f174126a = vVar;
            return this;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // okio.C69724v
    public C69724v deadlineNanoTime(long j) {
        return this.f174126a.deadlineNanoTime(j);
    }

    @Override // okio.C69724v
    public C69724v timeout(long j, TimeUnit timeUnit) {
        return this.f174126a.timeout(j, timeUnit);
    }
}
