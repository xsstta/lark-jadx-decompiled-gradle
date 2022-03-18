package com.ttnet.org.chromium.net.impl;

import android.content.Context;
import android.util.Pair;
import com.ttnet.org.chromium.net.CronetEngine;
import com.ttnet.org.chromium.net.ICronetEngineBuilder;
import com.ttnet.org.chromium.net.TTAppInfoProvider;
import com.ttnet.org.chromium.net.TTEventListener;
import com.ttnet.org.chromium.net.TTMonitorProvider;
import com.ttnet.org.chromium.net.impl.VersionSafeCallbacks;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.IDN;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;

public abstract class CronetEngineBuilderImpl extends ICronetEngineBuilder {
    private static final Pattern INVALID_PKP_HOST_NAME = Pattern.compile("^[0-9\\.]*$");
    private static final String TAG = "CronetEngineBuilderImpl";
    private long mALogFuncAddr;
    private TTAppInfoProvider mAppInfoProvider;
    private TTMonitorProvider mAppMonitorProvider;
    private final Context mApplicationContext;
    private String mBoeJson;
    private boolean mBoeProxyEnabled;
    private boolean mBrotiEnabled;
    private Map<String[], Pair<byte[], byte[]>> mClientOpaqueData;
    private String mCronetSoPath;
    private boolean mDisableCache;
    private TTEventListener mEventListener;
    private String mExperimentalOptions;
    private String mGetDomainDefaultJSON;
    private boolean mHttp2Enabled;
    private long mHttpCacheMaxSize;
    private int mHttpCacheMode;
    private boolean mHttpDnsEnabled;
    private boolean mListenAppStateIndependently;
    protected long mMockCertVerifier;
    private boolean mNetworkQualityEstimatorEnabled;
    private ArrayList<byte[]> mOpaqueData;
    private final List<Pkp> mPkps = new LinkedList();
    private String mProxyConfig;
    private boolean mPublicKeyPinningBypassForLocalTrustAnchorsEnabled;
    private boolean mQuicEnabled;
    private final List<QuicHint> mQuicHints = new LinkedList();
    private String mStoragePath;
    private String mStoreIdcRuleJson;
    private int mThreadPriority = 20;
    private String mUserAgent;
    private boolean mVerboseLogEnabled;

    @Retention(RetentionPolicy.SOURCE)
    public @interface HttpCacheSetting {
    }

