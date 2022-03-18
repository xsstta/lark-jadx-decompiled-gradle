package com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns;

import java.io.Serializable;

public class HostResolveJob implements Serializable, Comparable<HostResolveJob> {
    private long mCreatedTime = System.currentTimeMillis();
    private String mHost;
    public AbstractC14044d mHttpDnsCallback;
    private boolean mIsLocalDnsExpired;

    public String getHost() {
        return this.mHost;
    }

    public boolean isLocalDnsExpired() {
        return this.mIsLocalDnsExpired;
    }

    public int compareTo(HostResolveJob hostResolveJob) {
        long j = hostResolveJob.mCreatedTime;
        long j2 = this.mCreatedTime;
        if (j == j2) {
            return 0;
        }
        if (j < j2) {
            return -1;
        }
        return 1;
    }

    public HostResolveJob(String str, AbstractC14044d dVar, boolean z) {
        this.mHost = str;
        this.mHttpDnsCallback = dVar;
        this.mIsLocalDnsExpired = z;
    }
}
