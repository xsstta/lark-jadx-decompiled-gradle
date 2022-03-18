package com.ss.android.lark.create.groupchat.impl.service;

import android.content.Context;
import android.util.Pair;
import com.bytedance.lark.pb.im.v1.CreateChatRequest;
import com.bytedance.lark.pb.im.v1.CreateChatResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.rucket.Rucket;
import com.larksuite.rucket.impl.base.request.RequestConfigImpl;
import com.larksuite.rucket.job.RucketJob;
import com.ss.android.lark.chat.api.AbstractC32812c;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.PickChatEntity;
import com.ss.android.lark.contact.entity.Contact;
import com.ss.android.lark.create.groupchat.CreateGroupChatModule;
import com.ss.android.lark.create.groupchat.dto.CreateGroupMode;
import com.ss.android.lark.create.groupchat.dto.CreateGroupScene;
import com.ss.android.lark.create.groupchat.dto.GroupCreateInfo;
import com.ss.android.lark.create.groupchat.impl.statistics.CreateGroupExtraParams;
import com.ss.android.lark.create.groupchat.impl.statistics.CreateGroupHitPointNew;
import com.ss.android.lark.create.groupchat.impl.statistics.GroupHitPoint;
import com.ss.android.lark.create.groupchat.impl.statistics.PublicGroupHitPoint;
import com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c;
import com.ss.android.lark.doc.entity.DocPermPair;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.chats.PullChangeGroupMemberAuthorizationRequest;
import com.ss.android.lark.pb.chats.PullChangeGroupMemberAuthorizationResponse;
import com.ss.android.lark.pb.entities.Chat;
import com.ss.android.lark.sdk.C53253l;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.statistics.extensions.TARGET_NONE;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlinx.coroutines.Dispatchers;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003JD\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0018\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00050\u00160\u0015H\u0007JP\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 2\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u00102\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0015H\u0002J@\u0010#\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020%2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\b\b\u0002\u0010\u001e\u001a\u00020\u0017H\u0007J\u0001\u0010'\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001d2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u00102\u0006\u0010(\u001a\u00020\u00052\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00102 \u0010*\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020,0+\u0018\u00010+2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\b\b\u0002\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 H\u0007J@\u0010-\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020%2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u00102\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00152\u0006\u0010\u001f\u001a\u00020 H\u0007J&\u00100\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020 2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u001d022\u0006\u00103\u001a\u000204H\u0002J>\u00105\u001a\u00020\f2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u001d022\u0006\u00106\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 2\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u0010H\u0002J\u0018\u00107\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u00108\u001a\u00020\f2\u0006\u00106\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u00109\u001a\u00020\f2\u0006\u0010:\u001a\u00020\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \b*\u0004\u0018\u00010\n0\nX\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/service/CreateGroupService;", "Lcom/larksuite/rucket/core/base/ServiceModel;", "Lcom/ss/android/lark/create/groupchat/impl/service/IGroupCreateService;", "()V", "TAG", "", "chatDependency", "Lcom/ss/android/lark/create/groupchat/dependency/ICreateGroupChatModuleDependency$IChatDependency;", "kotlin.jvm.PlatformType", "perfEnterChatMonitor", "Lcom/ss/android/lark/chat/api/IPerfEnterChatMonitor;", "checkPickEntityMemberCountBeforeCreate", "", "chatMode", "Lcom/ss/android/lark/chat/entity/chat/Chat$ChatMode;", "pickChatEntity", "", "Lcom/ss/android/lark/chat/entity/chat/PickChatEntity;", "fromChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Landroid/util/Pair;", "", "createGroupChatInner", "sourceTag", "request", "Lcom/bytedance/lark/pb/im/v1/CreateChatRequest;", "context", "Landroid/content/Context;", "needOpenChat", ShareHitPoint.f121868c, "Lcom/ss/android/lark/create/groupchat/dto/CreateGroupScene;", "contactsToApply", "Lcom/ss/android/lark/contact/entity/Contact;", "createGroupFromInputGroupInfoPage", "groupCreateInfo", "Lcom/ss/android/lark/create/groupchat/dto/GroupCreateInfo;", "selectEntities", "createGroupFromMessageList", "fromChatId", "initMessageIds", "docsPermissions", "", "Lcom/ss/android/lark/doc/entity/DocPermPair$PermType;", "createGroupFromPicker", "searchInfos", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "handleCreateGroupFail", "contextRef", "Ljava/lang/ref/WeakReference;", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "handleCreateGroupSuccess", "chat", "sendGroupCreateClickEvent", "sendGroupCreateEvent", "triggerCreateGroupMonitor", "start", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.create.groupchat.impl.a.f */
public final class CreateGroupService {

