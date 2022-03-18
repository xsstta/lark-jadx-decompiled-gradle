package com.ss.android.lark.eetroublebase;

import com.ss.android.lark.calendar.impl.features.search.result.CalendarSearchResultRv;
import com.ss.android.lark.eetroublebase.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.lark.eetroublebase.a */
public class C36960a {

    /* renamed from: p */
    private static final Set<AbstractC36962b> f95019p = new HashSet();

    /* renamed from: q */
    private static C36960a f95020q;

    /* renamed from: a */
    public boolean f95021a = true;

    /* renamed from: b */
    public boolean f95022b;

    /* renamed from: c */
    public int f95023c = 20;

    /* renamed from: d */
    public String f95024d = "2/60";

    /* renamed from: e */
    public int f95025e;

    /* renamed from: f */
    public List<String> f95026f;

    /* renamed from: g */
    public int f95027g = CalendarSearchResultRv.f82652c;

    /* renamed from: h */
    public int f95028h = 2;

    /* renamed from: i */
    public int f95029i = 5;

    /* renamed from: j */
    public List<String> f95030j = new ArrayList();

    /* renamed from: k */
    public boolean f95031k = false;

    /* renamed from: l */
    public String f95032l = "";

    /* renamed from: m */
    public String f95033m = "";

    /* renamed from: n */
    public boolean f95034n = true;

    /* renamed from: o */
    public String f95035o;

    /* renamed from: com.ss.android.lark.eetroublebase.a$b */
    public interface AbstractC36962b {
        /* renamed from: a */
        void mo136438a(C36960a aVar);
    }

    /* renamed from: c */
    public boolean mo136417c() {
        return this.f95021a;
    }

    /* renamed from: d */
    public int mo136418d() {
        return this.f95023c;
    }

    /* renamed from: e */
    public int mo136419e() {
        return this.f95027g;
    }

    /* renamed from: f */
    public int mo136420f() {
        return this.f95028h;
    }

    /* renamed from: i */
    public String mo136423i() {
        return this.f95032l;
    }

    /* renamed from: j */
    public boolean mo136424j() {
        return this.f95034n;
    }

    /* renamed from: b */
    public static C36961a m145917b() {
        return new C36961a();
    }

    /* renamed from: g */
    public List<String> mo136421g() {
        if (this.f95025e == 1) {
            return this.f95026f;
        }
        return null;
    }

    /* renamed from: h */
    public List<String> mo136422h() {
        if (this.f95025e != 1) {
            return null;
        }
        return this.f95026f;
    }

    /* renamed from: a */
    public static C36960a m145914a() {
        if (f95020q == null) {
            f95020q = m145917b().mo136430a();
        }
        return f95020q;
    }

    /* renamed from: com.ss.android.lark.eetroublebase.a$a */
    public static class C36961a {

        /* renamed from: a */
        private C36960a f95036a = new C36960a();

        /* renamed from: b */
        private Log.AbstractC36959a f95037b;

        /* renamed from: a */
        public C36960a mo136430a() {
            Log.m145904a(this.f95037b);
            return this.f95036a;
        }

        /* renamed from: a */
        public C36961a mo136426a(Log.AbstractC36959a aVar) {
            this.f95037b = aVar;
            return this;
        }

        /* renamed from: a */
        public C36961a mo136425a(int i) {
            this.f95036a.f95023c = i;
            return this;
        }

        /* renamed from: b */
        public C36961a mo136431b(int i) {
            if (i > 0) {
                this.f95036a.f95029i = i;
            }
            return this;
        }

        /* renamed from: c */
        public C36961a mo136435c(boolean z) {
            this.f95036a.f95022b = z;
            return this;
        }

        /* renamed from: d */
        public C36961a mo136436d(String str) {
            this.f95036a.f95035o = str;
            return this;
        }

        /* renamed from: a */
        public C36961a mo136428a(boolean z) {
            this.f95036a.f95021a = z;
            return this;
        }

        /* renamed from: b */
        public C36961a mo136432b(String str) {
            if (str == null) {
                str = "";
            }
            this.f95036a.f95032l = str;
            return this;
        }

        /* renamed from: c */
        public C36961a mo136434c(String str) {
            if (str == null) {
                str = "";
            }
            this.f95036a.f95033m = str;
            return this;
        }

        /* renamed from: d */
        public C36961a mo136437d(boolean z) {
            this.f95036a.f95034n = z;
            return this;
        }

        /* renamed from: a */
        public C36961a mo136429a(String... strArr) {
            if (strArr == null) {
                strArr = new String[0];
            }
            this.f95036a.f95030j = Arrays.asList(strArr);
            return this;
        }

        /* renamed from: b */
        public C36961a mo136433b(boolean z) {
            this.f95036a.f95031k = z;
            return this;
        }

        /* renamed from: a */
        public C36961a mo136427a(String str) {
            String[] split;
            this.f95036a.f95024d = str;
            if (!(str == null || (split = str.split("/", 2)) == null || split.length != 2)) {
                try {
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]) * 1000;
                    if (parseInt > 0 && parseInt2 > 0) {
                        this.f95036a.f95028h = parseInt;
                        this.f95036a.f95027g = parseInt2;
                    }
                } catch (Exception e) {
                    Log.m145906a("c_screen_shot_rate parse error", e);
                }
            }
            return this;
        }
    }

    /* renamed from: a */
    public static void m145915a(AbstractC36962b bVar) {
        f95019p.add(bVar);
    }

    /* renamed from: a */
    public static synchronized void m145916a(C36960a aVar) {
        synchronized (C36960a.class) {
            f95020q = aVar;
            C36960a a = m145914a();
            for (AbstractC36962b bVar : f95019p) {
                bVar.mo136438a(a);
            }
        }
    }
}
