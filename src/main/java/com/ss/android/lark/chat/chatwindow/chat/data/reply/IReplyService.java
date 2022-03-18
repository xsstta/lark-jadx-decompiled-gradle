package com.ss.android.lark.chat.chatwindow.chat.data.reply;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35221d;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H&J \u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H&J \u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/data/reply/IReplyService;", "", "getReEditReplyInfo", "", "messageInfo", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chatwindow/model/data/ReplyInfo;", "getReplyInfo", "getReplyInfoV2", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.data.b.d */
public interface IReplyService {
    /* renamed from: a */
    void mo122510a(MessageInfo messageInfo, IGetDataCallback<C35221d> iGetDataCallback);

    /* renamed from: b */
    void mo122511b(MessageInfo messageInfo, IGetDataCallback<C35221d> iGetDataCallback);

    /* renamed from: c */
    void mo122512c(MessageInfo messageInfo, IGetDataCallback<C35221d> iGetDataCallback);
}
