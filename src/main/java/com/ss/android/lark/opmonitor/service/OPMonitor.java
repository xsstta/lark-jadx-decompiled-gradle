package com.ss.android.lark.opmonitor.service;

import android.os.SystemClock;
import android.os.Trace;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.opmonitor.api.AbstractC48908f;
import com.ss.android.lark.opmonitor.model.C48919b;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class OPMonitor {
    @SerializedName("categories")
    @Expose
    private HashMap<String, Object> categories;
    private OPMonitorCode code;
    private OPMonitorCode codeIfError;
    private HashMap<String, Object> commons;
    private long endTime;
    private boolean flushed;
    private OPMonitorLevel level;
    @SerializedName("metrics")
    @Expose
    private HashMap<String, Object> metrics;
    @SerializedName("name")
    @Expose
    private String name;
    private int reportPlatform;
    private AbstractC48908f service;
    private long startTime;
    private Set<String> tags;
    private long time;

    public int getReportPlatform() {
        return this.reportPlatform;
    }

    public synchronized HashMap<String, Object> getCategories() {
        return this.categories;
    }

    public synchronized HashMap<String, Object> getCommons() {
        return this.commons;
    }

    public synchronized OPMonitorLevel getLevel() {
        return this.level;
    }

    public synchronized HashMap<String, Object> getMetrics() {
        return this.metrics;
    }

    public synchronized String getName() {
        return this.name;
    }

    public OPMonitor setResultTypeCancel() {
        return setResultType("cancel");
    }

    public OPMonitor setResultTypeFail() {
        return setResultType("fail");
    }

    public OPMonitor setResultTypeSuccess() {
        return setResultType("success");
    }

    public OPMonitor setResultTypeTimeout() {
        return setResultType("timeout");
    }

    public synchronized void flush() {
        flushInner();
    }

    public OPMonitorCode getMonitorCode() {
        OPMonitorCode oPMonitorCode = this.code;
        if (oPMonitorCode != null) {
            return oPMonitorCode;
        }
        if (hasErrorInfo()) {
            return this.codeIfError;
        }
        return null;
    }

    private boolean hasErrorInfo() {
        if (getValue("error_code") == null && getValue("error_msg") == null) {
            return false;
        }
        return true;
    }

    public synchronized HashMap<String, Object> getData() {
        HashMap<String, Object> hashMap;
        hashMap = new HashMap<>();
        hashMap.putAll(this.metrics);
        hashMap.putAll(this.categories);
        return hashMap;
    }

    private String tagsInLine() {
        Set<String> set = this.tags;
        if (set == null || set.size() == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str : this.tags) {
            if (!z) {
                sb.append(",");
            }
            sb.append(str);
            z = false;
        }
        return sb.toString();
    }

    public synchronized OPMonitor timing() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.startTime;
        if (j == 0) {
            this.startTime = elapsedRealtime;
        } else {
            this.endTime = elapsedRealtime;
            addMetricValue("duration", Long.valueOf(elapsedRealtime - j));
        }
        return this;
    }

    private synchronized void flushInner() {
        if (this.flushed) {
            Log.m165397w("OPMonitor", "this opmonitor is already flushed!!!");
            return;
        }
        this.flushed = true;
        OPMonitorCode oPMonitorCode = this.code;
        if (oPMonitorCode == null) {
            if (hasErrorInfo()) {
                oPMonitorCode = this.codeIfError;
            } else {
                oPMonitorCode = null;
            }
        }
        if (this.level == null && oPMonitorCode != null) {
            setLevel(oPMonitorCode.level);
        }
        if (oPMonitorCode != null) {
            addCategoryValue("monitor_domain", oPMonitorCode.domain);
            addCategoryValue("monitor_code", Integer.valueOf(oPMonitorCode.code));
            addCategoryValue("monitor_id", oPMonitorCode.ID);
            addCategoryValue("monitor_message", oPMonitorCode.message);
        }
        if (this.tags.size() > 0) {
            addCategoryValue("monitor_tags", tagsInLine());
        }
        C48919b a = C48924d.f122912a.mo170860a();
        if (a != null) {
            this.commons.putAll(a.mo170802a());
        }
        Trace.beginSection("computeFlushCommons");
        HashMap<String, Object> hashMap = this.commons;
        if (hashMap != null && hashMap.size() > 0) {
            for (String str : this.commons.keySet()) {
                if (!containsKey(str)) {
                    Object obj = this.commons.get(str);
                    if (obj instanceof Number) {
                        addMetricValue(str, obj);
                    } else {
                        addCategoryValue(str, obj);
                    }
                }
            }
        }
        Trace.endSection();
        if (this.service != null) {
            Trace.beginSection("computeServiceFlush");
            this.service.flush(this);
            Trace.endSection();
            Trace.beginSection("computeServiceLog");
            this.service.log(this);
            Trace.endSection();
        }
    }

    public OPMonitor reportPlatform(int i) {
        this.reportPlatform = i;
        return this;
    }

    public OPMonitor setErrorCode(String str) {
        addCategoryValue("error_code", str);
        return this;
    }

    public OPMonitor setErrorMessage(String str) {
        addCategoryValue("error_msg", str);
        return this;
    }

    public synchronized OPMonitor setMonitorCode(OPMonitorCode oPMonitorCode) {
        this.code = oPMonitorCode;
        return this;
    }

    public synchronized OPMonitor setMonitorCodeIfError(OPMonitorCode oPMonitorCode) {
        this.codeIfError = oPMonitorCode;
        return this;
    }

    public OPMonitor setResultType(String str) {
        addCategoryValue("result_type", str);
        return this;
    }

    public OPMonitor tracing(String str) {
        addCategoryValue("trace_id", str);
        return this;
    }

    public synchronized OPMonitor addTag(String str) {
        this.tags.add(str);
        return this;
    }

    public OPMonitor setDuration(long j) {
        addMetricValue("duration", Long.valueOf(j));
        return this;
    }

    public OPMonitor tracing(OPTrace oPTrace) {
        addCategoryValue("trace_id", oPTrace.getTracingID());
        return this;
    }

    public OPMonitor(OPMonitorCode oPMonitorCode) {
        this(C48924d.f122912a, null, oPMonitorCode);
    }

    public synchronized OPMonitor addCommonParams(Map<String, Object> map) {
        if (map != null) {
            if (map.size() > 0) {
                this.commons.putAll(map);
            }
        }
        return this;
    }

    public synchronized boolean containsKey(String str) {
        boolean z;
        if (this.metrics.containsKey(str) || this.categories.containsKey(str)) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public synchronized Object getValue(String str) {
        Object obj;
        obj = this.metrics.get(str);
        if (obj == null) {
            obj = this.categories.get(str);
        }
        return obj;
    }

    public synchronized OPMonitor setLevel(OPMonitorLevel oPMonitorLevel) {
        this.level = oPMonitorLevel;
        addCategoryValue("monitor_level", Integer.valueOf(oPMonitorLevel.getNumber()));
        return this;
    }

    public synchronized OPMonitor setTime(long j) {
        this.time = j;
        addMetricValue("time", Long.valueOf(j));
        return this;
    }

    public OPMonitor addMap(Map<String, Object> map) {
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj instanceof Number) {
                addMetricValue(str, obj);
            } else {
                addCategoryValue(str, obj);
            }
        }
        return this;
    }

    public OPMonitor setError(Throwable th) {
        StackTraceElement[] stackTrace;
        if (!(th == null || (stackTrace = th.getStackTrace()) == null || stackTrace.length <= 0)) {
            addCategoryValue("monitor_line", Integer.valueOf(stackTrace[0].getLineNumber()));
            addCategoryValue("monitor_function", stackTrace[0].getMethodName());
            addCategoryValue("monitor_file", stackTrace[0].getClassName());
        }
        return this;
    }

    public OPMonitor(String str) {
        this(C48924d.f122912a, str, null);
    }

    public synchronized void flush(AbstractC48908f fVar) {
        Trace.beginSection("computeMonitorTime");
        if (this.flushed) {
            Log.m165397w("OPMonitor", "this opmonitor is already flushed!!!");
        } else if (fVar == null) {
            Log.m165397w("OPMonitor", "serviceInterface is null!");
        } else if (!(fVar instanceof OPTrace) || ((OPTrace) fVar).getBatchEnabled()) {
            this.service = fVar;
            flushInner();
            Trace.endSection();
        } else {
            Log.m165397w("OPMonitor", "batchEnabled is false,traceId:" + ((OPTrace) fVar).getTracingID());
        }
    }

    public OPMonitor(AbstractC48908f fVar, OPMonitorCode oPMonitorCode) {
        this(fVar, null, oPMonitorCode);
    }

    public OPMonitor(AbstractC48908f fVar, String str) {
        this(fVar, str, null);
    }

    public synchronized OPMonitor addCategoryValue(String str, Object obj) {
        this.categories.put(str, obj);
        return this;
    }

    public synchronized OPMonitor addMetricValue(String str, Object obj) {
        this.metrics.put(str, obj);
        return this;
    }

    public OPMonitor(String str, OPMonitorCode oPMonitorCode) {
        this(C48924d.f122912a, str, oPMonitorCode);
    }

    public OPMonitor(AbstractC48908f fVar, String str, OPMonitorCode oPMonitorCode) {
        this.service = fVar;
        this.name = str;
        this.code = oPMonitorCode;
        this.metrics = new HashMap<>();
        this.categories = new HashMap<>();
        this.tags = new HashSet();
        this.commons = new HashMap<>();
    }
}
