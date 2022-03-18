package kotlin.io;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.Sequence;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lkotlin/io/LinesSequence;", "Lkotlin/sequences/Sequence;", "", "reader", "Ljava/io/BufferedReader;", "(Ljava/io/BufferedReader;)V", "iterator", "", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlin.io.l */
public final class LinesSequence implements Sequence<String> {

    /* renamed from: a */
    public final BufferedReader f173184a;

    @Override // kotlin.sequences.Sequence
    /* renamed from: a */
    public Iterator<String> mo4717a() {
        return new C69110a(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0006\u001a\u00020\u0004H\u0002J\t\u0010\u0007\u001a\u00020\u0002H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"kotlin/io/LinesSequence$iterator$1", "", "", "done", "", "nextValue", "hasNext", "next", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlin.io.l$a */
    public static final class C69110a implements Iterator<String>, KMappedMarker {

        /* renamed from: a */
        final /* synthetic */ LinesSequence f173185a;

        /* renamed from: b */
        private String f173186b;

        /* renamed from: c */
        private boolean f173187c;

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* renamed from: a */
        public String next() {
            if (hasNext()) {
                String str = this.f173186b;
                this.f173186b = null;
                if (str == null) {
                    Intrinsics.throwNpe();
                }
                return str;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.f173186b == null && !this.f173187c) {
                String readLine = this.f173185a.f173184a.readLine();
                this.f173186b = readLine;
                if (readLine == null) {
                    this.f173187c = true;
                }
            }
            if (this.f173186b != null) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C69110a(LinesSequence lVar) {
            this.f173185a = lVar;
        }
    }

    public LinesSequence(BufferedReader bufferedReader) {
        Intrinsics.checkParameterIsNotNull(bufferedReader, "reader");
        this.f173184a = bufferedReader;
    }
}
