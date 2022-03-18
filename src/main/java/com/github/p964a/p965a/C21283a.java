package com.github.p964a.p965a;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.p3487a.p3489b.C69736a;
import org.p3487a.p3489b.C69740c;

/* access modifiers changed from: package-private */
/* renamed from: com.github.a.a.a */
public final class C21283a {

    /* renamed from: a */
    static final C21284a f51821a = new C21284a();

    /* access modifiers changed from: package-private */
    /* renamed from: com.github.a.a.a$a */
    public static final class C21284a implements Comparator<C69736a> {
        C21284a() {
        }

        /* renamed from: a */
        public int compare(C69736a aVar, C69736a aVar2) {
            if (aVar.mo244632a() == aVar2.mo244632a()) {
                if (aVar.mo244634c() < aVar2.mo244634c()) {
                    return 1;
                }
                if (aVar.mo244634c() == aVar2.mo244634c()) {
                    return 0;
                }
                return -1;
            } else if (aVar.mo244632a() < aVar2.mo244632a()) {
                return -1;
            } else {
                if (aVar.mo244632a() == aVar2.mo244632a()) {
                    return 0;
                }
                return 1;
            }
        }
    }

    /* renamed from: a */
    static String[] m77120a(String str, List<AbstractC21290g> list) {
        if (list != null) {
            for (AbstractC21290g gVar : list) {
                if (!(gVar == null || gVar.mo72374a() == null || !gVar.mo72374a().contains(str))) {
                    return gVar.mo72375a(str);
                }
            }
        }
        throw new IllegalArgumentException("No pinyin dict contains word: " + str);
    }

    /* renamed from: a */
    static String m77119a(String str, C69740c cVar, List<AbstractC21290g> list, String str2, AbstractC21291h hVar) {
        if (str == null || str.length() == 0) {
            return str;
        }
        if (cVar == null || hVar == null) {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < str.length(); i++) {
                stringBuffer.append(C21285b.m77122a(str.charAt(i)));
                if (i != str.length() - 1) {
                    stringBuffer.append(str2);
                }
            }
            return stringBuffer.toString();
        }
        List<C69736a> a = hVar.mo72376a(cVar.mo244658a(str));
        Collections.sort(a, f51821a);
        StringBuffer stringBuffer2 = new StringBuffer();
        int i2 = 0;
        int i3 = 0;
        while (i2 < str.length()) {
            if (i3 >= a.size() || i2 != a.get(i3).mo244632a()) {
                stringBuffer2.append(C21285b.m77122a(str.charAt(i2)));
                i2++;
            } else {
                String[] a2 = m77120a(a.get(i3).mo244652d(), list);
                for (int i4 = 0; i4 < a2.length; i4++) {
                    stringBuffer2.append(a2[i4].toUpperCase());
                    if (i4 != a2.length - 1) {
                        stringBuffer2.append(str2);
                    }
                }
                i2 += a.get(i3).mo244634c();
                i3++;
            }
            if (i2 != str.length()) {
                stringBuffer2.append(str2);
            }
        }
        return stringBuffer2.toString();
    }
}
