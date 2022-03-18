package com.ss.android.lark.chat.api.service.track.sample;

import android.text.TextUtils;
import com.larksuite.framework.thread.ThreadFactoryC26153m;
import com.ss.android.lark.chat.api.service.track.IMessageSource;
import com.ss.android.lark.chat.api.service.track.ISampleMsgIssueTracker;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.log.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u0000 '2\u00020\u0001:\u0003'()B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u00062\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u001aH\u0016J\b\u0010$\u001a\u00020 H\u0016J\u0012\u0010%\u001a\u00020 2\b\u0010&\u001a\u0004\u0018\u00010\u0003H\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006*"}, d2 = {"Lcom/ss/android/lark/chat/api/service/track/sample/MsgSampleIssueTracker;", "Lcom/ss/android/lark/chat/api/service/track/ISampleMsgIssueTracker;", "mChatId", "", "(Ljava/lang/String;)V", "mChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getMChat", "()Lcom/ss/android/lark/chat/entity/chat/Chat;", "setMChat", "(Lcom/ss/android/lark/chat/entity/chat/Chat;)V", "getMChatId", "()Ljava/lang/String;", "mExecutor", "Ljava/util/concurrent/ScheduledExecutorService;", "getMExecutor", "()Ljava/util/concurrent/ScheduledExecutorService;", "setMExecutor", "(Ljava/util/concurrent/ScheduledExecutorService;)V", "mMsgSourceFetcher", "Lcom/ss/android/lark/chat/api/service/track/sample/MsgSampleIssueTracker$IMessageSourceFetcher;", "getMMsgSourceFetcher", "()Lcom/ss/android/lark/chat/api/service/track/sample/MsgSampleIssueTracker$IMessageSourceFetcher;", "setMMsgSourceFetcher", "(Lcom/ss/android/lark/chat/api/service/track/sample/MsgSampleIssueTracker$IMessageSourceFetcher;)V", "mMsgSyncSyncFetcher", "Lcom/ss/android/lark/chat/api/service/track/sample/MsgSampleIssueTracker$IMessagePipeSyncFetcher;", "getMMsgSyncSyncFetcher", "()Lcom/ss/android/lark/chat/api/service/track/sample/MsgSampleIssueTracker$IMessagePipeSyncFetcher;", "setMMsgSyncSyncFetcher", "(Lcom/ss/android/lark/chat/api/service/track/sample/MsgSampleIssueTracker$IMessagePipeSyncFetcher;)V", "bindChat", "", "chat", "fetcher", "syncFetcher", "endTrack", "onMessageShown", "msgId", "Companion", "IMessagePipeSyncFetcher", "IMessageSourceFetcher", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.api.service.track.sample.a */
public final class MsgSampleIssueTracker implements ISampleMsgIssueTracker {

    /* renamed from: a */
    public static final HashMap<String, MsgSampleIssueTracker> f84544a = new HashMap<>();

    /* renamed from: b */
    public static final Companion f84545b = new Companion(null);

    /* renamed from: c */
    private ScheduledExecutorService f84546c;

    /* renamed from: d */
    private Chat f84547d;

    /* renamed from: e */
    private IMessageSourceFetcher f84548e;

    /* renamed from: f */
    private IMessagePipeSyncFetcher f84549f;

    /* renamed from: g */
    private final String f84550g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/chat/api/service/track/sample/MsgSampleIssueTracker$IMessagePipeSyncFetcher;", "", "getMessagePipeSyncState", "", "", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.api.service.track.sample.a$b */
    public interface IMessagePipeSyncFetcher {
        /* renamed from: a */
        Map<String, Boolean> mo121486a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/chat/api/service/track/sample/MsgSampleIssueTracker$IMessageSourceFetcher;", "", "messageSource", "Lcom/ss/android/lark/chat/api/service/track/IMessageSource;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.api.service.track.sample.a$c */
    public interface IMessageSourceFetcher {
        /* renamed from: a */
        IMessageSource mo121487a();
    }

    @JvmStatic
    /* renamed from: b */
    public static final ISampleMsgIssueTracker m126721b(String str) {
        return f84545b.mo121484a(str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/chat/api/service/track/sample/MsgSampleIssueTracker$Companion;", "", "()V", "TAG", "", "sTrackerCache", "Ljava/util/HashMap;", "Lcom/ss/android/lark/chat/api/service/track/sample/MsgSampleIssueTracker;", "getSTrackerCache", "()Ljava/util/HashMap;", "of", "Lcom/ss/android/lark/chat/api/service/track/ISampleMsgIssueTracker;", "chatId", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.api.service.track.sample.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final HashMap<String, MsgSampleIssueTracker> mo121485a() {
            return MsgSampleIssueTracker.f84544a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final ISampleMsgIssueTracker mo121484a(String str) {
            MsgSampleIssueTracker aVar;
            if (str == null) {
                return new MsgSampleIssueTracker("");
            }
            synchronized (MsgSampleIssueTracker.f84545b.mo121485a()) {
                MsgSampleIssueTracker aVar2 = MsgSampleIssueTracker.f84545b.mo121485a().get(str);
                if (aVar2 == null) {
                    aVar2 = new MsgSampleIssueTracker(str);
                    MsgSampleIssueTracker.f84545b.mo121485a().put(str, aVar2);
                }
                aVar = aVar2;
            }
            return aVar;
        }
    }

    @Override // com.ss.android.lark.chat.api.service.track.ICommonMsgIssueTracker
    /* renamed from: a */
    public void mo121415a() {
        HashMap<String, MsgSampleIssueTracker> hashMap = f84544a;
        synchronized (hashMap) {
            hashMap.clear();
            this.f84546c.shutdown();
            Unit unit = Unit.INSTANCE;
        }
    }

    public MsgSampleIssueTracker(String str) {
        this.f84550g = str;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new ThreadFactoryC26153m("MsgSampleIssueTracker_" + str));
        Intrinsics.checkExpressionValueIsNotNull(newScheduledThreadPool, "Executors.newScheduledTh…ory(TAG + \"_\" + mChatId))");
        this.f84546c = newScheduledThreadPool;
    }

    @Override // com.ss.android.lark.chat.api.service.track.ICommonMsgIssueTracker
    /* renamed from: a */
    public void mo121416a(String str) {
        IMessageSourceFetcher cVar = this.f84548e;
        if (cVar == null || str == null) {
            Log.m165383e("MsgSampleIssueTracker", "message source is null, check failed");
            return;
        }
        Chat chat = this.f84547d;
        if (chat == null) {
            Log.m165383e("MsgSampleIssueTracker", "chat is invalid, check failed");
            return;
        }
        IMessagePipeSyncFetcher bVar = this.f84549f;
        if (bVar != null) {
            new ReactionSampleRecorder(chat, cVar, bVar, str, this.f84546c).mo121433b();
            new ReadSampleRecorder(chat, cVar, bVar, str, this.f84546c).mo121433b();
        }
    }

    @Override // com.ss.android.lark.chat.api.service.track.ISampleMsgIssueTracker
    /* renamed from: a */
    public void mo121422a(Chat chat, IMessageSourceFetcher cVar, IMessagePipeSyncFetcher bVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "fetcher");
        Intrinsics.checkParameterIsNotNull(bVar, "syncFetcher");
        if (!TextUtils.isEmpty(this.f84550g) && chat != null && !(!Intrinsics.areEqual(this.f84550g, chat.getId()))) {
            this.f84547d = chat;
            this.f84548e = cVar;
            this.f84549f = bVar;
        }
    }
}
