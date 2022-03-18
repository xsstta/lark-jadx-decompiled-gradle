package com.ss.android.lark.todo.impl.features.messagecard.comment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lark.pb.basic.v1.TodoOperationContent;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.message.content.TodoContent;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.todo.impl.features.messagecard.IMessageCellFactory;
import com.ss.android.lark.todo.impl.features.messagecard.comment.mvvm.TodoCommentCardView;
import com.ss.android.lark.todo.impl.features.messagecard.comment.mvvm.TodoCommentCardViewModel;
import com.ss.android.lark.todo.impl.utils.LogMessageUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J:\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/messagecard/comment/TodoCommentCellBinder;", "Lcom/ss/android/lark/todo/impl/features/messagecard/IMessageCellFactory;", "mIsShowBorder", "", "(Z)V", "mCommentCardView", "Lcom/ss/android/lark/todo/impl/features/messagecard/comment/mvvm/TodoCommentCardView;", "onBindView", "", "itemView", "Landroid/view/View;", "position", "", "content", "Lcom/ss/android/lark/chat/entity/message/content/TodoContent;", "messageId", "", "chatId", "senderId", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewRecycled", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.messagecard.a.b */
public final class TodoCommentCellBinder implements IMessageCellFactory {

    /* renamed from: a */
    public static final Companion f140888a = new Companion(null);

    /* renamed from: b */
    private TodoCommentCardView f140889b;

    /* renamed from: c */
    private final boolean f140890c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/messagecard/comment/TodoCommentCellBinder$Companion;", "", "()V", "TAG", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.messagecard.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public TodoCommentCellBinder(boolean z) {
        this.f140890c = z;
    }

    @Override // com.ss.android.lark.todo.impl.features.messagecard.IMessageCellFactory
    /* renamed from: a */
    public View mo193914a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        Intrinsics.checkParameterIsNotNull(viewGroup, "container");
        if (this.f140890c) {
            i = R.layout.todo_thread_bot_comment_item_bg;
        } else {
            i = R.layout.todo_bot_comment_item_bg;
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
            TodoCommentCardViewModel bVar = new TodoCommentCardViewModel(cardContentData, str2, str);
            TodoCommentCardView aVar = (TodoCommentCardView) view.getTag();
            this.f140889b = aVar;
            if (aVar != null) {
                aVar.mo193918a(bVar);
            } else {
                TodoCommentCardFontHelper.f140878a.mo193916a(view);
                TodoCommentCardView aVar2 = new TodoCommentCardView(view, bVar);
                this.f140889b = aVar2;
                view.setTag(aVar2);
            }
            Log.m165389i("TodoCommentCellBinder", LogMessageUtil.f139260a.mo191769b("todoCommentCard bind content"));
            TodoCommentCardView aVar3 = this.f140889b;
            if (aVar3 != null) {
                aVar3.mo193917a();
                return;
            }
            return;
        }
        Log.m165389i("TodoCommentCellBinder", LogMessageUtil.f139260a.mo191771c("todoCommentCard content is null"));
    }
}
