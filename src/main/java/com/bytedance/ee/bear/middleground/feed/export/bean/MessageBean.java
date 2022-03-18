package com.bytedance.ee.bear.middleground.feed.export.bean;

import com.alibaba.fastjson.annotation.JSONField;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import java.io.Serializable;

public class MessageBean extends BaseFeedMessageDetailBean implements Serializable {
    private int commentMention;
    private int createTime;
    @JSONField(name = "commentDelete")
    private int delete;
    private int finish;
    private String mentionId;
    private String messageId;
    @JSONField(name = "localDeleted")
    private boolean originContentDelete;
    private String quote;
    @JSONField(name = UpdateKey.STATUS)
    private int readStatus = 2;
    private int replyIndex;
    private int solveStatus = 1;
    private String subType = "";
    private String type = "MESSAGE_DOC_COMMENT";

    public int getCommentMention() {
        return this.commentMention;
    }

    public int getCreateTime() {
        return this.createTime;
    }

    public int getDelete() {
        return this.delete;
    }

    public int getFinish() {
        return this.finish;
    }

    public String getMentionId() {
        return this.mentionId;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public String getQuote() {
        return this.quote;
    }

    public int getReadStatus() {
        return this.readStatus;
    }

    public int getReplyIndex() {
        return this.replyIndex;
    }

    public int getSolveStatus() {
        return this.solveStatus;
    }

    public String getSubType() {
        return this.subType;
    }

    public String getType() {
        return this.type;
    }

    public boolean isOriginContentDelete() {
        return this.originContentDelete;
    }

    public void setCommentMention(int i) {
        this.commentMention = i;
    }

    public void setCreateTime(int i) {
        this.createTime = i;
    }

    public void setDelete(int i) {
        this.delete = i;
    }

    public void setFinish(int i) {
        this.finish = i;
    }

    public void setMentionId(String str) {
        this.mentionId = str;
    }

    public void setMessageId(String str) {
        this.messageId = str;
    }

    public void setOriginContentDelete(boolean z) {
        this.originContentDelete = z;
    }

    public void setQuote(String str) {
        this.quote = str;
    }

    public void setReadStatus(int i) {
        this.readStatus = i;
    }

    public void setReplyIndex(int i) {
        this.replyIndex = i;
    }

    public void setSolveStatus(int i) {
        this.solveStatus = i;
    }

    public void setSubType(String str) {
        this.subType = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}
