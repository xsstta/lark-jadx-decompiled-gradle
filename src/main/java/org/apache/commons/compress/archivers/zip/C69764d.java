package org.apache.commons.compress.archivers.zip;

/* renamed from: org.apache.commons.compress.archivers.zip.d */
public final class C69764d implements Cloneable {

    /* renamed from: a */
    private boolean f174269a;

    /* renamed from: b */
    private boolean f174270b;

    /* renamed from: c */
    private boolean f174271c;

    /* renamed from: d */
    private boolean f174272d;

    @Override // java.lang.Object
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("GeneralPurposeBit is not Cloneable?", e);
        }
    }

    public int hashCode() {
        return (((((((this.f174271c ? 1 : 0) * 17) + (this.f174272d ? 1 : 0)) * 13) + (this.f174269a ? 1 : 0)) * 7) + (this.f174270b ? 1 : 0)) * 3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C69764d)) {
            return false;
        }
        C69764d dVar = (C69764d) obj;
        if (dVar.f174271c == this.f174271c && dVar.f174272d == this.f174272d && dVar.f174269a == this.f174269a && dVar.f174270b == this.f174270b) {
            return true;
        }
        return false;
    }
}
