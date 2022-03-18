package com.ss.android.lark.feed.app.entity;

import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.feed.app.banner.p1852c.AbstractC37366e;
import java.util.Objects;
import java.util.UUID;

public class UGBannerPreview extends UIFeedCard {
    public static String id = String.valueOf(UUID.randomUUID().toString().hashCode());
    private AbstractC37366e ugBannerView;

    public AbstractC37366e getUgBannerView() {
        return this.ugBannerView;
    }

    public UGBannerPreview() {
        setType(FeedCard.Type.UNKNOWN);
        setId(id);
        setFeedType(FeedCard.FeedType.INBOX);
        setRankPriority(20);
    }

    public void setUgBannerView(AbstractC37366e eVar) {
        this.ugBannerView = eVar;
    }

    @Override // com.ss.android.lark.feed.app.entity.UIFeedCard
    public boolean exactlyCompare(Object obj) {
        if (!(obj instanceof UGBannerPreview)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!Objects.equals(this.ugBannerView, ((UGBannerPreview) obj).ugBannerView)) {
            return false;
        }
        return super.exactlyCompare(obj);
    }
}
