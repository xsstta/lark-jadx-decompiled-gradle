package com.bytedance.ee.bear.middleground.feed.export.bean;

import com.bytedance.ee.util.io.NonProguard;
import java.util.List;
import java.util.Objects;

public class LikeBean implements AbstractC9490b<LikeBean>, AbstractC9495h, NonProguard {
    private String avatarUrl;
    private long createTime;
    private boolean lastItem;
    private int likeCount;
    private String messageId;
    private int readStatus = 2;
    private int resolveStatus;
    private String titleStr = "";
    private List<String> userList;

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public int getLikeCount() {
        return this.likeCount;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public int getReadStatus() {
        return this.readStatus;
    }

    public int getResolveStatus() {
        return this.resolveStatus;
    }

    public String getTitleStr() {
        return this.titleStr;
    }

    public List<String> getUserList() {
        return this.userList;
    }

    public boolean isLastItem() {
        return this.lastItem;
    }

    public void setAvatarUrl(String str) {
        this.avatarUrl = str;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setLastItem(boolean z) {
        this.lastItem = z;
    }

    public void setLikeCount(int i) {
        this.likeCount = i;
    }

    public void setMessageId(String str) {
        this.messageId = str;
    }

    public void setReadStatus(int i) {
        this.readStatus = i;
    }

    public void setResolveStatus(int i) {
        this.resolveStatus = i;
    }

    public void setTitleStr(String str) {
        this.titleStr = str;
    }

    public void setUserList(List<String> list) {
        this.userList = list;
    }

    public boolean isSameItem(LikeBean likeBean) {
        return Objects.equals(this.messageId, likeBean.messageId);
    }

    public boolean contentSame(LikeBean likeBean) {
        if (!Objects.equals(this.avatarUrl, likeBean.avatarUrl) || this.readStatus != likeBean.readStatus || this.resolveStatus != likeBean.resolveStatus || this.lastItem != likeBean.lastItem || !this.titleStr.equals(likeBean.titleStr) || !userList(this, likeBean)) {
            return false;
        }
        return true;
    }

    private boolean userList(LikeBean likeBean, LikeBean likeBean2) {
        try {
            int size = likeBean.userList.size();
            int i = 0;
            while (i < size && likeBean.userList.get(i).equals(likeBean2.userList.get(i))) {
                if (i == 3) {
                    return true;
                }
                i++;
            }
            return false;
        } catch (Exception unused) {
        }
        return false;
    }
}
