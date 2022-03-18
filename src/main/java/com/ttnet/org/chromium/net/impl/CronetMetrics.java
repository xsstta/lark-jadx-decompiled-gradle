package com.ttnet.org.chromium.net.impl;

import com.ttnet.org.chromium.net.RequestFinishedInfo;
import java.util.Date;

public final class CronetMetrics extends RequestFinishedInfo.Metrics {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final long mConnectEndMs;
    private final long mConnectStartMs;
    private final long mDnsEndMs;
    private final long mDnsStartMs;
    private final String mPeerAddr;
    private final Long mPeerPort;
    private final long mPostTaskStartMs;
    private final long mPushEndMs;
    private final long mPushStartMs;
    private final Long mReceivedByteCount;
    private final long mRequestEndMs;
    private final String mRequestHeaders;
    private final long mRequestStartMs;
    private final String mResponseHeaders;
    private final long mResponseStartMs;
    private final Long mRetryAttempts;
    private final long mSendingEndMs;
    private final long mSendingStartMs;
    private final Long mSentByteCount;
    private final boolean mSocketReused;
    private final long mSslEndMs;
    private final long mSslStartMs;
    private final Long mTotalTimeMs;
    private final Long mTtfbMs;

    private static boolean checkOrder(long j, long j2) {
        return (j2 >= j && j != -1) || j2 == -1;
    }

    @Override // com.ttnet.org.chromium.net.RequestFinishedInfo.Metrics
    public String getPeerAddr() {
        return this.mPeerAddr;
    }

    @Override // com.ttnet.org.chromium.net.RequestFinishedInfo.Metrics
    public Long getPeerPort() {
        return this.mPeerPort;
    }

    @Override // com.ttnet.org.chromium.net.RequestFinishedInfo.Metrics
    public Long getReceivedByteCount() {
        return this.mReceivedByteCount;
    }

    @Override // com.ttnet.org.chromium.net.RequestFinishedInfo.Metrics
    public String getRequestHeaders() {
        return this.mRequestHeaders;
    }

    @Override // com.ttnet.org.chromium.net.RequestFinishedInfo.Metrics
    public String getResponseHeaders() {
        return this.mResponseHeaders;
    }

    @Override // com.ttnet.org.chromium.net.RequestFinishedInfo.Metrics
    public Long getRetryAttempts() {
        return this.mRetryAttempts;
    }

    @Override // com.ttnet.org.chromium.net.RequestFinishedInfo.Metrics
    public Long getSentByteCount() {
        return this.mSentByteCount;
    }

    @Override // com.ttnet.org.chromium.net.RequestFinishedInfo.Metrics
    public boolean getSocketReused() {
        return this.mSocketReused;
    }

    @Override // com.ttnet.org.chromium.net.RequestFinishedInfo.Metrics
    public Long getTotalTimeMs() {
        return this.mTotalTimeMs;
    }

    @Override // com.ttnet.org.chromium.net.RequestFinishedInfo.Metrics
    public Long getTtfbMs() {
        return this.mTtfbMs;
    }

    @Override // com.ttnet.org.chromium.net.RequestFinishedInfo.Metrics
    public Date getConnectEnd() {
        return toDate(this.mConnectEndMs);
    }

    @Override // com.ttnet.org.chromium.net.RequestFinishedInfo.Metrics
    public Date getConnectStart() {
        return toDate(this.mConnectStartMs);
    }

    @Override // com.ttnet.org.chromium.net.RequestFinishedInfo.Metrics
    public Date getDnsEnd() {
        return toDate(this.mDnsEndMs);
    }

    @Override // com.ttnet.org.chromium.net.RequestFinishedInfo.Metrics
    public Date getDnsStart() {
        return toDate(this.mDnsStartMs);
    }

    @Override // com.ttnet.org.chromium.net.RequestFinishedInfo.Metrics
    public Date getPostTaskStartMs() {
        return toDate(this.mPostTaskStartMs);
    }

