package com.ss.android.lark.inno.network.model;

import com.ss.android.lark.inno.network.VcLiveResponse;
import java.io.Serializable;

public class LiveFetchIdData implements Serializable {
    public String live_id;

    public static class LiveFetchIdResp extends VcLiveResponse<LiveFetchIdData> {
    }

    private LiveFetchIdData() {
    }
}
