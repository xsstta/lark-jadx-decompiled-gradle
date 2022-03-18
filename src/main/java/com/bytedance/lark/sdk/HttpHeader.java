package com.bytedance.lark.sdk;

import android.text.TextUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/bytedance/lark/sdk/HttpHeader;", "", "name", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "<set-?>", "getName", "()Ljava/lang/String;", "getValue", "Companion", "rust-jvm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.lark.sdk.b */
public final class HttpHeader {

    /* renamed from: c */
    public static final Companion f48387c = new Companion(null);

    /* renamed from: a */
    public String f48388a = "";

    /* renamed from: b */
    public String f48389b = "";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¨\u0006\t"}, d2 = {"Lcom/bytedance/lark/sdk/HttpHeader$Companion;", "", "()V", "getValue", "", "name", "headers", "", "Lcom/bytedance/lark/sdk/HttpHeader;", "rust-jvm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.lark.sdk.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String mo67177a(String str, List<HttpHeader> list) {
            Intrinsics.checkParameterIsNotNull(str, "name");
            Intrinsics.checkParameterIsNotNull(list, "headers");
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            for (HttpHeader bVar : list) {
                String a = bVar.mo67175a();
                if (a != null) {
                    String lowerCase = a.toLowerCase();
                    Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
                    String lowerCase2 = str.toLowerCase();
                    Intrinsics.checkExpressionValueIsNotNull(lowerCase2, "(this as java.lang.String).toLowerCase()");
                    if (TextUtils.equals(lowerCase, lowerCase2)) {
                        return bVar.mo67176b();
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            }
            return "";
        }
    }

    /* renamed from: a */
    public final String mo67175a() {
        return this.f48388a;
    }

    /* renamed from: b */
    public final String mo67176b() {
        return this.f48389b;
    }

    public HttpHeader(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(str2, "value");
        this.f48388a = str;
        this.f48389b = str2;
    }
}
