package com.ss.android.lark.searchcommon.utils;

import java.io.Serializable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \f2\u00020\u00012\u00020\u0002:\u0001\fB\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u0017\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0000H\u0016J\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/searchcommon/utils/ImprId;", "Ljava/io/Serializable;", "", "()V", "session", "", "seq", "", "(Ljava/lang/String;I)V", "clone", "imprId", "nextImprId", "Companion", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ImprId implements Serializable, Cloneable {
    public static final Companion Companion = new Companion(null);
    private int seq;
    private String session = "";

    @JvmStatic
    public static final ImprId fromString(String str) {
        return Companion.mo184558a(str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/searchcommon/utils/ImprId$Companion;", "", "()V", "fromString", "Lcom/ss/android/lark/searchcommon/utils/ImprId;", "imprId", "", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.utils.ImprId$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final ImprId mo184558a(String str) {
            if (str != null) {
                try {
                    int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str, '_', 0, false, 6, (Object) null);
                    String substring = str.substring(0, lastIndexOf$default);
                    Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    String substring2 = str.substring(lastIndexOf$default + 1);
                    Intrinsics.checkExpressionValueIsNotNull(substring2, "(this as java.lang.String).substring(startIndex)");
                    return new ImprId(substring, Integer.parseInt(substring2));
                } catch (Exception unused) {
                }
            }
            return new ImprId();
        }
    }

    public final String nextImprId() {
        this.seq++;
        return imprId();
    }

    @Override // java.lang.Object
    public ImprId clone() {
        Object clone = super.clone();
        if (clone != null) {
            return (ImprId) clone;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.searchcommon.utils.ImprId");
    }

    public final String imprId() {
        return this.session + '_' + this.seq;
    }

    public ImprId() {
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        sb.append('_');
        sb.append(UUID.randomUUID());
        this.session = sb.toString();
        this.seq = 0;
    }

    public ImprId(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "session");
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        sb.append('_');
        sb.append(UUID.randomUUID());
        this.session = sb.toString();
        this.seq = 0;
        this.session = str;
        this.seq = i;
    }
}
