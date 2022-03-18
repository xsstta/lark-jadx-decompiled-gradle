package com.ss.android.lark.chatthread.model.loader;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.chat.core.model.C33952a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.service.impl.C34278w;
import com.ss.android.lark.chatbase.p1690c.C34438a;
import com.ss.android.lark.chatthread.model.datastore.ChatThreadDataStore;
import com.ss.android.lark.chatthread.model.datastore.ChatThreadPageData;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0002\f\u000f\u0018\u0000 \u00172\u00020\u0001:\u0002\u0017\u0018B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/chatthread/model/loader/ChatThreadDataLoader;", "", "dataStore", "Lcom/ss/android/lark/chatthread/model/datastore/ChatThreadDataStore;", "rootMsgId", "", "firstMsgPos", "", "callback", "Lcom/ss/android/lark/chatthread/model/loader/ChatThreadDataLoader$ReplyMessageLoadCallback;", "(Lcom/ss/android/lark/chatthread/model/datastore/ChatThreadDataStore;Ljava/lang/String;ILcom/ss/android/lark/chatthread/model/loader/ChatThreadDataLoader$ReplyMessageLoadCallback;)V", "localDataHandler", "com/ss/android/lark/chatthread/model/loader/ChatThreadDataLoader$localDataHandler$1", "Lcom/ss/android/lark/chatthread/model/loader/ChatThreadDataLoader$localDataHandler$1;", "remoteDataHandler", "com/ss/android/lark/chatthread/model/loader/ChatThreadDataLoader$remoteDataHandler$1", "Lcom/ss/android/lark/chatthread/model/loader/ChatThreadDataLoader$remoteDataHandler$1;", "filterBurnedAndInvisibleMessages", "", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "messageInfos", "loadReplyMessages", "", "Companion", "ReplyMessageLoadCallback", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatthread.c.b.a */
public final class ChatThreadDataLoader {

    /* renamed from: e */
    public static final Companion f90725e = new Companion(null);

    /* renamed from: a */
    public final C35118d f90726a = new C35118d(this);

    /* renamed from: b */
    public final ChatThreadDataStore f90727b;

    /* renamed from: c */
    public final String f90728c;

    /* renamed from: d */
    public final ReplyMessageLoadCallback f90729d;

    /* renamed from: f */
    private final C35117c f90730f = new C35117c(this);

    /* renamed from: g */
    private final int f90731g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chatthread/model/loader/ChatThreadDataLoader$ReplyMessageLoadCallback;", "", "onHistoryMessageLoaded", "", "onMessageLoaded", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.c.b.a$b */
    public interface ReplyMessageLoadCallback {
        /* renamed from: a */
        void mo129468a();

        /* renamed from: b */
        void mo129469b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chatthread/model/loader/ChatThreadDataLoader$Companion;", "", "()V", "LOG_TAG", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.c.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/chatthread/model/loader/ChatThreadDataLoader$remoteDataHandler$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.c.b.a$d */
    public static final class C35118d implements IGetDataCallback<List<? extends MessageInfo>> {

        /* renamed from: a */
        final /* synthetic */ ChatThreadDataLoader f90733a;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatthread.c.b.a$d$a */
        public static final /* synthetic */ class C35119a extends FunctionReference implements Function0<Unit> {
            C35119a(ReplyMessageLoadCallback bVar) {
                super(0, bVar);
            }

            @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
            public final String getName() {
                return "onMessageLoaded";
            }

            @Override // kotlin.jvm.internal.CallableReference
            public final KDeclarationContainer getOwner() {
                return Reflection.getOrCreateKotlinClass(ReplyMessageLoadCallback.class);
            }

            @Override // kotlin.jvm.internal.CallableReference
            public final String getSignature() {
                return "onMessageLoaded()V";
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                ((ReplyMessageLoadCallback) this.receiver).mo129469b();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35118d(ChatThreadDataLoader aVar) {
            this.f90733a = aVar;
        }

        /* renamed from: a */
        public void onSuccess(List<? extends MessageInfo> list) {
            Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f90733a.f90727b.mo127108b((C33952a) new ChatThreadPageData(this.f90733a.mo129492a(list)));
            UICallbackExecutor.execute(new RunnableC35120b(new C35119a(this.f90733a.f90729d)));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165379d("ChatThreadDataLoader", "Failed to get reply message from Server , reason: " + errorResult.getDisplayMsg() + ' ');
        }
    }

    /* renamed from: a */
    public final void mo129493a() {
        C34278w.m132953a().mo126828a(this.f90728c, false, (IGetDataCallback<List<MessageInfo>>) this.f90730f);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/chatthread/model/loader/ChatThreadDataLoader$localDataHandler$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "loadRemoteData", "", "onError", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.c.b.a$c */
    public static final class C35117c implements IGetDataCallback<List<? extends MessageInfo>> {

        /* renamed from: a */
        final /* synthetic */ ChatThreadDataLoader f90732a;

        /* renamed from: a */
        private final void m137103a() {
            C34278w.m132953a().mo126828a(this.f90732a.f90728c, true, (IGetDataCallback<List<MessageInfo>>) this.f90732a.f90726a);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35117c(ChatThreadDataLoader aVar) {
            this.f90732a = aVar;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165379d("ChatThreadDataLoader", "Load local reply messages failed , trying to load messages from server.");
            m137103a();
        }

        /* renamed from: a */
        public void onSuccess(List<? extends MessageInfo> list) {
            Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f90732a.f90727b.mo127108b((C33952a) new ChatThreadPageData(this.f90732a.mo129492a(list)));
            Log.m165379d("ChatThreadDataLoader", "Load local reply messages succeed , Now start loading messages from server.");
            m137103a();
        }
    }

    /* renamed from: a */
    public final List<MessageInfo> mo129492a(List<? extends MessageInfo> list) {
        Collections.sort(list);
        ArrayList arrayList = new ArrayList(list.size());
        boolean z = false;
        for (MessageInfo messageInfo : list) {
            Message message = messageInfo.getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message, "msg.getMessage()");
            if (message.getPosition() <= this.f90731g) {
                z = true;
            }
            if (!C34438a.m133579a(messageInfo.getMessage())) {
                Message message2 = messageInfo.getMessage();
                Intrinsics.checkExpressionValueIsNotNull(message2, "msg.getMessage()");
                if (message2.isVisible()) {
                    Message message3 = messageInfo.getMessage();
                    Intrinsics.checkExpressionValueIsNotNull(message3, "msg.getMessage()");
                    if (message3.getPosition() > this.f90731g) {
                        arrayList.add(messageInfo);
                    }
                }
            }
        }
        if (z) {
            this.f90729d.mo129468a();
        }
        return arrayList;
    }

    public ChatThreadDataLoader(ChatThreadDataStore aVar, String str, int i, ReplyMessageLoadCallback bVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "dataStore");
        Intrinsics.checkParameterIsNotNull(str, "rootMsgId");
        Intrinsics.checkParameterIsNotNull(bVar, "callback");
        this.f90727b = aVar;
        this.f90728c = str;
        this.f90731g = i;
        this.f90729d = bVar;
    }
}
