package com.ss.android.lark.todo.wrapper.impl.chat.messagecard.todo.dailyremind;

import android.view.View;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.export.ui.message.IMessageContext;
import com.ss.android.lark.chat.export.ui.message.IOpenCellCallback;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCell;
import com.ss.android.lark.chat.export.ui.message.style.BubbleStyle;
import com.ss.android.lark.chat.export.ui.message.style.C34034b;
import com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider;
import com.ss.android.lark.chat.export.vo.OpenMessageVO;
import com.ss.android.lark.todo.impl.features.messagecard.IMessageCellFactory;
import com.ss.android.lark.todo.impl.features.messagecard.dailyremind.TodoDailyRemindCardCellBinder;
import com.ss.android.lark.todo.wrapper.impl.chat.messagecard.todo.TodoBaseMessageCell;
import com.ss.android.lark.todo.wrapper.impl.chat.messagecard.vo.TodoContentVO;
import com.ss.android.lark.todo.wrapper.impl.chat.messagecard.vo.TodoDailyRemindContentVO;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u00032\u00020\u0004B\u001d\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0002\u0010\tB#\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0002\u0010\u000eJ \u0010\u0015\u001a\u0004\u0018\u00010\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0016R\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/todo/wrapper/impl/chat/messagecard/todo/dailyremind/TodoDailyRemindMessageCell;", "Lcom/ss/android/lark/chat/export/ui/message/IOpenMessageCell;", "Lcom/ss/android/lark/todo/wrapper/impl/chat/messagecard/vo/TodoContentVO;", "Lcom/ss/android/lark/chat/export/ui/message/style/IOpenBubbleStyleProvider;", "Lcom/ss/android/lark/todo/wrapper/impl/chat/messagecard/todo/TodoBaseMessageCell;", "messageContext", "Lcom/ss/android/lark/chat/export/ui/message/IMessageContext;", "openCellCallback", "Lcom/ss/android/lark/chat/export/ui/message/IOpenCellCallback;", "(Lcom/ss/android/lark/chat/export/ui/message/IMessageContext;Lcom/ss/android/lark/chat/export/ui/message/IOpenCellCallback;)V", "mMessageContext", "isShowBorder", "", "mOpenCellCallback", "(Lcom/ss/android/lark/chat/export/ui/message/IMessageContext;ZLcom/ss/android/lark/chat/export/ui/message/IOpenCellCallback;)V", "mMessageCellBinder", "Lcom/ss/android/lark/todo/impl/features/messagecard/IMessageCellFactory;", "getMMessageCellBinder", "()Lcom/ss/android/lark/todo/impl/features/messagecard/IMessageCellFactory;", "setMMessageCellBinder", "(Lcom/ss/android/lark/todo/impl/features/messagecard/IMessageCellFactory;)V", "getBubbleStyle", "Lcom/ss/android/lark/chat/export/ui/message/style/BubbleStyle;", "messageVO", "Lcom/ss/android/lark/chat/export/vo/OpenMessageVO;", "contentView", "Landroid/view/View;", "getMessageClass", "Ljava/lang/Class;", "getReactionStyle", "Lcom/ss/android/lark/chat/export/ui/message/style/ReactionStyle;", "todo-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.b.b.a.a.c.b.c */
public final class TodoDailyRemindMessageCell extends TodoBaseMessageCell implements IOpenMessageCell<TodoContentVO>, IOpenBubbleStyleProvider<TodoContentVO> {

    /* renamed from: d */
    private final IMessageContext f139205d;

    /* renamed from: e */
    private IMessageCellFactory f139206e;

    @Override // com.ss.android.lark.todo.wrapper.impl.chat.messagecard.todo.TodoBaseMessageCell, com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public Class<TodoContentVO> mo120409a() {
        return TodoDailyRemindContentVO.class;
    }

    @Override // com.ss.android.lark.todo.wrapper.impl.chat.messagecard.todo.TodoBaseMessageCell
    /* renamed from: b */
    public IMessageCellFactory mo191696b() {
        return this.f139206e;
    }

    @Override // com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider, com.ss.android.lark.todo.wrapper.impl.chat.messagecard.todo.TodoBaseMessageCell
    /* renamed from: a */
    public C34034b mo120408a(OpenMessageVO<TodoContentVO> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "messageVO");
        return C34034b.m131983a(UIUtils.dp2px(this.f139205d.mo122543g(), 12.0f), UIUtils.dp2px(this.f139205d.mo122543g(), 6.0f), 0, 0, false, 2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TodoDailyRemindMessageCell(IMessageContext aVar, IOpenCellCallback<TodoContentVO> bVar) {
        this(aVar, false, bVar);
        Intrinsics.checkParameterIsNotNull(aVar, "messageContext");
        Intrinsics.checkParameterIsNotNull(bVar, "openCellCallback");
    }

    @Override // com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider, com.ss.android.lark.todo.wrapper.impl.chat.messagecard.todo.TodoBaseMessageCell
    /* renamed from: a */
    public BubbleStyle mo120407a(OpenMessageVO<TodoContentVO> cVar, View view) {
        Intrinsics.checkParameterIsNotNull(cVar, "messageVO");
        Intrinsics.checkParameterIsNotNull(view, "contentView");
        return BubbleStyle.m131964a((int) SmEvents.EVENT_NE_RR, view.findViewById(R.id.bot_head_container), new int[]{0, 0, 0, TodoBaseMessageCell.f139198c.mo191697a()});
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TodoDailyRemindMessageCell(IMessageContext aVar, boolean z, IOpenCellCallback<TodoContentVO> bVar) {
        super(aVar, bVar);
        Intrinsics.checkParameterIsNotNull(aVar, "mMessageContext");
        Intrinsics.checkParameterIsNotNull(bVar, "mOpenCellCallback");
        this.f139205d = aVar;
        this.f139206e = new TodoDailyRemindCardCellBinder(z);
    }
}
