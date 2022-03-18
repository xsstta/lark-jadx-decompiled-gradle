package com.ss.android.lark.passport.infra.widget.dividetext;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.lark.passport.infra.widget.dividetext.a */
public class C49270a {

    /* renamed from: a */
    static String f123673a = "[^{\\D+}$]";

    /* renamed from: b */
    static Pattern f123674b = Pattern.compile("[^{\\D+}$]");

    /* renamed from: c */
    private int f123675c;

    /* renamed from: d */
    private int f123676d;

    /* renamed from: e */
    private List<Integer> f123677e;

    /* renamed from: f */
    private String f123678f;

    /* renamed from: a */
    public int mo171841a() {
        return this.f123675c;
    }

    /* renamed from: b */
    public List<Integer> mo171842b() {
        return this.f123677e;
    }

    /* renamed from: a */
    private int m194159a(List<Integer> list) {
        int i = 0;
        for (Integer num : list) {
            i += num.intValue();
        }
        return i;
    }

    public C49270a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f123678f = str;
            List<Integer> a = m194160a(str);
            this.f123675c = m194159a(a);
            this.f123677e = m194161b(a);
            this.f123676d = (this.f123675c + a.size()) - 1;
        }
    }

    /* renamed from: a */
    private List<Integer> m194160a(String str) {
        Matcher matcher = f123674b.matcher(str);
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            arrayList.add(Integer.valueOf(Integer.parseInt(matcher.group())));
        }
        return arrayList;
    }

    /* renamed from: b */
    private List<Integer> m194161b(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            int i2 = 0;
            for (int i3 = 0; i3 <= i; i3++) {
                i2 += list.get(i3).intValue();
            }
            arrayList.add(Integer.valueOf(i2 + i));
        }
        return arrayList;
    }
}
