package com.ss.android.lark.feed.app.entity;

import com.ss.android.lark.biz.im.api.FeedCard;
import java.util.UUID;

public class ExtraHeaderPreview extends UIFeedCard {
    public static String doneBoxId = String.valueOf(UUID.randomUUID().toString().hashCode());
    public static String inboxId = String.valueOf(UUID.randomUUID().toString().hashCode());

    @Override // com.ss.android.lark.feed.app.entity.UIFeedCard
    public boolean exactlyCompare(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExtraHeaderPreview)) {
            return false;
        }
        try {
            if (((ExtraHeaderPreview) obj).getId().equals(getId()) && ((ExtraHeaderPreview) obj).getFeedType().equals(getFeedType()) && ((ExtraHeaderPreview) obj).getType().equals(getType()) && ((ExtraHeaderPreview) obj).getRankPriority() == getRankPriority()) {
                return true;
            }
        } catch (Exception unused) {
        }
        return super.exactlyCompare(obj);
    }

    public ExtraHeaderPreview(String str, FeedCard.FeedType feedType) {
        setType(FeedCard.Type.UNKNOWN);
        setId(str);
        setFeedType(feedType);
        setRankPriority(0);
    }
}
