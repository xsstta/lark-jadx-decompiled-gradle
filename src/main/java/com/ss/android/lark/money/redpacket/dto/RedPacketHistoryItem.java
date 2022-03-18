package com.ss.android.lark.money.redpacket.dto;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import java.io.Serializable;

public class RedPacketHistoryItem implements Serializable {
    public long amount;
    public Chat chat;
    public Chatter chatter;
    public int grabNum;
    public String id;
    public boolean isExpired;
    public boolean isP2P;
    public long time;
    public int totalNum;
}
