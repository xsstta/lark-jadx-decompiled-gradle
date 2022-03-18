package com.ss.android.lark.p2851u.p2852a;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.thread.TopicGroup;

/* renamed from: com.ss.android.lark.u.a.x */
public class C57335x {
    /* renamed from: a */
    public static TopicGroup m222234a(com.bytedance.lark.pb.basic.v1.TopicGroup topicGroup) {
        return m222235a(topicGroup, null);
    }

    /* renamed from: a */
    public static TopicGroup m222235a(com.bytedance.lark.pb.basic.v1.TopicGroup topicGroup, Chat chat) {
        if (topicGroup == null) {
            return null;
        }
        TopicGroup topicGroup2 = new TopicGroup();
        topicGroup2.setId(topicGroup.id);
        topicGroup2.setType(TopicGroup.Type.fromValue(topicGroup.type.getValue()));
        if (topicGroup.user_setting != null) {
            TopicGroup.UserSetting userSetting = new TopicGroup.UserSetting();
            userSetting.setFavorite(topicGroup.user_setting.is_favorite.booleanValue());
            userSetting.setUpdateTime(topicGroup.user_setting.update_time.longValue());
            if (topicGroup.user_setting.topic_group_role != null) {
                userSetting.setTopicGroupRole(TopicGroup.TopicGroupRole.fromValue(topicGroup.user_setting.topic_group_role.getValue()));
            }
            topicGroup2.setUserSetting(userSetting);
        }
        if (chat != null) {
            topicGroup2.setChat(chat);
        }
        return topicGroup2;
    }
}
