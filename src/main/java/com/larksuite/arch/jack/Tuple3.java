package com.larksuite.arch.jack;

import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.ttvecamera.p3038g.C60375c;
import com.ss.android.vesdk.p3188b.C63954b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u00020\u0004B\u001d\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0001\u0012\u0006\u0010\u0007\u001a\u00028\u0002¢\u0006\u0002\u0010\bJ\u000e\u0010\u000e\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\nJ\u000e\u0010\u000f\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\nJ\u000e\u0010\u0010\u001a\u00028\u0002HÆ\u0003¢\u0006\u0002\u0010\nJ>\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00028\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u00012\b\b\u0002\u0010\u0007\u001a\u00028\u0002HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0005\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0007\u001a\u00028\u0002¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/larksuite/arch/jack/Tuple3;", "A", "B", "C", "", AbstractC60044a.f149675a, C63954b.f161494a, C60375c.f150914a, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "getA", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getB", "getC", "component1", "component2", "component3", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/larksuite/arch/jack/Tuple3;", "equals", "", "other", "hashCode", "", "toString", "", "jack_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.arch.jack.z */
public final class Tuple3<A, B, C> {

    /* renamed from: a */
    private final A f59445a;

    /* renamed from: b */
    private final B f59446b;

    /* renamed from: c */
    private final C f59447c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tuple3)) {
            return false;
        }
        Tuple3 zVar = (Tuple3) obj;
        return Intrinsics.areEqual(this.f59445a, zVar.f59445a) && Intrinsics.areEqual(this.f59446b, zVar.f59446b) && Intrinsics.areEqual(this.f59447c, zVar.f59447c);
    }

    public int hashCode() {
        A a = this.f59445a;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f59446b;
        int hashCode2 = (hashCode + (b != null ? b.hashCode() : 0)) * 31;
        C c = this.f59447c;
        if (c != null) {
            i = c.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "Tuple3(a=" + ((Object) this.f59445a) + ", b=" + ((Object) this.f59446b) + ", c=" + ((Object) this.f59447c) + ")";
    }

    public Tuple3(A a, B b, C c) {
        this.f59445a = a;
        this.f59446b = b;
        this.f59447c = c;
    }
}
