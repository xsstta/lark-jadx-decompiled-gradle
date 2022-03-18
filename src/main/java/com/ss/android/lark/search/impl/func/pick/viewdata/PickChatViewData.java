package com.ss.android.lark.search.impl.func.pick.viewdata;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import com.ss.android.lark.utils.C57782ag;

public class PickChatViewData extends BasePickViewData {
    private static final long serialVersionUID = 6004783130490335944L;
    private int chatCount;
    private Chat.Type chatType;
    private boolean isDepartment;
    private boolean isPublic;
    private boolean isTenant;
    private boolean officialOnCall;
    private ChatterDescription p2pChatterDescription;
    private String p2pChatterId = "";
    private boolean showBotTag;

    @Override // com.ss.android.lark.search.impl.func.pick.viewdata.BasePickViewData
    public int getType() {
        return 2;
    }

    public int getChatCount() {
        return this.chatCount;
    }

    public Chat.Type getChatType() {
        return this.chatType;
    }

    public ChatterDescription getP2pChatterDescription() {
        return this.p2pChatterDescription;
    }

    public String getP2pChatterId() {
        return this.p2pChatterId;
    }

    public boolean isDepartment() {
        return this.isDepartment;
    }

    public boolean isOfficialOnCall() {
        return this.officialOnCall;
    }

    public boolean isPublic() {
        return this.isPublic;
    }

    public boolean isShowBotTag() {
        return this.showBotTag;
    }

    public boolean isTenant() {
        return this.isTenant;
    }

    public PickChatViewData() {
    }

    @Override // com.ss.android.lark.search.impl.func.pick.viewdata.BasePickViewData
    public String getAvatarId() {
        if (!C57782ag.m224241a(this.p2pChatterId)) {
            return this.p2pChatterId;
        }
        return super.getAvatarId();
    }

    public void setChatCount(int i) {
        this.chatCount = i;
    }

    public void setChatType(Chat.Type type) {
        this.chatType = type;
    }

    public void setDepartment(boolean z) {
        this.isDepartment = z;
    }

    public void setOfficialOnCall(boolean z) {
        this.officialOnCall = z;
    }

    public void setP2pChatterDescription(ChatterDescription chatterDescription) {
        this.p2pChatterDescription = chatterDescription;
    }

    public void setP2pChatterId(String str) {
        this.p2pChatterId = str;
    }

    public void setPublic(boolean z) {
        this.isPublic = z;
    }

    public void setShowBotTag(boolean z) {
        this.showBotTag = z;
    }

    public void setTenant(boolean z) {
        this.isTenant = z;
    }

    public PickChatViewData(PickChatViewData pickChatViewData) {
        if (pickChatViewData != null) {
            this.id = pickChatViewData.getId();
            this.businessId = pickChatViewData.getBusinessId();
            this.imageKey = pickChatViewData.getImageKey();
            this.name = pickChatViewData.getName();
            this.description = pickChatViewData.getDescription();
            this.nameHighLights = pickChatViewData.getNameHighLights();
            this.descHighLights = pickChatViewData.getDescHighLights();
            this.isSelected = pickChatViewData.isSelected();
            this.isCrossTenant = pickChatViewData.isCrossTenant();
            this.chatType = pickChatViewData.getChatType();
            this.chatCount = pickChatViewData.getChatCount();
            this.p2pChatterId = pickChatViewData.getP2pChatterId();
            this.p2pChatterDescription = pickChatViewData.getP2pChatterDescription();
            this.showBotTag = pickChatViewData.isShowBotTag();
            this.isDepartment = pickChatViewData.isDepartment();
            this.isTenant = pickChatViewData.isTenant();
            this.officialOnCall = pickChatViewData.isOfficialOnCall();
            this.isPublic = pickChatViewData.isPublic();
        }
    }
}
