package com.ss.android.lark.inno.network.model;

import com.ss.android.lark.inno.network.VcLiveResponse;
import java.io.Serializable;

public class VCLiveModel implements Serializable {
    public int audience_number;
    public String backup_url_flv;
    public String backup_url_hls;
    public String conference_id;
    public boolean has_permission;
    public boolean is_clap_disabled;
    public boolean is_cycle;
    public boolean is_in_meeting;
    public String latest_red_envelope_id;
    public int live_comment_status;
    public String live_id;
    public int live_range;
    public String live_session_id;
    public String live_share_url;
    public int live_source;
    public String live_status_plan;
    public String live_url_flv;
    public String live_url_hls;
    public String meeting_topic;
    public C38937a ntp_time;
    public int permission_status;
    public String platform;
    public String playback_id;
    public String playback_url;
    public String poster_url;
    public String real_live_id;
    public int role;
    public long start_time;
    public int status;
    public String trailer_url;

    public static class LiveInfoDataResp extends VcLiveResponse<VCLiveModel> {
    }

    public static class LiveInfoResp extends VcLiveResponse<VCLiveModel> {
    }

    /* renamed from: com.ss.android.lark.inno.network.model.VCLiveModel$a */
    public static class C38937a {
    }

    public boolean isLiving() {
        if (this.status != 1 || this.permission_status == 0) {
            return false;
        }
        return true;
    }
}
