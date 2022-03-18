package com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission;

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
import kotlin.coroutines.jvm.internal.C69089a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0014J\b\u0010\u000f\u001a\u00020\u0004H\u0014¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/v2/permission/EditGroupInfoPermissionPiece;", "Lcom/ss/android/lark/chatsetting/impl/common_view/chatsetting/ChatSettingNavigationPiece;", "()V", "itemType", "", "onChatChanged", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onClick", "onItemSelected", "isManage", "", "sendItemClickHitPoint", "subtitleRes", "titleRes", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class EditGroupInfoPermissionPiece extends ChatSettingNavigationPiece {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.common_view.base.SettingBasePiece
    /* renamed from: f */
    public int mo127635f() {
        return 19;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.common_view.base.SettingNavigationPiece
    /* renamed from: j */
    public int mo127642j() {
        return R.string.Lark_GroupManagement_EditGroupInfo;
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
        mo127666a(C51468a.m199493c(R.string.Lark_GroupManagement_EditGroupInfo, mo177180C()), new C34897a(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/v2/permission/EditGroupInfoPermissionPiece$onClick$1", "Lcom/ss/android/lark/chatsetting/impl/common_view/chatsetting/OnDialogSelectedAction;", "onSelected", "", "isManage", "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission.EditGroupInfoPermissionPiece$a */
    public static final class C34897a implements OnDialogSelectedAction {

        /* renamed from: a */
        final /* synthetic */ EditGroupInfoPermissionPiece f90082a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34897a(EditGroupInfoPermissionPiece editGroupInfoPermissionPiece) {
            this.f90082a = editGroupInfoPermissionPiece;
        }

        @Override // com.ss.android.lark.chatsetting.impl.common_view.chatsetting.OnDialogSelectedAction
        /* renamed from: a */
        public void mo127681a(boolean z) {
            this.f90082a.mo128702d(z);
            this.f90082a.mo128701c(z);
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingNavigationPiece
    /* renamed from: a */
    public void mo127665a(Chat chat) {
        int i;
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        super.mo127665a(chat);
        if (chat.isOnlyOwnerEditGroupInfo()) {
            i = R.string.Lark_GroupManagement_OnlyGroupOwnerAndGroupAdmin;
        } else {
            i = R.string.Lark_GroupManagement_EveryoneInThisGroup;
        }
        SettingNavigationPiece.m134140a(this, null, C51468a.m199493c(i, mo177180C()), null, 0, 13, null);
    }

    /* renamed from: c */
    public final void mo128701c(boolean z) {
        String str;
        Chat n = mo127670n();
        if (n == null || (str = n.getId()) == null) {
            str = "";
        }
        Intrinsics.checkExpressionValueIsNotNull(str, "getChat()?.getId() ?: \"\"");
        Job unused = C69553g.m266944a(this, null, null, new C34898b(this, str, z, null), 3, null);
    }

    /* renamed from: d */
    public final void mo128702d(boolean z) {
        ChatSettingHitPointNew.ManagePermissionParams managePermissionParams;
        int i;
        String str;
        if (z) {
            managePermissionParams = ChatSettingHitPointNew.ManagePermissionParams.ONLY_GROUP_OWNER_AND_ADMIN;
        } else {
            managePermissionParams = ChatSettingHitPointNew.ManagePermissionParams.ALL;
        }
        ChatSettingHitPointNew.m136624a(ChatSettingHitPointNew.GroupManageParam.EDIT_GROUP_INFO, managePermissionParams);
        OwnershipHitPoint.Companion aVar = OwnershipHitPoint.f90525a;
        Chat n = mo127670n();
        if (n != null) {
            i = n.getMemberCount();
        } else {
            i = 0;
        }
        Chat n2 = mo127670n();
        if (n2 == null || (str = n2.getId()) == null) {
            str = "";
        }
        aVar.mo129283a(0, z, i, str);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission.EditGroupInfoPermissionPiece$onItemSelected$1", mo239173f = "EditGroupInfoPermissionPiece.kt", mo239174i = {0, 0}, mo239175l = {54}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "builder"}, mo239178s = {"L$0", "L$1"})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission.EditGroupInfoPermissionPiece$b */
    public static final class C34898b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $chatId;
        final /* synthetic */ boolean $isManage;
        Object L$0;
        Object L$1;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ EditGroupInfoPermissionPiece this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34898b(EditGroupInfoPermissionPiece editGroupInfoPermissionPiece, String str, boolean z, Continuation cVar) {
            super(2, cVar);
            this.this$0 = editGroupInfoPermissionPiece;
            this.$chatId = str;
            this.$isManage = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C34898b bVar = new C34898b(this.this$0, this.$chatId, this.$isManage, cVar);
            bVar.p$ = (CoroutineScope) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C34898b) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                UpdateChatRequest.C18137a b = new UpdateChatRequest.C18137a().mo62912a(this.$chatId).mo62915b(C69089a.m265837a(this.$isManage));
                ChatSettingService bVar = ChatSettingService.f88988a;
                Intrinsics.checkExpressionValueIsNotNull(b, "builder");
                RucketJob<Chat> a2 = bVar.mo127456a(b);
                this.L$0 = ahVar;
                this.L$1 = b;
                this.label = 1;
                obj = a2.mo93484a(this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                UpdateChatRequest.C18137a aVar = (UpdateChatRequest.C18137a) this.L$1;
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RucketResult bVar2 = (RucketResult) obj;
            if (!(bVar2 instanceof RucketResult.Success) && (bVar2 instanceof RucketResult.Error)) {
                UDToast.show(this.this$0.mo177180C(), (int) R.string.Lark_Legacy_UpdateOwnerEditInfoStateFailed);
            }
            return Unit.INSTANCE;
        }
    }
}
