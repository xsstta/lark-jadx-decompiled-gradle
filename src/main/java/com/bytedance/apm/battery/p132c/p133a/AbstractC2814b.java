package com.bytedance.apm.battery.p132c.p133a;

/* renamed from: com.bytedance.apm.battery.c.a.b */
public abstract class AbstractC2814b {

    /* renamed from: d */
    public long f9002d;

    /* renamed from: e */
    public long f9003e;

    /* renamed from: f */
    public String f9004f;

    /* renamed from: g */
    public StackTraceElement[] f9005g;

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo12176d() {
        StringBuilder sb = new StringBuilder();
        for (int i = 9; i < this.f9005g.length; i++) {
            sb.append("\tat ");
            sb.append(this.f9005g[i].toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
