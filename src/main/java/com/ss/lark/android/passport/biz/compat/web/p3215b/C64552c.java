package com.ss.lark.android.passport.biz.compat.web.p3215b;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.lark.android.passport.biz.compat.web.b.c */
public class C64552c {

    /* renamed from: a */
    private List<AbstractC64550a> f162962a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public void mo223262a(AbstractC64550a... aVarArr) {
        if (aVarArr != null) {
            Collections.addAll(this.f162962a, aVarArr);
        }
    }

    public C64552c(AbstractC64550a... aVarArr) {
        mo223262a(aVarArr);
    }

    /* renamed from: a */
    public void mo223261a(String str) {
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            for (AbstractC64550a aVar : this.f162962a) {
                aVar.mo223259a(parse);
            }
        }
    }
}
