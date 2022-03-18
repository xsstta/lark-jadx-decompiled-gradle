package com.bytedance.ee.bear.p398i;

import com.bytedance.ee.bear.at.C4227b;
import com.bytedance.ee.bear.bean.C4517a;
import io.reactivex.functions.Function;
import java.util.Locale;

/* renamed from: com.bytedance.ee.bear.i.f */
public class C7834f implements Function<C7827a, String> {

    /* renamed from: a */
    private final boolean f21146a = C4227b.m17586a().mo16662a();

    /* renamed from: a */
    public String apply(C7827a aVar) throws Exception {
        StringBuilder sb = new StringBuilder(aVar.f21134a);
        for (int length = aVar.f21135b.length - 1; length >= 0; length--) {
            mo30615a(sb, aVar.f21135b[length]);
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo30615a(StringBuilder sb, C4517a aVar) {
        if (this.f21146a) {
            sb.replace(aVar.f13212a, aVar.f13213b, String.format(Locale.ENGLISH, "<at type=\"%d\" href=\"%s\" token=\"%s\" icon='{\"type\":%d,\"key\":\"%s\",\"fs_unit\":\"%s\"}'>%s</at>", Integer.valueOf(aVar.f13214c), aVar.f13216e, aVar.f13215d, Integer.valueOf(aVar.f13224m), aVar.f13223l, aVar.f13222k, aVar.f13217f));
            return;
        }
        sb.replace(aVar.f13212a, aVar.f13213b, String.format(Locale.ENGLISH, "<at type=\"%d\" href=\"%s\" token=\"%s\">%s</at>", Integer.valueOf(aVar.f13214c), aVar.f13216e, aVar.f13215d, aVar.f13217f));
    }
}
