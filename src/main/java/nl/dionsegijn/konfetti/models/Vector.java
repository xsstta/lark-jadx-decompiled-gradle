package nl.dionsegijn.konfetti.models;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.vesdk.C64034n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0000J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0003J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u000e\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u001c"}, d2 = {"Lnl/dionsegijn/konfetti/models/Vector;", "", "x", "", "y", "(FF)V", "getX", "()F", "setX", "(F)V", "getY", "setY", "add", "", "v", "component1", "component2", "copy", "div", C64034n.f161683a, "equals", "", "other", "hashCode", "", "mult", "toString", "", "konfetti_release"}, mo238835k = 1, mv = {1, 1, 10})
/* renamed from: nl.dionsegijn.konfetti.models.a */
public final class Vector {

    /* renamed from: a */
    private float f174106a;

    /* renamed from: b */
    private float f174107b;

    public Vector() {
        this(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 3, null);
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ Vector m267500a(Vector aVar, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = aVar.f174106a;
        }
        if ((i & 2) != 0) {
            f2 = aVar.f174107b;
        }
        return aVar.mo243596a(f, f2);
    }

    /* renamed from: a */
    public final Vector mo243596a(float f, float f2) {
        return new Vector(f, f2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Vector)) {
            return false;
        }
        Vector aVar = (Vector) obj;
        return Float.compare(this.f174106a, aVar.f174106a) == 0 && Float.compare(this.f174107b, aVar.f174107b) == 0;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f174106a) * 31) + Float.floatToIntBits(this.f174107b);
    }

    public String toString() {
        return "Vector(x=" + this.f174106a + ", y=" + this.f174107b + ")";
    }

    /* renamed from: a */
    public final float mo243595a() {
        return this.f174106a;
    }

    /* renamed from: b */
    public final float mo243599b() {
        return this.f174107b;
    }

    /* renamed from: a */
    public final void mo243597a(float f) {
        this.f174106a *= f;
        this.f174107b *= f;
    }

    /* renamed from: b */
    public final void mo243600b(float f) {
        this.f174106a /= f;
        this.f174107b /= f;
    }

    /* renamed from: a */
    public final void mo243598a(Vector aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "v");
        this.f174106a += aVar.f174106a;
        this.f174107b += aVar.f174107b;
    }

    public Vector(float f, float f2) {
        this.f174106a = f;
        this.f174107b = f2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Vector(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BitmapDescriptorFactory.HUE_RED : f, (i & 2) != 0 ? BitmapDescriptorFactory.HUE_RED : f2);
    }
}
