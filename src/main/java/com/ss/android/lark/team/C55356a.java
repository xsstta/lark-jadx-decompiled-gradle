package com.ss.android.lark.team;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.chat.AvatarMeta;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.team.api.entity.UnbindTeamChatResponse;
import com.ss.android.lark.team.dependency.ITeamModuleDependency;
import com.ss.android.lark.team.entity.Item;
import com.ss.android.lark.team.entity.MemberActionType;
import com.ss.android.lark.team.entity.PatchTeamResponse;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.team.listener.ITeamPushService;
import com.ss.android.lark.team.page.create_team.CreateTeamActivity;
import com.ss.android.lark.team.page.member.TeamMemberActivity;
import com.ss.android.lark.team.service.TeamPushService;
import com.ss.android.lark.team.service.TeamService;
import com.ss.android.lark.team.util.TeamMenuDialogHelper;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.team.a */
public class C55356a {

    /* renamed from: a */
    private static ITeamModuleDependency f136675a;

    /* renamed from: a */
    public static ITeamModuleDependency m214819a() {
        return f136675a;
    }

    /* renamed from: b */
    public ITeamPushService mo188877b() {
        return TeamPushService.f136810a;
    }

    /* renamed from: c */
    public boolean mo188880c() {
        return m214819a().mo144122a("lark.core.use_team");
    }

    public C55356a(ITeamModuleDependency aVar) {
        f136675a = aVar;
    }

    /* renamed from: a */
    public void mo188875a(Context context) {
        context.startActivity(new Intent(context, CreateTeamActivity.class));
    }

    /* renamed from: a */
    public void mo188873a(Activity activity, Team team) {
        new TeamMenuDialogHelper(activity, team).mo189208a();
    }

    /* renamed from: a */
    public void mo188870a(long j, String str, IGetDataCallback<UnbindTeamChatResponse> iGetDataCallback) {
        TeamService.f136826a.mo189079c(j, str, iGetDataCallback);
    }

    /* renamed from: a */
    public void mo188872a(long j, boolean z, IGetDataCallback<Team> iGetDataCallback) {
        TeamService.f136826a.mo189070a(j, z, iGetDataCallback);
    }

    /* renamed from: b */
    public void mo188878b(Activity activity, Team team, Chat chat) {
        Intent intent = new Intent(activity, TeamMemberActivity.class);
        intent.putExtra("intent_team", team);
        intent.putExtra("intent_chat", chat);
        intent.putExtra("intent_team_members_action", MemberActionType.SELECT_MEMBER_FOR_PRIVATE_CHAT);
        activity.startActivity(intent);
    }

    /* renamed from: c */
    public void mo188879c(Activity activity, Team team, Chat chat) {
        Intent intent = new Intent(activity, TeamMemberActivity.class);
        intent.putExtra("intent_team", team);
        intent.putExtra("intent_chat", chat);
        intent.putExtra("intent_team_members_action", MemberActionType.REMOVE_MEMBER);
        activity.startActivity(intent);
    }

    /* renamed from: a */
    public void mo188874a(Activity activity, Team team, Chat chat) {
        Intent intent = new Intent(activity, TeamMemberActivity.class);
        intent.putExtra("intent_team", team);
        intent.putExtra("intent_chat", chat);
        intent.putExtra("intent_team_members_action", MemberActionType.BROWSE_LIST);
        activity.startActivity(intent);
    }

    /* renamed from: a */
    public void mo188876a(List<String> list, Item.Type type, IGetDataCallback<Map<String, Item>> iGetDataCallback) {
        TeamService.f136826a.mo189074a(list, type, iGetDataCallback);
    }

    /* renamed from: a */
    public void mo188871a(long j, String str, AvatarMeta avatarMeta, IGetDataCallback<PatchTeamResponse> iGetDataCallback) {
        TeamService.f136826a.mo189066a(j, str, avatarMeta, iGetDataCallback);
    }
}
