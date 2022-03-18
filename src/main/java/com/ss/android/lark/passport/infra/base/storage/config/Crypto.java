package com.ss.android.lark.passport.infra.base.storage.config;

import android.util.Base64;
import java.security.MessageDigest;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/storage/config/Crypto;", "", "decrypt", "", "cipherText", "encrypt", "clearText", "Companion", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.base.c.a.b */
public interface Crypto {

    /* renamed from: a */
    public static final Companion f123131a = Companion.f123132a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/storage/config/Crypto$Companion;", "", "()V", "KEY_SHA_CRYPTOR", "Lcom/ss/android/lark/passport/infra/base/storage/config/Crypto;", "getKEY_SHA_CRYPTOR", "()Lcom/ss/android/lark/passport/infra/base/storage/config/Crypto;", "NULL", "getNULL", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.base.c.a.b$a */
    public static final class Companion {

        /* renamed from: a */
        static final /* synthetic */ Companion f123132a = new Companion();

        /* renamed from: b */
        private static final Crypto f123133b = new C49046b();

        /* renamed from: c */
        private static final Crypto f123134c = new C49045a();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/passport/infra/base/storage/config/Crypto$Companion$KEY_SHA_CRYPTOR$1", "Lcom/ss/android/lark/passport/infra/base/storage/config/Crypto;", "decrypt", "", "cipherText", "encrypt", "clearText", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.passport.infra.base.c.a.b$a$a */
        public static final class C49045a implements Crypto {
            @Override // com.ss.android.lark.passport.infra.base.storage.config.Crypto
            /* renamed from: b */
            public String mo171232b(String str) {
                Intrinsics.checkParameterIsNotNull(str, "cipherText");
                return str;
            }

            C49045a() {
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: java.lang.Object */
            /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: java.lang.Object */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ss.android.lark.passport.infra.base.storage.config.Crypto
            /* renamed from: a */
            public String mo171231a(String str) {
                String str2;
                Intrinsics.checkParameterIsNotNull(str, "clearText");
                try {
                    Result.Companion aVar = Result.Companion;
                    C49045a aVar2 = this;
                    MessageDigest instance = MessageDigest.getInstance("SHA-256");
                    byte[] bytes = str.getBytes(Charsets.f173341a);
                    Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
                    instance.update(bytes, 0, bytes.length);
                    str2 = Result.m271569constructorimpl(Base64.encodeToString(instance.digest(), 2));
                } catch (Throwable th) {
                    Result.Companion aVar3 = Result.Companion;
                    str2 = Result.m271569constructorimpl(C69097g.m265890a(th));
                }
                if (Result.m271572exceptionOrNullimpl(str2) == null) {
                    str = str2;
                }
                Intrinsics.checkExpressionValueIsNotNull(str, "runCatching {\n          …}.getOrElse { clearText }");
                return str;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/passport/infra/base/storage/config/Crypto$Companion$NULL$1", "Lcom/ss/android/lark/passport/infra/base/storage/config/Crypto;", "decrypt", "", "cipherText", "encrypt", "clearText", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.passport.infra.base.c.a.b$a$b */
        public static final class C49046b implements Crypto {
            @Override // com.ss.android.lark.passport.infra.base.storage.config.Crypto
            /* renamed from: a */
            public String mo171231a(String str) {
                Intrinsics.checkParameterIsNotNull(str, "clearText");
                return str;
            }

            @Override // com.ss.android.lark.passport.infra.base.storage.config.Crypto
            /* renamed from: b */
            public String mo171232b(String str) {
                Intrinsics.checkParameterIsNotNull(str, "cipherText");
                return str;
            }

            C49046b() {
            }
        }

        private Companion() {
        }

        /* renamed from: a */
        public final Crypto mo171233a() {
            return f123133b;
        }
    }

    /* renamed from: a */
    String mo171231a(String str);

    /* renamed from: b */
    String mo171232b(String str);
}