    /* renamed from: a */
    public static final CreateGroupService f93561a = new CreateGroupService();

    /* renamed from: b */
    private static final AbstractC36248c.AbstractC36252d f93562b;

    /* renamed from: c */
    private static final AbstractC32812c f93563c;

    private CreateGroupService() {
    }

    /* renamed from: a */
    private final void m142810a(String str, CreateChatRequest createChatRequest, Context context, boolean z, CreateGroupScene createGroupScene, List<? extends Contact> list, IGetDataCallback<Chat> iGetDataCallback) {
        m142809a(createGroupScene, createChatRequest);
        m142811a(true);
        WeakReference weakReference = new WeakReference(context);
        RucketJob.m95400a(((IGroupCreateService) Rucket.m95345a(IGroupCreateService.class)).mo133830a(createChatRequest, new C36270c(f93563c.mo120973e("get_chat_launcher_info"))), (CoroutineContext) null, C36271d.INSTANCE, 1, (Object) null).mo93481a((CoroutineContext) Dispatchers.m266324b(), (Function2) new C36272e(str, weakReference, z, createGroupScene, list, iGetDataCallback, null)).mo93485b(Dispatchers.m266324b(), new C36273f(str, createGroupScene, weakReference, iGetDataCallback, null));
    }

    /* renamed from: a */
    private final void m142809a(CreateGroupScene createGroupScene, CreateChatRequest createChatRequest) {
        CreateGroupExtraParams.Source source;
        CreateGroupExtraParams.IsCrypto isCrypto;
        CreateGroupExtraParams.IsSycn isSycn;
        CreateGroupExtraParams.Click click = CreateGroupExtraParams.Click.CONFIRM;
        TARGET_NONE eVar = TARGET_NONE.f135700a;
        int i = C36274g.f93564a[createGroupScene.ordinal()];
        if (i == 1) {
            source = CreateGroupExtraParams.Source.PLUS;
        } else if (i == 2) {
            source = CreateGroupExtraParams.Source.FROM_P2P;
        } else if (i == 3) {
            source = CreateGroupExtraParams.Source.FROM_INNER_GROUP;
        } else if (i == 4) {
            source = CreateGroupExtraParams.Source.FROM_FORWARD;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        Boolean bool = createChatRequest.is_crypto;
        Intrinsics.checkExpressionValueIsNotNull(bool, "request.is_crypto");
        if (bool.booleanValue()) {
            isCrypto = CreateGroupExtraParams.IsCrypto.TRUE;
        } else {
            isCrypto = CreateGroupExtraParams.IsCrypto.FALSE;
        }
        CreateGroupExtraParams.IsChangeAvatar isChangeAvatar = CreateGroupExtraParams.IsChangeAvatar.FALSE;
        CreateGroupExtraParams.IsChangeName isChangeName = CreateGroupExtraParams.IsChangeName.FALSE;
        List<String> list = createChatRequest.init_message_ids;
        Intrinsics.checkExpressionValueIsNotNull(list, "request.init_message_ids");
        if (!list.isEmpty()) {
            isSycn = CreateGroupExtraParams.IsSycn.TRUE;
        } else {
            isSycn = CreateGroupExtraParams.IsSycn.FALSE;
        }
        CreateGroupHitPointNew.f93887a.mo134196a(click.plus(eVar).plus(source).plus(isCrypto).plus(isChangeAvatar).plus(isChangeName).plus(isSycn).plus(CreateGroupExtraParams.LeaveAMessage.FALSE));
    }

    static {
        AbstractC36248c dependency = CreateGroupChatModule.getDependency();
        Intrinsics.checkExpressionValueIsNotNull(dependency, "CreateGroupChatModule.getDependency()");
        f93562b = dependency.getChatDependency();
        AbstractC36248c dependency2 = CreateGroupChatModule.getDependency();
        Intrinsics.checkExpressionValueIsNotNull(dependency2, "CreateGroupChatModule.getDependency()");
        f93563c = dependency2.getPerfEnterChatMonitor();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/larksuite/rucket/impl/base/request/RequestConfigImpl;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.a.f$c */
    public static final class C36270c extends Lambda implements Function1<RequestConfigImpl, Unit> {
        final /* synthetic */ C53253l $params;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36270c(C53253l lVar) {
            super(1);
            this.$params = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RequestConfigImpl bVar) {
            invoke(bVar);
            return Unit.INSTANCE;
        }

        public final void invoke(RequestConfigImpl bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "$receiver");
            C53253l c = bVar.mo93474c();
            c.f131606b = this.$params.f131606b;
            c.f131605a = this.$params.f131605a;
        }
    }

    /* renamed from: a */
    private final void m142811a(boolean z) {
        f93562b.mo133732a(z, "new_group");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.create.groupchat.impl.service.CreateGroupService$checkPickEntityMemberCountBeforeCreate$2", mo239173f = "CreateGroupService.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.a.f$b */
    public static final class C36269b extends SuspendLambda implements Function2<ErrorResult, Continuation<? super Unit>, Object> {
        final /* synthetic */ IGetDataCallback $callback;
        int label;
        private ErrorResult p$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36269b(IGetDataCallback iGetDataCallback, Continuation cVar) {
            super(2, cVar);
            this.$callback = iGetDataCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C36269b bVar = new C36269b(this.$callback, cVar);
            bVar.p$0 = (ErrorResult) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ErrorResult errorResult, Continuation<? super Unit> cVar) {
            return ((C36269b) create(errorResult, cVar)).invokeSuspend(Unit.INSTANCE);
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
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/pb/chats/PullChangeGroupMemberAuthorizationResponse;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.create.groupchat.impl.service.CreateGroupService$checkPickEntityMemberCountBeforeCreate$1", mo239173f = "CreateGroupService.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.a.f$a */
    public static final class C36268a extends SuspendLambda implements Function2<PullChangeGroupMemberAuthorizationResponse, Continuation<? super Unit>, Object> {
        final /* synthetic */ IGetDataCallback $callback;
        int label;
        private PullChangeGroupMemberAuthorizationResponse p$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36268a(IGetDataCallback iGetDataCallback, Continuation cVar) {
            super(2, cVar);
            this.$callback = iGetDataCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C36268a aVar = new C36268a(this.$callback, cVar);
            aVar.p$0 = (PullChangeGroupMemberAuthorizationResponse) obj;
            return aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PullChangeGroupMemberAuthorizationResponse pullChangeGroupMemberAuthorizationResponse, Continuation<? super Unit> cVar) {
            return ((C36268a) create(pullChangeGroupMemberAuthorizationResponse, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                PullChangeGroupMemberAuthorizationResponse pullChangeGroupMemberAuthorizationResponse = this.p$0;
                this.$callback.onSuccess(new Pair(pullChangeGroupMemberAuthorizationResponse.mpass, pullChangeGroupMemberAuthorizationResponse.mmsg_description));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "it", "Lcom/bytedance/lark/pb/im/v1/CreateChatResponse;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.a.f$d */
    public static final class C36271d extends Lambda implements Function1<CreateChatResponse, Chat> {
        public static final C36271d INSTANCE = new C36271d();

        C36271d() {
            super(1);
        }

        public final Chat invoke(CreateChatResponse createChatResponse) {
            Intrinsics.checkParameterIsNotNull(createChatResponse, "it");
            CreateGroupService fVar = CreateGroupService.f93561a;
            AbstractC36248c.AbstractC36252d dVar = CreateGroupService.f93562b;
            Intrinsics.checkExpressionValueIsNotNull(dVar, "chatDependency");
            return (Chat) CollectionsKt.getOrNull(CollectionsKt.toList(dVar.mo133726a().getChatMap(createChatResponse.entity.chats).values()), 0);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.create.groupchat.impl.service.CreateGroupService$createGroupChatInner$3", mo239173f = "CreateGroupService.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.a.f$e */
    public static final class C36272e extends SuspendLambda implements Function2<Chat, Continuation<? super Unit>, Object> {
        final /* synthetic */ IGetDataCallback $callback;
        final /* synthetic */ List $contactsToApply;
        final /* synthetic */ WeakReference $contextRef;
        final /* synthetic */ boolean $needOpenChat;
        final /* synthetic */ CreateGroupScene $source;
        final /* synthetic */ String $sourceTag;
        int label;
        private Chat p$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36272e(String str, WeakReference weakReference, boolean z, CreateGroupScene createGroupScene, List list, IGetDataCallback iGetDataCallback, Continuation cVar) {
            super(2, cVar);
            this.$sourceTag = str;
            this.$contextRef = weakReference;
            this.$needOpenChat = z;
            this.$source = createGroupScene;
            this.$contactsToApply = list;
            this.$callback = iGetDataCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C36272e eVar = new C36272e(this.$sourceTag, this.$contextRef, this.$needOpenChat, this.$source, this.$contactsToApply, this.$callback, cVar);
            eVar.p$0 = (Chat) obj;
            return eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Chat chat, Continuation<? super Unit> cVar) {
            return ((C36272e) create(chat, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                Chat chat = this.p$0;
                StringBuilder sb = new StringBuilder();
                sb.append(this.$sourceTag);
                sb.append(": create group success. chatId is ");
                if (chat != null) {
                    str = chat.getId();
                } else {
                    str = null;
                }
                sb.append(str);
                Log.m165389i("CreateGroupService", sb.toString());
                if (chat == null) {
                    return Unit.INSTANCE;
                }
                CreateGroupService.f93561a.mo133827a(this.$contextRef, chat, this.$needOpenChat, this.$source, this.$contactsToApply);
                IGetDataCallback iGetDataCallback = this.$callback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(chat);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.create.groupchat.impl.service.CreateGroupService$createGroupChatInner$4", mo239173f = "CreateGroupService.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.a.f$f */
    public static final class C36273f extends SuspendLambda implements Function2<ErrorResult, Continuation<? super Unit>, Object> {
        final /* synthetic */ IGetDataCallback $callback;
        final /* synthetic */ WeakReference $contextRef;
        final /* synthetic */ CreateGroupScene $source;
        final /* synthetic */ String $sourceTag;
        int label;
        private ErrorResult p$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36273f(String str, CreateGroupScene createGroupScene, WeakReference weakReference, IGetDataCallback iGetDataCallback, Continuation cVar) {
            super(2, cVar);
            this.$sourceTag = str;
            this.$source = createGroupScene;
            this.$contextRef = weakReference;
            this.$callback = iGetDataCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C36273f fVar = new C36273f(this.$sourceTag, this.$source, this.$contextRef, this.$callback, cVar);
            fVar.p$0 = (ErrorResult) obj;
            return fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ErrorResult errorResult, Continuation<? super Unit> cVar) {
            return ((C36273f) create(errorResult, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                ErrorResult errorResult = this.p$0;
                Log.m165389i("CreateGroupService", this.$sourceTag + ": create group failed. error is " + errorResult);
                CreateGroupService.f93561a.mo133826a(this.$source, this.$contextRef, errorResult);
                IGetDataCallback iGetDataCallback = this.$callback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: a */
    private final void m142808a(Chat chat, CreateGroupScene createGroupScene) {
        CreateGroupMode createGroupMode;
        if (createGroupScene == CreateGroupScene.P2P) {
            GroupHitPoint.f93889a.mo134209a(chat, "p2p_config");
        } else if (createGroupScene == CreateGroupScene.ADD_GROUP_MEMBER) {
            GroupHitPoint.f93889a.mo134209a(chat, "internal_to_external");
        } else if (chat.isPublic()) {
            if (chat.isThread()) {
                createGroupMode = CreateGroupMode.TOPIC_MODE;
            } else {
                createGroupMode = CreateGroupMode.CONVERSATION_MODE;
            }
            PublicGroupHitPoint.Companion aVar = PublicGroupHitPoint.f93891a;
            boolean isPublic = chat.isPublic();
            boolean isCrossTenant = chat.isCrossTenant();
            String description = chat.getDescription();
            Intrinsics.checkExpressionValueIsNotNull(description, "chat.description");
            aVar.mo134224a(isPublic, isCrossTenant, createGroupMode, description, Integer.valueOf(chat.getMemberCount()));
        } else {
            GroupHitPoint.f93889a.mo134208a(chat);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo133826a(com.ss.android.lark.create.groupchat.dto.CreateGroupScene r3, java.lang.ref.WeakReference<android.content.Context> r4, com.larksuite.framework.callback.Entity.ErrorResult r5) {
        /*
            r2 = this;
            r0 = 0
            r2.m142811a(r0)
            java.lang.Object r4 = r4.get()
            android.content.Context r4 = (android.content.Context) r4
            if (r4 == 0) goto L_0x0035
            java.lang.String r0 = "contextRef.get() ?: return"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r0)
            com.ss.android.lark.create.groupchat.impl.a.b r0 = com.ss.android.lark.create.groupchat.impl.service.CreateGroupErrorHandlers.f93544a
            java.util.List r0 = r0.mo133805a()
            java.util.Iterator r0 = r0.iterator()
        L_0x001b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0035
            java.lang.Object r1 = r0.next()
            kotlin.reflect.b r1 = (kotlin.reflect.KFunction) r1
            kotlin.jvm.functions.o r1 = (kotlin.jvm.functions.Function3) r1
            java.lang.Object r1 = r1.invoke(r3, r4, r5)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x001b
        L_0x0035:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.create.groupchat.impl.service.CreateGroupService.mo133826a(com.ss.android.lark.create.groupchat.dto.CreateGroupScene, java.lang.ref.WeakReference, com.larksuite.framework.callback.Entity.ErrorResult):void");
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m142807a(Chat.ChatMode chatMode, List<? extends PickChatEntity> list, Chat chat, IGetDataCallback<Pair<Boolean, String>> iGetDataCallback) {
        long j;
        String id;
        Intrinsics.checkParameterIsNotNull(chatMode, "chatMode");
        Intrinsics.checkParameterIsNotNull(list, "pickChatEntity");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        if (!CreateGroupChatModule.getDependency().isFeatureGatingEnable("im.chat.group.member.manage")) {
            iGetDataCallback.onSuccess(new Pair<>(true, ""));
        }
        PullChangeGroupMemberAuthorizationRequest.C49584a aVar = new PullChangeGroupMemberAuthorizationRequest.C49584a();
        if (chat == null || (id = chat.getId()) == null || (j = StringsKt.toLongOrNull(id)) == null) {
            j = 0L;
        }
        PullChangeGroupMemberAuthorizationRequest a = aVar.mo172886a(j).mo172885a(Chat.ChatMode.fromValue(chatMode.getNumber())).mo172887a(CreateGroupChatUtils.m142784d(list)).build();
        Intrinsics.checkExpressionValueIsNotNull(a, "request.build()");
        ((IGroupCreateService) Rucket.m95345a(IGroupCreateService.class)).mo133831a(a).mo93481a(Dispatchers.m266324b(), new C36268a(iGetDataCallback, null)).mo93485b(Dispatchers.m266324b(), new C36269b(iGetDataCallback, null));
    }

    /* renamed from: a */
    public final void mo133827a(WeakReference<Context> weakReference, com.ss.android.lark.chat.entity.chat.Chat chat, boolean z, CreateGroupScene createGroupScene, List<? extends Contact> list) {
        m142811a(false);
        m142808a(chat, createGroupScene);
        Context context = weakReference.get();
        if (z && context != null) {
            f93562b.mo133730a(context, chat.getId(), list);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m142805a(Context context, GroupCreateInfo groupCreateInfo, List<? extends PickChatEntity> list, IGetDataCallback<com.ss.android.lark.chat.entity.chat.Chat> iGetDataCallback, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(groupCreateInfo, "groupCreateInfo");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        CreateGroupParamBuilder dVar = new CreateGroupParamBuilder();
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        f93561a.m142810a("createGroupFromInputGroupInfoPage", dVar.mo133819a(list).mo133817a(groupCreateInfo.getMode()).mo133822b(groupCreateInfo.getDescription()).mo133818a(groupCreateInfo.getName()).mo133824b(groupCreateInfo.isPublic()).mo133821a(groupCreateInfo.isCrossTenant()).mo133816a(), context, z, CreateGroupScene.PLUS_MENU, CollectionsKt.emptyList(), iGetDataCallback);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m142804a(Context context, GroupCreateInfo groupCreateInfo, List<? extends SearchBaseInfo> list, IGetDataCallback<com.ss.android.lark.chat.entity.chat.Chat> iGetDataCallback, CreateGroupScene createGroupScene) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(groupCreateInfo, "groupCreateInfo");
        Intrinsics.checkParameterIsNotNull(list, "searchInfos");
        Intrinsics.checkParameterIsNotNull(createGroupScene, ShareHitPoint.f121868c);
        List<SearchBaseInfo> c = CreateGroupChatUtils.m142783c(list);
        List<SearchBaseInfo> list2 = c;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (T t : list2) {
            arrayList.add(new Contact(t.getId(), t.getAvatarKey(), t.getTitle()));
        }
        ArrayList arrayList2 = arrayList;
        Set<SearchBaseInfo> mutableSet = CollectionsKt.toMutableSet(list);
        mutableSet.removeAll(c);
        CreateGroupChatUtils aVar = CreateGroupChatUtils.f93543a;
        ArrayList arrayList3 = new ArrayList();
        for (SearchBaseInfo searchBaseInfo : mutableSet) {
            PickChatEntity a = CreateGroupChatUtils.m142779a(searchBaseInfo);
            if (a != null) {
                arrayList3.add(a);
            }
        }
        f93561a.m142810a("createGroupFromPicker", new CreateGroupParamBuilder().mo133818a(groupCreateInfo.getName()).mo133822b(groupCreateInfo.getDescription()).mo133824b(groupCreateInfo.isPublic()).mo133821a(groupCreateInfo.isCrossTenant()).mo133817a(groupCreateInfo.getMode()).mo133825c(groupCreateInfo.getFromChatId()).mo133819a(arrayList3).mo133816a(), context, groupCreateInfo.isOpenChat(), createGroupScene, arrayList2, iGetDataCallback);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m142806a(Context context, List<? extends PickChatEntity> list, List<? extends Contact> list2, String str, List<String> list3, Map<String, ? extends Map<String, ? extends DocPermPair.PermType>> map, IGetDataCallback<com.ss.android.lark.chat.entity.chat.Chat> iGetDataCallback, boolean z, CreateGroupScene createGroupScene) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "fromChatId");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        Intrinsics.checkParameterIsNotNull(createGroupScene, ShareHitPoint.f121868c);
        f93561a.m142810a("createGroupFromMessageList", new CreateGroupParamBuilder().mo133819a(list).mo133825c(str).mo133823b(list3).mo133820a(map).mo133816a(), context, z, createGroupScene, list2, iGetDataCallback);
    }
}
