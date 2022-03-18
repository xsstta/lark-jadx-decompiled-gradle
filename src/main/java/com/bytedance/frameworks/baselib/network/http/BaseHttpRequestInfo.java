package com.bytedance.frameworks.baselib.network.http;

import com.bytedance.frameworks.baselib.network.http.BaseRequestContext;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class BaseHttpRequestInfo<T extends BaseRequestContext> {
    private static AbstractC13966a sCreate = new AbstractC13966a() {
        /* class com.bytedance.frameworks.baselib.network.http.BaseHttpRequestInfo.C139651 */

        @Override // com.bytedance.frameworks.baselib.network.http.BaseHttpRequestInfo.AbstractC13966a
        /* renamed from: a */
        public BaseHttpRequestInfo mo51360a() {
            return new BaseHttpRequestInfo();
        }
    };
    public long appLevelRequestStart;
    public boolean bdTuringRetry;
    public long beforeAllInterceptors;
    public long completeReadResponse;
    public long connectTime;
    public String contentType = "";
    public long dnsTime;
    public boolean downloadFile;
    public boolean executeTuringCallback;
    public JSONObject extraInfo;
    public String fallbackMessage = "";
    public int fallbackReason = -1;
    public volatile AtomicBoolean hasReportStreamingApiAll = new AtomicBoolean(false);
    public int httpClientType = -1;
    public boolean isSocketReused;
    public long nativePostTaskStartTime;
    public long nativeRequestStartTime;
    public long nativeWaitContext;
    public long pushTime;
    public long receiveTime;
    public long receivedByteCount;
    public int recycleCount;
    public String remoteIp;
    public T reqContext;
    public long requestEnd;
    public String requestHeaders;
    public String requestLog;
    public long requestStart;
    public long responseBack;
    public String responseHeaders;
    public long retryAttempts;
    public long sendTime;
    public long sentByteCount;
    public long sslTime;
    public long totalTime;
    public long ttfbMs;
    public long turingCallbackDuration = -1;

    /* renamed from: com.bytedance.frameworks.baselib.network.http.BaseHttpRequestInfo$a */
    public interface AbstractC13966a {
        /* renamed from: a */
        BaseHttpRequestInfo mo51360a();
    }

    public static BaseHttpRequestInfo createHttpRequestInfo() {
        return sCreate.mo51360a();
    }

    public static void setCreate(AbstractC13966a aVar) {
        if (aVar != null) {
            sCreate = aVar;
        }
    }
}
