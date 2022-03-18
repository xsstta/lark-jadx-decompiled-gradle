package com.bytedance.frameworks.baselib.network.http;

public class BaseRequestContext {
    public boolean bypassCookie;
    public boolean bypass_network_status_check;
    public boolean followRedirectInternal = true;
    public boolean force_handle_response;
    public int input_stream_buffer_size;
    public boolean is_need_monitor_in_cancel = true;
    public long protect_timeout;
    public String remoteIp;
    public int request_flag;
    public long socket_connect_timeout;
    public long socket_read_timeout;
    public long socket_write_timeout;
    public int status;
    public long throttle_net_speed;
    public long timeout_connect;
    public long timeout_read;
    public long timeout_write;
}
