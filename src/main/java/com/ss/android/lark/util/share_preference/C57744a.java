package com.ss.android.lark.util.share_preference;

import android.content.Context;
import com.ss.android.lark.C36888e;
import com.ss.android.lark.p2909v.C57896c;
import com.ss.android.lark.p2909v.C57898e;
import com.ss.android.lark.secure.AesCbcWithIntegrityUtils;
import com.ss.android.lark.secure.C54052a;
import com.ss.android.lark.sp.AbstractC54924a;
import com.ss.android.lark.sp.AbstractSharedPreferences;
import com.ss.android.lark.sp.C54930c;
import com.ss.android.lark.utils.C57852m;
import java.security.GeneralSecurityException;

/* renamed from: com.ss.android.lark.util.share_preference.a */
public class C57744a extends AbstractSharedPreferences {

    /* renamed from: a */
    private static volatile C57744a f142238a;

    /* renamed from: b */
    private String f142239b;

    /* renamed from: b */
    public String mo195912b() {
        return "lark";
    }

    @Override // com.ss.android.lark.sp.AbstractSharedPreferences
    public String getSpName() {
        return this.f142239b;
    }

    private C57744a() {
        setBaseSharedPreferences(m224105c());
    }

    /* renamed from: a */
    public static synchronized C57744a m224104a() {
        C57744a aVar;
        synchronized (C57744a.class) {
            if (f142238a == null) {
                f142238a = new C57744a();
            }
            aVar = f142238a;
        }
        return aVar;
    }

    /* renamed from: c */
    private AbstractC54924a m224105c() {
        AesCbcWithIntegrityUtils.C54051b bVar;
        Context a = C36888e.m145598a();
        C57896c cVar = new C57896c(a);
        this.f142239b = cVar.mo196235a(mo195912b());
        C57898e eVar = null;
        if (!C57852m.m224554a(a)) {
            try {
                bVar = C54052a.m209781a().mo185049b();
            } catch (GeneralSecurityException e) {
                e.printStackTrace();
                bVar = null;
            }
            eVar = new C57898e(a, bVar, null, this.f142239b);
        }
        return C54930c.m213002a(a, mo195912b(), 4, eVar, cVar);
    }
}
