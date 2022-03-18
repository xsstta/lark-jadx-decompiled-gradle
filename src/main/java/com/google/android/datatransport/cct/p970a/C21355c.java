package com.google.android.datatransport.cct.p970a;

import com.google.android.datatransport.cct.p970a.AbstractC21352a;

/* renamed from: com.google.android.datatransport.cct.a.c */
final class C21355c extends AbstractC21352a {

    /* renamed from: a */
    private final int f51911a;

    /* renamed from: b */
    private final String f51912b;

    /* renamed from: c */
    private final String f51913c;

    /* renamed from: d */
    private final String f51914d;

    /* renamed from: e */
    private final String f51915e;

    /* renamed from: f */
    private final String f51916f;

    /* renamed from: g */
    private final String f51917g;

    /* renamed from: h */
    private final String f51918h;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.datatransport.cct.a.c$b */
    public static final class C21357b extends AbstractC21352a.AbstractC21353a {

        /* renamed from: a */
        private Integer f51919a;

        /* renamed from: b */
        private String f51920b;

        /* renamed from: c */
        private String f51921c;

        /* renamed from: d */
        private String f51922d;

        /* renamed from: e */
        private String f51923e;

        /* renamed from: f */
        private String f51924f;

        /* renamed from: g */
        private String f51925g;

        /* renamed from: h */
        private String f51926h;

        C21357b() {
        }

        @Override // com.google.android.datatransport.cct.p970a.AbstractC21352a.AbstractC21353a
        /* renamed from: a */
        public AbstractC21352a mo72512a() {
            String str = "";
            if (this.f51919a == null) {
                str = str + " sdkVersion";
            }
            if (str.isEmpty()) {
                return new C21355c(this.f51919a.intValue(), this.f51920b, this.f51921c, this.f51922d, this.f51923e, this.f51924f, this.f51925g, this.f51926h, null);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.cct.p970a.AbstractC21352a.AbstractC21353a
        /* renamed from: a */
        public AbstractC21352a.AbstractC21353a mo72511a(String str) {
            this.f51920b = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p970a.AbstractC21352a.AbstractC21353a
        /* renamed from: b */
        public AbstractC21352a.AbstractC21353a mo72513b(String str) {
            this.f51921c = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p970a.AbstractC21352a.AbstractC21353a
        /* renamed from: c */
        public AbstractC21352a.AbstractC21353a mo72514c(String str) {
            this.f51922d = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p970a.AbstractC21352a.AbstractC21353a
        /* renamed from: d */
        public AbstractC21352a.AbstractC21353a mo72515d(String str) {
            this.f51923e = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p970a.AbstractC21352a.AbstractC21353a
        /* renamed from: e */
        public AbstractC21352a.AbstractC21353a mo72516e(String str) {
            this.f51924f = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p970a.AbstractC21352a.AbstractC21353a
        /* renamed from: f */
        public AbstractC21352a.AbstractC21353a mo72517f(String str) {
            this.f51925g = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p970a.AbstractC21352a.AbstractC21353a
        /* renamed from: g */
        public AbstractC21352a.AbstractC21353a mo72518g(String str) {
            this.f51926h = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p970a.AbstractC21352a.AbstractC21353a
        /* renamed from: a */
        public AbstractC21352a.AbstractC21353a mo72510a(int i) {
            this.f51919a = Integer.valueOf(i);
            return this;
        }
    }

    /* renamed from: b */
    public int mo72520b() {
        return this.f51911a;
    }

    /* renamed from: c */
    public String mo72521c() {
        return this.f51912b;
    }

    /* renamed from: d */
    public String mo72522d() {
        return this.f51913c;
    }

    /* renamed from: e */
    public String mo72523e() {
        return this.f51914d;
    }

    /* renamed from: f */
    public String mo72525f() {
        return this.f51915e;
    }

    /* renamed from: g */
    public String mo72526g() {
        return this.f51916f;
    }

    /* renamed from: h */
    public String mo72527h() {
        return this.f51917g;
    }

    /* renamed from: i */
    public String mo72529i() {
        return this.f51918h;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = (this.f51911a ^ 1000003) * 1000003;
        String str = this.f51912b;
        int i8 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i9 = (i7 ^ i) * 1000003;
        String str2 = this.f51913c;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i10 = (i9 ^ i2) * 1000003;
        String str3 = this.f51914d;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        int i11 = (i10 ^ i3) * 1000003;
        String str4 = this.f51915e;
        if (str4 == null) {
            i4 = 0;
        } else {
            i4 = str4.hashCode();
        }
        int i12 = (i11 ^ i4) * 1000003;
        String str5 = this.f51916f;
        if (str5 == null) {
            i5 = 0;
        } else {
            i5 = str5.hashCode();
        }
        int i13 = (i12 ^ i5) * 1000003;
        String str6 = this.f51917g;
        if (str6 == null) {
            i6 = 0;
        } else {
            i6 = str6.hashCode();
        }
        int i14 = (i13 ^ i6) * 1000003;
        String str7 = this.f51918h;
        if (str7 != null) {
            i8 = str7.hashCode();
        }
        return i14 ^ i8;
    }

    public String toString() {
        return "AndroidClientInfo{sdkVersion=" + this.f51911a + ", model=" + this.f51912b + ", hardware=" + this.f51913c + ", device=" + this.f51914d + ", product=" + this.f51915e + ", osBuild=" + this.f51916f + ", manufacturer=" + this.f51917g + ", fingerprint=" + this.f51918h + "}";
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC21352a)) {
            return false;
        }
        C21355c cVar = (C21355c) ((AbstractC21352a) obj);
        if (this.f51911a == cVar.f51911a && ((str = this.f51912b) != null ? str.equals(cVar.f51912b) : cVar.f51912b == null) && ((str2 = this.f51913c) != null ? str2.equals(cVar.f51913c) : cVar.f51913c == null) && ((str3 = this.f51914d) != null ? str3.equals(cVar.f51914d) : cVar.f51914d == null) && ((str4 = this.f51915e) != null ? str4.equals(cVar.f51915e) : cVar.f51915e == null) && ((str5 = this.f51916f) != null ? str5.equals(cVar.f51916f) : cVar.f51916f == null) && ((str6 = this.f51917g) != null ? str6.equals(cVar.f51917g) : cVar.f51917g == null)) {
            String str7 = this.f51918h;
            if (str7 == null) {
                if (cVar.f51918h == null) {
                    return true;
                }
            } else if (str7.equals(cVar.f51918h)) {
                return true;
            }
        }
        return false;
    }

    /* synthetic */ C21355c(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, C21356a aVar) {
        this.f51911a = i;
        this.f51912b = str;
        this.f51913c = str2;
        this.f51914d = str3;
        this.f51915e = str4;
        this.f51916f = str5;
        this.f51917g = str6;
        this.f51918h = str7;
    }
}
