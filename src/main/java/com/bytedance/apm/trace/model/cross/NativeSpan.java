package com.bytedance.apm.trace.model.cross;

import com.bytedance.apm.trace.api.AbstractC3084c;
import com.bytedance.apm.trace.model.AbstractC3103a;
import java.util.HashMap;
import java.util.Map;

public class NativeSpan {
    private long finishTime;
    private boolean isErrorSpan;
    private boolean isFinish;
    private String parentId;
    private String referenceId;
    private String spanId;
    private String spanName;
    private long startTime;
    private Map<String, String> tags;
    private String threadName;

    public long getFinishTime() {
        return this.finishTime;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public String toString() {
        return "NativeSpan{, spanName='" + this.spanName + '\'' + ", spanId=" + this.spanId + ", parentId=" + this.parentId + ", referenceId=" + this.referenceId + ", startTime=" + this.startTime + ", finishTime=" + this.finishTime + ", threadName='" + this.threadName + '\'' + ", tags=" + this.tags + ", isErrorSpan=" + this.isErrorSpan + ", isFinish=" + this.isFinish + '}';
    }

    public AbstractC3084c parseToSpan(AbstractC3103a aVar) {
        if (!this.isFinish) {
            return null;
        }
        AbstractC3084c a = aVar.mo12996a(this.spanName, Long.parseLong(this.spanId));
        String str = this.parentId;
        if (str != null && !str.isEmpty()) {
            a.mo12950a(Long.parseLong(this.parentId));
        }
        String str2 = this.referenceId;
        if (str2 != null && !str2.isEmpty()) {
            a.mo12953b(Long.parseLong(this.referenceId));
        }
        a.mo12951a(this.threadName);
        for (Map.Entry<String, String> entry : this.tags.entrySet()) {
            a.mo12952a(entry.getKey(), entry.getValue());
        }
        return a;
    }

    public NativeSpan(String str, String str2, String str3, String str4, long j, long j2, String str5, HashMap<String, String> hashMap, boolean z, boolean z2) {
        this.spanName = str;
        this.spanId = str2;
        this.parentId = str3;
        this.referenceId = str4;
        this.startTime = j;
        this.finishTime = j2;
        this.threadName = str5;
        this.tags = hashMap;
        this.isErrorSpan = z;
        this.isFinish = z2;
    }
}
