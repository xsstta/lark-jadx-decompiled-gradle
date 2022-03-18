package com.bytedance.ttnet.http;

import com.bytedance.frameworks.baselib.network.http.BaseRequestContext;
import org.json.JSONObject;

public class RequestContext extends BaseRequestContext {
    public boolean body_is_json;
    public int cdn_request_num;
    public long decode_time;
    public boolean force_no_https;
    public JSONObject headers;
    public int https_fail_times = -1;
    public int https_to_http;
    public String local_sign;
    public boolean need_header;
    public String ss_sign;
    public boolean using_https;
}
