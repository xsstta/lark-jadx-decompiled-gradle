package com.larksuite.framework.apiplugin.validator.p1183b;

import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.larksuite.framework.apiplugin.validator.b.b */
public class C25961b implements AbstractC25960a {
    @Override // com.larksuite.framework.apiplugin.validator.p1183b.AbstractC25960a
    /* renamed from: a */
    public boolean mo92297a(double d, double d2, boolean z) {
        if (z) {
            if (d2 <= d) {
                return true;
            }
        } else if (d2 < d) {
            return true;
        }
        return false;
    }

    @Override // com.larksuite.framework.apiplugin.validator.p1183b.AbstractC25960a
    /* renamed from: a */
    public boolean mo92298a(Object obj) {
        return obj == null;
    }

    @Override // com.larksuite.framework.apiplugin.validator.p1183b.AbstractC25960a
    /* renamed from: b */
    public boolean mo92304b(double d, double d2, boolean z) {
        if (z) {
            if (d2 >= d) {
                return true;
            }
        } else if (d2 > d) {
            return true;
        }
        return false;
    }

    @Override // com.larksuite.framework.apiplugin.validator.p1183b.AbstractC25960a
    /* renamed from: a */
    public boolean mo92299a(String str) {
        return str.isEmpty();
    }

    @Override // com.larksuite.framework.apiplugin.validator.p1183b.AbstractC25960a
    /* renamed from: a */
    public boolean mo92301a(List list) {
        return list.isEmpty();
    }

    @Override // com.larksuite.framework.apiplugin.validator.p1183b.AbstractC25960a
    /* renamed from: b */
    public boolean mo92305b(String str, String str2) {
        return str2.endsWith(str);
    }

    @Override // com.larksuite.framework.apiplugin.validator.p1183b.AbstractC25960a
    /* renamed from: c */
    public boolean mo92306c(String str, String str2) {
        if (str2 == null || str == null) {
            return true;
        }
        return Pattern.compile(str).matcher(str2).matches();
    }

    @Override // com.larksuite.framework.apiplugin.validator.p1183b.AbstractC25960a
    /* renamed from: a */
    public boolean mo92300a(String str, String str2) {
        return str2.startsWith(str);
    }

    @Override // com.larksuite.framework.apiplugin.validator.p1183b.AbstractC25960a
    /* renamed from: a */
    public boolean mo92302a(double[] dArr, double d) {
        if (dArr == null) {
            return true;
        }
        for (double d2 : dArr) {
            if (d2 == d) {
                return true;
            }
        }
        return false;
    }

    @Override // com.larksuite.framework.apiplugin.validator.p1183b.AbstractC25960a
    /* renamed from: a */
    public boolean mo92303a(String[] strArr, String str) {
        if (strArr == null) {
            return true;
        }
        for (String str2 : strArr) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
