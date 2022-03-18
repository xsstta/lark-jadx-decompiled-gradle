package com.bytedance.ee.bear.domain;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.ee.log.C13479a;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.ee.bear.domain.k */
public class C6316k {

    /* renamed from: a */
    private final List<Pattern> f17521a = new CopyOnWriteArrayList();

    /* renamed from: b */
    private final List<String> f17522b = new CopyOnWriteArrayList();

    /* renamed from: c */
    private final String f17523c = m25369b();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<String> mo25405a() {
        return this.f17522b;
    }

    /* renamed from: b */
    private String m25369b() {
        String str = (String) new PersistenceSharedPreference("debug_config").mo34038b("ip_proxy", "");
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(":");
            if (split.length == 2) {
                return split[0];
            }
        }
        return "";
    }

    /* renamed from: a */
    public boolean mo25410a(String str) {
        int indexOf;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!parse.isHierarchical() || TextUtils.isEmpty(parse.getHost())) {
            return false;
        }
        if (TextUtils.equals(parse.getScheme(), "http") || TextUtils.equals(parse.getScheme(), "https")) {
            String encodedQuery = parse.getEncodedQuery();
            if (!TextUtils.isEmpty(encodedQuery) && (indexOf = str.indexOf(encodedQuery)) > 0 && indexOf < str.length()) {
                str = str.substring(0, indexOf);
            }
            for (Pattern pattern : this.f17521a) {
                if (pattern.matcher(str).find()) {
                    return true;
                }
            }
            if (!TextUtils.isEmpty(this.f17523c)) {
                return TextUtils.equals(parse.getHost(), this.f17523c);
            }
            return false;
        }
        C13479a.m54764b("WhiteList", "illegal schema = " + parse.getScheme());
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo25407a(String str, String[] strArr) {
        for (String str2 : strArr) {
            mo25406a(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo25408a(String[] strArr, String str) {
        for (String str2 : strArr) {
            mo25406a(str2, str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo25406a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            C13479a.m54764b("WhiteList", "mergeDomain()...empty domain");
            return;
        }
        String b = m25370b(str, str2);
        if (!TextUtils.isEmpty(b) && !this.f17522b.contains(b)) {
            this.f17522b.add(b);
            this.f17521a.add(Pattern.compile(b));
        }
    }

    /* renamed from: b */
    private synchronized String m25370b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String replace = str.replace(".", "\\.");
        if (str2 == null) {
            str2 = "";
        }
        if (str2.startsWith("/")) {
            return "(\\/|\\.)" + replace + str2;
        }
        return "(\\/|\\.)" + replace + "/" + str2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo25409a(String[] strArr, String[] strArr2) {
        for (String str : strArr) {
            for (String str2 : strArr2) {
                mo25406a(str, str2);
            }
        }
    }
}