    @Override // com.ttnet.org.chromium.net.RequestFinishedInfo.Metrics
    public Date getPushEnd() {
        return toDate(this.mPushEndMs);
    }

    @Override // com.ttnet.org.chromium.net.RequestFinishedInfo.Metrics
    public Date getPushStart() {
        return toDate(this.mPushStartMs);
    }

    @Override // com.ttnet.org.chromium.net.RequestFinishedInfo.Metrics
    public Date getRequestEnd() {
        return toDate(this.mRequestEndMs);
    }

    @Override // com.ttnet.org.chromium.net.RequestFinishedInfo.Metrics
    public Date getRequestStart() {
        return toDate(this.mRequestStartMs);
    }

    @Override // com.ttnet.org.chromium.net.RequestFinishedInfo.Metrics
    public Date getResponseStart() {
        return toDate(this.mResponseStartMs);
    }

    @Override // com.ttnet.org.chromium.net.RequestFinishedInfo.Metrics
    public Date getSendingEnd() {
        return toDate(this.mSendingEndMs);
    }

    @Override // com.ttnet.org.chromium.net.RequestFinishedInfo.Metrics
    public Date getSendingStart() {
        return toDate(this.mSendingStartMs);
    }

    @Override // com.ttnet.org.chromium.net.RequestFinishedInfo.Metrics
    public Date getSslEnd() {
        return toDate(this.mSslEndMs);
    }

    @Override // com.ttnet.org.chromium.net.RequestFinishedInfo.Metrics
    public Date getSslStart() {
        return toDate(this.mSslStartMs);
    }

    private static Date toDate(long j) {
        if (j != -1) {
            return new Date(j);
        }
        return null;
    }

    public CronetMetrics(Long l, Long l2, Long l3, Long l4) {
        this.mTtfbMs = l;
        this.mTotalTimeMs = l2;
        this.mSentByteCount = l3;
        this.mReceivedByteCount = l4;
        this.mRequestStartMs = -1;
        this.mDnsStartMs = -1;
        this.mDnsEndMs = -1;
        this.mConnectStartMs = -1;
        this.mConnectEndMs = -1;
        this.mSslStartMs = -1;
        this.mSslEndMs = -1;
        this.mSendingStartMs = -1;
        this.mSendingEndMs = -1;
        this.mPushStartMs = -1;
        this.mPushEndMs = -1;
        this.mResponseStartMs = -1;
        this.mRequestEndMs = -1;
        this.mPostTaskStartMs = -1;
        this.mPeerAddr = "";
        this.mPeerPort = 0L;
        this.mRetryAttempts = 0L;
        this.mRequestHeaders = "";
        this.mResponseHeaders = "";
    }

    public CronetMetrics(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, long j14, long j15, long j16, String str, long j17, long j18, String str2, String str3) {
        this.mRequestStartMs = j;
        this.mDnsStartMs = j2;
        this.mDnsEndMs = j3;
        this.mConnectStartMs = j4;
        this.mConnectEndMs = j5;
        this.mSslStartMs = j6;
        this.mSslEndMs = j7;
        this.mSendingStartMs = j8;
        this.mSendingEndMs = j9;
        this.mPushStartMs = j10;
        this.mPushEndMs = j11;
        this.mResponseStartMs = j12;
        this.mRequestEndMs = j13;
        this.mSocketReused = z;
        this.mPostTaskStartMs = j16;
        this.mSentByteCount = Long.valueOf(j14);
        this.mReceivedByteCount = Long.valueOf(j15);
        this.mPeerAddr = str;
        this.mPeerPort = Long.valueOf(j17);
        this.mRetryAttempts = Long.valueOf(j18);
        if (j9 == -1 || j12 == -1) {
            this.mTtfbMs = null;
        } else {
            this.mTtfbMs = Long.valueOf(j12 - j9);
        }
        if (j == -1 || j13 == -1) {
            this.mTotalTimeMs = null;
        } else {
            this.mTotalTimeMs = Long.valueOf(j13 - j);
        }
        this.mRequestHeaders = str2;
        this.mResponseHeaders = str3;
    }
}
