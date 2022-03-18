package com.ss.android.lark.todo.impl.features.mainview2.widget.center;

import androidx.lifecycle.LiveData;
import com.bytedance.lark.pb.todo.v1.TodoSource;
import com.ss.android.lark.todo.impl.features.common.share.entity.ShareEntity;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoFetchStatus;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoListToastUnit;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001R$\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\bR\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\bR\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\bR\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\bR\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\bR\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/center/ITodoCenterLiveDataStore;", "", "activeConfirmDialog", "Landroidx/lifecycle/LiveData;", "Lkotlin/Pair;", "", "Lcom/bytedance/lark/pb/todo/v1/TodoSource;", "getActiveConfirmDialog", "()Landroidx/lifecycle/LiveData;", "animateContentForTitle", "", "getAnimateContentForTitle", "completeConfirmDialog", "getCompleteConfirmDialog", "dataFetchStatus", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFetchStatus;", "getDataFetchStatus", "noTodoLabel", "getNoTodoLabel", "noTodoText", "getNoTodoText", "shareEntity", "Lcom/ss/android/lark/todo/impl/features/common/share/entity/ShareEntity;", "getShareEntity", "toastUnit", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoListToastUnit;", "getToastUnit", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.a.a */
public interface ITodoCenterLiveDataStore {
    /* renamed from: O */
    LiveData<Boolean> mo193557O();

    /* renamed from: Q */
    LiveData<String> mo193559Q();

    /* renamed from: S */
    LiveData<TodoFetchStatus> mo193561S();

    /* renamed from: U */
    LiveData<TodoListToastUnit> mo193563U();

    /* renamed from: W */
    LiveData<Boolean> mo193565W();

    /* renamed from: Y */
    LiveData<ShareEntity> mo193567Y();

    LiveData<Pair<String, TodoSource>> aa();

    LiveData<Pair<String, TodoSource>> ac();
}
