package com.ss.android.lark.team.page.member;

import android.content.Intent;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.piece.core.IPieceExport;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.team.stastics.TeamMemberHitPoint;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\"\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\nH\u0016J\b\u0010\u0016\u001a\u00020\nH\u0016J\b\u0010\u0017\u001a\u00020\nH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/team/page/member/TeamMemberTitlePiece;", "Lcom/ss/android/lark/team/page/member/BaseMemberTitlePiece;", "()V", "memberViewModel", "Lcom/ss/android/lark/team/page/member/BaseMemberViewModel;", "getMemberViewModel", "()Lcom/ss/android/lark/team/page/member/BaseMemberViewModel;", "memberViewModel$delegate", "Lkotlin/Lazy;", "configTitleBar", "", "actionType", "Lcom/ss/android/lark/team/entity/MemberActionType;", "logOnBackLeftActionClick", "onActivityResult", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onAddMemberClick", "onRemoveMemberClick", "removeMemberFromTeam", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TeamMemberTitlePiece extends BaseMemberTitlePiece {

    /* renamed from: g */
    private final Lazy f137125g = LazyKt.lazy(new C55571a(this));

    /* renamed from: o */
    public final BaseMemberViewModel mo189475o() {
        return (BaseMemberViewModel) this.f137125g.getValue();
    }

    @Override // com.ss.android.lark.team.page.member.BaseMemberTitlePiece
    /* renamed from: l */
    public void mo189368l() {
        m215438p();
    }

    @Override // com.ss.android.lark.team.page.member.BaseMemberTitlePiece
    /* renamed from: g */
    public BaseMemberViewModel mo189363g() {
        return mo189475o();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/team/page/member/TeamMemberViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.TeamMemberTitlePiece$a */
    static final class C55571a extends Lambda implements Function0<TeamMemberViewModel> {
        final /* synthetic */ TeamMemberTitlePiece this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55571a(TeamMemberTitlePiece teamMemberTitlePiece) {
            super(0);
            this.this$0 = teamMemberTitlePiece;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TeamMemberViewModel invoke() {
            return (TeamMemberViewModel) this.this$0.mo177183a(TeamMemberViewModel.class);
        }
    }

    @Override // com.ss.android.lark.team.page.member.BaseMemberTitlePiece
    /* renamed from: i */
    public void mo189365i() {
        if (C55596u.f137163b[mo189370n().ordinal()] == 1) {
            TeamMemberHitPoint.m215094b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if ((r0 instanceof com.ss.android.lark.team.entity.Team) != false) goto L_0x001c;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m215438p() {
        /*
            r9 = this;
            com.ss.android.lark.piece.a.c r0 = r9.mo177203q()
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
            if (r0 == 0) goto L_0x0038
            com.ss.android.lark.team.page.member.c r2 = r9.mo189475o()
            java.util.List r2 = r2.getSelectedMemberIdList()
            r4 = 0
            r5 = 0
            com.ss.android.lark.team.page.member.TeamMemberTitlePiece$b r3 = new com.ss.android.lark.team.page.member.TeamMemberTitlePiece$b
            r3.<init>(r9, r0, r2, r1)
            r6 = r3
            kotlin.jvm.functions.k r6 = (kotlin.jvm.functions.Function2) r6
            r7 = 3
            r8 = 0
            r3 = r9
            kotlinx.coroutines.C69388e.m266833b(r3, r4, r5, r6, r7, r8)
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.team.page.member.TeamMemberTitlePiece.m215438p():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if ((r0 instanceof com.ss.android.lark.team.entity.Team) != false) goto L_0x001c;
     */
    @Override // com.ss.android.lark.team.page.member.BaseMemberTitlePiece
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo189367k() {
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
            if (r0 == 0) goto L_0x003c
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r4.mo177180C()
            java.lang.Class<com.ss.android.lark.team.picker.TeamPickerActivity> r3 = com.ss.android.lark.team.picker.TeamPickerActivity.class
            r1.<init>(r2, r3)
            java.io.Serializable r0 = (java.io.Serializable) r0
            java.lang.String r2 = "intent_team"
            r1.putExtra(r2, r0)
            r0 = 3
            java.lang.String r2 = "intent_picker_type"
            r1.putExtra(r2, r0)
            r0 = 1
            r4.mo177187a(r1, r0)
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.team.page.member.TeamMemberTitlePiece.mo189367k():void");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.team.page.member.TeamMemberTitlePiece$removeMemberFromTeam$1", mo239173f = "TeamMemberTitlePiece.kt", mo239174i = {0}, mo239175l = {87}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.team.page.member.TeamMemberTitlePiece$b */
    public static final class C55572b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List $ids;
        final /* synthetic */ Team $team;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TeamMemberTitlePiece this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55572b(TeamMemberTitlePiece teamMemberTitlePiece, Team team, List list, Continuation cVar) {
            super(2, cVar);
            this.this$0 = teamMemberTitlePiece;
            this.$team = team;
            this.$ids = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C55572b bVar = new C55572b(this.this$0, this.$team, this.$ids, cVar);
            bVar.p$ = (CoroutineScope) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C55572b) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
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
                if (C69388e.m266829a(Dispatchers.m266326d(), new Function2<CoroutineScope, Continuation<? super Team>, Object>(this, null) {
                    /* class com.ss.android.lark.team.page.member.TeamMemberTitlePiece.C55572b.C555731 */
                    Object L$0;
                    int label;
                    private CoroutineScope p$;
                    final /* synthetic */ C55572b this$0;

                    {
                        this.this$0 = r1;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                        Intrinsics.checkParameterIsNotNull(cVar, "completion");
                        C555731 r0 = 

                        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
                            if ((r5 instanceof com.ss.android.lark.team.entity.Team) != false) goto L_0x0038;
                         */
                        @Override // com.ss.android.lark.team.page.member.BaseMemberTitlePiece
                        /* renamed from: a */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public void mo189357a(com.ss.android.lark.team.entity.MemberActionType r5) {
                            /*
                            // Method dump skipped, instructions count: 186
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.team.page.member.TeamMemberTitlePiece.mo189357a(com.ss.android.lark.team.entity.MemberActionType):void");
                        }

                        @Override // com.ss.android.lark.piece.core.Piece
                        /* renamed from: a */
                        public boolean mo128689a(int i, int i2, Intent intent) {
                            if (i != 1) {
                                return super.mo128689a(i, i2, intent);
                            }
                            if (i2 != -1) {
                                return true;
                            }
                            mo189475o().refreshMemberList();
                            mo189357a(mo189370n());
                            return true;
                        }
                    }
