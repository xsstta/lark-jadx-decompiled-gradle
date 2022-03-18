package com.ss.android.lark.feed.app.model.cache;

import com.ss.android.lark.chat.entity.reaction.Reaction;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import com.ss.android.lark.feed.app.model.p1863c.C37712c;
import com.ss.android.lark.widget.linked_emojicon.base.EmojiHandler;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.lark.feed.app.model.cache.c */
class C37718c extends HashMap<String, UIFeedCard> {
    C37718c() {
    }

    /* renamed from: a */
    private void m148376a(UIFeedCard uIFeedCard) {
        List<Reaction> reactions;
        if (!(!(uIFeedCard instanceof FeedPreview) || (reactions = ((FeedPreview) uIFeedCard).getReactions()) == null || reactions.isEmpty())) {
            for (int i = 0; i < reactions.size(); i++) {
                EmojiHandler.m226951d(reactions.get(i).getType());
            }
        }
    }

    public UIFeedCard put(String str, UIFeedCard uIFeedCard) {
        C37712c.m148278a(uIFeedCard);
        m148376a(uIFeedCard);
        return (UIFeedCard) super.put((Object) str, (Object) uIFeedCard);
    }
}
