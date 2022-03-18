package com.ss.android.lark.monitor;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.ss.android.lark.monitor.n */
public class C48237n {

    /* renamed from: a */
    public final Context f121416a;

    /* renamed from: b */
    public final ScheduledExecutorService f121417b;

    /* renamed from: c */
    public final String f121418c;

    /* renamed from: d */
    public final String f121419d;

    /* renamed from: e */
    public final AbstractC48230h f121420e;

    /* renamed from: f */
    public final AbstractC48232i f121421f;

    /* renamed from: g */
    public final float f121422g;

    /* renamed from: h */
    public final float f121423h;

    /* renamed from: i */
    public final int f121424i;

    /* renamed from: j */
    public final List<String> f121425j;

    /* renamed from: k */
    public final boolean f121426k;

    /* renamed from: l */
    public final String f121427l;

    /* renamed from: m */
    public final int f121428m;

    /* renamed from: n */
    public final boolean f121429n;

    /* renamed from: o */
    public final boolean f121430o;

    /* renamed from: p */
    public final boolean f121431p;

    /* renamed from: q */
    long f121432q;

    /* renamed from: com.ss.android.lark.monitor.n$a */
    public static class C48239a {

        /* renamed from: a */
        public Context f121433a;

        /* renamed from: b */
        public ScheduledExecutorService f121434b;

        /* renamed from: c */
        public String f121435c;

        /* renamed from: d */
        public String f121436d;

        /* renamed from: e */
        public long f121437e;

        /* renamed from: f */
        public AbstractC48230h f121438f;

        /* renamed from: g */
        public boolean f121439g;

        /* renamed from: h */
        public boolean f121440h;

        /* renamed from: i */
        public String f121441i;

        /* renamed from: j */
        public AbstractC48232i f121442j;

        /* renamed from: k */
        public float f121443k;

        /* renamed from: l */
        public float f121444l;

        /* renamed from: m */
        public int f121445m;

        /* renamed from: n */
        public List<String> f121446n;

        /* renamed from: o */
        public int f121447o;

        /* renamed from: p */
        public boolean f121448p;

        /* renamed from: q */
        public boolean f121449q;

        /* renamed from: a */
        public C48237n mo168790a() {
            return new C48237n(this);
        }

        /* renamed from: a */
        public C48239a mo168784a(float f) {
            this.f121443k = f;
            return this;
        }

        /* renamed from: b */
        public C48239a mo168791b(float f) {
            this.f121444l = f;
            return this;
        }

        /* renamed from: c */
        public C48239a mo168794c(String str) {
            this.f121441i = str;
            return this;
        }

        /* renamed from: d */
        public C48239a mo168797d(boolean z) {
            this.f121449q = z;
            return this;
        }

        /* renamed from: a */
        public C48239a mo168785a(int i) {
            this.f121447o = i;
            return this;
        }

        /* renamed from: b */
        public C48239a mo168792b(String str) {
            this.f121436d = str;
            return this;
        }

        /* renamed from: c */
        public C48239a mo168795c(boolean z) {
            this.f121448p = z;
            return this;
        }

        /* renamed from: d */
        public C48239a mo168796d(String str) {
            this.f121446n.add(str);
            return this;
        }

        /* renamed from: a */
        public C48239a mo168786a(AbstractC48230h hVar) {
            this.f121438f = hVar;
            return this;
        }

        /* renamed from: b */
        public C48239a mo168793b(boolean z) {
            this.f121440h = z;
            return this;
        }

        /* renamed from: a */
        public C48239a mo168787a(AbstractC48232i iVar) {
            this.f121442j = iVar;
            return this;
        }

        private C48239a(Context context) {
            this.f121442j = new AbstractC48232i() {
                /* class com.ss.android.lark.monitor.C48237n.C48239a.C482401 */

                @Override // com.ss.android.lark.monitor.AbstractC48232i
                public String format(long j) {
                    return String.valueOf(j);
                }
            };
            this.f121443k = 5.0f;
            this.f121444l = 1.0f;
            this.f121445m = 30;
            this.f121446n = new ArrayList();
            this.f121447o = 5;
            this.f121448p = false;
            this.f121449q = false;
            this.f121433a = context;
        }

        /* renamed from: a */
        public C48239a mo168788a(String str) {
            this.f121435c = str;
            return this;
        }

        /* renamed from: a */
        public C48239a mo168789a(boolean z) {
            this.f121439g = z;
            return this;
        }
    }

    /* renamed from: a */
    public static C48239a m190350a(Context context) {
        return new C48239a(context);
    }

    private C48237n(C48239a aVar) {
        this.f121416a = aVar.f121433a;
        this.f121417b = aVar.f121434b;
        String str = aVar.f121435c;
        this.f121418c = str;
        this.f121419d = aVar.f121436d;
        this.f121432q = aVar.f121437e;
        AbstractC48230h hVar = aVar.f121438f;
        this.f121420e = hVar;
        this.f121430o = aVar.f121439g;
        AbstractC48232i iVar = aVar.f121442j;
        this.f121421f = iVar;
        this.f121426k = aVar.f121440h;
        this.f121427l = aVar.f121441i;
        this.f121425j = aVar.f121446n;
        this.f121422g = aVar.f121443k;
        this.f121423h = aVar.f121444l;
        this.f121428m = aVar.f121447o;
        this.f121424i = aVar.f121445m;
        this.f121429n = aVar.f121448p;
        this.f121431p = aVar.f121449q;
        m190351a(str, "log dir cannot empty!");
        m190351a(hVar, "dependence impl not init!");
        m190351a(iVar, "time formater impl needed!");
    }

    /* renamed from: a */
    private static void m190351a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }
}
