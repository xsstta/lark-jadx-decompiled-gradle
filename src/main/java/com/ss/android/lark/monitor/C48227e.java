package com.ss.android.lark.monitor;

import com.facebook.battery.metrics.core.AbstractC20997b;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.monitor.e */
public class C48227e extends AbstractC20997b<CpuThreadMetrics> {
    C48227e() {
    }

    /* renamed from: a */
    public CpuThreadMetrics mo71110b() {
        return new CpuThreadMetrics();
    }

    /* renamed from: a */
    private static double m190317a(String str) throws NumberFormatException {
        return (((double) Long.parseLong(str)) * 1.0d) / 100.0d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d9 A[SYNTHETIC, Splitter:B:51:0x00d9] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00bf A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo71109a(com.ss.android.lark.monitor.CpuThreadMetrics r20) {
        /*
        // Method dump skipped, instructions count: 227
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.monitor.C48227e.mo71109a(com.ss.android.lark.monitor.CpuThreadMetrics):boolean");
    }

    /* renamed from: a */
    private static List<String> m190318a(String str, int i) {
        ArrayList arrayList = new ArrayList(i);
        if (str != null && str.length() > 0) {
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            boolean z = false;
            for (int i2 = 0; i2 < length && arrayList.size() < i; i2++) {
                char charAt = str.charAt(i2);
                if (charAt == ' ') {
                    if (z) {
                        sb.append(charAt);
                    } else if (sb.length() > 0) {
                        arrayList.add(sb.toString());
                        sb.setLength(0);
                    }
                } else if (charAt == '(' && sb.length() == 0) {
                    z = true;
                } else if (charAt != ')' || !z) {
                    sb.append(charAt);
                } else {
                    arrayList.add(sb.toString());
                    sb.setLength(0);
                    z = false;
                }
            }
        }
        return arrayList;
    }
}
