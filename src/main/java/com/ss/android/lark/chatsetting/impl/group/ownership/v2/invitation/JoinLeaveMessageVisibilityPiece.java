package com.ss.android.lark.chatsetting.impl.group.ownership.v2.invitation;

import android.content.Context;
import com.bytedance.lark.pb.basic.v1.Chat;
import com.bytedance.lark.pb.im.v1.UpdateChatRequest;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.rucket.job.RucketJob;
import com.larksuite.rucket.job.base.RucketResult;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.impl.common_view.base.SettingNavigationPiece;
import com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingNavigationPiece;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingHitPointNew;
import com.ss.android.lark.chatsetting.impl.statistics.ownership.OwnershipHitPoint;
import com.ss.android.lark.chatsetting.service.ChatSettingService;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.p2932c.C58339d;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.ArrayList;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016J \u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/v2/invitation/JoinLeaveMessageVisibilityPiece;", "Lcom/ss/android/lark/chatsetting/impl/common_view/chatsetting/ChatSettingNavigationPiece;", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chatsetting/impl/group/ownership/v2/invitation/Type;", "(Lcom/ss/android/lark/chatsetting/impl/group/ownership/v2/invitation/Type;)V", "logMessageVisibilityChangeEvent", "", "messageVisibility", "Lcom/ss/android/lark/chat/entity/chat/Chat$SystemMessageVisible;", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "statusParams", "Lcom/ss/android/lark/chatsetting/impl/statistics/ChatSettingHitPointNew$ManagePermissionParams;", "onChatChanged", "onClick", "updateMessageVisibility", "visibility", "permission", "Companion", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class JoinLeaveMessageVisibilityPiece extends ChatSettingNavigationPiece {

    /* renamed from: a */
    public static final Companion f90051a = new Companion(null);

    /* renamed from: b */
    private final Type f90052b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onMenuItemClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.invitation.JoinLeaveMessageVisibilityPiece$e */
    static final class C34882e implements C58339d.AbstractC58343b {

        /* renamed from: a */
        public static final C34882e f90062a = new C34882e();

        C34882e() {
        }

        @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
        public final void onMenuItemClick() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/v2/invitation/JoinLeaveMessageVisibilityPiece$Companion;", "", "()V", "TAG", "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.invitation.JoinLeaveMessageVisibilityPiece$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "onMenuItemClick", "com/ss/android/lark/chatsetting/impl/group/ownership/v2/invitation/JoinLeaveMessageVisibilityPiece$onClick$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.invitation.JoinLeaveMessageVisibilityPiece$b */
    static final class C34879b implements C58339d.AbstractC58343b {

        /* renamed from: a */
        final /* synthetic */ JoinLeaveMessageVisibilityPiece f90053a;

        /* renamed from: b */
        final /* synthetic */ Context f90054b;

        /* renamed from: c */
        final /* synthetic */ Chat f90055c;

        C34879b(JoinLeaveMessageVisibilityPiece joinLeaveMessageVisibilityPiece, Context context, Chat chat) {
            this.f90053a = joinLeaveMessageVisibilityPiece;
            this.f90054b = context;
            this.f90055c = chat;
        }

        @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
        public final void onMenuItemClick() {
            this.f90053a.mo128687a(Chat.SystemMessageVisible.ALL_MEMBERS, this.f90055c, ChatSettingHitPointNew.ManagePermissionParams.ALL);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "onMenuItemClick", "com/ss/android/lark/chatsetting/impl/group/ownership/v2/invitation/JoinLeaveMessageVisibilityPiece$onClick$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.invitation.JoinLeaveMessageVisibilityPiece$c */
    static final class C34880c implements C58339d.AbstractC58343b {

        /* renamed from: a */
        final /* synthetic */ JoinLeaveMessageVisibilityPiece f90056a;

        /* renamed from: b */
        final /* synthetic */ Context f90057b;

        /* renamed from: c */
        final /* synthetic */ Chat f90058c;

        C34880c(JoinLeaveMessageVisibilityPiece joinLeaveMessageVisibilityPiece, Context context, Chat chat) {
            this.f90056a = joinLeaveMessageVisibilityPiece;
            this.f90057b = context;
            this.f90058c = chat;
        }

        @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
        public final void onMenuItemClick() {
            this.f90056a.mo128687a(Chat.SystemMessageVisible.ONLY_OWNER, this.f90058c, ChatSettingHitPointNew.ManagePermissionParams.ONLY_GROUP_OWNER_AND_ADMIN);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "onMenuItemClick", "com/ss/android/lark/chatsetting/impl/group/ownership/v2/invitation/JoinLeaveMessageVisibilityPiece$onClick$1$3"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.invitation.JoinLeaveMessageVisibilityPiece$d */
    static final class C34881d implements C58339d.AbstractC58343b {

        /* renamed from: a */
        final /* synthetic */ JoinLeaveMessageVisibilityPiece f90059a;

        /* renamed from: b */
        final /* synthetic */ Context f90060b;

        /* renamed from: c */
        final /* synthetic */ Chat f90061c;

        C34881d(JoinLeaveMessageVisibilityPiece joinLeaveMessageVisibilityPiece, Context context, Chat chat) {
            this.f90059a = joinLeaveMessageVisibilityPiece;
            this.f90060b = context;
            this.f90061c = chat;
        }

        @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
        public final void onMenuItemClick() {
            this.f90059a.mo128687a(Chat.SystemMessageVisible.NOT_ANYONE, this.f90061c, ChatSettingHitPointNew.ManagePermissionParams.NOBODY);
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingNavigationPiece
    /* renamed from: m */
    public void mo127669m() {
        int i;
        Chat n = mo127670n();
        if (n != null) {
            Context C = mo177180C();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C58339d.C58341a(C51468a.m199493c(R.string.Lark_Legacy_NotifyAllGroupMembers, C), new C34879b(this, C, n)));
            if (!n.isSuper()) {
                arrayList.add(new C58339d.C58341a(C51468a.m199493c(R.string.Lark_Legacy_OnlyGOGANotified, C), new C34880c(this, C, n)));
            }
            arrayList.add(new C58339d.C58341a(C51468a.m199493c(R.string.Lark_Legacy_GroupSettingNotifyNone, C), new C34881d(this, C, n)));
            arrayList.add(new C58339d.C58341a(C51468a.m199493c(R.string.Lark_Legacy_Cancel, C), C34882e.f90062a));
            if (this.f90052b == Type.LEAVE_CHAT) {
                i = R.string.Lark_GroupManagement_WhoWIllBeNotifiedLeave;
            } else {
                i = R.string.Lark_GroupManagement_WhoWIllBeNotifiedForNewMembers;
            }
            C58339d.m226196a(mo177180C(), arrayList, UIUtils.getString(mo177180C(), i));
        }
    }

    public JoinLeaveMessageVisibilityPiece(Type type) {
        Intrinsics.checkParameterIsNotNull(type, ShareHitPoint.f121869d);
        this.f90052b = type;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.chatsetting.impl.group.ownership.v2.invitation.JoinLeaveMessageVisibilityPiece$updateMessageVisibility$1", mo239173f = "JoinLeaveMessageVisibilityPiece.kt", mo239174i = {0}, mo239175l = {SmEvents.EVENT_NT}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.invitation.JoinLeaveMessageVisibilityPiece$f */
    public static final class C34883f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UpdateChatRequest.C18137a $requestBuilder;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ JoinLeaveMessageVisibilityPiece this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34883f(JoinLeaveMessageVisibilityPiece joinLeaveMessageVisibilityPiece, UpdateChatRequest.C18137a aVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = joinLeaveMessageVisibilityPiece;
            this.$requestBuilder = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C34883f fVar = new C34883f(this.this$0, this.$requestBuilder, cVar);
            fVar.p$ = (CoroutineScope) obj;
            return fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C34883f) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                ChatSettingService bVar = ChatSettingService.f88988a;
                UpdateChatRequest.C18137a aVar = this.$requestBuilder;
                Intrinsics.checkExpressionValueIsNotNull(aVar, "requestBuilder");
                RucketJob<Chat> a2 = bVar.mo127456a(aVar);
                this.L$0 = ahVar;
                this.label = 1;
                obj = a2.mo93484a(this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RucketResult bVar2 = (RucketResult) obj;
            if (!(bVar2 instanceof RucketResult.Success) && (bVar2 instanceof RucketResult.Error)) {
                RucketResult.Error bVar3 = (RucketResult.Error) bVar2;
                Log.m165383e("JoinLeaveMessageVisibilityPiece", String.valueOf(bVar3.mo93493c()));
                String displayMsg = bVar3.mo93493c().getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_RecallMessageErr));
                Context C = this.this$0.mo177180C();
                Intrinsics.checkExpressionValueIsNotNull(displayMsg, "toastMessage");
                UDToast.show(C, displayMsg);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingNavigationPiece
    /* renamed from: a */
    public void mo127665a(Chat chat) {
        boolean z;
        int i;
        Chat.SystemMessageVisible systemMessageVisible;
        int i2;
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        super.mo127665a(chat);
        if (this.f90052b == Type.LEAVE_CHAT) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = R.string.Lark_GroupManagement_WhoWIllBeNotifiedLeave;
        } else {
            i = R.string.Lark_GroupManagement_WhoWIllBeNotifiedForNewMembers;
        }
        if (z) {
            systemMessageVisible = chat.getQuitMessageVisible();
        } else {
            systemMessageVisible = chat.getJoinMessageVisible();
        }
        if (systemMessageVisible != null) {
            int i3 = C34885a.f90064a[systemMessageVisible.ordinal()];
            if (i3 == 1) {
                i2 = R.string.Lark_Legacy_NotifyAllGroupMembers;
            } else if (i3 == 2) {
                i2 = R.string.Lark_Legacy_OnlyGOGANotified;
            }
            SettingNavigationPiece.m134140a(this, C51468a.m199493c(i, mo177180C()), C51468a.m199493c(i2, mo177180C()), null, 0, 12, null);
        }
        i2 = R.string.Lark_Legacy_GroupSettingNotifyNone;
        SettingNavigationPiece.m134140a(this, C51468a.m199493c(i, mo177180C()), C51468a.m199493c(i2, mo177180C()), null, 0, 12, null);
    }

    /* renamed from: b */
    private final void m135705b(Chat.SystemMessageVisible systemMessageVisible, Chat chat, ChatSettingHitPointNew.ManagePermissionParams managePermissionParams) {
        boolean z;
        ChatSettingHitPointNew.GroupManageParam groupManageParam;
        OwnershipHitPoint.Companion aVar = OwnershipHitPoint.f90525a;
        if (this.f90052b == Type.LEAVE_CHAT) {
            z = true;
        } else {
            z = false;
        }
        int memberCount = chat.getMemberCount();
        String id = chat.getId();
        Intrinsics.checkExpressionValueIsNotNull(id, "chat.getId()");
        aVar.mo129289a(z, systemMessageVisible, memberCount, id);
        if (this.f90052b == Type.LEAVE_CHAT) {
            groupManageParam = ChatSettingHitPointNew.GroupManageParam.LEAVE_GROUP_SYSTEM_MESSAGE;
        } else {
            groupManageParam = ChatSettingHitPointNew.GroupManageParam.JOIN_GROUP_SYSTEM_MESSAGE;
        }
        ChatSettingHitPointNew.m136624a(groupManageParam, managePermissionParams);
    }

    /* renamed from: a */
    public final void mo128687a(Chat.SystemMessageVisible systemMessageVisible, Chat chat, ChatSettingHitPointNew.ManagePermissionParams managePermissionParams) {
        m135705b(systemMessageVisible, chat, managePermissionParams);
        Chat.SystemMessageVisible.Enum fromValue = Chat.SystemMessageVisible.Enum.fromValue(systemMessageVisible.getNumber());
        UpdateChatRequest.C18137a a = new UpdateChatRequest.C18137a().mo62912a(chat.getId());
        int i = C34885a.f90065b[this.f90052b.ordinal()];
        if (i == 1) {
            a.mo62907a(fromValue);
        } else if (i == 2) {
            a.mo62914b(fromValue);
        }
        Job unused = C69553g.m266944a(this, null, null, new C34883f(this, a, null), 3, null);
    }
}
