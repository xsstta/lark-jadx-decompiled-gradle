package com.ss.android.lark.todo.impl.features.detail.viewmodel;

import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0006R\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0006R\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0006R\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011X¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITitleBarViewDataStore;", "", "createIconState", "Landroidx/lifecycle/LiveData;", "", "getCreateIconState", "()Landroidx/lifecycle/LiveData;", "leftIconState", "getLeftIconState", "moreIconShow", "", "getMoreIconShow", "moreIconState", "getMoreIconState", "shareIconShow", "getShareIconShow", "showRemoveReminderDialog", "Landroidx/lifecycle/MutableLiveData;", "getShowRemoveReminderDialog", "()Landroidx/lifecycle/MutableLiveData;", "setShowRemoveReminderDialog", "(Landroidx/lifecycle/MutableLiveData;)V", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.p */
public interface ITitleBarViewDataStore {
    LiveData<Integer> getCreateIconState();

    LiveData<Integer> getLeftIconState();

    LiveData<Boolean> getMoreIconShow();

    LiveData<Integer> getMoreIconState();

    LiveData<Boolean> getShareIconShow();

    C1177w<Integer> getShowRemoveReminderDialog();
}
