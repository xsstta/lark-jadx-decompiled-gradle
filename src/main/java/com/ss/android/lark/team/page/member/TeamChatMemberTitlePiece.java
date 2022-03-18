package com.ss.android.lark.team.page.member;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.piece.core.IPieceExport;
import java.util.List;
import kotlin.C69097g;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\"\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\nH\u0016J\b\u0010\u0018\u001a\u00020\nH\u0016J\b\u0010\u0019\u001a\u00020\nH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/team/page/member/TeamChatMemberTitlePiece;", "Lcom/ss/android/lark/team/page/member/BaseMemberTitlePiece;", "()V", "memberViewModel", "Lcom/ss/android/lark/team/page/member/TeamChatMemberViewModel;", "getMemberViewModel", "()Lcom/ss/android/lark/team/page/member/TeamChatMemberViewModel;", "memberViewModel$delegate", "Lkotlin/Lazy;", "addMemberToPrivateChat", "", "configSkipLeftAction", "configTitleBar", "actionType", "Lcom/ss/android/lark/team/entity/MemberActionType;", "gotoAddMemberPage", "onActivityResult", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onAddMemberClick", "onRemoveMemberClick", "removeMemberFromPrivateChat", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TeamChatMemberTitlePiece extends BaseMemberTitlePiece {

    /* renamed from: g */
    private final Lazy f137076g = LazyKt.lazy(new C55533c(this));

    /* renamed from: o */
    public final TeamChatMemberViewModel mo189416o() {
        return (TeamChatMemberViewModel) this.f137076g.getValue();
    }

    /* renamed from: p */
    public TeamChatMemberViewModel mo189363g() {
        return mo189416o();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/team/page/member/TeamChatMemberViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.TeamChatMemberTitlePiece$c */
    static final class C55533c extends Lambda implements Function0<TeamChatMemberViewModel> {
        final /* synthetic */ TeamChatMemberTitlePiece this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55533c(TeamChatMemberTitlePiece teamChatMemberTitlePiece) {
            super(0);
            this.this$0 = teamChatMemberTitlePiece;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TeamChatMemberViewModel invoke() {
            return (TeamChatMemberViewModel) this.this$0.mo177183a(TeamChatMemberViewModel.class);
        }
    }

    @Override // com.ss.android.lark.team.page.member.BaseMemberTitlePiece
    /* renamed from: k */
    public void mo189367k() {
        if (C55585h.f137139a[mo189370n().ordinal()] != 1) {
            m215359H();
        } else {
            m215358G();
        }
    }

    /* renamed from: G */
    private final void m215358G() {
        String a = mo177203q().mo177164a("intent_private_chat_id");
        if (a != null) {
            Job unused = C69553g.m266944a(this, null, null, new C55530a(this, a, mo189416o().getSelectedMemberIdList(), null), 3, null);
        }
    }

    /* renamed from: I */
    private final void m215360I() {
        mo189359b().setLeftImageDrawable(null);
        mo189359b().setLeftText(R.string.Project_MV_SkipButton);
        mo189359b().setLeftClickListener(new View$OnClickListenerC55532b(this));
    }

    /* renamed from: F */
    public final void mo189415F() {
        String a = mo177203q().mo177164a("intent_private_chat_id");
        if (a != null) {
            Job unused = C69553g.m266944a(this, null, null, new C55536f(this, a, mo189416o().getSelectedMemberIdList(), null), 3, null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if ((r0 instanceof com.ss.android.lark.team.entity.Team) != false) goto L_0x001c;
     */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m215359H() {
        /*
            r5 = this;
            com.ss.android.lark.piece.a.c r0 = r5.mo177203q()
            java.lang.Class<com.ss.android.lark.team.entity.Team> r1 = com.ss.android.lark.team.entity.Team.class
            java.util.concurrent.ConcurrentHashMap r0 = r0.mo177165a()
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r1 = "dataMap[key] ?: return null"
            r2 = 0
            if (r0 == 0) goto L_0x001b
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            boolean r3 = r0 instanceof com.ss.android.lark.team.entity.Team
            if (r3 == 0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r0 = r2
        L_0x001c:
            com.ss.android.lark.team.entity.Team r0 = (com.ss.android.lark.team.entity.Team) r0
            if (r0 == 0) goto L_0x0063
            com.ss.android.lark.piece.a.c r3 = r5.mo177203q()
            java.lang.Class<com.ss.android.lark.chat.entity.chat.Chat> r4 = com.ss.android.lark.chat.entity.chat.Chat.class
            java.util.concurrent.ConcurrentHashMap r3 = r3.mo177165a()
            java.lang.Object r3 = r3.get(r4)
            if (r3 == 0) goto L_0x0038
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r1)
            boolean r1 = r3 instanceof com.ss.android.lark.chat.entity.chat.Chat
            if (r1 == 0) goto L_0x0038
            r2 = r3
        L_0x0038:
            com.ss.android.lark.chat.entity.chat.Chat r2 = (com.ss.android.lark.chat.entity.chat.Chat) r2
            if (r2 == 0) goto L_0x0063
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r3 = r5.mo177180C()
            java.lang.Class<com.ss.android.lark.team.page.member.TeamMemberActivity> r4 = com.ss.android.lark.team.page.member.TeamMemberActivity.class
            r1.<init>(r3, r4)
            java.io.Serializable r0 = (java.io.Serializable) r0
            java.lang.String r3 = "intent_team"
            r1.putExtra(r3, r0)
            java.io.Serializable r2 = (java.io.Serializable) r2
            java.lang.String r0 = "intent_chat"
            r1.putExtra(r0, r2)
            com.ss.android.lark.team.entity.MemberActionType r0 = com.ss.android.lark.team.entity.MemberActionType.SELECT_MEMBER_FOR_PRIVATE_CHAT
            java.io.Serializable r0 = (java.io.Serializable) r0
            java.lang.String r2 = "intent_team_members_action"
            r1.putExtra(r2, r0)
            r0 = 18
            r5.mo177187a(r1, r0)
        L_0x0063:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.team.page.member.TeamChatMemberTitlePiece.m215359H():void");
    }

    @Override // com.ss.android.lark.team.page.member.BaseMemberTitlePiece
    /* renamed from: l */
    public void mo189368l() {
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(mo177180C()).title(R.string.Project_MV_ConfirmToRemoveMember)).message(R.string.Project_MV_MembersWillStay)).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Lark_Legacy_Cancel, DialogInterface$OnClickListenerC55534d.f137078a)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_Legacy_Confirm, new DialogInterface$OnClickListenerC55535e(this))).show();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.TeamChatMemberTitlePiece$b */
    public static final class View$OnClickListenerC55532b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TeamChatMemberTitlePiece f137077a;

        View$OnClickListenerC55532b(TeamChatMemberTitlePiece teamChatMemberTitlePiece) {
            this.f137077a = teamChatMemberTitlePiece;
        }

        public final void onClick(View view) {
            this.f137077a.mo177212z();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.team.page.member.TeamChatMemberTitlePiece$addMemberToPrivateChat$1", mo239173f = "TeamChatMemberTitlePiece.kt", mo239174i = {0}, mo239175l = {134}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.team.page.member.TeamChatMemberTitlePiece$a */
    public static final class C55530a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $chatId;
        final /* synthetic */ List $ids;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TeamChatMemberTitlePiece this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55530a(TeamChatMemberTitlePiece teamChatMemberTitlePiece, String str, List list, Continuation cVar) {
            super(2, cVar);
            this.this$0 = teamChatMemberTitlePiece;
            this.$chatId = str;
            this.$ids = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C55530a aVar = new C55530a(this.this$0, this.$chatId, this.$ids, cVar);
            aVar.p$ = (CoroutineScope) obj;
            return aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C55530a) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                this.L$0 = this.p$;
                this.label = 1;
                if (C69388e.m266829a(Dispatchers.m266326d(), new Function2<CoroutineScope, Continuation<? super Chat>, Object>(this, null) {
                    /* class com.ss.android.lark.team.page.member.TeamChatMemberTitlePiece.C55530a.C555311 */
                    Object L$0;
                    int label;
                    private CoroutineScope p$;
                    final /* synthetic */ C55530a this$0;

                    {
                        this.this$0 = r1;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                        Intrinsics.checkParameterIsNotNull(cVar, "completion");
                        C555311 r0 = 

                        /* access modifiers changed from: package-private */
                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
                        @DebugMetadata(mo239172c = "com.ss.android.lark.team.page.member.TeamChatMemberTitlePiece$removeMemberFromPrivateChat$1", mo239173f = "TeamChatMemberTitlePiece.kt", mo239174i = {0}, mo239175l = {115}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
                        /* renamed from: com.ss.android.lark.team.page.member.TeamChatMemberTitlePiece$f */
                        public static final class C55536f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ String $chatId;
                            final /* synthetic */ List $ids;
                            Object L$0;
                            int label;
                            private CoroutineScope p$;
                            final /* synthetic */ TeamChatMemberTitlePiece this$0;

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            C55536f(TeamChatMemberTitlePiece teamChatMemberTitlePiece, String str, List list, Continuation cVar) {
                                super(2, cVar);
                                this.this$0 = teamChatMemberTitlePiece;
                                this.$chatId = str;
                                this.$ids = list;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                                Intrinsics.checkParameterIsNotNull(cVar, "completion");
                                C55536f fVar = new C55536f(this.this$0, this.$chatId, this.$ids, cVar);
                                fVar.p$ = (CoroutineScope) obj;
                                return fVar;
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
                                return ((C55536f) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                IPieceExport aVar;
                                Object a = C69086a.m265828a();
                                int i = this.label;
                                IPieceExport aVar2 = null;
                                if (i == 0) {
                                    C69097g.m265891a(obj);
                                    this.L$0 = this.p$;
                                    this.label = 1;
                                    if (C69388e.m266829a(Dispatchers.m266326d(), new Function2<CoroutineScope, Continuation<? super Chat>, Object>(this, null) {
                                        /* class com.ss.android.lark.team.page.member.TeamChatMemberTitlePiece.C55536f.C555371 */
                                        Object L$0;
                                        int label;
                                        private CoroutineScope p$;
                                        final /* synthetic */ C55536f this$0;

                                        {
                                            this.this$0 = r1;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                                            Intrinsics.checkParameterIsNotNull(cVar, "completion");
                                            C555371 r0 = 

                                            /* JADX WARNING: Code restructure failed: missing block: B:11:0x0048, code lost:
                                                if ((r4 instanceof com.ss.android.lark.chat.entity.chat.Chat) != false) goto L_0x004c;
                                             */
                                            @Override // com.ss.android.lark.team.page.member.BaseMemberTitlePiece
                                            /* renamed from: a */
                                            /* Code decompiled incorrectly, please refer to instructions dump. */
                                            public void mo189357a(com.ss.android.lark.team.entity.MemberActionType r4) {
                                                /*
                                                // Method dump skipped, instructions count: 368
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.team.page.member.TeamChatMemberTitlePiece.mo189357a(com.ss.android.lark.team.entity.MemberActionType):void");
                                            }

                                            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
                                            /* renamed from: com.ss.android.lark.team.page.member.TeamChatMemberTitlePiece$d */
                                            static final class DialogInterface$OnClickListenerC55534d implements DialogInterface.OnClickListener {

                                                /* renamed from: a */
                                                public static final DialogInterface$OnClickListenerC55534d f137078a = new DialogInterface$OnClickListenerC55534d();

                                                DialogInterface$OnClickListenerC55534d() {
                                                }

                                                public final void onClick(DialogInterface dialogInterface, int i) {
                                                    dialogInterface.dismiss();
                                                }
                                            }

                                            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
                                            /* renamed from: com.ss.android.lark.team.page.member.TeamChatMemberTitlePiece$e */
                                            static final class DialogInterface$OnClickListenerC55535e implements DialogInterface.OnClickListener {

                                                /* renamed from: a */
                                                final /* synthetic */ TeamChatMemberTitlePiece f137079a;

                                                DialogInterface$OnClickListenerC55535e(TeamChatMemberTitlePiece teamChatMemberTitlePiece) {
                                                    this.f137079a = teamChatMemberTitlePiece;
                                                }

                                                public final void onClick(DialogInterface dialogInterface, int i) {
                                                    dialogInterface.dismiss();
                                                    this.f137079a.mo189415F();
                                                }
                                            }

                                            @Override // com.ss.android.lark.piece.core.Piece
                                            /* renamed from: a */
                                            public boolean mo128689a(int i, int i2, Intent intent) {
                                                if (i != 18) {
                                                    return super.mo128689a(i, i2, intent);
                                                }
                                                if (i2 == -1) {
                                                    mo189416o().refreshMemberList();
                                                    mo189357a(mo189370n());
                                                }
                                                return true;
                                            }
                                        }
