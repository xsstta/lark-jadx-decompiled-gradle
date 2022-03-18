package com.ss.android.lark.feed.app.p1848a;

import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.feed.app.entity.ChatFeedPreview;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import com.ss.android.lark.feed.statistics.chat.ChatHitPoint;

/* renamed from: com.ss.android.lark.feed.app.a.c */
public class C37289c {
    /* renamed from: a */
    private static String m146903a(int i, boolean z) {
        return i == 0 ? "none" : z ? "number" : "dot";
    }

    /* renamed from: a */
    private static String m146904a(ChatFeedPreview chatFeedPreview) {
        if (chatFeedPreview.getChatType() == Chat.Type.GROUP) {
            if (chatFeedPreview.isMeeting()) {
                return "meeting";
            }
            return "group";
        } else if (chatFeedPreview.isBotChat()) {
            return "single_bot";
        } else {
            return "single";
        }
    }

    /* renamed from: b */
    private static void m146906b(ChatFeedPreview chatFeedPreview) {
        ChatHitPoint.f97732a.mo139408a(m146903a((int) chatFeedPreview.getUnreadCount(), chatFeedPreview.isRemind()), m146904a(chatFeedPreview), chatFeedPreview.getId());
    }

    /* renamed from: a */
    public static void m146905a(UIFeedCard uIFeedCard) {
        if (uIFeedCard != null && uIFeedCard.getType() == FeedCard.Type.CHAT) {
            m146906b((ChatFeedPreview) uIFeedCard);
        }
    }
}
