package com.bytedance.monitor.collector;

import android.util.Log;
import android.util.Pair;
import com.huawei.hms.location.LocationRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinderMonitor extends AbsMonitor {

    /* renamed from: f */
    private static final List<C20114a> f49095f = new ArrayList((int) LocationRequest.PRIORITY_HD_ACCURACY);

    /* renamed from: g */
    private static final Object f49096g = new Object();

    /* renamed from: h */
    private static volatile int f49097h = 0;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.monitor.collector.AbsMonitor
    /* renamed from: b */
    public void mo68214b(int i) {
    }

    /* renamed from: com.bytedance.monitor.collector.BinderMonitor$a */
    public static class C20114a {

        /* renamed from: a */
        long f49098a;

        /* renamed from: b */
        long f49099b;

        /* renamed from: c */
        long f49100c;

        /* renamed from: d */
        StackTraceElement[] f49101d;

        /* renamed from: a */
        public long mo68219a() {
            return this.f49098a;
        }

        /* renamed from: b */
        public long mo68220b() {
            return this.f49099b;
        }

        /* renamed from: c */
        public StackTraceElement[] mo68221c() {
            return this.f49101d;
        }

        public String toString() {
            return "{\"start\":" + this.f49098a + ",\"end\":" + this.f49099b + ",\"parcel_size\":" + this.f49100c + ",\"cost_millis\":" + (this.f49099b - this.f49098a) + ",\"java_stack\":\"" + C20163o.m73583b(BinderMonitor.m73430a(this.f49101d)) + "\"}";
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo68217d() {
        MonitorJni.enableBinderHook();
    }

    private static String getStacktrace() {
        return Log.getStackTraceString(new Exception());
    }

    @Override // com.bytedance.monitor.collector.AbsMonitor
    /* renamed from: c */
    public Pair<String, String> mo68215c() {
        try {
            return new Pair<>(this.f49088a, f49095f.toString());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    public List<C20114a> mo68218e() {
        ArrayList arrayList = new ArrayList();
        synchronized (f49096g) {
            for (int i = 0; i < 200; i++) {
                int i2 = ((f49097h - 1) + i) % LocationRequest.PRIORITY_HD_ACCURACY;
                List<C20114a> list = f49095f;
                if (i2 >= list.size()) {
                    break;
                }
                arrayList.add(list.get(((f49097h - 1) + i) % LocationRequest.PRIORITY_HD_ACCURACY));
            }
        }
        return arrayList;
    }

    BinderMonitor(int i) {
        super(i, "binder_monitor");
    }

    /* renamed from: a */
    public static StackTraceElement[] m73430a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null || stackTraceElementArr.length == 0) {
            return stackTraceElementArr;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= stackTraceElementArr.length) {
                break;
            } else if ("saveBinderInfo".equals(stackTraceElementArr[i2].getMethodName())) {
                i = i2;
                break;
            } else {
                i2++;
            }
        }
        int i3 = i + 1;
        if (i3 <= stackTraceElementArr.length) {
            return (StackTraceElement[]) Arrays.copyOfRange(stackTraceElementArr, i3, stackTraceElementArr.length);
        }
        return stackTraceElementArr;
    }

    @Override // com.bytedance.monitor.collector.AbsMonitor
    /* renamed from: a */
    public Pair<String, String> mo68210a(long j, long j2) {
        try {
            return new Pair<>(this.f49088a, m73431b(j, j2));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    private String m73431b(long j, long j2) {
        List<C20114a> e = mo68218e();
        ArrayList arrayList = new ArrayList();
        for (int size = e.size() - 1; size >= 0; size--) {
            C20114a aVar = e.get(size);
            if (aVar.f49098a > j2 || aVar.f49099b > j) {
                arrayList.add(aVar);
            }
            if (aVar.f49099b < j) {
                break;
            }
        }
        return arrayList.toString();
    }

    public static void saveBinderInfo(long j, long j2, long j3) {
        m73429a(j, j2, j3, Thread.currentThread().getStackTrace());
    }

    /* renamed from: a */
    private static void m73429a(long j, long j2, long j3, StackTraceElement[] stackTraceElementArr) {
        synchronized (f49096g) {
            List<C20114a> list = f49095f;
            if (list.size() == 200) {
                C20114a aVar = list.get(f49097h % LocationRequest.PRIORITY_HD_ACCURACY);
                aVar.f49098a = j;
                aVar.f49099b = j2;
                aVar.f49100c = j3;
                aVar.f49101d = stackTraceElementArr;
            } else {
                C20114a aVar2 = new C20114a();
                aVar2.f49098a = j;
                aVar2.f49099b = j2;
                aVar2.f49100c = j3;
                aVar2.f49101d = stackTraceElementArr;
                list.add(aVar2);
            }
            f49097h++;
        }
    }
}
