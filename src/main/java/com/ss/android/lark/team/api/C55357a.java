package com.ss.android.lark.team.api;

import com.bytedance.lark.pb.im.v1.GetTeamsByIdsResponse;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.team.C55356a;
import com.ss.android.lark.team.api.entity.BindTeamChatPreCheckResponse;
import com.ss.android.lark.team.api.entity.BindTeamChatResponse;
import com.ss.android.lark.team.api.entity.CreateTeamChatResponse;
import com.ss.android.lark.team.api.entity.UnbindTeamChatResponse;
import com.ss.android.lark.team.api.entity.UpgradeToTeamResponse;
import com.ss.android.lark.team.entity.Item;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.team.p2733c.C55366b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.team.api.a */
public class C55357a {
    /* renamed from: a */
    public static BindTeamChatPreCheckResponse m214863a(com.ss.android.lark.pb.team.BindTeamChatPreCheckResponse bindTeamChatPreCheckResponse) {
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isNotEmpty(bindTeamChatPreCheckResponse.mto_add_team_member_ids)) {
            arrayList.addAll(bindTeamChatPreCheckResponse.mto_add_team_member_ids);
        }
        ArrayList arrayList2 = new ArrayList();
        if (CollectionUtils.isNotEmpty(bindTeamChatPreCheckResponse.mto_add_chat_chatter_ids)) {
            arrayList2.addAll(bindTeamChatPreCheckResponse.mto_add_chat_chatter_ids);
        }
        return new BindTeamChatPreCheckResponse(arrayList, arrayList2, bindTeamChatPreCheckResponse.mchat_chatters_version, bindTeamChatPreCheckResponse.mto_add_team_member_count.intValue(), bindTeamChatPreCheckResponse.mto_add_chat_chatter_count.intValue());
    }

    /* renamed from: a */
    public static BindTeamChatResponse m214864a(com.bytedance.lark.pb.im.v1.BindTeamChatResponse bindTeamChatResponse) {
        Team team;
        Chat chat;
        Item item = null;
        if (bindTeamChatResponse.team != null) {
            team = C55366b.m214901a(bindTeamChatResponse.team);
        } else {
            team = null;
        }
        if (bindTeamChatResponse.chat != null) {
            chat = C55356a.m214819a().mo144124c().mo144134a().getChat(bindTeamChatResponse.chat);
        } else {
            chat = null;
        }
        if (bindTeamChatResponse.item != null) {
            item = C55366b.m214900a(bindTeamChatResponse.item);
        }
        return new BindTeamChatResponse(team, chat, item);
    }

    /* renamed from: a */
    public static CreateTeamChatResponse m214865a(com.bytedance.lark.pb.im.v1.CreateTeamChatResponse createTeamChatResponse) {
        Chat chat;
        if (createTeamChatResponse.chat != null) {
            chat = C55356a.m214819a().mo144124c().mo144134a().getChat(createTeamChatResponse.chat);
        } else {
            chat = null;
        }
        CreateTeamChatResponse createTeamChatResponse2 = new CreateTeamChatResponse();
        createTeamChatResponse2.setChat(chat);
        return createTeamChatResponse2;
    }

    /* renamed from: a */
    public static UnbindTeamChatResponse m214866a(com.bytedance.lark.pb.im.v1.UnbindTeamChatResponse unbindTeamChatResponse) {
        Chat chat;
        Item item = null;
        if (unbindTeamChatResponse.chat != null) {
            chat = C55356a.m214819a().mo144124c().mo144134a().getChat(unbindTeamChatResponse.chat);
        } else {
            chat = null;
        }
        if (unbindTeamChatResponse.item != null) {
            item = C55366b.m214900a(unbindTeamChatResponse.item);
        }
        return new UnbindTeamChatResponse(chat, item);
    }

    /* renamed from: a */
    public static UpgradeToTeamResponse m214867a(com.bytedance.lark.pb.im.v1.UpgradeToTeamResponse upgradeToTeamResponse) {
        Team team;
        Item item;
        Item item2;
        Chat chat = null;
        if (upgradeToTeamResponse.team != null) {
            team = C55366b.m214901a(upgradeToTeamResponse.team);
        } else {
            team = null;
        }
        if (upgradeToTeamResponse.team_item != null) {
            item = C55366b.m214900a(upgradeToTeamResponse.team_item);
        } else {
            item = null;
        }
        if (upgradeToTeamResponse.chat_item != null) {
            item2 = C55366b.m214900a(upgradeToTeamResponse.chat_item);
        } else {
            item2 = null;
        }
        if (upgradeToTeamResponse.chat != null) {
            chat = C55356a.m214819a().mo144124c().mo144134a().getChat(upgradeToTeamResponse.chat);
        }
        return new UpgradeToTeamResponse(team, item, chat, item2);
    }

    /* renamed from: a */
    public static Map<Long, Team> m214868a(GetTeamsByIdsResponse getTeamsByIdsResponse) {
        HashMap hashMap = new HashMap();
        if (CollectionUtils.isEmpty(getTeamsByIdsResponse.teams)) {
            return hashMap;
        }
        for (Long l : getTeamsByIdsResponse.teams.keySet()) {
            long longValue = l.longValue();
            if (getTeamsByIdsResponse.teams.get(Long.valueOf(longValue)) != null) {
                hashMap.put(Long.valueOf(longValue), C55366b.m214901a(getTeamsByIdsResponse.teams.get(Long.valueOf(longValue))));
            }
        }
        return hashMap;
    }
}
