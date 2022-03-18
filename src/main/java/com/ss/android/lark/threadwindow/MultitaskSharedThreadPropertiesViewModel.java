package com.ss.android.lark.threadwindow;

import androidx.lifecycle.AbstractC1142af;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/threadwindow/MultitaskSharedThreadPropertiesViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "chatId", "", "getChatId", "()Ljava/lang/String;", "setChatId", "(Ljava/lang/String;)V", "chatName", "getChatName", "setChatName", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.threadwindow.e */
public final class MultitaskSharedThreadPropertiesViewModel extends AbstractC1142af {
    private String chatId = "";
    private String chatName = "";

    public final String getChatId() {
        return this.chatId;
    }

    public final String getChatName() {
        return this.chatName;
    }

    public final void setChatId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.chatId = str;
    }

    public final void setChatName(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.chatName = str;
    }
}
