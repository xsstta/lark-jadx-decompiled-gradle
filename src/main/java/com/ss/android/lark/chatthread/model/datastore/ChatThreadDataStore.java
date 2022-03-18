package com.ss.android.lark.chatthread.model.datastore;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.chat.core.model.AbstractExecutorC33962g;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chatbase.AbstractC34417b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0014J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0014J\b\u0010\u000e\u001a\u00020\u0005H\u0014J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u0002H\u0014J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0002H\u0002J\u0012\u0010\u0015\u001a\u00020\u00122\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0014R\u000e\u0010\t\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/chatthread/model/datastore/ChatThreadDataStore;", "Lcom/ss/android/lark/chatbase/BasePageStore;", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "Lcom/ss/android/lark/chatthread/model/datastore/ChatThreadPageData;", "rootMsgId", "", "executor", "Lcom/ss/android/lark/chat/core/model/ISerialExecutor;", "(Ljava/lang/String;Lcom/ss/android/lark/chat/core/model/ISerialExecutor;)V", "LOG_TAG", "getDataBadgeCount", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "getDataPosition", "getLogTag", "initDataExtraHandler", "", "isDataCanShow", "", "isRootMessage", "msg", "shouldNoTraceDeleteImmediately", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatthread.c.a.a */
public final class ChatThreadDataStore extends AbstractC34417b<MessageInfo, ChatThreadPageData> {

    /* renamed from: a */
    private final String f90723a = "ChatThreadDataStore";

    /* renamed from: i */
    private final String f90724i;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatbase.AbstractC34417b
    /* renamed from: a */
    public void mo122933a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo122944c(MessageInfo messageInfo) {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatbase.AbstractC34417b
    /* renamed from: c */
    public String mo122942c() {
        return this.f90723a;
    }

    /* renamed from: e */
    private final boolean m137059e(MessageInfo messageInfo) {
        Message message = messageInfo.getMessage();
        Intrinsics.checkExpressionValueIsNotNull(message, "msg.getMessage()");
        return Intrinsics.areEqual(message.getId(), this.f90724i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo122939b(MessageInfo messageInfo) {
        Intrinsics.checkParameterIsNotNull(messageInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Message message = messageInfo.getMessage();
        Intrinsics.checkExpressionValueIsNotNull(message, "data.getMessage()");
        return message.getPosition();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo122932a(MessageInfo messageInfo) {
        Intrinsics.checkParameterIsNotNull(messageInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Message message = messageInfo.getMessage();
        Intrinsics.checkExpressionValueIsNotNull(message, "data.getMessage()");
        return message.getBadgeCount();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo127121h(MessageInfo messageInfo) {
        Intrinsics.checkParameterIsNotNull(messageInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (!m137059e(messageInfo)) {
            return super.mo127121h(messageInfo);
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatThreadDataStore(String str, AbstractExecutorC33962g gVar) {
        super(gVar, null);
        Intrinsics.checkParameterIsNotNull(str, "rootMsgId");
        Intrinsics.checkParameterIsNotNull(gVar, "executor");
        this.f90724i = str;
    }
}
