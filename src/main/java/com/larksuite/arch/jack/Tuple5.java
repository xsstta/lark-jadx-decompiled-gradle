package com.larksuite.arch.jack;

import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.ttvecamera.p3038g.C60375c;
import com.ss.android.vc.statistics.p3180a.C63690d;
import com.ss.android.vesdk.p3188b.C63954b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\u0004\b\u0003\u0010\u0004*\u0004\b\u0004\u0010\u00052\u00020\u0006B-\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\u0006\u0010\b\u001a\u00028\u0001\u0012\u0006\u0010\t\u001a\u00028\u0002\u0012\u0006\u0010\n\u001a\u00028\u0003\u0012\u0006\u0010\u000b\u001a\u00028\u0004¢\u0006\u0002\u0010\fJ\u000e\u0010\u0014\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u0015\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u0016\u001a\u00028\u0002HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u0017\u001a\u00028\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u0018\u001a\u00028\u0004HÆ\u0003¢\u0006\u0002\u0010\u000eJ^\u0010\u0019\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u00002\b\b\u0002\u0010\u0007\u001a\u00028\u00002\b\b\u0002\u0010\b\u001a\u00028\u00012\b\b\u0002\u0010\t\u001a\u00028\u00022\b\b\u0002\u0010\n\u001a\u00028\u00032\b\b\u0002\u0010\u000b\u001a\u00028\u0004HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0013\u0010\u0007\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\t\u001a\u00028\u0002¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\n\u001a\u00028\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\u000b\u001a\u00028\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0013\u0010\u000e¨\u0006\""}, d2 = {"Lcom/larksuite/arch/jack/Tuple5;", "A", "B", "C", "D", "E", "", AbstractC60044a.f149675a, C63954b.f161494a, C60375c.f150914a, C63690d.f160779a, "e", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "getA", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getB", "getC", "getD", "getE", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/larksuite/arch/jack/Tuple5;", "equals", "", "other", "hashCode", "", "toString", "", "jack_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.arch.jack.ab */
public final class Tuple5<A, B, C, D, E> {

    /* renamed from: a */
    private final A f59406a;

    /* renamed from: b */
    private final B f59407b;

    /* renamed from: c */
    private final C f59408c;

    /* renamed from: d */
    private final D f59409d;

    /* renamed from: e */
    private final E f59410e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tuple5)) {
            return false;
        }
        Tuple5 abVar = (Tuple5) obj;
        return Intrinsics.areEqual(this.f59406a, abVar.f59406a) && Intrinsics.areEqual(this.f59407b, abVar.f59407b) && Intrinsics.areEqual(this.f59408c, abVar.f59408c) && Intrinsics.areEqual(this.f59409d, abVar.f59409d) && Intrinsics.areEqual(this.f59410e, abVar.f59410e);
    }

    public int hashCode() {
        A a = this.f59406a;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f59407b;
        int hashCode2 = (hashCode + (b != null ? b.hashCode() : 0)) * 31;
        C c = this.f59408c;
        int hashCode3 = (hashCode2 + (c != null ? c.hashCode() : 0)) * 31;
        D d = this.f59409d;
        int hashCode4 = (hashCode3 + (d != null ? d.hashCode() : 0)) * 31;
        E e = this.f59410e;
        if (e != null) {
            i = e.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "Tuple5(a=" + ((Object) this.f59406a) + ", b=" + ((Object) this.f59407b) + ", c=" + ((Object) this.f59408c) + ", d=" + ((Object) this.f59409d) + ", e=" + ((Object) this.f59410e) + ")";
    }

    public Tuple5(A a, B b, C c, D d, E e) {
        this.f59406a = a;
        this.f59407b = b;
        this.f59408c = c;
        this.f59409d = d;
        this.f59410e = e;
    }
}
