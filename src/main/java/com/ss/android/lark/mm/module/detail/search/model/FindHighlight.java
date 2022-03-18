package com.ss.android.lark.mm.module.detail.search.model;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ>\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\u000bR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u0011\u0010\t\"\u0004\b\u0012\u0010\u000b¨\u0006 "}, d2 = {"Lcom/ss/android/lark/mm/module/detail/search/model/FindHighlight;", "Ljava/io/Serializable;", "offset", "", "size", ShareHitPoint.f121869d, "seq", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getOffset", "()Ljava/lang/Integer;", "setOffset", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getSeq", "setSeq", "getSize", "setSize", "getType", "setType", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/ss/android/lark/mm/module/detail/search/model/FindHighlight;", "equals", "", "other", "", "hashCode", "toString", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class FindHighlight implements Serializable {
    private Integer offset;
    private Integer seq;
    private Integer size;
    private Integer type;

    public FindHighlight() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ FindHighlight copy$default(FindHighlight findHighlight, Integer num, Integer num2, Integer num3, Integer num4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = findHighlight.offset;
        }
        if ((i & 2) != 0) {
            num2 = findHighlight.size;
        }
        if ((i & 4) != 0) {
            num3 = findHighlight.type;
        }
        if ((i & 8) != 0) {
            num4 = findHighlight.seq;
        }
        return findHighlight.copy(num, num2, num3, num4);
    }

    public final Integer component1() {
        return this.offset;
    }

    public final Integer component2() {
        return this.size;
    }

    public final Integer component3() {
        return this.type;
    }

    public final Integer component4() {
        return this.seq;
    }

    public final FindHighlight copy(Integer num, Integer num2, Integer num3, Integer num4) {
        return new FindHighlight(num, num2, num3, num4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FindHighlight)) {
            return false;
        }
        FindHighlight findHighlight = (FindHighlight) obj;
        return Intrinsics.areEqual(this.offset, findHighlight.offset) && Intrinsics.areEqual(this.size, findHighlight.size) && Intrinsics.areEqual(this.type, findHighlight.type) && Intrinsics.areEqual(this.seq, findHighlight.seq);
    }

    public int hashCode() {
        Integer num = this.offset;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.size;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.type;
        int hashCode3 = (hashCode2 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Integer num4 = this.seq;
        if (num4 != null) {
            i = num4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "FindHighlight(offset=" + this.offset + ", size=" + this.size + ", type=" + this.type + ", seq=" + this.seq + ")";
    }

    public final Integer getOffset() {
        return this.offset;
    }

    public final Integer getSeq() {
        return this.seq;
    }

    public final Integer getSize() {
        return this.size;
    }

    public final Integer getType() {
        return this.type;
    }

    public final void setOffset(Integer num) {
        this.offset = num;
    }

    public final void setSeq(Integer num) {
        this.seq = num;
    }

    public final void setSize(Integer num) {
        this.size = num;
    }

    public final void setType(Integer num) {
        this.type = num;
    }

    public FindHighlight(Integer num, Integer num2, Integer num3, Integer num4) {
        this.offset = num;
        this.size = num2;
        this.type = num3;
        this.seq = num4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FindHighlight(Integer num, Integer num2, Integer num3, Integer num4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4);
    }
}
