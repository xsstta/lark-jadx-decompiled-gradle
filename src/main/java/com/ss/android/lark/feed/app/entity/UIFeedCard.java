package com.ss.android.lark.feed.app.entity;

import android.text.TextUtils;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.chat.entity.chat.Chat;
import java.io.Serializable;
import java.lang.ref.WeakReference;

public class UIFeedCard implements Serializable, Cloneable, Comparable<UIFeedCard> {
    private Chat.ChatMode chatMode;
    private long displayTime;
    private FeedCard.Type entityType;
    private FeedCard.FeedType feedType;
    private String id;
    private boolean isOfflineOncall;
    private boolean isSwipeRightPinned;
    private boolean isSwipedLeftPinned;
    private volatile WeakReference<DataObserver> mDataObserver;
    private String parentCardId;
    private long rankPriority = 2147483647L;
    private long rankTime;
    private long updateTime;

    public interface DataObserver {
        void onChanged(String str);
    }

    public Chat.ChatMode getChatMode() {
        return this.chatMode;
    }

    public long getDisplayTime() {
        return this.displayTime;
    }

    public FeedCard.FeedType getFeedType() {
        return this.feedType;
    }

    public String getId() {
        return this.id;
    }

    public boolean getOfflineOncall() {
        return this.isOfflineOncall;
    }

    public String getParentCardId() {
        return this.parentCardId;
    }

    public long getRankPriority() {
        return this.rankPriority;
    }

    public long getRankTime() {
        return this.rankTime;
    }

    public FeedCard.Type getType() {
        return this.entityType;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public boolean isSwipeRightPinned() {
        return this.isSwipeRightPinned;
    }

    public boolean isSwipedLeftPinned() {
        return this.isSwipedLeftPinned;
    }

    /* access modifiers changed from: protected */
    public long getRealRankTime() {
        return getRankTime();
    }

    public UIFeedCard() {
    }

    public boolean isRemind() {
        if (this instanceof FeedPreview) {
            return isRemind();
        }
        return false;
    }

    public boolean isInChatBox() {
        if (TextUtils.isEmpty(this.parentCardId) || "0".equals(this.parentCardId)) {
            return false;
        }
        return true;
    }

    public void notifyDataChanged() {
        DataObserver dataObserver;
        if (this.mDataObserver != null && (dataObserver = this.mDataObserver.get()) != null) {
            dataObserver.onChanged(this.id);
        }
    }

    public void setChatMode(Chat.ChatMode chatMode2) {
        this.chatMode = chatMode2;
    }

    public void setDisplayTime(long j) {
        this.displayTime = j;
    }

    public void setFeedType(FeedCard.FeedType feedType2) {
        this.feedType = feedType2;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setOfflineOncall(boolean z) {
        this.isOfflineOncall = z;
    }

    public void setParentCardId(String str) {
        this.parentCardId = str;
    }

    public void setRankPriority(long j) {
        this.rankPriority = j;
    }

    public void setRankTime(long j) {
        this.rankTime = j;
    }

    public void setSwipeRightPinned(boolean z) {
        this.isSwipeRightPinned = z;
    }

    public void setSwipedLeftPinned(boolean z) {
        this.isSwipedLeftPinned = z;
    }

    public void setType(FeedCard.Type type) {
        this.entityType = type;
    }

    public void setUpdateTime(long j) {
        this.updateTime = j;
    }

    public void setDataObserver(DataObserver dataObserver) {
        this.mDataObserver = new WeakReference<>(dataObserver);
    }

    public int compareTo(UIFeedCard uIFeedCard) {
        if (uIFeedCard == null) {
            return 0;
        }
        if (getRankPriority() > uIFeedCard.getRankPriority()) {
            return 1;
        }
        if (getRankPriority() < uIFeedCard.getRankPriority()) {
            return -1;
        }
        int i = (getRealRankTime() > uIFeedCard.getRealRankTime() ? 1 : (getRealRankTime() == uIFeedCard.getRealRankTime() ? 0 : -1));
        if (i < 0) {
            return 1;
        }
        if (i > 0) {
            return -1;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z;
        if (obj != null && ((z = obj instanceof UIFeedCard))) {
            if (this == obj) {
                return true;
            }
            if (obj != null && z) {
                return TextUtils.equals(getId(), ((UIFeedCard) obj).getId());
            }
        }
        return false;
    }

    public UIFeedCard(UIFeedCard uIFeedCard) {
        if (uIFeedCard != null) {
            this.id = uIFeedCard.getId();
            this.entityType = uIFeedCard.getType();
            this.feedType = uIFeedCard.getFeedType();
            this.rankTime = uIFeedCard.getRankTime();
            this.displayTime = uIFeedCard.getDisplayTime();
            this.updateTime = uIFeedCard.getUpdateTime();
            this.chatMode = uIFeedCard.getChatMode();
            this.parentCardId = uIFeedCard.getParentCardId();
            this.chatMode = uIFeedCard.getChatMode();
            this.isOfflineOncall = uIFeedCard.getOfflineOncall();
        }
    }

    public boolean exactlyCompare(Object obj) {
        if (obj == null || !(obj instanceof UIFeedCard)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        UIFeedCard uIFeedCard = (UIFeedCard) obj;
        if (uIFeedCard.getDisplayTime() == getDisplayTime() && uIFeedCard.getRankTime() == getRankTime() && TextUtils.equals(uIFeedCard.getParentCardId(), this.parentCardId)) {
            return TextUtils.equals(getId(), uIFeedCard.getId());
        }
        return false;
    }
}
