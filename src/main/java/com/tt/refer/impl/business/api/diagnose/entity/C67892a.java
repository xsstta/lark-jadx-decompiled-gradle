package com.tt.refer.impl.business.api.diagnose.entity;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.tt.refer.impl.business.api.diagnose.entity.a */
public class C67892a {

    /* renamed from: c */
    private static C67892a f170993c;

    /* renamed from: a */
    private List<DumpService> f170994a = new ArrayList();

    /* renamed from: b */
    private Map<DumpServiceType, DumpService> f170995b = new HashMap();

    /* renamed from: b */
    public List<DumpService> mo235548b() {
        return this.f170994a;
    }

    private C67892a() {
    }

    /* renamed from: a */
    public static C67892a m264173a() {
        if (f170993c == null) {
            synchronized (C67892a.class) {
                if (f170993c == null) {
                    f170993c = new C67892a();
                }
            }
        }
        return f170993c;
    }

    /* renamed from: a */
    public void mo235546a(List<DumpService> list) {
        if (list != null) {
            this.f170994a = list;
        }
    }

    /* renamed from: b */
    public DumpService mo235547b(DumpServiceType dumpServiceType, DumpConfig dumpConfig) {
        LogDumpService logDumpService;
        if (dumpServiceType == DumpServiceType.LOG) {
            logDumpService = new LogDumpService(dumpConfig);
        } else {
            logDumpService = null;
        }
        if (logDumpService != null) {
            this.f170995b.put(dumpServiceType, logDumpService);
            this.f170994a.add(logDumpService);
        }
        return logDumpService;
    }

    /* renamed from: a */
    public DumpService mo235545a(DumpServiceType dumpServiceType, DumpConfig dumpConfig) {
        if (dumpConfig == null || dumpServiceType == null) {
            boolean z = true;
            Object[] objArr = new Object[1];
            StringBuilder sb = new StringBuilder();
            sb.append(" dumpservice is null, dumpconfig ");
            if (dumpConfig != null) {
                z = false;
            }
            sb.append(z);
            objArr[0] = sb.toString();
            AppBrandLogger.m52829e("DumpConfigManager", objArr);
            return null;
        }
        DumpService dumpService = this.f170995b.get(dumpServiceType);
        if (dumpService == null) {
            return mo235547b(dumpServiceType, dumpConfig);
        }
        if (!dumpService.mo235530a(dumpConfig)) {
            return mo235547b(dumpServiceType, dumpConfig);
        }
        return dumpService;
    }
}
