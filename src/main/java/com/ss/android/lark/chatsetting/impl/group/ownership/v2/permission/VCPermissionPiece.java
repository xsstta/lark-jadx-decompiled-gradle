package com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission;

import com.bytedance.lark.pb.basic.v1.Chat;
import com.bytedance.lark.pb.im.v1.UpdateChatRequest;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.rucket.job.RucketJob;
import com.larksuite.rucket.job.base.RucketResult;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.common_view.base.SettingNavigationPiece;
import com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingNavigationPiece;
import com.ss.android.lark.chatsetting.impl.common_view.chatsetting.OnDialogSelectedAction;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingHitPointNew;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0014J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\b\u0010\u000f\u001a\u00020\tH\u0014J\b\u0010\u0010\u001a\u00020\tH\u0014J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/v2/permission/VCPermissionPiece;", "Lcom/ss/android/lark/chatsetting/impl/common_view/chatsetting/ChatSettingNavigationPiece;", "()V", "isVcEnable", "", "isContentViewVisible", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "itemType", "", "onChatChanged", "", "onClick", "sendItemClickEvent", "isManage", "subtitleRes", "titleRes", "updatePermission", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class VCPermissionPiece extends ChatSettingNavigationPiece {

    /* renamed from: a */
    private final boolean f90097a = ChatSettingModule.m133639a().mo127268a("im.chat.setting.only.admin.can.vc");

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.common_view.base.SettingBasePiece
    /* renamed from: f */
    public int mo127635f() {
        return 37;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.common_view.base.SettingNavigationPiece
    /* renamed from: j */
    public int mo127642j() {
        return R.string.Lark_GroupManagement_StartVideoCalls;
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
        mo127666a(C51468a.m199493c(R.string.Lark_GroupManagement_StartVideoCalls, mo177180C()), new C34910a(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/v2/permission/VCPermissionPiece$onClick$1", "Lcom/ss/android/lark/chatsetting/impl/common_view/chatsetting/OnDialogSelectedAction;", "onSelected", "", "isManage", "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission.VCPermissionPiece$a */
    public static final class C34910a implements OnDialogSelectedAction {

        /* renamed from: a */
        final /* synthetic */ VCPermissionPiece f90098a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34910a(VCPermissionPiece vCPermissionPiece) {
            this.f90098a = vCPermissionPiece;
        }

        @Override // com.ss.android.lark.chatsetting.impl.common_view.chatsetting.OnDialogSelectedAction
        /* renamed from: a */
        public void mo127681a(boolean z) {
            this.f90098a.mo128712d(z);
            this.f90098a.mo128711c(z);
        }
    }

    /* renamed from: d */
    public final void mo128712d(boolean z) {
        ChatSettingHitPointNew.ManagePermissionParams managePermissionParams;
        if (z) {
            managePermissionParams = ChatSettingHitPointNew.ManagePermissionParams.ONLY_GROUP_OWNER_AND_ADMIN;
        } else {
            managePermissionParams = ChatSettingHitPointNew.ManagePermissionParams.ALL;
        }
        ChatSettingHitPointNew.m136624a(ChatSettingHitPointNew.GroupManageParam.VC_RESTRICTION, managePermissionParams);
    }

    @Override // com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingNavigationPiece
    /* renamed from: a */
    public void mo127665a(Chat chat) {
        int i;
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        super.mo127665a(chat);
        if (chat.getCreateVideoConferenceSetting() == Chat.CreateVideoConferenceSetting.ONLY_MANAGER) {
            i = R.string.Lark_GroupManagement_OnlyGroupOwnerAndGroupAdmin;
        } else {
            i = R.string.Lark_GroupManagement_EveryoneInThisGroup;
        }
        SettingNavigationPiece.m134140a(this, null, C51468a.m199493c(i, mo177180C()), null, 0, 13, null);
    }

    @Override // com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingNavigationPiece
    /* renamed from: b */
    public boolean mo127667b(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        if (!this.f90097a || chat.isSecret() || chat.isOnCall() || chat.isCustomerService() || chat.isSuper() || chat.isThread()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final void mo128711c(boolean z) {
        String str;
        Chat n = mo127670n();
        if (n == null || (str = n.getId()) == null) {
            str = "";
        }
        Intrinsics.checkExpressionValueIsNotNull(str, "getChat()?.getId() ?: \"\"");
        Job unused = C69553g.m266944a(this, null, null, new C34911b(this, z, str, null), 3, null);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission.VCPermissionPiece$updatePermission$1", mo239173f = "VCPermissionPiece.kt", mo239174i = {0, 0, 0}, mo239175l = {71}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "permission", "builder"}, mo239178s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission.VCPermissionPiece$b */
    public static final class C34911b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $chatId;
        final /* synthetic */ boolean $isManage;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ VCPermissionPiece this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34911b(VCPermissionPiece vCPermissionPiece, boolean z, String str, Continuation cVar) {
            super(2, cVar);
            this.this$0 = vCPermissionPiece;
            this.$isManage = z;
            this.$chatId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C34911b bVar = new C34911b(this.this$0, this.$isManage, this.$chatId, cVar);
            bVar.p$ = (CoroutineScope) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C34911b) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Chat.CreateVideoConferenceSetting.Enum r1;
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                if (this.$isManage) {
                    r1 = Chat.CreateVideoConferenceSetting.Enum.ONLY_MANAGER;
                } else {
                    r1 = Chat.CreateVideoConferenceSetting.Enum.ALL_MEMBERS;
                }
                UpdateChatRequest.C18137a a2 = new UpdateChatRequest.C18137a().mo62912a(this.$chatId).mo62902a(r1);
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
                Chat.CreateVideoConferenceSetting.Enum r0 = (Chat.CreateVideoConferenceSetting.Enum) this.L$1;
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RucketResult bVar2 = (RucketResult) obj;
            if (!(bVar2 instanceof RucketResult.Success) && (bVar2 instanceof RucketResult.Error)) {
                UDToast.show(this.this$0.mo177180C(), (int) R.string.Lark_Legacy_RecallMessageErr);
            }
            return Unit.INSTANCE;
        }
    }
}
