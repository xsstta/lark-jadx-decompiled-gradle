package com.ss.android.vc.entity.sketch;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0006\u0010\u0015\u001a\u00020\u0010R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/ss/android/vc/entity/sketch/SketchRange;", "", "width", "", "height", "(II)V", "getHeight", "()I", "setHeight", "(I)V", "getWidth", "setWidth", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "valid", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.entity.sketch.a */
public final class SketchRange {

    /* renamed from: a */
    private int f152794a;

    /* renamed from: b */
    private int f152795b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SketchRange)) {
            return false;
        }
        SketchRange aVar = (SketchRange) obj;
        return this.f152794a == aVar.f152794a && this.f152795b == aVar.f152795b;
    }

    public int hashCode() {
        return (this.f152794a * 31) + this.f152795b;
    }

    public String toString() {
        return "SketchRange(width=" + this.f152794a + ", height=" + this.f152795b + ")";
    }

    /* renamed from: b */
    public final int mo210163b() {
        return this.f152794a;
    }

    /* renamed from: c */
    public final int mo210165c() {
        return this.f152795b;
    }

    /* renamed from: a */
    public final boolean mo210162a() {
        if (this.f152794a <= 0 || this.f152795b <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo210161a(int i) {
        this.f152794a = i;
    }

    /* renamed from: b */
    public final void mo210164b(int i) {
        this.f152795b = i;
    }

    public SketchRange(int i, int i2) {
        this.f152794a = i;
        this.f152795b = i2;
    }
}
