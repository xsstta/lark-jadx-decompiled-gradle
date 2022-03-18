package com.bytedance.ies.xbridge.log.model;

import com.bytedance.ies.xbridge.C14434d;
import com.bytedance.ies.xbridge.XReadableMap;
import com.bytedance.ies.xbridge.model.params.XBaseParamModel;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0003\u0018\u0000 \u00182\u00020\u0001:\u0002\u0017\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0016H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/bytedance/ies/xbridge/log/model/XReportALogMethodParamModel;", "Lcom/bytedance/ies/xbridge/model/params/XBaseParamModel;", "()V", "codePosition", "Lcom/bytedance/ies/xbridge/log/model/XReportALogMethodParamModel$CodePosition;", "getCodePosition", "()Lcom/bytedance/ies/xbridge/log/model/XReportALogMethodParamModel$CodePosition;", "setCodePosition", "(Lcom/bytedance/ies/xbridge/log/model/XReportALogMethodParamModel$CodePosition;)V", "level", "", "getLevel", "()Ljava/lang/String;", "setLevel", "(Ljava/lang/String;)V", "message", "getMessage", "setMessage", "tag", "getTag", "setTag", "provideParamList", "", "CodePosition", "Companion", "x-bridge-log_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.xbridge.c.b.a */
public final class XReportALogMethodParamModel extends XBaseParamModel {

    /* renamed from: d */
    public static final Companion f38011d = new Companion(null);

    /* renamed from: a */
    public String f38012a;

    /* renamed from: b */
    public String f38013b;

    /* renamed from: c */
    public String f38014c;

    /* renamed from: f */
    private CodePosition f38015f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/bytedance/ies/xbridge/log/model/XReportALogMethodParamModel$CodePosition;", "", "file", "", "function", "line", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getFile", "()Ljava/lang/String;", "getFunction", "getLine", "()I", "x-bridge-log_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xbridge.c.b.a$a */
    public static final class CodePosition {

        /* renamed from: a */
        private final String f38016a;

        /* renamed from: b */
        private final String f38017b;

        /* renamed from: c */
        private final int f38018c;

        /* renamed from: a */
        public final String mo53073a() {
            return this.f38016a;
        }

        /* renamed from: b */
        public final String mo53074b() {
            return this.f38017b;
        }

        /* renamed from: c */
        public final int mo53075c() {
            return this.f38018c;
        }

        public CodePosition(String str, String str2, int i) {
            Intrinsics.checkParameterIsNotNull(str, "file");
            Intrinsics.checkParameterIsNotNull(str2, "function");
            this.f38016a = str;
            this.f38017b = str2;
            this.f38018c = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ies/xbridge/log/model/XReportALogMethodParamModel$Companion;", "", "()V", "convert", "Lcom/bytedance/ies/xbridge/log/model/XReportALogMethodParamModel;", "params", "Lcom/bytedance/ies/xbridge/XReadableMap;", "x-bridge-log_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xbridge.c.b.a$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final XReportALogMethodParamModel mo53076a(XReadableMap hVar) {
            boolean z;
            boolean z2;
            String str;
            Intrinsics.checkParameterIsNotNull(hVar, "params");
            String a = C14434d.m58266a(hVar, "level", (String) null, 2, (Object) null);
            boolean z3 = true;
            int i = 0;
            if (a.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return null;
            }
            String a2 = C14434d.m58266a(hVar, "message", (String) null, 2, (Object) null);
            if (a2.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return null;
            }
            String a3 = C14434d.m58266a(hVar, "tag", (String) null, 2, (Object) null);
            if (a3.length() != 0) {
                z3 = false;
            }
            if (z3) {
                return null;
            }
            XReadableMap a4 = C14434d.m58264a(hVar, "codePosition", (XReadableMap) null, 2, (Object) null);
            String str2 = "";
            if (a4 != null) {
                i = C14434d.m58260a(a4, "line", 0, 2, (Object) null);
                str2 = C14434d.m58266a(a4, "function", (String) null, 2, (Object) null);
                str = C14434d.m58266a(a4, "file", (String) null, 2, (Object) null);
            } else {
                str = str2;
            }
            CodePosition aVar = new CodePosition(str, str2, i);
            XReportALogMethodParamModel aVar2 = new XReportALogMethodParamModel();
            aVar2.mo53067a(a);
            aVar2.mo53069b(a2);
            aVar2.mo53071c(a3);
            aVar2.mo53066a(aVar);
            return aVar2;
        }
    }

    /* renamed from: d */
    public final CodePosition mo53072d() {
        return this.f38015f;
    }

    /* renamed from: a */
    public final String mo53065a() {
        String str = this.f38012a;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("level");
        }
        return str;
    }

    /* renamed from: b */
    public final String mo53068b() {
        String str = this.f38013b;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("message");
        }
        return str;
    }

    /* renamed from: c */
    public final String mo53070c() {
        String str = this.f38014c;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tag");
        }
        return str;
    }

    /* renamed from: a */
    public final void mo53066a(CodePosition aVar) {
        this.f38015f = aVar;
    }

    /* renamed from: a */
    public final void mo53067a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f38012a = str;
    }

    /* renamed from: b */
    public final void mo53069b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f38013b = str;
    }

    /* renamed from: c */
    public final void mo53071c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f38014c = str;
    }
}
