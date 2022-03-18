package com.ss.android.lark.todo.impl.features.common.screenshot.entity;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J#\u0010\u000b\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R*\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/common/screenshot/entity/ReminderList;", "", "list", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/todo/impl/features/common/screenshot/entity/ReminderEntity;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getList", "()Ljava/util/ArrayList;", "setList", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.common.c.a.e */
public final class ReminderList {

    /* renamed from: a */
    private ArrayList<ReminderEntity> f139380a;

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ReminderList) && Intrinsics.areEqual(this.f139380a, ((ReminderList) obj).f139380a);
        }
        return true;
    }

    public int hashCode() {
        ArrayList<ReminderEntity> arrayList = this.f139380a;
        if (arrayList != null) {
            return arrayList.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "ReminderList(list=" + this.f139380a + ")";
    }

    public ReminderList(ArrayList<ReminderEntity> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "list");
        this.f139380a = arrayList;
    }
}
