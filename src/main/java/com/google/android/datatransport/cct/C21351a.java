package com.google.android.datatransport.cct;

import com.google.android.datatransport.C21349b;
import com.google.android.datatransport.runtime.AbstractC21431f;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: com.google.android.datatransport.cct.a */
public final class C21351a implements AbstractC21431f {

    /* renamed from: a */
    static final String f51903a;

    /* renamed from: b */
    static final String f51904b;

    /* renamed from: c */
    public static final C21351a f51905c;

    /* renamed from: d */
    public static final C21351a f51906d;

    /* renamed from: e */
    private static final String f51907e;

    /* renamed from: f */
    private static final Set<C21349b> f51908f = Collections.unmodifiableSet(new HashSet(Arrays.asList(C21349b.m77288a("proto"), C21349b.m77288a("json"))));

    /* renamed from: g */
    private final String f51909g;

    /* renamed from: h */
    private final String f51910h;

    @Override // com.google.android.datatransport.runtime.AbstractC21430e
    /* renamed from: a */
    public String mo72504a() {
        return "cct";
    }

    @Override // com.google.android.datatransport.runtime.AbstractC21431f
    /* renamed from: c */
    public Set<C21349b> mo72506c() {
        return f51908f;
    }

    /* renamed from: d */
    public String mo72507d() {
        return this.f51910h;
    }

    /* renamed from: e */
    public String mo72508e() {
        return this.f51909g;
    }

    @Override // com.google.android.datatransport.runtime.AbstractC21430e
    /* renamed from: b */
    public byte[] mo72505b() {
        return mo72509f();
    }

    /* renamed from: f */
    public byte[] mo72509f() {
        String str = this.f51910h;
        if (str == null && this.f51909g == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f51909g;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    static {
        String a = C21391e.m77424a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f51903a = a;
        String a2 = C21391e.m77424a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f51904b = a2;
        String a3 = C21391e.m77424a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f51907e = a3;
        f51905c = new C21351a(a, null);
        f51906d = new C21351a(a2, a3);
    }

    /* renamed from: a */
    public static C21351a m77295a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new C21351a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    public C21351a(String str, String str2) {
        this.f51909g = str;
        this.f51910h = str2;
    }
}
