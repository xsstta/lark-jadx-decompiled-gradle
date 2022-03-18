package com.bytedance.ee.bear.domain;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13606d;
import com.bytedance.ee.util.p702e.C13657b;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.domain.i */
public class C6313i {

    /* renamed from: a */
    public static String f17509a = null;

    /* renamed from: b */
    public static String f17510b = null;

    /* renamed from: c */
    static final /* synthetic */ boolean f17511c = true;

    /* renamed from: d */
    private C6310f f17512d;

    /* renamed from: e */
    private C6316k f17513e;

    /* renamed from: f */
    private C6305c f17514f;

    /* renamed from: g */
    private String f17515g;

    /* renamed from: h */
    private C6315j f17516h;

    /* renamed from: i */
    private boolean f17517i;

    /* renamed from: j */
    private final C68289a f17518j;

    /* renamed from: com.bytedance.ee.bear.domain.i$a */
    private static final class C6314a {

        /* renamed from: a */
        static C6313i f17519a = new C6313i(null);
    }

    /* renamed from: a */
    public static C6313i m25327a() {
        return C6314a.f17519a;
    }

    /* renamed from: e */
    public String mo25395e() {
        return this.f17515g;
    }

    /* renamed from: b */
    public String mo25387b() {
        return this.f17512d.mo25364a();
    }

    /* renamed from: c */
    public String mo25390c() {
        return this.f17512d.mo25366c();
    }

    /* renamed from: f */
    public String mo25397f() {
        return this.f17512d.mo25369f();
    }

    /* renamed from: d */
    public String mo25393d() {
        return this.f17512d.mo25370g();
    }

    private C6313i() {
        this.f17518j = new C68289a();
        try {
            m25331g();
        } catch (Exception e) {
            C13606d.m55245a("SpaceKitUrlHelper", e);
        }
    }

    /* renamed from: h */
    private void m25332h() {
        this.f17513e.mo25408a(this.f17512d.mo25378o(), this.f17512d.mo25364a());
        this.f17513e.mo25409a(this.f17512d.mo25377n(), this.f17512d.mo25375l());
    }

    /* renamed from: g */
    private void m25331g() {
        C6310f fVar = new C6310f();
        this.f17512d = fVar;
        this.f17516h = new C6315j(fVar);
        this.f17513e = new C6316k();
        this.f17514f = new C6305c(this.f17512d.mo25376m());
        String str = (String) new PersistenceSharedPreference("debug_config").mo34038b("ip_proxy", "");
        this.f17515g = str;
        if (!TextUtils.isEmpty(str)) {
            m25335n(this.f17515g);
        }
        m25332h();
        m25334m(f17509a);
        m25333l(f17510b);
        C13479a.m54764b("SpaceKitUrlHelper", "init()...mWhiteList " + this.f17513e.mo25405a().toString());
    }

    /* synthetic */ C6313i(SpaceKitUrlHelper$1 spaceKitUrlHelper$1) {
        this();
    }

    /* renamed from: e */
    public boolean mo25396e(String str) {
        return this.f17514f.mo25363a(str);
    }

    /* renamed from: n */
    private void m25335n(String str) {
        this.f17513e.mo25407a(str, this.f17512d.mo25375l());
    }

    /* renamed from: l */
    private void m25333l(String str) {
        if (TextUtils.isEmpty(str)) {
            C13479a.m54764b("SpaceKitUrlHelper", "mergeApiHost()...apiHost is null");
        } else {
            this.f17513e.mo25406a(str, this.f17512d.mo25364a());
        }
    }

    /* renamed from: g */
    public BearUrl mo25399g(String str) {
        if (mo25392c(str)) {
            BearUrl a = this.f17516h.mo25404a(str);
            C13479a.m54764b("SpaceKitUrlHelper", "parseUrl()...is suite url");
            return a;
        }
        BearUrl bearUrl = new BearUrl(str);
        C13479a.m54764b("SpaceKitUrlHelper", "parseUrl()...is not suite url");
        return bearUrl;
    }

    /* renamed from: m */
    private void m25334m(String str) {
        C13479a.m54764b("SpaceKitUrlHelper", "mergeProductHost()...productHost = " + str);
        if (TextUtils.isEmpty(str)) {
            C13479a.m54764b("SpaceKitUrlHelper", "mergeProductHost()...productHost is null");
        } else {
            this.f17513e.mo25407a(str, this.f17512d.mo25375l());
        }
    }

