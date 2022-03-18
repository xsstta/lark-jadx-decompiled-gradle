package com.ss.android.lark.money.redpacket.dto;

import com.ss.android.lark.chat.entity.chatter.Chatter;
import java.io.Serializable;

public class RedPacketDetailItem implements Serializable {
    public long amount;
    public Chatter chatter;
    public String recordDetail;
    public long time;
    public int type;
}
