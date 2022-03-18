package com.ss.android.lark.money.redpacket.dto;

import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.content.RedPacketContent;
import com.ss.android.lark.chat.entity.redpacket.RedPacketCover;
import java.io.Serializable;

public class RedPacketInfo implements Serializable {
    public Chatter chatter;
    public RedPacketCover cover;
    public long grabAmount;
    public int grabNum;
    public boolean hasGrabbed;
    public boolean isExpired;
    public boolean isFromMe;
    public String luckyUserId;
    public String redPacketId;
    public String subject;
    public long totalAmount;
    public long totalGrabAmount;
    public int totalNum;
    public RedPacketContent.Type type;
}
