package com.ss.android.lark.chat.base.model.dispatch;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/chat/base/model/dispatch/RemoveTopNoticeMsgAction;", "Lcom/ss/android/lark/chat/base/model/dispatch/Action;", "messageId", "", "remove", "", "(Ljava/lang/String;Z)V", "getMessageId", "()Ljava/lang/String;", "getRemove", "()Z", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.base.model.a.f */
public final class RemoveTopNoticeMsgAction implements AbstractC32919a {

    /* renamed from: a */
    private final String f84614a;

    /* renamed from: b */
    private final boolean f84615b;

    /* renamed from: a */
    public final String mo121565a() {
        return this.f84614a;
    }

    /* renamed from: b */
    public final boolean mo121566b() {
        return this.f84615b;
    }

    public RemoveTopNoticeMsgAction(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        this.f84614a = str;
        this.f84615b = z;
    }
}
