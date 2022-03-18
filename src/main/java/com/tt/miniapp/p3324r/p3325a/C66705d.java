package com.tt.miniapp.p3324r.p3325a;

import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.tt.frontendapiinterface.IApiInputParam;
import com.tt.frontendapiinterface.IApiOutputParam;
import com.tt.miniapp.p3324r.p3325a.C66701c;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.r.a.d */
public class C66705d {

    /* renamed from: com.tt.miniapp.r.a.d$b */
    public static class C66708b implements IApiOutputParam {

        /* renamed from: a */
        public int f168399a;

        /* renamed from: b */
        public String f168400b;

        /* renamed from: c */
        public String f168401c;

        /* renamed from: d */
        public Integer f168402d;

        /* renamed from: e */
        public JSONObject f168403e;

        /* renamed from: f */
        public String f168404f;

        /* renamed from: g */
        public OPTrace f168405g;

        /* renamed from: h */
        public int f168406h = -1;

        /* renamed from: i */
        public List<C66701c.C66703b.C66704a> f168407i;

        /* renamed from: j */
        public String f168408j;

        /* renamed from: k */
        public String f168409k;
    }

    /* renamed from: com.tt.miniapp.r.a.d$a */
    public static class C66706a implements IApiInputParam {

        /* renamed from: a */
        public String f168389a;

        /* renamed from: b */
        public String f168390b;

        /* renamed from: c */
        public String f168391c;

        /* renamed from: d */
        public boolean f168392d;

        /* renamed from: e */
        public String f168393e;

        /* renamed from: f */
        public String f168394f;

        /* renamed from: g */
        public String f168395g;

        /* renamed from: h */
        public List<C66707a> f168396h;

        /* renamed from: com.tt.miniapp.r.a.d$a$a */
        public static class C66707a {

            /* renamed from: a */
            public String f168397a;

            /* renamed from: b */
            public byte[] f168398b;

            public C66707a(String str, byte[] bArr) {
                this.f168397a = str;
                this.f168398b = bArr;
            }
        }

        public C66706a(String str, String str2, boolean z, String str3, String str4, String str5, String str6, List<C66707a> list) {
            this.f168389a = str;
            this.f168390b = str2;
            this.f168392d = z;
            this.f168391c = str3;
            this.f168393e = str4;
            this.f168394f = str5;
            this.f168395g = str6;
            this.f168396h = list;
        }
    }
}
