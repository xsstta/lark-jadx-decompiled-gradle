package com.bytedance.ee.larkbrand.utils.sharedpreference;

import android.app.Application;
import android.content.Context;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapphost.AppbrandContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.bytedance.ee.larkbrand.utils.a.c */
public final class Sp {

    /* renamed from: a */
    public static final Companion f35236a = new Companion(null);

    /* renamed from: b */
    private final SpOperate f35237b;

    /* renamed from: c */
    private Context f35238c;

    /* renamed from: d */
    private String f35239d;

    /* renamed from: e */
    private boolean f35240e;

    /* renamed from: b */
    public static final Sp m54287b(String str) {
        return Companion.m54292a(f35236a, str, false, 2, null);
    }

    /* renamed from: com.bytedance.ee.larkbrand.utils.a.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Sp mo49645a(String str, boolean z) {
            Intrinsics.checkParameterIsNotNull(str, "name");
            AppbrandContext inst = AppbrandContext.getInst();
            Intrinsics.checkExpressionValueIsNotNull(inst, "AppbrandContext.getInst()");
            Application applicationContext = inst.getApplicationContext();
            Intrinsics.checkExpressionValueIsNotNull(applicationContext, "AppbrandContext.getInst().applicationContext");
            return new Sp(applicationContext, str, z);
        }

        /* renamed from: a */
        public static /* synthetic */ Sp m54292a(Companion aVar, String str, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return aVar.mo49645a(str, z);
        }
    }

    /* renamed from: a */
    public final Sp mo49641a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        SpOperate dVar = this.f35237b;
        AppBrandLogger.m52830i("sp", "remove  " + str + "  in file " + this.f35239d + ", crossProcess: " + this.f35240e);
        dVar.mo49623a(str);
        return this;
    }

    /* renamed from: a */
    public final boolean mo49643a(boolean z) {
        AppBrandLogger.m52830i("sp", "save in file " + this.f35239d + ", crossProcess: " + this.f35240e);
        return this.f35237b.mo49628a(z);
    }

    /* renamed from: b */
    public final <V> Sp mo49644b(String str, V v) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        SpOperate dVar = this.f35237b;
        AppBrandLogger.m52830i("sp", "put  " + str + " -> " + dVar + " in file " + this.f35239d + ", crossProcess: " + this.f35240e);
        if (v instanceof Integer) {
            dVar.mo49624a(str, v.intValue());
        } else if (v instanceof Boolean) {
            dVar.mo49627a(str, v.booleanValue());
        } else if (v instanceof String) {
            dVar.mo49626a(str, v);
        } else if (v instanceof Long) {
            dVar.mo49625a(str, v.longValue());
        } else {
            throw new UnsupportedOperationException("Unsupported type");
        }
        return this;
    }

    /* renamed from: a */
    public final <R> R mo49642a(String str, R r) {
        R r2;
        Intrinsics.checkParameterIsNotNull(str, "key");
        SpOperate dVar = this.f35237b;
        if (r instanceof Integer) {
            r2 = (R) Integer.valueOf(dVar.mo49629b(str, r.intValue()));
        } else if (r instanceof Boolean) {
            r2 = (R) Boolean.valueOf(dVar.mo49632b(str, r.booleanValue()));
        } else if (r instanceof String) {
            r2 = (R) dVar.mo49631b(str, r);
        } else if (r instanceof Long) {
            r2 = (R) Long.valueOf(dVar.mo49630b(str, r.longValue()));
        } else {
            throw new UnsupportedOperationException("Unsupported type");
        }
        AppBrandLogger.m52830i("sp", "get " + str + " -> " + ((Object) r2) + " in file " + this.f35239d + ", crossProcess: " + this.f35240e);
        return r2;
    }

    public Sp(Context context, String str, boolean z) {
        InnerProcessOperate bVar;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "name");
        this.f35238c = context;
        this.f35239d = str;
        this.f35240e = z;
        if (z) {
            bVar = new CrossProcessOperate(str);
        } else {
            bVar = new InnerProcessOperate(context, str);
        }
        this.f35237b = bVar;
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m54286a(Sp cVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return cVar.mo49643a(z);
    }
}
