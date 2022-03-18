package com.ss.android.lark.opmonitor.api;

import com.google.firebase.messaging.Constants;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J@\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bH\u0002J<\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bJD\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\u000eJ(\u0010\u000f\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0016J(\u0010\u0011\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0016¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/opmonitor/api/OPBaseReportImpl;", "Lcom/ss/android/lark/opmonitor/api/OPMonitorReportInterface;", "()V", "mergeMetricAndCategory", "", "", "", "metrics", "Ljava/util/HashMap;", "categories", "report", "", "name", "reportPlatform", "", "reportToSlardar", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "reportToTea", "OPMonitor_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.opmonitor.api.b */
public abstract class OPBaseReportImpl implements AbstractC48907e {
    /* renamed from: a */
    public void mo144735a(String str, Map<String, ? extends Object> map) {
    }

    /* renamed from: b */
    public void mo144736b(String str, Map<String, ? extends Object> map) {
    }

    /* renamed from: a */
    private final Map<String, Object> m192677a(HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (hashMap != null) {
            HashMap<String, Object> hashMap3 = hashMap;
            if (!hashMap3.isEmpty()) {
                linkedHashMap.putAll(hashMap3);
            }
        }
        if (hashMap2 != null) {
            HashMap<String, Object> hashMap4 = hashMap2;
            if (!hashMap4.isEmpty()) {
                linkedHashMap.putAll(hashMap4);
            }
        }
        return linkedHashMap;
    }

    @Override // com.ss.android.lark.opmonitor.api.AbstractC48907e
    public final void report(String str, HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2) {
        mo144735a(str, m192677a(hashMap, hashMap2));
    }

    /* renamed from: a */
    public final void mo170752a(String str, HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2, int i) {
        Map<String, Object> a = m192677a(hashMap, hashMap2);
        if ((i & 2) != 0) {
            mo144735a(str, a);
        }
        if ((i & 4) != 0) {
            mo144736b(str, a);
        }
    }
}
