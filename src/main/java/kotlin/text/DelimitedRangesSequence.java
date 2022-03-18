package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012:\u0010\b\u001a6\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r0\t¢\u0006\u0002\b\u000e¢\u0006\u0002\u0010\u000fJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0002RB\u0010\b\u001a6\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r0\t¢\u0006\u0002\b\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lkotlin/text/DelimitedRangesSequence;", "Lkotlin/sequences/Sequence;", "Lkotlin/ranges/IntRange;", "input", "", "startIndex", "", "limit", "getNextMatch", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "currentIndex", "Lkotlin/Pair;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/CharSequence;IILkotlin/jvm/functions/Function2;)V", "iterator", "", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlin.text.e */
public final class DelimitedRangesSequence implements Sequence<IntRange> {

    /* renamed from: a */
    public final CharSequence f173348a;

    /* renamed from: b */
    public final int f173349b;

    /* renamed from: c */
    public final int f173350c;

    /* renamed from: d */
    public final Function2<CharSequence, Integer, Pair<Integer, Integer>> f173351d;

    @Override // kotlin.sequences.Sequence
    /* renamed from: a */
    public Iterator<IntRange> mo4717a() {
        return new C69324a(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\t\u0010\u0019\u001a\u00020\u001aH\u0002J\t\u0010\u001b\u001a\u00020\u0002H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\bR\u001a\u0010\u0014\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\b¨\u0006\u001c"}, d2 = {"kotlin/text/DelimitedRangesSequence$iterator$1", "", "Lkotlin/ranges/IntRange;", "counter", "", "getCounter", "()I", "setCounter", "(I)V", "currentStartIndex", "getCurrentStartIndex", "setCurrentStartIndex", "nextItem", "getNextItem", "()Lkotlin/ranges/IntRange;", "setNextItem", "(Lkotlin/ranges/IntRange;)V", "nextSearchIndex", "getNextSearchIndex", "setNextSearchIndex", "nextState", "getNextState", "setNextState", "calcNext", "", "hasNext", "", "next", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlin.text.e$a */
    public static final class C69324a implements Iterator<IntRange>, KMappedMarker {

        /* renamed from: a */
        final /* synthetic */ DelimitedRangesSequence f173352a;

        /* renamed from: b */
        private int f173353b = -1;

        /* renamed from: c */
        private int f173354c;

        /* renamed from: d */
        private int f173355d;

        /* renamed from: e */
        private IntRange f173356e;

        /* renamed from: f */
        private int f173357f;

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasNext() {
            if (this.f173353b == -1) {
                m266168b();
            }
            if (this.f173353b == 1) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public IntRange next() {
            if (this.f173353b == -1) {
                m266168b();
            }
            if (this.f173353b != 0) {
                IntRange kVar = this.f173356e;
                if (kVar != null) {
                    this.f173356e = null;
                    this.f173353b = -1;
                    return kVar;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.ranges.IntRange");
            }
            throw new NoSuchElementException();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001f, code lost:
            if (r0 < r6.f173352a.f173350c) goto L_0x0021;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void m266168b() {
            /*
            // Method dump skipped, instructions count: 147
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.DelimitedRangesSequence.C69324a.m266168b():void");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C69324a(DelimitedRangesSequence eVar) {
            this.f173352a = eVar;
            int coerceIn = RangesKt.coerceIn(eVar.f173349b, 0, eVar.f173348a.length());
            this.f173354c = coerceIn;
            this.f173355d = coerceIn;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.k<? super java.lang.CharSequence, ? super java.lang.Integer, kotlin.Pair<java.lang.Integer, java.lang.Integer>> */
    /* JADX WARN: Multi-variable type inference failed */
    public DelimitedRangesSequence(CharSequence charSequence, int i, int i2, Function2<? super CharSequence, ? super Integer, Pair<Integer, Integer>> kVar) {
        Intrinsics.checkParameterIsNotNull(charSequence, "input");
        Intrinsics.checkParameterIsNotNull(kVar, "getNextMatch");
        this.f173348a = charSequence;
        this.f173349b = i;
        this.f173350c = i2;
        this.f173351d = kVar;
    }
}
