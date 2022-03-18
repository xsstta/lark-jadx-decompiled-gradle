package com.ss.android.lark.feed.app.entity;

import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.feed.app.banner.base.C37316a;
import com.ss.android.lark.feed.app.banner.base.IBanner;
import java.util.Objects;
import java.util.UUID;

public class BannerPreview<T extends C37316a> extends UIFeedCard {
    public static String id = String.valueOf(UUID.randomUUID().toString().hashCode());
    private IBanner.BannerStyle bannerStyle = IBanner.BannerStyle.NONE;
    private T extraData;

    public IBanner.BannerStyle getBannerStyle() {
        return this.bannerStyle;
    }

    public T getExtraData() {
        return this.extraData;
    }

    public BannerPreview() {
        setType(FeedCard.Type.UNKNOWN);
        setId(id);
        setFeedType(FeedCard.FeedType.INBOX);
        setRankPriority(25);
    }

    public void setBannerStyle(IBanner.BannerStyle bannerStyle2) {
        this.bannerStyle = bannerStyle2;
    }

    public void setExtraData(T t) {
        this.extraData = t;
    }

    @Override // com.ss.android.lark.feed.app.entity.UIFeedCard
    public boolean exactlyCompare(Object obj) {
        if (!(obj instanceof BannerPreview)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        BannerPreview bannerPreview = (BannerPreview) obj;
        if (Objects.equals(this.extraData, bannerPreview.extraData) && this.bannerStyle == bannerPreview.bannerStyle) {
            return super.exactlyCompare(obj);
        }
        return false;
    }
}
