package com.ss.android.lark.chat.chatwindow.biz.plugin;

import androidx.lifecycle.AbstractC1142af;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/biz/plugin/MultitaskSharedChatPropertiesViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "avatarKey", "", "getAvatarKey", "()Ljava/lang/String;", "setAvatarKey", "(Ljava/lang/String;)V", "chatId", "getChatId", "setChatId", "chatName", "getChatName", "setChatName", "isBot", "", "()Z", "setBot", "(Z)V", "isGroup", "setGroup", "isSecret", "setSecret", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.f */
public final class MultitaskSharedChatPropertiesViewModel extends AbstractC1142af {
    private String avatarKey = "";
    private String chatId = "";
    private String chatName = "";
    private boolean isBot;
    private boolean isGroup;
    private boolean isSecret;

    public final String getAvatarKey() {
        return this.avatarKey;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final String getChatName() {
        return this.chatName;
    }

    public final boolean isBot() {
        return this.isBot;
    }

    public final boolean isGroup() {
        return this.isGroup;
    }

    public final boolean isSecret() {
        return this.isSecret;
    }

    public final void setBot(boolean z) {
        this.isBot = z;
    }

    public final void setGroup(boolean z) {
        this.isGroup = z;
    }

    public final void setSecret(boolean z) {
        this.isSecret = z;
    }

    public final void setAvatarKey(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.avatarKey = str;
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
