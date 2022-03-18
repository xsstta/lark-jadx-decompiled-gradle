package com.ss.android.vesdk;

import java.math.BigDecimal;
import java.util.LinkedList;

/* renamed from: com.ss.android.vesdk.b */
public class C63952b {

    /* renamed from: a */
    private LinkedList<Double> f161488a = new LinkedList<>();

    /* renamed from: b */
    private double f161489b = -1.0d;

    /* renamed from: c */
    private double f161490c = -1.0d;

    /* renamed from: d */
    private double f161491d = -1.0d;

    /* renamed from: e */
    private long f161492e = 0;

    /* renamed from: f */
    private volatile boolean f161493f = true;

    /* renamed from: a */
    public void mo221305a() {
        this.f161488a.clear();
        this.f161490c = -1.0d;
        this.f161491d = -1.0d;
        this.f161489b = -1.0d;
    }

    /* renamed from: b */
    public double mo221307b() {
        if (this.f161488a.size() <= 0) {
            return -1.0d;
        }
        if (this.f161490c < 0.0d || this.f161491d < 0.0d) {
            m251054f();
        }
        return this.f161491d;
    }

    /* renamed from: c */
    public double mo221308c() {
        if (this.f161488a.size() <= 0) {
            return -1.0d;
        }
        if (this.f161490c < 0.0d || this.f161491d < 0.0d) {
            m251054f();
        }
        return this.f161490c;
    }

    /* renamed from: d */
    public double mo221309d() {
        if (this.f161488a.size() <= 0) {
            return -1.0d;
        }
        return m251053b(mo221307b() / mo221308c());
    }

    /* renamed from: e */
    public boolean mo221310e() {
        if (System.currentTimeMillis() - this.f161492e > 1000) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private void m251054f() {
        this.f161493f = false;
        LinkedList linkedList = new LinkedList(this.f161488a);
        double d = 0.0d;
        double d2 = 0.0d;
        for (int i = 0; i < linkedList.size(); i++) {
            d2 += ((Double) linkedList.get(i)).doubleValue();
        }
        this.f161490c = m251053b(d2 / ((double) linkedList.size()));
        for (int i2 = 0; i2 < linkedList.size(); i2++) {
            d += Math.pow(((Double) linkedList.get(i2)).doubleValue() - this.f161490c, 2.0d);
        }
        this.f161491d = m251053b(Math.sqrt(d / ((double) linkedList.size())));
        this.f161493f = true;
    }

    /* renamed from: b */
    private double m251053b(double d) {
        return new BigDecimal(d).setScale(4, 5).doubleValue();
    }

    /* renamed from: a */
    public void mo221306a(double d) {
        if (this.f161493f) {
            if (this.f161488a.size() == 0) {
                this.f161492e = System.currentTimeMillis();
                this.f161488a.offer(Double.valueOf(0.0d));
            } else {
                this.f161488a.add(Double.valueOf(d - this.f161489b));
            }
            this.f161489b = d;
        }
    }
}
