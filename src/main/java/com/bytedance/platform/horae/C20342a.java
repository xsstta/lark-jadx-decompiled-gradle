package com.bytedance.platform.horae;

import android.app.Application;
import com.bytedance.platform.horae.p874a.C20353b;
import java.util.Set;

/* renamed from: com.bytedance.platform.horae.a */
public class C20342a {

    /* renamed from: a */
    private boolean f49622a;

    /* renamed from: b */
    private AbstractC20367b f49623b;

    /* renamed from: c */
    private String f49624c;

    /* renamed from: d */
    private boolean f49625d;

    /* renamed from: e */
    private boolean f49626e;

    /* renamed from: f */
    private Set<String> f49627f;

    /* renamed from: com.bytedance.platform.horae.a$a */
    public static class C20344a {

        /* renamed from: a */
        private boolean f49628a;

        /* renamed from: b */
        private AbstractC20367b f49629b;

        /* renamed from: c */
        private boolean f49630c;

        /* renamed from: d */
        private String f49631d = "double_turbo_quicken_engine";

        /* renamed from: e */
        private boolean f49632e;

        /* renamed from: f */
        private Set<String> f49633f;

        /* renamed from: a */
        public C20342a mo68649a() {
            return new C20342a(this.f49628a, this.f49629b, this.f49631d, this.f49630c, this.f49633f, this.f49632e);
        }

        /* renamed from: a */
        public C20344a mo68645a(AbstractC20367b bVar) {
            this.f49629b = bVar;
            return this;
        }

        /* renamed from: b */
        public C20344a mo68650b(boolean z) {
            this.f49630c = z;
            return this;
        }

        /* renamed from: a */
        public C20344a mo68646a(String str) {
            this.f49631d = str;
            return this;
        }

        /* renamed from: a */
        public C20344a mo68647a(Set<String> set) {
            this.f49633f = set;
            return this;
        }

        /* renamed from: a */
        public C20344a mo68648a(boolean z) {
            this.f49628a = z;
            return this;
        }
    }

    /* renamed from: a */
    public void mo68644a(Application application) {
        C20353b.m74170a(application).mo68664a(this.f49622a, this.f49624c, this.f49623b, this.f49627f, this.f49626e);
    }

    private C20342a(boolean z, AbstractC20367b bVar, String str, boolean z2, Set<String> set, boolean z3) {
        this.f49624c = "double_turbo_quicken_engine";
        this.f49622a = z;
        this.f49623b = bVar;
        this.f49624c = str;
        this.f49625d = z2;
        this.f49627f = set;
        this.f49626e = z3;
    }
}
