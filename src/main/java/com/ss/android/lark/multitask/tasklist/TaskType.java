package com.ss.android.lark.multitask.tasklist;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/multitask/tasklist/TaskType;", "", "textResource", "", "(I)V", "getTextResource", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.multitask.tasklist.e */
public final class TaskType {

    /* renamed from: a */
    private final int f121864a;

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof TaskType) && this.f121864a == ((TaskType) obj).f121864a;
        }
        return true;
    }

    public int hashCode() {
        return this.f121864a;
    }

    public String toString() {
        return "TaskType(textResource=" + this.f121864a + ")";
    }

    /* renamed from: a */
    public final int mo169301a() {
        return this.f121864a;
    }

    public TaskType(int i) {
        this.f121864a = i;
    }
}
