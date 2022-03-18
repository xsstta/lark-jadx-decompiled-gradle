package com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission;

import android.content.DialogInterface;
import com.bytedance.lark.pb.basic.v1.Chat;
import com.bytedance.lark.pb.im.v1.UpdateChatRequest;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.rucket.job.RucketJob;
import com.larksuite.rucket.job.base.RucketResult;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.C34501a;
import com.ss.android.lark.chatsetting.impl.common_view.base.SettingNavigationPiece;
import com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingNavigationPiece;
import com.ss.android.lark.chatsetting.impl.common_view.chatsetting.OnDialogSelectedAction;
import com.ss.android.lark.chatsetting.impl.p1698b.C34526a;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingHitPointNew;
import com.ss.android.lark.chatsetting.impl.statistics.ownership.OwnershipHitPoint;
import com.ss.android.lark.chatsetting.service.ChatSettingService;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0014J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\u0011\u001a\u00020\nH\u0014J\b\u0010\u0012\u001a\u00020\nH\u0014J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/v2/permission/AddAndSharePermissionPiece;", "Lcom/ss/android/lark/chatsetting/impl/common_view/chatsetting/ChatSettingNavigationPiece;", "()V", "mIsGroupSearchEnable", "", "mIsTeamEnable", "isContentViewVisible", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "itemType", "", "onChatChanged", "", "onClick", "sendItemSelectedEvent", "isManage", "showAddAndShareConfirmDialog", "subtitleRes", "titleRes", "updatePermission", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AddAndSharePermissionPiece extends ChatSettingNavigationPiece {

    /* renamed from: a */
    public final boolean f90071a = ChatSettingModule.m133639a().mo127268a("im.chat.searchable.group");

    /* renamed from: b */
    private final boolean f90072b = C34501a.m133933a();

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.common_view.base.SettingBasePiece
    /* renamed from: f */
    public int mo127635f() {
        return 27;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.common_view.base.SettingNavigationPiece
    /* renamed from: j */
    public int mo127642j() {
        return R.string.Lark_GroupManagement_ManageGroupMembersShareGroup;
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
        mo127666a(C51468a.m199493c(R.string.Lark_GroupManagement_ManageGroupMembersShareGroup, mo177180C()), new C34888a(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/v2/permission/AddAndSharePermissionPiece$onClick$1", "Lcom/ss/android/lark/chatsetting/impl/common_view/chatsetting/OnDialogSelectedAction;", "onSelected", "", "isManage", "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission.AddAndSharePermissionPiece$a */
    public static final class C34888a implements OnDialogSelectedAction {

        /* renamed from: a */
        final /* synthetic */ AddAndSharePermissionPiece f90073a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34888a(AddAndSharePermissionPiece addAndSharePermissionPiece) {
            this.f90073a = addAndSharePermissionPiece;
        }

        @Override // com.ss.android.lark.chatsetting.impl.common_view.chatsetting.OnDialogSelectedAction
        /* renamed from: a */
        public void mo127681a(boolean z) {
            this.f90073a.mo128693c(z);
            Chat n = this.f90073a.mo127670n();
            if (n != null) {
                boolean isPublic = n.isPublic();
                if (!z || !isPublic || !this.f90073a.f90071a) {
                    this.f90073a.mo128692a(z, n);
                } else {
                    this.f90073a.mo128694d(n);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo128693c(boolean z) {
        ChatSettingHitPointNew.ManagePermissionParams managePermissionParams;
        if (z) {
            managePermissionParams = ChatSettingHitPointNew.ManagePermissionParams.ONLY_GROUP_OWNER_AND_ADMIN;
        } else {
            managePermissionParams = ChatSettingHitPointNew.ManagePermissionParams.ALL;
        }
        ChatSettingHitPointNew.m136624a(ChatSettingHitPointNew.GroupManageParam.ADD_MEMBER_SHARE_GROUP, managePermissionParams);
    }

    @Override // com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingNavigationPiece
    /* renamed from: b */
    public boolean mo127667b(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        if (chat.isPublic() && !this.f90071a) {
            return false;
        }
        if (!this.f90072b || !C34526a.m134091b(chat)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingNavigationPiece
    /* renamed from: a */
    public void mo127665a(Chat chat) {
        boolean z;
        int i;
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        super.mo127665a(chat);
        if (chat.getAddMemberPermission() == Chat.AddMemberPermission.ALL_MEMBERS && chat.getShareCardPermission() == Chat.ShareCardPermission.ALLOWED) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = R.string.Lark_GroupManagement_EveryoneInThisGroup;
        } else {
            i = R.string.Lark_GroupManagement_OnlyGroupOwnerAndGroupAdmin;
        }
        SettingNavigationPiece.m134140a(this, null, C51468a.m199493c(i, mo177180C()), null, 0, 13, null);
    }

    /* renamed from: d */
    public final void mo128694d(Chat chat) {
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(mo177180C()).message(R.string.Lark_Group_MustTurnOnBothTitle)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_Group_MustTurnOnBothButton, new DialogInterface$OnClickListenerC34889b(this, chat))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Lark_Group_Cancel, (DialogInterface.OnClickListener) null)).show();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission.AddAndSharePermissionPiece$updatePermission$1", mo239173f = "AddAndSharePermissionPiece.kt", mo239174i = {0, 0, 0, 0}, mo239175l = {SmActions.ACTION_INIT_ENTRY}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "builder", "addPermission", "sharePermission"}, mo239178s = {"L$0", "L$1", "L$2", "L$3"})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission.AddAndSharePermissionPiece$c */
    public static final class C34890c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Chat $chat;
        final /* synthetic */ boolean $isManage;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ AddAndSharePermissionPiece this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34890c(AddAndSharePermissionPiece addAndSharePermissionPiece, Chat chat, boolean z, Continuation cVar) {
            super(2, cVar);
            this.this$0 = addAndSharePermissionPiece;
            this.$chat = chat;
            this.$isManage = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C34890c cVar2 = new C34890c(this.this$0, this.$chat, this.$isManage, cVar);
            cVar2.p$ = (CoroutineScope) obj;
            return cVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C34890c) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Chat.AddMemberPermission.Enum r3;
            Chat.ShareCardPermission.Enum r4;
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                UpdateChatRequest.C18137a a2 = new UpdateChatRequest.C18137a().mo62912a(this.$chat.getId());
                if (this.$isManage) {
                    r3 = Chat.AddMemberPermission.Enum.ONLY_OWNER;
                } else {
                    r3 = Chat.AddMemberPermission.Enum.ALL_MEMBERS;
                }
                a2.mo62898a(r3);
                if (this.$isManage) {
                    r4 = Chat.ShareCardPermission.Enum.NOT_ALLOWED;
                } else {
                    r4 = Chat.ShareCardPermission.Enum.ALLOWED;
                }
                a2.mo62906a(r4);
                if (this.this$0.f90071a && this.$isManage && this.$chat.isPublic()) {
                    a2.mo62921e(C69089a.m265837a(false));
                }
                ChatSettingService bVar = ChatSettingService.f88988a;
                Intrinsics.checkExpressionValueIsNotNull(a2, "builder");
                RucketJob<com.ss.android.lark.chat.entity.chat.Chat> a3 = bVar.mo127456a(a2);
                this.L$0 = ahVar;
                this.L$1 = a2;
                this.L$2 = r3;
                this.L$3 = r4;
                this.label = 1;
                obj = a3.mo93484a(this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                Chat.ShareCardPermission.Enum r0 = (Chat.ShareCardPermission.Enum) this.L$3;
                Chat.AddMemberPermission.Enum r02 = (Chat.AddMemberPermission.Enum) this.L$2;
                UpdateChatRequest.C18137a aVar = (UpdateChatRequest.C18137a) this.L$1;
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RucketResult bVar2 = (RucketResult) obj;
            if (!(bVar2 instanceof RucketResult.Success) && (bVar2 instanceof RucketResult.Error)) {
                UDToast.show(this.this$0.mo177180C(), (int) R.string.Lark_Legacy_UpdateMemberCanShareFailed);
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission.AddAndSharePermissionPiece$b */
    public static final class DialogInterface$OnClickListenerC34889b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AddAndSharePermissionPiece f90074a;

        /* renamed from: b */
        final /* synthetic */ com.ss.android.lark.chat.entity.chat.Chat f90075b;

        DialogInterface$OnClickListenerC34889b(AddAndSharePermissionPiece addAndSharePermissionPiece, com.ss.android.lark.chat.entity.chat.Chat chat) {
            this.f90074a = addAndSharePermissionPiece;
            this.f90075b = chat;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f90074a.mo128692a(true, this.f90075b);
        }
    }

    /* renamed from: a */
    public final void mo128692a(boolean z, com.ss.android.lark.chat.entity.chat.Chat chat) {
        OwnershipHitPoint.Companion aVar = OwnershipHitPoint.f90525a;
        int memberCount = chat.getMemberCount();
        String id = chat.getId();
        Intrinsics.checkExpressionValueIsNotNull(id, "chat.getId()");
        aVar.mo129283a(1, z, memberCount, id);
        Job unused = C69553g.m266944a(this, null, null, new C34890c(this, chat, z, null), 3, null);
    }
}
