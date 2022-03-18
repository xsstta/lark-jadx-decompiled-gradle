package com.ss.android.lark.biz.im.api;

import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import com.ss.android.lark.chat.entity.Channel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ThreadTopic implements AbstractC26248b<ThreadTopic>, Serializable {
    private String anonymousId;
    private String avatarKey;
    private int badgeCount;
    private Channel channel;
    private long filterRankTime;
    private String id;
    private boolean isAnonymousEnable;
    private boolean isBadged;
    private boolean isFollow;
    private boolean isNoTraceDelete;
    private boolean isVisible;
    private String lastMsgId = "";
    private int lastMsgPos;
    private int lastMsgPosBadgeCount;
    private List<String> lastReplyIds;
    private String lastVisibleMsgId;
    private int lastVisibleMsgPos;
    private List<String> latestAtMessageIds;
    private int originBadgeCount;
    private String ownerId;
    private int position;
    private int readPos;
    private int readPosBadgeCount;
    private int replyCount;
    private String rootMsgId = "";
    private ThreadStateInfo stateInfo;
    private String subTitle;
    private String topic = "";
    private long updateTime;

    public String getAnonymousId() {
        return this.anonymousId;
    }

    public String getAvatarKey() {
        return this.avatarKey;
    }

    public int getBadgeCount() {
        return this.badgeCount;
    }

    public Channel getChannel() {
        return this.channel;
    }

    public long getFilterRankTime() {
        return this.filterRankTime;
    }

    public String getId() {
        return this.id;
    }

    public String getLastMsgId() {
        return this.lastMsgId;
    }

    public int getLastMsgPos() {
        return this.lastMsgPos;
    }

    public int getLastMsgPosBadgeCount() {
        return this.lastMsgPosBadgeCount;
    }

    public List<String> getLastReplyIds() {
        return this.lastReplyIds;
    }

    public String getLastVisibleMsgId() {
        return this.lastVisibleMsgId;
    }

    public int getLastVisibleMsgPos() {
        return this.lastVisibleMsgPos;
    }

    public List<String> getLatestAtMessageIds() {
        return this.latestAtMessageIds;
    }

    public int getOriginBadgeCount() {
        return this.originBadgeCount;
    }

    public String getOwnerId() {
        return this.ownerId;
    }

    public int getPosition() {
        return this.position;
    }

    public int getReadPos() {
        return this.readPos;
    }

    public int getReadPosBadgeCount() {
        return this.readPosBadgeCount;
    }

    public int getReplyCount() {
        return this.replyCount;
    }

    public String getRootMsgId() {
        return this.rootMsgId;
    }

    public ThreadStateInfo getStateInfo() {
        return this.stateInfo;
    }

    public String getSubTitle() {
        return this.subTitle;
    }

    public String getTopic() {
        return this.topic;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public boolean isAnonymousEnable() {
        return this.isAnonymousEnable;
    }

    public boolean isBadged() {
        return this.isBadged;
    }

    public boolean isFollow() {
        return this.isFollow;
    }

    public boolean isNoTraceDelete() {
        return this.isNoTraceDelete;
    }

    public boolean isVisible() {
        return this.isVisible;
    }

    public String toString() {
        return "id:" + this.id + ", lastMsgPos:" + this.lastMsgPos + ", readMsgPos:" + this.readPos + ", lastMsgBadgeCount:" + this.lastMsgPosBadgeCount + ", readBadgeCount:" + this.readPosBadgeCount + ",isFollow:" + this.isFollow;
    }

    public void setAnonymousEnable(boolean z) {
        this.isAnonymousEnable = z;
    }

    public void setAnonymousId(String str) {
        this.anonymousId = str;
    }

    public void setAvatarKey(String str) {
        this.avatarKey = str;
    }

    public void setBadgeCount(int i) {
        this.badgeCount = i;
    }

    public void setBadged(boolean z) {
        this.isBadged = z;
    }

    public void setChannel(Channel channel2) {
        this.channel = channel2;
    }

    public void setFilterRankTime(long j) {
        this.filterRankTime = j;
    }

    public void setFollow(boolean z) {
        this.isFollow = z;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setLastMsgId(String str) {
        this.lastMsgId = str;
    }

    public void setLastMsgPos(int i) {
        this.lastMsgPos = i;
    }

    public void setLastMsgPosBadgeCount(int i) {
        this.lastMsgPosBadgeCount = i;
    }

    public void setLastVisibleMsgId(String str) {
        this.lastVisibleMsgId = str;
    }

    public void setLastVisibleMsgPos(int i) {
        this.lastVisibleMsgPos = i;
    }

    public void setNoTraceDelete(boolean z) {
        this.isNoTraceDelete = z;
    }

    public void setOriginBadgeCount(int i) {
        this.originBadgeCount = i;
    }

    public void setOwnerId(String str) {
        this.ownerId = str;
    }

    public void setPosition(int i) {
        this.position = i;
    }

    public void setReadPos(int i) {
        this.readPos = i;
    }

    public void setReadPosBadgeCount(int i) {
        this.readPosBadgeCount = i;
    }

    public void setReplyCount(int i) {
        this.replyCount = i;
    }

    public void setRootMsgId(String str) {
        this.rootMsgId = str;
    }

    public void setStateInfo(ThreadStateInfo threadStateInfo) {
        this.stateInfo = threadStateInfo;
    }

    public void setSubTitle(String str) {
        this.subTitle = str;
    }

    public void setTopic(String str) {
        this.topic = str;
    }

    public void setUpdateTime(long j) {
        this.updateTime = j;
    }

    public void setVisible(boolean z) {
        this.isVisible = z;
    }

    public boolean isItemSame(ThreadTopic threadTopic) {
        if (this == threadTopic) {
            return true;
        }
        return Objects.equals(this.id, threadTopic.getId());
    }

    public void setLastReplyIds(List<String> list) {
        ArrayList arrayList = new ArrayList(list);
        if (CollectionUtils.isNotEmpty(arrayList)) {
            Collections.reverse(arrayList);
        }
        this.lastReplyIds = arrayList;
    }

    public void setLatestAtMessageIds(List<String> list) {
        ArrayList arrayList = new ArrayList(list);
        if (CollectionUtils.isNotEmpty(arrayList)) {
            Collections.reverse(arrayList);
        }
        this.latestAtMessageIds = arrayList;
    }

    public boolean isContentSame(ThreadTopic threadTopic) {
        if (this.replyCount == threadTopic.replyCount && this.isFollow == threadTopic.isFollow && this.isNoTraceDelete == threadTopic.isNoTraceDelete && Objects.equals(this.avatarKey, threadTopic.avatarKey) && this.filterRankTime == threadTopic.filterRankTime) {
            return true;
        }
        return false;
    }
}
