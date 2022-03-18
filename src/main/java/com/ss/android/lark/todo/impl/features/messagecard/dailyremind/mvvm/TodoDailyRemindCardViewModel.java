package com.ss.android.lark.todo.impl.features.messagecard.dailyremind.mvvm;

import android.content.Context;
import androidx.lifecycle.AbstractC1142af;
import com.bytedance.lark.pb.basic.v1.TodoDailyRemind;
import com.bytedance.lark.pb.basic.v1.TodoDetail;
import com.bytedance.lark.pb.basic.v1.TodoOperationContent;
import com.ss.android.lark.todo.impl.features.detail.DetailEntrance;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoHitPoint;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/messagecard/dailyremind/mvvm/TodoDailyRemindCardViewModel;", "Lcom/ss/android/lark/todo/impl/features/messagecard/dailyremind/mvvm/ITodoDailyRemindCardViewModel;", "Landroidx/lifecycle/ViewModel;", "contentData", "Lcom/bytedance/lark/pb/basic/v1/TodoOperationContent;", "(Lcom/bytedance/lark/pb/basic/v1/TodoOperationContent;)V", "getRemindTodoList", "", "Lcom/bytedance/lark/pb/basic/v1/TodoDetail;", "onOpenItemTodoDetailClicked", "", "context", "Landroid/content/Context;", "guid", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.messagecard.b.a.b */
public final class TodoDailyRemindCardViewModel extends AbstractC1142af {
    private final TodoOperationContent contentData;

    public List<TodoDetail> getRemindTodoList() {
        List<TodoDetail> list;
        TodoDailyRemind todoDailyRemind = this.contentData.daily_remind;
        if (todoDailyRemind == null || (list = todoDailyRemind.todos) == null) {
            return new ArrayList();
        }
        return list;
    }

    public TodoDailyRemindCardViewModel(TodoOperationContent todoOperationContent) {
        Intrinsics.checkParameterIsNotNull(todoOperationContent, "contentData");
        this.contentData = todoOperationContent;
    }

    public void onOpenItemTodoDetailClicked(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "guid");
        DetailEntrance.m220107a(DetailEntrance.f139694a, context, str, false, "", (String) null, (String) null, (String) null, (int) SmEvents.EVENT_NE_RR, (Object) null);
        TodoHitPoint.m221748c("remind", str);
    }
}
