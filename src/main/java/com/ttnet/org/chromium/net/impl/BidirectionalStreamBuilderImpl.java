package com.ttnet.org.chromium.net.impl;

import com.ttnet.org.chromium.net.BidirectionalStream;
import com.ttnet.org.chromium.net.ExperimentalBidirectionalStream;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

public class BidirectionalStreamBuilderImpl extends ExperimentalBidirectionalStream.Builder {
    private final BidirectionalStream.Callback mCallback;
    private final CronetEngineBase mCronetEngine;
    private boolean mDelayRequestHeadersUntilFirstFlush;
    private final Executor mExecutor;
    private String mHttpMethod = "POST";
    private int mPriority = 3;
    private Collection<Object> mRequestAnnotations;
    private final ArrayList<Map.Entry<String, String>> mRequestHeaders = new ArrayList<>();
    private int mTrafficStatsTag;
    private boolean mTrafficStatsTagSet;
    private int mTrafficStatsUid;
    private boolean mTrafficStatsUidSet;
    private final String mUrl;

    @Override // com.ttnet.org.chromium.net.BidirectionalStream.Builder, com.ttnet.org.chromium.net.ExperimentalBidirectionalStream.Builder, com.ttnet.org.chromium.net.ExperimentalBidirectionalStream.Builder
    public ExperimentalBidirectionalStream build() {
        return this.mCronetEngine.createBidirectionalStream(this.mUrl, this.mCallback, this.mExecutor, this.mHttpMethod, this.mRequestHeaders, this.mPriority, this.mDelayRequestHeadersUntilFirstFlush, this.mRequestAnnotations, this.mTrafficStatsTagSet, this.mTrafficStatsTag, this.mTrafficStatsUidSet, this.mTrafficStatsUid);
    }

    @Override // com.ttnet.org.chromium.net.BidirectionalStream.Builder, com.ttnet.org.chromium.net.ExperimentalBidirectionalStream.Builder, com.ttnet.org.chromium.net.ExperimentalBidirectionalStream.Builder
    public BidirectionalStreamBuilderImpl delayRequestHeadersUntilFirstFlush(boolean z) {
        this.mDelayRequestHeadersUntilFirstFlush = z;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.BidirectionalStream.Builder, com.ttnet.org.chromium.net.ExperimentalBidirectionalStream.Builder, com.ttnet.org.chromium.net.ExperimentalBidirectionalStream.Builder
    public BidirectionalStreamBuilderImpl setPriority(int i) {
        this.mPriority = i;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalBidirectionalStream.Builder
    public ExperimentalBidirectionalStream.Builder setTrafficStatsTag(int i) {
        this.mTrafficStatsTagSet = true;
        this.mTrafficStatsTag = i;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalBidirectionalStream.Builder
    public ExperimentalBidirectionalStream.Builder setTrafficStatsUid(int i) {
        this.mTrafficStatsUidSet = true;
        this.mTrafficStatsUid = i;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalBidirectionalStream.Builder
    public ExperimentalBidirectionalStream.Builder addRequestAnnotation(Object obj) {
        Objects.requireNonNull(obj, "Invalid metrics annotation.");
        if (this.mRequestAnnotations == null) {
            this.mRequestAnnotations = new ArrayList();
        }
        this.mRequestAnnotations.add(obj);
        return this;
    }

    @Override // com.ttnet.org.chromium.net.BidirectionalStream.Builder, com.ttnet.org.chromium.net.ExperimentalBidirectionalStream.Builder, com.ttnet.org.chromium.net.ExperimentalBidirectionalStream.Builder
    public BidirectionalStreamBuilderImpl setHttpMethod(String str) {
        Objects.requireNonNull(str, "Method is required.");
        this.mHttpMethod = str;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.BidirectionalStream.Builder, com.ttnet.org.chromium.net.ExperimentalBidirectionalStream.Builder, com.ttnet.org.chromium.net.ExperimentalBidirectionalStream.Builder
    public BidirectionalStreamBuilderImpl addHeader(String str, String str2) {
        Objects.requireNonNull(str, "Invalid header name.");
        Objects.requireNonNull(str2, "Invalid header value.");
        this.mRequestHeaders.add(new AbstractMap.SimpleImmutableEntry(str, str2));
        return this;
    }

    BidirectionalStreamBuilderImpl(String str, BidirectionalStream.Callback callback, Executor executor, CronetEngineBase cronetEngineBase) {
        Objects.requireNonNull(str, "URL is required.");
        Objects.requireNonNull(callback, "Callback is required.");
        Objects.requireNonNull(executor, "Executor is required.");
        Objects.requireNonNull(cronetEngineBase, "CronetEngine is required.");
        this.mUrl = str;
        this.mCallback = callback;
        this.mExecutor = executor;
        this.mCronetEngine = cronetEngineBase;
    }
}
