package com.ss.android.lark.optrace.core;

import android.os.SystemClock;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.optrace.api.AbstractC48929b;
import com.ss.android.lark.optrace.api.ITracing;
import com.ss.android.lark.optrace.api.TracingCoreSpan;
import com.ss.android.lark.optrace.api.TracingSpanData;
import com.ss.android.lark.optrace.extension.TracingExtension;
import com.ss.android.lark.optrace.extension.TracingExtensionEnum;
import com.ss.android.lark.optrace.extension.clientRequest.TrancingClientRequestExtension;
import com.ss.android.lark.optrace.extension.clientRequest.TrancingClientRequestExtensionImpl;
import com.ss.android.lark.optrace.extension.clientduration.TracingClientDurationExtension;
import com.ss.android.lark.optrace.extension.clientduration.TracingClientDurationExtensionImpl;
import com.ss.android.lark.optrace.log.TraceLog;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class TracingCoreTarget implements TracingCoreSpan {
    private static final long serialVersionUID = 446009563012766987L;
    @SerializedName("traceId")
    @Expose
    protected String cacheTracingId;
    @SerializedName("createTime")
    @Expose
    private long createTime;
    protected Map<TracingExtensionEnum, TracingExtension> extensions;
    private TracingCoreSpan parent;
    protected TracingSpanData spanData;

    /* access modifiers changed from: protected */
    public abstract void generateSpanData();

    @Override // com.ss.android.lark.optrace.api.ITracing
    public long createTime() {
        return this.createTime;
    }

    @Override // com.ss.android.lark.optrace.api.ITracing
    public String getTracingID() {
        return this.cacheTracingId;
    }

    @Override // com.ss.android.lark.optrace.api.ITracing
    public String getRequestId() {
        TracingExtension tracingExtension = this.extensions.get(TracingExtensionEnum.CLIENT_REQUEST);
        if (tracingExtension instanceof TrancingClientRequestExtension) {
            return ((TrancingClientRequestExtension) tracingExtension).getRequestId();
        }
        return null;
    }

    protected TracingCoreTarget() {
        this.createTime = SystemClock.elapsedRealtime();
        this.extensions = new ConcurrentHashMap();
        addExtension(TracingExtensionEnum.CLIENT_DURATION, new TracingClientDurationExtensionImpl());
        addExtension(TracingExtensionEnum.CLIENT_REQUEST, new TrancingClientRequestExtensionImpl());
    }

    private void buildCacheTracingID() {
        String str;
        TracingCoreSpan tracingCoreSpan = this.parent;
        if (tracingCoreSpan == null) {
            str = "1";
        } else {
            str = tracingCoreSpan.getTracingID();
        }
        this.cacheTracingId = str + "-" + this.spanData.getSpan();
    }

    @Override // com.ss.android.lark.optrace.api.ITracing
    public void clientDurationEndAll() {
        for (TracingExtensionEnum tracingExtensionEnum : this.extensions.keySet()) {
            TracingExtension tracingExtension = this.extensions.get(tracingExtensionEnum);
            if (tracingExtension != null && (tracingExtension instanceof TracingClientDurationExtension)) {
                ((TracingClientDurationExtension) tracingExtension).endAll();
            }
        }
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("TracingCoreTarget{parent=");
        TracingCoreSpan tracingCoreSpan = this.parent;
        String str3 = "";
        if (tracingCoreSpan != null) {
            str = tracingCoreSpan.toString();
        } else {
            str = str3;
        }
        sb.append(str);
        sb.append(", spanData=");
        TracingSpanData tracingSpanData = this.spanData;
        if (tracingSpanData != null) {
            str2 = tracingSpanData.toString();
        } else {
            str2 = str3;
        }
        sb.append(str2);
        sb.append(", cacheTracingId='");
        String str4 = this.cacheTracingId;
        if (str4 != null) {
            str3 = str4;
        }
        sb.append(str3);
        sb.append('\'');
        sb.append(", createTime=");
        sb.append(this.createTime);
        sb.append(", extensions=");
        sb.append(this.extensions.toString());
        sb.append('}');
        return sb.toString();
    }

    protected TracingCoreTarget(String str) {
        this();
        this.cacheTracingId = str;
    }

    @Override // com.ss.android.lark.optrace.api.ITracing
    public long clientDuration(String str) {
        TracingExtension tracingExtension = this.extensions.get(TracingExtensionEnum.CLIENT_DURATION);
        if (tracingExtension instanceof TracingClientDurationExtension) {
            return ((TracingClientDurationExtension) tracingExtension).duration(str);
        }
        Log.m165383e("TracingCoreTarget", "Not implement Client Duration extension");
        return -1;
    }

    @Override // com.ss.android.lark.optrace.api.ITracing
    public long clientDurationTagEnd(String str) {
        TracingExtension tracingExtension = this.extensions.get(TracingExtensionEnum.CLIENT_DURATION);
        if (tracingExtension instanceof TracingClientDurationExtension) {
            return ((TracingClientDurationExtension) tracingExtension).end(str);
        }
        Log.m165383e("TracingCoreTarget", "Not implement Client Duration extension");
        return -1;
    }

    @Override // com.ss.android.lark.optrace.api.ITracing
    public void clientDurationTagStart(String str) {
        TracingExtension tracingExtension = this.extensions.get(TracingExtensionEnum.CLIENT_DURATION);
        if (tracingExtension instanceof TracingClientDurationExtension) {
            ((TracingClientDurationExtension) tracingExtension).start(str);
        } else {
            Log.m165383e("TracingCoreTarget", "Not implement Client Duration extension");
        }
    }

    @Override // com.ss.android.lark.optrace.api.ITracing
    public void setRequestId(String str) {
        TracingExtension tracingExtension = this.extensions.get(TracingExtensionEnum.CLIENT_REQUEST);
        if (tracingExtension instanceof TrancingClientRequestExtension) {
            ((TrancingClientRequestExtension) tracingExtension).setRequestId(str);
        }
    }

    protected TracingCoreTarget(TracingCoreSpan tracingCoreSpan) {
        this.parent = tracingCoreSpan;
        this.createTime = SystemClock.elapsedRealtime();
        this.extensions = new ConcurrentHashMap();
        addExtension(TracingExtensionEnum.CLIENT_DURATION, new TracingClientDurationExtensionImpl());
        addExtension(TracingExtensionEnum.CLIENT_REQUEST, new TrancingClientRequestExtensionImpl());
        generateSpanData();
        buildCacheTracingID();
    }

    @Override // com.ss.android.lark.optrace.api.ITracing
    public void addExtension(TracingExtensionEnum tracingExtensionEnum, TracingExtension tracingExtension) {
        this.extensions.put(tracingExtensionEnum, tracingExtension);
    }

    @Override // com.ss.android.lark.optrace.api.ILogger
    /* renamed from: d */
    public void mo92222d(String str, Object... objArr) {
        TraceLog.m192775a(str, getTracingID(), objArr);
    }

    @Override // com.ss.android.lark.optrace.api.ILogger
    /* renamed from: e */
    public void mo92223e(String str, Object... objArr) {
        TraceLog.m192778d(str, getTracingID(), objArr);
    }

    @Override // com.ss.android.lark.optrace.api.ILogger
    /* renamed from: i */
    public void mo92224i(String str, Object... objArr) {
        TraceLog.m192776b(str, getTracingID(), objArr);
    }

    @Override // com.ss.android.lark.optrace.api.ILogger
    /* renamed from: w */
    public void mo92225w(String str, Object... objArr) {
        TraceLog.m192777c(str, getTracingID(), objArr);
    }

    @Override // com.ss.android.lark.optrace.api.AbstractC48929b
    public <T> void linkTracing(ITracing iTracing, T t, AbstractC48929b.AbstractC48930a<T> aVar) {
        if (iTracing == null) {
            Log.m165383e("TracingCoreTarget", "linkedTracing == null");
            return;
        }
        aVar.mo170894a(iTracing.getTracingID(), t);
        TracingCoreTarget tracingCoreTarget = (TracingCoreTarget) iTracing;
        for (TracingExtensionEnum tracingExtensionEnum : tracingCoreTarget.extensions.keySet()) {
            TracingExtension tracingExtension = tracingCoreTarget.extensions.get(tracingExtensionEnum);
            if (tracingExtension == null) {
                Log.m165383e("TracingCoreTarget", "linkExtension == null, enum = " + tracingExtensionEnum.name());
            } else {
                TracingExtension tracingExtension2 = this.extensions.get(tracingExtensionEnum);
                if (tracingExtension2 != null) {
                    tracingExtension2.mergeExtension(tracingExtension);
                } else {
                    this.extensions.put(tracingExtensionEnum, tracingExtension);
                }
            }
        }
    }
}