    /* renamed from: b */
    public void mo25388b(String str) {
        C13479a.m54764b("SpaceKitUrlHelper", "setProductHost()...productHost = " + str);
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, f17509a)) {
            C13479a.m54764b("SpaceKitUrlHelper", "setProductHost()...productHost is null or same");
            return;
        }
        f17509a = str;
        m25334m(str);
    }

    /* renamed from: d */
    public boolean mo25394d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!TextUtils.equals(parse.getHost(), "bitable.feishu.cn")) {
            return false;
        }
        return Pattern.compile("^/app(\\w{24}|\\w{19})$").matcher(parse.getPath()).find();
    }

    /* renamed from: j */
    public void mo25402j(String str) {
        C13479a.m54764b("SpaceKitUrlHelper", "addSpaceApiToWhiteList()...spaceApiConfig = " + str);
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    m25330d(jSONArray.getString(i), mo25387b());
                }
            } catch (Exception e) {
                C13479a.m54761a("SpaceKitUrlHelper", e);
            }
        }
    }

    /* renamed from: k */
    public void mo25403k(String str) {
        C13479a.m54764b("SpaceKitUrlHelper", "addDomainPoolToWhiteList()...domainPoolConfig = " + str);
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    String string = jSONArray.getString(i);
                    if (!TextUtils.isEmpty(string)) {
                        m25335n(string);
                    }
                }
            } catch (Exception e) {
                C13479a.m54761a("SpaceKitUrlHelper", e);
            }
        }
    }

    /* renamed from: o */
    private String[] m25336o(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri parse = Uri.parse(str);
        String[] strArr = new String[3];
        if (parse != null) {
            strArr[0] = parse.getScheme();
            strArr[1] = parse.getHost();
            if (parse.getPort() != -1) {
                strArr[2] = String.valueOf(parse.getPort());
            }
        }
        C13479a.m54772d("SpaceKitUrlHelper", "parseNetInfo: scheme = " + strArr[0] + ", host = " + strArr[1] + ", port = " + strArr[2]);
        return strArr;
    }

    /* renamed from: c */
    public boolean mo25392c(String str) {
        if (this.f17513e.mo25410a(str)) {
            C13479a.m54764b("SpaceKitUrlHelper", "isSuiteUrl()... in WhiteList");
            return f17511c;
        }
        if (this.f17517i) {
            int b = C8275a.m34051b(this.f17516h.mo25404a(str).mo25322a());
            if (Arrays.binarySearch(C8275a.f22381n, b) >= 0) {
                C13479a.m54764b("SpaceKitUrlHelper", "isSuiteUrl()... in path for ka, type = " + b);
                return f17511c;
            }
        }
        if (this.f17517i || !mo25394d(str)) {
            C13479a.m54764b("SpaceKitUrlHelper", "isSuiteUrl()...result = false");
            return false;
        }
        C13479a.m54764b("SpaceKitUrlHelper", "isSuiteUrl()...bitable url");
        return f17511c;
    }

    /* renamed from: f */
    public String mo25398f(String str) {
        if (TextUtils.isEmpty(str)) {
            C13479a.m54764b("SpaceKitUrlHelper", "correctProductUrl() url is empty");
            return "";
        }
        String host = Uri.parse(str).getHost();
        if (TextUtils.isEmpty(host)) {
            return str;
        }
        BearUrl a = this.f17516h.mo25404a(str);
        if (TextUtils.isEmpty(a.mo25322a()) || TextUtils.isEmpty(a.mo25325b())) {
            return str;
        }
        if (TextUtils.isEmpty(this.f17515g) && !TextUtils.isEmpty(f17509a)) {
            str = str.replace(host, f17509a);
        }
        if (!a.mo25329d().contains("share/base")) {
            return Uri.parse(str).buildUpon().path(mo25381a(a.mo25322a(), a.mo25325b())).build().toString();
        }
        return str;
    }

    /* renamed from: a */
    public void mo25383a(C10917c cVar) {
        this.f17518j.mo237937a(AbstractC68307f.m265083a(Boolean.valueOf((boolean) f17511c)).mo237985a(C11678b.m48479c()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.domain.$$Lambda$i$0fAhqLUL04mrlQtzPFTQc0wq4sU */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6313i.m25328a(BinderOnDomainCharacteristicChangeListener.this, (Boolean) obj);
            }
        }, $$Lambda$i$mRar8FYxFlhEVDzZqtpJqbF_VJM.INSTANCE));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00ac  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo25400h(java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 191
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.domain.C6313i.mo25400h(java.lang.String):java.lang.String");
    }

    /* renamed from: i */
    public String mo25401i(String str) {
        String[] o;
        String str2;
        String e = mo25395e();
        if (TextUtils.isEmpty(e) || !mo25392c(str) || (o = m25336o(e)) == null) {
            return str;
        }
        String str3 = o[0] + "://" + o[1];
        String str4 = o[2];
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        if (TextUtils.isEmpty(str4)) {
            str2 = "";
        } else {
            str2 = ":" + str4;
        }
        sb.append(str2);
        String sb2 = sb.toString();
        Uri parse = Uri.parse(str);
        if (parse == null) {
            return str;
        }
        String scheme = parse.getScheme();
        String host = parse.getHost();
        if (TextUtils.isEmpty(scheme) || TextUtils.isEmpty(host) || str.contains(str3)) {
            return str;
        }
        return str.replaceFirst(scheme + "://" + host, sb2);
    }

    /* renamed from: a */
    public void mo25384a(String str) {
        C13479a.m54764b("SpaceKitUrlHelper", "setApiHost()...apiHost = " + str);
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, f17510b)) {
            C13479a.m54764b("SpaceKitUrlHelper", "setApiHost()...apiHost is null or same");
            return;
        }
        f17510b = str;
        m25333l(str);
    }

    /* renamed from: a */
    public void mo25385a(List<String> list) {
        C13479a.m54764b("SpaceKitUrlHelper", "setHistoryDomains()...domains = " + list);
        if (!C13657b.m55421a(list)) {
            for (String str : list) {
                m25335n(str);
            }
        }
    }

    /* renamed from: a */
    public void mo25386a(boolean z) {
        this.f17517i = z;
        C13479a.m54764b("SpaceKitUrlHelper", "setPrivateKaPKG()...mIsPrivateKaPKG = " + this.f17517i);
    }

    /* renamed from: d */
    private void m25330d(String str, String str2) {
        this.f17513e.mo25406a(str, str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m25328a(BinderOnDomainCharacteristicChangeListener binderOnDomainCharacteristicChangeListener, Boolean bool) throws Exception {
        C13479a.m54764b("SpaceKitUrlHelper", "registerConfigChangeListener()...");
        ((AbstractC6307e) KoinJavaComponent.m268610a(AbstractC6307e.class)).mo17335a(binderOnDomainCharacteristicChangeListener);
    }

    /* renamed from: c */
    public void mo25391c(String str, String str2) {
        mo25388b(str);
        mo25384a(str2);
        C13479a.m54764b("SpaceKitUrlHelper", "onConfigChanged()...api domain = " + str + ", product domain = " + str2);
    }

    /* renamed from: a */
    public String mo25381a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            C13479a.m54764b("SpaceKitUrlHelper", "genProductPath()...type or token is null");
        }
        HashMap hashMap = (HashMap) this.f17512d.mo25367d();
        String str3 = (String) hashMap.get(str);
        if (TextUtils.isEmpty(str3)) {
            str3 = (String) hashMap.get("default");
        }
        if (f17511c || str3 != null) {
            return str3.replace("${type}", C8275a.m34056e(str)).replace("${token}", str2);
        }
        throw new AssertionError();
    }

    /* renamed from: b */
    public boolean mo25389b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            C13479a.m54764b("SpaceKitUrlHelper", "isSameProductUrl()...false for empty");
            return false;
        } else if (!mo25392c(str) || !mo25392c(str2)) {
            C13479a.m54764b("SpaceKitUrlHelper", "isSameProductUrl()...false for not suite url");
            return false;
        } else {
            BearUrl g = mo25399g(str);
            BearUrl g2 = mo25399g(str2);
            C13479a.m54764b("SpaceKitUrlHelper", "isSameProductUrl()...first type = " + g.f17446a + ", second type = " + g2.f17446a);
            if (!TextUtils.equals(g.f17446a, g2.f17446a) || !TextUtils.equals(g.f17447b, g2.f17447b)) {
                return false;
            }
            return f17511c;
        }
    }

    /* renamed from: a */
    public String mo25382a(String str, String str2, String str3) {
        String a = mo25381a(str, str2);
        if (a != null && a.startsWith("/")) {
            a = a.substring(1);
        }
        Uri.Builder appendEncodedPath = new Uri.Builder().scheme("https").authority(f17509a).appendEncodedPath(a);
        if (!TextUtils.isEmpty(str3)) {
            appendEncodedPath.appendQueryParameter("from", str3);
        }
        return appendEncodedPath.build().toString();
    }
}
