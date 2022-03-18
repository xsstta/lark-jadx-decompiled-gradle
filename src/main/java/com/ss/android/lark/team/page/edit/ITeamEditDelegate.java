package com.ss.android.lark.team.page.edit;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.team.entity.PatchTeamResponse;
import com.ss.android.lark.team.entity.Team;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\tH'J&\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH&¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/team/page/edit/ITeamEditDelegate;", "", "canBeEmpty", "", "getCurrentFieldValue", "", "team", "Lcom/ss/android/lark/team/entity/Team;", "maxLength", "", "titleRes", "updateField", "", "newValue", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/team/entity/PatchTeamResponse;", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.team.page.a.a */
public interface ITeamEditDelegate {
    /* renamed from: a */
    int mo189263a();

    /* renamed from: a */
    String mo189264a(Team team);

    /* renamed from: a */
    void mo189265a(Team team, String str, IGetDataCallback<PatchTeamResponse> iGetDataCallback);

    /* renamed from: b */
    int mo189266b();

    /* renamed from: c */
    boolean mo189267c();
}
