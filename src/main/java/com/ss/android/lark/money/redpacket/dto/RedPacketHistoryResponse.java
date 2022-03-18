package com.ss.android.lark.money.redpacket.dto;

import java.io.Serializable;
import java.util.List;

public class RedPacketHistoryResponse implements Serializable {
    public boolean hasMore;
    public String nextCursor;
    public List<RedPacketHistoryItem> redPacketHistoryItemList;
    public long totalAmount;
    public int totalNum;
}
