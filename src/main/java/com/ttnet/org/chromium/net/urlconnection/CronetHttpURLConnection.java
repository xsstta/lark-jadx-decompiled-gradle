package com.ttnet.org.chromium.net.urlconnection;

import android.text.TextUtils;
import android.util.Pair;
import com.ttnet.org.chromium.base.Log;
import com.ttnet.org.chromium.base.Logger;
import com.ttnet.org.chromium.base.Reflect;
import com.ttnet.org.chromium.net.CronetEngine;
import com.ttnet.org.chromium.net.CronetException;
import com.ttnet.org.chromium.net.ExperimentalUrlRequest;
import com.ttnet.org.chromium.net.NetworkException;
import com.ttnet.org.chromium.net.RequestFinishedInfo;
import com.ttnet.org.chromium.net.UrlRequest;
import com.ttnet.org.chromium.net.UrlResponseInfo;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.CookieHandler;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.apache.http.conn.ConnectTimeoutException;

public class CronetHttpURLConnection extends HttpURLConnection {
    public static final String TAG = "CronetHttpURLConnection";
    public CookieHandler mCookieHandler = CookieHandler.getDefault();
    private final CronetEngine mCronetEngine;
    private volatile boolean mDisconnected = false;
    public IOException mException;
    public boolean mHasResponseHeadersOrCompleted;
    public CronetInputStream mInputStream = new CronetInputStream(this);
    private int mInputStreamBufferSize;
    public final MessageLoop mMessageLoop = new MessageLoop();
    public boolean mOnRedirectCalled;
    public CronetOutputStream mOutputStream;
    public UrlRequest mRequest;
    public RequestFinishedInfo mRequestFinishedInfo;
    private int mRequestFlag;
    private final List<Pair<String, String>> mRequestHeaders = new ArrayList();
    public volatile String mRequestLog;
    public CountDownLatch mRequestLogCountDownLatch = new CountDownLatch(1);
    private int mRequestPriority;
    private int mRequestTimeout;
    private List<Map.Entry<String, String>> mResponseHeadersList;
    private Map<String, List<String>> mResponseHeadersMap;
    public UrlResponseInfo mResponseInfo;
    private int mSocketConnectTimeout;
    private int mSocketReadTimeout;
    private int mSocketWriteTimeout;
    private long mThrottleNetSpeed;
    private int mTrafficStatsTag;
    private boolean mTrafficStatsTagSet;
    private int mTrafficStatsUid;
    private boolean mTrafficStatsUidSet;

    public boolean usingProxy() {
        return false;
    }

    public int getInputStreamBufferSize() {
        return this.mInputStreamBufferSize;
    }

    private boolean isChunkedUpload() {
        if (this.chunkLength > 0) {
            return true;
        }
        return false;
    }

    @Override // java.net.URLConnection
    public void connect() throws IOException {
        getOutputStream();
        startRequest();
    }

    public void onUploadTimeout() {
        UrlRequest urlRequest = this.mRequest;
        if (urlRequest != null) {
            urlRequest.appTimeout();
        }
    }

