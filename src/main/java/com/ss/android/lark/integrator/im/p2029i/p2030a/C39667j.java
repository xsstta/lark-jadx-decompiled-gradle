package com.ss.android.lark.integrator.im.p2029i.p2030a;

import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.feed.C37262a;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;

/* renamed from: com.ss.android.lark.integrator.im.i.a.j */
public class C39667j implements AbstractC38037a.AbstractC38052l {
    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38052l
    /* renamed from: a */
    public boolean mo139256a(String str) {
        Boolean bool = C37262a.m146727o().get(str);
        if (bool == null) {
            bool = false;
        }
        return C37239a.m146648b().mo136952a(str, bool.booleanValue());
    }
}
