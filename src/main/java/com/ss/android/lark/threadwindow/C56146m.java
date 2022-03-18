package com.ss.android.lark.threadwindow;

import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.thread.TopicGroup;

/* renamed from: com.ss.android.lark.threadwindow.m */
public class C56146m {
    /* renamed from: a */
    public static boolean m218888a() {
        return C29990c.m110930b().mo134586n().mo134685a("group.role.obeserver");
    }

    /* renamed from: a */
    public static boolean m218889a(Chat chat) {
        if (chat == null || !chat.isPublic() || chat.getChatMode() != Chat.ChatMode.THREAD_V2 || chat.getAddMemberApply() == Chat.AddMemberApply.NEED_APPLY) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m218891a(TopicGroup topicGroup) {
        if (topicGroup == null || topicGroup.getUserSetting() == null || topicGroup.getUserSetting().getTopicGroupRole() == TopicGroup.TopicGroupRole.UNAUTHORIZED_USER) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m218890a(Chat chat, TopicGroup topicGroup) {
        if (!m218888a() || !m218889a(chat) || !m218891a(topicGroup)) {
            return false;
        }
        return true;
    }
}
