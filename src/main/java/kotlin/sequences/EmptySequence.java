package kotlin.sequences;

import com.ss.android.vesdk.C64034n;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.EmptyIterator;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0002J\u0010\u0010\n\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"Lkotlin/sequences/EmptySequence;", "Lkotlin/sequences/Sequence;", "", "Lkotlin/sequences/DropTakeSequence;", "()V", "drop", C64034n.f161683a, "", "iterator", "", "take", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlin.sequences.d */
final class EmptySequence implements DropTakeSequence, Sequence {

    /* renamed from: a */
    public static final EmptySequence f173287a = new EmptySequence();

    private EmptySequence() {
    }

    @Override // kotlin.sequences.Sequence
    /* renamed from: a */
    public Iterator mo4717a() {
        return EmptyIterator.f173089a;
    }

    /* renamed from: c */
    public EmptySequence mo242503a(int i) {
        return f173287a;
    }

    /* renamed from: d */
    public EmptySequence mo242504b(int i) {
        return f173287a;
    }
}
