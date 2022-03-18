package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.LongIterator;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\b\u001a\u00020\tH\u0002J\b\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\u0007\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lkotlin/ranges/LongProgressionIterator;", "Lkotlin/collections/LongIterator;", "first", "", "last", "step", "(JJJ)V", "finalElement", "hasNext", "", "next", "getStep", "()J", "nextLong", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlin.ranges.m */
public final class LongProgressionIterator extends LongIterator {

    /* renamed from: a */
    private final long f173253a;

    /* renamed from: b */
    private boolean f173254b;

    /* renamed from: c */
    private long f173255c;

    /* renamed from: d */
    private final long f173256d;

    public boolean hasNext() {
        return this.f173254b;
    }

    @Override // kotlin.collections.LongIterator
    /* renamed from: b */
    public long mo238950b() {
        long j = this.f173255c;
        if (j != this.f173253a) {
            this.f173255c = this.f173256d + j;
        } else if (this.f173254b) {
            this.f173254b = false;
        } else {
            throw new NoSuchElementException();
        }
        return j;
    }

    public LongProgressionIterator(long j, long j2, long j3) {
        this.f173256d = j3;
        this.f173253a = j2;
        boolean z = true;
        int i = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
        int i2 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i <= 0 ? i2 < 0 : i2 > 0) {
            z = false;
        }
        this.f173254b = z;
        this.f173255c = !z ? j2 : j;
    }
}
