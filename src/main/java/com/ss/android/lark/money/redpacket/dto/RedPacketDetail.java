package com.ss.android.lark.money.redpacket.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class RedPacketDetail implements Serializable {
    public List<RedPacketDetailItem> detailList = new ArrayList();
    public int grabNum;
    public boolean hasMore = true;
    public boolean isFakeResult;
    public String luckyUserId;
    public String nextCursor;
    public long totalGrabAmount;
}
