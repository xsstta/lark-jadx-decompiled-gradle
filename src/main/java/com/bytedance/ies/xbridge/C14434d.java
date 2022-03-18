package com.bytedance.ies.xbridge;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.bytedance.ies.xbridge.d */
public final class C14434d {
    /* renamed from: a */
    public static /* synthetic */ String m58266a(XReadableMap hVar, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        return m58265a(hVar, str, str2);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m58268a(XReadableMap hVar, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m58267a(hVar, str, z);
    }

    /* renamed from: a */
    public static final boolean m58267a(XReadableMap hVar, String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(hVar, "$this$optBoolean");
        Intrinsics.checkParameterIsNotNull(str, "name");
        if (!hVar.mo53101a(str)) {
            return z;
        }
        XDynamic i = hVar.mo53110i(str);
        return i.mo53082a() == XReadableType.Boolean ? i.mo53083b() : z;
    }

    /* renamed from: a */
    public static final double m58258a(XReadableMap hVar, String str, double d) {
        Intrinsics.checkParameterIsNotNull(hVar, "$this$optDouble");
        Intrinsics.checkParameterIsNotNull(str, "name");
        if (!hVar.mo53101a(str)) {
            return d;
        }
        XDynamic i = hVar.mo53110i(str);
        if (i.mo53082a() == XReadableType.Number) {
            return i.mo53084c();
        }
        return d;
    }

    /* renamed from: a */
    public static final int m58259a(XReadableMap hVar, String str, int i) {
        Intrinsics.checkParameterIsNotNull(hVar, "$this$optInt");
        Intrinsics.checkParameterIsNotNull(str, "name");
        if (!hVar.mo53101a(str)) {
            return i;
        }
        XDynamic i2 = hVar.mo53110i(str);
        if (i2.mo53082a() == XReadableType.Int) {
            return i2.mo53085d();
        }
        return i;
    }

    /* renamed from: a */
    public static final XReadableArray m58261a(XReadableMap hVar, String str, XReadableArray gVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "$this$optArray");
        Intrinsics.checkParameterIsNotNull(str, "name");
        if (!hVar.mo53101a(str)) {
            return gVar;
        }
        XDynamic i = hVar.mo53110i(str);
        if (i.mo53082a() == XReadableType.Array) {
            return i.mo53087f();
        }
        return gVar;
    }

    /* renamed from: a */
    public static final XReadableMap m58263a(XReadableMap hVar, String str, XReadableMap hVar2) {
        Intrinsics.checkParameterIsNotNull(hVar, "$this$optMap");
        Intrinsics.checkParameterIsNotNull(str, "name");
        if (!hVar.mo53101a(str)) {
            return hVar2;
        }
        XDynamic i = hVar.mo53110i(str);
        if (i.mo53082a() == XReadableType.Map) {
            return i.mo53088g();
        }
        return hVar2;
    }

    /* renamed from: a */
    public static final String m58265a(XReadableMap hVar, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(hVar, "$this$optString");
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(str2, "defaultValue");
        if (!hVar.mo53101a(str)) {
            return str2;
        }
        XDynamic i = hVar.mo53110i(str);
        if (i.mo53082a() == XReadableType.String) {
            return i.mo53086e();
        }
        return str2;
    }

    /* renamed from: a */
    public static /* synthetic */ int m58260a(XReadableMap hVar, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return m58259a(hVar, str, i);
    }

    /* renamed from: a */
    public static /* synthetic */ XReadableArray m58262a(XReadableMap hVar, String str, XReadableArray gVar, int i, Object obj) {
        if ((i & 2) != 0) {
            gVar = null;
        }
        return m58261a(hVar, str, gVar);
    }

    /* renamed from: a */
    public static /* synthetic */ XReadableMap m58264a(XReadableMap hVar, String str, XReadableMap hVar2, int i, Object obj) {
        if ((i & 2) != 0) {
            hVar2 = null;
        }
        return m58263a(hVar, str, hVar2);
    }
}
