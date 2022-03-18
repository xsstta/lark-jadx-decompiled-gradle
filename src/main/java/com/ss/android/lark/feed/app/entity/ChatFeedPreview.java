package com.ss.android.lark.feed.app.entity;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Tag;
import com.ss.android.lark.biz.im.api.FocusInfo;
import com.ss.android.lark.biz.im.api.HighPriorityDisplay;
import com.ss.android.lark.biz.im.api.MessageType;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import java.util.List;

public class ChatFeedPreview extends FeedPreview {
    private Chat.ChatMode chatMode;
    private Chat.Type chatType;
    private FocusInfo focusInfo;
    private HighPriorityDisplay highPriorityDisplay;
    private boolean isBotChat;
    private boolean isCrossWithKa;
    private boolean isDepartment;
    private boolean isEdu;
    private boolean isMeeting;
    private boolean isMyThreadUpdated;
    private boolean isOfficialOncall;
    private boolean isOfflineOncall;
    private boolean isPublic;
    private boolean isSecret;
    private boolean isShowBotTag;
    private boolean isSuper;
    private boolean isTenantChat;
    private String miniAvatarKey;
    private String onCallId;
    private String p2pChatterId;
    private List<Tag> tags;
    private long zenModeEndTime;

    @Override // com.ss.android.lark.feed.app.entity.UIFeedCard
    public Chat.ChatMode getChatMode() {
        return this.chatMode;
    }

    public Chat.Type getChatType() {
        return this.chatType;
    }

    public FocusInfo getFocusInfo() {
        return this.focusInfo;
    }

    public HighPriorityDisplay getHighPriorityDisplay() {
        return this.highPriorityDisplay;
    }

    public String getMiniAvatarKey() {
        return this.miniAvatarKey;
    }

    public String getOnCallId() {
        return this.onCallId;
    }

    public String getP2pChatterId() {
        return this.p2pChatterId;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    public long getZenModeEndTime() {
        return this.zenModeEndTime;
    }

    public boolean isBotChat() {
        return this.isBotChat;
    }

    public boolean isCrossWithKa() {
        return this.isCrossWithKa;
    }

    public boolean isDepartment() {
        return this.isDepartment;
    }

    public boolean isEdu() {
        return this.isEdu;
    }

    public boolean isMeeting() {
        return this.isMeeting;
    }

    public boolean isMyThreadUpdated() {
        return this.isMyThreadUpdated;
    }

    public boolean isOfficialOncall() {
        return this.isOfficialOncall;
    }

    public boolean isOfflineOncall() {
        return this.isOfflineOncall;
    }

    public boolean isPublic() {
        return this.isPublic;
    }

    public boolean isSecret() {
        return this.isSecret;
    }

    public boolean isShowBotTag() {
        return this.isShowBotTag;
    }

    public boolean isSuper() {
        return this.isSuper;
    }

    public boolean isTenantChat() {
        return this.isTenantChat;
    }

    public boolean isShowOnCallTag() {
        if (TextUtils.isEmpty(this.onCallId) || TextUtils.equals(this.onCallId, "0")) {
            return false;
        }
        return true;
    }

    public void setBotChat(boolean z) {
        this.isBotChat = z;
    }

    @Override // com.ss.android.lark.feed.app.entity.UIFeedCard
    public void setChatMode(Chat.ChatMode chatMode2) {
        this.chatMode = chatMode2;
    }

    public void setChatType(Chat.Type type) {
        this.chatType = type;
    }

    public void setCrossWithKa(boolean z) {
        this.isCrossWithKa = z;
    }

    public void setDepartment(boolean z) {
        this.isDepartment = z;
    }

    public void setEdu(boolean z) {
        this.isEdu = z;
    }

    public void setFocusInfo(FocusInfo fVar) {
        this.focusInfo = fVar;
    }

    public void setHighPriorityDisplay(HighPriorityDisplay gVar) {
        this.highPriorityDisplay = gVar;
    }

    public void setMeeting(boolean z) {
        this.isMeeting = z;
    }

    public void setMiniAvatarKey(String str) {
        this.miniAvatarKey = str;
    }

    public void setMyThreadUpdated(boolean z) {
        this.isMyThreadUpdated = z;
    }

    public void setOfficialOncall(boolean z) {
        this.isOfficialOncall = z;
    }

    @Override // com.ss.android.lark.feed.app.entity.UIFeedCard
    public void setOfflineOncall(boolean z) {
        this.isOfflineOncall = z;
    }

    public void setOnCallId(String str) {
        this.onCallId = str;
    }

    public void setP2pChatterId(String str) {
        this.p2pChatterId = str;
    }

    public void setPublic(boolean z) {
        this.isPublic = z;
    }

    public void setSecret(boolean z) {
        this.isSecret = z;
    }

    public void setShowBotTag(boolean z) {
        this.isShowBotTag = z;
    }

    public void setSuper(boolean z) {
        this.isSuper = z;
    }

    public void setTags(List<Tag> list) {
        this.tags = list;
    }

    public void setTenantChat(boolean z) {
        this.isTenantChat = z;
    }

    public void setZenModeEndTime(long j) {
        this.zenModeEndTime = j;
    }

    public boolean hasHighPriorityDisplay(MessageType messageType) {
        if (messageType == MessageType.AT) {
            if (getAtInfo() != null) {
                return true;
            }
            return false;
        } else if (messageType == MessageType.URGENT) {
            return isContainMarkType(FeedPreview.MarkType.URGENT);
        } else {
            if (messageType != MessageType.FOCUS || getFocusInfo() == null) {
                return false;
            }
            return true;
        }
    }

    @Override // com.ss.android.lark.feed.app.entity.UIFeedCard, com.ss.android.lark.feed.app.entity.FeedPreview
    public boolean exactlyCompare(Object obj) {
        if (obj == null || !(obj instanceof ChatFeedPreview)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ChatFeedPreview chatFeedPreview = (ChatFeedPreview) obj;
        if (chatFeedPreview.isBotChat == this.isBotChat && chatFeedPreview.isDepartment == this.isDepartment && chatFeedPreview.isSuper == this.isSuper && chatFeedPreview.isTenantChat == this.isTenantChat && chatFeedPreview.chatType == this.chatType && TextUtils.equals(chatFeedPreview.onCallId, this.onCallId) && chatFeedPreview.isOfflineOncall == this.isOfflineOncall && chatFeedPreview.zenModeEndTime == this.zenModeEndTime) {
            return super.exactlyCompare(obj);
        }
        return false;
    }
}
