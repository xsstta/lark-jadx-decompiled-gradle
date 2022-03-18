package com.ss.android.lark.inno.network.model;

import com.ss.android.lark.inno.network.VcLiveResponse;
import java.io.Serializable;
import java.util.List;

public class LivePlaybackInfoData implements Serializable {
    public int default_resolution;
    public List<PlaybackLineListDTO> line_list;

    public static class LivePlaybackInfoDataResp extends VcLiveResponse<LivePlaybackInfoData> {
    }

    public static class PlaybackLineListDTO implements Serializable {
        public String play_url;
        public int resolution;
    }
}
