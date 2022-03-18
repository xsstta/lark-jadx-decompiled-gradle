package com.ss.android.lark.team.page.setting;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.suite.R;
import com.ss.android.lark.team.common.piece.TeamMemberPiece;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.team.picker.TeamPickerActivity;
import com.ss.android.lark.team.stastics.TeamHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0014J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0014J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0014J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0014¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/team/page/setting/TeamSettingMemberPiece;", "Lcom/ss/android/lark/team/common/piece/TeamMemberPiece;", "Lcom/ss/android/lark/team/page/setting/TeamSettingMemberViewModel;", "()V", "getItemName", "", "getViewModel", "Ljava/lang/Class;", "onClickAddMember", "", "view", "Landroid/view/View;", "onClickRemoveMember", "onClickViewMember", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TeamSettingMemberPiece extends TeamMemberPiece<TeamSettingMemberPiece, TeamSettingMemberViewModel> {
    @Override // com.ss.android.lark.team.common.piece.TeamMemberPiece
    /* renamed from: b */
    public Class<TeamSettingMemberViewModel> mo189023b() {
        return TeamSettingMemberViewModel.class;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if ((r0 instanceof com.ss.android.lark.team.entity.Team) != false) goto L_0x001c;
     */
    @Override // com.ss.android.lark.team.common.piece.TeamMemberPiece
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo189026d() {
        /*
            r3 = this;
            com.ss.android.lark.piece.a.c r0 = r3.mo177203q()
            java.util.concurrent.ConcurrentHashMap r0 = r0.mo177165a()
            java.lang.String r1 = "intent_team"
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
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r0.getName()
            if (r0 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            java.lang.String r0 = ""
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.team.page.setting.TeamSettingMemberPiece.mo189026d():java.lang.String");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.team.common.piece.TeamMemberPiece
    /* renamed from: a */
    public void mo189020a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        TeamSettingMemberViewModel bVar = (TeamSettingMemberViewModel) mo189019a();
        if (bVar == null) {
            return;
        }
        if (bVar.canAddMember()) {
            Intent intent = new Intent(view.getContext(), TeamPickerActivity.class);
            intent.putExtra("intent_picker_type", 3);
            Object obj = mo177203q().mo177165a().get("intent_team");
            Team team = null;
            if (obj != null) {
                Intrinsics.checkExpressionValueIsNotNull(obj, "dataMap[key] ?: return null");
                if (!(obj instanceof Team)) {
                    obj = null;
                }
                team = obj;
            }
            intent.putExtra("intent_team", team);
            mo177187a(intent, 1);
            TeamHitPoint.m215081b("add_team_member", "none");
            return;
        }
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
        UDToast.show(context, (int) R.string.Project_MV_TeamMembersUnableToAdd);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if ((r0 instanceof com.ss.android.lark.team.entity.Team) != false) goto L_0x0021;
     */
    @Override // com.ss.android.lark.team.common.piece.TeamMemberPiece
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo189024b(android.view.View r5) {
        /*
            r4 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r0)
            com.ss.android.lark.piece.a.c r0 = r4.mo177203q()
            java.util.concurrent.ConcurrentHashMap r0 = r0.mo177165a()
            java.lang.String r1 = "intent_team"
            java.lang.Object r0 = r0.get(r1)
            r2 = 0
            if (r0 == 0) goto L_0x0020
            java.lang.String r3 = "dataMap[key] ?: return null"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r3)
            boolean r3 = r0 instanceof com.ss.android.lark.team.entity.Team
            if (r3 == 0) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            r0 = r2
        L_0x0021:
            com.ss.android.lark.team.entity.Team r0 = (com.ss.android.lark.team.entity.Team) r0
            if (r0 == 0) goto L_0x0049
            android.content.Intent r2 = new android.content.Intent
            android.content.Context r5 = r5.getContext()
            java.lang.Class<com.ss.android.lark.team.page.member.TeamMemberActivity> r3 = com.ss.android.lark.team.page.member.TeamMemberActivity.class
            r2.<init>(r5, r3)
            com.ss.android.lark.team.entity.MemberActionType r5 = com.ss.android.lark.team.entity.MemberActionType.REMOVE_MEMBER
            java.io.Serializable r5 = (java.io.Serializable) r5
            java.lang.String r3 = "intent_team_members_action"
            r2.putExtra(r3, r5)
            java.io.Serializable r0 = (java.io.Serializable) r0
            r2.putExtra(r1, r0)
            r5 = 2
            r4.mo177187a(r2, r5)
            java.lang.String r5 = "remove_team_member"
            java.lang.String r0 = "none"
            com.ss.android.lark.team.stastics.TeamHitPoint.m215081b(r5, r0)
        L_0x0049:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.team.page.setting.TeamSettingMemberPiece.mo189024b(android.view.View):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if ((r0 instanceof com.ss.android.lark.team.entity.Team) != false) goto L_0x0021;
     */
    @Override // com.ss.android.lark.team.common.piece.TeamMemberPiece
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo189025c(android.view.View r5) {
        /*
            r4 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r0)
            com.ss.android.lark.piece.a.c r0 = r4.mo177203q()
            java.util.concurrent.ConcurrentHashMap r0 = r0.mo177165a()
            java.lang.String r1 = "intent_team"
            java.lang.Object r0 = r0.get(r1)
            r2 = 0
            if (r0 == 0) goto L_0x0020
            java.lang.String r3 = "dataMap[key] ?: return null"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r3)
            boolean r3 = r0 instanceof com.ss.android.lark.team.entity.Team
            if (r3 == 0) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            r0 = r2
        L_0x0021:
            com.ss.android.lark.team.entity.Team r0 = (com.ss.android.lark.team.entity.Team) r0
            if (r0 == 0) goto L_0x0043
            android.content.Intent r2 = new android.content.Intent
            android.content.Context r5 = r5.getContext()
            java.lang.Class<com.ss.android.lark.team.page.member.TeamMemberActivity> r3 = com.ss.android.lark.team.page.member.TeamMemberActivity.class
            r2.<init>(r5, r3)
            com.ss.android.lark.team.entity.MemberActionType r5 = com.ss.android.lark.team.entity.MemberActionType.BROWSE_LIST
            java.io.Serializable r5 = (java.io.Serializable) r5
            java.lang.String r3 = "intent_team_members_action"
            r2.putExtra(r3, r5)
            java.io.Serializable r0 = (java.io.Serializable) r0
            r2.putExtra(r1, r0)
            r5 = 8
            r4.mo177187a(r2, r5)
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.team.page.setting.TeamSettingMemberPiece.mo189025c(android.view.View):void");
    }
}
