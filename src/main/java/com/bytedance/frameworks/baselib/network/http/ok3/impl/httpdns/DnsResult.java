package com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DnsResult implements Serializable {
    public List<String> ipv4List = new ArrayList();
    public List<String> ipv6List = new ArrayList();
    public Source source = Source.HTTPDNS_CACHE;

    public enum Source {
        UNKNOWN,
        HTTPDNS_CACHE,
        HTTPDNS_STALE_CACHE,
        HTTPDNS_REQUEST,
        LOCALDNS_REQUEST,
        LOCALDNS_CACHE,
        HARDCODE_IPS
    }
}
