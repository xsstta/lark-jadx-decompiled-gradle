package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.Segment;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b@\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\u0014\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0010\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000ø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/internal/SegmentOrClosed;", "S", "Lkotlinx/coroutines/internal/Segment;", "", "value", "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "isClosed", "", "isClosed-impl", "(Ljava/lang/Object;)Z", "segment", "segment$annotations", "()V", "getSegment-impl", "(Ljava/lang/Object;)Lkotlinx/coroutines/internal/Segment;", "equals", "other", "hashCode", "", "toString", "", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.internal.z */
public final class SegmentOrClosed<S extends Segment<S>> {

    /* renamed from: a */
    private final Object f173867a;

    /* renamed from: a */
    public static boolean m267129a(Object obj, Object obj2) {
        return (obj2 instanceof SegmentOrClosed) && Intrinsics.areEqual(obj, ((SegmentOrClosed) obj2).mo243057a());
    }

    /* renamed from: c */
    public static Object m267131c(Object obj) {
        return obj;
    }

    /* renamed from: d */
    public static String m267132d(Object obj) {
        return "SegmentOrClosed(value=" + obj + ")";
    }

    /* renamed from: e */
    public static int m267133e(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo243057a() {
        return this.f173867a;
    }

    public int hashCode() {
        return m267133e(this.f173867a);
    }

    public String toString() {
        return m267132d(this.f173867a);
    }

    /* renamed from: a */
    public static final boolean m267128a(Object obj) {
        if (obj == ConcurrentLinkedListNode.f173823a) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        return m267129a(this.f173867a, obj);
    }

    /* renamed from: b */
    public static final S m267130b(Object obj) {
        if (obj == ConcurrentLinkedListNode.f173823a) {
            throw new IllegalStateException("Does not contain segment".toString());
        } else if (obj != null) {
            return (S) ((Segment) obj);
        } else {
            throw new TypeCastException("null cannot be cast to non-null type S");
        }
    }
}
