package com.ss.ttvideoengine.httpdns;

import com.ss.mediakit.net.AVMDLCustomHTTPDNSParser;
import com.ss.mediakit.net.AVMDLCustomHTTPDNSParserResult;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;

public class BytedanceHTTPDNSParser implements AVMDLCustomHTTPDNSParser {
    private final ByteDanceHttpDnsDepend mByteDanceHttpDnsDepend;

    public int start() {
        throw new UnsupportedOperationException("tob only");
    }

    @Override // com.ss.mediakit.net.AVMDLCustomHTTPDNSParser
    public AVMDLCustomHTTPDNSParserResult parseHost(String str) {
        throw new UnsupportedOperationException("tob only");
    }

    public BytedanceHTTPDNSParser(ByteDanceHttpDnsDepend byteDanceHttpDnsDepend) {
        TTVideoEngineLog.m256500d("BytedanceHTTPDNSParser", "new parser " + byteDanceHttpDnsDepend);
        this.mByteDanceHttpDnsDepend = byteDanceHttpDnsDepend;
    }
}
