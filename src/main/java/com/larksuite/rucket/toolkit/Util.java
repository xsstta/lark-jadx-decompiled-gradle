package com.larksuite.rucket.toolkit;

import com.squareup.wire.ProtoAdapter;
import com.ss.android.lark.sdk.SdkSender;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0007¨\u0006\b"}, d2 = {"Lcom/larksuite/rucket/toolkit/Util;", "", "()V", "generateParser", "Lcom/ss/android/lark/sdk/SdkSender$IParser;", "T", "clazz", "Ljava/lang/Class;", "rucket_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.rucket.a.a */
public final class Util {

    /* renamed from: a */
    public static final Util f64970a = new Util();

    private Util() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u0001H\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "T", "kotlin.jvm.PlatformType", "bytes", "", "parse", "([B)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.rucket.a.a$a */
    static final class C26327a<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        final /* synthetic */ Class f64971a;

        C26327a(Class cls) {
            this.f64971a = cls;
        }

        @Override // com.ss.android.lark.sdk.SdkSender.IParser
        public final T parse(byte[] bArr) {
            return (T) ProtoAdapter.get(this.f64971a).decode(bArr);
        }
    }

    /* renamed from: a */
    public final <T> SdkSender.IParser<T> mo93446a(Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        return new C26327a(cls);
    }
}
