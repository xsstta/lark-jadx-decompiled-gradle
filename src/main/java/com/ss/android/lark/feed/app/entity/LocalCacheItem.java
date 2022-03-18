package com.ss.android.lark.feed.app.entity;

import com.alibaba.fastjson.JSONObject;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.log.Log;
import java.io.Serializable;

public class LocalCacheItem implements Serializable {
    String content;
    FeedCard.Type entityType;

    public LocalCacheItem() {
    }

    public String getContent() {
        return this.content;
    }

    public FeedCard.Type getEntityType() {
        return this.entityType;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setEntityType(FeedCard.Type type) {
        this.entityType = type;
    }

    public LocalCacheItem(FeedCard.Type type, String str) {
        this.content = str;
        this.entityType = type;
    }

    public static LocalCacheItem packCacheItem(FeedCard.Type type, UIFeedCard uIFeedCard) {
        try {
            return new LocalCacheItem(type, JSONObject.toJSONString(uIFeedCard));
        } catch (Exception e) {
            Log.m165384e("LocalCacheItem", "packCacheItem failed: " + uIFeedCard.getId(), e);
            return null;
        }
    }

    public static UIFeedCard unpackCacheItem(FeedCard.Type type, String str) {
        UIFeedCard uIFeedCard;
        UIFeedCard uIFeedCard2 = null;
        try {
            if (type == FeedCard.Type.BOX) {
                uIFeedCard = (UIFeedCard) JSONObject.parseObject(str, BoxFeedPreview.class);
            } else if (type == FeedCard.Type.CHAT) {
                uIFeedCard = (UIFeedCard) JSONObject.parseObject(str, ChatFeedPreview.class);
            } else if (type == FeedCard.Type.DOC) {
                uIFeedCard = (UIFeedCard) JSONObject.parseObject(str, DocFeedPreview.class);
            } else {
                if (type != FeedCard.Type.APP) {
                    if (type != FeedCard.Type.OPEN_APP_CHAT) {
                        if (type == FeedCard.Type.THREAD || type == FeedCard.Type.TOPIC) {
                            uIFeedCard = (UIFeedCard) JSONObject.parseObject(str, ThreadFeedPreview.class);
                        }
                        uIFeedCard2.setUpdateTime(-1);
                        return uIFeedCard2;
                    }
                }
                uIFeedCard = (UIFeedCard) JSONObject.parseObject(str, LittleAppFeedPreview.class);
            }
            uIFeedCard2 = uIFeedCard;
            uIFeedCard2.setUpdateTime(-1);
        } catch (Exception unused) {
        }
        return uIFeedCard2;
    }
}
