package com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission;

import com.bytedance.lark.pb.basic.v1.Chat;
import com.bytedance.lark.pb.im.v1.UpdateChatRequest;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.rucket.job.RucketJob;
import com.larksuite.rucket.job.base.RucketResult;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.impl.common_view.base.SettingNavigationPiece;
import com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingNavigationPiece;
import com.ss.android.lark.chatsetting.impl.common_view.chatsetting.OnDialogSelectedAction;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingHitPointNew;
import com.ss.android.lark.chatsetting.impl.statistics.ownership.OwnershipHitPoint;
import com.ss.android.lark.chatsetting.service.ChatSettingService;
import com.ss.android.lark.piece.p2465b.C51468a;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\u0004H\u0014J\b\u0010\u000e\u001a\u00020\u0004H\u0014J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0002¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/v2/permission/AtAllPermissionPiece;", "Lcom/ss/android/lark/chatsetting/impl/common_view/chatsetting/ChatSettingNavigationPiece;", "()V", "itemType", "", "onChatChanged", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onClick", "sendItemClickHitPoint", "isManage", "", "subtitleRes", "titleRes", "updateConfigAtAllPermission", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AtAllPermissionPiece extends ChatSettingNavigationPiece {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.common_view.base.SettingBasePiece
    /* renamed from: f */
    public int mo127635f() {
        return 20;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.common_view.base.SettingNavigationPiece
    /* renamed from: j */
    public int mo127642j() {
        return R.string.Lark_GroupManagement_WhoCanAtAll;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.common_view.base.SettingNavigationPiece
    /* renamed from: k */
    public int mo127645k() {
        return R.string.Lark_GroupManagement_EveryoneInThisGroup;
    }

    @Override // com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingNavigationPiece
    /* renamed from: m */
    public void mo127669m() {
        mo127666a(C51468a.m199493c(R.string.Lark_GroupManagement_WhoCanAtAll, mo177180C()), new C34893a(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/v2/permission/AtAllPermissionPiece$onClick$1", "Lcom/ss/android/lark/chatsetting/impl/common_view/chatsetting/OnDialogSelectedAction;", "onSelected", "", "isManage", "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission.AtAllPermissionPiece$a */
    public static final class C34893a implements OnDialogSelectedAction {

        /* renamed from: a */
        final /* synthetic */ AtAllPermissionPiece f90079a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34893a(AtAllPermissionPiece atAllPermissionPiece) {
            this.f90079a = atAllPermissionPiece;
        }

        @Override // com.ss.android.lark.chatsetting.impl.common_view.chatsetting.OnDialogSelectedAction
        /* renamed from: a */
        public void mo127681a(boolean z) {
            this.f90079a.mo128698c(z);
            Chat n = this.f90079a.mo127670n();
            if (n != null) {
                this.f90079a.mo128697a(n, z);
            }
        }
    }

    /* renamed from: c */
    public final void mo128698c(boolean z) {
        ChatSettingHitPointNew.ManagePermissionParams managePermissionParams;
        if (z) {
            managePermissionParams = ChatSettingHitPointNew.ManagePermissionParams.ONLY_GROUP_OWNER_AND_ADMIN;
        } else {
            managePermissionParams = ChatSettingHitPointNew.ManagePermissionParams.ALL;
        }
        ChatSettingHitPointNew.m136624a(ChatSettingHitPointNew.GroupManageParam.MENTION_ALL_MEMBER, managePermissionParams);
    }

    @Override // com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingNavigationPiece
    /* renamed from: a */
    public void mo127665a(Chat chat) {
        int i;
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        super.mo127665a(chat);
        if (chat.getAtAllPermission() == Chat.AtAllPermission.ONLY_OWNER) {
            i = R.string.Lark_GroupManagement_OnlyGroupOwnerAndGroupAdmin;
        } else {
            i = R.string.Lark_GroupManagement_EveryoneInThisGroup;
        }
        SettingNavigationPiece.m134140a(this, null, C51468a.m199493c(i, mo177180C()), null, 0, 13, null);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission.AtAllPermissionPiece$updateConfigAtAllPermission$1", mo239173f = "AtAllPermissionPiece.kt", mo239174i = {0, 0, 0}, mo239175l = {64}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "permission", "builder"}, mo239178s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission.AtAllPermissionPiece$b */
    public static final class C34894b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $chatId;
        final /* synthetic */ boolean $isManage;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ AtAllPermissionPiece this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34894b(AtAllPermissionPiece atAllPermissionPiece, boolean z, String str, Continuation cVar) {
            super(2, cVar);
            this.this$0 = atAllPermissionPiece;
            this.$isManage = z;
            this.$chatId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C34894b bVar = new C34894b(this.this$0, this.$isManage, this.$chatId, cVar);
            bVar.p$ = (CoroutineScope) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C34894b) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Chat.AtAllPermission.Enum r1;
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                if (this.$isManage) {
                    r1 = Chat.AtAllPermission.Enum.ONLY_OWNER;
                } else {
                    r1 = Chat.AtAllPermission.Enum.ALL_MEMBERS;
                }
                UpdateChatRequest.C18137a a2 = new UpdateChatRequest.C18137a().mo62912a(this.$chatId).mo62900a(r1);
                ChatSettingService bVar = ChatSettingService.f88988a;
                Intrinsics.checkExpressionValueIsNotNull(a2, "builder");
                RucketJob<com.ss.android.lark.chat.entity.chat.Chat> a3 = bVar.mo127456a(a2);
                this.L$0 = ahVar;
                this.L$1 = r1;
                this.L$2 = a2;
                this.label = 1;
                obj = a3.mo93484a(this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                UpdateChatRequest.C18137a aVar = (UpdateChatRequest.C18137a) this.L$2;
                Chat.AtAllPermission.Enum r0 = (Chat.AtAllPermission.Enum) this.L$1;
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RucketResult bVar2 = (RucketResult) obj;
            if (!(bVar2 instanceof RucketResult.Success) && (bVar2 instanceof RucketResult.Error)) {
                UDToast.show(this.this$0.mo177180C(), (int) R.string.Lark_Legacy_UpdateOwnerAtAllStateFailed);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public final void mo128697a(com.ss.android.lark.chat.entity.chat.Chat chat, boolean z) {
        OwnershipHitPoint.Companion aVar = OwnershipHitPoint.f90525a;
        int memberCount = chat.getMemberCount();
        String id = chat.getId();
        Intrinsics.checkExpressionValueIsNotNull(id, "chat.getId()");
        aVar.mo129283a(2, z, memberCount, id);
        String id2 = chat.getId();
        Intrinsics.checkExpressionValueIsNotNull(id2, "chat.getId()");
        Job unused = C69553g.m266944a(this, null, null, new C34894b(this, z, id2, null), 3, null);
    }
}
