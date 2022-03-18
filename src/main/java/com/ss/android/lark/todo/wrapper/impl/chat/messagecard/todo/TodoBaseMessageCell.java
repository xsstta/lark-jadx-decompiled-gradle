package com.ss.android.lark.todo.wrapper.impl.chat.messagecard.todo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.chat.entity.message.content.TodoContent;
import com.ss.android.lark.chat.export.ui.menu.OpenMenuDataHolder;
import com.ss.android.lark.chat.export.ui.message.IMessageContext;
import com.ss.android.lark.chat.export.ui.message.IOpenCellCallback;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCell;
import com.ss.android.lark.chat.export.ui.message.style.BubbleStyle;
import com.ss.android.lark.chat.export.ui.message.style.C34034b;
import com.ss.android.lark.chat.export.ui.message.style.C34035c;
import com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.export.vo.OpenMessageVO;
import com.ss.android.lark.todo.impl.features.messagecard.IMessageCellFactory;
import com.ss.android.lark.todo.wrapper.impl.chat.messagecard.vo.TodoContentVO;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b&\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u00011B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0002\u0010\bJ \u0010\u000f\u001a\u0004\u0018\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00182\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016J\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016J&\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016J\u0018\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\"\u0010&\u001a\u00020'2\n\u0010(\u001a\u0006\u0012\u0002\b\u00030)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020+H\u0016J,\u0010,\u001a\u00020\u001c2\u0014\u0010-\u001a\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010)\u0018\u00010.2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020+H\u0016J\u0010\u00100\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0014H\u0016R\u0018\u0010\t\u001a\u00020\nX¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/ss/android/lark/todo/wrapper/impl/chat/messagecard/todo/TodoBaseMessageCell;", "Lcom/ss/android/lark/chat/export/ui/message/IOpenMessageCell;", "Lcom/ss/android/lark/todo/wrapper/impl/chat/messagecard/vo/TodoContentVO;", "Lcom/ss/android/lark/chat/export/ui/message/style/IOpenBubbleStyleProvider;", "mMessageContext", "Lcom/ss/android/lark/chat/export/ui/message/IMessageContext;", "mOpenCellCallback", "Lcom/ss/android/lark/chat/export/ui/message/IOpenCellCallback;", "(Lcom/ss/android/lark/chat/export/ui/message/IMessageContext;Lcom/ss/android/lark/chat/export/ui/message/IOpenCellCallback;)V", "mMessageCellBinder", "Lcom/ss/android/lark/todo/impl/features/messagecard/IMessageCellFactory;", "getMMessageCellBinder", "()Lcom/ss/android/lark/todo/impl/features/messagecard/IMessageCellFactory;", "setMMessageCellBinder", "(Lcom/ss/android/lark/todo/impl/features/messagecard/IMessageCellFactory;)V", "getBubbleStyle", "Lcom/ss/android/lark/chat/export/ui/message/style/BubbleStyle;", "messageVO", "Lcom/ss/android/lark/chat/export/vo/OpenMessageVO;", "contentView", "Landroid/view/View;", "getMessageClass", "Ljava/lang/Class;", "getReactionStyle", "Lcom/ss/android/lark/chat/export/ui/message/style/ReactionStyle;", "getReplyStyle", "Lcom/ss/android/lark/chat/export/ui/message/style/ReplyStyle;", "onBindView", "", "itemView", "position", "", "message", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onFilterContextMenu", "", "menuItem", "Lcom/ss/android/lark/chat/export/ui/menu/MenuItem;", "dataHolder2", "Lcom/ss/android/lark/chat/export/ui/menu/OpenMenuDataHolder;", "onPrepareContextMenu", "menuItemList", "", "dataHolder", "onViewRecycled", "Companion", "todo-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.b.b.a.a.c.a */
public abstract class TodoBaseMessageCell implements IOpenMessageCell<TodoContentVO>, IOpenBubbleStyleProvider<TodoContentVO> {

    /* renamed from: b */
    public static final int f139197b = UIHelper.dp2px(12.0f);

    /* renamed from: c */
    public static final Companion f139198c = new Companion(null);

    /* renamed from: a */
    public final IOpenCellCallback<TodoContentVO> f139199a;

