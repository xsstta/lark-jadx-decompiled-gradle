package com.ss.android.lark.todo.impl.features.common.screenshot.entity;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J#\u0010\u000b\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R*\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/common/screenshot/entity/FilterList;", "", "todo_list_views", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/todo/impl/features/common/screenshot/entity/FilterEntity;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getTodo_list_views", "()Ljava/util/ArrayList;", "setTodo_list_views", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.common.c.a.c */
public final class FilterList {

    /* renamed from: a */
    private ArrayList<FilterEntity> f139377a;

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FilterList) && Intrinsics.areEqual(this.f139377a, ((FilterList) obj).f139377a);
        }
        return true;
    }

    public int hashCode() {
        ArrayList<FilterEntity> arrayList = this.f139377a;
        if (arrayList != null) {
            return arrayList.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "FilterList(todo_list_views=" + this.f139377a + ")";
    }

    public FilterList(ArrayList<FilterEntity> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "todo_list_views");
        this.f139377a = arrayList;
    }
}
