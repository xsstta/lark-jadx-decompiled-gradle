package com.ss.android.lark.mm.module.highlight.timeline;

import com.ss.android.lark.mm.net.HttpMmResponse;
import java.io.Serializable;
import java.util.List;

public class HightlightTimeLine implements Serializable {
    public List<HighlightTimeLineItem> timeline;

    public static class MmHightlightTimeLineResp extends HttpMmResponse<HightlightTimeLine> {
    }
}
