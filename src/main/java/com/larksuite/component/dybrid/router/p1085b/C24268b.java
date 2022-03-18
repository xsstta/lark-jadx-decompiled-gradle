package com.larksuite.component.dybrid.router.p1085b;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.larksuite.component.dybrid.router.p1088e.C24274a;
import java.util.Set;

/* renamed from: com.larksuite.component.dybrid.router.b.b */
public class C24268b extends C24269c {
    @Override // com.larksuite.component.dybrid.router.p1085b.C24269c
    /* renamed from: a */
    public void mo86902a(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(mo86903a())) {
                super.mo86902a(str);
                return;
            }
            Uri parse = Uri.parse(mo86903a());
            Uri parse2 = Uri.parse(str);
            if (!(parse.isOpaque() || parse2.isOpaque())) {
                Uri.Builder buildUpon = parse2.buildUpon();
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                Set<String> queryParameterNames2 = parse2.getQueryParameterNames();
                for (String str2 : queryParameterNames) {
                    if (!queryParameterNames2.contains(str2)) {
                        buildUpon.appendQueryParameter(str2, C24274a.m88627a(parse, str2));
                    }
                }
                super.mo86902a(buildUpon.build().toString());
            }
        }
    }

    public C24268b(String str, Bundle bundle) {
        super(str, bundle);
    }
}
