package com.ss.android.lark.chat.api.service.p1600b;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.Channel;
import com.bytedance.lark.pb.basic.v1.ChannelDataIncompleteStrategy;
import com.bytedance.lark.pb.basic.v1.ChannelDataScene;
import com.bytedance.lark.pb.basic.v1.Chat;
import com.bytedance.lark.pb.basic.v1.ChatOptionInfo;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.Message;
import com.bytedance.lark.pb.basic.v1.QuasiMessage;
import com.bytedance.lark.pb.basic.v1.QuasiThread;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.bytedance.lark.pb.basic.v1.Thread;
import com.bytedance.lark.pb.basic.v1.ThreadState;
import com.bytedance.lark.pb.im.v1.CancelTopicGroupFavoriteRequest;
import com.bytedance.lark.pb.im.v1.ChannelDataType;
import com.bytedance.lark.pb.im.v1.DeleteMessageNoTraceRequest;
import com.bytedance.lark.pb.im.v1.GetAnonymousInfoRequest;
import com.bytedance.lark.pb.im.v1.GetAnonymousInfoResponse;
import com.bytedance.lark.pb.im.v1.GetChannelThreadsRequest;
import com.bytedance.lark.pb.im.v1.GetChannelThreadsResponse;
import com.bytedance.lark.pb.im.v1.GetFilteredThreadsRequest;
import com.bytedance.lark.pb.im.v1.GetFilteredThreadsResponse;
import com.bytedance.lark.pb.im.v1.GetThreadMessagesByPositionsRequest;
import com.bytedance.lark.pb.im.v1.GetThreadMessagesByPositionsResponse;
import com.bytedance.lark.pb.im.v1.GetThreadMessagesV2Request;
import com.bytedance.lark.pb.im.v1.GetThreadMessagesV2Response;
import com.bytedance.lark.pb.im.v1.GetThreadsByPositionsRequest;
import com.bytedance.lark.pb.im.v1.GetThreadsByPositionsResponse;
import com.bytedance.lark.pb.im.v1.GetTopicGroupsRequest;
import com.bytedance.lark.pb.im.v1.GetTopicGroupsResponse;
import com.bytedance.lark.pb.im.v1.GetTopicGroupsToPostRequest;
import com.bytedance.lark.pb.im.v1.GetTopicGroupsToPostResponse;
import com.bytedance.lark.pb.im.v1.MGetThreadsRequest;
import com.bytedance.lark.pb.im.v1.MGetThreadsResponse;
import com.bytedance.lark.pb.im.v1.ReadChatAnnouncementRequest;
import com.bytedance.lark.pb.im.v1.RegisterTopicGroupFavoriteRequest;
import com.bytedance.lark.pb.im.v1.UpdateThreadRequest;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.C29596a;
import com.ss.android.lark.biz.im.api.ThreadStateInfo;
import com.ss.android.lark.biz.im.api.ThreadTopic;
import com.ss.android.lark.biz.im.api.TopicGroupsResponse;
import com.ss.android.lark.chat.core.model.ChannelDataFetcherStrategy;
import com.ss.android.lark.chat.core.model.MessageFetchScene;
import com.ss.android.lark.chat.entity.chatter.C33982a;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.reaction.ReactionInfo;
import com.ss.android.lark.chat.entity.response.C34020a;
import com.ss.android.lark.chat.entity.response.C34021b;
import com.ss.android.lark.chat.entity.response.C34022c;
import com.ss.android.lark.chat.entity.thread.ThreadInfo;
import com.ss.android.lark.chat.entity.thread.TopicGroup;
import com.ss.android.lark.chat.service.impl.AbstractC34230k;
import com.ss.android.lark.dependency.AbstractC36503q;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p2851u.p2852a.C57304a;
import com.ss.android.lark.p2851u.p2852a.C57306b;
import com.ss.android.lark.p2851u.p2852a.C57310e;
import com.ss.android.lark.p2851u.p2852a.C57322k;
import com.ss.android.lark.p2851u.p2852a.C57327p;
import com.ss.android.lark.p2851u.p2852a.C57332v;
import com.ss.android.lark.p2851u.p2852a.C57335x;
import com.ss.android.lark.p2851u.p2852a.C57336y;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.threadwindow.C56145l;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.chat.api.service.b.i */
public class C32881i implements AbstractC34230k {

    /* renamed from: a */
    private final AbstractC36503q f84469a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chat.api.service.b.i$a */
    public static final class C32894a {

        /* renamed from: a */
        public static final AbstractC34230k f84502a = new C32881i();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Void m126557a(byte[] bArr) throws IOException {
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ Object m126560b(byte[] bArr) throws IOException {
        return null;
    }

    /* renamed from: a */
    public static AbstractC34230k m126556a() {
        return C32894a.f84502a;
    }

    @Override // com.ss.android.lark.chat.service.impl.AbstractC34230k
    /* renamed from: a */
    public C34021b mo121346a(final String str, MessageFetchScene messageFetchScene, int i, int i2, int i3, ChannelDataFetcherStrategy channelDataFetcherStrategy, int i4, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str) || i < 0) {
            return new C34021b();
        }
        final long currentTimeMillis = System.currentTimeMillis();
        C328821 r2 = new SdkSender.IParser<C34021b>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32881i.C328821 */

