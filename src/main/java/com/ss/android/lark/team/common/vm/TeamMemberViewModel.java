package com.ss.android.lark.team.common.vm;

import androidx.lifecycle.C1177w;
import com.ss.android.lark.piece.data.PieceViewModel;
import com.ss.android.lark.team.bean.AbsTeamMember;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0004J\b\u0010\u0010\u001a\u00020\u000eH&J\b\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\u0012H&J \u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0004J\u0016\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0004R)\u0010\u0003\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/team/common/vm/TeamMemberViewModel;", "Lcom/ss/android/lark/piece/data/PieceViewModel;", "()V", "memberCount", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Triple;", "", "getMemberCount", "()Landroidx/lifecycle/MutableLiveData;", "memberList", "", "Lcom/ss/android/lark/team/bean/AbsTeamMember;", "getMemberList", "resetTeamMembers", "", "members", "setup", "supportAddMember", "", "supportRemoveMember", "updateMemberCount", "userCount", "chatCount", "departmentCount", "list", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.team.common.a.a */
public abstract class TeamMemberViewModel extends PieceViewModel {
    private final C1177w<Triple<Integer, Integer, Integer>> memberCount = new C1177w<>(new Triple(0, 0, 0));
    private final C1177w<List<AbsTeamMember>> memberList = new C1177w<>(CollectionsKt.emptyList());

    public abstract void setup();

    public abstract boolean supportAddMember();

    public abstract boolean supportRemoveMember();

    public final C1177w<Triple<Integer, Integer, Integer>> getMemberCount() {
        return this.memberCount;
    }

    public final C1177w<List<AbsTeamMember>> getMemberList() {
        return this.memberList;
    }

    public final void resetTeamMembers(List<? extends AbsTeamMember> list) {
        Intrinsics.checkParameterIsNotNull(list, "members");
        this.memberList.mo5926a((List<AbsTeamMember>) list);
    }

    /* access modifiers changed from: protected */
    public final void updateMemberCount(List<? extends AbsTeamMember> list) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (AbsTeamMember aVar : list) {
            int i4 = C55367b.f136687a[aVar.memberType().ordinal()];
            if (i4 == 1) {
                i++;
            } else if (i4 == 2) {
                i2++;
            } else if (i4 == 3) {
                i3++;
            }
        }
        this.memberCount.mo5926a(new Triple<>(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    public final void updateMemberCount(int i, int i2, int i3) {
        this.memberCount.mo5926a(new Triple<>(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
    }
}