    public void disconnect() {
        UrlRequest urlRequest;
        if (this.connected && (urlRequest = this.mRequest) != null) {
            urlRequest.cancel();
            this.mDisconnected = true;
        }
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getHeaderFields() {
        try {
            getResponse();
            return getAllHeaders();
        } catch (IOException unused) {
            return Collections.emptyMap();
        }
    }

    public String getRequestLog() {
        if (this.mRequestLog != null) {
            return this.mRequestLog;
        }
        return "";
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() throws IOException {
        getResponse();
        return this.mResponseInfo.getHttpStatusCode();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() throws IOException {
        getResponse();
        return this.mResponseInfo.getHttpStatusText();
    }

    private void checkHasResponseHeaders() throws IOException {
        if (this.mHasResponseHeadersOrCompleted) {
            IOException iOException = this.mException;
            if (iOException == null) {
                Objects.requireNonNull(this.mResponseInfo, "Response info is null when there is no exception.");
                return;
            }
            throw iOException;
        }
        throw new IllegalStateException("No response.");
    }

    private long getStreamingModeContentLength() {
        long j = (long) this.fixedContentLength;
        try {
            long j2 = getClass().getField("fixedContentLengthLong").getLong(this);
            return j2 != -1 ? j2 : j;
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return j;
        }
    }

    public int getCronetInternalErrorCode() {
        IOException iOException = this.mException;
        if (iOException instanceof NetworkException) {
            return ((NetworkException) iOException).getCronetInternalErrorCode();
        }
        if (iOException instanceof TTRequestCanceledException) {
            return ((TTRequestCanceledException) iOException).getCronetInternalErrorCode();
        }
        return 0;
    }

    public InputStream getErrorStream() {
        try {
            getResponse();
            if (this.mResponseInfo.getHttpStatusCode() >= 400) {
                return this.mInputStream;
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    public RequestFinishedInfo getRequestFinishedInfo() {
        if (this.mRequestFinishedInfo == null && this.mDisconnected) {
            try {
                this.mRequestLogCountDownLatch.await(50, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return this.mRequestFinishedInfo;
    }

    private List<Map.Entry<String, String>> getAllHeadersAsList() {
        List<Map.Entry<String, String>> list = this.mResponseHeadersList;
        if (list != null) {
            return list;
        }
        this.mResponseHeadersList = new ArrayList();
        for (Map.Entry<String, String> entry : this.mResponseInfo.getAllHeadersAsList()) {
            this.mResponseHeadersList.add(new AbstractMap.SimpleImmutableEntry(entry));
        }
        List<Map.Entry<String, String>> unmodifiableList = Collections.unmodifiableList(this.mResponseHeadersList);
        this.mResponseHeadersList = unmodifiableList;
        return unmodifiableList;
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() throws IOException {
        getResponse();
        if (!this.instanceFollowRedirects && this.mOnRedirectCalled) {
            throw new IOException("Cannot read response body of a redirect.");
        } else if (this.mResponseInfo.getHttpStatusCode() < 400) {
            return this.mInputStream;
        } else {
            throw new FileNotFoundException(this.url.toString());
        }
    }

    private void getResponse() throws IOException {
        CronetOutputStream cronetOutputStream = this.mOutputStream;
        if (cronetOutputStream != null) {
            cronetOutputStream.checkReceivedEnoughContent();
            if (isChunkedUpload()) {
                this.mOutputStream.close();
            }
        }
        if (!this.mHasResponseHeadersOrCompleted) {
            startRequest();
            if (Logger.debug()) {
                Logger.m264568d(TAG, "getResponse loop url = " + getURL().toString());
            }
            cronet_loop(getConnectTimeout() + getReadTimeout());
            this.mHasResponseHeadersOrCompleted = true;
        }
        checkHasResponseHeaders();
    }

    public Map<String, List<String>> getAllHeaders() {
        Map<String, List<String>> map = this.mResponseHeadersMap;
        if (map != null) {
            return map;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Map.Entry<String, String> entry : getAllHeadersAsList()) {
            ArrayList arrayList = new ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                arrayList.addAll((Collection) treeMap.get(entry.getKey()));
            }
            arrayList.add(entry.getValue());
            treeMap.put(entry.getKey(), Collections.unmodifiableList(arrayList));
        }
        Map<String, List<String>> unmodifiableMap = Collections.unmodifiableMap(treeMap);
        this.mResponseHeadersMap = unmodifiableMap;
        return unmodifiableMap;
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getRequestProperties() {
        if (!this.connected) {
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (Pair<String, String> pair : this.mRequestHeaders) {
                if (!treeMap.containsKey(pair.first)) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add((String) pair.second);
                    treeMap.put((String) pair.first, Collections.unmodifiableList(arrayList));
                } else {
                    throw new IllegalStateException("Should not have multiple values.");
                }
            }
            return Collections.unmodifiableMap(treeMap);
        }
        throw new IllegalStateException("Cannot access request headers after connection is set.");
    }

    /* access modifiers changed from: private */
    public class CronetUrlRequestCallback extends UrlRequest.Callback {
        private void setRequestEnd() {
            CronetHttpURLConnection cronetHttpURLConnection = CronetHttpURLConnection.this;
            cronetHttpURLConnection.mRequestLog = cronetHttpURLConnection.mRequest.getRequestLog();
            try {
                if (CronetHttpURLConnection.this.mException != null) {
                    String str = null;
                    if (!(CronetHttpURLConnection.this.mRequestFinishedInfo == null || CronetHttpURLConnection.this.mRequestFinishedInfo.getMetrics() == null || CronetHttpURLConnection.this.mRequestFinishedInfo.getMetrics().getPeerAddr() == null)) {
                        str = CronetHttpURLConnection.this.mRequestFinishedInfo.getMetrics().getPeerAddr() + ":" + CronetHttpURLConnection.this.mRequestFinishedInfo.getMetrics().getPeerPort();
                    }
                    if (!TextUtils.isEmpty(str)) {
                        String message = CronetHttpURLConnection.this.mException.getMessage();
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append("|");
                        if (message == null) {
                            message = "null";
                        }
                        sb.append(message);
                        Reflect.on(CronetHttpURLConnection.this.mException).set("detailMessage", sb.toString());
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            CronetHttpURLConnection.this.mHasResponseHeadersOrCompleted = true;
            CronetHttpURLConnection.this.mMessageLoop.quit();
        }

        public CronetUrlRequestCallback() {
        }

        @Override // com.ttnet.org.chromium.net.UrlRequest.Callback
        public void onRequestLogCollected(String str, RequestFinishedInfo requestFinishedInfo) {
            CronetHttpURLConnection.this.mRequestLog = str;
            CronetHttpURLConnection.this.mRequestFinishedInfo = requestFinishedInfo;
            CronetHttpURLConnection.this.mRequestLogCountDownLatch.countDown();
        }

        private void setResponseDataCompleted(IOException iOException, boolean z) {
            CronetHttpURLConnection.this.mException = iOException;
            if (CronetHttpURLConnection.this.mInputStream != null) {
                CronetHttpURLConnection.this.mInputStream.setResponseDataCompleted(iOException);
            }
            if (CronetHttpURLConnection.this.mOutputStream != null) {
                CronetHttpURLConnection.this.mOutputStream.setRequestCompleted(iOException);
            }
            CronetHttpURLConnection.this.mHasResponseHeadersOrCompleted = true;
            if (!z) {
                setRequestEnd();
            }
        }

        @Override // com.ttnet.org.chromium.net.UrlRequest.Callback
        public void onMetricsCollected(UrlRequest urlRequest, RequestFinishedInfo requestFinishedInfo) {
            CronetHttpURLConnection.this.mRequestFinishedInfo = requestFinishedInfo;
            if (Logger.debug()) {
                Logger.m264568d(CronetHttpURLConnection.TAG, "onMetricsCollected loop quit url = " + CronetHttpURLConnection.this.getURL().toString());
            }
            setRequestEnd();
        }

        @Override // com.ttnet.org.chromium.net.UrlRequest.Callback
        public void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            CronetHttpURLConnection.this.mResponseInfo = urlResponseInfo;
            if (Logger.debug()) {
                Logger.m264568d(CronetHttpURLConnection.TAG, "onSucceeded url = " + CronetHttpURLConnection.this.getURL().toString());
            }
            setResponseDataCompleted(null, true);
        }

        @Override // com.ttnet.org.chromium.net.UrlRequest.Callback
        public void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            CronetHttpURLConnection.this.mResponseInfo = urlResponseInfo;
            if (Logger.debug()) {
                Logger.m264568d(CronetHttpURLConnection.TAG, "onCanceled loop quit url = " + CronetHttpURLConnection.this.getURL().toString());
            }
            if (CronetHttpURLConnection.this.mException == null) {
                CronetHttpURLConnection.this.mException = new TTRequestCanceledException("request canceled" + ", ErrorCode=" + 11 + ", InternalErrorCode=" + -999);
            }
            setResponseDataCompleted(CronetHttpURLConnection.this.mException, false);
        }

        @Override // com.ttnet.org.chromium.net.UrlRequest.Callback
        public void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
            CronetHttpURLConnection.this.mResponseInfo = urlResponseInfo;
            if (Logger.debug()) {
                Logger.m264568d(CronetHttpURLConnection.TAG, "onReadCompleted loop quit url = " + CronetHttpURLConnection.this.getURL().toString());
            }
            CronetHttpURLConnection.this.mMessageLoop.quit();
        }

        @Override // com.ttnet.org.chromium.net.UrlRequest.Callback
        public void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
            if (cronetException != null) {
                CronetHttpURLConnection.this.mResponseInfo = urlResponseInfo;
                CronetHttpURLConnection cronetHttpURLConnection = CronetHttpURLConnection.this;
                cronetHttpURLConnection.mException = cronetHttpURLConnection.tryConvertCronetException(cronetException);
                if (Logger.debug()) {
                    Logger.m264568d(CronetHttpURLConnection.TAG, "onFailed url = " + CronetHttpURLConnection.this.getURL().toString());
                }
                setResponseDataCompleted(cronetException, true);
                return;
            }
            throw new IllegalStateException("Exception cannot be null in onFailed.");
        }

        @Override // com.ttnet.org.chromium.net.UrlRequest.Callback
        public void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
            CronetHttpURLConnection.this.mOnRedirectCalled = true;
            try {
                URL url = new URL(str);
                boolean equals = url.getHost().equals(CronetHttpURLConnection.this.url.getHost());
                if (CronetHttpURLConnection.this.instanceFollowRedirects) {
                    CronetHttpURLConnection.this.url = url;
                }
                if (CronetHttpURLConnection.this.instanceFollowRedirects) {
                    if (CronetHttpURLConnection.this.mRequest != null) {
                        if (!equals) {
                            CronetHttpURLConnection.this.mRequest.RemoveRequestCookieHeader();
                            URL url2 = new URL(str);
                            CronetHttpURLConnection cronetHttpURLConnection = CronetHttpURLConnection.this;
                            Map<String, String> GetCookieMap = cronetHttpURLConnection.GetCookieMap(cronetHttpURLConnection.uri(url2));
                            if (GetCookieMap != null && !GetCookieMap.isEmpty()) {
                                for (Map.Entry<String, String> entry : GetCookieMap.entrySet()) {
                                    CronetHttpURLConnection.this.mRequest.AddRequestCookieHeader(entry.getKey(), entry.getValue());
                                }
                            }
                        }
                        CronetHttpURLConnection.this.mRequest.followRedirect();
                        return;
                    }
                    return;
                }
            } catch (MalformedURLException unused) {
            }
            CronetHttpURLConnection.this.mResponseInfo = urlResponseInfo;
            if (CronetHttpURLConnection.this.mRequest != null) {
                setResponseDataCompleted(null, false);
            }
            if (Logger.debug()) {
                Logger.m264568d(CronetHttpURLConnection.TAG, "onRedirectReceived loop quit url = " + CronetHttpURLConnection.this.getURL().toString());
            }
        }

        @Override // com.ttnet.org.chromium.net.UrlRequest.Callback
        public void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
            CronetHttpURLConnection.this.mResponseInfo = urlResponseInfo;
            CronetHttpURLConnection.this.mHasResponseHeadersOrCompleted = true;
            try {
                if (CronetHttpURLConnection.this.mResponseInfo != null) {
                    Map<String, List<String>> allHeaders = CronetHttpURLConnection.this.getAllHeaders();
                    if (CronetHttpURLConnection.this.mCookieHandler == null) {
                        CronetHttpURLConnection.this.mCookieHandler = CookieHandler.getDefault();
                    }
                    if (CronetHttpURLConnection.this.mCookieHandler != null) {
                        if (TextUtils.isEmpty(str)) {
                            CookieHandler cookieHandler = CronetHttpURLConnection.this.mCookieHandler;
                            CronetHttpURLConnection cronetHttpURLConnection = CronetHttpURLConnection.this;
                            cookieHandler.put(cronetHttpURLConnection.uri(cronetHttpURLConnection.getURL()), allHeaders);
                        } else {
                            CronetHttpURLConnection.this.mCookieHandler.put(CronetHttpURLConnection.this.uri(new URL(str)), allHeaders);
                        }
                    }
                }
            } catch (Exception e) {
                if (Logger.debug()) {
                    String str2 = CronetHttpURLConnection.TAG;
                    Logger.m264568d(str2, "Saving cookies failed for " + CronetHttpURLConnection.this.getURL().toString() + " e = " + e.getMessage());
                }
            }
            if (Logger.debug()) {
                Logger.m264568d(CronetHttpURLConnection.TAG, "onResponseStarted loop quit url = " + CronetHttpURLConnection.this.getURL().toString());
            }
            CronetHttpURLConnection.this.mMessageLoop.quit();
        }
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() throws IOException {
        if (this.mOutputStream == null && this.doOutput) {
            if (this.connected) {
                throw new ProtocolException("Cannot write to OutputStream after receiving response.");
            } else if (isChunkedUpload()) {
                this.mOutputStream = new CronetChunkedOutputStream(this, this.chunkLength, this.mMessageLoop);
                startRequest();
            } else {
                long streamingModeContentLength = getStreamingModeContentLength();
                if (streamingModeContentLength != -1) {
                    CronetFixedModeOutputStream cronetFixedModeOutputStream = new CronetFixedModeOutputStream(this, streamingModeContentLength, this.mMessageLoop);
                    this.mOutputStream = cronetFixedModeOutputStream;
                    if (streamingModeContentLength == 0) {
                        setFixedLengthStreamingMode((int) cronetFixedModeOutputStream.getUploadDataProvider().getLength());
                        if (getRequestProperty("Content-Length") == null) {
                            addRequestProperty("Content-Length", Long.toString(this.mOutputStream.getUploadDataProvider().getLength()));
                        } else {
                            setRequestProperty("Content-Length", Long.toString(this.mOutputStream.getUploadDataProvider().getLength()));
                        }
                    }
                    startRequest();
                } else {
                    Log.m264548d(TAG, "Outputstream is being buffered in memory.");
                    String requestProperty = getRequestProperty("Content-Length");
                    if (requestProperty == null) {
                        this.mOutputStream = new CronetBufferedOutputStream(this);
                    } else {
                        this.mOutputStream = new CronetBufferedOutputStream(this, Long.parseLong(requestProperty));
                    }
                }
            }
        }
        return this.mOutputStream;
    }

    private void startRequest() throws IOException {
        if (!this.connected) {
            if (Logger.debug()) {
                Logger.m264568d(TAG, "start request url = " + getURL().toString());
            }
            ExperimentalUrlRequest.Builder builder = (ExperimentalUrlRequest.Builder) this.mCronetEngine.newUrlRequestBuilder(getURL().toString(), new CronetUrlRequestCallback(), this.mMessageLoop);
            if (this.doOutput) {
                if (this.method.equals("GET")) {
                    this.method = "POST";
                }
                CronetOutputStream cronetOutputStream = this.mOutputStream;
                if (cronetOutputStream != null) {
                    builder.setUploadDataProvider(cronetOutputStream.getUploadDataProvider(), (Executor) this.mMessageLoop);
                    if (getRequestProperty("Content-Length") == null && !isChunkedUpload()) {
                        addRequestProperty("Content-Length", Long.toString(this.mOutputStream.getUploadDataProvider().getLength()));
                    }
                    this.mOutputStream.setConnected();
                } else if (getRequestProperty("Content-Length") == null) {
                    addRequestProperty("Content-Length", "0");
                }
                if (getRequestProperty("Content-Type") == null) {
                    addRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                }
            }
            Map<String, String> GetCookieMap = GetCookieMap(uri(getURL()));
            if (GetCookieMap != null && !GetCookieMap.isEmpty()) {
                for (Map.Entry<String, String> entry : GetCookieMap.entrySet()) {
                    builder.addHeader(entry.getKey(), entry.getValue());
                }
            }
            for (Pair<String, String> pair : this.mRequestHeaders) {
                builder.addHeader((String) pair.first, (String) pair.second);
            }
            if (!getUseCaches()) {
                builder.disableCache();
            }
            builder.setHttpMethod(this.method);
            if (this.mTrafficStatsTagSet) {
                builder.setTrafficStatsTag(this.mTrafficStatsTag);
            }
            if (this.mTrafficStatsUidSet) {
                builder.setTrafficStatsUid(this.mTrafficStatsUid);
            }
            builder.setPriority(this.mRequestPriority);
            builder.setSocketConnectTimeout(this.mSocketConnectTimeout);
            builder.setSocketReadTimeout(this.mSocketReadTimeout);
            builder.setSocketWriteTimeout(this.mSocketWriteTimeout);
            builder.setRequestTimeout(this.mRequestTimeout);
            ExperimentalUrlRequest build = builder.build();
            this.mRequest = build;
            int i = this.mRequestFlag;
            if (i != 0) {
                build.setRequestFlag(i);
            }
            this.mRequest.start();
            long j = this.mThrottleNetSpeed;
            if (j > 0) {
                this.mRequest.setThrottleNetSpeed(j);
            }
            this.connected = true;
        }
    }

    public void setConnectTimeout(int i) {
        super.setConnectTimeout(i);
    }

    public void setInputStreamBufferSize(int i) {
        this.mInputStreamBufferSize = i;
    }

    public void setRequestFlag(int i) {
        this.mRequestFlag = i;
    }

    public void setRequestPriority(int i) {
        this.mRequestPriority = i;
    }

    public void setRequestTimeout(int i) {
        this.mRequestTimeout = i;
    }

    public void setSocketConnectTimeout(int i) {
        this.mSocketConnectTimeout = i;
    }

    public void setSocketReadTimeout(int i) {
        this.mSocketReadTimeout = i;
    }

    public void setSocketWriteTimeout(int i) {
        this.mSocketWriteTimeout = i;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i) {
        Map.Entry<String, String> headerFieldEntry = getHeaderFieldEntry(i);
        if (headerFieldEntry == null) {
            return null;
        }
        return headerFieldEntry.getValue();
    }

    public final String getHeaderFieldKey(int i) {
        Map.Entry<String, String> headerFieldEntry = getHeaderFieldEntry(i);
        if (headerFieldEntry == null) {
            return null;
        }
        return headerFieldEntry.getKey();
    }

    /* access modifiers changed from: package-private */
    public void getMoreData(ByteBuffer byteBuffer) throws IOException {
        UrlRequest urlRequest = this.mRequest;
        if (urlRequest != null) {
            urlRequest.read(byteBuffer);
            cronet_loop(getReadTimeout());
        }
    }

    public void setThrottleNetSpeed(long j) {
        this.mThrottleNetSpeed = j;
        UrlRequest urlRequest = this.mRequest;
        if (urlRequest != null) {
            urlRequest.setThrottleNetSpeed(j);
        }
    }

    private Map.Entry<String, String> getHeaderFieldEntry(int i) {
        try {
            getResponse();
            List<Map.Entry<String, String>> allHeadersAsList = getAllHeadersAsList();
            if (i >= allHeadersAsList.size()) {
                return null;
            }
            return allHeadersAsList.get(i);
        } catch (IOException unused) {
            return null;
        }
    }

    public String getRequestProperty(String str) {
        int findRequestProperty = findRequestProperty(str);
        if (findRequestProperty >= 0) {
            return (String) this.mRequestHeaders.get(findRequestProperty).second;
        }
        return null;
    }

    public void setException(IOException iOException) {
        CronetInputStream cronetInputStream = this.mInputStream;
        if (cronetInputStream != null) {
            cronetInputStream.setResponseDataCompleted(iOException);
        }
        CronetOutputStream cronetOutputStream = this.mOutputStream;
        if (cronetOutputStream != null) {
            cronetOutputStream.setRequestCompleted(iOException);
        }
        this.mHasResponseHeadersOrCompleted = true;
        this.mException = iOException;
        UrlRequest urlRequest = this.mRequest;
        if (urlRequest != null) {
            urlRequest.cancel();
        }
    }

    public void setTrafficStatsTag(int i) {
        if (!this.connected) {
            this.mTrafficStatsTagSet = true;
            this.mTrafficStatsTag = i;
            return;
        }
        throw new IllegalStateException("Cannot modify traffic stats tag after connection is made.");
    }

    public void setTrafficStatsUid(int i) {
        if (!this.connected) {
            this.mTrafficStatsUidSet = true;
            this.mTrafficStatsUid = i;
            return;
        }
        throw new IllegalStateException("Cannot modify traffic stats UID after connection is made.");
    }

    private int findRequestProperty(String str) {
        for (int i = 0; i < this.mRequestHeaders.size(); i++) {
            if (((String) this.mRequestHeaders.get(i).first).equalsIgnoreCase(str)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        try {
            getResponse();
            Map<String, List<String>> allHeaders = getAllHeaders();
            if (!allHeaders.containsKey(str)) {
                return null;
            }
            List<String> list = allHeaders.get(str);
            return list.get(list.size() - 1);
        } catch (IOException unused) {
            return null;
        }
    }

    public URI uri(URL url) {
        if (url == null) {
            return null;
        }
        String url2 = url.toString();
        try {
            return new URI(url2);
        } catch (URISyntaxException e) {
            try {
                return URI.create(url2.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                try {
                    return URI.create(url2.substring(0, url2.indexOf("?")));
                } catch (Exception unused2) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private void cronet_loop(int i) throws IOException {
        try {
            this.mMessageLoop.loop(i);
        } catch (SocketTimeoutException unused) {
            UrlRequest urlRequest = this.mRequest;
            if (urlRequest != null) {
                urlRequest.appTimeout();
                this.mMessageLoop.reset();
                this.mMessageLoop.loop(i / 2);
            }
        } catch (Exception e) {
            setException(new IOException("Unexpected request usage, caught in CronetHttpURLConnection, caused by " + e));
            if (this.mRequest != null) {
                this.mMessageLoop.reset();
                this.mMessageLoop.loop(i / 2);
            }
        }
    }

    public IOException tryConvertCronetException(CronetException cronetException) {
        IOException iOException;
        if (!(cronetException instanceof NetworkException)) {
            return cronetException;
        }
        switch (((NetworkException) cronetException).getErrorCode()) {
            case 1:
                iOException = new UnknownHostException(cronetException.getMessage());
                break;
            case 2:
            case 3:
                iOException = new ConnectException(cronetException.getMessage());
                break;
            case 4:
                iOException = new SocketTimeoutException(cronetException.getMessage());
                break;
            case 5:
            case 7:
                iOException = new ConnectException(cronetException.getMessage());
                break;
            case 6:
                iOException = new ConnectTimeoutException(cronetException.getMessage());
                break;
            case 8:
                iOException = new SocketException("reset by peer " + cronetException.getMessage());
                break;
            case 9:
                iOException = new NoRouteToHostException(cronetException.getMessage());
                break;
            default:
                return cronetException;
        }
        return iOException;
    }

    public Map<String, String> GetCookieMap(URI uri) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        List<Pair<String, String>> list = this.mRequestHeaders;
        if (list != null) {
            for (Pair<String, String> pair : list) {
                String str = (String) pair.first;
                String str2 = (String) pair.second;
                List list2 = (List) hashMap2.get(str);
                if (list2 == null) {
                    list2 = new LinkedList();
                }
                list2.add(str2);
                hashMap2.put(str, list2);
            }
        }
        Map<String, List<String>> map = null;
        try {
            if (this.mCookieHandler == null) {
                this.mCookieHandler = CookieHandler.getDefault();
            }
            CookieHandler cookieHandler = this.mCookieHandler;
            if (cookieHandler != null) {
                map = cookieHandler.get(uri, hashMap2);
            }
        } catch (Exception e) {
            if (Logger.debug()) {
                String str3 = TAG;
                Logger.m264568d(str3, "Loading cookies failed for " + getURL().toString() + " e = " + e.getMessage());
            }
        }
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                StringBuilder sb = new StringBuilder();
                if (("X-SS-Cookie".equalsIgnoreCase(key) || "Cookie".equalsIgnoreCase(key) || "Cookie2".equalsIgnoreCase(key)) && !entry.getValue().isEmpty()) {
                    int i = 0;
                    for (String str4 : entry.getValue()) {
                        if (i > 0) {
                            sb.append("; ");
                        }
                        sb.append(str4);
                        i++;
                    }
                    hashMap.put(key, sb.toString());
                }
            }
        }
        return hashMap;
    }

    public final void addRequestProperty(String str, String str2) {
        setRequestPropertyInternal(str, str2, false);
    }

    public final void setRequestProperty(String str, String str2) {
        setRequestPropertyInternal(str, str2, true);
    }

    public CronetHttpURLConnection(URL url, CronetEngine cronetEngine) {
        super(url);
        this.mCronetEngine = cronetEngine;
    }

    private final void setRequestPropertyInternal(String str, String str2, boolean z) {
        if (!this.connected) {
            int findRequestProperty = findRequestProperty(str);
            if (findRequestProperty >= 0) {
                if (z) {
                    this.mRequestHeaders.remove(findRequestProperty);
                } else {
                    throw new UnsupportedOperationException("Cannot add multiple headers of the same key, " + str + ". crbug.com/432719.");
                }
            }
            this.mRequestHeaders.add(Pair.create(str, str2));
            return;
        }
        throw new IllegalStateException("Cannot modify request property after connection is made.");
    }
}
