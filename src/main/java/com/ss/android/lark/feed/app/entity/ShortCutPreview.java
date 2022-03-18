package com.ss.android.lark.feed.app.entity;

import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.log.Log;
import java.util.List;
import java.util.UUID;

public class ShortCutPreview extends UIFeedCard {
    public static String id = String.valueOf(UUID.randomUUID().toString().hashCode());
    List<UIFeedCard> feedPreviews;

    public List<UIFeedCard> getFeedPreviews() {
        return this.feedPreviews;
    }

    public boolean isShortCardVisible() {
        return !CollectionUtils.isEmpty(this.feedPreviews);
    }

    public ShortCutPreview() {
        setType(FeedCard.Type.UNKNOWN);
        setId(id);
        setFeedType(FeedCard.FeedType.INBOX);
        setRankPriority(30);
    }

    public void setFeedPreviews(List<UIFeedCard> list) {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append("setFeedPreviews, size=");
        if (CollectionUtils.isEmpty(list)) {
            i = 0;
        } else {
            i = list.size();
        }
        sb.append(i);
        Log.m165389i("FeedModule__ShortCutPreview", sb.toString());
        this.feedPreviews = list;
    }

    @Override // com.ss.android.lark.feed.app.entity.UIFeedCard
    public boolean exactlyCompare(Object obj) {
        if (obj == null || !(obj instanceof ShortCutPreview)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ShortCutPreview shortCutPreview = (ShortCutPreview) obj;
        if (shortCutPreview.getFeedPreviews().size() != getFeedPreviews().size()) {
            return false;
        }
        for (int i = 0; i < getFeedPreviews().size(); i++) {
            if (!getFeedPreviews().get(i).exactlyCompare(shortCutPreview.getFeedPreviews().get(i))) {
                return false;
            }
        }
        return super.exactlyCompare(obj);
    }
}
