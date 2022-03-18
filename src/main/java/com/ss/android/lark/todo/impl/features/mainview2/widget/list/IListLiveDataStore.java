package com.ss.android.lark.todo.impl.features.mainview2.widget.list;

import androidx.lifecycle.LiveData;
import com.bytedance.lark.pb.todo.v1.TodoSortType;
import com.ss.android.lark.todo.impl.features.mainview2.widget.list.item.TodoItemViewData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0006R\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0006R\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0006R$\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00110\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006R\u001e\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0006R\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0006¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/IListLiveDataStore;", "", "addedShineTodoGuid", "Landroidx/lifecycle/LiveData;", "", "getAddedShineTodoGuid", "()Landroidx/lifecycle/LiveData;", "cancelShineLogic", "", "getCancelShineLogic", "clearScrollDistance", "getClearScrollDistance", "closeAllItems", "getCloseAllItems", "hasMoreData", "getHasMoreData", "isBadgeSettingChange", "Lkotlin/Pair;", "todoDisplayItems", "", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData;", "getTodoDisplayItems", "todoSortType", "Lcom/bytedance/lark/pb/todo/v1/TodoSortType;", "getTodoSortType", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.c */
public interface IListLiveDataStore {
    /* renamed from: B */
    LiveData<Boolean> mo193544B();

    /* renamed from: n */
    LiveData<List<TodoItemViewData>> mo193597n();

    /* renamed from: p */
    LiveData<TodoSortType> mo193599p();

    /* renamed from: r */
    LiveData<String> mo193601r();

    /* renamed from: t */
    LiveData<Boolean> mo193603t();

    /* renamed from: v */
    LiveData<Pair<Boolean, Boolean>> mo193605v();

    /* renamed from: x */
    LiveData<Boolean> mo193607x();

    /* renamed from: z */
    LiveData<Boolean> mo193609z();
}
