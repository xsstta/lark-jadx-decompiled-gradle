package com.ss.android.lark.team.page.member;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.suite.R;
import com.ss.android.lark.piece.core.IPieceExport;
import com.ss.android.lark.team.bean.TeamMemberVO;
import com.ss.android.lark.team.entity.MemberActionType;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.team.stastics.TeamMemberHitPoint;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C69388e;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J,\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/team/page/member/TeamMemberListPiece;", "Lcom/ss/android/lark/team/page/member/BaseMemberListPiece;", "()V", "memberViewModel", "Lcom/ss/android/lark/team/page/member/BaseMemberViewModel;", "getMemberViewModel", "()Lcom/ss/android/lark/team/page/member/BaseMemberViewModel;", "memberViewModel$delegate", "Lkotlin/Lazy;", "changeTeamOwner", "", "member", "Lcom/ss/android/lark/team/bean/TeamMemberVO;", "onClick", "view", "Landroid/view/View;", "onLongClick", "removeMember", "showChangeOwnerDialog", "confirmButtonRes", "", "confirmBlock", "Lkotlin/Function1;", "showMemberManageDialog", "supportSelection", "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TeamMemberListPiece extends BaseMemberListPiece {

    /* renamed from: b */
    private final Lazy f137083b = LazyKt.lazy(new C55543b(this));

    /* renamed from: j */
    public final BaseMemberViewModel mo189380j() {
        return (BaseMemberViewModel) this.f137083b.getValue();
    }

    @Override // com.ss.android.lark.team.page.member.BaseMemberListPiece
    /* renamed from: e */
    public BaseMemberViewModel mo189345e() {
        return mo189380j();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/team/page/member/TeamMemberViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.TeamMemberListPiece$b */
    static final class C55543b extends Lambda implements Function0<TeamMemberViewModel> {
        final /* synthetic */ TeamMemberListPiece this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55543b(TeamMemberListPiece teamMemberListPiece) {
            super(0);
            this.this$0 = teamMemberListPiece;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TeamMemberViewModel invoke() {
            return (TeamMemberViewModel) this.this$0.mo177183a(TeamMemberViewModel.class);
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
            r3 = this;
            com.ss.android.lark.piece.a.c r0 = r3.mo177203q()
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
            if (r0 == 0) goto L_0x002e
            int[] r2 = com.ss.android.lark.team.page.member.C55593o.f137158a
            int r0 = r0.ordinal()
            r0 = r2[r0]
            r2 = 1
            if (r0 == r2) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r1 = 1
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.team.page.member.TeamMemberListPiece.mo189346f():boolean");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "member", "Lcom/ss/android/lark/team/bean/TeamMemberVO;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.TeamMemberListPiece$c */
    static final class C55544c extends Lambda implements Function1<TeamMemberVO, Unit> {
        final /* synthetic */ TeamMemberListPiece this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55544c(TeamMemberListPiece teamMemberListPiece) {
            super(1);
            this.this$0 = teamMemberListPiece;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TeamMemberVO dVar) {
            invoke(dVar);
            return Unit.INSTANCE;
        }

        public final void invoke(TeamMemberVO dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "member");
            Intent intent = new Intent();
            intent.putExtra("key_new_team_owner", dVar.mo188959i().getChatter());
            this.this$0.mo177185a(-1, intent);
            this.this$0.mo177212z();
            String a = dVar.mo188945a();
            Intrinsics.checkExpressionValueIsNotNull(a, "member.id");
            TeamMemberHitPoint.m215093a(a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if ((r0 instanceof com.ss.android.lark.team.entity.Team) != false) goto L_0x001c;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo189431d(com.ss.android.lark.team.bean.TeamMemberVO r9) {
        /*
            r8 = this;
            com.ss.android.lark.piece.a.c r0 = r8.mo177203q()
            java.lang.Class<com.ss.android.lark.team.entity.Team> r1 = com.ss.android.lark.team.entity.Team.class
            java.util.concurrent.ConcurrentHashMap r0 = r0.mo177165a()
            java.lang.Object r0 = r0.get(r1)
            r1 = 0
            if (r0 == 0) goto L_0x001b
            java.lang.String r2 = "dataMap[key] ?: return null"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            boolean r2 = r0 instanceof com.ss.android.lark.team.entity.Team
            if (r2 == 0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r0 = r1
        L_0x001c:
            com.ss.android.lark.team.entity.Team r0 = (com.ss.android.lark.team.entity.Team) r0
            if (r0 == 0) goto L_0x0030
            r3 = 0
            r4 = 0
            com.ss.android.lark.team.page.member.TeamMemberListPiece$d r2 = new com.ss.android.lark.team.page.member.TeamMemberListPiece$d
            r2.<init>(r8, r9, r0, r1)
            r5 = r2
            kotlin.jvm.functions.k r5 = (kotlin.jvm.functions.Function2) r5
            r6 = 3
            r7 = 0
            r2 = r8
            kotlinx.coroutines.C69388e.m266833b(r2, r3, r4, r5, r6, r7)
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.team.page.member.TeamMemberListPiece.mo189431d(com.ss.android.lark.team.bean.d):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if ((r0 instanceof com.ss.android.lark.team.entity.Team) != false) goto L_0x001c;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m215390f(com.ss.android.lark.team.bean.TeamMemberVO r5) {
        /*
            r4 = this;
            com.ss.android.lark.piece.a.c r0 = r4.mo177203q()
            java.lang.Class<com.ss.android.lark.team.entity.Team> r1 = com.ss.android.lark.team.entity.Team.class
            java.util.concurrent.ConcurrentHashMap r0 = r0.mo177165a()
            java.lang.Object r0 = r0.get(r1)
            r1 = 0
            if (r0 == 0) goto L_0x001b
            java.lang.String r2 = "dataMap[key] ?: return null"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            boolean r2 = r0 instanceof com.ss.android.lark.team.entity.Team
            if (r2 == 0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r0 = r1
        L_0x001c:
            com.ss.android.lark.team.entity.Team r0 = (com.ss.android.lark.team.entity.Team) r0
            if (r0 == 0) goto L_0x0061
            boolean r0 = com.ss.android.lark.team.p2737f.C55443e.m215116a(r0)
            if (r0 != 0) goto L_0x0027
            return
        L_0x0027:
            com.larksuite.component.ui.dialog.o r0 = new com.larksuite.component.ui.dialog.o
            android.content.Context r1 = r4.mo177180C()
            r0.<init>(r1)
            com.ss.android.lark.team.page.member.TeamMemberListPiece$showMemberManageDialog$1 r1 = new com.ss.android.lark.team.page.member.TeamMemberListPiece$showMemberManageDialog$1
            r1.<init>()
            java.util.List r1 = (java.util.List) r1
            com.larksuite.component.ui.dialog.a r0 = r0.mo89205a(r1)
            com.larksuite.component.ui.dialog.o r0 = (com.larksuite.component.ui.dialog.C25644o) r0
            r1 = 2131301628(0x7f0914fc, float:1.822132E38)
            r2 = 2131829849(0x7f112459, float:1.9292679E38)
            com.ss.android.lark.team.page.member.TeamMemberListPiece$f r3 = com.ss.android.lark.team.page.member.TeamMemberListPiece.DialogInterface$OnClickListenerC55548f.f137086a
            android.content.DialogInterface$OnClickListener r3 = (android.content.DialogInterface.OnClickListener) r3
            com.larksuite.component.ui.dialog.g r0 = r0.mo89224a(r1, r2, r3)
            com.larksuite.component.ui.dialog.o r0 = (com.larksuite.component.ui.dialog.C25644o) r0
            com.ss.android.lark.team.page.member.TeamMemberListPiece$g r1 = new com.ss.android.lark.team.page.member.TeamMemberListPiece$g
            r1.<init>(r4, r5)
            android.content.DialogInterface$OnClickListener r1 = (android.content.DialogInterface.OnClickListener) r1
            com.larksuite.component.ui.dialog.a r5 = r0.mo89202a(r1)
            com.larksuite.component.ui.dialog.o r5 = (com.larksuite.component.ui.dialog.C25644o) r5
            com.larksuite.component.ui.dialog.f r5 = r5.mo89233b()
            r5.show()
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.team.page.member.TeamMemberListPiece.m215390f(com.ss.android.lark.team.bean.d):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if ((r0 instanceof com.ss.android.lark.team.entity.Team) != false) goto L_0x001c;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo189432e(com.ss.android.lark.team.bean.TeamMemberVO r13) {
        /*
            r12 = this;
            com.ss.android.lark.piece.a.c r0 = r12.mo177203q()
            java.lang.Class<com.ss.android.lark.team.entity.Team> r1 = com.ss.android.lark.team.entity.Team.class
            java.util.concurrent.ConcurrentHashMap r0 = r0.mo177165a()
            java.lang.Object r0 = r0.get(r1)
            r1 = 0
            if (r0 == 0) goto L_0x001b
            java.lang.String r2 = "dataMap[key] ?: return null"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            boolean r2 = r0 instanceof com.ss.android.lark.team.entity.Team
            if (r2 == 0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r0 = r1
        L_0x001c:
            r3 = r0
            com.ss.android.lark.team.entity.Team r3 = (com.ss.android.lark.team.entity.Team) r3
            if (r3 == 0) goto L_0x0047
            java.lang.String r13 = r13.mo188945a()
            java.lang.String r0 = "member.id"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r13, r0)
            java.lang.Long r13 = kotlin.text.StringsKt.toLongOrNull(r13)
            if (r13 == 0) goto L_0x0047
            long r4 = r13.longValue()
            r7 = 0
            r8 = 0
            com.ss.android.lark.team.page.member.TeamMemberListPiece$a r13 = new com.ss.android.lark.team.page.member.TeamMemberListPiece$a
            r6 = 0
            r1 = r13
            r2 = r12
            r1.<init>(r2, r3, r4, r6)
            r9 = r13
            kotlin.jvm.functions.k r9 = (kotlin.jvm.functions.Function2) r9
            r10 = 3
            r11 = 0
            r6 = r12
            kotlinx.coroutines.C69388e.m266833b(r6, r7, r8, r9, r10, r11)
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.team.page.member.TeamMemberListPiece.mo189432e(com.ss.android.lark.team.bean.d):void");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.team.page.member.TeamMemberListPiece$changeTeamOwner$1", mo239173f = "TeamMemberListPiece.kt", mo239174i = {0}, mo239175l = {143}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.team.page.member.TeamMemberListPiece$a */
    public static final class C55541a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $chatterId;
        final /* synthetic */ Team $team;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TeamMemberListPiece this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55541a(TeamMemberListPiece teamMemberListPiece, Team team, long j, Continuation cVar) {
            super(2, cVar);
            this.this$0 = teamMemberListPiece;
            this.$team = team;
            this.$chatterId = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C55541a aVar = new C55541a(this.this$0, this.$team, this.$chatterId, cVar);
            aVar.p$ = (CoroutineScope) obj;
            return aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C55541a) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            IPieceExport aVar = null;
            if (i == 0) {
                C69097g.m265891a(obj);
                this.L$0 = this.p$;
                this.label = 1;
                if (C69388e.m266829a(Dispatchers.m266326d(), new Function2<CoroutineScope, Continuation<? super Team>, Object>(this, null) {
                    /* class com.ss.android.lark.team.page.member.TeamMemberListPiece.C55541a.C555421 */
                    Object L$0;
                    int label;
                    private CoroutineScope p$;
                    final /* synthetic */ C55541a this$0;

                    {
                        this.this$0 = r1;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                        Intrinsics.checkParameterIsNotNull(cVar, "completion");
                        C555421 r0 = 

                        /* access modifiers changed from: package-private */
                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
                        @DebugMetadata(mo239172c = "com.ss.android.lark.team.page.member.TeamMemberListPiece$removeMember$1", mo239173f = "TeamMemberListPiece.kt", mo239174i = {0, 0}, mo239175l = {SmActions.ACTION_CALLING_EXIT}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "ids"}, mo239178s = {"L$0", "L$1"})
                        /* renamed from: com.ss.android.lark.team.page.member.TeamMemberListPiece$d */
                        public static final class C55545d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ TeamMemberVO $member;
                            final /* synthetic */ Team $team;
                            Object L$0;
                            Object L$1;
                            int label;
                            private CoroutineScope p$;
                            final /* synthetic */ TeamMemberListPiece this$0;

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            C55545d(TeamMemberListPiece teamMemberListPiece, TeamMemberVO dVar, Team team, Continuation cVar) {
                                super(2, cVar);
                                this.this$0 = teamMemberListPiece;
                                this.$member = dVar;
                                this.$team = team;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                                Intrinsics.checkParameterIsNotNull(cVar, "completion");
                                C55545d dVar = new C55545d(this.this$0, this.$member, this.$team, cVar);
                                dVar.p$ = (CoroutineScope) obj;
                                return dVar;
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
                                return ((C55545d) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
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
                                    if (C69388e.m266829a(Dispatchers.m266326d(), new Function2<CoroutineScope, Continuation<? super Team>, Object>(this, null) {
                                        /* class com.ss.android.lark.team.page.member.TeamMemberListPiece.C55545d.C555461 */
                                        Object L$0;
                                        int label;
                                        private CoroutineScope p$;
                                        final /* synthetic */ C55545d this$0;

                                        {
                                            this.this$0 = r1;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                                            Intrinsics.checkParameterIsNotNull(cVar, "completion");
                                            C555461 r0 = 

                                            /* access modifiers changed from: package-private */
                                            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialogInterface", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
                                            /* renamed from: com.ss.android.lark.team.page.member.TeamMemberListPiece$f */
                                            public static final class DialogInterface$OnClickListenerC55548f implements DialogInterface.OnClickListener {

                                                /* renamed from: a */
                                                public static final DialogInterface$OnClickListenerC55548f f137086a = new DialogInterface$OnClickListenerC55548f();

                                                DialogInterface$OnClickListenerC55548f() {
                                                }

                                                public final void onClick(DialogInterface dialogInterface, int i) {
                                                    dialogInterface.dismiss();
                                                }
                                            }

                                            /* access modifiers changed from: package-private */
                                            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
                                            /* renamed from: com.ss.android.lark.team.page.member.TeamMemberListPiece$e */
                                            public static final class DialogInterface$OnClickListenerC55547e implements DialogInterface.OnClickListener {

                                                /* renamed from: a */
                                                final /* synthetic */ Function1 f137084a;

                                                /* renamed from: b */
                                                final /* synthetic */ TeamMemberVO f137085b;

                                                DialogInterface$OnClickListenerC55547e(Function1 function1, TeamMemberVO dVar) {
                                                    this.f137084a = function1;
                                                    this.f137085b = dVar;
                                                }

                                                public final void onClick(DialogInterface dialogInterface, int i) {
                                                    this.f137084a.invoke(this.f137085b);
                                                }
                                            }

                                            /* access modifiers changed from: package-private */
                                            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
                                            /* renamed from: com.ss.android.lark.team.page.member.TeamMemberListPiece$g */
                                            public static final class DialogInterface$OnClickListenerC55549g implements DialogInterface.OnClickListener {

                                                /* renamed from: a */
                                                final /* synthetic */ TeamMemberListPiece f137087a;

                                                /* renamed from: b */
                                                final /* synthetic */ TeamMemberVO f137088b;

                                                DialogInterface$OnClickListenerC55549g(TeamMemberListPiece teamMemberListPiece, TeamMemberVO dVar) {
                                                    this.f137087a = teamMemberListPiece;
                                                    this.f137088b = dVar;
                                                }

                                                public final void onClick(DialogInterface dialogInterface, int i) {
                                                    if (i == 0) {
                                                        this.f137087a.mo189430a(this.f137088b, R.string.Project_T_ConfirmButton, new Function1<TeamMemberVO, Unit>(this) {
                                                            /* class com.ss.android.lark.team.page.member.TeamMemberListPiece.DialogInterface$OnClickListenerC55549g.C555501 */
                                                            final /* synthetic */ DialogInterface$OnClickListenerC55549g this$0;

                                                            {
                                                                this.this$0 = r1;
                                                            }

                                                            /* Return type fixed from 'java.lang.Object' to match base method */
                                                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(TeamMemberVO dVar) {
                                                                invoke(dVar);
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void invoke(TeamMemberVO dVar) {
                                                                Intrinsics.checkParameterIsNotNull(dVar, "member");
                                                                this.this$0.f137087a.mo189432e(dVar);
                                                            }
                                                        });
                                                    } else if (i == 1) {
                                                        this.f137087a.mo189431d(this.f137088b);
                                                    }
                                                }
                                            }

                                            @Override // com.ss.android.lark.team.page.member.TeamMemberViewDependency, com.ss.android.lark.team.page.member.BaseMemberListPiece
                                            /* renamed from: a */
                                            public void mo189334a(View view, TeamMemberVO dVar) {
                                                int i;
                                                Intrinsics.checkParameterIsNotNull(view, "view");
                                                Intrinsics.checkParameterIsNotNull(dVar, "member");
                                                if (mo189348h() == MemberActionType.CHANGE_OWNER) {
                                                    if (mo177203q().mo177169a("intent_will_quit_team", false)) {
                                                        i = R.string.Project_MV_LeaveAndTransferButton;
                                                    } else {
                                                        i = R.string.Project_T_ConfirmButton;
                                                    }
                                                    mo189430a(dVar, i, new C55544c(this));
                                                    return;
                                                }
                                                super.mo189334a(view, dVar);
                                            }

                                            @Override // com.ss.android.lark.team.page.member.TeamMemberViewDependency, com.ss.android.lark.team.page.member.BaseMemberListPiece
                                            /* renamed from: b */
                                            public void mo189340b(View view, TeamMemberVO dVar) {
                                                Intrinsics.checkParameterIsNotNull(view, "view");
                                                Intrinsics.checkParameterIsNotNull(dVar, "member");
                                                if (C55593o.f137159b[mo189348h().ordinal()] != 1) {
                                                    super.mo189340b(view, dVar);
                                                } else {
                                                    m215390f(dVar);
                                                }
                                            }

                                            /* renamed from: a */
                                            public final void mo189430a(TeamMemberVO dVar, int i, Function1<? super TeamMemberVO, Unit> function1) {
                                                new C25639g(mo177180C()).mo89248g(R.string.Project_T_TransferTeamOwner).mo89238b(true).mo89251j(2).mo89242c(UIHelper.mustacheFormat((int) R.string.Project_MV_ToWhoSureTransferTeam, "username", dVar.mo188949c())).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_Cancel, (DialogInterface.OnClickListener) null).mo89224a(R.id.lkui_dialog_btn_right, i, new DialogInterface$OnClickListenerC55547e(function1, dVar)).mo89239c();
                                            }
                                        }
