package com.ss.android.lark.search.impl.func.pick.viewdata;

import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;

public class PickChatterViewData extends BasePickViewData {
    private static final long serialVersionUID = -4639946252482149321L;
    private ChatterDescription chatterDescription;
    private Chatter.ChatterType chatterType;
    private boolean isRegistered;
    private String p2pChatId;

    @Override // com.ss.android.lark.search.impl.func.pick.viewdata.BasePickViewData
    public int getType() {
        return 1;
    }

    public PickChatterViewData() {
    }

    public ChatterDescription getChatterDescription() {
        return this.chatterDescription;
    }

    public Chatter.ChatterType getChatterType() {
        return this.chatterType;
    }

    public String getP2pChatId() {
        return this.p2pChatId;
    }

    public boolean isRegistered() {
        return this.isRegistered;
    }

    public boolean isShowBotTag() {
        if (this.chatterType == Chatter.ChatterType.BOT) {
            return true;
        }
        return false;
    }

    public void setChatterDescription(ChatterDescription chatterDescription2) {
        this.chatterDescription = chatterDescription2;
    }

    public void setChatterType(Chatter.ChatterType chatterType2) {
        this.chatterType = chatterType2;
    }

    public void setP2pChatId(String str) {
        this.p2pChatId = str;
    }

    public void setRegistered(boolean z) {
        this.isRegistered = z;
    }

    public PickChatterViewData(PickChatterViewData pickChatterViewData) {
        if (pickChatterViewData != null) {
            this.id = pickChatterViewData.getId();
            this.imageKey = pickChatterViewData.getImageKey();
            this.name = pickChatterViewData.getName();
            this.description = pickChatterViewData.getDescription();
            this.nameHighLights = pickChatterViewData.getNameHighLights();
            this.descHighLights = pickChatterViewData.getDescHighLights();
            this.isSelected = pickChatterViewData.isSelected();
            this.isCrossTenant = pickChatterViewData.isCrossTenant();
            this.p2pChatId = pickChatterViewData.getP2pChatId();
            this.businessId = pickChatterViewData.getP2pChatId();
            this.chatterType = pickChatterViewData.getChatterType();
            this.chatterDescription = pickChatterViewData.getChatterDescription();
            this.isRegistered = pickChatterViewData.isRegistered();
        }
    }
}