    /* renamed from: d */
    private final IMessageContext f139200d;

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public void mo120410a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "itemView");
    }

    /* renamed from: a */
    public void mo191694a(List<? extends C34029b<?>> list, OpenMenuDataHolder<TodoContentVO> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "dataHolder");
    }

    @Override // com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider
    /* renamed from: b */
    public C34035c mo120416b(OpenMessageVO<TodoContentVO> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "messageVO");
        return null;
    }

    /* renamed from: b */
    public abstract IMessageCellFactory mo191696b();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/todo/wrapper/impl/chat/messagecard/todo/TodoBaseMessageCell$Companion;", "", "()V", "BUBBLE_PADDING", "", "getBUBBLE_PADDING", "()I", "TAG", "", "todo-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.b.b.a.a.c.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final int mo191697a() {
            return TodoBaseMessageCell.f139197b;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public Class<TodoContentVO> mo120409a() {
        return TodoContentVO.class;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "onLongClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.b.b.a.a.c.a$b */
    static final class View$OnLongClickListenerC56242b implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoBaseMessageCell f139201a;

        /* renamed from: b */
        final /* synthetic */ View f139202b;

        /* renamed from: c */
        final /* synthetic */ OpenMessageVO f139203c;

        View$OnLongClickListenerC56242b(TodoBaseMessageCell aVar, View view, OpenMessageVO cVar) {
            this.f139201a = aVar;
            this.f139202b = view;
            this.f139203c = cVar;
        }

        public final boolean onLongClick(View view) {
            return this.f139201a.f139199a.mo122833b(this.f139202b, this.f139203c);
        }
    }

    @Override // com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider
    /* renamed from: a */
    public C34034b mo120408a(OpenMessageVO<TodoContentVO> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "messageVO");
        return C34034b.m131983a(UIUtils.dp2px(this.f139200d.mo122543g(), 12.0f), UIUtils.dp2px(this.f139200d.mo122543g(), 6.0f), 0, 0, false, 2);
    }

    public TodoBaseMessageCell(IMessageContext aVar, IOpenCellCallback<TodoContentVO> bVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "mMessageContext");
        Intrinsics.checkParameterIsNotNull(bVar, "mOpenCellCallback");
        this.f139200d = aVar;
        this.f139199a = bVar;
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public View mo120406a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        Intrinsics.checkParameterIsNotNull(viewGroup, "container");
        return mo191696b().mo193914a(layoutInflater, viewGroup);
    }

    @Override // com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider
    /* renamed from: a */
    public BubbleStyle mo120407a(OpenMessageVO<TodoContentVO> cVar, View view) {
        Intrinsics.checkParameterIsNotNull(cVar, "messageVO");
        Intrinsics.checkParameterIsNotNull(view, "contentView");
        return BubbleStyle.m131964a(2, (View) null, new int[]{0, 0, 0, f139197b});
    }

    @Override // com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo120413a(List list, Object obj) {
        mo191694a((List<? extends C34029b<?>>) list, (OpenMenuDataHolder) obj);
    }

    /* renamed from: a */
    public boolean mo191695a(C34029b<?> bVar, OpenMenuDataHolder<TodoContentVO> cVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(bVar, "menuItem");
        Intrinsics.checkParameterIsNotNull(cVar, "dataHolder2");
        if (bVar.f87966a == 11 || bVar.f87966a == 25) {
            z = false;
        } else {
            z = true;
        }
        if (!this.f139200d.mo122548l()) {
            return z;
        }
        if (!z || bVar.f87966a == 13 || bVar.f87966a == 9) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo120415a(C34029b bVar, Object obj) {
        return mo191695a((C34029b<?>) bVar, (OpenMenuDataHolder) obj);
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public void mo120411a(View view, int i, OpenMessageVO<TodoContentVO> cVar) {
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Intrinsics.checkParameterIsNotNull(cVar, "message");
        String b = cVar.mo121692b();
        if (this.f139200d.mo122548l()) {
            b = "";
        }
        mo191696b().mo193915a(view, i, (TodoContent) cVar.mo121699g().mo126168z(), cVar.mo121681a(), b, cVar.mo121697e());
        view.setOnLongClickListener(new View$OnLongClickListenerC56242b(this, view, cVar));
    }
}
