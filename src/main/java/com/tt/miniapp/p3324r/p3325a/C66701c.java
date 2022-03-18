package com.tt.miniapp.p3324r.p3325a;

import com.tt.frontendapiinterface.IApiInputParam;
import com.tt.frontendapiinterface.IApiOutputParam;
import java.util.List;

/* renamed from: com.tt.miniapp.r.a.c */
public class C66701c {

    /* renamed from: com.tt.miniapp.r.a.c$b */
    public static class C66703b implements IApiOutputParam {

        /* renamed from: a */
        public String f168384a;

        /* renamed from: b */
        public String f168385b;

        /* renamed from: c */
        public List<C66704a> f168386c;

        public C66703b() {
        }

        /* renamed from: com.tt.miniapp.r.a.c$b$a */
        public static class C66704a {

            /* renamed from: a */
            public String f168387a;

            /* renamed from: b */
            public byte[] f168388b;

            public C66704a(String str, byte[] bArr) {
                this.f168387a = str;
                this.f168388b = bArr;
            }
        }

        public C66703b(String str, String str2, List<C66704a> list) {
            this.f168384a = str;
            this.f168385b = str2;
            this.f168386c = list;
        }
    }

    /* renamed from: com.tt.miniapp.r.a.c$a */
    public static class C66702a implements IApiInputParam {

        /* renamed from: a */
        public String f168382a;

        /* renamed from: b */
        public String f168383b;

        public C66702a(String str, String str2) {
            this.f168382a = str;
            this.f168383b = str2;
        }
    }
}
