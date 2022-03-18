package com.ss.android.lark.todo.impl.features.mainview2.widget.list.listener;

import com.bytedance.lark.pb.todo.v1.CustomComplete;
import com.bytedance.lark.pb.todo.v1.TodoSource;
import com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper;
import com.ss.android.lark.todo.impl.features.mainview2.widget.list.item.TodoItemViewData;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J4\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H&¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/listener/IListItemClickListener;", "", "onBehindDeleteItemClicked", "", "todoGuid", "", "behindDeleteStatus", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$BehindDeleteStatus;", "todoSource", "Lcom/bytedance/lark/pb/todo/v1/TodoSource;", "onItemCheckBoxClicked", "isTargetCompleted", "", "multiCompleteType", "Lcom/ss/android/lark/todo/impl/features/common/helper/MultiCompleteHelper$MultiCompleteType;", "completeAction", "Lcom/bytedance/lark/pb/todo/v1/CustomComplete$Action;", "onItemDetailClick", "onShareItemClicked", "summary", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.c.a */
public interface IListItemClickListener {
    /* renamed from: a */
    void mo193773a(String str);

    /* renamed from: a */
    void mo193774a(String str, TodoItemViewData.BehindDeleteStatus behindDeleteStatus, TodoSource todoSource);

    /* renamed from: a */
    void mo193775a(String str, String str2);

    /* renamed from: a */
    void mo193776a(String str, boolean z, TodoSource todoSource, MultiCompleteHelper.MultiCompleteType multiCompleteType, CustomComplete.Action action);

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.c.a$a */
    public static final class C57082a {
        /* renamed from: a */
        public static /* synthetic */ void m221314a(IListItemClickListener aVar, String str, boolean z, TodoSource todoSource, MultiCompleteHelper.MultiCompleteType multiCompleteType, CustomComplete.Action action, int i, Object obj) {
            if (obj == null) {
                if ((i & 16) != 0) {
                    action = null;
                }
                aVar.mo193776a(str, z, todoSource, multiCompleteType, action);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onItemCheckBoxClicked");
        }
    }
}
