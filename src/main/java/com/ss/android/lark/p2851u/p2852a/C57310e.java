package com.ss.android.lark.p2851u.p2852a;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Chat;
import com.bytedance.lark.pb.basic.v1.ChatJoinLeaveHistory;
import com.bytedance.lark.pb.basic.v1.ChatMailSetting;
import com.bytedance.lark.pb.basic.v1.ChatOptionInfo;
import com.bytedance.lark.pb.basic.v1.MediaContent;
import com.bytedance.lark.pb.basic.v1.OpenApp;
import com.bytedance.lark.pb.media.v1.ChatResourceType;
import com.bytedance.lark.pb.media.v1.GetChatResourcesResponse;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.larksuite.framework.utils.C26249aa;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.biz.im.api.BotTipsContent;
import com.ss.android.lark.biz.im.api.ExtraConfig;
import com.ss.android.lark.biz.im.api.ImageHistoryResponse;
import com.ss.android.lark.biz.im.api.OpenApp;
import com.ss.android.lark.chat.entity.chat.AvatarMeta;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.ChatAnnouncement;
import com.ss.android.lark.chat.entity.chat.ChatJoinLeaveHistory;
import com.ss.android.lark.chat.entity.chat.ChatSetting;
import com.ss.android.lark.chat.entity.chat.TeamChatType;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.chat.entity.media.MediaExtra;
import com.ss.android.lark.chat.entity.media.MediaImageSet;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageIdentity;
import com.ss.android.lark.dto.p1815d.C36871a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.u.a.e */
public class C57310e {
    /* renamed from: a */
    public static List<ImageSet> m222086a(GetChatResourcesResponse.MessageMeta messageMeta, String str) {
        ImageSet imageSet;
        com.bytedance.lark.pb.basic.v1.ImageSet imageSet2;
        String str2 = messageMeta.id;
        long longValue = messageMeta.create_time.longValue();
        String str3 = messageMeta.thread_id;
        int intValue = messageMeta.thread_position.intValue();
        ArrayList arrayList = new ArrayList();
        for (GetChatResourcesResponse.Resource resource : messageMeta.resources) {
            if (resource.type == ChatResourceType.IMAGE) {
                imageSet = new ImageSet();
                imageSet.setOriginSource(resource.is_origin_source.booleanValue());
                imageSet.setOriginSize(resource.origin_size.longValue());
                imageSet2 = resource.image;
            } else if (resource.type == ChatResourceType.VIDEO) {
                MediaExtra a = m222082a(resource.video);
                MediaImageSet mediaImageSet = new MediaImageSet();
                mediaImageSet.setMediaExtra(a);
                imageSet2 = resource.video.media_content.image;
                imageSet = mediaImageSet;
            }
            C57321j.m222117a(imageSet2, imageSet);
            MessageIdentity messageIdentity = new MessageIdentity(str2, str);
            messageIdentity.setCreateTime(longValue);
            messageIdentity.setThreadId(str3);
            messageIdentity.setThreadPosition(intValue);
            messageIdentity.setSourceType(Message.SourceType.TYPE_FROM_CHAT_HISTORY);
            imageSet.setMessageIdentity(messageIdentity);
            arrayList.add(imageSet);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Map<String, ChatSetting> m222088a(Map<String, Chat> map) {
        return C26249aa.m94985a(map, new C26249aa.AbstractC26250a<Chat, ChatSetting>() {
            /* class com.ss.android.lark.p2851u.p2852a.C57310e.C573111 */

            /* renamed from: a */
            public ChatSetting get(Chat chat) {
                return C57310e.m222081a(chat.id, chat.is_remind.booleanValue(), chat.update_time.longValue(), chat.is_in_box.booleanValue());
            }
        });
    }

    /* renamed from: a */
    private static String m222084a(Chat.Announcement announcement) {
        if (announcement != null && !TextUtils.isEmpty(announcement.content)) {
            return announcement.content.substring(0, Math.min(1000, announcement.content.length()));
        }
        return "";
    }

    /* renamed from: a */
    private static String m222085a(ChatAnnouncement chatAnnouncement, Chat chat) {
        if (TextUtils.isEmpty(chatAnnouncement.getDocUrl())) {
            return "";
        }
        return chatAnnouncement.getDocUrl() + "?open_type=announce&chat_id=" + chat.id + "&from=group_announcement";
    }

    /* renamed from: a */
    public static Map<String, com.ss.android.lark.chat.entity.chat.Chat> m222089a(Map<String, Chat> map, Map<String, ChatOptionInfo> map2) {
        return m222090a(map, map2, null);
    }

    /* renamed from: a */
    public static Map<String, com.ss.android.lark.chat.entity.chat.Chat> m222090a(Map<String, Chat> map, Map<String, ChatOptionInfo> map2, Map<String, ChatMailSetting> map3) {
        ChatOptionInfo chatOptionInfo;
        HashMap hashMap = new HashMap();
        for (String str : map.keySet()) {
            Chat chat = map.get(str);
            com.ss.android.lark.chat.entity.chat.ChatOptionInfo chatOptionInfo2 = new com.ss.android.lark.chat.entity.chat.ChatOptionInfo();
            if (!(!CollectionUtils.isNotEmpty(map2) || map2.get(str) == null || (chatOptionInfo = map2.get(str)) == null)) {
                chatOptionInfo2.setAnnounceIsUnread(chatOptionInfo.announce.booleanValue());
                chatOptionInfo2.setId(chatOptionInfo.id);
            }
            com.ss.android.lark.chat.entity.chat.Chat a = m222079a(chat, map3);
            if (a != null) {
                a.setChatOptionInfo(chatOptionInfo2);
                hashMap.put(str, a);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static C36871a m222083a(String str, Map<String, Chat> map, Map<String, OpenApp> map2, Map<String, Chatter> map3, Map<String, ChatOptionInfo> map4) {
        com.ss.android.lark.biz.im.api.OpenApp openApp;
        ChatOptionInfo chatOptionInfo;
        HashMap hashMap = new HashMap();
        for (String str2 : map.keySet()) {
            com.ss.android.lark.chat.entity.chat.Chat a = m222078a(map.get(str2));
            if (a != null) {
                hashMap.put(str2, a);
            }
        }
        HashMap hashMap2 = new HashMap();
        for (String str3 : map2.keySet()) {
            OpenApp openApp2 = map2.get(str3);
            if (openApp2 != null) {
                hashMap2.put(str3, m222075a(openApp2));
            }
        }
        Chatter chatter = null;
        Iterator<Map.Entry<String, Chatter>> it = map3.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Chatter value = it.next().getValue();
            if (value != null && value.getType() == Chatter.ChatterType.BOT) {
                chatter = value;
                break;
            }
        }
        com.ss.android.lark.chat.entity.chat.Chat chat = (com.ss.android.lark.chat.entity.chat.Chat) hashMap.get(str);
        com.ss.android.lark.chat.entity.chat.ChatOptionInfo chatOptionInfo2 = new com.ss.android.lark.chat.entity.chat.ChatOptionInfo();
        if (!(!CollectionUtils.isNotEmpty(map4) || map4.get(str) == null || (chatOptionInfo = map4.get(str)) == null)) {
            chatOptionInfo2.setAnnounceIsUnread(chatOptionInfo.announce.booleanValue());
            chatOptionInfo2.setId(chatOptionInfo.id);
        }
        if (chat != null) {
            chat.setChatOptionInfo(chatOptionInfo2);
        }
        if (chatter == null || hashMap2.size() == 0) {
            openApp = new com.ss.android.lark.biz.im.api.OpenApp();
        } else {
            openApp = (com.ss.android.lark.biz.im.api.OpenApp) hashMap2.get(chatter.getOpenAppId());
            if (openApp == null) {
                openApp = new com.ss.android.lark.biz.im.api.OpenApp();
            }
        }
        return new C36871a(chat, openApp, chatter);
    }

    /* renamed from: a */
    public static List<com.ss.android.lark.chat.entity.chat.Chat> m222087a(List<Chat> list) {
        return C26249aa.m94984a(list, new C26249aa.AbstractC26250a<Chat, com.ss.android.lark.chat.entity.chat.Chat>() {
            /* class com.ss.android.lark.p2851u.p2852a.C57310e.C573122 */

            /* renamed from: a */
            public com.ss.android.lark.chat.entity.chat.Chat get(Chat chat) {
                return C57310e.m222078a(chat);
            }
        });
    }

    /* renamed from: a */
    public static com.ss.android.lark.chat.entity.chat.Chat m222078a(Chat chat) {
        return m222079a(chat, (Map<String, ChatMailSetting>) null);
    }

    /* renamed from: b */
    public static Map<String, com.ss.android.lark.chat.entity.chat.Chat> m222093b(Map<String, Chat> map) {
        return m222089a(map, (Map<String, ChatOptionInfo>) null);
    }

    /* renamed from: a */
    public static Chat.Type m222077a(Chat.Type type) {
        if (type == Chat.Type.P2P) {
            return Chat.Type.P2P;
        }
        return Chat.Type.GROUP;
    }

    /* renamed from: b */
    public static List<ChatJoinLeaveHistory> m222092b(List<com.bytedance.lark.pb.basic.v1.ChatJoinLeaveHistory> list) {
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isEmpty(list)) {
            return arrayList;
        }
        for (com.bytedance.lark.pb.basic.v1.ChatJoinLeaveHistory chatJoinLeaveHistory : list) {
            arrayList.add(m222080a(chatJoinLeaveHistory));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static com.ss.android.lark.biz.im.api.OpenApp m222075a(OpenApp openApp) {
        ExtraConfig extraConfig;
        com.ss.android.lark.biz.im.api.OpenApp openApp2 = new com.ss.android.lark.biz.im.api.OpenApp();
        openApp2.setAppId(openApp.app_id);
        openApp2.setAvatarKey(openApp.avatar_key);
        openApp2.setBotId(openApp.bot_id);
        if (openApp.bot_tips != null) {
            openApp2.setBotTips(new BotTipsContent(openApp.bot_tips.i18n_msg, openApp.bot_tips.admin_id, openApp.bot_tips.i18n_admin_name));
        }
        openApp2.setDesc(openApp.i18n_desc);
        openApp2.setId(openApp.id);
        openApp2.setLastHappen(openApp.last_happen);
        openApp2.setName(openApp.i18n_name);
        openApp2.setState(OpenApp.State.fromValue(openApp.state.getValue()));
        openApp2.setTips(openApp.tips);
        openApp2.setVersion(openApp.version);
        openApp2.setChatable(OpenApp.Chatable.fromValue(openApp.chatable.getValue()));
        try {
            extraConfig = (ExtraConfig) new Gson().fromJson(openApp.extra_config, ExtraConfig.class);
        } catch (JsonSyntaxException unused) {
            extraConfig = new ExtraConfig();
        }
        openApp2.setExtraConfig(extraConfig);
        return openApp2;
    }

    /* renamed from: b */
    public static ChatAnnouncement m222091b(com.bytedance.lark.pb.basic.v1.Chat chat) {
        long j;
        String str;
        boolean z;
        ChatAnnouncement chatAnnouncement = new ChatAnnouncement();
        chatAnnouncement.setChatId(chat.id);
        chatAnnouncement.setContent(m222084a(chat.announcement));
        if (chat.announcement == null) {
            j = 0;
        } else {
            j = chat.announcement.update_time.longValue();
        }
        chatAnnouncement.setUpdateTime(j);
        String str2 = "";
        if (chat.announcement == null) {
            str = str2;
        } else {
            str = chat.announcement.last_editor_id;
        }
        chatAnnouncement.setLastEditorId(str);
        if (chat.announcement != null) {
            str2 = chat.announcement.doc_url;
        }
        chatAnnouncement.setDocUrl(str2);
        chatAnnouncement.setAnnounceUrl(m222085a(chatAnnouncement, chat));
        if (chat.announcement == null) {
            z = false;
        } else {
            z = chat.announcement.use_opendoc.booleanValue();
        }
        chatAnnouncement.setUseOpenDoc(z);
        return chatAnnouncement;
    }

    /* renamed from: c */
    private static Map<String, ChatJoinLeaveHistory.ContentValue> m222094c(Map<String, ChatJoinLeaveHistory.ContentValue> map) {
        HashMap hashMap = new HashMap();
        if (CollectionUtils.isEmpty(map)) {
            return hashMap;
        }
        for (String str : map.keySet()) {
            ChatJoinLeaveHistory.ContentValue contentValue = map.get(str);
            hashMap.put(str, new ChatJoinLeaveHistory.ContentValue(contentValue.id, contentValue.doc_url, contentValue.display_text, contentValue.type.getValue(), contentValue.unauthorized_doc.booleanValue()));
        }
        return hashMap;
    }

    /* renamed from: a */
    public static AvatarMeta m222076a(com.bytedance.lark.pb.basic.v1.AvatarMeta avatarMeta) {
        AvatarMeta avatarMeta2 = new AvatarMeta();
        avatarMeta2.setColor(avatarMeta.color.intValue());
        avatarMeta2.setText(avatarMeta.text);
        avatarMeta2.setType(AvatarMeta.Type.fromValue(avatarMeta.type.getValue()));
        avatarMeta2.setBorderColor(avatarMeta.border_color.intValue());
        avatarMeta2.setBackgroundColor(avatarMeta.background_color.intValue());
        avatarMeta2.setCenterColor(avatarMeta.center_color.intValue());
        return avatarMeta2;
    }

    /* renamed from: a */
    private static com.ss.android.lark.chat.entity.chat.ChatJoinLeaveHistory m222080a(com.bytedance.lark.pb.basic.v1.ChatJoinLeaveHistory chatJoinLeaveHistory) {
        return new com.ss.android.lark.chat.entity.chat.ChatJoinLeaveHistory(chatJoinLeaveHistory.id, chatJoinLeaveHistory.action.getValue(), chatJoinLeaveHistory.event.getValue(), chatJoinLeaveHistory.chatter_id, chatJoinLeaveHistory.avatar_key, chatJoinLeaveHistory.chatter_name, chatJoinLeaveHistory.chat_id, chatJoinLeaveHistory.create_time.longValue(), new ChatJoinLeaveHistory.HistoryExtra(chatJoinLeaveHistory.extra.template, m222094c(chatJoinLeaveHistory.extra.content_values)));
    }

    /* renamed from: a */
    public static MediaExtra m222082a(GetChatResourcesResponse.Resource.MediaMeta mediaMeta) {
        MediaContent mediaContent;
        if (mediaMeta == null || (mediaContent = mediaMeta.media_content) == null) {
            return null;
        }
        MediaExtra mediaExtra = new MediaExtra();
        mediaExtra.setKey(mediaContent.key);
        mediaExtra.setUrl(mediaContent.url);
        mediaExtra.setSize(mediaContent.size.longValue());
        mediaExtra.setFilePath(mediaMeta.file_path);
        mediaExtra.setMime(mediaContent.mime);
        mediaExtra.setDuration((long) mediaContent.duration.intValue());
        return mediaExtra;
    }

    /* renamed from: a */
    public static ImageHistoryResponse m222074a(GetChatResourcesResponse getChatResourcesResponse, String str) {
        ImageHistoryResponse imageHistoryResponse = new ImageHistoryResponse();
        if (getChatResourcesResponse == null) {
            return imageHistoryResponse;
        }
        imageHistoryResponse.setHasMoreAfter(getChatResourcesResponse.has_more_after.booleanValue());
        imageHistoryResponse.setHasMoreBefore(getChatResourcesResponse.has_more_before.booleanValue());
        ArrayList arrayList = new ArrayList();
        for (GetChatResourcesResponse.MessageMeta messageMeta : getChatResourcesResponse.messages) {
            arrayList.addAll(m222086a(messageMeta, str));
        }
        imageHistoryResponse.setImageSetList(arrayList);
        return imageHistoryResponse;
    }

    /* renamed from: a */
    public static com.ss.android.lark.chat.entity.chat.Chat m222079a(com.bytedance.lark.pb.basic.v1.Chat chat, Map<String, ChatMailSetting> map) {
        String str;
        TeamChatType teamChatType;
        ChatMailSetting chatMailSetting;
        if (chat == null) {
            return null;
        }
        com.ss.android.lark.chat.entity.chat.Chat chat2 = new com.ss.android.lark.chat.entity.chat.Chat();
        chat2.setId(chat.id);
        if (chat.type == Chat.Type.P2P) {
            str = chat.chatter_id;
        } else {
            str = "";
        }
        chat2.setKey(str);
        chat2.setName(chat.name);
        chat2.setDescription(chat.description);
        chat2.setChatAnnouncement(m222091b(chat));
        chat2.setLastMessageId(chat.last_message_id);
        chat2.setAutoTranslate(chat.is_auto_translate.booleanValue());
        if (chat.top_notice_permission_setting != null) {
            chat2.setTopNoticePermissionSetting(Chat.TopNoticePermissionSetting.fromValue(chat.top_notice_permission_setting.getValue()));
        }
        chat2.setMemberCount(Math.max(chat.chatter_count.intValue(), chat.user_count.intValue()));
        chat2.setOwnerId(chat.owner_id);
        chat2.setType(Chat.Type.valueOf(chat.type.getValue()));
        chat2.setAvatarKey(chat.avatar_key);
        chat2.setUpdateTime(chat.update_time.longValue());
        chat2.setIs_department(chat.is_department.booleanValue());
        chat2.setIs_public(chat.is_public.booleanValue());
        chat2.setLastMessagePosition(chat.last_message_position.intValue());
        chat2.setFirstMessagePosition(chat.first_message_position.intValue());
        chat2.setUserCount(chat.user_count.intValue());
        chat2.setNamePinyin(chat.name_pinyin);
        chat2.setMeeting(chat.is_meeting.booleanValue());
        chat2.setSecret(chat.is_crypto.booleanValue());
        chat2.setBurnLife(chat.burn_life.intValue());
        chat2.setCrossTenant(chat.is_cross_tenant.booleanValue());
        chat2.setCrossWithKa(chat.is_cross_with_ka.booleanValue());
        chat2.setTenantId(chat.tenant_id);
        chat2.setHasWatermark(chat.has_water_mark.booleanValue());
        chat2.setTextDraftId(chat.text_draft_id);
        chat2.setPostDraftId(chat.post_draft_id);
        Chat.Status status = Chat.Status.NORMAL;
        if (chat.is_archived.booleanValue()) {
            status = Chat.Status.ARCHIVE;
        } else if (chat.is_deleted.booleanValue()) {
            status = Chat.Status.DELETED;
        }
        chat2.setStatus(status);
        chat2.setP2pChatterId(chat.chatter_id);
        chat2.setRemind(chat.is_remind.booleanValue());
        chat2.setRole(Chat.Role.forNumber(chat.role.getValue()));
        chat2.setIsCustomAvatar(chat.is_custom_icon.booleanValue());
        chat2.setSuper(chat.is_super.booleanValue());
        chat2.setTenant(chat.is_tenant.booleanValue());
        chat2.setCustomerService(chat.is_customer_service.booleanValue());
        chat2.setOnlyOwnerEditGroupInfo(chat.off_edit_group_chat_info.booleanValue());
        chat2.setDissolved(chat.is_dissolved.booleanValue());
        chat2.setMessagePosition(Chat.MessagePosition.forNumber(chat.message_position.getValue()));
        chat2.setAddMemberPermission(Chat.AddMemberPermission.forNumber(chat.add_member_permission.getValue()));
        chat2.setAtAllPermission(Chat.AtAllPermission.forNumber(chat.at_all_permission.getValue()));
        chat2.setJoinMessageVisible(Chat.SystemMessageVisible.forNumber(chat.join_message_visible.getValue()));
        chat2.setQuitMessageVisible(Chat.SystemMessageVisible.forNumber(chat.quit_message_visible.getValue()));
        chat2.setShareCardPermission(Chat.ShareCardPermission.forNumber(chat.share_card_permission.getValue()));
        chat2.setChatable(chat.chatable.booleanValue());
        chat2.setMuteable(chat.muteable.booleanValue());
        chat2.setTenant(chat.is_tenant.booleanValue());
        chat2.setRecentReadPosition(chat.last_read_position.intValue());
        chat2.setRecentReadOffset(chat.last_read_offset.floatValue());
        chat2.setInBox(chat.is_in_box.booleanValue());
        chat2.setOnCallId(chat.oncall_id);
        chat2.setLastVisibleMessagePosition(chat.last_visible_message_position.intValue());
        chat2.setReadPosition(chat.read_position.intValue());
        chat2.setReadPositionBadgeCount(chat.read_position_badge_count.intValue());
        chat2.setLastMessagePositionBadgeCount(chat.last_message_position_badge_count.intValue());
        chat2.setPublic(chat.is_public_v2.booleanValue());
        chat2.setOfficialOncall(chat.is_official_oncall.booleanValue());
        chat2.setOfflineOncall(chat.is_offline_oncall);
        chat2.setShotCut(chat.is_shortcut.booleanValue());
        chat2.setChatMode(Chat.ChatMode.forNumber(chat.chat_mode.getValue()));
        chat2.setLastThreadId(chat.last_thread_id);
        chat2.setLastThreadPosition(chat.last_thread_position.intValue());
        chat2.setLastThreadPositionBadgeCount(chat.last_thread_position_badge_count.intValue());
        chat2.setReadThreadPosition(chat.read_thread_position.intValue());
        chat2.setReadThreadPositionBadgeCount(chat.read_thread_position_badge_count.intValue());
        chat2.setLastVisibleThreadPosition(chat.last_visible_thread_position.intValue());
        chat2.setLastVisibleThreadId(chat.last_visible_thread_id);
        chat2.setAllowPost(chat.allow_post.booleanValue());
        chat2.setPutChatterApplyCount(chat.put_chatter_apply_count.intValue());
        chat2.setShowApplyBanner(chat.show_banner.booleanValue());
        chat2.setAddMemberApply(Chat.AddMemberApply.forNumber(chat.add_member_apply.getValue()));
        chat2.setPostType(Chat.PostType.forNumber(chat.post_type.getValue()));
        chat2.setLastDraftId(chat.last_draft_id);
        chat2.setMiniAvatarKey(chat.mini_avatar_key);
        chat2.setSideBarId(chat.sidebar_id);
        chat2.setSideBarButtons(C57331u.m222226a(chat.sidebar_buttons));
        chat2.setCreateTime(String.valueOf(chat.create_time));
        chat2.setThreadLastTimeStamp(chat.my_threads_last_timestamp.longValue());
        chat2.setThreadReadTimeStamp(chat.my_threads_read_timestamp.longValue());
        chat2.setMyThreadsUnreadCount(chat.my_threads_unread_count.intValue());
        if (chat.anonymous_setting != null) {
            chat2.setAnonymousSetting(Chat.AnonymousSetting.forNumber(chat.anonymous_setting.getValue()));
        }
        if (!(map == null || map.get(chat2.getId()) == null || (chatMailSetting = map.get(chat2.getId())) == null)) {
            chat2.setGroupMailEnable(chatMailSetting.allow_mail_send.booleanValue());
            chat2.setGroupMailSendType(Chat.GroupMailSendPermissionType.forNumber(chatMailSetting.send_permission.getValue()));
        }
        chat2.setEdu(chat.is_edu.booleanValue());
        chat2.setMessageVisibilitySetting(Chat.MessageVisibilitySetting.forNumber(chat.message_visibility_setting.getValue()));
        chat2.setAnonymousTotalQuota(chat.anonymous_total_quota.longValue());
        chat2.setAnonymousId(chat.anonymous_id);
        chat2.setAdmin(chat.is_admin.booleanValue());
        chat2.setTags(chat.tags);
        chat2.setTeam(chat.is_team.booleanValue());
        chat2.setTeamId(chat.team_id.longValue());
        chat2.setTeamName(chat.team_name);
        chat2.setBuzzPermissionSetting(Chat.BuzzPermissionSetting.forNumber(chat.create_urgent_setting.getValue()));
        chat2.setCreateVideoConferenceSetting(Chat.CreateVideoConferenceSetting.forNumber(chat.create_video_conference_setting.getValue()));
        chat2.setPinPermissionSetting(Chat.PinPermissionSetting.forNumber(chat.pin_permission_setting.getValue()));
        com.bytedance.lark.pb.basic.v1.TeamChatType teamChatType2 = chat.team_chat_type;
        if (teamChatType2 == null) {
            teamChatType = TeamChatType.TEAM_CHAT_TYPE_UNKNOWN;
        } else {
            teamChatType = TeamChatType.fromValue(teamChatType2.getValue());
        }
        chat2.setTeamChatType(teamChatType);
        return chat2;
    }

    /* renamed from: a */
    public static ChatSetting m222081a(String str, boolean z, long j, boolean z2) {
        return new ChatSetting(str, z, j, z2);
    }
}
