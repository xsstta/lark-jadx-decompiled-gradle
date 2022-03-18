package com.larksuite.component.dybrid.router.p1085b;

import android.net.Uri;
import android.os.Bundle;
import com.larksuite.component.dybrid.router.p1088e.C24274a;

/* renamed from: com.larksuite.component.dybrid.router.b.a */
public class C24267a extends C24269c {
    @Override // com.larksuite.component.dybrid.router.p1085b.C24269c
    /* renamed from: a */
    public void mo86902a(String str) {
        Uri parse = Uri.parse(str);
        if (parse != null && !parse.isOpaque()) {
            for (String str2 : parse.getQueryParameterNames()) {
                mo86904b().putString(str2, C24274a.m88627a(parse, str2));
            }
        }
        super.mo86902a(C24274a.m88628a(str));
    }

    public C24267a(String str, Bundle bundle) {
        super(str, bundle);
        mo86902a(str);
    }
}
