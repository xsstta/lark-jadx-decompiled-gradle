package com.ss.android.lark.chat.chatwindow.secretchat.data.decrypt;

import android.util.LruCache;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.TranslateInfo;
import com.bytedance.lark.pb.im.v1.GetDecryptedContentRequest;
import com.bytedance.lark.pb.im.v1.GetDecryptedContentResponse;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.p2851u.p2852a.C57322k;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.sdk.SdkSender;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u0012B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J\"\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH\u0016J$\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/secretchat/data/decrypt/SecretContentResolver;", "Lcom/ss/android/lark/chat/chatwindow/secretchat/data/decrypt/ISecretContentResolver;", "()V", "cache", "Landroid/util/LruCache;", "", "Lcom/ss/android/lark/chat/export/entity/message/Content;", "lock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "getDecryptedContent", "message", "Lcom/ss/android/lark/chat/entity/message/Message;", "", "messages", "", "getDecryptedContentImpl", "getMessageContent", "Companion", "SingletonHolder", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.a.c.a */
public final class SecretContentResolver {

    /* renamed from: a */
    public static final Companion f87392a = new Companion(null);

    /* renamed from: b */
    private final LruCache<String, Content> f87393b = new LruCache<>(20);

    /* renamed from: c */
    private final ReentrantReadWriteLock f87394c = new ReentrantReadWriteLock();

    @JvmStatic
    /* renamed from: a */
    public static final SecretContentResolver m131240a() {
        return f87392a.mo123956a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/secretchat/data/decrypt/SecretContentResolver$Companion;", "", "()V", "CACHE_SIZE", "", "TAG", "", "getInstance", "Lcom/ss/android/lark/chat/chatwindow/secretchat/data/decrypt/SecretContentResolver;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.a.c.a$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final SecretContentResolver mo123956a() {
            return SingletonHolder.f87395a.mo123957a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/secretchat/data/decrypt/SecretContentResolver$SingletonHolder;", "", "()V", "instance", "Lcom/ss/android/lark/chat/chatwindow/secretchat/data/decrypt/SecretContentResolver;", "getInstance", "()Lcom/ss/android/lark/chat/chatwindow/secretchat/data/decrypt/SecretContentResolver;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.a.c.a$b */
    public static final class SingletonHolder {

        /* renamed from: a */
        public static final SingletonHolder f87395a = new SingletonHolder();

        /* renamed from: b */
        private static final SecretContentResolver f87396b = new SecretContentResolver();

        private SingletonHolder() {
        }

        /* renamed from: a */
        public final SecretContentResolver mo123957a() {
            return f87396b;
        }
    }

    /* renamed from: a */
    public Content mo123953a(Message message) {
        Intrinsics.checkParameterIsNotNull(message, "message");
        ArrayList arrayList = new ArrayList();
        arrayList.add(message);
        return mo123954a(arrayList).get(message.getId());
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`\u00042\u000e\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Ljava/util/HashMap;", "", "Lcom/ss/android/lark/chat/export/entity/message/Content;", "Lkotlin/collections/HashMap;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.a.c.a$c */
    public static final class C33911c<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        final /* synthetic */ List f87397a;

        /* renamed from: b */
        final /* synthetic */ HashMap f87398b;

        C33911c(List list, HashMap hashMap) {
            this.f87397a = list;
            this.f87398b = hashMap;
        }

        /* renamed from: a */
        public final HashMap<String, Content> parse(byte[] bArr) {
            GetDecryptedContentResponse decode = GetDecryptedContentResponse.ADAPTER.decode(bArr);
            C53241h.m205899c("SecretContentResolver", "get decrypted message content size: " + decode.contents.size() + ", request size: " + this.f87397a.size() + ' ');
            C14928Entity entity = decode.entity;
            HashMap<String, Content> hashMap = new HashMap<>();
            Map<String, com.bytedance.lark.pb.basic.v1.Content> map = decode.contents;
            Intrinsics.checkExpressionValueIsNotNull(map, "pbResponse.contents");
            for (Map.Entry<String, com.bytedance.lark.pb.basic.v1.Content> entry : map.entrySet()) {
                String key = entry.getKey();
                com.bytedance.lark.pb.basic.v1.Content value = entry.getValue();
                Message message = (Message) this.f87398b.get(key);
                if (message != null) {
                    hashMap.put(key, C57322k.m222123a(entity, message, value, (TranslateInfo) null));
                }
            }
            return hashMap;
        }
    }

    /* renamed from: b */
    public Content mo123955b(Message message) {
        Intrinsics.checkParameterIsNotNull(message, "message");
        if (message.isSecretEncrypted()) {
            C53241h.m205898b("ChatWindowLog", "getMessageContent encrypted id: " + message.getId());
            return mo123953a(message);
        }
        C53241h.m205898b("ChatWindowLog", "getMessageContent normal id: " + message.getId());
        return message.getContent();
    }

    /* renamed from: b */
    private final Map<String, Content> m131241b(List<? extends Message> list) {
        GetDecryptedContentRequest.C17566a aVar = new GetDecryptedContentRequest.C17566a();
        List<? extends Message> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getCryptoToken());
        }
        GetDecryptedContentRequest.C17566a a = aVar.mo61482a(arrayList);
        HashMap hashMap = new HashMap();
        for (T t : list2) {
            hashMap.put(t.getId(), t);
        }
        SdkSender.C53233d syncSendMayError = SdkSender.syncSendMayError(Command.GET_DECRYPTED_CONTENT, a, new C33911c(list, hashMap));
        if (syncSendMayError.f131573b == null) {
            return syncSendMayError.f131572a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("get decrypted message content failed: ");
        ErrorResult errorResult = syncSendMayError.f131573b;
        Intrinsics.checkExpressionValueIsNotNull(errorResult, "sdkResult.error");
        sb.append(errorResult.getDisplayMsg());
        C53241h.m205894a("SecretContentResolver", sb.toString());
        return null;
    }

    /* renamed from: a */
    public Map<String, Content> mo123954a(List<? extends Message> list) {
        Map<String, Content> b;
        Intrinsics.checkParameterIsNotNull(list, "messages");
        try {
            this.f87394c.writeLock().lock();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            for (T t : list) {
                concurrentHashMap.put(t.getId(), t);
            }
            ArrayList arrayList = new ArrayList();
            ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
            List<? extends Message> list2 = list;
            ArrayList<String> arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next().getId());
            }
            for (String str : arrayList2) {
                Content content = this.f87393b.get(str);
                if (content == null) {
                    Message message = (Message) concurrentHashMap.get(str);
                    if (message != null) {
                        arrayList.add(message);
                    }
                } else {
                    Intrinsics.checkExpressionValueIsNotNull(str, "messageId");
                    concurrentHashMap2.put(str, content);
                }
            }
            if (!CollectionUtils.isEmpty(arrayList) && (b = m131241b(arrayList)) != null) {
                concurrentHashMap2.putAll(b);
                for (Map.Entry<String, Content> entry : b.entrySet()) {
                    this.f87393b.put(entry.getKey(), entry.getValue());
                }
            }
            return concurrentHashMap2;
        } finally {
            this.f87394c.writeLock().unlock();
        }
    }
}
