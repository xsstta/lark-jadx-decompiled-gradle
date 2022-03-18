package com.ss.android.lark.team.page.edit;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.team.entity.PatchTeamResponse;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.team.service.TeamService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J&\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/team/page/edit/TeamNameEditDelegate;", "Lcom/ss/android/lark/team/page/edit/ITeamEditDelegate;", "()V", "canBeEmpty", "", "getCurrentFieldValue", "", "team", "Lcom/ss/android/lark/team/entity/Team;", "maxLength", "", "titleRes", "updateField", "", "newValue", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/team/entity/PatchTeamResponse;", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.team.page.a.c */
public final class TeamNameEditDelegate implements ITeamEditDelegate {
    @Override // com.ss.android.lark.team.page.edit.ITeamEditDelegate
    /* renamed from: a */
    public int mo189263a() {
        return R.string.Project_MV_AsteriskTeamName;
    }

    @Override // com.ss.android.lark.team.page.edit.ITeamEditDelegate
    /* renamed from: b */
    public int mo189266b() {
        return 60;
    }

    @Override // com.ss.android.lark.team.page.edit.ITeamEditDelegate
    /* renamed from: c */
    public boolean mo189267c() {
        return false;
    }

    @Override // com.ss.android.lark.team.page.edit.ITeamEditDelegate
    /* renamed from: a */
    public String mo189264a(Team team) {
        Intrinsics.checkParameterIsNotNull(team, "team");
        return team.getName();
    }

    @Override // com.ss.android.lark.team.page.edit.ITeamEditDelegate
    /* renamed from: a */
    public void mo189265a(Team team, String str, IGetDataCallback<PatchTeamResponse> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(team, "team");
        Intrinsics.checkParameterIsNotNull(str, "newValue");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        TeamService.f136826a.mo189065a(team.getId(), str, iGetDataCallback);
    }
}
