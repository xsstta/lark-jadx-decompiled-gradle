package com.ss.android.lark.team.p2733c;

import com.ss.android.lark.team.entity.CreateTeamResponse;
import com.ss.android.lark.team.entity.DeleteTeamMemberResponse;
import com.ss.android.lark.team.entity.Item;
import com.ss.android.lark.team.entity.PatchTeamResponse;
import com.ss.android.lark.team.entity.PatchTeamSettingResponse;
import com.ss.android.lark.team.entity.PutTeamMemberResponse;
import com.ss.android.lark.team.entity.Team;

/* renamed from: com.ss.android.lark.team.c.a */
public class C55365a {
    /* renamed from: a */
    public static DeleteTeamMemberResponse m214894a(com.bytedance.lark.pb.im.v1.DeleteTeamMemberResponse deleteTeamMemberResponse) {
        Team team;
        if (deleteTeamMemberResponse.team != null) {
            team = C55366b.m214901a(deleteTeamMemberResponse.team);
        } else {
            team = null;
        }
        DeleteTeamMemberResponse deleteTeamMemberResponse2 = new DeleteTeamMemberResponse();
        deleteTeamMemberResponse2.setTeam(team);
        return deleteTeamMemberResponse2;
    }

    /* renamed from: a */
    public static CreateTeamResponse m214893a(com.bytedance.lark.pb.im.v1.CreateTeamResponse createTeamResponse) {
        Team team;
        Item item = null;
        if (createTeamResponse.team != null) {
            team = C55366b.m214901a(createTeamResponse.team);
        } else {
            team = null;
        }
        if (createTeamResponse.item != null) {
            item = C55366b.m214900a(createTeamResponse.item);
        }
        CreateTeamResponse createTeamResponse2 = new CreateTeamResponse();
        createTeamResponse2.setTeam(team);
        createTeamResponse2.setItem(item);
        return createTeamResponse2;
    }

    /* renamed from: a */
    public static PatchTeamResponse m214895a(com.bytedance.lark.pb.im.v1.PatchTeamResponse patchTeamResponse) {
        Team team;
        if (patchTeamResponse.team != null) {
            team = C55366b.m214901a(patchTeamResponse.team);
        } else {
            team = null;
        }
        PatchTeamResponse patchTeamResponse2 = new PatchTeamResponse();
        patchTeamResponse2.setTeam(team);
        return patchTeamResponse2;
    }

    /* renamed from: a */
    public static PatchTeamSettingResponse m214896a(com.bytedance.lark.pb.im.v1.PatchTeamSettingResponse patchTeamSettingResponse) {
        Team team;
        if (patchTeamSettingResponse.team != null) {
            team = C55366b.m214901a(patchTeamSettingResponse.team);
        } else {
            team = null;
        }
        PatchTeamSettingResponse patchTeamSettingResponse2 = new PatchTeamSettingResponse();
        patchTeamSettingResponse2.setTeam(team);
        return patchTeamSettingResponse2;
    }

    /* renamed from: a */
    public static PutTeamMemberResponse m214897a(com.bytedance.lark.pb.im.v1.PutTeamMemberResponse putTeamMemberResponse) {
        Team team;
        if (putTeamMemberResponse.team != null) {
            team = C55366b.m214901a(putTeamMemberResponse.team);
        } else {
            team = null;
        }
        PutTeamMemberResponse putTeamMemberResponse2 = new PutTeamMemberResponse();
        putTeamMemberResponse2.setTeam(team);
        return putTeamMemberResponse2;
    }
}
