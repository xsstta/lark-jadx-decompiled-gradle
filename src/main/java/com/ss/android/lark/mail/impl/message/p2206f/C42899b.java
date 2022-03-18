package com.ss.android.lark.mail.impl.message.p2206f;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.C42097j;
import com.ss.android.lark.mail.impl.message.p2204d.C42871i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.lark.mail.impl.message.f.b */
public class C42899b {

    /* renamed from: a */
    private final String f109248a = "PreSearchHandler";

    /* renamed from: b */
    private C42913g f109249b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo153916a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo153919b() {
    }

    public C42899b(C42913g gVar) {
        this.f109249b = gVar;
    }

    /* renamed from: d */
    private String m170847d(String str) {
        return str.replaceAll("<[\\s]*?span[^>]*?>", "").replaceAll("<[\\s]*?\\/[\\s]*?span[\\s]*?>", "");
    }

    /* renamed from: a */
    public String mo153914a(C42097j jVar) {
        if (jVar.mo151964g() == null) {
            return null;
        }
        return this.f109249b.mo153960a(jVar);
    }

    /* renamed from: b */
    public String mo153918b(String str) {
        return m170847d(m170846c(str));
    }

    /* renamed from: c */
    private String m170846c(String str) {
        int start;
        Matcher matcher = Pattern.compile("<[^>]*id=\"lark-mail-quote-").matcher(str);
        if (!matcher.find() || (start = matcher.start()) <= 0 || start >= str.length() - 1) {
            return str;
        }
        return str.substring(0, start);
    }

    /* renamed from: a */
    public void mo153917a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        this.f109249b.mo153972b(null, "addItemContent", str);
        Log.m165389i("PreSearchHandler", "testSearchABC sendToJs time:" + (System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: a */
    public ArrayList<C42097j> mo153915a(List<C42097j> list, List<String> list2, HashMap<String, C42903e> hashMap, String str) {
        boolean z;
        ArrayList<C42097j> arrayList = new ArrayList<>();
        C42903e eVar = new C42903e();
        eVar.mo153935b("mail_title");
        if (C42871i.m170779b()) {
            eVar.mo153932a(str);
            eVar.mo153933a(true);
        } else {
            eVar.mo153933a(false);
        }
        hashMap.put("mail_title", eVar);
        for (int i = 0; i < list.size(); i++) {
            C42097j jVar = list.get(i);
            int i2 = 0;
            while (true) {
                if (i2 >= list2.size()) {
                    z = false;
                    break;
                } else if (list2.get(i2).equals(jVar.mo151964g().mo151581b())) {
                    arrayList.add(jVar);
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            C42903e eVar2 = new C42903e();
            String b = list.get(i).mo151964g().mo151581b();
            eVar2.mo153935b(b);
            eVar2.mo153933a(z);
            hashMap.put(b, eVar2);
        }
        return arrayList;
    }
}
