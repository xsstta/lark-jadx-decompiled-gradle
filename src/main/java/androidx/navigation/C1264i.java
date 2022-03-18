package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: androidx.navigation.i */
public final class C1264i {

    /* renamed from: a */
    private static final Pattern f4544a = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: b */
    private final ArrayList<String> f4545b = new ArrayList<>();

    /* renamed from: c */
    private final Map<String, C1267c> f4546c = new HashMap();

    /* renamed from: d */
    private Pattern f4547d = null;

    /* renamed from: e */
    private boolean f4548e = false;

    /* renamed from: f */
    private boolean f4549f = false;

    /* renamed from: g */
    private final String f4550g;

    /* renamed from: h */
    private final String f4551h;

    /* renamed from: i */
    private Pattern f4552i = null;

    /* renamed from: j */
    private final String f4553j;

    /* renamed from: androidx.navigation.i$a */
    public static final class C1265a {

        /* renamed from: a */
        private String f4554a;

        /* renamed from: b */
        private String f4555b;

        /* renamed from: c */
        private String f4556c;

        C1265a() {
        }

        /* renamed from: a */
        public C1264i mo6354a() {
            return new C1264i(this.f4554a, this.f4555b, this.f4556c);
        }

        /* renamed from: a */
        public C1265a mo6353a(String str) {
            this.f4554a = str;
            return this;
        }

        /* renamed from: c */
        public C1265a mo6356c(String str) {
            this.f4556c = str;
            return this;
        }

