package com.bytedance.ee.bear.middleground.calendar.monitor;

import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.jsbridge.AbstractC7948j;
import com.bytedance.services.apm.api.EnsureManager;
import java.util.LinkedHashMap;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/middleground/calendar/monitor/MonitorHandler;", "Lcom/bytedance/ee/bear/jsbridge/JSHandler;", "Lcom/bytedance/ee/bear/middleground/calendar/monitor/LogParam;", "()V", "handle", "", "logParam", "calllbackFunction", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "middleground-calendar_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.bear.middleground.calendar.b.c */
public final class MonitorHandler implements AbstractC7948j<C8914b> {
    /* renamed from: a */
    public void handle(C8914b bVar, AbstractC7947h hVar) {
        if (bVar == null) {
            EnsureManager.ensureNotReachHere();
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = bVar.f24058b;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        linkedHashMap.put("message", str);
        String str3 = bVar.f24059c;
        if (str3 == null) {
            str3 = str2;
        }
        linkedHashMap.put("errorMessage", str3);
        String str4 = bVar.f24057a;
        if (str4 != null) {
            str2 = str4;
        }
        EnsureManager.ensureNotReachHere(str2, linkedHashMap);
    }
}
