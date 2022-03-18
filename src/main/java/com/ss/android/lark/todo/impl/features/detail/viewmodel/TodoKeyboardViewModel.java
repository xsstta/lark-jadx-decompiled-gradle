package com.ss.android.lark.todo.impl.features.detail.viewmodel;

import android.content.Context;
import androidx.lifecycle.AbstractC1142af;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TodoKeyboardViewModel;", "Landroidx/lifecycle/ViewModel;", "chatId", "", "context", "Landroid/content/Context;", "keyboardViewModel", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoKeyboardViewModel;", "isFromChat", "", "(Ljava/lang/String;Landroid/content/Context;Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoKeyboardViewModel;Z)V", "getChatId", "()Ljava/lang/String;", "getContext", "()Landroid/content/Context;", "()Z", "getKeyboardViewModel", "()Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoKeyboardViewModel;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.af */
public final class TodoKeyboardViewModel extends AbstractC1142af {
    private final String chatId;
    private final Context context;
    private final boolean isFromChat;
    private final ITodoKeyboardViewModel keyboardViewModel;

    public final String getChatId() {
        return this.chatId;
    }

    public final Context getContext() {
        return this.context;
    }

    public final ITodoKeyboardViewModel getKeyboardViewModel() {
        return this.keyboardViewModel;
    }

    public final boolean isFromChat() {
        return this.isFromChat;
    }

    public TodoKeyboardViewModel(String str, Context context2, ITodoKeyboardViewModel iTodoKeyboardViewModel, boolean z) {
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(iTodoKeyboardViewModel, "keyboardViewModel");
        this.chatId = str;
        this.context = context2;
        this.keyboardViewModel = iTodoKeyboardViewModel;
        this.isFromChat = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TodoKeyboardViewModel(String str, Context context2, ITodoKeyboardViewModel iTodoKeyboardViewModel, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, context2, iTodoKeyboardViewModel, (i & 8) != 0 ? false : z);
    }
}
