package com.ttnet.org.chromium.net.impl;

import android.util.Pair;
import com.ttnet.org.chromium.net.ExperimentalUrlRequest;
import com.ttnet.org.chromium.net.RequestFinishedInfo;
import com.ttnet.org.chromium.net.UploadDataProvider;
import com.ttnet.org.chromium.net.UrlRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

public class UrlRequestBuilderImpl extends ExperimentalUrlRequest.Builder {
    private static final String TAG = "UrlRequestBuilderImpl";
    private boolean mAllowDirectExecutor;
    private final UrlRequest.Callback mCallback;
    private final CronetEngineBase mCronetEngine;
    private boolean mDisableCache;
    private boolean mDisableConnectionMigration;
    private final Executor mExecutor;
    private String mMethod;
    private int mPriority = 3;
    private Collection<Object> mRequestAnnotations;
    private RequestFinishedInfo.Listener mRequestFinishedListener;
    private final ArrayList<Pair<String, String>> mRequestHeaders = new ArrayList<>();
    private int mRequestTimeout;
    private int mSocketConnectTimeout;
    private int mSocketReadTimeout;
    private int mSocketWriteTimeout;
    private int mTrafficStatsTag;
    private boolean mTrafficStatsTagSet;
    private int mTrafficStatsUid;
    private boolean mTrafficStatsUidSet;
    private UploadDataProvider mUploadDataProvider;
    private Executor mUploadDataProviderExecutor;
    private final String mUrl;

    @Override // com.ttnet.org.chromium.net.UrlRequest.Builder, com.ttnet.org.chromium.net.ExperimentalUrlRequest.Builder, com.ttnet.org.chromium.net.ExperimentalUrlRequest.Builder
    public UrlRequestBuilderImpl allowDirectExecutor() {
        this.mAllowDirectExecutor = true;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.UrlRequest.Builder, com.ttnet.org.chromium.net.ExperimentalUrlRequest.Builder, com.ttnet.org.chromium.net.ExperimentalUrlRequest.Builder
    public UrlRequestBuilderImpl disableCache() {
        this.mDisableCache = true;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalUrlRequest.Builder
    public UrlRequestBuilderImpl disableConnectionMigration() {
        this.mDisableConnectionMigration = true;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.UrlRequest.Builder, com.ttnet.org.chromium.net.ExperimentalUrlRequest.Builder, com.ttnet.org.chromium.net.ExperimentalUrlRequest.Builder
    public UrlRequestBase build() {
        UrlRequestBase createRequest = this.mCronetEngine.createRequest(this.mUrl, this.mCallback, this.mExecutor, this.mPriority, this.mRequestAnnotations, this.mDisableCache, this.mDisableConnectionMigration, this.mAllowDirectExecutor, this.mTrafficStatsTagSet, this.mTrafficStatsTag, this.mTrafficStatsUidSet, this.mTrafficStatsUid, this.mRequestFinishedListener);
        String str = this.mMethod;
        if (str != null) {
            createRequest.setHttpMethod(str);
        }
        Iterator<Pair<String, String>> it = this.mRequestHeaders.iterator();
        while (it.hasNext()) {
            Pair<String, String> next = it.next();
            createRequest.addHeader((String) next.first, (String) next.second);
        }
        UploadDataProvider uploadDataProvider = this.mUploadDataProvider;
        if (uploadDataProvider != null) {
            createRequest.setUploadDataProvider(uploadDataProvider, this.mUploadDataProviderExecutor);
        }
        createRequest.setSocketConnectTimeout(this.mSocketConnectTimeout);
        createRequest.setSocketReadTimeout(this.mSocketReadTimeout);
        createRequest.setSocketWriteTimeout(this.mSocketWriteTimeout);
        createRequest.setRequestTimeout(this.mRequestTimeout);
        return createRequest;
    }

    @Override // com.ttnet.org.chromium.net.UrlRequest.Builder, com.ttnet.org.chromium.net.ExperimentalUrlRequest.Builder, com.ttnet.org.chromium.net.ExperimentalUrlRequest.Builder
    public UrlRequestBuilderImpl setPriority(int i) {
        this.mPriority = i;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalUrlRequest.Builder
    public UrlRequestBuilderImpl setRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        this.mRequestFinishedListener = listener;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.UrlRequest.Builder
    public UrlRequestBuilderImpl setRequestTimeout(int i) {
        this.mRequestTimeout = i;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.UrlRequest.Builder
    public UrlRequestBuilderImpl setSocketConnectTimeout(int i) {
        this.mSocketConnectTimeout = i;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.UrlRequest.Builder
    public UrlRequestBuilderImpl setSocketReadTimeout(int i) {
        this.mSocketReadTimeout = i;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.UrlRequest.Builder
    public UrlRequestBuilderImpl setSocketWriteTimeout(int i) {
        this.mSocketWriteTimeout = i;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.UrlRequest.Builder, com.ttnet.org.chromium.net.ExperimentalUrlRequest.Builder, com.ttnet.org.chromium.net.ExperimentalUrlRequest.Builder
    public ExperimentalUrlRequest.Builder setHttpMethod(String str) {
        Objects.requireNonNull(str, "Method is required.");
        this.mMethod = str;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalUrlRequest.Builder
    public UrlRequestBuilderImpl setTrafficStatsTag(int i) {
        this.mTrafficStatsTagSet = true;
        this.mTrafficStatsTag = i;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalUrlRequest.Builder
    public UrlRequestBuilderImpl setTrafficStatsUid(int i) {
        this.mTrafficStatsUidSet = true;
        this.mTrafficStatsUid = i;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalUrlRequest.Builder
    public UrlRequestBuilderImpl addRequestAnnotation(Object obj) {
        Objects.requireNonNull(obj, "Invalid metrics annotation.");
        if (this.mRequestAnnotations == null) {
            this.mRequestAnnotations = new ArrayList();
        }
        this.mRequestAnnotations.add(obj);
        return this;
    }

    @Override // com.ttnet.org.chromium.net.UrlRequest.Builder, com.ttnet.org.chromium.net.ExperimentalUrlRequest.Builder, com.ttnet.org.chromium.net.ExperimentalUrlRequest.Builder
    public UrlRequestBuilderImpl addHeader(String str, String str2) {
        Objects.requireNonNull(str, "Invalid header name.");
        Objects.requireNonNull(str2, "Invalid header value.");
        this.mRequestHeaders.add(Pair.create(str, str2));
        return this;
    }

    @Override // com.ttnet.org.chromium.net.UrlRequest.Builder, com.ttnet.org.chromium.net.ExperimentalUrlRequest.Builder, com.ttnet.org.chromium.net.ExperimentalUrlRequest.Builder
    public UrlRequestBuilderImpl setUploadDataProvider(UploadDataProvider uploadDataProvider, Executor executor) {
        Objects.requireNonNull(uploadDataProvider, "Invalid UploadDataProvider.");
        Objects.requireNonNull(executor, "Invalid UploadDataProvider Executor.");
        if (this.mMethod == null) {
            this.mMethod = "POST";
        }
        this.mUploadDataProvider = uploadDataProvider;
        this.mUploadDataProviderExecutor = executor;
        return this;
    }

    UrlRequestBuilderImpl(String str, UrlRequest.Callback callback, Executor executor, CronetEngineBase cronetEngineBase) {
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
