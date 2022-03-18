package com.ss.android.lark.chat.topnoticemessage;

import androidx.lifecycle.C1177w;
import com.bytedance.lark.pb.im.v1.ChatTopNotice;
import com.bytedance.lark.pb.im.v1.GetChatTopNoticeRequest;
import com.bytedance.lark.pb.im.v1.GetChatTopNoticeResponse;
import com.bytedance.lark.pb.im.v1.PatchChatTopNoticeRequest;
import com.bytedance.lark.pb.im.v1.PatchChatTopNoticeResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.rucket.Rucket;
import com.larksuite.rucket.job.RucketJob;
import com.larksuite.rucket.job.base.RucketResult;
import com.ss.android.lark.chat.topnoticemessage.extensions.ResponseHandler;
import com.ss.android.lark.chat.topnoticemessage.message.TopNoticeMessage;
import com.ss.android.lark.chat.topnoticemessage.message.entity.ITopNoticeMessage;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.List;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69089a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlinx.coroutines.C69364ai;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.cr;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 12\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u00011B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u0010\u0010\u001f\u001a\u00020\u001c2\b\b\u0002\u0010 \u001a\u00020!J\u0016\u0010\"\u001a\u0006\u0012\u0002\b\u00030\u00162\b\u0010#\u001a\u0004\u0018\u00010$H\u0002J,\u0010%\u001a\u00020\u001e2\u0006\u0010\u0004\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020)2\b\b\u0002\u0010 \u001a\u00020!H\u0002J\u0010\u0010*\u001a\u00020\u001c2\b\b\u0002\u0010 \u001a\u00020!J\u000e\u0010+\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u0005J\u0006\u0010,\u001a\u00020\u001cJ\b\u0010-\u001a\u00020\u001eH\u0002J\u0014\u0010.\u001a\u00020\u001c2\n\u0010/\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0002J\f\u00100\u001a\u00020&*\u00020\u0005H\u0002R\u001f\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0015\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00160\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/ss/android/lark/chat/topnoticemessage/MessageTopNoticeModel;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/larksuite/rucket/core/base/ServiceModel;", "Lcom/ss/android/lark/chat/topnoticemessage/ITopNoticeService;", "chatId", "", "(Ljava/lang/String;)V", "allLiveData", "", "Landroidx/lifecycle/MutableLiveData;", "", "getAllLiveData", "()Ljava/util/List;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "eventError", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "getEventError", "()Landroidx/lifecycle/MutableLiveData;", "topNoticeMessage", "Lcom/ss/android/lark/chat/topnoticemessage/message/entity/ITopNoticeMessage;", "getTopNoticeMessage", "withResponse", "Lcom/ss/android/lark/chat/topnoticemessage/extensions/ResponseHandler;", "withResponseIgnoreError", "destroy", "", "getChatTopNoticeMessage", "Lkotlinx/coroutines/Job;", "hideTopNoticeMessage", "messageOperation", "", "parsePB", "notice", "Lcom/bytedance/lark/pb/im/v1/ChatTopNotice;", "patchChatTopNoticeMessage", "", "messageId", ShareHitPoint.f121869d, "Lcom/bytedance/lark/pb/im/v1/PatchChatTopNoticeRequest$ActionType;", "removeTopNoticeMessage", "setTopNoticeMessage", "setTopNoticeMessageGroupAnnouncement", "setupPush", "updateTopNoticeMessageIfNeed", "newMessage", "toLongOrZero", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.topnoticemessage.b */
public final class MessageTopNoticeModel implements CoroutineScope {

    /* renamed from: d */
    public static final Companion f88605d = new Companion(null);

    /* renamed from: a */
    public final ResponseHandler f88606a;

    /* renamed from: b */
    public final ResponseHandler f88607b;

    /* renamed from: c */
    public final String f88608c;

    /* renamed from: e */
    private final CoroutineContext f88609e = cr.m266795a(null, 1, null).plus(Dispatchers.m266324b());

