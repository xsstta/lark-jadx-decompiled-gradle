package bytedance.p050a;

import bytedance.io.exception.IllegalPathException;
import bytedance.p051b.AbstractC1678b;
import bytedance.p051b.C1677a;
import java.io.File;
import java.net.URI;
import java.util.LinkedList;
import java.util.List;

/* renamed from: bytedance.a.b */
public class C1673b {

    /* renamed from: a */
    public AbstractC1672a f5696a;

    /* renamed from: b */
    private List<AbstractC1678b> f5697b;

    /* renamed from: b */
    public String mo8558b() {
        return "/";
    }

    /* renamed from: a */
    public static C1673b m7425a() {
        return C1675a.f5698a;
    }

    /* access modifiers changed from: private */
    /* renamed from: bytedance.a.b$a */
    public static class C1675a {

        /* renamed from: a */
        static final C1673b f5698a = m7433a();

        /* renamed from: a */
        private static C1673b m7433a() {
            return new C1673b();
        }
    }

    private C1673b() {
        this.f5697b = new LinkedList();
    }

    /* renamed from: a */
    public String mo8555a(String str) throws IllegalPathException {
        if (str == null) {
            return str;
        }
        C1677a aVar = new C1677a(str, 0);
        return new C1676c(this.f5697b, 0, aVar).mo8561a(aVar).mo8563a();
    }

    /* renamed from: c */
    public String mo8560c(String str) {
        if (!str.endsWith("/") || str.length() <= 1) {
            return str;
        }
        return str.substring(0, str.length() - 1);
    }

    /* renamed from: b */
    public String mo8559b(String str) {
        int length = str.length();
        char[] charArray = str.toCharArray();
        int i = 0;
        char c = 0;
        int i2 = 0;
        while (i < length) {
            char c2 = charArray[i];
            if (c2 != '/' || c != '/') {
                charArray[i2] = c2;
                i2++;
            }
            i++;
            c = c2;
        }
        if (c == '/' && length > 1) {
            i2--;
        }
        if (i2 != length) {
            return new String(charArray, 0, i2);
        }
        return str;
    }

    /* renamed from: a */
    public String mo8557a(URI uri) throws IllegalPathException {
        if (!uri.isAbsolute()) {
            throw new IllegalArgumentException("URI is not absolute");
        } else if (!uri.isOpaque()) {
            String scheme = uri.getScheme();
            if (scheme == null || !scheme.equalsIgnoreCase("file")) {
                throw new IllegalArgumentException("URI scheme is not \"file\"");
            } else if (uri.getAuthority() != null) {
                throw new IllegalArgumentException("URI has an authority component");
            } else if (uri.getFragment() != null) {
                throw new IllegalArgumentException("URI has a fragment component");
            } else if (uri.getQuery() == null) {
                String path = uri.getPath();
                if (!path.equals("")) {
                    String c = mo8560c(path);
                    if (File.separatorChar != '/') {
                        c = c.replace('/', File.separatorChar);
                    }
                    return mo8555a(mo8559b(c));
                }
                throw new IllegalArgumentException("URI path component is empty");
            } else {
                throw new IllegalArgumentException("URI has a query component");
            }
        } else {
            throw new IllegalArgumentException("URI is not hierarchical");
        }
    }

    /* renamed from: a */
    public String mo8554a(File file, String str) throws IllegalPathException {
        if (str == null) {
            return str;
        }
        if (file == null) {
            return mo8555a(str);
        }
        if (file.getPath().equals("")) {
            return mo8556a(mo8558b(), str);
        }
        return mo8556a(file.getPath(), str);
    }

    /* renamed from: a */
    public String mo8556a(String str, String str2) throws IllegalPathException {
        if (str2 == null) {
            return str2;
        }
        if (str == null || str.isEmpty()) {
            return mo8555a(str2);
        }
        if (str2.isEmpty() || str2.equals("/")) {
            return mo8555a(str);
        }
        if (str2.charAt(0) == '/' && str.equals("/")) {
            return mo8555a(str2);
        }
        C1677a aVar = new C1677a(str, str2, 0);
        return new C1676c(this.f5697b, 0, aVar).mo8561a(aVar).mo8563a();
    }
}
