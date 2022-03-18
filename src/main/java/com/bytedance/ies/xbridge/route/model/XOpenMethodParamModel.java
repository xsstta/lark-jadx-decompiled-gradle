package com.bytedance.ies.xbridge.route.model;

import com.bytedance.ies.xbridge.C14434d;
import com.bytedance.ies.xbridge.XReadableMap;
import com.bytedance.ies.xbridge.model.params.XBaseParamModel;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ies/xbridge/route/model/XOpenMethodParamModel;", "Lcom/bytedance/ies/xbridge/model/params/XBaseParamModel;", "()V", "replace", "", "getReplace", "()Z", "setReplace", "(Z)V", "schema", "", "getSchema", "()Ljava/lang/String;", "setSchema", "(Ljava/lang/String;)V", "useSysBrowser", "getUseSysBrowser", "setUseSysBrowser", "provideParamList", "", "Companion", "x-bridge-route_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.xbridge.f.b.b */
public final class XOpenMethodParamModel extends XBaseParamModel {

    /* renamed from: b */
    public static final Companion f38057b = new Companion(null);

    /* renamed from: a */
    public String f38058a;

    /* renamed from: c */
    private boolean f38059c;

    /* renamed from: d */
    private boolean f38060d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ies/xbridge/route/model/XOpenMethodParamModel$Companion;", "", "()V", "convert", "Lcom/bytedance/ies/xbridge/route/model/XOpenMethodParamModel;", "params", "Lcom/bytedance/ies/xbridge/XReadableMap;", "x-bridge-route_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xbridge.f.b.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final XOpenMethodParamModel mo53156a(XReadableMap hVar) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(hVar, "params");
            String a = C14434d.m58266a(hVar, "schema", (String) null, 2, (Object) null);
            if (a.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return null;
            }
            XOpenMethodParamModel bVar = new XOpenMethodParamModel();
            bVar.mo53151a(a);
            bVar.mo53152a(C14434d.m58268a(hVar, "replace", false, 2, (Object) null));
            bVar.mo53153b(C14434d.m58268a(hVar, "useSysBrowser", false, 2, (Object) null));
            return bVar;
        }
    }

    /* renamed from: c */
    public final boolean mo53155c() {
        return this.f38060d;
    }

    /* renamed from: b */
    public final boolean mo53154b() {
        return this.f38059c;
    }

    /* renamed from: a */
    public final String mo53150a() {
        String str = this.f38058a;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("schema");
        }
        return str;
    }

    /* renamed from: a */
    public final void mo53152a(boolean z) {
        this.f38059c = z;
    }

    /* renamed from: b */
    public final void mo53153b(boolean z) {
        this.f38060d = z;
    }

    /* renamed from: a */
    public final void mo53151a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f38058a = str;
    }
}
