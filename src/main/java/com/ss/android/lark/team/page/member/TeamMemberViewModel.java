package com.ss.android.lark.team.page.member;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H@ø\u0001\u0000¢\u0006\u0002\u0010\t\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/team/page/member/TeamMemberViewModel;", "Lcom/ss/android/lark/team/page/member/BaseMemberViewModel;", "()V", "transformDataList", "", "Lcom/ss/android/lark/team/bean/TeamMemberVO;", "chatterList", "", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.team.page.member.y */
public final class TeamMemberViewModel extends BaseMemberViewModel {

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H@"}, d2 = {"transformDataList", "", "chatterList", "", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "continuation", "Lkotlin/coroutines/Continuation;", "", "Lcom/ss/android/lark/team/bean/TeamMemberVO;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.team.page.member.TeamMemberViewModel", mo239173f = "TeamMemberViewModel.kt", mo239174i = {0, 0}, mo239175l = {10}, mo239176m = "transformDataList", mo239177n = {"this", "chatterList"}, mo239178s = {"L$0", "L$1"})
    /* renamed from: com.ss.android.lark.team.page.member.y$a */
    public static final class C55601a extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TeamMemberViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55601a(TeamMemberViewModel yVar, Continuation cVar) {
            super(cVar);
            this.this$0 = yVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.transformDataList(null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a A[LOOP:0: B:17:0x0054->B:19:0x005a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.ss.android.lark.team.page.member.BaseMemberViewModel
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object transformDataList(java.util.List<? extends com.ss.android.lark.chat.entity.chatter.ChatChatter> r5, kotlin.coroutines.Continuation<? super java.util.List<com.ss.android.lark.team.bean.TeamMemberVO>> r6) {
        /*
        // Method dump skipped, instructions count: 134
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.team.page.member.TeamMemberViewModel.transformDataList(java.util.List, kotlin.coroutines.c):java.lang.Object");
    }
}
