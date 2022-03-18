package com.ss.android.lark.chatsetting.service;

import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.bytedance.lark.pb.im.v1.GetChatAdminUsersRequest;
import com.bytedance.lark.pb.im.v1.GetChatAdminUsersResponse;
import com.bytedance.lark.pb.im.v1.GetTeamsByIdsRequest;
import com.bytedance.lark.pb.im.v1.GetTeamsByIdsResponse;
import com.bytedance.lark.pb.im.v1.UpdateChatRequest;
import com.bytedance.lark.pb.im.v1.UpdateChatResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.rucket.Rucket;
import com.larksuite.rucket.job.RucketJob;
import com.ss.android.lark.chat.entity.chat.AvatarMeta;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.C34501a;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.pb.chats.PullChatMemberSettingRequest;
import com.ss.android.lark.pb.chats.PullChatMemberSettingResponse;
import com.ss.android.lark.pb.entities.AvatarMeta;
import com.ss.android.lark.pb.team.PullAvatarMetaRequest;
import com.ss.android.lark.pb.team.PullAvatarMetaResponse;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.util.share_preference.UserSP;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlinx.coroutines.Dispatchers;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\fJ\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\nJ\u001e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ.\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00190\u001f0\u000f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u00102\u0006\u0010\u001c\u001a\u00020\u001dJ\u001c\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020#2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u001d0\fJ\u001e\u0010$\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u0015J\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\u000f2\u0006\u0010'\u001a\u00020(J!\u0010)\u001a\u00020#2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u001dH@ø\u0001\u0000¢\u0006\u0002\u0010+J\f\u0010,\u001a\u00020\u001b*\u00020\nH\u0002R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, d2 = {"Lcom/ss/android/lark/chatsetting/service/ChatSettingService;", "Lcom/larksuite/rucket/core/base/ServiceModel;", "Lcom/ss/android/lark/chatsetting/service/IChatSettingService;", "()V", "loginDependency", "Lcom/ss/android/lark/chatsetting/dependency/IChatSettingModuleDependency$ILoginDependency;", "kotlin.jvm.PlatformType", "getAvatarMetaByKey", "", "avatarKey", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chat/AvatarMeta;", "getChatAdminList", "Lcom/larksuite/rucket/job/RucketJob;", "", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "request", "Lcom/bytedance/lark/pb/im/v1/GetChatAdminUsersRequest;", "getGroupShareTimeType", "", "chatId", ShareHitPoint.f121868c, "getTeam", "Lcom/ss/android/lark/team/entity/Team;", "teamId", "", "isForceServer", "", "getTeams", "", "teamIds", "pullChatMemberSetting", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "saveGroupShareTimeType", ShareHitPoint.f121869d, "updateChat", "builder", "Lcom/bytedance/lark/pb/im/v1/UpdateChatRequest$Builder;", "updateSeeHistoryMessage", "isChecked", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toLongOrZero", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.b.b */
public final class ChatSettingService {

    /* renamed from: a */
    public static final ChatSettingService f88988a = new ChatSettingService();

    /* renamed from: b */
    private static final AbstractC34461c.AbstractC34476o f88989b;

    private ChatSettingService() {
    }

