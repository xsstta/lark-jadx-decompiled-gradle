package com.tt.miniapp.ttapkgdecoder;

import android.text.TextUtils;
import com.tt.miniapp.ttapkgdecoder.utils.C66985a;
import java.util.Locale;

/* renamed from: com.tt.miniapp.ttapkgdecoder.a */
public class C66974a {
    /* renamed from: a */
    public static AbstractC66979b m261056a() {
        return new AbstractC66979b() {
            /* class com.tt.miniapp.ttapkgdecoder.C66974a.C669751 */

            @Override // com.tt.miniapp.ttapkgdecoder.AbstractC66979b
            /* renamed from: a */
            public boolean mo233005a(String str) {
                C66985a.C66986a a;
                if (TextUtils.isEmpty(str) || (a = C66985a.m261092a(str)) == null) {
                    return false;
                }
                if (C66985a.m261096b(a.f168920a) || C66985a.m261095a(a.f168920a)) {
                    return true;
                }
                return false;
            }
        };
    }

    /* renamed from: b */
    public static AbstractC66979b m261058b() {
        return new AbstractC66979b() {
            /* class com.tt.miniapp.ttapkgdecoder.C66974a.C669762 */

            @Override // com.tt.miniapp.ttapkgdecoder.AbstractC66979b
            /* renamed from: a */
            public boolean mo233005a(String str) {
                int lastIndexOf;
                if (TextUtils.isEmpty(str) || (lastIndexOf = str.lastIndexOf(46)) < 0) {
                    return false;
                }
                return "ZIP".equals(str.substring(lastIndexOf + 1).toUpperCase(Locale.ROOT));
            }
        };
    }

    /* renamed from: a */
    public static AbstractC66979b m261057a(final AbstractC66979b... bVarArr) {
        return new AbstractC66979b() {
            /* class com.tt.miniapp.ttapkgdecoder.C66974a.C669773 */

            @Override // com.tt.miniapp.ttapkgdecoder.AbstractC66979b
            /* renamed from: a */
            public boolean mo233005a(String str) {
                AbstractC66979b[] bVarArr = bVarArr;
                for (AbstractC66979b bVar : bVarArr) {
                    if (bVar != null && bVar.mo233005a(str)) {
                        return true;
                    }
                }
                return false;
            }
        };
    }
}
