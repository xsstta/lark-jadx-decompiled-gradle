package com.ss.android.lark.search.impl.entity.viewdata;

import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import com.ss.android.lark.chat.entity.chatter.WorkStatus;
import java.util.List;

public class SearchChatterViewData extends SearchBaseViewData {
    private static final long serialVersionUID = -7948139321893260198L;
    private ChatterDescription chatterDescription;
    private String chatterId;
    private String extraTitle;
    private List<String> extraTitleHitTerms;
    private boolean isCrossTenant;
    private boolean isRegistered;
    private boolean isRemind;
    private boolean isSecretP2PChat;
    private boolean isShowTag;
    private int newMsgCount;
    private String p2pChatId;
    private String secretChatterId;
    private String secretP2pChatId;
    private String tenantId;
    private Chatter.ChatterType type;
    private WorkStatus workStatus;
    private long zenModeEndTime;

    @Override // com.ss.android.lark.search.impl.entity.viewdata.SearchBaseViewData
    public int getSearchResultType() {
        return 1;
    }

    public ChatterDescription getChatterDescription() {
        return this.chatterDescription;
    }

    public String getChatterId() {
        return this.chatterId;
    }

    public String getExtraTitle() {
        return this.extraTitle;
    }

    public List<String> getExtraTitleHitTerms() {
        return this.extraTitleHitTerms;
    }

    public int getNewMsgCount() {
        return this.newMsgCount;
    }

    public String getP2pChatId() {
        return this.p2pChatId;
    }

    public String getSecretChatterId() {
        return this.secretChatterId;
    }

    public String getSecretP2pChatId() {
        return this.secretP2pChatId;
    }

    public String getTenantId() {
        return this.tenantId;
    }

    public Chatter.ChatterType getType() {
        return this.type;
    }

    public WorkStatus getWorkStatus() {
        return this.workStatus;
    }

    public long getZenModeEndTime() {
        return this.zenModeEndTime;
    }

    public boolean isCrossTenant() {
        return this.isCrossTenant;
    }

    public boolean isRegistered() {
        return this.isRegistered;
    }

    public boolean isRemind() {
        return this.isRemind;
    }

    public boolean isSecretP2PChat() {
        return this.isSecretP2PChat;
    }

    public boolean isShowTag() {
        return this.isShowTag;
    }

    public String getAvatarId() {
        if (this.isSecretP2PChat) {
            return this.secretChatterId;
        }
        return this.chatterId;
    }

    @Override // com.ss.android.lark.search.impl.entity.viewdata.SearchBaseViewData
    public String getDelayFeedId() {
        if (this.isSecretP2PChat) {
            return getSecretP2pChatId();
        }
        return getP2pChatId();
    }

    public boolean isCustomer() {
        return "0".equals(this.tenantId);
    }

    public boolean isShowBotTag() {
        if (getType() == Chatter.ChatterType.BOT) {
            return true;
        }
        return false;
    }

    public void setChatterDescription(ChatterDescription chatterDescription2) {
        this.chatterDescription = chatterDescription2;
    }

    public void setChatterId(String str) {
        this.chatterId = str;
    }

    public void setCrossTenant(boolean z) {
        this.isCrossTenant = z;
    }

    public void setExtraTitle(String str) {
        this.extraTitle = str;
    }

    public void setExtraTitleHitTerms(List<String> list) {
        this.extraTitleHitTerms = list;
    }

    public void setNewMsgCount(int i) {
        this.newMsgCount = i;
    }

    public void setP2pChatId(String str) {
        this.p2pChatId = str;
    }

    public void setRegistered(boolean z) {
        this.isRegistered = z;
    }

    public void setRemind(boolean z) {
        this.isRemind = z;
    }

    public void setSecretChatterId(String str) {
        this.secretChatterId = str;
    }

    public void setSecretP2PChat(boolean z) {
        this.isSecretP2PChat = z;
    }

    public void setSecretP2pChatId(String str) {
        this.secretP2pChatId = str;
    }

    public void setShowTag(boolean z) {
        this.isShowTag = z;
    }

    public void setTenantId(String str) {
        this.tenantId = str;
    }

    public void setType(Chatter.ChatterType chatterType) {
        this.type = chatterType;
    }

    public void setWorkStatus(WorkStatus workStatus2) {
        this.workStatus = workStatus2;
    }

    public void setZenModeEndTime(long j) {
        this.zenModeEndTime = j;
    }
}
