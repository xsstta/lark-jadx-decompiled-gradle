package com.ss.android.lark.money.redpacket.dto;

import java.io.Serializable;

public class RedPacketDataWrapper implements Serializable {
    public String authUrl;
    public RedPacketDetail detail;
    public RedPacketInfo info;
    public boolean isRealNameAuthed = true;
    public String payToken;

    public RedPacketDataWrapper() {
    }

    public RedPacketDataWrapper(RedPacketInfo redPacketInfo, RedPacketDetail redPacketDetail) {
        this.info = redPacketInfo;
        this.detail = redPacketDetail;
    }
}
