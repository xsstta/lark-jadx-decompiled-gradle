package com.google.android.gms.location;

import android.content.Context;
import com.google.android.gms.common.api.AbstractC21631d;
import com.google.android.gms.common.api.AbstractC21641i;
import com.google.android.gms.common.api.C21611a;
import com.google.android.gms.common.api.internal.C21655b;
import com.google.android.gms.internal.location.C21915c;
import com.google.android.gms.internal.location.C21920h;
import com.google.android.gms.internal.location.C21925m;
import com.google.android.gms.internal.location.C21934v;

/* renamed from: com.google.android.gms.location.e */
public class C21949e {

    /* renamed from: a */
    public static final C21611a<Object> f53431a;

    /* renamed from: b */
    public static final AbstractC21939a f53432b = new C21934v();

    /* renamed from: c */
    public static final AbstractC21946b f53433c = new C21915c();

    /* renamed from: d */
    public static final AbstractC21953h f53434d = new C21925m();

    /* renamed from: e */
    private static final C21611a.C21623g<C21920h> f53435e;

    /* renamed from: f */
    private static final C21611a.AbstractC21612a<C21920h, Object> f53436f;

    /* renamed from: com.google.android.gms.location.e$a */
    public static abstract class AbstractC21950a<R extends AbstractC21641i> extends C21655b.AbstractC21656a<R, C21920h> {
        public AbstractC21950a(AbstractC21631d dVar) {
            super(C21949e.f53431a, dVar);
        }
    }

    static {
        C21611a.C21623g<C21920h> gVar = new C21611a.C21623g<>();
        f53435e = gVar;
        C21958m mVar = new C21958m();
        f53436f = mVar;
        f53431a = new C21611a<>("LocationServices.API", mVar, gVar);
    }

    /* renamed from: a */
    public static C21954i m79315a(Context context) {
        return new C21954i(context);
    }

    /* renamed from: b */
    public static FusedLocationProviderClient m79316b(Context context) {
        return new FusedLocationProviderClient(context);
    }
}
