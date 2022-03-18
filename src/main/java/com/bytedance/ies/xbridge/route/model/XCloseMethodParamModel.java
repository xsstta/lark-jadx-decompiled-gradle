package com.bytedance.ies.xbridge.route.model;

import com.bytedance.ies.xbridge.C14434d;
import com.bytedance.ies.xbridge.XReadableMap;
import com.bytedance.ies.xbridge.model.params.XBaseParamModel;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ies/xbridge/route/model/XCloseMethodParamModel;", "Lcom/bytedance/ies/xbridge/model/params/XBaseParamModel;", "()V", "animated", "", "getAnimated", "()Z", "setAnimated", "(Z)V", "containerID", "", "getContainerID", "()Ljava/lang/String;", "setContainerID", "(Ljava/lang/String;)V", "provideParamList", "", "Companion", "x-bridge-route_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.xbridge.f.b.a */
public final class XCloseMethodParamModel extends XBaseParamModel {

    /* renamed from: a */
    public static final Companion f38054a = new Companion(null);

    /* renamed from: b */
    private String f38055b;

    /* renamed from: c */
    private boolean f38056c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ies/xbridge/route/model/XCloseMethodParamModel$Companion;", "", "()V", "convert", "Lcom/bytedance/ies/xbridge/route/model/XCloseMethodParamModel;", "params", "Lcom/bytedance/ies/xbridge/XReadableMap;", "x-bridge-route_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xbridge.f.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final XCloseMethodParamModel mo53149a(XReadableMap hVar) {
            Intrinsics.checkParameterIsNotNull(hVar, "params");
            String a = C14434d.m58266a(hVar, "containerID", (String) null, 2, (Object) null);
            boolean z = false;
            boolean a2 = C14434d.m58268a(hVar, "animated", false, 2, (Object) null);
            XCloseMethodParamModel aVar = new XCloseMethodParamModel();
            if (a.length() > 0) {
                z = true;
            }
            if (z) {
                aVar.mo53146a(a);
            }
            aVar.mo53147a(a2);
            return aVar;
        }
    }

    /* renamed from: a */
    public final String mo53145a() {
        return this.f38055b;
    }

    /* renamed from: b */
    public final boolean mo53148b() {
        return this.f38056c;
    }

    /* renamed from: a */
    public final void mo53146a(String str) {
        this.f38055b = str;
    }

    /* renamed from: a */
    public final void mo53147a(boolean z) {
        this.f38056c = z;
    }
}
