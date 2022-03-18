package com.ss.android.lark.chat.api.service.p1600b;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.Channel;
import com.bytedance.lark.pb.basic.v1.ChannelDataIncompleteStrategy;
import com.bytedance.lark.pb.basic.v1.ChannelDataScene;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.File;
import com.bytedance.lark.pb.basic.v1.MergeFowardMessageType;
import com.bytedance.lark.pb.basic.v1.Message;
import com.bytedance.lark.pb.basic.v1.QuasiContent;
import com.bytedance.lark.pb.basic.v1.QuasiMessage;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.bytedance.lark.pb.basic.v1.Thread;
import com.bytedance.lark.pb.basic.v1.Trace;
import com.bytedance.lark.pb.im.v1.BatchTransmitRequest;
import com.bytedance.lark.pb.im.v1.BatchTransmitResponse;
import com.bytedance.lark.pb.im.v1.CardLink;
import com.bytedance.lark.pb.im.v1.CreateQuasiMessageRequest;
import com.bytedance.lark.pb.im.v1.CreateQuasiMessageResponse;
import com.bytedance.lark.pb.im.v1.DeleteEphemeralMessageRequest;
import com.bytedance.lark.pb.im.v1.DeleteMessagesRequest;
import com.bytedance.lark.pb.im.v1.DeleteMessagesResponse;
import com.bytedance.lark.pb.im.v1.DeleteQuasiMessageRequest;
import com.bytedance.lark.pb.im.v1.DeleteQuasiMessageResponse;
import com.bytedance.lark.pb.im.v1.GetAudioMessageRecognitionRequest;
import com.bytedance.lark.pb.im.v1.GetChatMessagesRequest;
import com.bytedance.lark.pb.im.v1.GetChatMessagesResponse;
import com.bytedance.lark.pb.im.v1.GetMessageIdsByPositionRequest;
import com.bytedance.lark.pb.im.v1.GetMessageReadStateRequest;
import com.bytedance.lark.pb.im.v1.GetMessageReadStateResponse;
import com.bytedance.lark.pb.im.v1.GetMessagesByPositionsRequest;
import com.bytedance.lark.pb.im.v1.GetMessagesByPositionsResponse;
import com.bytedance.lark.pb.im.v1.GetSystemMessageTemplateRequest;
import com.bytedance.lark.pb.im.v1.GetUnreadAtMessagesRequest;
import com.bytedance.lark.pb.im.v1.GetUnreadAtMessagesResponse;
import com.bytedance.lark.pb.im.v1.HideMessageUrlPreviewRequest;
import com.bytedance.lark.pb.im.v1.MGetMessagesRequest;
import com.bytedance.lark.pb.im.v1.MGetMessagesResponse;
import com.bytedance.lark.pb.im.v1.MergeForwardMessagesRequest;
import com.bytedance.lark.pb.im.v1.MergeForwardMessagesResponse;
import com.bytedance.lark.pb.im.v1.RecallGroupMessageRequest;
import com.bytedance.lark.pb.im.v1.RecallMessageRequest;
import com.bytedance.lark.pb.im.v1.RecallMessageResponse;
import com.bytedance.lark.pb.im.v1.ResendMessageRequest;
import com.bytedance.lark.pb.im.v1.SendMessageRequest;
import com.bytedance.lark.pb.im.v1.SendMessageResponse;
import com.bytedance.lark.pb.im.v1.SendShareThreadRequest;
import com.bytedance.lark.pb.im.v1.SendSpeechRecognitionRequest;
import com.bytedance.lark.pb.im.v1.SendSpeechRecognitionResponse;
import com.bytedance.lark.pb.im.v1.ShareApp;
import com.bytedance.lark.pb.im.v1.ShareAppCardRequest;
import com.bytedance.lark.pb.im.v1.ShareAppCardResponse;
import com.bytedance.lark.pb.im.v1.ShareAppPage;
import com.bytedance.lark.pb.im.v1.ShareAsMessageRequest;
import com.bytedance.lark.pb.im.v1.ShareAsMessageResponse;
import com.bytedance.lark.pb.im.v1.ShareH5;
import com.bytedance.lark.pb.im.v1.ShareObject;
import com.bytedance.lark.pb.im.v1.ShareTarget;
import com.bytedance.lark.pb.im.v1.ToggleTextOnAudioRequest;
import com.bytedance.lark.pb.im.v1.ToggleTextOnAudioResponse;
import com.bytedance.lark.pb.im.v1.Transmit2ThreadTarget;
import com.bytedance.lark.pb.im.v1.TransmitRequest;
import com.bytedance.lark.pb.im.v1.TransmitResponse;
import com.bytedance.lark.pb.im.v1.TransmitTarget;
import com.bytedance.lark.pb.im.v1.UpdateMessagesMeReadRequest;
import com.bytedance.lark.pb.im.v1.UpdateQuasiMessageRequest;
import com.bytedance.lark.pb.im.v1.UpdateThreadsMeReadRequest;
import com.bytedance.lark.pb.media.v1.GetUploadIdRequest;
import com.bytedance.lark.pb.media.v1.GetUploadIdResponse;
import com.bytedance.lark.pb.media.v1.UploadAudioDataRequest;
import com.bytedance.lark.pb.media.v1.UploadAudioDataResponse;
import com.bytedance.lark.pb.media.v1.UploadFilesRequest;
import com.bytedance.lark.pb.media.v1.UploadFilesResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.LarkUriUtil;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.appsetting.api.SettingManager;
import com.ss.android.lark.biz.im.api.C29613e;
import com.ss.android.lark.biz.im.api.C29631w;
import com.ss.android.lark.biz.im.api.ShareAppCardLink;
import com.ss.android.lark.biz.im.api.ThreadTopic;
import com.ss.android.lark.chat.api.service.IMessageService;
import com.ss.android.lark.chat.base.model.C32915a;
import com.ss.android.lark.chat.base.model.FormatConfig;
import com.ss.android.lark.chat.base.model.ImageSendConfig;
import com.ss.android.lark.chat.core.model.ChannelDataFetcherStrategy;
import com.ss.android.lark.chat.core.model.MessageFetchScene;
import com.ss.android.lark.chat.core.model.entity.C33960a;
import com.ss.android.lark.chat.core.model.entity.ChatMessageResponse;
import com.ss.android.lark.chat.entity.Channel;
import com.ss.android.lark.chat.entity.chatter.C33982a;
import com.ss.android.lark.chat.entity.message.AbstractC34011b;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.SendStatus;
import com.ss.android.lark.chat.entity.p1668h.AbstractC33998f;
import com.ss.android.lark.chat.entity.p1668h.C33995c;
import com.ss.android.lark.chat.entity.response.C34023d;
import com.ss.android.lark.chat.entity.thread.ThreadInfo;
import com.ss.android.lark.chat.service.AbstractC34125f;
import com.ss.android.lark.chat.service.AbstractC34295j;
import com.ss.android.lark.chat.service.C34298m;
import com.ss.android.lark.chat.service.IInnerMessageService;
import com.ss.android.lark.chat.service.impl.AbstractC34231l;
import com.ss.android.lark.chat.service.impl.C34238q;
import com.ss.android.lark.chat.service.impl.C34253r;
import com.ss.android.lark.chat.service.impl.C34258s;
import com.ss.android.lark.chat.service.impl.C34273t;
import com.ss.android.lark.chat.service.impl.IMediaSendCallback;
import com.ss.android.lark.chat.service.impl.MonitorMessageSendCallback;
import com.ss.android.lark.chat.service.p1678a.p1679a.C34118b;
import com.ss.android.lark.chat.utils.ChatParamUtils;
import com.ss.android.lark.chat.utils.FileSendUtils;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.diskmanage.cipher.C36808a;
import com.ss.android.lark.diskmanage.cipher.DecryptException;
import com.ss.android.lark.dto.chat.GetMessageIdsByPositionResponse;
import com.ss.android.lark.dto.chat.MessageReadStateResponse;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p2851u.p2852a.C57304a;
import com.ss.android.lark.p2851u.p2852a.C57306b;
import com.ss.android.lark.p2851u.p2852a.C57309d;
import com.ss.android.lark.p2851u.p2852a.C57310e;
import com.ss.android.lark.p2851u.p2852a.C57314g;
import com.ss.android.lark.p2851u.p2852a.C57322k;
import com.ss.android.lark.p2851u.p2852a.C57328q;
import com.ss.android.lark.sdk.C53234a;
import com.ss.android.lark.sdk.C53253l;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.statistics.chat.ChatHitPointNew;
import com.ss.android.lark.statistics.message.MessageHitPoint;
import com.ss.android.lark.statistics.multiselect.MultiSelectHitPoint;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.C57788ai;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.ao;
import com.ss.android.lark.utils.compress.VideoCompressResult;
import com.ss.android.lark.utils.p2904a.C57760a;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.lark.utils.statistics.PerfLog;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import okio.ByteString;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.chat.api.service.b.e */
public class C32848e implements IInnerMessageService {

    /* renamed from: a */
    private final AbstractC36450aa f84371a;

    /* renamed from: b */
    private final Executor f84372b;

    /* renamed from: c */
    private final boolean f84373c;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chat.api.service.b.e$a */
    public static final class C32863a {

        /* renamed from: a */
        public static final C32848e f84441a = new C32848e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.chat.api.service.b.e$b */
    public interface AbstractC32864b {
        /* renamed from: a */
        int mo121298a(Message message);

        /* renamed from: b */
        int mo121299b(Message message);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ Void m126404c(byte[] bArr) throws IOException {
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ Object m126411g(byte[] bArr) throws IOException {
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ String m126414i(byte[] bArr) throws IOException {
        return "";
    }

    /* renamed from: lambda$gOr-w43koHl0M41rPUodkoTfsAc  reason: not valid java name */
    public static /* synthetic */ Boolean m270338lambda$gOrw43koHl0M41rPUodkoTfsAc(byte[] bArr) {
        return true;
    }

    /* renamed from: b */
    public static IInnerMessageService m126401b() {
        return C32863a.f84441a;
    }

    @Override // com.ss.android.lark.chat.api.service.IMessageService
    /* renamed from: a */
    public Executor mo121084a() {
        return this.f84372b;
    }

    @Override // com.ss.android.lark.chat.api.service.IMessageService
    /* renamed from: a */
    public void mo121102a(List<String> list, final IGetDataCallback<List<Message>> iGetDataCallback) {
        ArrayList arrayList = new ArrayList(list);
        Map<String, Message> c = mo121108c(list);
        final ArrayList arrayList2 = new ArrayList(c.values());
        arrayList.removeAll(c.keySet());
        if (!CollectionUtils.isEmpty(arrayList)) {
            m126409e(arrayList, new IGetDataCallback<Map<String, Message>>() {
                /* class com.ss.android.lark.chat.api.service.p1600b.C32848e.C328491 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(errorResult);
                    }
                }

                /* renamed from: a */
                public void onSuccess(Map<String, Message> map) {
                    if (!CollectionUtils.isEmpty(map)) {
                        arrayList2.addAll(new ArrayList(map.values()));
                    }
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(arrayList2);
                    }
                }
            });
        } else if (iGetDataCallback != null) {
            iGetDataCallback.onSuccess(arrayList2);
        }
    }

    @Override // com.ss.android.lark.chat.api.service.IMessageService
    /* renamed from: a */
    public Map<String, Message> mo121083a(List<String> list) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList(list);
        Map<String, Message> c = mo121108c(list);
        hashMap.putAll(c);
        arrayList.removeAll(c.keySet());
        Map<String, Message> b = mo121107b(arrayList);
        if (b != null) {
            hashMap.putAll(b);
        }
        return hashMap;
    }

