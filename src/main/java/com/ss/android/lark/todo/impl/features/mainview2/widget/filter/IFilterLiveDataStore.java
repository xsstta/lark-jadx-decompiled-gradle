package com.ss.android.lark.todo.impl.features.mainview2.widget.filter;

import androidx.lifecycle.LiveData;
import com.bytedance.lark.pb.todo.v1.TodoListView;
import java.util.HashMap;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R<\u0010\u0002\u001a,\u0012(\u0012&\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\u00070\u0004j\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\u0007`\b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/filter/IFilterLiveDataStore;", "", "todoFilterNumMap", "Landroidx/lifecycle/LiveData;", "Ljava/util/HashMap;", "Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;", "Lcom/ss/android/lark/todo/impl/rustadapter/TodoFilterType;", "", "Lkotlin/collections/HashMap;", "getTodoFilterNumMap", "()Landroidx/lifecycle/LiveData;", "todoFilterType", "getTodoFilterType", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.filter.c */
public interface IFilterLiveDataStore {
    /* renamed from: j */
    LiveData<TodoListView.Type> mo193593j();

    /* renamed from: l */
    LiveData<HashMap<TodoListView.Type, Integer>> mo193595l();
}
