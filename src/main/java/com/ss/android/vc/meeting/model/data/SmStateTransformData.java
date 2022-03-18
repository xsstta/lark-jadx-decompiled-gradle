package com.ss.android.vc.meeting.model.data;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/ss/android/vc/meeting/model/data/SmStateTransformData;", "", "lastSmState", "", "currentSmState", "triggerEvent", "(III)V", "getCurrentSmState", "()I", "getLastSmState", "getTriggerEvent", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.model.a.b */
public final class SmStateTransformData {

    /* renamed from: a */
    private final int f153799a;

    /* renamed from: b */
    private final int f153800b;

    /* renamed from: c */
    private final int f153801c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmStateTransformData)) {
            return false;
        }
        SmStateTransformData bVar = (SmStateTransformData) obj;
        return this.f153799a == bVar.f153799a && this.f153800b == bVar.f153800b && this.f153801c == bVar.f153801c;
    }

    public int hashCode() {
        return (((this.f153799a * 31) + this.f153800b) * 31) + this.f153801c;
    }

    public String toString() {
        return "SmStateTransformData(lastSmState=" + this.f153799a + ", currentSmState=" + this.f153800b + ", triggerEvent=" + this.f153801c + ")";
    }

    /* renamed from: a */
    public final int mo212435a() {
        return this.f153799a;
    }

    /* renamed from: b */
    public final int mo212436b() {
        return this.f153800b;
    }

    /* renamed from: c */
    public final int mo212437c() {
        return this.f153801c;
    }

    public SmStateTransformData(int i, int i2, int i3) {
        this.f153799a = i;
        this.f153800b = i2;
        this.f153801c = i3;
    }
}
