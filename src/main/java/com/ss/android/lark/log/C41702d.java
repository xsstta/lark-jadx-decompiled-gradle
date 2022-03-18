package com.ss.android.lark.log;

import android.content.Context;
import com.ss.android.lark.log.alog.IALogEvent;

/* renamed from: com.ss.android.lark.log.d */
public class C41702d {

    /* renamed from: a */
    public final Context f105904a;

    /* renamed from: b */
    public final int f105905b;

    /* renamed from: c */
    public final String f105906c;

    /* renamed from: d */
    public final String f105907d;

    /* renamed from: e */
    public final String f105908e;

    /* renamed from: f */
    public final boolean f105909f;

    /* renamed from: g */
    public final String f105910g;

    /* renamed from: h */
    public final boolean f105911h;

    /* renamed from: i */
    public IALogEvent f105912i;

    /* renamed from: j */
    private final String f105913j;

    /* renamed from: k */
    private final int f105914k;

    /* renamed from: com.ss.android.lark.log.d$a */
    public static final class C41704a {

        /* renamed from: a */
        public Context f105915a;

        /* renamed from: b */
        public int f105916b;

        /* renamed from: c */
        public String f105917c;

        /* renamed from: d */
        public String f105918d;

        /* renamed from: e */
        public String f105919e;

        /* renamed from: f */
        public boolean f105920f;

        /* renamed from: g */
        public String f105921g;

        /* renamed from: h */
        public boolean f105922h;

        /* renamed from: i */
        public String f105923i;

        /* renamed from: j */
        public int f105924j;

        /* renamed from: k */
        public IALogEvent f105925k;

        private C41704a() {
        }

        /* renamed from: a */
        public C41702d mo149974a() {
            return new C41702d(this);
        }

        /* renamed from: a */
        public C41704a mo149969a(int i) {
            this.f105916b = i;
            return this;
        }

        /* renamed from: b */
        public C41704a mo149975b(int i) {
            this.f105924j = i;
            return this;
        }

        /* renamed from: c */
        public C41704a mo149978c(String str) {
            this.f105919e = str;
            return this;
        }

        /* renamed from: d */
        public C41704a mo149979d(String str) {
            this.f105921g = str;
            return this;
        }

        /* renamed from: e */
        public C41704a mo149980e(String str) {
            this.f105923i = str;
            return this;
        }

        /* renamed from: a */
        public C41704a mo149970a(Context context) {
            this.f105915a = context;
            return this;
        }

        /* renamed from: b */
        public C41704a mo149976b(String str) {
            this.f105918d = str;
            return this;
        }

        /* renamed from: a */
        public C41704a mo149971a(IALogEvent fVar) {
            this.f105925k = fVar;
            return this;
        }

        /* renamed from: b */
        public C41704a mo149977b(boolean z) {
            this.f105922h = z;
            return this;
        }

        /* renamed from: a */
        public C41704a mo149972a(String str) {
            this.f105917c = str;
            return this;
        }

        /* renamed from: a */
        public C41704a mo149973a(boolean z) {
            this.f105920f = z;
            return this;
        }
    }

    /* renamed from: b */
    public String mo149967b() {
        return this.f105913j;
    }

    /* renamed from: a */
    public static C41704a m165527a() {
        return new C41704a();
    }

    /* renamed from: c */
    public int mo149968c() {
        int i = this.f105914k;
        if (i <= 0) {
            return 10;
        }
        return i;
    }

    private C41702d(C41704a aVar) {
        this.f105904a = aVar.f105915a;
        this.f105905b = aVar.f105916b;
        this.f105906c = aVar.f105917c;
        this.f105907d = aVar.f105918d;
        this.f105908e = aVar.f105919e;
        this.f105909f = aVar.f105920f;
        this.f105910g = aVar.f105921g;
        this.f105911h = aVar.f105922h;
        this.f105913j = aVar.f105923i;
        this.f105914k = aVar.f105924j;
        this.f105912i = aVar.f105925k;
    }
}
