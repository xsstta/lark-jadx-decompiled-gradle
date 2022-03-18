package com.ss.android.lark.todo.impl.features.messagecard.operation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lark.pb.basic.v1.TodoOperationContent;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.message.content.TodoContent;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.todo.impl.features.messagecard.IMessageCellFactory;
import com.ss.android.lark.todo.impl.features.messagecard.operation.mvvm.TodoOperationCardView;
import com.ss.android.lark.todo.impl.features.messagecard.operation.mvvm.TodoOperationCardViewModel;
import com.ss.android.lark.todo.impl.utils.LogMessageUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J:\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/messagecard/operation/TodoOperationCardCellBinder;", "Lcom/ss/android/lark/todo/impl/features/messagecard/IMessageCellFactory;", "mIsShowBorder", "", "(Z)V", "mOperationCardView", "Lcom/ss/android/lark/todo/impl/features/messagecard/operation/mvvm/TodoOperationCardView;", "onBindView", "", "itemView", "Landroid/view/View;", "position", "", "content", "Lcom/ss/android/lark/chat/entity/message/content/TodoContent;", "messageId", "", "chatId", "senderId", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewRecycled", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.messagecard.operation.a */
public final class TodoOperationCardCellBinder implements IMessageCellFactory {

    /* renamed from: a */
    public static final Companion f140916a = new Companion(null);

    /* renamed from: b */
    private TodoOperationCardView f140917b;

    /* renamed from: c */
    private final boolean f140918c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/messagecard/operation/TodoOperationCardCellBinder$Companion;", "", "()V", "TAG", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.messagecard.operation.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public TodoOperationCardCellBinder(boolean z) {
        this.f140918c = z;
    }

    @Override // com.ss.android.lark.todo.impl.features.messagecard.IMessageCellFactory
    /* renamed from: a */
    public View mo193914a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        Intrinsics.checkParameterIsNotNull(viewGroup, "container");
        if (this.f140918c) {
            i = R.layout.todo_thread_bot_operation_item_bg;
        } else {
            i = R.layout.todo_bot_operation_item_bg;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(layoutRes, container, false)");
        return inflate;
    }

    @Override // com.ss.android.lark.todo.impl.features.messagecard.IMessageCellFactory
    /* renamed from: a */
    public void mo193915a(View view, int i, TodoContent todoContent, String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Intrinsics.checkParameterIsNotNull(todoContent, "content");
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        Intrinsics.checkParameterIsNotNull(str3, "senderId");
        TodoOperationContent cardContentData = todoContent.getCardContentData();
        if (cardContentData != null) {
            TodoOperationCardViewModel todoOperationCardViewModel = new TodoOperationCardViewModel(cardContentData, str2, str, str3);
            TodoOperationCardView aVar = (TodoOperationCardView) view.getTag();
            this.f140917b = aVar;
            if (aVar != null) {
                aVar.mo193981a(todoOperationCardViewModel);
            } else {
                TodoOperationCardFontHelper.f140919a.mo193949a(view);
                TodoOperationCardView aVar2 = new TodoOperationCardView(view, todoOperationCardViewModel);
                this.f140917b = aVar2;
                view.setTag(aVar2);
            }
            Log.m165389i("TodoOperationCardCellBinder", LogMessageUtil.f139260a.mo191769b("todo operation card bind content"));
            TodoOperationCardView aVar3 = this.f140917b;
            if (aVar3 != null) {
                aVar3.mo193982b();
                return;
            }
            return;
        }
        Log.m165389i("TodoOperationCardCellBinder", LogMessageUtil.f139260a.mo191771c("todo operation card content is null"));
    }
}