    /* renamed from: a */
    public final void mo127460a(String str, String str2, int i) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(str2, ShareHitPoint.f121868c);
        AbstractC34461c a = ChatSettingModule.m133639a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
        AbstractC34461c.AbstractC34476o g = a.mo127277g();
        Intrinsics.checkExpressionValueIsNotNull(g, "ChatSettingModule.getDependency().loginDependency");
        String a2 = g.mo127412a();
        if (a2 != null) {
            UserSP userSPById = UserSP.getUserSPById(a2);
            Intrinsics.checkExpressionValueIsNotNull(userSPById, "UserSP.getUserSPById(userId)");
            userSPById.putInt("params_group_share_time" + str2 + str, i);
        }
    }

    static {
        AbstractC34461c a = ChatSettingModule.m133639a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
        f88989b = a.mo127277g();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "it", "Lcom/bytedance/lark/pb/im/v1/UpdateChatResponse;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.b.b$i */
    static final class C34494i extends Lambda implements Function1<UpdateChatResponse, Chat> {
        public static final C34494i INSTANCE = new C34494i();

        C34494i() {
            super(1);
        }

        public final Chat invoke(UpdateChatResponse updateChatResponse) {
            Intrinsics.checkParameterIsNotNull(updateChatResponse, "it");
            return ChatSettingModelParser.m133889a(updateChatResponse);
        }
    }

    /* renamed from: a */
    private final long m133890a(String str) {
        Long longOrNull = StringsKt.toLongOrNull(str);
        if (longOrNull != null) {
            return longOrNull.longValue();
        }
        return 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/chat/entity/chat/AvatarMeta;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.chatsetting.service.ChatSettingService$getAvatarMetaByKey$2", mo239173f = "ChatSettingService.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.android.lark.chatsetting.b.b$b */
    static final class C34487b extends SuspendLambda implements Function2<AvatarMeta, Continuation<? super Unit>, Object> {
        final /* synthetic */ IGetDataCallback $callback;
        int label;
        private AvatarMeta p$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34487b(IGetDataCallback iGetDataCallback, Continuation cVar) {
            super(2, cVar);
            this.$callback = iGetDataCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C34487b bVar = new C34487b(this.$callback, cVar);
            bVar.p$0 = (AvatarMeta) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AvatarMeta avatarMeta, Continuation<? super Unit> cVar) {
            return ((C34487b) create(avatarMeta, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                this.$callback.onSuccess(this.p$0);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.chatsetting.service.ChatSettingService$getAvatarMetaByKey$3", mo239173f = "ChatSettingService.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.android.lark.chatsetting.b.b$c */
    static final class C34488c extends SuspendLambda implements Function2<ErrorResult, Continuation<? super Unit>, Object> {
        final /* synthetic */ IGetDataCallback $callback;
        int label;
        private ErrorResult p$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34488c(IGetDataCallback iGetDataCallback, Continuation cVar) {
            super(2, cVar);
            this.$callback = iGetDataCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C34488c cVar2 = new C34488c(this.$callback, cVar);
            cVar2.p$0 = (ErrorResult) obj;
            return cVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ErrorResult errorResult, Continuation<? super Unit> cVar) {
            return ((C34488c) create(errorResult, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                this.$callback.onError(this.p$0);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/team/entity/Team;", "it", "", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.b.b$e */
    static final class C34490e extends Lambda implements Function1<Map<Long, Team>, Team> {
        final /* synthetic */ long $teamId;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34490e(long j) {
            super(1);
            this.$teamId = j;
        }

        public final Team invoke(Map<Long, Team> map) {
            Intrinsics.checkParameterIsNotNull(map, "it");
            return map.get(Long.valueOf(this.$teamId));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010%\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001aB\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004 \u0003* \u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00050\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "Lcom/ss/android/lark/team/entity/Team;", "", "it", "Lcom/bytedance/lark/pb/im/v1/GetTeamsByIdsResponse;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.b.b$f */
    public static final class C34491f extends Lambda implements Function1<GetTeamsByIdsResponse, Map<Long, Team>> {
        public static final C34491f INSTANCE = new C34491f();

        C34491f() {
            super(1);
        }

        public final Map<Long, Team> invoke(GetTeamsByIdsResponse getTeamsByIdsResponse) {
            Intrinsics.checkParameterIsNotNull(getTeamsByIdsResponse, "it");
            AbstractC34461c a = ChatSettingModule.m133639a();
            Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
            return a.mo127294x().mo127441a(getTeamsByIdsResponse);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.chatsetting.service.ChatSettingService$pullChatMemberSetting$2", mo239173f = "ChatSettingService.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.android.lark.chatsetting.b.b$h */
    public static final class C34493h extends SuspendLambda implements Function2<ErrorResult, Continuation<? super Unit>, Object> {
        final /* synthetic */ IGetDataCallback $callback;
        int label;
        private ErrorResult p$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34493h(IGetDataCallback iGetDataCallback, Continuation cVar) {
            super(2, cVar);
            this.$callback = iGetDataCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C34493h hVar = new C34493h(this.$callback, cVar);
            hVar.p$0 = (ErrorResult) obj;
            return hVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ErrorResult errorResult, Continuation<? super Unit> cVar) {
            return ((C34493h) create(errorResult, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                this.$callback.onError(this.p$0);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/pb/chats/PullChatMemberSettingResponse;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.chatsetting.service.ChatSettingService$pullChatMemberSetting$1", mo239173f = "ChatSettingService.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.android.lark.chatsetting.b.b$g */
    public static final class C34492g extends SuspendLambda implements Function2<PullChatMemberSettingResponse, Continuation<? super Unit>, Object> {
        final /* synthetic */ IGetDataCallback $callback;
        final /* synthetic */ boolean $isGroupAdmin;
        final /* synthetic */ boolean $isGroupOwner;
        int label;
        private PullChatMemberSettingResponse p$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34492g(boolean z, boolean z2, IGetDataCallback iGetDataCallback, Continuation cVar) {
            super(2, cVar);
            this.$isGroupOwner = z;
            this.$isGroupAdmin = z2;
            this.$callback = iGetDataCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C34492g gVar = new C34492g(this.$isGroupOwner, this.$isGroupAdmin, this.$callback, cVar);
            gVar.p$0 = (PullChatMemberSettingResponse) obj;
            return gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PullChatMemberSettingResponse pullChatMemberSettingResponse, Continuation<? super Unit> cVar) {
            return ((C34492g) create(pullChatMemberSettingResponse, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z;
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                Boolean bool = this.p$0.mallow_apply;
                Intrinsics.checkExpressionValueIsNotNull(bool, "it.mallow_apply");
                if (!bool.booleanValue() || (!this.$isGroupOwner && !this.$isGroupAdmin)) {
                    z = false;
                } else {
                    z = true;
                }
                this.$callback.onSuccess(C69089a.m265837a(z));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: a */
    public final RucketJob<List<Chatter>> mo127455a(GetChatAdminUsersRequest getChatAdminUsersRequest) {
        Intrinsics.checkParameterIsNotNull(getChatAdminUsersRequest, "request");
        return RucketJob.m95400a(((IChatSettingService) Rucket.m95345a(IChatSettingService.class)).mo127466a(getChatAdminUsersRequest), (CoroutineContext) null, C34489d.INSTANCE, 1, (Object) null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/entity/chat/AvatarMeta;", "avatarMetaResponse", "Lcom/ss/android/lark/pb/team/PullAvatarMetaResponse;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.b.b$a */
    static final class C34486a extends Lambda implements Function1<PullAvatarMetaResponse, AvatarMeta> {
        public static final C34486a INSTANCE = new C34486a();

        C34486a() {
            super(1);
        }

        public final AvatarMeta invoke(PullAvatarMetaResponse pullAvatarMetaResponse) {
            Intrinsics.checkParameterIsNotNull(pullAvatarMetaResponse, "avatarMetaResponse");
            if (pullAvatarMetaResponse.mavatar_meta == null) {
                return null;
            }
            AvatarMeta avatarMeta = new AvatarMeta();
            com.ss.android.lark.pb.entities.AvatarMeta avatarMeta2 = pullAvatarMetaResponse.mavatar_meta;
            if (avatarMeta2 != null) {
                Integer num = avatarMeta2.mcolor;
                Intrinsics.checkExpressionValueIsNotNull(num, "it.mcolor");
                avatarMeta.setColor(num.intValue());
                avatarMeta.setText(avatarMeta2.mtext);
                AvatarMeta.Type type = avatarMeta2.mtype;
                Intrinsics.checkExpressionValueIsNotNull(type, "it.mtype");
                avatarMeta.setType(AvatarMeta.Type.fromValue(type.getValue()));
                Integer num2 = avatarMeta2.mborder_color;
                Intrinsics.checkExpressionValueIsNotNull(num2, "it.mborder_color");
                avatarMeta.setBorderColor(num2.intValue());
                Integer num3 = avatarMeta2.mbackground_color;
                Intrinsics.checkExpressionValueIsNotNull(num3, "it.mbackground_color");
                avatarMeta.setBackgroundColor(num3.intValue());
                Integer num4 = avatarMeta2.mcenter_color;
                Intrinsics.checkExpressionValueIsNotNull(num4, "it.mcenter_color");
                avatarMeta.setCenterColor(num4.intValue());
            }
            return avatarMeta;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "response", "Lcom/bytedance/lark/pb/im/v1/GetChatAdminUsersResponse;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.b.b$d */
    static final class C34489d extends Lambda implements Function1<GetChatAdminUsersResponse, List<Chatter>> {
        public static final C34489d INSTANCE = new C34489d();

        C34489d() {
            super(1);
        }

        public final List<Chatter> invoke(GetChatAdminUsersResponse getChatAdminUsersResponse) {
            Intrinsics.checkParameterIsNotNull(getChatAdminUsersResponse, "response");
            List<String> list = getChatAdminUsersResponse.admin_users;
            AbstractC34461c a = ChatSettingModule.m133639a();
            Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
            AbstractC34461c.AbstractC34466e d = a.mo127274d();
            Intrinsics.checkExpressionValueIsNotNull(d, "ChatSettingModule.getDependency().chatDependency");
            Map<String, Chatter> parseChatterMapFromEntity = d.mo127348b().parseChatterMapFromEntity(getChatAdminUsersResponse.entity);
            Intrinsics.checkExpressionValueIsNotNull(parseChatterMapFromEntity, "ChatSettingModule.getDep…omEntity(response.entity)");
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                Chatter chatter = parseChatterMapFromEntity.get(str);
                if (chatter != null) {
                    arrayList.add(chatter);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    public final RucketJob<Chat> mo127456a(UpdateChatRequest.C18137a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "builder");
        UpdateChatRequest a = aVar.build();
        Intrinsics.checkExpressionValueIsNotNull(a, "request");
        return RucketJob.m95400a(((IChatSettingService) Rucket.m95345a(IChatSettingService.class)).mo127468a(a), (CoroutineContext) null, C34494i.INSTANCE, 1, (Object) null);
    }

    /* renamed from: a */
    public final RucketJob<Team> mo127454a(long j, boolean z) {
        return RucketJob.m95400a(mo127457a(CollectionsKt.listOf(Long.valueOf(j)), z), (CoroutineContext) null, new C34490e(j), 1, (Object) null);
    }

    /* renamed from: a */
    public final int mo127453a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(str2, ShareHitPoint.f121868c);
        AbstractC34461c a = ChatSettingModule.m133639a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
        AbstractC34461c.AbstractC34476o g = a.mo127277g();
        Intrinsics.checkExpressionValueIsNotNull(g, "ChatSettingModule.getDependency().loginDependency");
        String a2 = g.mo127412a();
        if (a2 == null) {
            return 0;
        }
        UserSP userSPById = UserSP.getUserSPById(a2);
        Intrinsics.checkExpressionValueIsNotNull(userSPById, "UserSP.getUserSPById(userId)");
        return userSPById.getInt("params_group_share_time" + str2 + str);
    }

    /* renamed from: a */
    public final RucketJob<Map<Long, Team>> mo127457a(List<Long> list, boolean z) {
        Intrinsics.checkParameterIsNotNull(list, "teamIds");
        GetTeamsByIdsRequest.C17695a a = new GetTeamsByIdsRequest.C17695a().mo61809a(list);
        if (z) {
            a.mo61808a(SyncDataStrategy.FORCE_SERVER);
        }
        GetTeamsByIdsRequest a2 = a.build();
        Intrinsics.checkExpressionValueIsNotNull(a2, "builder.build()");
        return RucketJob.m95400a(((IChatSettingService) Rucket.m95345a(IChatSettingService.class)).mo127467a(a2), (CoroutineContext) null, C34491f.INSTANCE, 1, (Object) null);
    }

    /* renamed from: a */
    public final void mo127458a(Chat chat, IGetDataCallback<Boolean> iGetDataCallback) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        AbstractC34461c.AbstractC34476o oVar = f88989b;
        Intrinsics.checkExpressionValueIsNotNull(oVar, "loginDependency");
        String c = oVar.mo127415c();
        boolean a = C34501a.m133934a(chat);
        if (!chat.isAdmin() || !Intrinsics.areEqual(c, chat.getTenantId())) {
            z = false;
        } else {
            z = true;
        }
        PullChatMemberSettingRequest.C49592a aVar = new PullChatMemberSettingRequest.C49592a();
        String id = chat.getId();
        Intrinsics.checkExpressionValueIsNotNull(id, "chat.getId()");
        PullChatMemberSettingRequest.C49592a b = aVar.mo172910b(Long.valueOf(m133890a(id)));
        String tenantId = chat.getTenantId();
        Intrinsics.checkExpressionValueIsNotNull(tenantId, "chat.tenantId");
        PullChatMemberSettingRequest a2 = b.mo172908a(Long.valueOf(m133890a(tenantId))).build();
        Intrinsics.checkExpressionValueIsNotNull(a2, "request");
        ((IChatSettingService) Rucket.m95345a(IChatSettingService.class)).mo127469a(a2).mo93481a(Dispatchers.m266324b(), new C34492g(a, z, iGetDataCallback, null)).mo93485b(Dispatchers.m266324b(), new C34493h(iGetDataCallback, null));
    }

    /* renamed from: a */
    public final void mo127459a(String str, IGetDataCallback<com.ss.android.lark.chat.entity.chat.AvatarMeta> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "avatarKey");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        PullAvatarMetaRequest a = new PullAvatarMetaRequest.C50066a().mo173939a(str).build();
        Intrinsics.checkExpressionValueIsNotNull(a, "request");
        RucketJob.m95402b(RucketJob.m95401a(RucketJob.m95400a(((IChatSettingService) Rucket.m95345a(IChatSettingService.class)).mo127472a(a), (CoroutineContext) null, C34486a.INSTANCE, 1, (Object) null), (CoroutineContext) null, new C34487b(iGetDataCallback, null), 1, (Object) null), null, new C34488c(iGetDataCallback, null), 1, null);
    }
}
