package com.bytedance.ee.bear.bitable.pro;

import com.bytedance.ee.util.io.NonProguard;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/bitable/pro/RecRule;", "Lcom/bytedance/ee/util/io/NonProguard;", "perm", "", "otherPerm", "(II)V", "getOtherPerm", "()I", "getPerm", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class RecRule implements NonProguard {
    private final int otherPerm;
    private final int perm;

    public RecRule() {
        this(0, 0, 3, null);
    }

    public final int getOtherPerm() {
        return this.otherPerm;
    }

    public final int getPerm() {
        return this.perm;
    }

    public RecRule(int i, int i2) {
        this.perm = i;
        this.otherPerm = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RecRule(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