    @Override // com.ttnet.org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl enableSdch(boolean z) {
        return this;
    }

    @Override // com.ttnet.org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl enableVerboseLog() {
        this.mVerboseLogEnabled = true;
        return this;
    }

    /* access modifiers changed from: package-private */
    public VersionSafeCallbacks.LibraryLoader libraryLoader() {
        return null;
    }

    @Override // com.ttnet.org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        return this;
    }

    /* access modifiers changed from: package-private */
    public long aLogFuncAddr() {
        return this.mALogFuncAddr;
    }

    /* access modifiers changed from: package-private */
    public boolean boeProxyEnabled() {
        return this.mBoeProxyEnabled;
    }

    /* access modifiers changed from: package-private */
    public boolean brotliEnabled() {
        return this.mBrotiEnabled;
    }

    /* access modifiers changed from: package-private */
    public boolean cacheDisabled() {
        return this.mDisableCache;
    }

    public String experimentalOptions() {
        return this.mExperimentalOptions;
    }

    /* access modifiers changed from: package-private */
    public TTAppInfoProvider getAppInfoProvider() {
        return this.mAppInfoProvider;
    }

    /* access modifiers changed from: package-private */
    public TTMonitorProvider getAppMonitorProvider() {
        return this.mAppMonitorProvider;
    }

    /* access modifiers changed from: package-private */
    public String getBypassBOEJSON() {
        return this.mBoeJson;
    }

    /* access modifiers changed from: package-private */
    public Map<String[], Pair<byte[], byte[]>> getClientOpaqueData() {
        return this.mClientOpaqueData;
    }

    /* access modifiers changed from: package-private */
    public Context getContext() {
        return this.mApplicationContext;
    }

    public String getCronetSoPath() {
        return this.mCronetSoPath;
    }

    /* access modifiers changed from: package-private */
    public TTEventListener getEventListener() {
        return this.mEventListener;
    }

    /* access modifiers changed from: package-private */
    public String getGetDomainDefaultJSON() {
        return this.mGetDomainDefaultJSON;
    }

    /* access modifiers changed from: package-private */
    public boolean getListenAppStateIndependently() {
        return this.mListenAppStateIndependently;
    }

    /* access modifiers changed from: package-private */
    public ArrayList<byte[]> getOpaqueData() {
        return this.mOpaqueData;
    }

    /* access modifiers changed from: package-private */
    public String getProxyConfig() {
        return this.mProxyConfig;
    }

    /* access modifiers changed from: package-private */
    public String getStoreIdcRuleJSON() {
        return this.mStoreIdcRuleJson;
    }

    /* access modifiers changed from: package-private */
    public String getUserAgent() {
        return this.mUserAgent;
    }

    /* access modifiers changed from: package-private */
    public boolean http2Enabled() {
        return this.mHttp2Enabled;
    }

    /* access modifiers changed from: package-private */
    public long httpCacheMaxSize() {
        return this.mHttpCacheMaxSize;
    }

    /* access modifiers changed from: package-private */
    public int httpCacheMode() {
        return this.mHttpCacheMode;
    }

    /* access modifiers changed from: package-private */
    public boolean httpDnsEnabled() {
        return this.mHttpDnsEnabled;
    }

    /* access modifiers changed from: package-private */
    public long mockCertVerifier() {
        return this.mMockCertVerifier;
    }

    /* access modifiers changed from: package-private */
    public boolean networkQualityEstimatorEnabled() {
        return this.mNetworkQualityEstimatorEnabled;
    }

    /* access modifiers changed from: package-private */
    public boolean publicKeyPinningBypassForLocalTrustAnchorsEnabled() {
        return this.mPublicKeyPinningBypassForLocalTrustAnchorsEnabled;
    }

    /* access modifiers changed from: package-private */
    public List<Pkp> publicKeyPins() {
        return this.mPkps;
    }

    /* access modifiers changed from: package-private */
    public boolean quicEnabled() {
        return this.mQuicEnabled;
    }

    /* access modifiers changed from: package-private */
    public List<QuicHint> quicHints() {
        return this.mQuicHints;
    }

    /* access modifiers changed from: package-private */
    public String storagePath() {
        return this.mStoragePath;
    }

    /* access modifiers changed from: package-private */
    public boolean verboseLogEnabled() {
        return this.mVerboseLogEnabled;
    }

    @Override // com.ttnet.org.chromium.net.ICronetEngineBuilder
    public String getDefaultUserAgent() {
        return UserAgent.from(this.mApplicationContext);
    }

    /* access modifiers changed from: package-private */
    public String getDefaultQuicUserAgentId() {
        if (this.mQuicEnabled) {
            return UserAgent.getQuicUserAgentIdFrom(this.mApplicationContext);
        }
        return "";
    }

    @Override // com.ttnet.org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl enableBoeProxy(boolean z) {
        this.mBoeProxyEnabled = z;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl enableBrotli(boolean z) {
        this.mBrotiEnabled = z;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl enableHttp2(boolean z) {
        this.mHttp2Enabled = z;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl enableHttpDns(boolean z) {
        this.mHttpDnsEnabled = z;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl enableNetworkQualityEstimator(boolean z) {
        this.mNetworkQualityEstimatorEnabled = z;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
        this.mPublicKeyPinningBypassForLocalTrustAnchorsEnabled = z;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl enableQuic(boolean z) {
        this.mQuicEnabled = z;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl listenAppStateIndependently(boolean z) {
        this.mListenAppStateIndependently = z;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl setALogFuncAddr(long j) {
        this.mALogFuncAddr = j;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl setAppInfoProvider(TTAppInfoProvider tTAppInfoProvider) {
        this.mAppInfoProvider = tTAppInfoProvider;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl setAppMonitorProvider(TTMonitorProvider tTMonitorProvider) {
        this.mAppMonitorProvider = tTMonitorProvider;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl setBypassBOEJSON(String str) {
        this.mBoeJson = str;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl setClientOpaqueData(Map<String[], Pair<byte[], byte[]>> map) {
        this.mClientOpaqueData = map;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder setCronetSoPath(String str) {
        this.mCronetSoPath = str;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl setEventListener(TTEventListener tTEventListener) {
        this.mEventListener = tTEventListener;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl setExperimentalOptions(String str) {
        this.mExperimentalOptions = str;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl setGetDomainDefaultJSON(String str) {
        this.mGetDomainDefaultJSON = str;
        return this;
    }

    public CronetEngineBuilderImpl setMockCertVerifierForTesting(long j) {
        this.mMockCertVerifier = j;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl setOpaqueData(ArrayList<byte[]> arrayList) {
        this.mOpaqueData = arrayList;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl setProxyConfig(String str) {
        this.mProxyConfig = str;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl setStoreIdcRuleJSON(String str) {
        this.mStoreIdcRuleJson = str;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl setUserAgent(String str) {
        this.mUserAgent = str;
        return this;
    }

    /* access modifiers changed from: package-private */
    public int threadPriority(int i) {
        int i2 = this.mThreadPriority;
        return i2 == 20 ? i : i2;
    }

    @Override // com.ttnet.org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl setThreadPriority(int i) {
        if (i > 19 || i < -20) {
            throw new IllegalArgumentException("Thread priority invalid");
        }
        this.mThreadPriority = i;
        return this;
    }

    public CronetEngineBuilderImpl(Context context) {
        this.mApplicationContext = context.getApplicationContext();
        enableQuic(false);
        enableHttp2(true);
        enableBrotli(false);
        enableHttpCache(0, 0L);
        enableNetworkQualityEstimator(false);
        enablePublicKeyPinningBypassForLocalTrustAnchors(true);
        enableHttpDns(false);
        listenAppStateIndependently(false);
    }

    @Override // com.ttnet.org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl setStoragePath(String str) {
        File file = new File(str);
        if (!file.exists() && !file.mkdirs()) {
            throw new IllegalArgumentException("create Storage path failed");
        } else if (file.isDirectory()) {
            this.mStoragePath = str;
            return this;
        } else {
            throw new IllegalArgumentException("Storage path must be set to existing directory");
        }
    }

    private static String validateHostNameForPinningAndConvert(String str) throws IllegalArgumentException {
        if (INVALID_PKP_HOST_NAME.matcher(str).matches()) {
            throw new IllegalArgumentException("Hostname " + str + " is illegal. A hostname should not consist of digits and/or dots only.");
        } else if (str.length() <= 255) {
            try {
                return IDN.toASCII(str, 2);
            } catch (IllegalArgumentException unused) {
                throw new IllegalArgumentException("Hostname " + str + " is illegal. The name of the host does not comply with RFC 1122 and RFC 1123.");
            }
        } else {
            throw new IllegalArgumentException("Hostname " + str + " is too long. The name of the host does not comply with RFC 1122 and RFC 1123.");
        }
    }

    @Override // com.ttnet.org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl enableHttpCache(int i, long j) {
        boolean z;
        if (i == 3 || i == 2) {
            if (storagePath() == null) {
                throw new IllegalArgumentException("Storage path must be set");
            }
        } else if (storagePath() != null) {
            throw new IllegalArgumentException("Storage path must not be set");
        }
        if (i == 0 || i == 2) {
            z = true;
        } else {
            z = false;
        }
        this.mDisableCache = z;
        this.mHttpCacheMaxSize = j;
        if (i == 0) {
            this.mHttpCacheMode = 0;
        } else if (i == 1) {
            this.mHttpCacheMode = 2;
        } else if (i == 2 || i == 3) {
            this.mHttpCacheMode = 1;
        } else {
            throw new IllegalArgumentException("Unknown cache mode");
        }
        return this;
    }

    public static class QuicHint {
        final int mAlternatePort;
        final String mHost;
        final int mPort;

        QuicHint(String str, int i, int i2) {
            this.mHost = str;
            this.mPort = i;
            this.mAlternatePort = i2;
        }
    }

    @Override // com.ttnet.org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl addQuicHint(String str, int i, int i2) {
        if (!str.contains("/")) {
            this.mQuicHints.add(new QuicHint(str, i, i2));
            return this;
        }
        throw new IllegalArgumentException("Illegal QUIC Hint Host: " + str);
    }

    public static class Pkp {
        final Date mExpirationDate;
        final byte[][] mHashes;
        final String mHost;
        final boolean mIncludeSubdomains;

        Pkp(String str, byte[][] bArr, boolean z, Date date) {
            this.mHost = str;
            this.mHashes = bArr;
            this.mIncludeSubdomains = z;
            this.mExpirationDate = date;
        }
    }

    @Override // com.ttnet.org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl addPublicKeyPins(String str, Set<byte[]> set, boolean z, Date date) {
        Objects.requireNonNull(str, "The hostname cannot be null");
        Objects.requireNonNull(set, "The set of SHA256 pins cannot be null");
        Objects.requireNonNull(date, "The pin expiration date cannot be null");
        String validateHostNameForPinningAndConvert = validateHostNameForPinningAndConvert(str);
        HashSet hashSet = new HashSet(set.size());
        for (byte[] bArr : set) {
            if (bArr == null || bArr.length != 32) {
                throw new IllegalArgumentException("Public key pin is invalid");
            }
            hashSet.add(bArr);
        }
        this.mPkps.add(new Pkp(validateHostNameForPinningAndConvert, (byte[][]) hashSet.toArray(new byte[hashSet.size()][]), z, date));
        return this;
    }
}
