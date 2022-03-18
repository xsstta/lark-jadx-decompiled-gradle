package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlinx.coroutines.internal.Segment;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0012\u0004\u0012\u00028\u00000\u001bB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0010\u0010\u000bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00058&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\t8V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/internal/Segment;", "S", "", "id", "prev", "", "pointers", "<init>", "(JLkotlinx/coroutines/internal/Segment;I)V", "", "decPointers$kotlinx_coroutines_core", "()Z", "decPointers", "", "onSlotCleaned", "()V", "tryIncPointers$kotlinx_coroutines_core", "tryIncPointers", "J", "getId", "()J", "getMaxSlots", "()I", "maxSlots", "getRemoved", "removed", "kotlinx-coroutines-core", "Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.internal.y */
public abstract class Segment<S extends Segment<S>> extends ConcurrentLinkedListNode<S> {

    /* renamed from: a */
    private static final AtomicIntegerFieldUpdater f173865a = AtomicIntegerFieldUpdater.newUpdater(Segment.class, "cleanedAndPointers");

    /* renamed from: b */
    private final long f173866b;
    private volatile int cleanedAndPointers;

    /* renamed from: h */
    public abstract int mo243052h();

    /* renamed from: l */
    public final long mo243056l() {
        return this.f173866b;
    }

    @Override // kotlinx.coroutines.internal.ConcurrentLinkedListNode
    /* renamed from: f */
    public boolean mo242995f() {
        if (this.cleanedAndPointers != mo243052h() || mo242992c()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final boolean mo243054j() {
        if (f173865a.addAndGet(this, -65536) != mo243052h() || mo242992c()) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public final void mo243055k() {
        if (f173865a.incrementAndGet(this) == mo243052h() && !mo242992c()) {
            mo242996g();
        }
    }

    /* renamed from: i */
    public final boolean mo243053i() {
        int i;
        boolean z;
        do {
            i = this.cleanedAndPointers;
            if (i != mo243052h() || mo242992c()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
        } while (!f173865a.compareAndSet(this, i, 65536 + i));
        return true;
    }

    public Segment(long j, S s, int i) {
        super(s);
        this.f173866b = j;
        this.cleanedAndPointers = i << 16;
    }
}