    @Override // com.ss.android.lark.chat.api.service.IMessageService
    /* renamed from: a */
    public MessageReadStateResponse mo121081a(String str, int i, String str2) {
        GetMessageReadStateRequest.C17627a aVar = new GetMessageReadStateRequest.C17627a();
        GetMessageReadStateRequest.ListType fromValue = GetMessageReadStateRequest.ListType.fromValue(i);
        aVar.mo61646a(str).mo61645a((Boolean) true).mo61644a(fromValue);
        if (!TextUtils.isEmpty(str2)) {
            int i2 = AnonymousClass28.f84413a[fromValue.ordinal()];
            if (i2 == 1 || i2 == 2) {
                aVar.mo61650c(str2);
            } else if (i2 == 3) {
                aVar.mo61651d(str2);
            }
        }
        return (MessageReadStateResponse) SdkSender.sendRequest(Command.GET_MESSAGE_READ_STATE, aVar, $$Lambda$e$7tIW9d7P7P8V9rKzQGCagoL8HM.INSTANCE);
    }

    @Override // com.ss.android.lark.chat.api.service.IMessageService
    /* renamed from: a */
    public MessageReadStateResponse mo121082a(String str, String str2) {
        GetMessageReadStateRequest.C17627a aVar = new GetMessageReadStateRequest.C17627a();
        aVar.mo61646a(str).mo61645a((Boolean) true).mo61649b(str2).mo61644a(GetMessageReadStateRequest.ListType.ALL);
        return (MessageReadStateResponse) SdkSender.sendRequest(Command.GET_MESSAGE_READ_STATE, aVar, $$Lambda$e$BAnS8vwhAkyPa_aZ1sEoAlpI3is.INSTANCE);
    }

    @Override // com.ss.android.lark.chat.service.IInnerMessageService
    /* renamed from: a */
    public void mo121256a(String str, int i, int i2, final IGetDataCallback<GetMessageIdsByPositionResponse> iGetDataCallback) {
        GetMessageIdsByPositionRequest.C17613a a = new GetMessageIdsByPositionRequest.C17613a().mo61611a(str).mo61610a(Integer.valueOf(i));
        if (i2 > 0) {
            a.mo61613b(Integer.valueOf(i2));
        }
        SdkSender.asynSendRequestNonWrap(Command.GET_MESSAGE_IDS_BY_POSITION, a, new IGetDataCallback<com.bytedance.lark.pb.im.v1.GetMessageIdsByPositionResponse>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32848e.AnonymousClass23 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(com.bytedance.lark.pb.im.v1.GetMessageIdsByPositionResponse getMessageIdsByPositionResponse) {
                Map<Integer, String> map = getMessageIdsByPositionResponse.message_ids;
                Map<String, Message.Type> map2 = getMessageIdsByPositionResponse.message_id_types;
                GetMessageIdsByPositionResponse eVar = new GetMessageIdsByPositionResponse(new ArrayList());
                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                    String value = entry.getValue();
                    eVar.mo136083a().add(new GetMessageIdsByPositionResponse.MessageTypeInfo(value, entry.getKey().intValue(), Message.Type.forNumber(map2.get(value).getValue())));
                }
                iGetDataCallback.onSuccess(eVar);
            }
        }, $$Lambda$e$DUgwdlgQSd8nSQFcNSNcl5DRfsg.INSTANCE);
    }

    @Override // com.ss.android.lark.chat.api.service.IMessageService
    /* renamed from: a */
    public void mo121088a(final com.ss.android.lark.chat.entity.message.Message message, final boolean z) {
        if (message != null) {
            C57865c.m224576a(new Runnable() {
                /* class com.ss.android.lark.chat.api.service.p1600b.C32848e.AnonymousClass29 */

                public void run() {
                    ArrayList arrayList = new ArrayList();
                    int position = message.getPosition();
                    int badgeCount = message.getBadgeCount();
                    if (message.getType() == Message.Type.AUDIO) {
                        if (message.getMeReadType() < 2) {
                            arrayList.add(message.getId());
                            message.setMeReadType(2);
                        }
                    } else if (message.getMeReadType() < 1) {
                        arrayList.add(message.getId());
                        message.setMeReadType(1);
                    }
                    if (CollectionUtils.isNotEmpty(arrayList)) {
                        Log.m165389i("MessageService", "readMessage maxPos: " + position + "  maxBadgeCount: " + badgeCount + " ids:" + arrayList);
                        C32848e.this.mo121253a(message.getChannel(), arrayList, position, badgeCount, z, (IGetDataCallback<C33960a>) null);
                    }
                }
            });
        }
    }

