package com.bytedance.ee.bear.domain;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.log.C13479a;
import java.util.HashMap;
import java.util.Set;
import java.util.regex.Matcher;

/* renamed from: com.bytedance.ee.bear.domain.j */
public class C6315j {

    /* renamed from: a */
    protected C6310f f17520a;

    public C6315j(C6310f fVar) {
        this.f17520a = fVar;
    }

    /* renamed from: d */
    private boolean m25366d(String str) {
        return this.f17520a.mo25371h().matcher(str).matches();
    }

    /* renamed from: b */
    private boolean m25364b(String str) {
        if (TextUtils.isEmpty(str) || str.startsWith("javascript:")) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private boolean m25365c(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "/space") || TextUtils.equals(str, "/")) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private String m25367e(String str) {
        String a = C8275a.f22369b.mo32553a();
        if (TextUtils.isEmpty(str)) {
            C13479a.m54764b("UrlParser", "getProductTypeName()....originType is empty");
            return a;
        }
        String str2 = this.f17520a.mo25374k().get(str);
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        C13479a.m54764b("UrlParser", "getProductTypeName()...originType = " + str);
        return C8275a.f22369b.mo32553a();
    }

    /* renamed from: a */
    public BearUrl mo25404a(String str) {
        BearUrl bearUrl = new BearUrl(str);
        if (m25364b(str)) {
            C13479a.m54764b("UrlParser", "parse()...url is null or is js function");
            return bearUrl;
        }
        bearUrl.mo25323a(C8275a.f22369b.mo32553a());
        Uri parse = Uri.parse(str);
        m25361a(bearUrl, parse);
        String path = parse.getPath();
        if (m25365c(path)) {
            bearUrl.mo25323a("recent");
            C13479a.m54764b("UrlParser", "parseUrl()...type = " + bearUrl.mo25322a());
            return bearUrl;
        } else if (m25366d(path)) {
            m25363b(bearUrl, path);
            if (!TextUtils.isEmpty(bearUrl.mo25325b())) {
                C13479a.m54764b("UrlParser", "parse()...subPath = " + path.replace(bearUrl.mo25325b(), ""));
            }
            return bearUrl;
        } else {
            if (!path.endsWith("/")) {
                path = path + "/";
            }
            if (m25362a(bearUrl, path)) {
                return bearUrl;
            }
            if (path.startsWith("/wiki/space")) {
                String lastPathSegment = parse.getLastPathSegment();
                if (!TextUtils.isEmpty(lastPathSegment)) {
                    bearUrl.mo25323a("wiki_space_home");
                    bearUrl.mo25334g(lastPathSegment);
                    return bearUrl;
                }
            }
            if (path.startsWith("/wiki/trash")) {
                String lastPathSegment2 = parse.getLastPathSegment();
                if (!TextUtils.isEmpty(lastPathSegment2)) {
                    bearUrl.mo25323a("wiki_trash");
                    bearUrl.mo25334g(lastPathSegment2);
                    return bearUrl;
                }
            }
            bearUrl.mo25323a(C8275a.f22369b.mo32553a());
            C13479a.m54764b("UrlParser", "parseUrl()...type = unknown");
            return bearUrl;
        }
    }

    /* renamed from: a */
    private String m25360a(String str, Matcher matcher) {
        return m25367e(str.substring(matcher.start() + 1, matcher.end() - 1));
    }

    /* renamed from: a */
    private boolean m25362a(BearUrl bearUrl, String str) {
        String str2 = (String) ((HashMap) this.f17520a.mo25368e()).get(str);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        bearUrl.mo25323a(str2);
        C13479a.m54764b("UrlParser", "parse()...tab = " + str2);
        return true;
    }

    /* renamed from: a */
    private void m25361a(BearUrl bearUrl, Uri uri) {
        Set<String> queryParameterNames;
        if (uri.isHierarchical() && (queryParameterNames = uri.getQueryParameterNames()) != null) {
            for (String str : queryParameterNames) {
                String queryParameter = uri.getQueryParameter(str);
                bearUrl.mo25324a(str, queryParameter);
                if (TextUtils.equals(str, "sourceType")) {
                    bearUrl.mo25330d(queryParameter);
                } else if (TextUtils.equals(str, "docId")) {
                    bearUrl.mo25332e(queryParameter);
                } else if (TextUtils.equals(str, "open_type")) {
                    bearUrl.mo25328c(queryParameter);
                } else if (TextUtils.equals(str, "from")) {
                    bearUrl.mo25333f(queryParameter);
                }
            }
        }
    }

    /* renamed from: b */
    private void m25363b(BearUrl bearUrl, String str) {
        Matcher matcher = this.f17520a.mo25373j().matcher(str);
        if (matcher.find() && matcher.end() > matcher.start()) {
            String substring = str.substring(matcher.start() + 1, matcher.end());
            Matcher matcher2 = this.f17520a.mo25372i().matcher(str);
            if (matcher2.find() && matcher2.end() > matcher2.start()) {
                bearUrl.mo25323a(m25360a(str, matcher2));
                bearUrl.mo25326b(substring);
            }
        }
        C13479a.m54764b("UrlParser", "parseUrl()...type = " + bearUrl.mo25322a());
    }
}
