package com.ss.android.lark.team.page.member;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048VX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/team/page/member/TeamChatMemberPreviewPiece;", "Lcom/ss/android/lark/team/page/member/TeamMemberPreviewPiece;", "()V", "memberViewModel", "Lcom/ss/android/lark/team/page/member/BaseMemberViewModel;", "getMemberViewModel", "()Lcom/ss/android/lark/team/page/member/BaseMemberViewModel;", "memberViewModel$delegate", "Lkotlin/Lazy;", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TeamChatMemberPreviewPiece extends TeamMemberPreviewPiece {

    /* renamed from: j */
    private final Lazy f137074j = LazyKt.lazy(new C55528a(this));

    @Override // com.ss.android.lark.team.page.member.TeamMemberPreviewPiece
    /* renamed from: a */
    public BaseMemberViewModel mo189413a() {
        return (BaseMemberViewModel) this.f137074j.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/team/page/member/TeamChatMemberViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.TeamChatMemberPreviewPiece$a */
    static final class C55528a extends Lambda implements Function0<TeamChatMemberViewModel> {
        final /* synthetic */ TeamChatMemberPreviewPiece this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55528a(TeamChatMemberPreviewPiece teamChatMemberPreviewPiece) {
            super(0);
            this.this$0 = teamChatMemberPreviewPiece;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TeamChatMemberViewModel invoke() {
            return (TeamChatMemberViewModel) this.this$0.mo177183a(TeamChatMemberViewModel.class);
        }
    }
}
