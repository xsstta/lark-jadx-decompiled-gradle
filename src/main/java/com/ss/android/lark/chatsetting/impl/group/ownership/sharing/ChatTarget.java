package com.ss.android.lark.chatsetting.impl.group.ownership.sharing;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/ChatTarget;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingTarget;", "name", "", "chatId", "(Ljava/lang/String;Ljava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "setChatId", "(Ljava/lang/String;)V", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.sharing.a */
public final class ChatTarget extends SharingTarget {

    /* renamed from: a */
    private String f89853a;

    /* renamed from: a */
    public final String mo128421a() {
        return this.f89853a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatTarget(String str, String str2) {
        super(str);
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(str2, "chatId");
        this.f89853a = str2;
    }
}