            /* renamed from: a */
            public C34021b parse(byte[] bArr) throws IOException {
                Map<String, Thread> map;
                Map<String, Message> map2;
                Map<String, QuasiThread> map3;
                Map<String, Chat> map4;
                Map<String, Chat> map5;
                Map<String, QuasiThread> map6;
                C34021b bVar = new C34021b(new ArrayList(), new ArrayList(), new ArrayList(), 0, new ArrayList(), 0);
                bVar.f87918e = System.currentTimeMillis() - currentTimeMillis;
                long currentTimeMillis = System.currentTimeMillis();
                GetChannelThreadsResponse decode = GetChannelThreadsResponse.ADAPTER.decode(bArr);
                if (decode.entity == null) {
                    return bVar;
                }
                bVar.f87920g = decode.new_reply_count.intValue();
                bVar.f87922i = decode.new_at_reply_count.intValue();
                if (CollectionUtils.isNotEmpty(decode.invalid_positions)) {
                    bVar.f87915b.addAll(decode.invalid_positions);
                    Collections.sort(bVar.f87915b);
                }
                if (CollectionUtils.isNotEmpty(decode.missing_positions)) {
                    bVar.f87916c.addAll(decode.missing_positions);
                    Collections.sort(bVar.f87916c);
                }
                C14928Entity entity = decode.entity;
                C33982a a = C57306b.m222058a(entity, true, "ThreadService::syncPullThreadInfo");
                Map<String, com.ss.android.lark.chat.entity.message.Message> b = C57322k.m222132b(entity);
                bVar.f87921h = C32881i.m126559a(entity, a, b, decode.new_at_reply_ids);
                Map<String, Message> map7 = entity.messages;
                Map<String, Thread> map8 = entity.threads;
                Map<String, QuasiThread> map9 = entity.quasi_threads;
                Map<String, Chat> map10 = entity.chats;
                Iterator<GetChannelThreadsResponse.ThreadItem> it = decode.thread_items.iterator();
                while (it.hasNext()) {
                    GetChannelThreadsResponse.ThreadItem next = it.next();
                    String str = next.item_id;
                    if (next.item_type == ChannelDataType.NORMAL_DATA) {
                        map5 = map10;
                        map2 = map7;
                        map6 = map9;
                        map = map8;
                        ThreadInfo a2 = C32881i.m126554a(entity, a, b, map7, map8, map5, str);
                        if (a2 != null) {
                            bVar.f87914a.add(a2);
                            map4 = map5;
                            map3 = map6;
                            it = it;
                            map10 = map4;
                            map9 = map3;
                            map7 = map2;
                            map8 = map;
                        }
                    } else {
                        map2 = map7;
                        map5 = map10;
                        map6 = map9;
                        map = map8;
                        if (next.item_type == ChannelDataType.QUASI_DATA) {
                            QuasiMessage quasiMessage = entity.quasi_messages.get(str);
                            ThreadTopic a3 = C57332v.m222228a(map6.get(str));
                            if (quasiMessage == null || a3 == null) {
                                map4 = map5;
                                map3 = map6;
                                Log.m165383e("ThreadWindow", "parse thread failed, id is:" + str);
                                it = it;
                                map10 = map4;
                                map9 = map3;
                                map7 = map2;
                                map8 = map;
                            } else {
                                com.ss.android.lark.chat.entity.message.Message a4 = C57322k.m222119a(entity, quasiMessage);
                                ChatChatter a5 = a.mo124892a(str, a4.getFromId());
                                if (a5 == null) {
                                    Log.m165383e("ThreadWindow", "parse thread failed, chatter is null,  id is:" + str);
                                } else {
                                    ThreadInfo threadInfo = new ThreadInfo(a5, a3, a4);
                                    map4 = map5;
                                    threadInfo.mo126013a(C57310e.m222078a(map4.get(str)));
                                    if (CollectionUtils.isNotEmpty(a3.getLastReplyIds())) {
                                        ArrayList arrayList = new ArrayList();
                                        for (String str2 : a3.getLastReplyIds()) {
                                            com.ss.android.lark.chat.entity.message.Message message = b.get(str2);
                                            if (message == null) {
                                                Log.m165383e("ThreadWindow", "message is null");
                                            } else {
                                                ChatChatter a6 = a.mo124892a(str, message.getFromId());
                                                if (a6 == null) {
                                                    Log.m165383e("ThreadWindow", "message sender is null");
                                                } else {
                                                    arrayList.add(new MessageInfo(message, a6));
                                                }
                                                map6 = map6;
                                            }
                                        }
                                        map3 = map6;
                                        threadInfo.mo126016a(arrayList);
                                    } else {
                                        map3 = map6;
                                    }
                                    List<MessageInfo> a7 = C32881i.m126558a(entity, a3, a, b);
                                    if (!CollectionUtils.isEmpty(a7)) {
                                        threadInfo.mo126019b(a7);
                                    }
                                    bVar.f87914a.add(threadInfo);
                                    it = it;
                                    map10 = map4;
                                    map9 = map3;
                                    map7 = map2;
                                    map8 = map;
                                }
                            }
                        }
                        map4 = map5;
                        map3 = map6;
                        it = it;
                        map10 = map4;
                        map9 = map3;
                        map7 = map2;
                        map8 = map;
                    }
                    it = it;
                    map9 = map6;
                    map10 = map5;
                    map7 = map2;
                    map8 = map;
                }
                if (!C56145l.m218886a()) {
                    Collections.sort(bVar.f87914a, new Comparator<ThreadInfo>() {
                        /* class com.ss.android.lark.chat.api.service.p1600b.C32881i.C328821.C328831 */

                        /* renamed from: a */
                        public int compare(ThreadInfo threadInfo, ThreadInfo threadInfo2) {
                            return threadInfo.mo126018b().getPosition() - threadInfo2.mo126018b().getPosition();
                        }
                    });
                }
                Log.m165379d("ThreadWindow", "parse cost:" + (System.currentTimeMillis() - currentTimeMillis));
                bVar.f87917d = System.currentTimeMillis() - currentTimeMillis;
                return bVar;
            }
        };
        GetChannelThreadsRequest.C17476a aVar = new GetChannelThreadsRequest.C17476a();
        aVar.mo61245a(new Channel(str, Channel.Type.CHAT)).mo61247a(m126551a(messageFetchScene)).mo61253c(Integer.valueOf(i2)).mo61249a(Integer.valueOf(i3)).mo61252b(Integer.valueOf(i)).mo61246a(m126550a(channelDataFetcherStrategy)).mo61254d(Integer.valueOf(i4)).mo61248a(Boolean.valueOf(z)).mo61251b(Boolean.valueOf(z2));
        return (C34021b) SdkSender.sendRequest(Command.GET_CHANNEL_THREADS, aVar, r2);
    }

    @Override // com.ss.android.lark.chat.service.impl.AbstractC34230k
    /* renamed from: a */
    public C34021b mo121347a(final String str, final List<Integer> list) {
        if (TextUtils.isEmpty(str) || CollectionUtils.isEmpty(list)) {
            return new C34021b();
        }
        C328929 r0 = new SdkSender.IParser<C34021b>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32881i.C328929 */

            /* renamed from: a */
            public C34021b parse(byte[] bArr) throws IOException {
                Map<String, Message> map;
                GetThreadsByPositionsResponse decode = GetThreadsByPositionsResponse.ADAPTER.decode(bArr);
                C34021b bVar = new C34021b();
                C14928Entity entity = decode.entity;
                if (entity == null) {
                    return bVar;
                }
                if (CollectionUtils.isNotEmpty(decode.invalid_positions)) {
                    bVar.f87915b.addAll(decode.invalid_positions);
                    Collections.sort(bVar.f87915b);
                }
                Map<String, Message> map2 = entity.messages;
                if (CollectionUtils.isEmpty(map2)) {
                    return bVar;
                }
                Map<String, com.ss.android.lark.chat.entity.message.Message> b = C57322k.m222132b(entity);
                Map<String, Thread> map3 = entity.threads;
                C33982a a = C57306b.m222058a(entity, true, "ThreadService::syncPullThreadInfo");
                ArrayList arrayList = new ArrayList();
                Map<String, Chat> map4 = entity.chats;
                for (Map.Entry<String, Thread> entry : map3.entrySet()) {
                    com.ss.android.lark.chat.entity.message.Message message = b.get(entry.getKey());
                    ThreadTopic a2 = C57332v.m222229a(entry.getValue());
                    if (message == null || a2 == null) {
                        map = map2;
                        Log.m165383e("ThreadWindow", "parse thread failed, id is:" + entry.getKey() + ", message is :" + message + ", thread is:" + a2);
                    } else if (list.contains(Integer.valueOf(a2.getPosition()))) {
                        ChatChatter a3 = a.mo124892a(str, message.getFromId());
                        if (a3 == null) {
                            Log.m165383e("ThreadWindow", "parse thread failed, id is:" + entry.getKey() + ", chatter is:" + a3);
                        } else {
                            ThreadInfo threadInfo = new ThreadInfo(a3, a2, message);
                            threadInfo.mo126013a(C57310e.m222078a(map4.get(message.getChatId())));
                            Message message2 = map2.get(entry.getKey());
                            if (message2 != null) {
                                threadInfo.setReactionInfoList(C57304a.m222048a(a, str, C57327p.m222182a(message2.reactions)));
                                threadInfo.setPin(C57304a.m222047a(message2.pin, str, a));
                                threadInfo.setTranslateInfo(C57336y.m222236a(message, entity));
                            }
                            if (CollectionUtils.isNotEmpty(a2.getLastReplyIds())) {
                                ArrayList arrayList2 = new ArrayList();
                                for (String str : a2.getLastReplyIds()) {
                                    com.ss.android.lark.chat.entity.message.Message message3 = b.get(str);
                                    if (message3 == null) {
                                        Log.m165383e("ThreadWindow", "message is null");
                                    } else {
                                        ChatChatter a4 = a.mo124892a(str, message3.getFromId());
                                        if (a4 == null) {
                                            Log.m165383e("ThreadWindow", "message sender is null");
                                        } else {
                                            MessageInfo messageInfo = new MessageInfo(message3, a4);
                                            messageInfo.setTranslateInfo(C57336y.m222236a(message3, entity));
                                            arrayList2.add(messageInfo);
                                        }
                                        map2 = map2;
                                    }
                                }
                                map = map2;
                                threadInfo.mo126016a(arrayList2);
                            } else {
                                map = map2;
                            }
                            List<MessageInfo> a5 = C32881i.m126558a(entity, a2, a, b);
                            if (!CollectionUtils.isEmpty(a5)) {
                                threadInfo.mo126019b(a5);
                            }
                            arrayList.add(threadInfo);
                        }
                    }
                    map2 = map;
                }
                Collections.sort(arrayList, new Comparator<ThreadInfo>() {
                    /* class com.ss.android.lark.chat.api.service.p1600b.C32881i.C328929.C328931 */

                    /* renamed from: a */
                    public int compare(ThreadInfo threadInfo, ThreadInfo threadInfo2) {
                        return threadInfo.mo126018b().getPosition() - threadInfo2.mo126018b().getPosition();
                    }
                });
                bVar.f87914a.addAll(arrayList);
                return bVar;
            }
        };
        GetThreadsByPositionsRequest.C17709a aVar = new GetThreadsByPositionsRequest.C17709a();
        aVar.mo61848a(new Channel(str, Channel.Type.CHAT)).mo61849a(list);
        return (C34021b) SdkSender.sendRequest(Command.GET_THREADS_BY_POSITIONS, aVar, r0);
    }

    @Override // com.ss.android.lark.chat.service.impl.AbstractC34230k
    /* renamed from: a */
    public void mo121353a(String str, boolean z, IGetDataCallback<Void> iGetDataCallback) {
        UpdateThreadRequest.C18160a aVar = new UpdateThreadRequest.C18160a();
        aVar.mo62994a(str).mo62993a(Boolean.valueOf(z));
        SdkSender.asynSendRequestNonWrap(Command.UPDATE_THREAD, aVar, iGetDataCallback, new SdkSender.IParser<Void>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32881i.AnonymousClass11 */

            /* renamed from: a */
            public Void parse(byte[] bArr) throws IOException {
                return null;
            }
        });
    }

    @Override // com.ss.android.lark.chat.service.impl.AbstractC34230k
    /* renamed from: a */
    public void mo121352a(String str, ThreadStateInfo.ThreadState threadState, IGetDataCallback<Void> iGetDataCallback) {
        UpdateThreadRequest.C18160a aVar = new UpdateThreadRequest.C18160a();
        aVar.mo62994a(str).mo62992a(m126552a(threadState));
        SdkSender.asynSendRequestNonWrap(Command.UPDATE_THREAD, aVar, iGetDataCallback, new SdkSender.IParser<Void>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32881i.AnonymousClass12 */

            /* renamed from: a */
            public Void parse(byte[] bArr) throws IOException {
                return null;
            }
        });
    }

    @Override // com.ss.android.lark.chat.service.impl.AbstractC34230k
    /* renamed from: a */
    public C34020a mo121345a(final String str, MessageFetchScene messageFetchScene, int i, int i2, int i3, ChannelDataFetcherStrategy channelDataFetcherStrategy, int i4, boolean z) {
        if (TextUtils.isEmpty(str) || i < 0) {
            return new C34020a();
        }
        final long currentTimeMillis = System.currentTimeMillis();
        AnonymousClass13 r2 = new SdkSender.IParser<C34020a>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32881i.AnonymousClass13 */

            /* renamed from: a */
            public C34020a parse(byte[] bArr) throws IOException {
                QuasiMessage quasiMessage;
                MessageInfo a;
                ArrayList arrayList = new ArrayList();
                long currentTimeMillis = System.currentTimeMillis();
                GetThreadMessagesV2Response decode = GetThreadMessagesV2Response.ADAPTER.decode(bArr);
                C34020a aVar = new C34020a();
                aVar.f87912f = System.currentTimeMillis() - currentTimeMillis;
                if (CollectionUtils.isNotEmpty(decode.invalid_positions)) {
                    aVar.f87909c.addAll(decode.invalid_positions);
                }
                if (CollectionUtils.isNotEmpty(decode.missing_positions)) {
                    aVar.f87910d.addAll(decode.missing_positions);
                }
                C14928Entity entity = decode.entity;
                C33982a a2 = C57306b.m222058a(entity, true, "ThreadService::syncPullThreadMessageInfos");
                Map<String, com.ss.android.lark.chat.entity.message.Message> b = C57322k.m222132b(entity);
                HashMap hashMap = new HashMap();
                for (GetThreadMessagesV2Response.MessageItem messageItem : decode.message_items) {
                    String str = messageItem.item_id;
                    if (messageItem.item_type == ChannelDataType.NORMAL_DATA) {
                        Message message = entity.messages.get(str);
                        com.ss.android.lark.chat.entity.message.Message message2 = b.get(str);
                        if (!(message2 == null || message == null)) {
                            MessageInfo a3 = C57304a.m222045a(message2, message, entity, a2, hashMap);
                            arrayList.add(a3);
                            a3.setOriginalSender(C57304a.m222054c(a3.getMessage(), a2));
                            hashMap.put(str, a3);
                            MessageInfo parentMessageInfo = a3.getParentMessageInfo();
                            if (parentMessageInfo != null && !hashMap.containsKey(parentMessageInfo.getMessage().getId())) {
                                hashMap.put(parentMessageInfo.getMessage().getId(), parentMessageInfo);
                            }
                            MessageInfo rootMessageInfo = a3.getRootMessageInfo();
                            if (rootMessageInfo != null && !hashMap.containsKey(rootMessageInfo.getMessage().getId())) {
                                hashMap.put(rootMessageInfo.getMessage().getId(), rootMessageInfo);
                            }
                        }
                    } else if (!(messageItem.item_type != ChannelDataType.QUASI_DATA || (quasiMessage = entity.quasi_messages.get(str)) == null || (a = C57322k.m222122a(C57322k.m222119a(entity, quasiMessage), entity, a2, hashMap)) == null)) {
                        arrayList.add(a);
                        MessageInfo parentMessageInfo2 = a.getParentMessageInfo();
                        if (parentMessageInfo2 != null && !hashMap.containsKey(parentMessageInfo2.getMessage().getId())) {
                            hashMap.put(parentMessageInfo2.getMessage().getId(), parentMessageInfo2);
                        }
                        MessageInfo rootMessageInfo2 = a.getRootMessageInfo();
                        if (rootMessageInfo2 != null && !hashMap.containsKey(rootMessageInfo2.getMessage().getId())) {
                            hashMap.put(rootMessageInfo2.getMessage().getId(), parentMessageInfo2);
                        }
                    }
                }
                aVar.f87907a.addAll(arrayList);
                aVar.f87908b = C32881i.this.mo121350a(entity.threads.get(str), b.get(str), entity.messages.get(str), entity, a2);
                Log.m165379d("ThreadDetail", "Parse cost:" + (System.currentTimeMillis() - currentTimeMillis));
                aVar.f87911e = System.currentTimeMillis() - currentTimeMillis;
                return aVar;
            }
        };
        GetThreadMessagesV2Request.C17703a aVar = new GetThreadMessagesV2Request.C17703a();
        aVar.mo61832a(str).mo61829a(m126551a(messageFetchScene)).mo61831a(Integer.valueOf(i3)).mo61834b(Integer.valueOf(i)).mo61835c(Integer.valueOf(i2)).mo61828a(m126550a(channelDataFetcherStrategy)).mo61836d(Integer.valueOf(i4)).mo61830a(Boolean.valueOf(z));
        return (C34020a) SdkSender.sendRequest(Command.GET_THREAD_MESSAGES_V2, aVar, r2);
    }

    @Override // com.ss.android.lark.chat.service.impl.AbstractC34230k
    /* renamed from: a */
    public void mo121351a(String str, long j) {
        if (!TextUtils.isEmpty(str)) {
            ReadChatAnnouncementRequest.C17989a aVar = new ReadChatAnnouncementRequest.C17989a();
            aVar.mo62509a(str).mo62508a(Long.valueOf(j));
            SdkSender.asynSendRequestNonWrap(Command.READ_CHAT_ANNOUNCEMENT, aVar, null, $$Lambda$i$kYmhZSkxGVqATWl8X3vUspVccM.INSTANCE);
        }
    }

    @Override // com.ss.android.lark.chat.service.impl.AbstractC34230k
    /* renamed from: a */
    public C34022c mo121349a(String str, String str2, MessageFetchScene messageFetchScene, String str3, int i, int i2, List<String> list) {
        GetFilteredThreadsRequest.C17580a aVar = new GetFilteredThreadsRequest.C17580a();
        aVar.mo61518a(str).mo61521b(str2).mo61515a(m126551a(messageFetchScene)).mo61522c(str3).mo61517a(Integer.valueOf(i)).mo61520b(Integer.valueOf(i2));
        if (!CollectionUtils.isEmpty(list)) {
            GetFilteredThreadsRequest.ExtendData.C17578a aVar2 = new GetFilteredThreadsRequest.ExtendData.C17578a();
            aVar2.mo61510a(list);
            aVar.mo61516a(aVar2.build());
        }
        return (C34022c) SdkSender.sendRequest(Command.GET_FILTERED_THREADS, aVar, new SdkSender.IParser<C34022c>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32881i.AnonymousClass15 */

            /* renamed from: a */
            public C34022c parse(byte[] bArr) throws IOException {
                GetFilteredThreadsResponse decode = GetFilteredThreadsResponse.ADAPTER.decode(bArr);
                C34022c cVar = new C34022c();
                if (decode.entity == null) {
                    return cVar;
                }
                C14928Entity entity = decode.entity;
                C33982a a = C57306b.m222058a(entity, true, "ThreadService::syncPullThreadInfo");
                Map<String, com.ss.android.lark.chat.entity.message.Message> b = C57322k.m222132b(entity);
                Map<String, Message> map = entity.messages;
                Map<String, Thread> map2 = entity.threads;
                Map<String, Chat> map3 = entity.chats;
                for (GetFilteredThreadsResponse.ThreadItem threadItem : decode.thread_items) {
                    ThreadInfo a2 = C32881i.m126554a(entity, a, b, map, map2, map3, threadItem.item_id);
                    if (a2 != null) {
                        a2.mo126015a(threadItem.filter_id);
                        cVar.f87923a.add(a2);
                    }
                    entity = entity;
                }
                if (!C56145l.m218886a()) {
                    Collections.reverse(cVar.f87923a);
                }
                cVar.f87924b = decode.next_cursor;
                cVar.f87925c = decode.prev_cursor;
                cVar.f87926d = decode.next_filter_id;
                cVar.f87927e = decode.prev_filter_id;
                return cVar;
            }
        });
    }

    @Override // com.ss.android.lark.biz.im.api.IThreadService
    /* renamed from: a */
    public ThreadTopic mo106481a(final String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        MGetThreadsRequest.C17807a aVar = new MGetThreadsRequest.C17807a();
        aVar.mo62081a(Collections.singletonList(str)).mo62080a(SyncDataStrategy.LOCAL);
        return (ThreadTopic) SdkSender.syncSend(Command.MGET_THREADS, aVar, new SdkSender.IParser<ThreadTopic>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32881i.C328852 */

            /* renamed from: a */
            public ThreadTopic parse(byte[] bArr) throws IOException {
                MGetThreadsResponse decode = MGetThreadsResponse.ADAPTER.decode(bArr);
                if (decode.entity == null || !CollectionUtils.isNotEmpty(decode.entity.threads)) {
                    return null;
                }
                return C57332v.m222229a(decode.entity.threads.get(str));
            }
        });
    }

    @Override // com.ss.android.lark.biz.im.api.IThreadService
    /* renamed from: a */
    public void mo106485a(String str, IGetDataCallback<ThreadTopic> iGetDataCallback) {
        if (!TextUtils.isEmpty(str)) {
            MGetThreadsRequest.C17807a aVar = new MGetThreadsRequest.C17807a();
            aVar.mo62081a(Collections.singletonList(str)).mo62080a(SyncDataStrategy.TRY_LOCAL);
            SdkSender.asynSendRequestNonWrap(Command.MGET_THREADS, aVar, iGetDataCallback, new SdkSender.IParser(str) {
                /* class com.ss.android.lark.chat.api.service.p1600b.$$Lambda$i$TZUCperGXA0rbxUmESMnkKbRsw0 */
                public final /* synthetic */ String f$0;

                {
                    this.f$0 = r1;
                }

                @Override // com.ss.android.lark.sdk.SdkSender.IParser
                public final Object parse(byte[] bArr) {
                    return C32881i.m126553a(this.f$0, bArr);
                }
            });
        } else if (iGetDataCallback != null) {
            iGetDataCallback.onError(new ErrorResult("thread id is empty"));
        }
    }

    /* renamed from: a */
    public ThreadInfo mo121350a(Thread thread, com.ss.android.lark.chat.entity.message.Message message, Message message2, C14928Entity entity, C33982a aVar) {
        ChatChatter a;
        ThreadTopic a2 = C57332v.m222229a(thread);
        if (message == null || a2 == null || (a = aVar.mo124892a(message.getChatId(), message2.from_id)) == null) {
            return null;
        }
        List<ReactionInfo> a3 = C57304a.m222048a(aVar, a.getChatId(), C57327p.m222182a(message2.reactions));
        ThreadInfo threadInfo = new ThreadInfo(a, a2, message);
        threadInfo.mo126014a(C57304a.m222054c(message, aVar));
        threadInfo.setReactionInfoList(a3);
        threadInfo.setPin(C57304a.m222047a(message2.pin, message.getChatId(), aVar));
        threadInfo.setTranslateInfo(C57336y.m222236a(message, entity));
        threadInfo.mo126013a(C57310e.m222078a(entity.chats.get(message.getChatId())));
        return threadInfo;
    }

    @Override // com.ss.android.lark.biz.im.api.IThreadService
    /* renamed from: a */
    public void mo106483a(int i, String str, IGetDataCallback<TopicGroupsResponse> iGetDataCallback) {
        GetTopicGroupsToPostRequest.C17721a aVar = new GetTopicGroupsToPostRequest.C17721a();
        aVar.mo61877a(Integer.valueOf(i)).mo61878a(str);
        SdkSender.asynSendRequestNonWrap(Command.GET_TOPIC_GROUPS_TO_POST, aVar, iGetDataCallback, new SdkSender.IParser<TopicGroupsResponse>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32881i.C328874 */

            /* renamed from: a */
            public TopicGroupsResponse parse(byte[] bArr) throws IOException {
                return C57332v.m222230a(GetTopicGroupsToPostResponse.ADAPTER.decode(bArr));
            }
        });
    }

    @Override // com.ss.android.lark.biz.im.api.IThreadService
    /* renamed from: a */
    public void mo106484a(IGetDataCallback<C29596a> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_ANONYMOUS_INFO, new GetAnonymousInfoRequest.C17470a(), iGetDataCallback, new SdkSender.IParser<C29596a>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32881i.C328885 */

            /* renamed from: a */
            public C29596a parse(byte[] bArr) throws IOException {
                GetAnonymousInfoResponse decode = GetAnonymousInfoResponse.ADAPTER.decode(bArr);
                return new C29596a(decode.left_quota.longValue(), decode.total_quota.longValue());
            }
        });
    }

    @Override // com.ss.android.lark.biz.im.api.IThreadService
    /* renamed from: a */
    public TopicGroup mo106482a(String str, boolean z) {
        return m126555a(str, false, z);
    }

    private C32881i() {
        this.f84469a = C29990c.m110930b().mo134586n();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.chat.api.service.b.i$10  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass10 {

        /* renamed from: a */
        static final /* synthetic */ int[] f84474a;

        /* renamed from: b */
        static final /* synthetic */ int[] f84475b;

        /* renamed from: c */
        static final /* synthetic */ int[] f84476c;

        /* renamed from: d */
        static final /* synthetic */ int[] f84477d;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|(2:19|20)|21|23|24|25|26|(2:27|28)|29|31|32|33|34|(3:35|36|38)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|23|24|25|26|(2:27|28)|29|31|32|33|34|(3:35|36|38)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|23|24|25|26|(2:27|28)|29|31|32|33|34|35|36|38) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0069 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0073 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x008e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0098 */
        static {
            /*
            // Method dump skipped, instructions count: 163
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.api.service.p1600b.C32881i.AnonymousClass10.<clinit>():void");
        }
    }

    /* renamed from: a */
    private ChannelDataIncompleteStrategy m126550a(ChannelDataFetcherStrategy channelDataFetcherStrategy) {
        int i = AnonymousClass10.f84474a[channelDataFetcherStrategy.ordinal()];
        if (i == 1) {
            return ChannelDataIncompleteStrategy.IGNORE_LOCAL_DATA;
        }
        if (i == 2) {
            return ChannelDataIncompleteStrategy.RETURN_LOCAL_DATA;
        }
        if (i != 3) {
            return ChannelDataIncompleteStrategy.SYNC_SERVER_DATA;
        }
        return ChannelDataIncompleteStrategy.SYNC_SERVER_DATA;
    }

    /* renamed from: a */
    private ChannelDataScene m126551a(MessageFetchScene messageFetchScene) {
        int i = AnonymousClass10.f84476c[messageFetchScene.ordinal()];
        if (i == 1) {
            return ChannelDataScene.FIRST_SCREEN;
        }
        if (i == 2) {
            return ChannelDataScene.SPECIFIED_POSITION;
        }
        if (i == 3) {
            return ChannelDataScene.NEXT_PAGE;
        }
        if (i != 4) {
            return ChannelDataScene.FIRST_SCREEN;
        }
        return ChannelDataScene.PREVIOUS_PAGE;
    }

    @Override // com.ss.android.lark.biz.im.api.IThreadService
    /* renamed from: b */
    public ThreadTopic mo106486b(final String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        MGetThreadsRequest.C17807a aVar = new MGetThreadsRequest.C17807a();
        aVar.mo62081a(Collections.singletonList(str)).mo62080a(SyncDataStrategy.FORCE_SERVER);
        return (ThreadTopic) SdkSender.sendRequest(Command.MGET_THREADS, aVar, new SdkSender.IParser<ThreadTopic>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32881i.C328863 */

            /* renamed from: a */
            public ThreadTopic parse(byte[] bArr) throws IOException {
                MGetThreadsResponse decode = MGetThreadsResponse.ADAPTER.decode(bArr);
                if (decode.entity == null || !CollectionUtils.isNotEmpty(decode.entity.threads)) {
                    return null;
                }
                return C57332v.m222229a(decode.entity.threads.get(str));
            }
        });
    }

    /* renamed from: a */
    private ThreadState m126552a(ThreadStateInfo.ThreadState threadState) {
        int i = AnonymousClass10.f84475b[threadState.ordinal()];
        if (i == 1) {
            return ThreadState.OPEN;
        }
        if (i == 2) {
            return ThreadState.CLOSED;
        }
        if (i != 3) {
            return ThreadState.UNKNOWN_STATE;
        }
        return ThreadState.UNKNOWN_STATE;
    }

    @Override // com.ss.android.lark.biz.im.api.IThreadService
    /* renamed from: c */
    public void mo106488c(String str, IGetDataCallback<Object> iGetDataCallback) {
        RegisterTopicGroupFavoriteRequest.C18001a aVar = new RegisterTopicGroupFavoriteRequest.C18001a();
        aVar.mo62536a(str);
        SdkSender.asynSendRequestNonWrap(Command.REGISTER_TOPIC_GROUP_FAVORITE, aVar, iGetDataCallback, new SdkSender.IParser<Object>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32881i.C328907 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                return true;
            }
        });
    }

    @Override // com.ss.android.lark.biz.im.api.IThreadService
    /* renamed from: d */
    public void mo106489d(String str, IGetDataCallback<Object> iGetDataCallback) {
        CancelTopicGroupFavoriteRequest.C17304a aVar = new CancelTopicGroupFavoriteRequest.C17304a();
        aVar.mo60791a(str);
        SdkSender.asynSendRequestNonWrap(Command.CANCEL_TOPIC_GROUP_FAVORITE, aVar, iGetDataCallback, new SdkSender.IParser<Object>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32881i.C328918 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                return true;
            }
        });
    }

    @Override // com.ss.android.lark.chat.service.impl.AbstractC34230k
    /* renamed from: b */
    public C34020a mo121354b(String str, final List<Integer> list) {
        if (TextUtils.isEmpty(str) || CollectionUtils.isEmpty(list)) {
            return new C34020a();
        }
        AnonymousClass14 r0 = new SdkSender.IParser<C34020a>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32881i.AnonymousClass14 */

            /* renamed from: a */
            public C34020a parse(byte[] bArr) throws IOException {
                GetThreadMessagesByPositionsResponse decode = GetThreadMessagesByPositionsResponse.ADAPTER.decode(bArr);
                C34020a aVar = new C34020a();
                C14928Entity entity = decode.entity;
                if (entity == null) {
                    return aVar;
                }
                Map<String, Message> map = entity.messages;
                if (CollectionUtils.isEmpty(map)) {
                    return aVar;
                }
                Map<String, com.ss.android.lark.chat.entity.message.Message> b = C57322k.m222132b(entity);
                C33982a a = C57306b.m222058a(entity, true, "MessageService::syncPullMessagesByPositions");
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, com.ss.android.lark.chat.entity.message.Message> entry : b.entrySet()) {
                    String key = entry.getKey();
                    com.ss.android.lark.chat.entity.message.Message value = entry.getValue();
                    if (list.contains(Integer.valueOf(value.getThreadPosition()))) {
                        arrayList.add(C57304a.m222044a(value, map.get(key), entity, a));
                    }
                }
                Collections.sort(arrayList, new Comparator<MessageInfo>() {
                    /* class com.ss.android.lark.chat.api.service.p1600b.C32881i.AnonymousClass14.C328841 */

                    /* renamed from: a */
                    public int compare(MessageInfo messageInfo, MessageInfo messageInfo2) {
                        return messageInfo.getMessage().getThreadPosition() - messageInfo2.getMessage().getThreadPosition();
                    }
                });
                aVar.f87907a.addAll(arrayList);
                if (CollectionUtils.isNotEmpty(decode.invalid_positions)) {
                    aVar.f87909c.addAll(decode.invalid_positions);
                }
                return aVar;
            }
        };
        GetThreadMessagesByPositionsRequest.C17699a aVar = new GetThreadMessagesByPositionsRequest.C17699a();
        aVar.mo61818a(str).mo61819a(list);
        return (C34020a) SdkSender.sendRequest(Command.GET_THREAD_MESSAGES_BY_POSITIONS, aVar, r0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ ThreadTopic m126553a(String str, byte[] bArr) throws IOException {
        MGetThreadsResponse decode = MGetThreadsResponse.ADAPTER.decode(bArr);
        if (decode.entity == null || !CollectionUtils.isNotEmpty(decode.entity.threads)) {
            return null;
        }
        return C57332v.m222229a(decode.entity.threads.get(str));
    }

    @Override // com.ss.android.lark.biz.im.api.IThreadService
    /* renamed from: b */
    public void mo106487b(String str, IGetDataCallback<Void> iGetDataCallback) {
        if (TextUtils.isEmpty(str) && iGetDataCallback != null) {
            iGetDataCallback.onError(new ErrorResult("thread id is empty"));
        }
        DeleteMessageNoTraceRequest.C17412a aVar = new DeleteMessageNoTraceRequest.C17412a();
        aVar.mo61095a(str);
        SdkSender.asynSendRequestNonWrap(Command.DELETE_MESSAEG_NO_TRACE, aVar, iGetDataCallback, $$Lambda$i$gntiFN9mSAchDlMVFSIYk4D9_0.INSTANCE);
    }

    /* renamed from: a */
    private TopicGroup m126555a(final String str, boolean z, final boolean z2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        GetTopicGroupsRequest.C17717a aVar = new GetTopicGroupsRequest.C17717a();
        aVar.mo61867a(Collections.singletonList(str)).mo61866a(Boolean.valueOf(z)).mo61869b(Boolean.valueOf(z2));
        return (TopicGroup) SdkSender.sendRequest(Command.GET_TOPIC_GROUPS, aVar, new SdkSender.IParser<TopicGroup>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32881i.C328896 */

            /* renamed from: a */
            public TopicGroup parse(byte[] bArr) throws IOException {
                com.bytedance.lark.pb.basic.v1.TopicGroup topicGroup;
                ChatOptionInfo chatOptionInfo;
                GetTopicGroupsResponse decode = GetTopicGroupsResponse.ADAPTER.decode(bArr);
                if (decode.entity == null || !CollectionUtils.isNotEmpty(decode.entity.topic_groups) || (topicGroup = decode.entity.topic_groups.get(str)) == null) {
                    return null;
                }
                if (!z2 || !CollectionUtils.isNotEmpty(decode.entity.chats)) {
                    return C57335x.m222234a(topicGroup);
                }
                com.ss.android.lark.chat.entity.chat.Chat a = C57310e.m222078a(decode.entity.chats.get(str));
                if (!(a == null || !CollectionUtils.isNotEmpty(decode.group_option_info) || decode.group_option_info.get(str) == null || (chatOptionInfo = decode.group_option_info.get(str)) == null)) {
                    com.ss.android.lark.chat.entity.chat.ChatOptionInfo chatOptionInfo2 = new com.ss.android.lark.chat.entity.chat.ChatOptionInfo();
                    chatOptionInfo2.setAnnounceIsUnread(chatOptionInfo.announce.booleanValue());
                    chatOptionInfo2.setId(chatOptionInfo.id);
                    a.setChatOptionInfo(chatOptionInfo2);
                }
                return C57335x.m222235a(topicGroup, a);
            }
        });
    }

    /* renamed from: a */
    public static List<MessageInfo> m126558a(C14928Entity entity, ThreadTopic threadTopic, C33982a aVar, Map<String, com.ss.android.lark.chat.entity.message.Message> map) {
        ArrayList arrayList = new ArrayList();
        if (threadTopic != null && !CollectionUtils.isEmpty(threadTopic.getLatestAtMessageIds())) {
            return m126559a(entity, aVar, map, threadTopic.getLatestAtMessageIds());
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<MessageInfo> m126559a(C14928Entity entity, C33982a aVar, Map<String, com.ss.android.lark.chat.entity.message.Message> map, List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            com.ss.android.lark.chat.entity.message.Message message = map.get(str);
            if (message == null) {
                Log.m165383e("ThreadWindow", "last at message is null; Id: " + str);
            } else {
                ChatChatter a = aVar.mo124892a(message.getChatId(), message.getFromId());
                if (a == null) {
                    Log.m165383e("ThreadWindow", "last at message sender is null: Id: " + str);
                } else {
                    MessageInfo messageInfo = new MessageInfo(message, a);
                    messageInfo.setTranslateInfo(C57336y.m222236a(message, entity));
                    messageInfo.setOriginalSender(C57304a.m222054c(message, aVar));
                    arrayList.add(messageInfo);
                }
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.chat.service.impl.AbstractC34230k
    /* renamed from: a */
    public C34022c mo121348a(String str, String str2, MessageFetchScene messageFetchScene, String str3, int i, int i2) {
        return mo121349a(str, str2, messageFetchScene, str3, i, i2, (List<String>) null);
    }

    /* renamed from: a */
    public static ThreadInfo m126554a(C14928Entity entity, C33982a aVar, Map<String, com.ss.android.lark.chat.entity.message.Message> map, Map<String, Message> map2, Map<String, Thread> map3, Map<String, Chat> map4, String str) {
        com.ss.android.lark.chat.entity.message.Message message = map.get(str);
        ThreadTopic a = C57332v.m222229a(map3.get(str));
        if (message == null || a == null) {
            Log.m165383e("ThreadWindow", "parse thread failed, id is:" + str + ", message is :" + message + ", thread is:" + a);
            return null;
        }
        String chatId = message.getChatId();
        ChatChatter a2 = aVar.mo124892a(chatId, message.getFromId());
        if (a2 == null) {
            Log.m165383e("ThreadWindow", "parse thread failed id is:" + str + ", chatter is:" + a2);
            return null;
        }
        ThreadInfo threadInfo = new ThreadInfo(a2, a, message);
        threadInfo.mo126013a(C57310e.m222078a(map4.get(message.getChatId())));
        threadInfo.mo126014a(C57304a.m222054c(message, aVar));
        Message message2 = map2.get(str);
        if (message2 != null) {
            threadInfo.setReactionInfoList(C57304a.m222048a(aVar, chatId, C57327p.m222182a(message2.reactions)));
            threadInfo.setPin(C57304a.m222047a(message2.pin, chatId, aVar));
            threadInfo.setTranslateInfo(C57336y.m222236a(message, entity));
        }
        if (CollectionUtils.isNotEmpty(a.getLastReplyIds())) {
            ArrayList arrayList = new ArrayList();
            for (String str2 : a.getLastReplyIds()) {
                com.ss.android.lark.chat.entity.message.Message message3 = map.get(str2);
                if (message3 == null) {
                    Log.m165383e("ThreadWindow", "message is null");
                } else {
                    ChatChatter a3 = aVar.mo124892a(chatId, message3.getFromId());
                    if (a3 == null) {
                        Log.m165383e("ThreadWindow", "message sender is null");
                    } else {
                        MessageInfo messageInfo = new MessageInfo(message3, a3);
                        messageInfo.setTranslateInfo(C57336y.m222236a(message3, entity));
                        messageInfo.setOriginalSender(C57304a.m222054c(message3, aVar));
                        arrayList.add(messageInfo);
                    }
                }
            }
            threadInfo.mo126016a(arrayList);
        }
        List<MessageInfo> a4 = m126558a(entity, a, aVar, map);
        if (!CollectionUtils.isEmpty(a4)) {
            threadInfo.mo126019b(a4);
        }
        return threadInfo;
    }
}
