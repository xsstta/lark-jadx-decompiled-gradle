package com.ss.android.lark.oncall.service.dto;

import com.ss.android.lark.oncall.entity.OnCall;
import java.io.Serializable;
import java.util.List;

public class PullOnCallsResponse implements Serializable {
    public final boolean hasMore;
    public final List<OnCall> onCalls;

    public PullOnCallsResponse(List<OnCall> list, boolean z) {
        this.onCalls = list;
        this.hasMore = z;
    }
}
