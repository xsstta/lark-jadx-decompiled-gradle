package com.ss.android.lark.todo.wrapper.impl.chat;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCellFactory;
import com.ss.android.lark.todo.p2774b.p2775a.AbstractC56227a;
import com.ss.android.lark.todo.wrapper.impl.chat.messagecard.pin.TodoPinHolderView;
import com.ss.android.lark.todo.wrapper.impl.chat.messagecard.todo.comment.ThreadTodoCommentCellFactory;
import com.ss.android.lark.todo.wrapper.impl.chat.messagecard.todo.comment.TodoCommentCellFactory;
import com.ss.android.lark.todo.wrapper.impl.chat.messagecard.todo.dailyremind.ThreadDailyRemindCellFactory;
import com.ss.android.lark.todo.wrapper.impl.chat.messagecard.todo.dailyremind.TodoDailyRemindCellFactory;
import com.ss.android.lark.todo.wrapper.impl.chat.messagecard.todo.operation.ThreadOperationCardCellFactory;
import com.ss.android.lark.todo.wrapper.impl.chat.messagecard.todo.operation.TodoOperationCardCellFactory;
import com.ss.android.lark.widget.recyclerview.AbstractC58992f;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u0002H\u0005\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00050\nH\u0016J\u001a\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\r0\fH\u0016J\u001a\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\r0\fH\u0016¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/todo/wrapper/impl/chat/ChatWindowTodoMessage;", "Lcom/ss/android/lark/todo/wrapper/api/IChatWindowTodoMessageDependency;", "()V", "createTodoPinHolderView", "Lcom/ss/android/lark/widget/recyclerview/MultiTypeItemHolderView;", "T", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "pinInfoProvider", "Lcom/ss/android/lark/todo/wrapper/api/IChatWindowTodoMessageDependency$IPinInfoProvider;", "getThreadCellFactories", "", "Lcom/ss/android/lark/chat/export/ui/message/IOpenMessageCellFactory;", "getTodoMessageCellFactories", "Companion", "todo-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.b.b.a.a */
public final class ChatWindowTodoMessage implements AbstractC56227a {

    /* renamed from: a */
    public static final ChatWindowTodoMessage f139163a = new ChatWindowTodoMessage();

    /* renamed from: b */
    public static final Companion f139164b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/todo/wrapper/impl/chat/ChatWindowTodoMessage$Companion;", "", "()V", "instance", "Lcom/ss/android/lark/todo/wrapper/impl/chat/ChatWindowTodoMessage;", "getInstance", "()Lcom/ss/android/lark/todo/wrapper/impl/chat/ChatWindowTodoMessage;", "todo-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.b.b.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final ChatWindowTodoMessage mo191677a() {
            return ChatWindowTodoMessage.f139163a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private ChatWindowTodoMessage() {
    }

    @Override // com.ss.android.lark.todo.p2774b.p2775a.AbstractC56227a
    /* renamed from: b */
    public List<IOpenMessageCellFactory<?, ?, ?>> mo191675b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ThreadOperationCardCellFactory());
        arrayList.add(new ThreadDailyRemindCellFactory());
        arrayList.add(new ThreadTodoCommentCellFactory());
        return arrayList;
    }

    @Override // com.ss.android.lark.todo.p2774b.p2775a.AbstractC56227a
    /* renamed from: a */
    public List<IOpenMessageCellFactory<?, ?, ?>> mo191674a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new TodoOperationCardCellFactory());
        arrayList.add(new TodoDailyRemindCellFactory());
        arrayList.add(new TodoCommentCellFactory());
        return arrayList;
    }

    @Override // com.ss.android.lark.todo.p2774b.p2775a.AbstractC56227a
    /* renamed from: a */
    public <T> AbstractC58992f<T, ? extends RecyclerView.ViewHolder> mo191673a(Context context, AbstractC56227a.AbstractC56228a<T> aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "pinInfoProvider");
        return new TodoPinHolderView(context, aVar);
    }
}
