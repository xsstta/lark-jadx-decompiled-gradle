package com.ss.ugc.effectplatform.model;

import bytekn.foundation.io.file.FileManager;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.ugc.effectplatform.util.ModelNameProcessor;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003J\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003J\u0006\u0010\u0014\u001a\u00020\u0010J\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u0003J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u0003J\u000e\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0003J\b\u0010\u001b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/ugc/effectplatform/model/LocalModelInfo;", "", "filePath", "", "(Ljava/lang/String;)V", "builtIn", "", "getBuiltIn", "()Z", "setBuiltIn", "(Z)V", "getFilePath", "()Ljava/lang/String;", "md5", "name", "size", "", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "getMD5", "getName", "getSize", "getVersion", "setMD5", "", "setName", "setSize", "setVersion", "toString", "Companion", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.model.e */
public final class LocalModelInfo {

    /* renamed from: a */
    public static final Companion f164948a = new Companion(null);

    /* renamed from: b */
    private String f164949b;

    /* renamed from: c */
    private String f164950c;

    /* renamed from: d */
    private String f164951d;

    /* renamed from: e */
    private int f164952e;

    /* renamed from: f */
    private boolean f164953f;

    /* renamed from: g */
    private final String f164954g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¨\u0006\t"}, d2 = {"Lcom/ss/ugc/effectplatform/model/LocalModelInfo$Companion;", "", "()V", "fromFile", "Lcom/ss/ugc/effectplatform/model/LocalModelInfo;", "filePath", "", "getVersionOfModel", "sourceStr", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.model.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final LocalModelInfo mo227935a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "filePath");
            return new LocalModelInfo(str, null);
        }

        /* renamed from: b */
        public final String mo227936b(String str) {
            int i;
            String str2 = str;
            StringsKt.lastIndexOf$default((CharSequence) str2, "/", 0, false, 6, (Object) null);
            int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str2, "_v", 0, false, 6, (Object) null);
            if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "size", false, 2, (Object) null)) {
                i = StringsKt.lastIndexOf$default((CharSequence) str2, "_size", 0, false, 6, (Object) null);
            } else {
                i = StringsKt.lastIndexOf$default((CharSequence) str2, "_model", 0, false, 6, (Object) null);
            }
            if (lastIndexOf$default <= 0) {
                return "1.0";
            }
            int i2 = lastIndexOf$default + 2;
            if (str != null) {
                String substring = str.substring(i2, i);
                Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                return StringsKt.replace$default(substring, '_', '.', false, 4, (Object) null);
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
    }

    /* renamed from: f */
    public final String mo227933f() {
        return this.f164954g;
    }

    /* renamed from: a */
    public final boolean mo227926a() {
        return this.f164953f;
    }

    /* renamed from: b */
    public final String mo227927b() {
        boolean z;
        String d;
        String str = this.f164949b;
        if (str == null || StringsKt.isBlank(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z && (d = FileManager.f5817a.mo8726d(this.f164954g)) != null) {
            this.f164949b = ModelNameProcessor.f165128a.mo228346a(d);
        }
        return this.f164949b;
    }

    /* renamed from: c */
    public final String mo227929c() {
        boolean z;
        String d;
        String str = this.f164950c;
        if (str == null || StringsKt.isBlank(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z && (d = FileManager.f5817a.mo8726d(this.f164954g)) != null) {
            this.f164950c = f164948a.mo227936b(d);
        }
        return this.f164950c;
    }

    /* renamed from: d */
    public final int mo227931d() {
        String d;
        if (this.f164952e == -1) {
            int i = 0;
            if (FileManager.f5817a.mo8730f(this.f164954g) && (d = FileManager.f5817a.mo8726d(this.f164954g)) != null) {
                i = ModelNameProcessor.f165128a.mo228349c(d);
            }
            this.f164952e = i;
        }
        return this.f164952e;
    }

    /* renamed from: e */
    public final String mo227932e() {
        boolean z;
        String d;
        String str = this.f164951d;
        if (str == null || StringsKt.isBlank(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z && (d = FileManager.f5817a.mo8726d(this.f164954g)) != null) {
            this.f164951d = ModelNameProcessor.f165128a.mo228350d(d);
        }
        return this.f164951d;
    }

    public String toString() {
        return "LocalModelInfo{name=" + mo227927b() + '\'' + ",version=" + mo227929c() + '\'' + ",size=" + mo227931d() + '\'' + '}';
    }

    /* renamed from: a */
    public final void mo227923a(int i) {
        this.f164952e = i;
    }

    /* renamed from: a */
    public final void mo227924a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        this.f164949b = str;
    }

    /* renamed from: b */
    public final void mo227928b(String str) {
        Intrinsics.checkParameterIsNotNull(str, HiAnalyticsConstant.HaKey.BI_KEY_VERSION);
        this.f164950c = str;
    }

    /* renamed from: c */
    public final void mo227930c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "md5");
        this.f164951d = str;
    }

    private LocalModelInfo(String str) {
        this.f164954g = str;
        this.f164952e = -1;
    }

    /* renamed from: a */
    public final void mo227925a(boolean z) {
        this.f164953f = z;
    }

    public /* synthetic */ LocalModelInfo(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
