package com.ss.android.lark.todo.impl.features.mainview.entity;

import com.bytedance.lark.pb.todo.v1.TodoListView;
import com.bytedance.lark.pb.todo.v1.TodoListViewSetting;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoListData;", "", "listViewChildCounts", "", "Lcom/bytedance/lark/pb/todo/v1/TodoListView;", "listViewSettings", "Lcom/bytedance/lark/pb/todo/v1/TodoListViewSetting;", "(Ljava/util/List;Ljava/util/List;)V", "getListViewChildCounts", "()Ljava/util/List;", "setListViewChildCounts", "(Ljava/util/List;)V", "getListViewSettings", "setListViewSettings", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview.entity.b */
public final class TodoListData {

    /* renamed from: a */
    private List<TodoListView> f140334a;

    /* renamed from: b */
    private List<TodoListViewSetting> f140335b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TodoListData)) {
            return false;
        }
        TodoListData bVar = (TodoListData) obj;
        return Intrinsics.areEqual(this.f140334a, bVar.f140334a) && Intrinsics.areEqual(this.f140335b, bVar.f140335b);
    }

    public int hashCode() {
        List<TodoListView> list = this.f140334a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<TodoListViewSetting> list2 = this.f140335b;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "TodoListData(listViewChildCounts=" + this.f140334a + ", listViewSettings=" + this.f140335b + ")";
    }

    /* renamed from: a */
    public final List<TodoListView> mo193206a() {
        return this.f140334a;
    }

    /* renamed from: b */
    public final List<TodoListViewSetting> mo193207b() {
        return this.f140335b;
    }

    public TodoListData(List<TodoListView> list, List<TodoListViewSetting> list2) {
        this.f140334a = list;
        this.f140335b = list2;
    }
}
