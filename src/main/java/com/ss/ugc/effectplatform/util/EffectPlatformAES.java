package com.ss.ugc.effectplatform.util;

import bytekn.foundation.concurrent.SharedReference;
import bytekn.foundation.encryption.AES;
import bytekn.foundation.encryption.C1705h;
import bytekn.foundation.encryption.Hash;
import bytekn.foundation.encryption.Padding;
import bytekn.foundation.encryption.encoding.Base64;
import bytekn.foundation.io.file.ContentEncoding;
import bytekn.foundation.logger.Logger;
import bytekn.foundation.p061e.C1700b;
import com.ss.ugc.effectplatform.monitor.IMonitorReport;
import com.ss.ugc.effectplatform.p3242c.C65503a;
import com.ss.ugc.effectplatform.p3244e.C65510b;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/ss/ugc/effectplatform/util/EffectPlatformAES;", "", "()V", "TAG", "", "iMonitorReport", "Lbytekn/foundation/concurrent/SharedReference;", "Lcom/ss/ugc/effectplatform/monitor/IMonitorReport;", "getIMonitorReport", "()Lbytekn/foundation/concurrent/SharedReference;", "key", "", "getKey", "()[B", "key$delegate", "Lkotlin/Lazy;", "platformVersion", "getPlatformVersion", "()Ljava/lang/String;", "setPlatformVersion", "(Ljava/lang/String;)V", "decrypt", "content", "encrypt", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.util.h */
public final class EffectPlatformAES {

    /* renamed from: a */
    public static final EffectPlatformAES f165107a = new EffectPlatformAES();

    /* renamed from: b */
    private static String f165108b = PlatformUtil.f165131a.mo228353a();

    /* renamed from: c */
    private static final SharedReference<IMonitorReport> f165109c = new SharedReference<>(null);

    /* renamed from: d */
    private static final Lazy f165110d = LazyKt.lazy(C65552a.INSTANCE);

    /* renamed from: c */
    private final byte[] m257067c() {
        return (byte[]) f165110d.getValue();
    }

    private EffectPlatformAES() {
    }

    /* renamed from: a */
    public final String mo228307a() {
        return f165108b;
    }

    /* renamed from: b */
    public final SharedReference<IMonitorReport> mo228309b() {
        return f165109c;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.util.h$a */
    static final class C65552a extends Lambda implements Function0<byte[]> {
        public static final C65552a INSTANCE = new C65552a();

        C65552a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final byte[] invoke() {
            String a = EffectPlatformAES.f165107a.mo228307a();
            Logger bVar = Logger.f5760a;
            bVar.mo8662a("EffectPlatformAES", "initialize-->platformVersion=" + a);
            if (a != null) {
                String a2 = Hash.m7546a(C1705h.m7566a(C65503a.m256759a(a + ":android")));
                if (a2 != null) {
                    String substring = a2.substring(8, 24);
                    Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Logger bVar2 = Logger.f5760a;
                    bVar2.mo8662a("EffectPlatformAES", "md5: " + a + ":android -> " + substring);
                    return C65503a.m256759a(substring);
                }
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            throw new RuntimeException();
        }
    }

    /* renamed from: a */
    public final void mo228308a(String str) {
        f165108b = str;
    }

    /* renamed from: b */
    public final String mo228310b(String str) {
        if (str == null) {
            return null;
        }
        if (StringsKt.isBlank(str)) {
            return "";
        }
        RuntimeException runtimeException = new RuntimeException();
        try {
            return C65547b.m257044a(AES.f5771a.mo8681a(Base64.f5789a.mo8684a(str), m257067c(), m257067c(), Padding.PKCS7Padding), ContentEncoding.Utf8);
        } catch (Exception e) {
            Logger bVar = Logger.f5760a;
            bVar.mo8663a("EffectPlatformAES", "decrypt failed!, content: " + str + ", platformVersion: " + f165108b, e);
            boolean areEqual = Intrinsics.areEqual(f165108b, PlatformUtil.f165131a.mo228353a());
            IMonitorReport a = f165109c.mo8625a();
            if (a == null) {
                return null;
            }
            C65510b.m256816a(a, str, e.getMessage(), C1700b.m7522a(runtimeException), areEqual ? 1 : 0, f165108b);
            return null;
        }
    }
}
