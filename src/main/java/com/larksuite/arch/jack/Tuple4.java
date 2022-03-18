package com.larksuite.arch.jack;

import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.ttvecamera.p3038g.C60375c;
import com.ss.android.vc.statistics.p3180a.C63690d;
import com.ss.android.vesdk.p3188b.C63954b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\u0004\b\u0003\u0010\u00042\u00020\u0005B%\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00028\u0001\u0012\u0006\u0010\b\u001a\u00028\u0002\u0012\u0006\u0010\t\u001a\u00028\u0003¢\u0006\u0002\u0010\nJ\u000e\u0010\u0011\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\fJ\u000e\u0010\u0012\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\fJ\u000e\u0010\u0013\u001a\u00028\u0002HÆ\u0003¢\u0006\u0002\u0010\fJ\u000e\u0010\u0014\u001a\u00028\u0003HÆ\u0003¢\u0006\u0002\u0010\fJN\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u00002\b\b\u0002\u0010\u0007\u001a\u00028\u00012\b\b\u0002\u0010\b\u001a\u00028\u00022\b\b\u0002\u0010\t\u001a\u00028\u0003HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0013\u0010\u0006\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0007\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\b\u001a\u00028\u0002¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\t\u001a\u00028\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0010\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/larksuite/arch/jack/Tuple4;", "A", "B", "C", "D", "", AbstractC60044a.f149675a, C63954b.f161494a, C60375c.f150914a, C63690d.f160779a, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "getA", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getB", "getC", "getD", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/larksuite/arch/jack/Tuple4;", "equals", "", "other", "hashCode", "", "toString", "", "jack_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.arch.jack.aa */
public final class Tuple4<A, B, C, D> {

    /* renamed from: a */
    private final A f59402a;

    /* renamed from: b */
    private final B f59403b;

    /* renamed from: c */
    private final C f59404c;

    /* renamed from: d */
    private final D f59405d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tuple4)) {
            return false;
        }
        Tuple4 aaVar = (Tuple4) obj;
        return Intrinsics.areEqual(this.f59402a, aaVar.f59402a) && Intrinsics.areEqual(this.f59403b, aaVar.f59403b) && Intrinsics.areEqual(this.f59404c, aaVar.f59404c) && Intrinsics.areEqual(this.f59405d, aaVar.f59405d);
    }

    public int hashCode() {
        A a = this.f59402a;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f59403b;
        int hashCode2 = (hashCode + (b != null ? b.hashCode() : 0)) * 31;
        C c = this.f59404c;
        int hashCode3 = (hashCode2 + (c != null ? c.hashCode() : 0)) * 31;
        D d = this.f59405d;
        if (d != null) {
            i = d.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "Tuple4(a=" + ((Object) this.f59402a) + ", b=" + ((Object) this.f59403b) + ", c=" + ((Object) this.f59404c) + ", d=" + ((Object) this.f59405d) + ")";
    }

    public Tuple4(A a, B b, C c, D d) {
        this.f59402a = a;
        this.f59403b = b;
        this.f59404c = c;
        this.f59405d = d;
    }
}
