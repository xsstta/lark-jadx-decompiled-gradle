package com.ss.android.lark.mail.impl.utils;

import android.content.Intent;
import android.net.Uri;
import com.ss.android.lark.mail.impl.entity.MailAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.utils.o */
public class C43783o {

    /* renamed from: a */
    private final List<MailAddress> f111075a;

    /* renamed from: b */
    private final List<MailAddress> f111076b;

    /* renamed from: c */
    private final List<MailAddress> f111077c;

    /* renamed from: d */
    private final String f111078d;

    /* renamed from: e */
    private final String f111079e;

    /* renamed from: f */
    private final String f111080f;

    /* renamed from: a */
    public List<MailAddress> mo155944a() {
        return this.f111075a;
    }

    /* renamed from: c */
    public List<MailAddress> mo155946c() {
        return this.f111076b;
    }

    /* renamed from: d */
    public List<MailAddress> mo155947d() {
        return this.f111077c;
    }

    /* renamed from: e */
    public String mo155948e() {
        return this.f111078d;
    }

    /* renamed from: f */
    public String mo155949f() {
        String str = this.f111079e;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: g */
    public String mo155950g() {
        String str = this.f111080f;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: b */
    public String[] mo155945b() {
        if (this.f111075a == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        for (MailAddress mailAddress : this.f111075a) {
            arrayList.add(mailAddress.mo151182e());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.utils.o$a */
    public static class C43784a {

        /* renamed from: a */
        private final Uri f111081a;

        public C43784a(Uri uri) {
            this.f111081a = uri;
        }

        /* renamed from: a */
        public List<String> mo155951a(String str) {
            ArrayList arrayList = new ArrayList();
            for (String str2 : this.f111081a.getQueryParameterNames()) {
                if (str2.equalsIgnoreCase(str)) {
                    arrayList.addAll(this.f111081a.getQueryParameters(str2));
                }
            }
            return arrayList;
        }
    }

    /* renamed from: b */
    public static C43783o m173520b(Uri uri) throws NullPointerException, IllegalArgumentException {
        return m173515a(uri, true);
    }

    /* renamed from: a */
    private static List<MailAddress> m173518a(String[] strArr) {
        return m173521b(Arrays.asList(strArr));
    }

    /* renamed from: a */
    private static List<MailAddress> m173517a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        if (list.isEmpty()) {
            return arrayList;
        }
        for (String str : list) {
            MailAddress a = MailAddress.m167321a(str);
            if (a.mo151185g()) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private static List<MailAddress> m173521b(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            MailAddress a = MailAddress.m167321a(str);
            if (a.mo151185g()) {
                Collections.addAll(arrayList, a);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static C43783o m173514a(Intent intent) {
        String[] stringArrayExtra = intent.getStringArrayExtra("android.intent.extra.EMAIL");
        String[] stringArrayExtra2 = intent.getStringArrayExtra("android.intent.extra.CC");
        String[] stringArrayExtra3 = intent.getStringArrayExtra("android.intent.extra.BCC");
        List arrayList = new ArrayList();
        if (stringArrayExtra != null) {
            arrayList = m173518a(stringArrayExtra);
        }
        List arrayList2 = new ArrayList();
        if (stringArrayExtra2 != null) {
            arrayList2 = m173518a(stringArrayExtra2);
        }
        List arrayList3 = new ArrayList();
        if (stringArrayExtra3 != null) {
            arrayList3 = m173518a(stringArrayExtra3);
        }
        return new C43783o(arrayList, arrayList2, arrayList3, intent.getStringExtra("android.intent.extra.SUBJECT"), intent.getStringExtra("android.intent.extra.HTML_TEXT"), intent.getStringExtra("android.intent.extra.TEXT"));
    }

    /* renamed from: a */
    public static boolean m173519a(Uri uri) {
        if (uri == null || !"mailto".equals(uri.getScheme())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static String m173516a(C43784a aVar, String str) {
        List<String> a = aVar.mo155951a(str);
        if (a.isEmpty()) {
            return null;
        }
        return a.get(0);
    }

    /* renamed from: a */
    public static C43783o m173515a(Uri uri, boolean z) throws NullPointerException, IllegalArgumentException {
        if (uri == null || uri.toString() == null) {
            throw new NullPointerException("Argument 'uri' must not be null");
        } else if (!z || m173519a(uri)) {
            String schemeSpecificPart = uri.getSchemeSpecificPart();
            int indexOf = schemeSpecificPart.indexOf(63);
            if (indexOf == -1) {
                indexOf = schemeSpecificPart.length();
            }
            C43784a aVar = new C43784a(Uri.parse("foo://bar?" + uri.getEncodedQuery()));
            String decode = Uri.decode(schemeSpecificPart.substring(0, indexOf));
            List<String> a = aVar.mo155951a("to");
            if (decode.length() != 0) {
                a.add(0, decode);
            }
            return new C43783o(m173517a(a), m173517a(aVar.mo155951a("cc")), m173517a(aVar.mo155951a("bcc")), m173516a(aVar, "subject"), m173516a(aVar, "body"));
        } else {
            throw new IllegalArgumentException("Not a mailto scheme");
        }
    }

    private C43783o(List<MailAddress> list, List<MailAddress> list2, List<MailAddress> list3, String str, String str2) {
        this(list, list2, list3, str, str2, "");
    }

    private C43783o(List<MailAddress> list, List<MailAddress> list2, List<MailAddress> list3, String str, String str2, String str3) {
        this.f111075a = list;
        this.f111076b = list2;
        this.f111077c = list3;
        this.f111078d = str == null ? "" : str;
        this.f111079e = str2 == null ? "" : str2;
        this.f111080f = str3 == null ? "" : str3;
    }
}
