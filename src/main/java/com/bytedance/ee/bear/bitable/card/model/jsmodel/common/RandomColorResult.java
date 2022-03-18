package com.bytedance.ee.bear.bitable.card.model.jsmodel.common;

import com.bytedance.ee.util.io.NonProguard;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u0010\b\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/common/RandomColorResult;", "Lcom/bytedance/ee/util/io/NonProguard;", "color", "", "(Ljava/lang/Integer;)V", "getColor", "()Ljava/lang/Integer;", "setColor", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/common/RandomColorResult;", "equals", "", "other", "", "hashCode", "toString", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class RandomColorResult implements NonProguard {
    private Integer color;

    public RandomColorResult() {
        this(null, 1, null);
    }

    public static /* synthetic */ RandomColorResult copy$default(RandomColorResult randomColorResult, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = randomColorResult.color;
        }
        return randomColorResult.copy(num);
    }

    public final Integer component1() {
        return this.color;
    }

    public final RandomColorResult copy(Integer num) {
        return new RandomColorResult(num);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof RandomColorResult) && Intrinsics.areEqual(this.color, ((RandomColorResult) obj).color);
        }
        return true;
    }

    public int hashCode() {
        Integer num = this.color;
        if (num != null) {
            return num.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "RandomColorResult(color=" + this.color + ")";
    }

    public final Integer getColor() {
        return this.color;
    }

    public final void setColor(Integer num) {
        this.color = num;
    }

    public RandomColorResult(Integer num) {
        this.color = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RandomColorResult(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num);
    }
}
