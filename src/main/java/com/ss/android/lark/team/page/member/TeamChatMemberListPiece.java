package com.ss.android.lark.team.page.member;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.C25644o;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.TagInfo;
import com.ss.android.lark.chat.entity.chatter.TagType;
import com.ss.android.lark.piece.core.IPieceExport;
import com.ss.android.lark.piece.core.PieceContext;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.team.C55356a;
import com.ss.android.lark.team.bean.TeamMemberVO;
import com.ss.android.lark.team.dependency.ITeamModuleDependency;
import com.ss.android.lark.team.stastics.ChatHintPoint;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C69097g;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C69388e;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J \u0010\u001a\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0019H\u0002J\u0018\u0010\u001c\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0019H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/team/page/member/TeamChatMemberListPiece;", "Lcom/ss/android/lark/team/page/member/BaseMemberListPiece;", "()V", "dialog", "Lcom/larksuite/component/ui/dialog/LKUIDialog;", "memberViewModel", "Lcom/ss/android/lark/team/page/member/TeamChatMemberViewModel;", "getMemberViewModel", "()Lcom/ss/android/lark/team/page/member/TeamChatMemberViewModel;", "memberViewModel$delegate", "Lkotlin/Lazy;", "onLongClick", "", "view", "Landroid/view/View;", "member", "Lcom/ss/android/lark/team/bean/TeamMemberVO;", "removeMember", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "showChangeOwnerDialog", "showMemberManageDialog", "showMemberManageDialogForAdmin", "showMemberManageDialogForOwner", "supportSelection", "", "updateChatAdmin", "isAdd", "updateChatAdminTag", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TeamChatMemberListPiece extends BaseMemberListPiece {

    /* renamed from: b */
    private final Lazy f137056b = LazyKt.lazy(new C55518a(this));

    /* renamed from: g */
    private DialogC25637f f137057g;

    /* renamed from: j */
    public final TeamChatMemberViewModel mo189380j() {
        return (TeamChatMemberViewModel) this.f137056b.getValue();
    }

    /* renamed from: k */
    public TeamChatMemberViewModel mo189345e() {
        return mo189380j();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/team/page/member/TeamChatMemberViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.TeamChatMemberListPiece$a */
    static final class C55518a extends Lambda implements Function0<TeamChatMemberViewModel> {
        final /* synthetic */ TeamChatMemberListPiece this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55518a(TeamChatMemberListPiece teamChatMemberListPiece) {
            super(0);
            this.this$0 = teamChatMemberListPiece;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TeamChatMemberViewModel invoke() {
            return (TeamChatMemberViewModel) this.this$0.mo177183a(TeamChatMemberViewModel.class);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if ((r0 instanceof com.ss.android.lark.team.entity.MemberActionType) != false) goto L_0x001c;
     */
    @Override // com.ss.android.lark.team.page.member.BaseMemberListPiece
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo189346f() {
        /*
            r4 = this;
            com.ss.android.lark.piece.a.c r0 = r4.mo177203q()
            java.lang.Class<com.ss.android.lark.team.entity.MemberActionType> r1 = com.ss.android.lark.team.entity.MemberActionType.class
            java.util.concurrent.ConcurrentHashMap r0 = r0.mo177165a()
            java.lang.Object r0 = r0.get(r1)
            r1 = 0
            if (r0 == 0) goto L_0x001b
            java.lang.String r2 = "dataMap[key] ?: return null"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            boolean r2 = r0 instanceof com.ss.android.lark.team.entity.MemberActionType
            if (r2 == 0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r0 = r1
        L_0x001c:
            com.ss.android.lark.team.entity.MemberActionType r0 = (com.ss.android.lark.team.entity.MemberActionType) r0
            r1 = 0
            if (r0 == 0) goto L_0x0031
            int[] r2 = com.ss.android.lark.team.page.member.C55584g.f137138b
            int r0 = r0.ordinal()
            r0 = r2[r0]
            r2 = 1
            if (r0 == r2) goto L_0x0030
            r3 = 2
            if (r0 == r3) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r1 = 1
        L_0x0031:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.team.page.member.TeamChatMemberListPiece.mo189346f():boolean");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.TeamChatMemberListPiece$c */
    public static final class DialogInterface$OnClickListenerC55521c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TeamChatMemberListPiece f137058a;

        /* renamed from: b */
        final /* synthetic */ Chat f137059b;

        /* renamed from: c */
        final /* synthetic */ TeamMemberVO f137060c;

        DialogInterface$OnClickListenerC55521c(TeamChatMemberListPiece teamChatMemberListPiece, Chat chat, TeamMemberVO dVar) {
            this.f137058a = teamChatMemberListPiece;
            this.f137059b = chat;
            this.f137060c = dVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/team/page/member/TeamChatMemberListPiece$showChangeOwnerDialog$1$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.team.page.member.TeamChatMemberListPiece$c$a */
        public static final class C55522a implements IGetDataCallback<Chat> {

            /* renamed from: a */
            final /* synthetic */ DialogInterface$OnClickListenerC55521c f137061a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C55522a(DialogInterface$OnClickListenerC55521c cVar) {
                this.f137061a = cVar;
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                UDToast.show(this.f137061a.f137058a.mo177180C(), (int) R.string.Lark_Legacy_ChangeOwnerFailed);
            }

            /* renamed from: a */
            public void onSuccess(Chat chat) {
                IPieceExport aVar;
                this.f137061a.f137059b.setOwnerId(this.f137061a.f137060c.mo188945a());
                this.f137061a.f137058a.mo177203q().mo177168a(Chat.class, this.f137061a.f137059b);
                this.f137061a.f137058a.mo189380j().refreshMemberList();
                PieceContext r = this.f137061a.f137058a.mo177204r();
                if (r != null) {
                    aVar = r.mo177222a(TeamMemberSearchListExport.class);
                } else {
                    aVar = null;
                }
                TeamMemberSearchListExport tVar = (TeamMemberSearchListExport) aVar;
                if (tVar != null) {
                    tVar.mo189472b();
                }
                this.f137061a.f137058a.mo189349i();
                UDToast.show(this.f137061a.f137058a.mo177180C(), (int) R.string.Lark_Legacy_ChangeOwnerSuccess);
            }
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            UIGetDataCallback wrapAndAddGetDataCallback = this.f137058a.mo177209w().wrapAndAddGetDataCallback(new C55522a(this));
            ITeamModuleDependency.IChatDependency c = C55356a.m214819a().mo144124c();
            String id = this.f137059b.getId();
            Intrinsics.checkExpressionValueIsNotNull(id, "chat.getId()");
            String a = this.f137060c.mo188945a();
            Intrinsics.checkExpressionValueIsNotNull(a, "member.id");
            Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callback");
            c.mo144141a(id, a, wrapAndAddGetDataCallback);
            ChatHintPoint.f136853a.mo189109b(this.f137059b, "transfer_owner");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/team/page/member/TeamChatMemberListPiece$updateChatAdmin$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.TeamChatMemberListPiece$h */
    public static final class C55527h implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ TeamChatMemberListPiece f137071a;

        /* renamed from: b */
        final /* synthetic */ TeamMemberVO f137072b;

        /* renamed from: c */
        final /* synthetic */ boolean f137073c;

        /* renamed from: a */
        public void onSuccess(Boolean bool) {
            int i;
            this.f137071a.mo189379c(this.f137072b, this.f137073c);
            if (this.f137073c) {
                i = R.string.Lark_Legacy_GroupAdminAdded;
            } else {
                i = R.string.Lark_Legacy_GroupAdminRemoved;
            }
            UDToast.show(this.f137071a.mo177180C(), C51468a.m199493c(i, this.f137071a.mo177180C()));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            boolean z;
            int i;
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            String displayMsg = errorResult.getDisplayMsg();
            if (displayMsg == null || displayMsg.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (this.f137073c) {
                    i = R.string.Lark_Legacy_GroupAdminAddFailedToast;
                } else {
                    i = R.string.Lark_Legacy_UnableToRemoveToast;
                }
                UDToast.show(this.f137071a.mo177180C(), C51468a.m199493c(i, this.f137071a.mo177180C()));
                return;
            }
            Context C = this.f137071a.mo177180C();
            String displayMsg2 = errorResult.getDisplayMsg();
            if (displayMsg2 == null) {
                displayMsg2 = "";
            }
            UDToast.show(C, displayMsg2);
        }

        C55527h(TeamChatMemberListPiece teamChatMemberListPiece, TeamMemberVO dVar, boolean z) {
            this.f137071a = teamChatMemberListPiece;
            this.f137072b = dVar;
            this.f137073c = z;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if ((r0 instanceof com.ss.android.lark.chat.entity.chat.Chat) != false) goto L_0x001c;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m215344d(com.ss.android.lark.team.bean.TeamMemberVO r4) {
        /*
            r3 = this;
            com.ss.android.lark.piece.a.c r0 = r3.mo177203q()
            java.lang.Class<com.ss.android.lark.chat.entity.chat.Chat> r1 = com.ss.android.lark.chat.entity.chat.Chat.class
            java.util.concurrent.ConcurrentHashMap r0 = r0.mo177165a()
            java.lang.Object r0 = r0.get(r1)
            r1 = 0
            if (r0 == 0) goto L_0x001b
            java.lang.String r2 = "dataMap[key] ?: return null"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            boolean r2 = r0 instanceof com.ss.android.lark.chat.entity.chat.Chat
            if (r2 == 0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r0 = r1
        L_0x001c:
            com.ss.android.lark.chat.entity.chat.Chat r0 = (com.ss.android.lark.chat.entity.chat.Chat) r0
            if (r0 == 0) goto L_0x003b
            boolean r1 = r0.isSecret()
            if (r1 == 0) goto L_0x0027
            return
        L_0x0027:
            boolean r1 = com.ss.android.lark.team.util.ChatUtil.m215112b(r0)
            if (r1 != 0) goto L_0x002e
            return
        L_0x002e:
            boolean r1 = com.ss.android.lark.team.util.ChatUtil.m215111a(r0)
            if (r1 == 0) goto L_0x0038
            r3.m215342c(r0, r4)
            goto L_0x003b
        L_0x0038:
            r3.m215343d(r0, r4)
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.team.page.member.TeamChatMemberListPiece.m215344d(com.ss.android.lark.team.bean.d):void");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.team.page.member.TeamChatMemberListPiece$removeMember$1", mo239173f = "TeamChatMemberListPiece.kt", mo239174i = {0, 0}, mo239175l = {152}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "ids"}, mo239178s = {"L$0", "L$1"})
    /* renamed from: com.ss.android.lark.team.page.member.TeamChatMemberListPiece$b */
    public static final class C55519b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Chat $chat;
        final /* synthetic */ TeamMemberVO $member;
        Object L$0;
        Object L$1;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TeamChatMemberListPiece this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55519b(TeamChatMemberListPiece teamChatMemberListPiece, TeamMemberVO dVar, Chat chat, Continuation cVar) {
            super(2, cVar);
            this.this$0 = teamChatMemberListPiece;
            this.$member = dVar;
            this.$chat = chat;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C55519b bVar = new C55519b(this.this$0, this.$member, this.$chat, cVar);
            bVar.p$ = (CoroutineScope) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C55519b) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<String> list;
            IPieceExport aVar;
            Object a = C69086a.m265828a();
            int i = this.label;
            IPieceExport aVar2 = null;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                final List<String> listOf = CollectionsKt.listOf(this.$member.mo188945a());
                this.L$0 = ahVar;
                this.L$1 = listOf;
                this.label = 1;
                if (C69388e.m266829a(Dispatchers.m266326d(), new Function2<CoroutineScope, Continuation<? super Chat>, Object>(this, null) {
                    /* class com.ss.android.lark.team.page.member.TeamChatMemberListPiece.C55519b.C555201 */
                    Object L$0;
                    int label;
                    private CoroutineScope p$;
                    final /* synthetic */ C55519b this$0;

                    {
                        this.this$0 = r1;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                        Intrinsics.checkParameterIsNotNull(cVar, "completion");
                        C555201 r0 = 

                        /* access modifiers changed from: package-private */
                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialogInterface", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
                        /* renamed from: com.ss.android.lark.team.page.member.TeamChatMemberListPiece$d */
                        public static final class DialogInterface$OnClickListenerC55523d implements DialogInterface.OnClickListener {

                            /* renamed from: a */
                            public static final DialogInterface$OnClickListenerC55523d f137062a = new DialogInterface$OnClickListenerC55523d();

                            DialogInterface$OnClickListenerC55523d() {
                            }

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        }

                        /* access modifiers changed from: package-private */
                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialogInterface", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
                        /* renamed from: com.ss.android.lark.team.page.member.TeamChatMemberListPiece$f */
                        public static final class DialogInterface$OnClickListenerC55525f implements DialogInterface.OnClickListener {

                            /* renamed from: a */
                            public static final DialogInterface$OnClickListenerC55525f f137066a = new DialogInterface$OnClickListenerC55525f();

                            DialogInterface$OnClickListenerC55525f() {
                            }

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        }

                        /* access modifiers changed from: package-private */
                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
                        /* renamed from: com.ss.android.lark.team.page.member.TeamChatMemberListPiece$e */
                        public static final class DialogInterface$OnClickListenerC55524e implements DialogInterface.OnClickListener {

                            /* renamed from: a */
                            final /* synthetic */ TeamChatMemberListPiece f137063a;

                            /* renamed from: b */
                            final /* synthetic */ Chat f137064b;

                            /* renamed from: c */
                            final /* synthetic */ TeamMemberVO f137065c;

                            DialogInterface$OnClickListenerC55524e(TeamChatMemberListPiece teamChatMemberListPiece, Chat chat, TeamMemberVO dVar) {
                                this.f137063a = teamChatMemberListPiece;
                                this.f137064b = chat;
                                this.f137065c = dVar;
                            }

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                if (i == 0) {
                                    this.f137063a.mo189376a(this.f137064b, this.f137065c);
                                    ChatHintPoint.f136853a.mo189108a(this.f137064b, "delete_group_members");
                                }
                            }
                        }

                        /* renamed from: a */
                        public final void mo189376a(Chat chat, TeamMemberVO dVar) {
                            Job unused = C69553g.m266944a(this, null, null, new C55519b(this, dVar, chat, null), 3, null);
                        }

                        @Override // com.ss.android.lark.team.page.member.TeamMemberViewDependency, com.ss.android.lark.team.page.member.BaseMemberListPiece
                        /* renamed from: b */
                        public void mo189340b(View view, TeamMemberVO dVar) {
                            Intrinsics.checkParameterIsNotNull(view, "view");
                            Intrinsics.checkParameterIsNotNull(dVar, "member");
                            if (C55584g.f137137a[mo189348h().ordinal()] != 1) {
                                super.mo189340b(view, dVar);
                            } else {
                                m215344d(dVar);
                            }
                        }

                        /* access modifiers changed from: package-private */
                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
                        /* renamed from: com.ss.android.lark.team.page.member.TeamChatMemberListPiece$g */
                        public static final class DialogInterface$OnClickListenerC55526g implements DialogInterface.OnClickListener {

                            /* renamed from: a */
                            final /* synthetic */ TeamChatMemberListPiece f137067a;

                            /* renamed from: b */
                            final /* synthetic */ Chat f137068b;

                            /* renamed from: c */
                            final /* synthetic */ TeamMemberVO f137069c;

                            /* renamed from: d */
                            final /* synthetic */ boolean f137070d;

                            DialogInterface$OnClickListenerC55526g(TeamChatMemberListPiece teamChatMemberListPiece, Chat chat, TeamMemberVO dVar, boolean z) {
                                this.f137067a = teamChatMemberListPiece;
                                this.f137068b = chat;
                                this.f137069c = dVar;
                                this.f137070d = z;
                            }

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                String str;
                                if (i == 0) {
                                    this.f137067a.mo189378b(this.f137068b, this.f137069c);
                                    ChatHintPoint.f136853a.mo189108a(this.f137068b, "transfer_owner");
                                } else if (i == 1) {
                                    this.f137067a.mo189377a(this.f137068b, this.f137069c, true ^ this.f137070d);
                                    if (this.f137070d) {
                                        str = "delete_admin";
                                    } else {
                                        str = "assign_admin";
                                    }
                                    ChatHintPoint.f136853a.mo189108a(this.f137068b, str);
                                } else if (i == 2) {
                                    this.f137067a.mo189376a(this.f137068b, this.f137069c);
                                    ChatHintPoint.f136853a.mo189108a(this.f137068b, "delete_group_members");
                                }
                            }
                        }

                        /* renamed from: c */
                        private final void m215342c(Chat chat, TeamMemberVO dVar) {
                            DialogC25637f fVar = this.f137057g;
                            if (fVar != null) {
                                fVar.dismiss();
                            }
                            if (!dVar.mo188953e()) {
                                boolean h = dVar.mo188957h();
                                DialogC25637f b = ((C25644o) ((C25644o) ((C25644o) new C25644o(mo177180C()).mo89205a(new TeamChatMemberListPiece$showMemberManageDialogForOwner$1(h))).mo89224a(R.id.lkui_dialog_btn_cancel, R.string.Lark_Legacy_Cancel, DialogInterface$OnClickListenerC55525f.f137066a)).mo89202a(new DialogInterface$OnClickListenerC55526g(this, chat, dVar, h))).mo89233b();
                                this.f137057g = b;
                                if (b != null) {
                                    b.show();
                                }
                            }
                        }

                        /* renamed from: d */
                        private final void m215343d(Chat chat, TeamMemberVO dVar) {
                            DialogC25637f fVar = this.f137057g;
                            if (fVar != null) {
                                fVar.dismiss();
                            }
                            if (!dVar.mo188953e() && !dVar.mo188957h()) {
                                DialogC25637f b = ((C25644o) ((C25644o) ((C25644o) new C25644o(mo177180C()).mo89205a(new TeamChatMemberListPiece$showMemberManageDialogForAdmin$1())).mo89224a(R.id.lkui_dialog_btn_cancel, R.string.Lark_Legacy_Cancel, DialogInterface$OnClickListenerC55523d.f137062a)).mo89202a(new DialogInterface$OnClickListenerC55524e(this, chat, dVar))).mo89233b();
                                this.f137057g = b;
                                if (b != null) {
                                    b.show();
                                }
                            }
                        }

                        /* renamed from: b */
                        public final void mo189378b(Chat chat, TeamMemberVO dVar) {
                            new C25639g(mo177180C()).mo89248g(R.string.Lark_Legacy_ChangeOwner).mo89238b(true).mo89251j(2).mo89242c(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_ChatGroupInfoTransferSure, "group_owner", dVar.mo188949c())).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_Cancel, (DialogInterface.OnClickListener) null).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_Confirm, new DialogInterface$OnClickListenerC55521c(this, chat, dVar)).mo89239c();
                        }

                        /* renamed from: c */
                        public final void mo189379c(TeamMemberVO dVar, boolean z) {
                            ArrayList arrayList;
                            IPieceExport aVar;
                            boolean z2;
                            if (z) {
                                List<TagInfo> tagInfos = dVar.mo188959i().getTagInfos();
                                Intrinsics.checkExpressionValueIsNotNull(tagInfos, "member.chatter.tagInfos");
                                arrayList = CollectionsKt.toMutableList((Collection) tagInfos);
                                String string = UIHelper.getString(R.string.Lark_Group_GroupAdministratorLabel);
                                Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…_GroupAdministratorLabel)");
                                arrayList.add(new TagInfo(string, TagType.ADMIN_USER));
                            } else {
                                List<TagInfo> tagInfos2 = dVar.mo188959i().getTagInfos();
                                Intrinsics.checkExpressionValueIsNotNull(tagInfos2, "member.chatter.tagInfos");
                                ArrayList arrayList2 = new ArrayList();
                                for (T t : tagInfos2) {
                                    if (t.getType() != TagType.ADMIN_USER) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        arrayList2.add(t);
                                    }
                                }
                                arrayList = arrayList2;
                            }
                            mo189344d().mo189521a(dVar, arrayList);
                            PieceContext r = mo177204r();
                            if (r != null) {
                                aVar = r.mo177222a(TeamMemberSearchListExport.class);
                            } else {
                                aVar = null;
                            }
                            TeamMemberSearchListExport tVar = (TeamMemberSearchListExport) aVar;
                            if (tVar != null) {
                                tVar.mo189469a(dVar, arrayList);
                            }
                        }

                        /* renamed from: a */
                        public final void mo189377a(Chat chat, TeamMemberVO dVar, boolean z) {
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            if (z) {
                                String a = dVar.mo188945a();
                                Intrinsics.checkExpressionValueIsNotNull(a, "member.id");
                                arrayList.add(a);
                            } else {
                                String a2 = dVar.mo188945a();
                                Intrinsics.checkExpressionValueIsNotNull(a2, "member.id");
                                arrayList2.add(a2);
                            }
                            UIGetDataCallback wrapAndAddGetDataCallback = mo177209w().wrapAndAddGetDataCallback(new C55527h(this, dVar, z));
                            ITeamModuleDependency.IChatDependency c = C55356a.m214819a().mo144124c();
                            String id = chat.getId();
                            Intrinsics.checkExpressionValueIsNotNull(id, "chat.getId()");
                            Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callback");
                            c.mo144143a(id, arrayList, arrayList2, wrapAndAddGetDataCallback);
                        }
                    }
