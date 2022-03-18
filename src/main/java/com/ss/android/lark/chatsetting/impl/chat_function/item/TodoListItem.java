package com.ss.android.lark.chatsetting.impl.chat_function.item;

import android.content.Context;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingExtraParams;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingHitPointNew;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.chat_function_view.ChatFunctionBadge;
import com.ss.android.lark.widget.chat_function_view.IChatFunctionItem;
import com.ss.android.lark.widget.chat_function_view.IItemClickListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\fXD¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/chat_function/item/TodoListItem;", "Lcom/ss/android/lark/widget/chat_function_view/IChatFunctionItem;", "mChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "(Lcom/ss/android/lark/chat/entity/chat/Chat;)V", "badge", "Lcom/ss/android/lark/widget/chat_function_view/ChatFunctionBadge;", "getBadge", "()Lcom/ss/android/lark/widget/chat_function_view/ChatFunctionBadge;", "setBadge", "(Lcom/ss/android/lark/widget/chat_function_view/ChatFunctionBadge;)V", "iconRes", "", "getIconRes", "()I", "id", "getId", "label", "", "getLabel", "()Ljava/lang/String;", "mTodoClickListener", "Lcom/ss/android/lark/chatsetting/impl/chat_function/item/TodoListItem$ITodoClickListener;", "onItemClickListener", "Lcom/ss/android/lark/widget/chat_function_view/IItemClickListener;", "getOnItemClickListener", "()Lcom/ss/android/lark/widget/chat_function_view/IItemClickListener;", "setOnTodoClickListener", "", "clickListener", "ITodoClickListener", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.a.b.h */
public final class TodoListItem implements IChatFunctionItem {

    /* renamed from: a */
    public ITodoClickListener f89084a;

    /* renamed from: b */
    public final Chat f89085b;

    /* renamed from: c */
    private final int f89086c = 16;

    /* renamed from: d */
    private final String f89087d;

    /* renamed from: e */
    private final int f89088e;

    /* renamed from: f */
    private ChatFunctionBadge f89089f;

    /* renamed from: g */
    private final IItemClickListener f89090g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/chat_function/item/TodoListItem$ITodoClickListener;", "", "onTodoItemClicked", "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.a.b.h$a */
    public interface ITodoClickListener {
        /* renamed from: a */
        void mo127571a();
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionItem
    /* renamed from: a */
    public int mo127572a() {
        return this.f89086c;
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionItem
    /* renamed from: b */
    public ChatFunctionBadge mo127574b() {
        return this.f89089f;
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionItem
    /* renamed from: c */
    public IItemClickListener mo127575c() {
        return this.f89090g;
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionItem
    /* renamed from: d */
    public String mo127576d() {
        return this.f89087d;
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionItem
    /* renamed from: g */
    public int mo127579g() {
        return this.f89088e;
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionItem
    /* renamed from: e */
    public String mo127577e() {
        return IChatFunctionItem.C58374a.m226274b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chatsetting/impl/chat_function/item/TodoListItem$onItemClickListener$1", "Lcom/ss/android/lark/widget/chat_function_view/IItemClickListener;", "onClick", "", "context", "Landroid/content/Context;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.a.b.h$b */
    public static final class C34518b implements IItemClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoListItem f89091a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34518b(TodoListItem hVar) {
            this.f89091a = hVar;
        }

        @Override // com.ss.android.lark.widget.chat_function_view.IItemClickListener
        /* renamed from: a */
        public void mo127580a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            ChatSettingHitPointNew.m136630b(ChatSettingExtraParams.Click.TASK.plus(ChatSettingExtraParams.Target.TODO_IM_CHAT_TODO_LIST_VIEW));
            ITodoClickListener aVar = this.f89091a.f89084a;
            if (aVar != null) {
                aVar.mo127571a();
            }
            AbstractC34461c a = ChatSettingModule.m133639a();
            Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
            AbstractC34461c.AbstractC34485x u = a.mo127291u();
            String id = this.f89091a.f89085b.getId();
            if (id == null) {
                id = "";
            }
            u.mo127450a(context, id, this.f89091a.f89085b.isThread());
        }
    }

    /* renamed from: a */
    public final void mo127582a(ITodoClickListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "clickListener");
        this.f89084a = aVar;
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionItem
    /* renamed from: a */
    public void mo127573a(ChatFunctionBadge aVar) {
        this.f89089f = aVar;
    }

    public TodoListItem(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "mChat");
        this.f89085b = chat;
        String string = UIHelper.getString(R.string.Todo_Task_Tasks);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.string.Todo_Task_Tasks)");
        this.f89087d = string;
        this.f89088e = R.drawable.ud_icon_todo_colorful;
        this.f89090g = new C34518b(this);
    }
}