        /* renamed from: b */
        public C1265a mo6355b(String str) {
            if (!str.isEmpty()) {
                this.f4555b = str;
                return this;
            }
            throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.navigation.i$c */
    public static class C1267c {

        /* renamed from: a */
        private String f4559a;

        /* renamed from: b */
        private ArrayList<String> f4560b = new ArrayList<>();

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo6359a() {
            return this.f4559a;
        }

        /* renamed from: b */
        public int mo6362b() {
            return this.f4560b.size();
        }

        C1267c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6361a(String str) {
            this.f4559a = str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo6360a(int i) {
            return this.f4560b.get(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo6363b(String str) {
            this.f4560b.add(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo6351a() {
        return this.f4548e;
    }

    /* renamed from: b */
    public String mo6352b() {
        return this.f4551h;
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.navigation.i$b */
    public static class C1266b implements Comparable<C1266b> {

        /* renamed from: a */
        String f4557a;

        /* renamed from: b */
        String f4558b;

        C1266b(String str) {
            String[] split = str.split("/", -1);
            this.f4557a = split[0];
            this.f4558b = split[1];
        }

        /* renamed from: a */
        public int compareTo(C1266b bVar) {
            int i;
            if (this.f4557a.equals(bVar.f4557a)) {
                i = 2;
            } else {
                i = 0;
            }
            if (this.f4558b.equals(bVar.f4558b)) {
                return i + 1;
            }
            return i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo6349a(String str) {
        if (this.f4553j == null || !this.f4552i.matcher(str).matches()) {
            return -1;
        }
        return new C1266b(this.f4553j).compareTo(new C1266b(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Bundle mo6350a(Uri uri, Map<String, C1248e> map) {
        Matcher matcher;
        Matcher matcher2 = this.f4547d.matcher(uri.toString());
        if (!matcher2.matches()) {
            return null;
        }
        Bundle bundle = new Bundle();
        int size = this.f4545b.size();
        int i = 0;
        while (i < size) {
            String str = this.f4545b.get(i);
            i++;
            if (m5743a(bundle, str, Uri.decode(matcher2.group(i)), map.get(str))) {
                return null;
            }
        }
        if (this.f4549f) {
            for (String str2 : this.f4546c.keySet()) {
                C1267c cVar = this.f4546c.get(str2);
                String queryParameter = uri.getQueryParameter(str2);
                if (queryParameter != null) {
                    matcher = Pattern.compile(cVar.mo6359a()).matcher(queryParameter);
                    if (!matcher.matches()) {
                        return null;
                    }
                } else {
                    matcher = null;
                }
                int i2 = 0;
                while (true) {
                    if (i2 < cVar.mo6362b()) {
                        String decode = matcher != null ? Uri.decode(matcher.group(i2 + 1)) : null;
                        String a = cVar.mo6360a(i2);
                        C1248e eVar = map.get(a);
                        if (!(decode == null || decode.replaceAll("[{}]", "").equals(a) || !m5743a(bundle, a, decode, eVar))) {
                            return null;
                        }
                        i2++;
                    }
                }
            }
        }
        return bundle;
    }

    /* renamed from: a */
    private boolean m5744a(String str, StringBuilder sb, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        boolean z = !str.contains(".*");
        int i = 0;
        while (matcher.find()) {
            this.f4545b.add(matcher.group(1));
            sb.append(Pattern.quote(str.substring(i, matcher.start())));
            sb.append("(.+?)");
            i = matcher.end();
            z = false;
        }
        if (i < str.length()) {
            sb.append(Pattern.quote(str.substring(i)));
        }
        sb.append("($|(\\?(.)*))");
        return z;
    }

    C1264i(String str, String str2, String str3) {
        boolean z;
        this.f4550g = str;
        this.f4551h = str2;
        this.f4553j = str3;
        if (str != null) {
            Uri parse = Uri.parse(str);
            if (parse.getQuery() != null) {
                z = true;
            } else {
                z = false;
            }
            this.f4549f = z;
            StringBuilder sb = new StringBuilder("^");
            if (!f4544a.matcher(str).find()) {
                sb.append("http[s]?://");
            }
            Pattern compile = Pattern.compile("\\{(.+?)\\}");
            if (this.f4549f) {
                Matcher matcher = Pattern.compile("(\\?)").matcher(str);
                if (matcher.find()) {
                    m5744a(str.substring(0, matcher.start()), sb, compile);
                }
                this.f4548e = false;
                for (String str4 : parse.getQueryParameterNames()) {
                    StringBuilder sb2 = new StringBuilder();
                    String queryParameter = parse.getQueryParameter(str4);
                    Matcher matcher2 = compile.matcher(queryParameter);
                    C1267c cVar = new C1267c();
                    int i = 0;
                    while (matcher2.find()) {
                        cVar.mo6363b(matcher2.group(1));
                        sb2.append(Pattern.quote(queryParameter.substring(i, matcher2.start())));
                        sb2.append("(.+?)?");
                        i = matcher2.end();
                    }
                    if (i < queryParameter.length()) {
                        sb2.append(Pattern.quote(queryParameter.substring(i)));
                    }
                    cVar.mo6361a(sb2.toString().replace(".*", "\\E.*\\Q"));
                    this.f4546c.put(str4, cVar);
                }
            } else {
                this.f4548e = m5744a(str, sb, compile);
            }
            this.f4547d = Pattern.compile(sb.toString().replace(".*", "\\E.*\\Q"), 2);
        }
        if (str3 == null) {
            return;
        }
        if (Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(str3).matches()) {
            C1266b bVar = new C1266b(str3);
            this.f4552i = Pattern.compile(("^(" + bVar.f4557a + "|[*]+)/(" + bVar.f4558b + "|[*]+)$").replace("*|[*]", "[\\s\\S]"));
            return;
        }
        throw new IllegalArgumentException("The given mimeType " + str3 + " does not match to required \"type/subtype\" format");
    }

    /* renamed from: a */
    private boolean m5743a(Bundle bundle, String str, String str2, C1248e eVar) {
        if (eVar != null) {
            try {
                eVar.mo6291b().mo6399a(bundle, str, str2);
                return false;
            } catch (IllegalArgumentException unused) {
                return true;
            }
        } else {
            bundle.putString(str, str2);
            return false;
        }
    }
}
