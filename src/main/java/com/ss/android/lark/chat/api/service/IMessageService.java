package com.ss.android.lark.chat.api.service;

import com.bytedance.lark.pb.im.v1.BatchTransmitResponse;
import com.bytedance.lark.pb.im.v1.MergeForwardMessagesResponse;
import com.bytedance.lark.pb.im.v1.ShareAsMessageResponse;
import com.bytedance.lark.pb.im.v1.ShareObject;
import com.bytedance.lark.pb.im.v1.ShareTarget;
import com.bytedance.lark.pb.im.v1.Transmit2ThreadTarget;
import com.bytedance.lark.pb.im.v1.TransmitResponse;
import com.bytedance.lark.pb.im.v1.TransmitTarget;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.im.api.ShareAppCardLink;
import com.ss.android.lark.chat.core.model.ChannelDataFetcherStrategy;
import com.ss.android.lark.chat.core.model.MessageFetchScene;
import com.ss.android.lark.chat.core.model.entity.C33960a;
import com.ss.android.lark.chat.core.model.entity.ChatMessageResponse;
import com.ss.android.lark.chat.entity.message.AbstractC34011b;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.thread.ThreadInfo;
import com.ss.android.lark.dto.chat.MessageReadStateResponse;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

public interface IMessageService {

    @Retention(RetentionPolicy.SOURCE)
    public @interface ReadStateListType {
    }

    /* renamed from: a */
    ChatMessageResponse mo121079a(String str, MessageFetchScene messageFetchScene, int i, int i2, int i3, int i4, boolean z, ChannelDataFetcherStrategy channelDataFetcherStrategy, String str2);

    /* renamed from: a */
    Message mo121080a(String str);

    /* renamed from: a */
    MessageReadStateResponse mo121081a(String str, int i, String str2);

    /* renamed from: a */
    MessageReadStateResponse mo121082a(String str, String str2);

    /* renamed from: a */
    Map<String, Message> mo121083a(List<String> list);

    /* renamed from: a */
    Executor mo121084a();

    /* renamed from: a */
    void mo121085a(ShareObject shareObject, List<ShareTarget> list, IGetDataCallback<ShareAsMessageResponse> iGetDataCallback);

    /* renamed from: a */
    void mo121086a(Message.C34004a aVar, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: a */
    void mo121087a(Message message, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: a */
    void mo121088a(Message message, boolean z);

    /* renamed from: a */
    <T extends AbstractC34011b> void mo121089a(T t);

    /* renamed from: a */
    <T extends AbstractC34011b> void mo121090a(T t, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: a */
    void mo121091a(String str, IGetDataCallback<List<MessageInfo>> iGetDataCallback);

    /* renamed from: a */
    void mo121092a(String str, String str2, List<String> list, IGetDataCallback<Void> iGetDataCallback);

    /* renamed from: a */
    void mo121093a(String str, String str2, boolean z, IGetDataCallback<List<MessageInfo>> iGetDataCallback);

    /* renamed from: a */
    void mo121094a(String str, List<String> list, boolean z, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: a */
    void mo121095a(String str, boolean z);

    /* renamed from: a */
    void mo121096a(String str, boolean z, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: a */
    void mo121097a(String str, boolean z, boolean z2, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: a */
    void mo121098a(List<ThreadInfo> list, int i, int i2, boolean z);

    /* renamed from: a */
    void mo121099a(List<String> list, int i, String str, ShareAppCardLink abVar, String str2, String str3, String str4, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: a */
    void mo121100a(List<MessageInfo> list, int i, String str, boolean z, IGetDataCallback<C33960a> iGetDataCallback);

    /* renamed from: a */
    void mo121101a(List<MessageInfo> list, int i, boolean z, IGetDataCallback<C33960a> iGetDataCallback);

    /* renamed from: a */
    void mo121102a(List<String> list, IGetDataCallback<List<Message>> iGetDataCallback);

    /* renamed from: a */
    void mo121103a(List<String> list, String str, List<Transmit2ThreadTarget> list2, String str2, IGetDataCallback<TransmitResponse> iGetDataCallback);

    /* renamed from: a */
    void mo121104a(List<String> list, List<TransmitTarget> list2, String str, IGetDataCallback<BatchTransmitResponse> iGetDataCallback);

    /* renamed from: a */
    void mo121105a(List<String> list, List<String> list2, String str, boolean z, boolean z2, String str2, boolean z3, String str3, List<Transmit2ThreadTarget> list3, IGetDataCallback<MergeForwardMessagesResponse> iGetDataCallback);

    /* renamed from: b */
    MessageInfo mo121106b(String str);

    /* renamed from: b */
    Map<String, Message> mo121107b(List<String> list);

    /* renamed from: c */
    Map<String, Message> mo121108c(List<String> list);

    /* renamed from: c */
    void mo121109c(String str);

    /* renamed from: d */
    Map<String, MessageInfo> mo121110d(List<String> list);

    /* renamed from: d */
    void mo121111d(String str);

    /* renamed from: com.ss.android.lark.chat.api.service.IMessageService$a */
    public static class C32815a {

        /* renamed from: a */
        private String f84247a;

        /* renamed from: b */
        private int f84248b;

        /* renamed from: a */
        public String mo121112a() {
            return this.f84247a;
        }

        /* renamed from: b */
        public int mo121113b() {
            return this.f84248b;
        }

        public C32815a(String str, int i) {
            this.f84247a = str;
            this.f84248b = i;
        }
    }
}
