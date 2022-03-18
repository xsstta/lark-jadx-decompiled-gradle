package com.ss.mediakit.net;

public class AVMDLCustomHTTPDNSParserResult {
    public String mHostName;
    public String mIPList;
    public long mTTL;

    public AVMDLCustomHTTPDNSParserResult(String str, String str2, int i) {
        this.mHostName = str;
        this.mIPList = str2;
        this.mTTL = (long) i;
    }
}