    @Override // com.ss.android.lark.chat.api.service.IMessageService
    /* renamed from: a */
    public void mo121101a(List<MessageInfo> list, int i, boolean z, IGetDataCallback<C33960a> iGetDataCallback) {
        m126397a(list, i, "", z, new AbstractC32864b() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32848e.AnonymousClass30 */

            @Override // com.ss.android.lark.chat.api.service.p1600b.C32848e.AbstractC32864b
            /* renamed from: a */
            public int mo121298a(com.ss.android.lark.chat.entity.message.Message message) {
                return message.getPosition();
            }

            @Override // com.ss.android.lark.chat.api.service.p1600b.C32848e.AbstractC32864b
            /* renamed from: b */
            public int mo121299b(com.ss.android.lark.chat.entity.message.Message message) {
                return message.getBadgeCount();
            }
        }, iGetDataCallback);
    }

    @Override // com.ss.android.lark.chat.api.service.IMessageService
    /* renamed from: a */
    public void mo121100a(List<MessageInfo> list, int i, String str, boolean z, IGetDataCallback<C33960a> iGetDataCallback) {
        m126397a(list, i, str, z, new AbstractC32864b() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32848e.AnonymousClass31 */

            @Override // com.ss.android.lark.chat.api.service.p1600b.C32848e.AbstractC32864b
            /* renamed from: a */
            public int mo121298a(com.ss.android.lark.chat.entity.message.Message message) {
                return message.getThreadPosition();
            }

            @Override // com.ss.android.lark.chat.api.service.p1600b.C32848e.AbstractC32864b
            /* renamed from: b */
            public int mo121299b(com.ss.android.lark.chat.entity.message.Message message) {
                return message.getThreadBadgeCount();
            }
        }, iGetDataCallback);
    }

    /* renamed from: a */
    private void m126397a(List<MessageInfo> list, int i, String str, boolean z, AbstractC32864b bVar, IGetDataCallback<C33960a> iGetDataCallback) {
        if (CollectionUtils.isEmpty(list)) {
            Log.m165389i("MessageService", "readMessage, intervalMessages is empty");
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (MessageInfo messageInfo : list) {
            com.ss.android.lark.chat.entity.message.Message message = messageInfo.getMessage();
            i2 = Math.max(bVar.mo121298a(message), i2);
            i3 = Math.max(bVar.mo121299b(message), i3);
            if (message.isPreMessage() || !m126400a(message) || message.isFromMe() || message.getMeReadType() > 0) {
                Log.m165389i("MessageService", "readMessage but message is invalid:" + message);
            } else {
                arrayList.add(message.getId());
                arrayList2.add(message);
            }
        }
        if (CollectionUtils.isNotEmpty(arrayList) || i2 > i) {
            Log.m165389i("MessageService", "readMessage maxPos: " + i2 + "  maxBadgeCount: " + i3 + " ids:" + arrayList);
            mo121252a(list.get(0).getMessage().getChannel(), arrayList, i2, i3, str, z, iGetDataCallback);
            MessageHitPoint.f135779d.mo187536a(new ArrayList(arrayList2), this.f84371a.mo134394a());
            return;
        }
        Log.m165389i("MessageService", "needRedMessageIds is empty, maxPosition:" + i2 + ", lastReadPosition:" + i);
    }

    @Override // com.ss.android.lark.chat.service.IInnerMessageService
    /* renamed from: a */
    public void mo121251a(Channel channel, int i, int i2, boolean z) {
        mo121253a(channel, Collections.EMPTY_LIST, i, i2, z, (IGetDataCallback<C33960a>) null);
    }

    /* renamed from: a */
    private boolean m126400a(com.ss.android.lark.chat.entity.message.Message message) {
        return message.getType() != Message.Type.AUDIO;
    }

    @Override // com.ss.android.lark.chat.api.service.IMessageService
    /* renamed from: a */
    public void mo121097a(final String str, final boolean z, final boolean z2, final IGetDataCallback<String> iGetDataCallback) {
        C57865c.m224576a(new Runnable() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32848e.AnonymousClass32 */

            public void run() {
                if (z) {
                    C32848e.this.mo121111d(str);
                    iGetDataCallback.onSuccess(str);
                } else if (z2) {
                    C32848e.this.mo121273f(str);
                    iGetDataCallback.onSuccess(str);
                } else {
                    C32848e.this.mo121271d(Collections.singletonList(str), new IGetDataCallback<Map<String, com.ss.android.lark.chat.entity.message.Message>>() {
                        /* class com.ss.android.lark.chat.api.service.p1600b.C32848e.AnonymousClass32.C328551 */

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            iGetDataCallback.onError(errorResult);
                        }

                        /* renamed from: a */
                        public void onSuccess(Map<String, com.ss.android.lark.chat.entity.message.Message> map) {
                            if (map.get(str) != null) {
                                iGetDataCallback.onSuccess(str);
                            }
                        }
                    });
                }
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.IMessageService
    /* renamed from: a */
    public void mo121098a(List<ThreadInfo> list, int i, int i2, boolean z) {
        if (CollectionUtils.isEmpty(list)) {
            Log.m165389i("TAG", "readThread, intervalThreads is empty");
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MIN_VALUE;
        for (ThreadInfo threadInfo : list) {
            ThreadTopic b = threadInfo.mo126018b();
            com.ss.android.lark.chat.entity.message.Message c = threadInfo.mo126021c();
            if (!c.isPreMessage()) {
                i3 = Math.max(b.getPosition(), i3);
                i4 = Math.max(b.getBadgeCount(), i4);
                i5 = Math.max(b.getOriginBadgeCount(), i5);
                if (m126400a(c) && !c.isFromMe() && c.getMeReadType() <= 0) {
                    arrayList.add(c.getId());
                }
            }
        }
        Log.m165389i("MessageService", "readThread, maxPosition:" + i3 + ", lastReadPosition:" + i + ", maxBadgeCount:" + i4 + ", lastReadBadgeCount:" + i2);
        if (CollectionUtils.isNotEmpty(arrayList) || i3 > i || i4 > i2 || z) {
            m126396a(arrayList, i3, i5, list.get(0).mo126021c().getChannel());
            return;
        }
        Log.m165389i("MessageService", "needReadThreadIds is empty, maxPosition:" + i3 + ", lastReadPosition:" + i + ", maxBadgeCount:" + i4 + ", lastReadBadgeCount:" + i2);
    }

    @Override // com.ss.android.lark.chat.api.service.IMessageService
    /* renamed from: a */
    public void mo121103a(List<String> list, String str, List<Transmit2ThreadTarget> list2, String str2, IGetDataCallback<TransmitResponse> iGetDataCallback) {
        TransmitRequest.C18115a a = new TransmitRequest.C18115a().mo62836a(str).mo62837a(list).mo62840b(list2).mo62835a(TransmitRequest.Type.MESSAGE);
        if (!TextUtils.isEmpty(str2)) {
            a.mo62839b(str2);
        }
        Log.m165379d("MessageService", "transmit message, originMergeForwardId:" + str2);
        SdkSender.asynSendRequestNonWrap(Command.TRANSMIT, a, iGetDataCallback, new SdkSender.IParser<TransmitResponse>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32848e.AnonymousClass34 */

            /* renamed from: a */
            public TransmitResponse parse(byte[] bArr) throws IOException {
                return TransmitResponse.ADAPTER.decode(bArr);
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.IMessageService
    /* renamed from: a */
    public void mo121085a(ShareObject shareObject, List<ShareTarget> list, IGetDataCallback<ShareAsMessageResponse> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.SHARE_AS_MESSAGE, new ShareAsMessageRequest.C18061a().mo62704a(Collections.singletonList(shareObject)).mo62706b(list), iGetDataCallback, new SdkSender.IParser<ShareAsMessageResponse>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32848e.C328522 */

            /* renamed from: a */
            public ShareAsMessageResponse parse(byte[] bArr) throws IOException {
                return ShareAsMessageResponse.ADAPTER.decode(bArr);
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.IMessageService
    /* renamed from: a */
    public void mo121105a(List<String> list, List<String> list2, String str, boolean z, boolean z2, String str2, boolean z3, String str3, List<Transmit2ThreadTarget> list3, IGetDataCallback<MergeForwardMessagesResponse> iGetDataCallback) {
        MultiSelectHitPoint.f135851a.mo187658b();
        MergeForwardMessagesRequest.C17811a c = new MergeForwardMessagesRequest.C17811a().mo62093a(list).mo62097b(list2).mo62092a(str).mo62090a(z ? MergeFowardMessageType.MERGE_THREAD : MergeFowardMessageType.MERGE_MESSAGE).mo62096b(str2).mo62091a(Boolean.valueOf(z2)).mo62095b(Boolean.valueOf(z3)).mo62099c(list3);
        if (!TextUtils.isEmpty(str3)) {
            c.mo62098c(str3);
        }
        Log.m165379d("MessageService", "MERGE_THREAD, originMergeForwardId:" + str3);
        SdkSender.asynSendRequestNonWrap(Command.MERGE_FORWARD_MESSAGES, c, iGetDataCallback, new SdkSender.IParser<MergeForwardMessagesResponse>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32848e.C328543 */

            /* renamed from: a */
            public MergeForwardMessagesResponse parse(byte[] bArr) throws IOException {
                return MergeForwardMessagesResponse.ADAPTER.decode(bArr);
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.IMessageService
    /* renamed from: a */
    public void mo121104a(List<String> list, List<TransmitTarget> list2, String str, IGetDataCallback<BatchTransmitResponse> iGetDataCallback) {
        MultiSelectHitPoint.f135851a.mo187660c();
        BatchTransmitRequest.C17296a b = new BatchTransmitRequest.C17296a().mo60770a(list).mo60772b(list2);
        if (!TextUtils.isEmpty(str)) {
            b.mo60769a(str);
        }
        Log.m165379d("MessageService", "BATCH_TRANSMIT, originMergeForwardId:" + str);
        SdkSender.asynSendRequestNonWrap(Command.BATCH_TRANSMIT, b, iGetDataCallback, new SdkSender.IParser<BatchTransmitResponse>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32848e.C328564 */

            /* renamed from: a */
            public BatchTransmitResponse parse(byte[] bArr) throws IOException {
                return BatchTransmitResponse.ADAPTER.decode(bArr);
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.IMessageService
    /* renamed from: a */
    public com.ss.android.lark.chat.entity.message.Message mo121080a(String str) {
        return mo121108c(Collections.singletonList(str)).get(str);
    }

    @Override // com.ss.android.lark.chat.api.service.IMessageService
    /* renamed from: a */
    public ChatMessageResponse mo121079a(String str, MessageFetchScene messageFetchScene, int i, int i2, int i3, int i4, boolean z, ChannelDataFetcherStrategy channelDataFetcherStrategy, String str2) {
        C34298m.m132985a().mo126842b();
        if (TextUtils.isEmpty(str)) {
            return new ChatMessageResponse();
        }
        $$Lambda$e$5izP8xdlKdefybgeWMHtPKaQ_vk r2 = new SdkSender.IParser(System.currentTimeMillis(), str) {
            /* class com.ss.android.lark.chat.api.service.p1600b.$$Lambda$e$5izP8xdlKdefybgeWMHtPKaQ_vk */
            public final /* synthetic */ long f$0;
            public final /* synthetic */ String f$1;

            {
                this.f$0 = r1;
                this.f$1 = r3;
            }

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return C32848e.m126389a(this.f$0, this.f$1, bArr);
            }
        };
        GetChatMessagesRequest.C17528a aVar = new GetChatMessagesRequest.C17528a();
        aVar.mo61390a(str).mo61387a(ChannelDataScene.fromValue(messageFetchScene.getNumber())).mo61393c(Integer.valueOf(i2)).mo61389a(Integer.valueOf(i3)).mo61392b(Integer.valueOf(i)).mo61394d(Integer.valueOf(i4)).mo61388a(Boolean.valueOf(z)).mo61386a(ChannelDataIncompleteStrategy.fromValue(channelDataFetcherStrategy.getNumber()));
        if (m126399a(messageFetchScene)) {
            aVar.mo61395e(Integer.valueOf(C34298m.m132985a().mo126844d()));
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = C53234a.m205877a();
        }
        return (ChatMessageResponse) SdkSender.syncSend(Command.GET_CHAT_MESSAGES, aVar, str2, r2, C29990c.m110930b().mo134577e().mo120973e(channelDataFetcherStrategy == ChannelDataFetcherStrategy.SYNC_SERVER_DATA ? "load_net_data" : "load_local_data"));
    }

    @Override // com.ss.android.lark.chat.service.IInnerMessageService
    /* renamed from: a */
    public ChatMessageResponse mo121247a(String str, final List<Integer> list) {
        GetMessagesByPositionsRequest.C17637a aVar = new GetMessagesByPositionsRequest.C17637a();
        aVar.mo61671a(new com.bytedance.lark.pb.basic.v1.Channel(str, Channel.Type.CHAT)).mo61672a(list);
        return (ChatMessageResponse) SdkSender.sendRequest(Command.GET_MESSAGES_BY_POSITIONS, aVar, new SdkSender.IParser<ChatMessageResponse>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32848e.C328608 */

            /* renamed from: a */
            public ChatMessageResponse parse(byte[] bArr) throws IOException {
                GetMessagesByPositionsResponse decode = GetMessagesByPositionsResponse.ADAPTER.decode(bArr);
                ChatMessageResponse chatMessageResponse = new ChatMessageResponse(new ArrayList(), new ArrayList());
                if (CollectionUtils.isNotEmpty(decode.invalid_positions)) {
                    chatMessageResponse.invisiblePositions.addAll(decode.invalid_positions);
                }
                C14928Entity entity = decode.entity;
                if (entity == null) {
                    return chatMessageResponse;
                }
                Map<String, com.bytedance.lark.pb.basic.v1.Message> map = entity.messages;
                if (CollectionUtils.isEmpty(map)) {
                    return chatMessageResponse;
                }
                Map<String, com.ss.android.lark.chat.entity.message.Message> b = C57322k.m222132b(entity);
                C33982a a = C57306b.m222058a(entity, true, "MessageService::syncPullMessagesByPositions");
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, com.ss.android.lark.chat.entity.message.Message> entry : b.entrySet()) {
                    String key = entry.getKey();
                    com.ss.android.lark.chat.entity.message.Message value = entry.getValue();
                    if (list.contains(Integer.valueOf(value.getPosition()))) {
                        arrayList.add(C57304a.m222044a(value, map.get(key), entity, a));
                    }
                }
                Collections.sort(arrayList, new Comparator<MessageInfo>() {
                    /* class com.ss.android.lark.chat.api.service.p1600b.C32848e.C328608.C328611 */

                    /* renamed from: a */
                    public int compare(MessageInfo messageInfo, MessageInfo messageInfo2) {
                        return messageInfo.getMessage().getPosition() - messageInfo2.getMessage().getPosition();
                    }
                });
                chatMessageResponse.messageInfoList.addAll(arrayList);
                return chatMessageResponse;
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.IMessageService
    /* renamed from: a */
    public void mo121091a(String str, IGetDataCallback<List<MessageInfo>> iGetDataCallback) {
        mo121093a(str, (String) null, false, iGetDataCallback);
    }

    @Override // com.ss.android.lark.chat.api.service.IMessageService
    /* renamed from: a */
    public void mo121093a(String str, String str2, boolean z, IGetDataCallback<List<MessageInfo>> iGetDataCallback) {
        GetUnreadAtMessagesRequest.C17743a aVar = new GetUnreadAtMessagesRequest.C17743a();
        GetUnreadAtMessagesRequest.Query.C17741a aVar2 = new GetUnreadAtMessagesRequest.Query.C17741a();
        aVar2.mo61925a(Long.valueOf(Long.parseLong(str)));
        if (!TextUtils.isEmpty(str2)) {
            aVar2.mo61927b(Long.valueOf(Long.parseLong(str2)));
        }
        if (z) {
            aVar2.mo61924a(GetUnreadAtMessagesRequest.Query.AtType.All);
        }
        aVar.mo61933b(Collections.singletonList(aVar2.build()));
        SdkSender.asynSendRequestNonWrap(Command.GET_UNREAD_AT_MESSAGES, aVar, iGetDataCallback, new SdkSender.IParser(str, z) {
            /* class com.ss.android.lark.chat.api.service.p1600b.$$Lambda$e$GQmvz53P1oRBT4HnaJNpRdQ8eW4 */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ boolean f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return C32848e.this.m126392a(this.f$1, this.f$2, bArr);
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.IMessageService
    /* renamed from: a */
    public void mo121087a(com.ss.android.lark.chat.entity.message.Message message, IGetDataCallback<String> iGetDataCallback) {
        C34273t.m132944b(message, iGetDataCallback);
    }

    @Override // com.ss.android.lark.chat.api.service.IMessageService
    /* renamed from: a */
    public void mo121086a(Message.C34004a aVar, IGetDataCallback<String> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.RESEND_MESSAGE, new ResendMessageRequest.C18005a().mo62546a(aVar.f87839a).mo62545a(aVar.f87840b), new C57760a(iGetDataCallback), new SdkSender.IParser<String>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32848e.C328629 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                return "";
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.IMessageService
    /* renamed from: a */
    public void mo121095a(String str, boolean z) {
        SdkSender.asynSendRequestNonWrap(Command.GET_SYSTEM_MESSAGE_TEMPLATE, new GetSystemMessageTemplateRequest.C17693a().mo61803a(str).mo61802a(Boolean.valueOf(z)), null, new SdkSender.IParser<String>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32848e.AnonymousClass10 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                return "";
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.IMessageService
    /* renamed from: a */
    public void mo121099a(List<String> list, int i, String str, ShareAppCardLink abVar, String str2, String str3, String str4, final IGetDataCallback<String> iGetDataCallback) {
        ShareAppCardRequest.C18055a aVar = new ShareAppCardRequest.C18055a();
        ShareAppCardRequest.AppShareType fromValue = ShareAppCardRequest.AppShareType.fromValue(i);
        aVar.mo62686a(Message.Type.CARD).mo62685a(new com.bytedance.lark.pb.basic.v1.Channel(list.get(0), Channel.Type.CHAT)).mo62689a(fromValue);
        CardLink cardLink = new CardLink(abVar.mo106649a(), abVar.mo106651c(), abVar.mo106650b(), abVar.mo106652d());
        int i2 = AnonymousClass28.f84414b[fromValue.ordinal()];
        if (i2 == 1) {
            aVar.mo62688a(new ShareApp(str, cardLink));
            aVar.f45175g = ShareAppCardRequest.AppShareType.APP;
        } else if (i2 == 2) {
            aVar.mo62691a(new ShareH5(cardLink, str2, str3, str4, null));
            aVar.f45175g = ShareAppCardRequest.AppShareType.H5;
        } else if (i2 == 3) {
            aVar.mo62690a(new ShareAppPage(str, cardLink, str2, str3, null));
            aVar.f45175g = ShareAppCardRequest.AppShareType.APP_PAGE;
        } else {
            return;
        }
        aVar.mo62687a(new QuasiContent.C15137a().build());
        SdkSender.asynSendRequestNonWrap(Command.APP_SHARE, aVar, new IGetDataCallback<List<com.ss.android.lark.chat.entity.message.Message>>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32848e.AnonymousClass11 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
                Log.m165382e(errorResult.toString());
            }

            /* renamed from: a */
            public void onSuccess(List<com.ss.android.lark.chat.entity.message.Message> list) {
                if (!CollectionUtils.isEmpty(list)) {
                    for (com.ss.android.lark.chat.entity.message.Message message : list) {
                        C32848e.this.mo121265b(message, new IGetDataCallback<String>() {
                            /* class com.ss.android.lark.chat.api.service.p1600b.C32848e.AnonymousClass11.C328501 */

                            /* renamed from: a */
                            public void onSuccess(String str) {
                                iGetDataCallback.onSuccess(str);
                            }

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                iGetDataCallback.onError(errorResult);
                            }
                        });
                    }
                }
            }
        }, new SdkSender.IParser<List<com.ss.android.lark.chat.entity.message.Message>>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32848e.AnonymousClass13 */

            /* renamed from: a */
            public List<com.ss.android.lark.chat.entity.message.Message> parse(byte[] bArr) throws IOException {
                ArrayList arrayList = new ArrayList();
                ShareAppCardResponse decode = ShareAppCardResponse.ADAPTER.decode(bArr);
                arrayList.add(C57322k.m222119a(decode.entity, decode.entity.quasi_messages.get(decode.cid)));
                return arrayList;
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.IMessageService
    /* renamed from: a */
    public void mo121096a(String str, boolean z, IGetDataCallback<String> iGetDataCallback) {
        Log.m165389i("MessageService", "recallMessage:" + z);
        if (z) {
            m126403b(str, iGetDataCallback);
        } else {
            m126405c(str, iGetDataCallback);
        }
    }

    @Override // com.ss.android.lark.chat.service.IInnerMessageService
    /* renamed from: a */
    public String mo121249a(String str, String str2, String str3, String str4) {
        return (String) SdkSender.syncSend(Command.GET_UPLOAD_ID, new GetUploadIdRequest.C18266a().mo63276a(str).mo63278b(str2).mo63279c(str3).mo63280d(str4).mo63276a(str), $$Lambda$e$0Sx5ku0iliSbHm8MiY6DIvFUxlo.INSTANCE);
    }

    @Override // com.ss.android.lark.chat.service.IInnerMessageService
    /* renamed from: a */
    public void mo121258a(String str, int i, byte[] bArr, boolean z, boolean z2, String str2, IGetDataCallback<UploadAudioDataResponse> iGetDataCallback) {
        UploadAudioDataRequest.C18292a b = new UploadAudioDataRequest.C18292a().mo63347a(str).mo63346a(Integer.valueOf(i)).mo63348a(ByteString.of(bArr)).mo63345a(Boolean.valueOf(z)).mo63350b(Boolean.valueOf(z2));
        Command command = Command.SEND_AUDIO_DATA;
        ProtoAdapter<UploadAudioDataResponse> protoAdapter = UploadAudioDataResponse.ADAPTER;
        protoAdapter.getClass();
        SdkSender.asynSendRequestNonWrap(command, b, iGetDataCallback, new SdkSender.IParser() {
            /* class com.ss.android.lark.chat.api.service.p1600b.$$Lambda$CfXZBk0OdigxZ1LY3EkOzOLz5OI */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (UploadAudioDataResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }

    @Override // com.ss.android.lark.chat.service.IInnerMessageService
    /* renamed from: a */
    public void mo121257a(String str, int i, String str2, String str3, byte[] bArr, int i2, int i3, String str4, boolean z, String str5, IGetDataCallback<SendSpeechRecognitionResponse> iGetDataCallback) {
        SendSpeechRecognitionRequest.C18033a e = new SendSpeechRecognitionRequest.C18033a().mo62629a(str).mo62628a(Integer.valueOf(i)).mo62633b(str2).mo62635d(str3).mo62630a(ByteString.of(bArr)).mo62626a(SendSpeechRecognitionRequest.Action.fromValue(i2)).mo62632b(Integer.valueOf(i3)).mo62634c(str4).mo62627a(Boolean.valueOf(z)).mo62636e(str5);
        Command command = Command.SEND_SPEECH_RECOGNITION;
        ProtoAdapter<SendSpeechRecognitionResponse> protoAdapter = SendSpeechRecognitionResponse.ADAPTER;
        protoAdapter.getClass();
        SdkSender.asynSendRequestNonWrap(command, e, iGetDataCallback, new SdkSender.IParser() {
            /* class com.ss.android.lark.chat.api.service.p1600b.$$Lambda$O9VXsb5XhCoidYiyXaVjO9FCGo */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (SendSpeechRecognitionResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }

    @Override // com.ss.android.lark.chat.service.IInnerMessageService
    /* renamed from: a */
    public void mo121260a(String str, String str2, int i, String str3, IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_AUDIO_MESSAGE_RECOGNITION, new GetAudioMessageRecognitionRequest.C17474a().mo61238a(str).mo61241c(str2).mo61237a(Integer.valueOf(i)).mo61240b(str3), iGetDataCallback, $$Lambda$e$gOrw43koHl0M41rPUodkoTfsAc.INSTANCE);
    }

    @Override // com.ss.android.lark.chat.service.IInnerMessageService
    /* renamed from: b */
    public void mo121268b(String str, boolean z, IGetDataCallback<ToggleTextOnAudioResponse> iGetDataCallback) {
        ToggleTextOnAudioRequest.C18093a a = new ToggleTextOnAudioRequest.C18093a().mo62778a(str).mo62777a(Boolean.valueOf(!z));
        Command command = Command.TOGGLE_TEXT_ON_AUDIO_MESSAGE;
        ProtoAdapter<ToggleTextOnAudioResponse> protoAdapter = ToggleTextOnAudioResponse.ADAPTER;
        protoAdapter.getClass();
        SdkSender.asynSendRequestNonWrap(command, a, iGetDataCallback, new SdkSender.IParser() {
            /* class com.ss.android.lark.chat.api.service.p1600b.$$Lambda$JrKPMPHxiXstluCvd__Z5IiX2g0 */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (ToggleTextOnAudioResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }

    /* renamed from: a */
    public MessageInfo mo121248a(String str, AbstractC34011b bVar) {
        AbstractC33998f a = C34238q.m132858a(bVar);
        C34023d a2 = m126391a(str, a);
        if (a2 != null && a2.f87928a != null) {
            return a2.f87928a;
        }
        Log.m165382e("savePreMessageAndRelation failed: cid is " + a.f87821n);
        return null;
    }

    @Override // com.ss.android.lark.chat.service.IInnerMessageService
    /* renamed from: a */
    public void mo121259a(String str, SendStatus sendStatus) {
        QuasiMessage.Status status;
        UpdateQuasiMessageRequest.C18158a aVar = new UpdateQuasiMessageRequest.C18158a();
        if (sendStatus == SendStatus.SENDING) {
            status = QuasiMessage.Status.PENDING;
        } else if (sendStatus == SendStatus.FAIL) {
            status = QuasiMessage.Status.FAILED;
        } else {
            Log.m165382e("cannot set quasiMessage with other status, status: " + sendStatus);
            return;
        }
        aVar.mo62987a(str);
        aVar.mo62986a(status);
        SdkSender.syncSend(Command.UPDATE_QUASI_MESSAGE, aVar, new SdkSender.IParser<Object>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32848e.AnonymousClass18 */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public Object parse(byte[] bArr) throws IOException {
                return null;
            }
        });
    }

    @Override // com.ss.android.lark.chat.service.IInnerMessageService
    /* renamed from: a */
    public <T extends AbstractC34011b, C extends MonitorMessageSendCallback> void mo121254a(T t, C c) {
        if (c == null) {
            c = (C) new MonitorMessageSendCallback();
        }
        this.f84372b.execute(new Runnable(c, t) {
            /* class com.ss.android.lark.chat.api.service.p1600b.$$Lambda$e$YQSZQRgoA7Wpqc6kqRaJq0Wzrqc */
            public final /* synthetic */ AbstractC34125f f$1;
            public final /* synthetic */ AbstractC34011b f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C32848e.this.m126402b((C32848e) this.f$1, (AbstractC34125f) this.f$2);
            }
        });
    }

    @Override // com.ss.android.lark.chat.service.IInnerMessageService
    /* renamed from: b */
    public <T extends AbstractC34011b, C extends MonitorMessageSendCallback> void mo121267b(final T t, final C c) {
        if (c == null) {
            c = (C) new MonitorMessageSendCallback();
        }
        if (TextUtils.isEmpty(t.f87868v)) {
            c.mo126558a(t.f87861o);
        }
        if (!(t instanceof C29613e) || m126398a((C29613e) t)) {
            this.f84372b.execute(new Runnable() {
                /* class com.ss.android.lark.chat.api.service.p1600b.C32848e.AnonymousClass19 */

                public void run() {
                    c.mo126565g();
                    C32848e.this.mo121266b(t, new IGetDataCallback<Boolean>() {
                        /* class com.ss.android.lark.chat.api.service.p1600b.C32848e.AnonymousClass19.C328511 */

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            Log.m165383e("MessageService", "[cipher] file decrypt failed, do nothing");
                        }

                        /* renamed from: a */
                        public void onSuccess(Boolean bool) {
                            C32848e.this.mo121255a(c, t);
                        }
                    });
                }
            });
        }
    }

    /* renamed from: a */
    public <T extends AbstractC34011b> void mo121255a(AbstractC34125f fVar, T t) {
        if (m126406c(t)) {
            fVar.mo126563e();
            MessageInfo b = mo121262b(t);
            if (b != null) {
                C34253r.m132890a().mo126803a(b);
            }
            fVar.mo126564f();
        }
        fVar.mo126561c();
        MessageInfo a = mo121248a(fVar.mo126560b(), t);
        if (a != null) {
            fVar.mo126562d();
            fVar.mo123034a(a);
            C34253r.m132890a().mo126803a(a);
            fVar.mo126566h();
            fVar.mo126567i();
            mo121265b(a.getMessage(), new C32865c(a, fVar));
        }
    }

    /* renamed from: b */
    public <T extends AbstractC34011b> void mo121266b(T t, IGetDataCallback<Boolean> iGetDataCallback) {
        if (t instanceof C29613e) {
            C29613e eVar = (C29613e) t;
            String str = null;
            if (!TextUtils.isEmpty(eVar.f74224a)) {
                str = eVar.f74224a;
            } else if (eVar.f74233j == null) {
                iGetDataCallback.onError(new ErrorResult("null avaiable path found"));
                return;
            } else if (!LarkUriUtil.m95312h(LarkContext.getApplication(), eVar.f74233j)) {
                iGetDataCallback.onSuccess(true);
                return;
            } else {
                String c = C26311p.m95282c(LarkContext.getApplication(), eVar.f74233j);
                if (!TextUtils.isEmpty(c)) {
                    try {
                        if (!new File(c).canRead()) {
                            Log.m165383e("MessageService", "unreadable file, uri: " + eVar.f74233j);
                        } else {
                            str = c;
                        }
                    } catch (SecurityException unused) {
                        Log.m165383e("MessageService", "unable to check file can read");
                    }
                }
            }
            if (str == null) {
                m126395a(eVar, C57788ai.m224261b(LarkContext.getApplication(), eVar.f74233j), iGetDataCallback);
            } else {
                m126395a(eVar, str, iGetDataCallback);
            }
        } else if (t instanceof C29631w) {
            try {
                File file = ((C29631w) t).f74277d;
                File b = C36808a.m145210b(file);
                Log.m165389i("MessageService", "[cipher] file decrypt success, original path = " + file.getAbsolutePath() + ", new path = " + b.getAbsolutePath());
                ((C29631w) t).f74278e = b;
                iGetDataCallback.onSuccess(true);
            } catch (DecryptException e) {
                Log.m165383e("MessageService", "[cipher] file decrypt failed, original path = " + ((C29631w) t).f74277d.getAbsolutePath());
                iGetDataCallback.onError(new ErrorResult(e));
            }
        } else {
            iGetDataCallback.onSuccess(true);
        }
    }

    @Override // com.ss.android.lark.chat.api.service.IMessageService
    /* renamed from: a */
    public <T extends AbstractC34011b> void mo121090a(T t, final IGetDataCallback<String> iGetDataCallback) {
        mo121267b(t, new MonitorMessageSendCallback(t.f87868v) {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32848e.AnonymousClass20 */

            @Override // com.ss.android.lark.chat.service.impl.MonitorMessageSendCallback, com.ss.android.lark.chat.service.AbstractC34125f
            /* renamed from: a */
            public void mo121288a(C34118b bVar) {
                super.mo121288a(bVar);
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(bVar.f88301b);
                }
            }

            @Override // com.ss.android.lark.chat.service.impl.MonitorMessageSendCallback, com.ss.android.lark.chat.service.AbstractC34125f
            /* renamed from: a */
            public void mo121287a(ErrorResult errorResult, com.ss.android.lark.chat.entity.message.Message message) {
                super.mo121287a(errorResult, message);
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.IMessageService
    /* renamed from: a */
    public <T extends AbstractC34011b> void mo121089a(T t) {
        mo121090a(t, (IGetDataCallback<String>) null);
    }

    @Override // com.ss.android.lark.chat.api.service.IMessageService
    /* renamed from: a */
    public void mo121094a(final String str, final List<String> list, final boolean z, final IGetDataCallback<String> iGetDataCallback) {
        if (!CollectionUtils.isEmpty(list)) {
            CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
                /* class com.ss.android.lark.chat.api.service.p1600b.C32848e.AnonymousClass21 */

                public void run() {
                    C32915a.m126762a(str, list).mo121541a(C32821b.m126120a().mo121052d(str)).mo121547a(z).mo121545a(new MonitorMessageSendCallback() {
                        /* class com.ss.android.lark.chat.api.service.p1600b.C32848e.AnonymousClass21.C328531 */

                        @Override // com.ss.android.lark.chat.service.impl.MonitorMessageSendCallback, com.ss.android.lark.chat.service.AbstractC34125f
                        /* renamed from: a */
                        public void mo121288a(C34118b bVar) {
                            super.mo121288a(bVar);
                            if (iGetDataCallback != null) {
                                iGetDataCallback.onSuccess(bVar.f88301b);
                            }
                        }

                        @Override // com.ss.android.lark.chat.service.impl.MonitorMessageSendCallback, com.ss.android.lark.chat.service.AbstractC34125f
                        /* renamed from: a */
                        public void mo121287a(ErrorResult errorResult, com.ss.android.lark.chat.entity.message.Message message) {
                            super.mo121287a(errorResult, message);
                            if (iGetDataCallback != null) {
                                iGetDataCallback.onError(errorResult);
                            }
                        }
                    }).mo121548a();
                }
            });
        } else if (iGetDataCallback != null) {
            iGetDataCallback.onError(new ErrorResult("image list is empty"));
        }
    }

    @Override // com.ss.android.lark.chat.api.service.IMessageService
    /* renamed from: a */
    public void mo121092a(String str, String str2, List<String> list, IGetDataCallback<Void> iGetDataCallback) {
        SendShareThreadRequest.C18031a aVar = new SendShareThreadRequest.C18031a();
        aVar.mo62622b(str).mo62619a(str2).mo62620a(list);
        SdkSender.asynSendRequestNonWrap(Command.SEND_SHARE_THREAD, aVar, iGetDataCallback, $$Lambda$e$XiGmGOCVINoEcWpivEdrpWo1dtQ.INSTANCE);
    }

    /* renamed from: a */
    public void mo121253a(com.ss.android.lark.chat.entity.Channel channel, List<String> list, int i, int i2, boolean z, IGetDataCallback<C33960a> iGetDataCallback) {
        mo121252a(channel, list, i, i2, "", z, iGetDataCallback);
    }

    /* renamed from: a */
    public void mo121252a(com.ss.android.lark.chat.entity.Channel channel, List<String> list, int i, int i2, String str, boolean z, IGetDataCallback<C33960a> iGetDataCallback) {
        if (z) {
            list = new ArrayList<>();
        }
        UpdateMessagesMeReadRequest.C18154a a = new UpdateMessagesMeReadRequest.C18154a().mo62970a(C57309d.m222072a(channel)).mo62973a(list);
        if (!TextUtils.isEmpty(str)) {
            a.mo62972a(str).mo62975b(Integer.valueOf(i)).mo62977d(Integer.valueOf(i2)).mo62971a((Integer) 0).mo62976c(0);
        } else {
            a.mo62971a(Integer.valueOf(i)).mo62976c(Integer.valueOf(i2));
        }
        SdkSender.asynSendRequestNonWrap(Command.UPDATE_MESSAGES_ME_READ, a, iGetDataCallback, new SdkSender.IParser() {
            /* class com.ss.android.lark.chat.api.service.p1600b.$$Lambda$e$r9e_NlLpgoGsVk0MaQD5ikDdvoU */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return C32848e.m126390a(com.ss.android.lark.chat.entity.Channel.this, bArr);
            }
        });
    }

    /* renamed from: a */
    public Map<String, com.ss.android.lark.chat.entity.message.Message> mo121250a(byte[] bArr) throws IOException {
        MGetMessagesResponse decode = MGetMessagesResponse.ADAPTER.decode(bArr);
        HashMap hashMap = new HashMap();
        if (!(decode == null || decode.entity == null || decode.entity.messages == null)) {
            hashMap.putAll(C57322k.m222132b(decode.entity));
        }
        return hashMap;
    }

    @Override // com.ss.android.lark.chat.service.IInnerMessageService
    /* renamed from: a */
    public boolean mo121261a(long j, long j2, String str) {
        FormatConfig configByType = ((ImageSendConfig) SettingManager.getInstance().get(ImageSendConfig.class)).getConfigByType(str);
        return j > configByType.getLimitSize() || j2 > configByType.getLimitResolutionSize();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chat.api.service.b.e$c */
    public static class C32865c implements IGetDataCallback<String>, AbstractC34231l, IMediaSendCallback, AbstractC34295j {

        /* renamed from: a */
        public final AbstractC34125f f84442a;

        /* renamed from: b */
        private final MessageInfo f84443b;

        /* renamed from: c */
        private long f84444c;

        /* renamed from: d */
        private Trace f84445d;

        @Override // com.ss.android.lark.chat.service.impl.IMediaSendCallback
        /* renamed from: a */
        public void mo121312a() {
            this.f84442a.mo126568j();
        }

        /* renamed from: a */
        public void mo121313a(long j) {
            this.f84444c = j;
        }

        /* renamed from: a */
        public void mo121314a(Trace trace) {
            this.f84445d = trace;
        }

        @Override // com.ss.android.lark.chat.service.impl.AbstractC34231l
        /* renamed from: b */
        public void mo121318b(com.ss.android.lark.chat.entity.message.Message message) {
            AbstractC34125f fVar = this.f84442a;
            if (fVar instanceof AbstractC34231l) {
                ((AbstractC34231l) fVar).mo121318b(message);
            }
        }

        @Override // com.ss.android.lark.chat.service.AbstractC34295j
        /* renamed from: a */
        public void mo121315a(com.ss.android.lark.chat.entity.message.Message message) {
            AbstractC34125f fVar = this.f84442a;
            if (fVar instanceof AbstractC34295j) {
                ((AbstractC34295j) fVar).mo121315a(message);
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            this.f84443b.getMessage().setSendStatus(SendStatus.FAIL);
            Log.m165382e(errorResult.toString());
            this.f84442a.mo121287a(errorResult, this.f84443b.getMessage());
        }

        @Override // com.ss.android.lark.chat.service.impl.IMediaSendCallback
        /* renamed from: a */
        public void mo121316a(VideoCompressResult videoCompressResult) {
            this.f84442a.mo126559a(videoCompressResult);
        }

        /* renamed from: a */
        public void onSuccess(String str) {
            this.f84442a.mo121288a(new C34118b(this.f84443b.getMessage(), str, this.f84444c, this.f84445d));
        }

        public C32865c(MessageInfo messageInfo, AbstractC34125f fVar) {
            this.f84443b = messageInfo;
            this.f84442a = fVar;
        }
    }

    private C32848e() {
        this.f84373c = C29990c.m110930b().mo134586n().mo134685a("lark.chat.message.send.collect.trace");
        this.f84372b = CoreThreadPool.getDefault().newSerialIODensityThreadPool("msg-send");
        this.f84371a = C29990c.m110930b().mo134515N();
    }

    /* renamed from: com.ss.android.lark.chat.api.service.b.e$28  reason: invalid class name */
    static /* synthetic */ class AnonymousClass28 {

        /* renamed from: a */
        static final /* synthetic */ int[] f84413a;

        /* renamed from: b */
        static final /* synthetic */ int[] f84414b;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        static {
            /*
                com.bytedance.lark.pb.im.v1.ShareAppCardRequest$AppShareType[] r0 = com.bytedance.lark.pb.im.v1.ShareAppCardRequest.AppShareType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.chat.api.service.p1600b.C32848e.AnonymousClass28.f84414b = r0
                r1 = 1
                com.bytedance.lark.pb.im.v1.ShareAppCardRequest$AppShareType r2 = com.bytedance.lark.pb.im.v1.ShareAppCardRequest.AppShareType.APP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = com.ss.android.lark.chat.api.service.p1600b.C32848e.AnonymousClass28.f84414b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.lark.pb.im.v1.ShareAppCardRequest$AppShareType r3 = com.bytedance.lark.pb.im.v1.ShareAppCardRequest.AppShareType.H5     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = com.ss.android.lark.chat.api.service.p1600b.C32848e.AnonymousClass28.f84414b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.lark.pb.im.v1.ShareAppCardRequest$AppShareType r4 = com.bytedance.lark.pb.im.v1.ShareAppCardRequest.AppShareType.APP_PAGE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r3 = com.ss.android.lark.chat.api.service.p1600b.C32848e.AnonymousClass28.f84414b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bytedance.lark.pb.im.v1.ShareAppCardRequest$AppShareType r4 = com.bytedance.lark.pb.im.v1.ShareAppCardRequest.AppShareType.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.bytedance.lark.pb.im.v1.GetMessageReadStateRequest$ListType[] r3 = com.bytedance.lark.pb.im.v1.GetMessageReadStateRequest.ListType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                com.ss.android.lark.chat.api.service.p1600b.C32848e.AnonymousClass28.f84413a = r3
                com.bytedance.lark.pb.im.v1.GetMessageReadStateRequest$ListType r4 = com.bytedance.lark.pb.im.v1.GetMessageReadStateRequest.ListType.ALL     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = com.ss.android.lark.chat.api.service.p1600b.C32848e.AnonymousClass28.f84413a     // Catch:{ NoSuchFieldError -> 0x004e }
                com.bytedance.lark.pb.im.v1.GetMessageReadStateRequest$ListType r3 = com.bytedance.lark.pb.im.v1.GetMessageReadStateRequest.ListType.READ     // Catch:{ NoSuchFieldError -> 0x004e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = com.ss.android.lark.chat.api.service.p1600b.C32848e.AnonymousClass28.f84413a     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.bytedance.lark.pb.im.v1.GetMessageReadStateRequest$ListType r1 = com.bytedance.lark.pb.im.v1.GetMessageReadStateRequest.ListType.UNREAD     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.api.service.p1600b.C32848e.AnonymousClass28.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ com.bytedance.lark.pb.im.v1.GetMessageIdsByPositionResponse m126413h(byte[] bArr) throws IOException {
        return com.bytedance.lark.pb.im.v1.GetMessageIdsByPositionResponse.ADAPTER.decode(bArr);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ MessageReadStateResponse m126415j(byte[] bArr) throws IOException {
        return C57328q.m222184a(GetMessageReadStateResponse.ADAPTER.decode(bArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static /* synthetic */ MessageReadStateResponse m126416k(byte[] bArr) throws IOException {
        return C57328q.m222184a(GetMessageReadStateResponse.ADAPTER.decode(bArr));
    }

    /* renamed from: a */
    private boolean m126398a(C29613e eVar) {
        return FileSendUtils.m133183a(eVar.f74229f, 5368709120L, C29990c.m110930b().mo134528a());
    }

    @Override // com.ss.android.lark.chat.api.service.IMessageService
    /* renamed from: d */
    public Map<String, MessageInfo> mo121110d(List<String> list) {
        return (Map) SdkSender.syncSend(Command.MGET_MESSAGES, new MGetMessagesRequest.C17803a().mo62071a(list), new SdkSender.IParser<Map<String, MessageInfo>>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32848e.AnonymousClass14 */

            /* renamed from: a */
            public Map<String, MessageInfo> parse(byte[] bArr) throws IOException {
                return C32848e.this.mo121263b(bArr);
            }
        });
    }

    /* renamed from: f */
    public void mo121273f(String str) {
        SdkSender.syncSend(Command.DELETE_EPHEMERAL_MESSAGE, new DeleteEphemeralMessageRequest.C17410a().mo61090a(str), new SdkSender.IParser<JSONObject>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32848e.AnonymousClass24 */

            /* renamed from: a */
            public JSONObject parse(byte[] bArr) {
                return new JSONObject();
            }
        });
    }

    /* renamed from: a */
    private boolean m126399a(MessageFetchScene messageFetchScene) {
        if (!C34298m.m132985a().mo126843c() || messageFetchScene != MessageFetchScene.FIRST_SCREEN) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private boolean m126406c(AbstractC34011b bVar) {
        if (bVar.f87861o == Message.Type.TEXT || bVar.f87861o == Message.Type.POST || bVar.f87861o == Message.Type.FILE) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ String m126408e(byte[] bArr) throws IOException {
        GetUploadIdResponse decode = GetUploadIdResponse.ADAPTER.decode(bArr);
        if (decode == null) {
            return "";
        }
        Log.m165379d("MessageService", "getAudioUploadId:" + decode.upload_id);
        return decode.upload_id;
    }

    @Override // com.ss.android.lark.chat.api.service.IMessageService
    /* renamed from: d */
    public void mo121111d(String str) {
        SdkSender.syncSend(Command.DELETE_QUASI_MESSAGE, new DeleteQuasiMessageRequest.C17420a().mo61114a(str), new SdkSender.IParser<JSONObject>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32848e.AnonymousClass27 */

            /* renamed from: a */
            public JSONObject parse(byte[] bArr) throws IOException {
                DeleteQuasiMessageResponse.ADAPTER.decode(bArr);
                return new JSONObject();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ Map m126410f(byte[] bArr) throws IOException {
        C14928Entity entity;
        MGetMessagesResponse decode = MGetMessagesResponse.ADAPTER.decode(bArr);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (!(decode == null || (entity = decode.entity) == null || entity.messages == null)) {
            C33982a a = C57306b.m222058a(entity, false, "MessageService::getLocalMessagesInfo");
            hashMap.putAll(C57322k.m222132b(entity));
            for (com.bytedance.lark.pb.basic.v1.Message message : entity.messages.values()) {
                String str = message.id;
                hashMap2.put(str, C57304a.m222044a((com.ss.android.lark.chat.entity.message.Message) hashMap.get(str), message, entity, a));
            }
        }
        return hashMap2;
    }

    /* renamed from: b */
    public MessageInfo mo121262b(AbstractC34011b bVar) {
        if (TextUtils.isEmpty(bVar.f87860n)) {
            return null;
        }
        Log.m165379d("MessageService", "createLocalPreMessage:" + bVar.f87861o + "/" + bVar.f87860n);
        return new MessageInfo(bVar.mo106656a(null, C29990c.m110930b().mo134515N().mo134394a()), C32835d.m126323c().mo121220e(bVar.f87859m));
    }

    @Override // com.ss.android.lark.chat.api.service.IMessageService
    /* renamed from: c */
    public Map<String, com.ss.android.lark.chat.entity.message.Message> mo121108c(List<String> list) {
        HashMap hashMap = new HashMap();
        if (CollectionUtils.isEmpty(list)) {
            return hashMap;
        }
        final ArrayList arrayList = new ArrayList(list);
        Map<String, com.ss.android.lark.chat.entity.message.Message> map = (Map) SdkSender.syncSend(Command.MGET_MESSAGES, new MGetMessagesRequest.C17803a().mo62071a(arrayList), new SdkSender.IParser<Map<String, com.ss.android.lark.chat.entity.message.Message>>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32848e.C328597 */

            /* renamed from: a */
            public Map<String, com.ss.android.lark.chat.entity.message.Message> parse(byte[] bArr) throws IOException {
                MGetMessagesResponse decode = MGetMessagesResponse.ADAPTER.decode(bArr);
                HashMap hashMap = new HashMap();
                if (!(decode == null || decode.entity == null || decode.entity.messages == null)) {
                    Map<String, com.ss.android.lark.chat.entity.message.Message> b = C57322k.m222132b(decode.entity);
                    for (String str : arrayList) {
                        com.ss.android.lark.chat.entity.message.Message message = b.get(str);
                        if (message != null) {
                            hashMap.put(str, message);
                        }
                    }
                }
                return hashMap;
            }
        });
        if (map == null) {
            map = new HashMap<>();
        }
        arrayList.removeAll(map.keySet());
        if (CollectionUtils.isEmpty(arrayList)) {
        }
        return map;
    }

    @Override // com.ss.android.lark.chat.service.IInnerMessageService
    /* renamed from: e */
    public void mo121272e(String str) {
        GetMessageReadStateRequest.C17627a aVar = new GetMessageReadStateRequest.C17627a();
        aVar.mo61646a(str).mo61644a(GetMessageReadStateRequest.ListType.ALL).mo61648b((Boolean) true);
        SdkSender.asynSendRequestNonWrap(Command.GET_MESSAGE_READ_STATE, aVar, null, $$Lambda$e$aknX8r3HoRCPIeRk1YVXoozbk_M.INSTANCE);
    }

    @Override // com.ss.android.lark.chat.api.service.IMessageService
    /* renamed from: b */
    public MessageInfo mo121106b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (MessageInfo) ((Map) SdkSender.sendRequest(Command.MGET_MESSAGES, new MGetMessagesRequest.C17803a().mo62071a(Collections.singletonList(str)).mo62070a(SyncDataStrategy.TRY_LOCAL), $$Lambda$e$ZpVnb6nHZC0UxuyeFOfjoz1o7Iw.INSTANCE)).get(str);
    }

    @Override // com.ss.android.lark.chat.api.service.IMessageService
    /* renamed from: c */
    public void mo121109c(String str) {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable(str) {
            /* class com.ss.android.lark.chat.api.service.p1600b.$$Lambda$e$UfefkR40S5dW5iSdbogYpGP7Szk */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                ao.m224317f(this.f$0);
            }
        });
        SdkSender.asynSendRequestNonWrap(Command.UPLOAD_FILES, new UploadFilesRequest.C18300a().mo63369a(UploadFilesRequest.Action.CANCEL).mo63370a(Collections.singletonList(str)).mo63368a(File.EntityType.MESSAGE), new C57760a(), new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32848e.AnonymousClass15 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                UploadFilesResponse.ADAPTER.decode(bArr);
                return true;
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.IMessageService
    /* renamed from: b */
    public Map<String, com.ss.android.lark.chat.entity.message.Message> mo121107b(List<String> list) {
        HashMap hashMap = new HashMap();
        Map map = (Map) SdkSender.sendRequest(Command.MGET_MESSAGES, new MGetMessagesRequest.C17803a().mo62071a(list), new SdkSender.IParser<Map<String, com.ss.android.lark.chat.entity.message.Message>>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32848e.AnonymousClass12 */

            /* renamed from: a */
            public Map<String, com.ss.android.lark.chat.entity.message.Message> parse(byte[] bArr) throws IOException {
                return C32848e.this.mo121250a(bArr);
            }
        });
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    /* renamed from: b */
    public Map<String, MessageInfo> mo121263b(byte[] bArr) throws IOException {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        MGetMessagesResponse decode = MGetMessagesResponse.ADAPTER.decode(bArr);
        if (!(decode == null || decode.entity == null || decode.entity.messages == null)) {
            C14928Entity entity = decode.entity;
            Map<String, com.bytedance.lark.pb.basic.v1.Message> map = entity.messages;
            hashMap.putAll(C57322k.m222132b(entity));
            C33982a a = C57306b.m222058a(entity, true, "MessageService::parsePullMessageInfosByIds");
            for (Map.Entry entry : hashMap.entrySet()) {
                MessageInfo a2 = C57304a.m222044a((com.ss.android.lark.chat.entity.message.Message) entry.getValue(), map.get(entry.getKey()), entity, a);
                hashMap2.put(a2.getMessage().getId(), a2);
            }
        }
        return hashMap2;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ C33960a m126390a(com.ss.android.lark.chat.entity.Channel channel, byte[] bArr) throws IOException {
        return new C33960a(channel.getId(), 0, 0);
    }

    @Override // com.ss.android.lark.chat.service.IInnerMessageService
    /* renamed from: b */
    public void mo121269b(final List<String> list, final IGetDataCallback<Map<String, com.ss.android.lark.chat.entity.message.Message>> iGetDataCallback) {
        C57865c.m224576a(new Runnable() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32848e.AnonymousClass33 */

            public void run() {
                C32848e.this.mo121271d(list, iGetDataCallback);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m126402b(AbstractC34125f fVar, AbstractC34011b bVar) {
        fVar.mo126563e();
        MessageInfo b = mo121262b(bVar);
        if (b != null) {
            C34253r.m132890a().mo126803a(b);
        }
        fVar.mo126564f();
    }

    /* renamed from: c */
    private void m126405c(final String str, IGetDataCallback<String> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.RECALL_GROUP_MESSAGE, new RecallGroupMessageRequest.C17991a().mo62514a(str), iGetDataCallback, new SdkSender.IParser<String>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32848e.AnonymousClass17 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                return str;
            }
        });
    }

    /* renamed from: e */
    private void m126409e(List<String> list, IGetDataCallback<Map<String, com.ss.android.lark.chat.entity.message.Message>> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.MGET_MESSAGES, new MGetMessagesRequest.C17803a().mo62071a(list), iGetDataCallback, new SdkSender.IParser<Map<String, com.ss.android.lark.chat.entity.message.Message>>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32848e.AnonymousClass25 */

            /* renamed from: a */
            public Map<String, com.ss.android.lark.chat.entity.message.Message> parse(byte[] bArr) throws IOException {
                return C32848e.this.mo121250a(bArr);
            }
        });
    }

    /* renamed from: b */
    private void m126403b(final String str, final IGetDataCallback<String> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.RECALL_MESSAGE, new RecallMessageRequest.C17993a().mo62519a(str), iGetDataCallback, new SdkSender.IParser<String>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32848e.AnonymousClass16 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                String str = RecallMessageResponse.ADAPTER.decode(bArr).message;
                if (str.equalsIgnoreCase("ok")) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(str);
                    }
                } else {
                    Log.m165382e("recall get response, but not ok");
                }
                return str;
            }
        });
    }

    /* renamed from: d */
    public void mo121271d(final List<String> list, IGetDataCallback<Map<String, com.ss.android.lark.chat.entity.message.Message>> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.DELETE_MESSAGES, new DeleteMessagesRequest.C17414a().mo61100a(list), iGetDataCallback, new SdkSender.IParser<Map<String, com.ss.android.lark.chat.entity.message.Message>>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32848e.AnonymousClass22 */

            /* renamed from: a */
            public Map<String, com.ss.android.lark.chat.entity.message.Message> parse(byte[] bArr) throws IOException {
                DeleteMessagesResponse.ADAPTER.decode(bArr);
                Map<String, com.ss.android.lark.chat.entity.message.Message> c = C32848e.this.mo121108c(list);
                for (Map.Entry<String, com.ss.android.lark.chat.entity.message.Message> entry : c.entrySet()) {
                    entry.getValue().setRemoved(true);
                }
                return c;
            }
        });
    }

    /* renamed from: a */
    private C34023d m126391a(String str, AbstractC33998f fVar) {
        String str2;
        String str3;
        if (fVar.f87821n != null && fVar.f87821n.length() < 15) {
            return new C34023d(null);
        }
        final CreateQuasiMessageRequest.C17374a a = new CreateQuasiMessageRequest.C17374a().mo60980a(Message.Type.UNKNOWN);
        QuasiContent.C15137a a2 = C34258s.m132915a(fVar, a, new QuasiContent.C15137a());
        String str4 = fVar.f87824q;
        Channel.Builder builder = new Channel.Builder();
        String str5 = "";
        if (str4 == null) {
            str4 = str5;
        }
        CreateQuasiMessageRequest.C17374a a3 = a.mo60979a(builder.id(str4).type(Channel.Type.fromValue(fVar.f87823p.getNumber())).build()).mo60984a(fVar.f87820m);
        if (fVar.f87818k == null) {
            str2 = str5;
        } else {
            str2 = fVar.f87818k;
        }
        CreateQuasiMessageRequest.C17374a b = a3.mo60986b(str2);
        if (fVar.f87819l == null) {
            str3 = str5;
        } else {
            str3 = fVar.f87819l;
        }
        b.mo60987c(str3).mo60988d(fVar.f87825r).mo60982a(Boolean.valueOf(fVar.f87827t)).mo60981a(a2.build());
        if (fVar.f87822o == Message.Type.IMAGE && ((C33995c) fVar).f87802d) {
            a.mo60983a((Long) 1L);
        }
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            str5 = str + "_";
        }
        sb.append(str5);
        sb.append(C53234a.m205877a());
        return (C34023d) SdkSender.syncSend(Command.CREATE_QUASI_MESSAGE, a, sb.toString(), new SdkSender.IParser<C34023d>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32848e.AnonymousClass26 */

            /* renamed from: a */
            public C34023d parse(byte[] bArr) throws IOException {
                CreateQuasiMessageResponse decode = CreateQuasiMessageResponse.ADAPTER.decode(bArr);
                C14928Entity entity = decode.entity;
                C33982a a = C57306b.m222058a(entity, true, "MessageService::putPreMessage");
                com.ss.android.lark.chat.entity.message.Message a2 = C57322k.m222119a(entity, entity.quasi_messages.get(decode.cid));
                MessageInfo a3 = C57322k.m222121a(a2, entity, a);
                Log.m165388i("quasi message created: " + a2 + "/" + a2.getcId() + "/" + a.f44269m);
                return new C34023d(a3);
            }
        }, C29990c.m110930b().mo134577e().mo120973e("sync_create_quasi_message"));
    }

    @Override // com.ss.android.lark.chat.service.IInnerMessageService
    /* renamed from: c */
    public void mo121270c(List<IMessageService.C32815a> list, IGetDataCallback<List<IMessageService.C32815a>> iGetDataCallback) {
        if (CollectionUtils.isEmpty(list)) {
            Log.m165382e("param is null");
        }
        SdkSender.asynSendRequestNonWrap(Command.HIDE_MESSAGE_URL_PREVIEW, new HideMessageUrlPreviewRequest.C17781a().mo62018a(list.get(0).mo121112a()), iGetDataCallback, new SdkSender.IParser<List<IMessageService.C32815a>>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32848e.C328586 */

            /* renamed from: a */
            public List<IMessageService.C32815a> parse(byte[] bArr) throws IOException {
                return new ArrayList();
            }
        });
    }

    @Override // com.ss.android.lark.chat.service.IInnerMessageService
    /* renamed from: b */
    public void mo121264b(Message.C34004a aVar, final IGetDataCallback<String> iGetDataCallback) {
        AbstractC34125f fVar;
        String str;
        if (iGetDataCallback instanceof C32865c) {
            fVar = ((C32865c) iGetDataCallback).f84442a;
        } else {
            fVar = null;
        }
        StringBuilder sb = new StringBuilder();
        if (fVar != null) {
            str = fVar.mo126560b() + "_";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(C53234a.m205877a());
        String sb2 = sb.toString();
        C53253l e = C29990c.m110930b().mo134577e().mo120973e("async_call_send_message");
        e.f131606b = this.f84373c;
        SendMessageRequest.C18023a a = new SendMessageRequest.C18023a().mo62600a(aVar.f87839a).mo62599a(aVar.f87840b);
        Command command = Command.SEND_MESSAGE;
        C57760a aVar2 = new C57760a(new IGetDataCallback<SendMessageResponse>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32848e.C328575 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(SendMessageResponse sendMessageResponse) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback instanceof C32865c) {
                    C32865c cVar = (C32865c) iGetDataCallback;
                    cVar.mo121313a(sendMessageResponse.net_cost.longValue());
                    cVar.mo121314a(sendMessageResponse.trace);
                }
                IGetDataCallback iGetDataCallback2 = iGetDataCallback;
                if (iGetDataCallback2 != null) {
                    iGetDataCallback2.onSuccess(sendMessageResponse.message_id);
                }
            }
        });
        ProtoAdapter<SendMessageResponse> protoAdapter = SendMessageResponse.ADAPTER;
        protoAdapter.getClass();
        SdkSender.asynSendRequestNonWrap(command, a, sb2, aVar2, new SdkSender.IParser() {
            /* class com.ss.android.lark.chat.api.service.p1600b.$$Lambda$nmKFcZ7J76qK1gd6TtHEeSjWQ */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (SendMessageResponse) ProtoAdapter.this.decode(bArr);
            }
        }, e);
    }

    /* renamed from: b */
    public void mo121265b(com.ss.android.lark.chat.entity.message.Message message, IGetDataCallback<String> iGetDataCallback) {
        ChatHitPointNew.f135660c.mo187388a(message.getChatId(), "msg_send", "none", ChatParamUtils.f88665a.mo126913a(message));
        C34273t.m132943a(message, iGetDataCallback);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public List<MessageInfo> m126392a(String str, byte[] bArr, boolean z) throws IOException {
        com.ss.android.lark.chat.entity.message.Message a;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        GetUnreadAtMessagesResponse decode = GetUnreadAtMessagesResponse.ADAPTER.decode(bArr);
        if (!(decode == null || decode.entity == null || decode.entity.messages == null)) {
            C33982a a2 = C57314g.m222100a(decode.entity, str);
            for (com.bytedance.lark.pb.basic.v1.Message message : decode.entity.messages.values()) {
                if (str.equals(message.chat_id) && (a = C57322k.m222120a(decode.entity, message.id)) != null) {
                    if (a.isFromMe() || (!a.isAtAll() && !a.isOtherAtMe())) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        m126394a(decode, a, z);
                        arrayList.add(new MessageInfo(a, a2.mo124892a(str, a.getFromId())));
                    }
                }
            }
            Collections.sort(arrayList);
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m126394a(GetUnreadAtMessagesResponse getUnreadAtMessagesResponse, com.ss.android.lark.chat.entity.message.Message message, boolean z) {
        if (z && getUnreadAtMessagesResponse.entity.threads != null && getUnreadAtMessagesResponse.entity.threads.get(message.getId()) != null) {
            Thread thread = getUnreadAtMessagesResponse.entity.threads.get(message.getId());
            if (message.getPosition() != thread.position.intValue()) {
                message.setPosition(thread.position.intValue());
            }
            if (message.getBadgeCount() != thread.badge_count.intValue()) {
                message.setBadgeCount(thread.badge_count.intValue());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ ChatMessageResponse m126389a(long j, String str, byte[] bArr) throws IOException {
        Log.m165379d("chatwindow", "interface cost:" + (System.currentTimeMillis() - j));
        PerfLog.start("parseMessagePb", "");
        long currentTimeMillis = System.currentTimeMillis();
        ChatMessageResponse chatMessageResponse = new ChatMessageResponse(new ArrayList(), new ArrayList());
        GetChatMessagesResponse decode = GetChatMessagesResponse.ADAPTER.decode(bArr);
        Log.m165379d("chatwindow", "decode cost:" + (System.currentTimeMillis() - currentTimeMillis));
        PerfLog.end("parseMessagePb", "");
        if (CollectionUtils.isNotEmpty(decode.invalid_positions)) {
            chatMessageResponse.invisiblePositions.addAll(decode.invalid_positions);
        }
        if (CollectionUtils.isNotEmpty(decode.missing_positions)) {
            chatMessageResponse.missingPositions.addAll(decode.missing_positions);
        }
        if (CollectionUtils.isNotEmpty(decode.messages_sync_pipe_finished)) {
            chatMessageResponse.messagesSyncPipeFinished.putAll(decode.messages_sync_pipe_finished);
        }
        if (decode.entity == null) {
            return chatMessageResponse;
        }
        chatMessageResponse.sdkCost = decode.cost.longValue();
        chatMessageResponse.netCosts = decode.net_costs;
        C14928Entity entity = decode.entity;
        long currentTimeMillis2 = System.currentTimeMillis();
        PerfLog.start("completeChatter", "");
        C33982a a = C57306b.m222058a(entity, true, "MessageService::syncPullChatMessages");
        Log.m165379d("chatwindow", "pack chatter cost:" + (System.currentTimeMillis() - currentTimeMillis2));
        PerfLog.end("completeChatter", "");
        long currentTimeMillis3 = System.currentTimeMillis();
        PerfLog.start("completeMessageInfo", "");
        Map<String, com.ss.android.lark.chat.entity.message.Message> b = C57322k.m222132b(entity);
        HashMap hashMap = new HashMap();
        for (Iterator<GetChatMessagesResponse.MessageItem> it = decode.message_items.iterator(); it.hasNext(); it = it) {
            GetChatMessagesResponse.MessageItem next = it.next();
            String str2 = next.item_id;
            if (next.item_type == GetChatMessagesResponse.MessageItem.ItemType.NORMAL_MESSAGE) {
                com.bytedance.lark.pb.basic.v1.Message message = entity.messages.get(str2);
                com.ss.android.lark.chat.entity.message.Message message2 = b.get(str2);
                if (message2 == null || message == null) {
                    Log.m165383e("chatwindow", "parse message failed, id is:" + str2);
                } else {
                    MessageInfo a2 = C57304a.m222045a(message2, message, entity, a, hashMap);
                    chatMessageResponse.messageInfoList.add(a2);
                    hashMap.put(str2, a2);
                    MessageInfo parentMessageInfo = a2.getParentMessageInfo();
                    if (parentMessageInfo != null && !hashMap.containsKey(parentMessageInfo.getMessage().getId())) {
                        hashMap.put(parentMessageInfo.getMessage().getId(), parentMessageInfo);
                    }
                    MessageInfo rootMessageInfo = a2.getRootMessageInfo();
                    if (rootMessageInfo != null && !hashMap.containsKey(rootMessageInfo.getMessage().getId())) {
                        hashMap.put(rootMessageInfo.getMessage().getId(), rootMessageInfo);
                    }
                }
            } else if (next.item_type == GetChatMessagesResponse.MessageItem.ItemType.QUASI_MESSAGE) {
                QuasiMessage quasiMessage = entity.quasi_messages.get(str2);
                if (quasiMessage == null) {
                    Log.m165383e("chatwindow", "parse quasi message failed id is:" + str2);
                } else {
                    MessageInfo a3 = C57322k.m222122a(C57322k.m222119a(entity, quasiMessage), entity, a, hashMap);
                    if (a3 != null) {
                        chatMessageResponse.messageInfoList.add(a3);
                        MessageInfo parentMessageInfo2 = a3.getParentMessageInfo();
                        if (parentMessageInfo2 != null && !hashMap.containsKey(parentMessageInfo2.getMessage().getId())) {
                            hashMap.put(parentMessageInfo2.getMessage().getId(), parentMessageInfo2);
                        }
                        MessageInfo rootMessageInfo2 = a3.getRootMessageInfo();
                        if (rootMessageInfo2 != null && !hashMap.containsKey(rootMessageInfo2.getMessage().getId())) {
                            hashMap.put(rootMessageInfo2.getMessage().getId(), rootMessageInfo2);
                        }
                    }
                }
            } else if (next.item_type == GetChatMessagesResponse.MessageItem.ItemType.EPHEMERAL_MESSAGE) {
                com.bytedance.lark.pb.basic.v1.Message message3 = entity.ephemeral_messages.get(str2);
                com.ss.android.lark.chat.entity.message.Message message4 = b.get(str2);
                if (message4 == null || message3 == null) {
                    Log.m165383e("chatwindow", "parse ephemeral message failed, id is:" + str2);
                } else {
                    message4.setEphemeral(true);
                    MessageInfo a4 = C57304a.m222045a(message4, message3, entity, a, hashMap);
                    chatMessageResponse.messageInfoList.add(a4);
                    hashMap.put(str2, a4);
                    MessageInfo parentMessageInfo3 = a4.getParentMessageInfo();
                    if (parentMessageInfo3 != null && !hashMap.containsKey(parentMessageInfo3.getMessage().getId())) {
                        hashMap.put(parentMessageInfo3.getMessage().getId(), parentMessageInfo3);
                    }
                    MessageInfo rootMessageInfo3 = a4.getRootMessageInfo();
                    if (rootMessageInfo3 != null && !hashMap.containsKey(rootMessageInfo3.getMessage().getId())) {
                        hashMap.put(rootMessageInfo3.getMessage().getId(), rootMessageInfo3);
                    }
                }
            }
        }
        chatMessageResponse.chat = C57310e.m222078a(entity.chats.get(str));
        Log.m165379d("chatwindow", "decode message cost:" + (System.currentTimeMillis() - currentTimeMillis3));
        Log.m165379d("chatwindow", "decode total cost:" + (System.currentTimeMillis() - currentTimeMillis));
        PerfLog.end("completeMessageInfo", "");
        chatMessageResponse.clientDataCost = System.currentTimeMillis() - currentTimeMillis;
        return chatMessageResponse;
    }

    /* renamed from: a */
    private void m126395a(C29613e eVar, String str, IGetDataCallback<Boolean> iGetDataCallback) {
        try {
            java.io.File b = C36808a.m145210b(new java.io.File(str));
            Log.m165389i("MessageService", "[cipher] file decrypt success, original path = " + str + ", new path = " + b.getAbsolutePath());
            if (C57744a.m224104a().getBoolean("android_file_upload_file_descriptor_config", true)) {
                eVar.f74233j = Uri.fromFile(b);
            } else {
                eVar.f74225b = b.getAbsolutePath();
            }
            iGetDataCallback.onSuccess(true);
        } catch (DecryptException e) {
            Log.m165383e("MessageService", "[cipher] file decrypt failed, original path = " + str);
            iGetDataCallback.onError(new ErrorResult(e));
        }
    }

    /* renamed from: a */
    private void m126396a(List<String> list, int i, int i2, com.ss.android.lark.chat.entity.Channel channel) {
        Log.m165389i("MessageService", "readThreadInner max:" + i + ", maxBadgeCount:" + i2);
        SdkSender.asynSendRequestNonWrap(Command.UPDATE_THREADS_ME_READ, new UpdateThreadsMeReadRequest.C18162a().mo62999a(C57309d.m222072a(channel)).mo63001a(list).mo63000a(Integer.valueOf(i)).mo63003b(Integer.valueOf(i2)), null, $$Lambda$e$oWVbc7nDLK95fhk14WHgtbswoQ.INSTANCE);
    }
}
