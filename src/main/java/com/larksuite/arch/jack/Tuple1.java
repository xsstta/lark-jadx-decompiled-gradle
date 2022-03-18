package com.larksuite.arch.jack;

import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/larksuite/arch/jack/Tuple1;", "A", "", AbstractC60044a.f149675a, "(Ljava/lang/Object;)V", "getA", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/larksuite/arch/jack/Tuple1;", "equals", "", "other", "hashCode", "", "toString", "", "jack_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.arch.jack.x */
public final class Tuple1<A> {

    /* renamed from: a */
    private final A f59442a;

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof Tuple1) && Intrinsics.areEqual(this.f59442a, ((Tuple1) obj).f59442a);
        }
        return true;
    }

    public int hashCode() {
        A a = this.f59442a;
        if (a != null) {
            return a.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "Tuple1(a=" + ((Object) this.f59442a) + ")";
    }

    public Tuple1(A a) {
        this.f59442a = a;
    }
}
