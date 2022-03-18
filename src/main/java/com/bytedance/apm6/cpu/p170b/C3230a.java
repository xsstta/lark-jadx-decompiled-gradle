package com.bytedance.apm6.cpu.p170b;

import android.util.Pair;
import com.bytedance.apm6.p187i.p192e.AbstractC3341a;
import java.util.LinkedList;

/* renamed from: com.bytedance.apm6.cpu.b.a */
public class C3230a implements AbstractC3341a {

    /* renamed from: a */
    private double f10350a;

    /* renamed from: b */
    private double f10351b;

    /* renamed from: c */
    private Pair<Long, LinkedList<AbstractC3341a.C3342a>> f10352c;

    /* renamed from: d */
    private Pair<Long, LinkedList<AbstractC3341a.C3342a>> f10353d;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.apm6.cpu.b.a$a */
    public static final class C3232a {

        /* renamed from: a */
        public static final C3230a f10354a = new C3230a();
    }

    /* renamed from: a */
    public static C3230a m13514a() {
        return C3232a.f10354a;
    }

    @Override // com.bytedance.apm6.p187i.p192e.AbstractC3341a
    /* renamed from: b */
    public double mo13371b() {
        return this.f10350a;
    }

    @Override // com.bytedance.apm6.p187i.p192e.AbstractC3341a
    /* renamed from: c */
    public double mo13373c() {
        return this.f10351b;
    }

    private C3230a() {
        this.f10350a = -1.0d;
        this.f10351b = -1.0d;
        this.f10352c = new Pair<>(0L, new LinkedList());
        this.f10353d = new Pair<>(0L, new LinkedList());
    }

    /* renamed from: a */
    public synchronized void mo13370a(LinkedList<AbstractC3341a.C3342a> linkedList) {
        this.f10352c = new Pair<>(Long.valueOf(System.currentTimeMillis()), linkedList);
    }

    /* renamed from: b */
    public synchronized void mo13372b(LinkedList<AbstractC3341a.C3342a> linkedList) {
        this.f10353d = new Pair<>(Long.valueOf(System.currentTimeMillis()), linkedList);
    }

    /* renamed from: a */
    public void mo13369a(double d, double d2) {
        this.f10350a = d;
        this.f10351b = d2;
    }
}