    /* renamed from: f */
    private final C1177w<ITopNoticeMessage<?>> f88610f;

    /* renamed from: g */
    private final C1177w<ErrorResult> f88611g;

    /* renamed from: h */
    private final List<C1177w<? extends Object>> f88612h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chat/topnoticemessage/MessageTopNoticeModel$Companion;", "", "()V", "TAG", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.topnoticemessage.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final C1177w<ITopNoticeMessage<?>> mo126857a() {
        return this.f88610f;
    }

    /* renamed from: b */
    public final C1177w<ErrorResult> mo126863b() {
        return this.f88611g;
    }

    /* renamed from: c */
    public final List<C1177w<? extends Object>> mo126865c() {
        return this.f88612h;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f88609e;
    }

    /* renamed from: f */
    public final void mo126868f() {
        C69364ai.m266267a(this, null, 1, null);
    }

    /* renamed from: g */
    private final Job m133008g() {
        return C69553g.m266944a(this, null, null, new C34313d(this, null), 3, null);
    }

    /* renamed from: d */
    public final Job mo126866d() {
        return C69553g.m266944a(this, null, null, new C34309b(this, null), 3, null);
    }

    /* renamed from: e */
    public final void mo126867e() {
        m133005a(this, mo126862b(this.f88608c), 0, PatchChatTopNoticeRequest.ActionType.TOP_ANNOUNCEMENT, false, 8, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.topnoticemessage.b$e */
    static final class C34315e extends Lambda implements Function1<ErrorResult, Unit> {
        final /* synthetic */ MessageTopNoticeModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34315e(MessageTopNoticeModel bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ErrorResult errorResult) {
            invoke(errorResult);
            return Unit.INSTANCE;
        }

        public final void invoke(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "it");
            this.this$0.mo126863b().mo5929b(errorResult);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.topnoticemessage.b$f */
    static final class C34316f extends Lambda implements Function1<ErrorResult, Unit> {
        public static final C34316f INSTANCE = new C34316f();

        C34316f() {
            super(1);
        }

        public final void invoke(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "it");
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ErrorResult errorResult) {
            invoke(errorResult);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: b */
    public final long mo126862b(String str) {
        Long longOrNull = StringsKt.toLongOrNull(str);
        if (longOrNull != null) {
            return longOrNull.longValue();
        }
        return 0;
    }

    /* renamed from: b */
    public final void mo126864b(boolean z) {
        m133004a(mo126862b(this.f88608c), 0, PatchChatTopNoticeRequest.ActionType.CLOSE, z);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.chat.topnoticemessage.MessageTopNoticeModel$getChatTopNoticeMessage$1", mo239173f = "MessageTopNoticeModel.kt", mo239174i = {0, 0}, mo239175l = {47}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "request"}, mo239178s = {"L$0", "L$1"})
    /* renamed from: com.ss.android.lark.chat.topnoticemessage.b$b */
    public static final class C34309b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MessageTopNoticeModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34309b(MessageTopNoticeModel bVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C34309b bVar = new C34309b(this.this$0, cVar);
            bVar.p$ = (CoroutineScope) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C34309b) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                GetChatTopNoticeRequest.C17554a aVar = new GetChatTopNoticeRequest.C17554a();
                MessageTopNoticeModel bVar = this.this$0;
                GetChatTopNoticeRequest.C17554a a2 = aVar.mo61457a(C69089a.m265840a(bVar.mo126862b(bVar.f88608c)));
                GetChatTopNoticeRequest a3 = a2.build();
                Intrinsics.checkExpressionValueIsNotNull(a3, "request.build()");
                RucketJob<GetChatTopNoticeResponse> a4 = ((ITopNoticeService) Rucket.m95345a(ITopNoticeService.class)).mo126846a(a3);
                this.L$0 = ahVar;
                this.L$1 = a2;
                this.label = 1;
                obj = a4.mo93484a(this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                GetChatTopNoticeRequest.C17554a aVar2 = (GetChatTopNoticeRequest.C17554a) this.L$1;
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.this$0.f88607b.mo126890a("getChatTopNoticeMessage", (RucketResult) obj, new Function1<GetChatTopNoticeResponse, Unit>(this) {
                /* class com.ss.android.lark.chat.topnoticemessage.MessageTopNoticeModel.C34309b.C343101 */
                final /* synthetic */ C34309b this$0;

                {
                    this.this$0 = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(GetChatTopNoticeResponse getChatTopNoticeResponse) {
                    invoke(getChatTopNoticeResponse);
                    return Unit.INSTANCE;
                }

                public final void invoke(GetChatTopNoticeResponse getChatTopNoticeResponse) {
                    Intrinsics.checkParameterIsNotNull(getChatTopNoticeResponse, "it");
                    this.this$0.this$0.mo126859a(this.this$0.this$0.mo126858a(getChatTopNoticeResponse.top_notice_info));
                }
            });
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.chat.topnoticemessage.MessageTopNoticeModel$setupPush$1", mo239173f = "MessageTopNoticeModel.kt", mo239174i = {0, 0}, mo239175l = {SmEvents.EVENT_NE_RR}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "pushSource"}, mo239178s = {"L$0", "L$1"})
    /* renamed from: com.ss.android.lark.chat.topnoticemessage.b$d */
    public static final class C34313d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MessageTopNoticeModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34313d(MessageTopNoticeModel bVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C34313d dVar = new C34313d(this.this$0, cVar);
            dVar.p$ = (CoroutineScope) obj;
            return dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C34313d) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0060  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
            // Method dump skipped, instructions count: 127
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.topnoticemessage.MessageTopNoticeModel.C34313d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public MessageTopNoticeModel(String str) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        this.f88608c = str;
        C1177w<ITopNoticeMessage<?>> wVar = new C1177w<>(TopNoticeMessage.f88632a.mo126894a());
        this.f88610f = wVar;
        C1177w<ErrorResult> wVar2 = new C1177w<>();
        this.f88611g = wVar2;
        this.f88612h = CollectionsKt.listOf((Object[]) new C1177w[]{wVar, wVar2});
        this.f88606a = new ResponseHandler("MessageTopNoticeViewModel", new C34315e(this));
        this.f88607b = new ResponseHandler("MessageTopNoticeViewModel", C34316f.INSTANCE);
        m133008g();
    }

    /* renamed from: a */
    public final ITopNoticeMessage<?> mo126858a(ChatTopNotice chatTopNotice) {
        if (chatTopNotice == null || Intrinsics.areEqual((Object) chatTopNotice.closed, (Object) true)) {
            return TopNoticeMessage.f88632a.mo126894a();
        }
        return TopNoticeMessage.m133070a(this.f88608c, chatTopNotice);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.chat.topnoticemessage.MessageTopNoticeModel$patchChatTopNoticeMessage$1", mo239173f = "MessageTopNoticeModel.kt", mo239174i = {0, 0}, mo239175l = {104}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "request"}, mo239178s = {"L$0", "L$1"})
    /* renamed from: com.ss.android.lark.chat.topnoticemessage.b$c */
    public static final class C34311c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $chatId;
        final /* synthetic */ long $messageId;
        final /* synthetic */ boolean $messageOperation;
        final /* synthetic */ PatchChatTopNoticeRequest.ActionType $type;
        Object L$0;
        Object L$1;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MessageTopNoticeModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34311c(MessageTopNoticeModel bVar, long j, long j2, PatchChatTopNoticeRequest.ActionType actionType, boolean z, Continuation cVar) {
            super(2, cVar);
            this.this$0 = bVar;
            this.$messageId = j;
            this.$chatId = j2;
            this.$type = actionType;
            this.$messageOperation = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C34311c cVar2 = new C34311c(this.this$0, this.$messageId, this.$chatId, this.$type, this.$messageOperation, cVar);
            cVar2.p$ = (CoroutineScope) obj;
            return cVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C34311c) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                PatchChatTopNoticeRequest.C17821a a2 = new PatchChatTopNoticeRequest.C17821a().mo62128b(C69089a.m265840a(this.$messageId)).mo62126a(C69089a.m265840a(this.$chatId)).mo62124a(this.$type).mo62125a(C69089a.m265837a(this.$messageOperation));
                PatchChatTopNoticeRequest a3 = a2.build();
                Intrinsics.checkExpressionValueIsNotNull(a3, "request.build()");
                RucketJob<PatchChatTopNoticeResponse> a4 = ((ITopNoticeService) Rucket.m95345a(ITopNoticeService.class)).mo126847a(a3);
                this.L$0 = ahVar;
                this.L$1 = a2;
                this.label = 1;
                obj = a4.mo93484a(this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                PatchChatTopNoticeRequest.C17821a aVar = (PatchChatTopNoticeRequest.C17821a) this.L$1;
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.this$0.f88606a.mo126890a("patchChatTopNoticeMessage", (RucketResult) obj, new Function1<PatchChatTopNoticeResponse, Unit>(this) {
                /* class com.ss.android.lark.chat.topnoticemessage.MessageTopNoticeModel.C34311c.C343121 */
                final /* synthetic */ C34311c this$0;

                {
                    this.this$0 = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(PatchChatTopNoticeResponse patchChatTopNoticeResponse) {
                    invoke(patchChatTopNoticeResponse);
                    return Unit.INSTANCE;
                }

                public final void invoke(PatchChatTopNoticeResponse patchChatTopNoticeResponse) {
                    Intrinsics.checkParameterIsNotNull(patchChatTopNoticeResponse, "it");
                    this.this$0.this$0.mo126859a(this.this$0.this$0.mo126858a(patchChatTopNoticeResponse.top_notice_info));
                }
            });
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public final void mo126859a(ITopNoticeMessage<?> cVar) {
        ITopNoticeMessage<Object> b = this.f88610f.mo5927b();
        if (b == null) {
            b = TopNoticeMessage.f88632a.mo126894a();
        }
        int e = b.mo126899e();
        if (Intrinsics.areEqual(cVar, TopNoticeMessage.f88632a.mo126894a()) || cVar.mo126899e() >= e) {
            this.f88610f.mo5929b(cVar);
        }
    }

    /* renamed from: a */
    public final void mo126860a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        m133005a(this, mo126862b(this.f88608c), mo126862b(str), PatchChatTopNoticeRequest.ActionType.TOP_MSG, false, 8, null);
    }

    /* renamed from: a */
    public final void mo126861a(boolean z) {
        m133004a(mo126862b(this.f88608c), 0, PatchChatTopNoticeRequest.ActionType.REMOVE, z);
    }

    /* renamed from: a */
    public static /* synthetic */ void m133006a(MessageTopNoticeModel bVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        bVar.mo126861a(z);
    }

    /* renamed from: b */
    public static /* synthetic */ void m133007b(MessageTopNoticeModel bVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        bVar.mo126864b(z);
    }

    /* renamed from: a */
    private final Job m133004a(long j, long j2, PatchChatTopNoticeRequest.ActionType actionType, boolean z) {
        return C69553g.m266944a(this, null, null, new C34311c(this, j2, j, actionType, z, null), 3, null);
    }

    /* renamed from: a */
    static /* synthetic */ Job m133005a(MessageTopNoticeModel bVar, long j, long j2, PatchChatTopNoticeRequest.ActionType actionType, boolean z, int i, Object obj) {
        boolean z2;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        if ((i & 8) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        return bVar.m133004a(j, j2, actionType, z2);
    }
}
