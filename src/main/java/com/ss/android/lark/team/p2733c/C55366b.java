package com.ss.android.lark.team.p2733c;

import com.bytedance.lark.pb.basic.v1.AvatarMeta;
import com.bytedance.lark.pb.basic.v1.PickEntities;
import com.ss.android.lark.team.entity.Item;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.team.entity.TeamSetting;
import com.ss.android.lark.team.entity.TeamUserEntity;

/* renamed from: com.ss.android.lark.team.c.b */
public class C55366b {
    /* renamed from: a */
    public static PickEntities m214899a(com.ss.android.lark.team.entity.PickEntities pickEntities) {
        return new PickEntities(PickEntities.PickType.fromValue(pickEntities.getPickType().getValue()), pickEntities.getPickIds());
    }

    /* renamed from: a */
    public static TeamSetting m214902a(com.bytedance.lark.pb.basic.v1.TeamSetting teamSetting) {
        TeamSetting.CreateTeamChatPermission fromValue = TeamSetting.CreateTeamChatPermission.fromValue(teamSetting.create_team_chat_permission.getValue());
        TeamSetting.AddMemberPermission fromValue2 = TeamSetting.AddMemberPermission.fromValue(teamSetting.add_member_permission.getValue());
        TeamSetting.BindTeamChatPermission fromValue3 = TeamSetting.BindTeamChatPermission.fromValue(teamSetting.bind_team_chat_permission.getValue());
        TeamSetting teamSetting2 = new TeamSetting();
        teamSetting2.setCreateTeamChatPermission(fromValue);
        teamSetting2.setAddMemberPermission(fromValue2);
        teamSetting2.setBindTeamChatPermission(fromValue3);
        return teamSetting2;
    }

    /* renamed from: a */
    public static AvatarMeta m214898a(com.ss.android.lark.chat.entity.chat.AvatarMeta avatarMeta) {
        return new AvatarMeta.C14696a().mo54115a(AvatarMeta.Type.fromValue(avatarMeta.getType().getValue())).mo54117a(avatarMeta.getText()).mo54116a(Integer.valueOf(avatarMeta.getColor())).mo54119b(Integer.valueOf(avatarMeta.getBorderColor())).mo54120c(Integer.valueOf(avatarMeta.getBackgroundColor())).mo54121d(Integer.valueOf(avatarMeta.getCenterColor())).build();
    }

    /* renamed from: a */
    public static Item m214900a(com.bytedance.lark.pb.basic.v1.Item item) {
        Item.Type fromValue = Item.Type.fromValue(item.entity_type.getValue());
        Item item2 = new Item();
        item2.setId(item.id.longValue());
        item2.setEntityId(item.entity_id);
        item2.setEntityType(fromValue);
        item2.setParentId(item.parent_id.longValue());
        item2.setOrderWeight(item.order_weight.longValue());
        item2.setNameWeight(item.name_weight);
        item2.setVersion(item.version.longValue());
        item2.setHidden(item.is_hidden.booleanValue());
        return item2;
    }

    /* renamed from: a */
    public static Team m214901a(com.bytedance.lark.pb.basic.v1.Team team) {
        TeamSetting teamSetting;
        Team.Status fromValue = Team.Status.fromValue(team.status.getValue());
        TeamUserEntity teamUserEntity = null;
        if (team.setting != null) {
            teamSetting = m214902a(team.setting);
        } else {
            teamSetting = null;
        }
        if (team.user_entity != null) {
            teamUserEntity = m214903a(team.user_entity);
        }
        Team team2 = new Team();
        team2.setId(team.id.longValue());
        team2.setName(team.name);
        team2.setDescription(team.description);
        team2.setAvatarKey(team.avatar_key);
        team2.setStatus(fromValue);
        team2.setOwnerId(team.owner_id.longValue());
        team2.setMemberCount(team.member_count.intValue());
        team2.setDefaultChatId(team.default_chat_id.longValue());
        team2.setCreateTime(team.create_time.longValue());
        team2.setVersion(team.version.longValue());
        team2.setTeamSetting(teamSetting);
        team2.setTeamUserEntity(teamUserEntity);
        return team2;
    }

    /* renamed from: a */
    public static TeamUserEntity m214903a(com.bytedance.lark.pb.basic.v1.TeamUserEntity teamUserEntity) {
        TeamUserEntity.Role fromValue = TeamUserEntity.Role.fromValue(teamUserEntity.user_role.getValue());
        TeamUserEntity teamUserEntity2 = new TeamUserEntity();
        teamUserEntity2.setRole(fromValue);
        return teamUserEntity2;
    }
}
