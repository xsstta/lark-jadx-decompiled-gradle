package com.ss.sys.ces.p3236g;

import android.content.Context;
import com.ss.sys.ces.C65386a;
import java.util.concurrent.TimeUnit;
import p001a.p002a.p003a.p004a.C0000a;
import p001a.p002a.p003a.p005b.C0030c;

/* renamed from: com.ss.sys.ces.g.d */
public class C65405d extends AbstractC65402a {

    /* renamed from: f */
    private static final C0000a.C0003c f164673f = new C0000a.C0003c(2, TimeUnit.MINUTES, 2);

    /* renamed from: e */
    private Context f164674e;

    public C65405d(Context context) {
        super(2, f164673f);
        this.f164674e = context;
    }

    /* renamed from: a */
    public static boolean m256489a(Context context) {
        return AbstractC65402a.m256483a(context, null, 224);
    }

    @Override // p001a.p002a.p003a.p004a.C0000a.AbstractC0004d
    /* renamed from: a */
    public int mo12a(C0000a.C0006f fVar) {
        byte[] bArr;
        if (fVar == null || fVar.f25a != 200 || (bArr = fVar.f26b) == null) {
            return 2;
        }
        try {
            String str = (String) C65386a.metas(225, this.f164674e, bArr);
            return (str == null || !str.equals("AYE")) ? 1 : 0;
        } catch (Throwable th) {
            C0030c.m49a(th);
            return 1;
        }
    }
}
