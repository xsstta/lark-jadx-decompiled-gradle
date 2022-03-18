package com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.lark.pb.basic.v1.ChatMailSetting;
import com.bytedance.lark.pb.im.v1.UpdateChatRequest;
import com.larksuite.component.universe_design.dialog.UDListDialogController;
import com.larksuite.component.universe_design.dialog.actionpanel.UDActionPanelBuilder;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.rucket.job.RucketJob;
import com.larksuite.rucket.job.base.RucketResult;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.common_view.base.SettingNavigationPiece;
import com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingNavigationPiece;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingHitPointNew;
import com.ss.android.lark.chatsetting.impl.statistics.ownership.OwnershipHitPoint;
import com.ss.android.lark.chatsetting.impl.statistics.setting.SettingHitPoint;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.chatsetting.service.ChatSettingService;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.C69097g;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69089a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J,\u0010\r\u001a&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u0004H\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u0018\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u001a\u001a\u00020\u0013H\u0014R?\u0010\u0003\u001a&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00048BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/v2/permission/EmailSettingPiece;", "Lcom/ss/android/lark/chatsetting/impl/common_view/chatsetting/ChatSettingNavigationPiece;", "()V", "params", "Lkotlin/Triple;", "", "", "Lcom/ss/android/lark/chatsetting/impl/statistics/ChatSettingHitPointNew$ManagePermissionParams;", "Lcom/ss/android/lark/chat/entity/chat/Chat$GroupMailSendPermissionType;", "getParams", "()Lkotlin/Triple;", "params$delegate", "Lkotlin/Lazy;", "createSomeParams", "isContentViewVisible", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "itemType", "", "onChatChanged", "", "onClick", "onMailSettingItemClick", "index", "showGroupMailSettingSelectDialog", "titleRes", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class EmailSettingPiece extends ChatSettingNavigationPiece {

    /* renamed from: a */
    private final Lazy f90083a = LazyKt.lazy(new C34900b(this));

    /* renamed from: p */
    private final Triple<List<String>, List<ChatSettingHitPointNew.ManagePermissionParams>, List<Chat.GroupMailSendPermissionType>> m135783p() {
        return (Triple) this.f90083a.getValue();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.common_view.base.SettingBasePiece
    /* renamed from: f */
    public int mo127635f() {
        return 22;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.common_view.base.SettingNavigationPiece
    /* renamed from: j */
    public int mo127642j() {
        return R.string.Lark_Group_GroupSettings_Email_Permission_Title;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00020\u0001H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lkotlin/Triple;", "", "", "Lcom/ss/android/lark/chatsetting/impl/statistics/ChatSettingHitPointNew$ManagePermissionParams;", "Lcom/ss/android/lark/chat/entity/chat/Chat$GroupMailSendPermissionType;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission.EmailSettingPiece$b */
    static final class C34900b extends Lambda implements Function0<Triple<? extends List<? extends String>, ? extends List<? extends ChatSettingHitPointNew.ManagePermissionParams>, ? extends List<? extends Chat.GroupMailSendPermissionType>>> {
        final /* synthetic */ EmailSettingPiece this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34900b(EmailSettingPiece emailSettingPiece) {
            super(0);
            this.this$0 = emailSettingPiece;
        }

        /* Return type fixed from 'kotlin.Triple<java.util.List<java.lang.String>, java.util.List<com.ss.android.lark.chatsetting.impl.statistics.ChatSettingHitPointNew$ManagePermissionParams>, java.util.List<com.ss.android.lark.chat.entity.chat.Chat$GroupMailSendPermissionType>>' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Triple<? extends List<? extends String>, ? extends List<? extends ChatSettingHitPointNew.ManagePermissionParams>, ? extends List<? extends Chat.GroupMailSendPermissionType>> invoke() {
            return this.this$0.mo128704o();
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingNavigationPiece
    /* renamed from: m */
    public void mo127669m() {
        Chat n = mo127670n();
        if (n != null) {
            m135782d(n);
        }
    }

    /* renamed from: o */
    public final Triple<List<String>, List<ChatSettingHitPointNew.ManagePermissionParams>, List<Chat.GroupMailSendPermissionType>> mo128704o() {
        boolean z;
        int i;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Context C = mo177180C();
        Chat n = mo127670n();
        if (n != null) {
            z = n.isThread();
        } else {
            z = false;
        }
        arrayList.add(C51468a.m199493c(R.string.Lark_Legacy_OnlyGOGASendEmail, C));
        arrayList2.add(ChatSettingHitPointNew.ManagePermissionParams.ONLY_GROUP_OWNER_AND_ADMIN);
        arrayList3.add(Chat.GroupMailSendPermissionType.ONLY_ADMIN);
        if (z) {
            i = R.string.Lark_Groups_CircleEmailOnlyMemberCanSend;
        } else {
            i = R.string.Lark_Group_GroupSettings_Email_Permission_Member;
        }
        arrayList.add(C51468a.m199493c(i, C));
        arrayList2.add(ChatSettingHitPointNew.ManagePermissionParams.ONLY_GROUP_MEMBER);
        arrayList3.add(Chat.GroupMailSendPermissionType.ONLY_MEMBER);
        AbstractC34461c a = ChatSettingModule.m133639a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
        AbstractC34461c.AbstractC34476o g = a.mo127277g();
        Intrinsics.checkExpressionValueIsNotNull(g, "ChatSettingModule.getDependency().loginDependency");
        String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_Group_GroupSettings_Email_Permission_Tenant, "tenant_name", g.mo127414b());
        Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…tenant_name\", tenantName)");
        arrayList.add(mustacheFormat);
        arrayList2.add(ChatSettingHitPointNew.ManagePermissionParams.ONLY_TEAM_MEMBER);
        arrayList3.add(Chat.GroupMailSendPermissionType.ONLY_TENANT);
        arrayList.add(C51468a.m199493c(R.string.Lark_Group_GroupSettings_Email_Permission_All, C));
        arrayList2.add(ChatSettingHitPointNew.ManagePermissionParams.ALL);
        arrayList3.add(Chat.GroupMailSendPermissionType.ANYONE);
        arrayList.add(C51468a.m199493c(R.string.Lark_Chat_NoOneCanSend, C));
        arrayList2.add(ChatSettingHitPointNew.ManagePermissionParams.NOBODY);
        arrayList3.add(Chat.GroupMailSendPermissionType.UNKNOWN);
        return new Triple<>(arrayList, arrayList2, arrayList3);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/v2/permission/EmailSettingPiece$showGroupMailSettingSelectDialog$1", "Lcom/larksuite/component/universe_design/dialog/UDListDialogController$OnItemClickListener;", "onItemClick", "", "index", "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission.EmailSettingPiece$c */
    public static final class C34901c implements UDListDialogController.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ EmailSettingPiece f90084a;

        /* renamed from: b */
        final /* synthetic */ Chat f90085b;

        @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
        public void onItemClick(int i) {
            this.f90084a.mo128703a(i, this.f90085b);
        }

        C34901c(EmailSettingPiece emailSettingPiece, Chat chat) {
            this.f90084a = emailSettingPiece;
            this.f90085b = chat;
        }
    }

    /* renamed from: d */
    private final void m135782d(Chat chat) {
        ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) new UDActionPanelBuilder(mo177180C()).title(R.string.Lark_Group_GroupSettings_Email_Permission_Title)).mo90870a(m135783p().getFirst())).mo90869a(new C34901c(this, chat))).addActionButton(R.id.ud_dialog_btn_cancel, R.string.Lark_Legacy_Cancel, (DialogInterface.OnClickListener) null)).show();
    }

    @Override // com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingNavigationPiece
    /* renamed from: b */
    public boolean mo127667b(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        if (chat.isSuper() || chat.getGroupMailSendType() == Chat.GroupMailSendPermissionType.UNKNOWN) {
            return false;
        }
        AbstractC34461c a = ChatSettingModule.m133639a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
        AbstractC34461c.AbstractC34477p D = a.mo127259D();
        Intrinsics.checkExpressionValueIsNotNull(D, "ChatSettingModule.getDependency().mailDependency");
        return D.mo127416a();
    }

    @Override // com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingNavigationPiece
    /* renamed from: a */
    public void mo127665a(Chat chat) {
        Chat.GroupMailSendPermissionType groupMailSendPermissionType;
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        super.mo127665a(chat);
        if (!chat.isGroupMailEnable()) {
            groupMailSendPermissionType = Chat.GroupMailSendPermissionType.UNKNOWN;
        } else {
            groupMailSendPermissionType = chat.getGroupMailSendType();
        }
        int indexOf = m135783p().getThird().indexOf(groupMailSendPermissionType);
        if (indexOf >= 0) {
            SettingNavigationPiece.m134140a(this, null, m135783p().getFirst().get(indexOf), null, 0, 13, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission.EmailSettingPiece$onMailSettingItemClick$1", mo239173f = "EmailSettingPiece.kt", mo239174i = {0, 0}, mo239175l = {104}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "builder"}, mo239178s = {"L$0", "L$1"})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission.EmailSettingPiece$a */
    public static final class C34899a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Chat $chat;
        final /* synthetic */ boolean $initEnable;
        final /* synthetic */ Chat.GroupMailSendPermissionType $initType;
        final /* synthetic */ boolean $resultEnable;
        final /* synthetic */ Chat.GroupMailSendPermissionType $resultType;
        Object L$0;
        Object L$1;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ EmailSettingPiece this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34899a(EmailSettingPiece emailSettingPiece, Chat chat, boolean z, boolean z2, Chat.GroupMailSendPermissionType groupMailSendPermissionType, Chat.GroupMailSendPermissionType groupMailSendPermissionType2, Continuation cVar) {
            super(2, cVar);
            this.this$0 = emailSettingPiece;
            this.$chat = chat;
            this.$resultEnable = z;
            this.$initEnable = z2;
            this.$resultType = groupMailSendPermissionType;
            this.$initType = groupMailSendPermissionType2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C34899a aVar = new C34899a(this.this$0, this.$chat, this.$resultEnable, this.$initEnable, this.$resultType, this.$initType, cVar);
            aVar.p$ = (CoroutineScope) obj;
            return aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C34899a) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                UpdateChatRequest.C18137a a2 = new UpdateChatRequest.C18137a().mo62912a(this.$chat.getId());
                boolean z = this.$resultEnable;
                if (z != this.$initEnable) {
                    a2.mo62923f(C69089a.m265837a(z));
                }
                Chat.GroupMailSendPermissionType groupMailSendPermissionType = this.$resultType;
                if (groupMailSendPermissionType != this.$initType) {
                    Intrinsics.checkExpressionValueIsNotNull(groupMailSendPermissionType, "resultType");
                    a2.mo62909a(ChatMailSetting.SendPermission.fromValue(groupMailSendPermissionType.getNumber()));
                }
                ChatSettingService bVar = ChatSettingService.f88988a;
                Intrinsics.checkExpressionValueIsNotNull(a2, "builder");
                RucketJob<Chat> a3 = bVar.mo127456a(a2);
                this.L$0 = ahVar;
                this.L$1 = a2;
                this.label = 1;
                obj = a3.mo93484a(this);
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
                UDToast.show(this.this$0.mo177180C(), (int) R.string.Lark_Group_GroupSettings_Email_Permission_Failed);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public final void mo128703a(int i, Chat chat) {
        boolean z;
        Chat.GroupMailSendPermissionType groupMailSendPermissionType;
        if (i >= 0 && i <= CollectionsKt.getLastIndex(m135783p().getFirst())) {
            Chat.GroupMailSendPermissionType groupMailSendType = chat.getGroupMailSendType();
            boolean isGroupMailEnable = chat.isGroupMailEnable();
            if (m135783p().getThird().get(i) != Chat.GroupMailSendPermissionType.UNKNOWN) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                groupMailSendPermissionType = m135783p().getThird().get(i);
            } else {
                groupMailSendPermissionType = groupMailSendType;
            }
            ChatSettingHitPointNew.m136624a(ChatSettingHitPointNew.GroupManageParam.MAIL_RESTRICTION, m135783p().getSecond().get(i));
            if (!(isGroupMailEnable == z && groupMailSendType == groupMailSendPermissionType)) {
                OwnershipHitPoint.Companion aVar = OwnershipHitPoint.f90525a;
                Intrinsics.checkExpressionValueIsNotNull(groupMailSendPermissionType, "resultType");
                int memberCount = chat.getMemberCount();
                String id = chat.getId();
                Intrinsics.checkExpressionValueIsNotNull(id, "chat.getId()");
                aVar.mo129288a(z, groupMailSendPermissionType, memberCount, id);
            }
            if (z == isGroupMailEnable && groupMailSendPermissionType != groupMailSendType) {
                SettingHitPoint.Companion aVar2 = SettingHitPoint.f90520a;
                Intrinsics.checkExpressionValueIsNotNull(groupMailSendPermissionType, "resultType");
                aVar2.mo129265a(groupMailSendPermissionType);
            }
            Job unused = C69553g.m266944a(this, null, null, new C34899a(this, chat, z, isGroupMailEnable, groupMailSendPermissionType, groupMailSendType, null), 3, null);
        }
    }
}
