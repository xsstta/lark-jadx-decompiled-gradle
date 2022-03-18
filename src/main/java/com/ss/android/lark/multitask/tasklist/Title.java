package com.ss.android.lark.multitask.tasklist;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\n\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/multitask/tasklist/Title;", "", "meaningless", "", "(I)V", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.multitask.tasklist.f */
public final class Title {

    /* renamed from: a */
    private final int f121865a;

    public Title() {
        this(0, 1, null);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof Title) && this.f121865a == ((Title) obj).f121865a;
        }
        return true;
    }

    public int hashCode() {
        return this.f121865a;
    }

    public String toString() {
        return "Title(meaningless=" + this.f121865a + ")";
    }

    public Title(int i) {
        this.f121865a = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Title(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
