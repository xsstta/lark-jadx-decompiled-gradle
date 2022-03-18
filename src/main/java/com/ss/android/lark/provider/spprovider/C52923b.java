package com.ss.android.lark.provider.spprovider;

import android.content.Context;
import com.ss.android.lark.C36888e;
import com.ss.android.lark.p2909v.C57896c;
import com.ss.android.lark.p2909v.C57898e;
import com.ss.android.lark.secure.AesCbcWithIntegrityUtils;
import com.ss.android.lark.secure.C54052a;
import com.ss.android.lark.sp.AbstractC54924a;
import com.ss.android.lark.sp.AbstractSharedPreferences;
import com.ss.android.lark.sp.p2686a.C54926b;
import com.ss.android.lark.utils.C57852m;
import java.security.GeneralSecurityException;

/* renamed from: com.ss.android.lark.provider.spprovider.b */
public class C52923b extends AbstractSharedPreferences {

    /* renamed from: a */
    private static volatile C52923b f130773a;

    /* renamed from: b */
    private String f130774b;

    /* renamed from: b */
    public String mo180826b() {
        return "lark";
    }

    @Override // com.ss.android.lark.sp.AbstractSharedPreferences
    public String getSpName() {
        return this.f130774b;
    }

    private C52923b() {
        setBaseSharedPreferences(m204884c());
    }

    /* renamed from: a */
    public static synchronized C52923b m204883a() {
        C52923b bVar;
        synchronized (C52923b.class) {
            if (f130773a == null) {
                f130773a = new C52923b();
            }
            bVar = f130773a;
        }
        return bVar;
    }

    /* renamed from: c */
    private AbstractC54924a m204884c() {
        C57898e eVar;
        AesCbcWithIntegrityUtils.C54051b bVar;
        Context a = C36888e.m145598a();
        C57896c cVar = new C57896c(a);
        this.f130774b = cVar.mo196235a(mo180826b());
        if (!C57852m.m224554a(a)) {
            try {
                bVar = C54052a.m209781a().mo185049b();
            } catch (GeneralSecurityException e) {
                e.printStackTrace();
                bVar = null;
            }
            eVar = new C57898e(a, bVar, null, this.f130774b);
        } else {
            eVar = null;
        }
        return new C54926b().mo187323a(a, mo180826b(), 0, eVar, cVar);
    }
}
