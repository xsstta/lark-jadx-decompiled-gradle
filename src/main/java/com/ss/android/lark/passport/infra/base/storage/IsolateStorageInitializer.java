package com.ss.android.lark.passport.infra.base.storage;

import android.app.Application;
import com.ss.android.lark.passport.infra.base.storage.config.Config;
import com.ss.android.lark.passport.infra.base.storage.config.Crypto;
import com.ss.android.lark.passport.infra.base.storage.config.Logger;
import com.ss.android.lark.passport.infra.base.storage.config.Serializer;
import com.ss.android.lark.passport.infra.base.storage.store.DataStorage;
import com.ss.android.lark.passport.infra.util.security.C49214c;
import com.ss.android.lark.utils.LarkContext;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u0010\u0010\u0003\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/storage/IsolateStorageInitializer;", "", "()V", "crypto", "Lcom/ss/android/lark/passport/infra/util/security/Encript;", "initIsolateStorage", "", "KeyCrypto", "ValueCrypto", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.base.c.b */
public final class IsolateStorageInitializer {

    /* renamed from: a */
    public static final IsolateStorageInitializer f123147a = new IsolateStorageInitializer();

    /* renamed from: b */
    private static final C49214c f123148b = new C49214c(LarkContext.getApplication());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JE\u0010 \u001a\u00020\u00012\b\b\u0002\u0010!\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001J\t\u0010\"\u001a\u00020#H\u0001R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0005¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\u0004X\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u0017X\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0012\u0010\u001a\u001a\u00020\u001bX\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u000fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0011¨\u0006$"}, d2 = {"com/ss/android/lark/passport/infra/base/storage/IsolateStorageInitializer$initIsolateStorage$config$1", "Lcom/ss/android/lark/passport/infra/base/storage/config/Config;", "allFactories", "", "Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorage$Factory;", "getAllFactories", "()Ljava/util/List;", "enableLogCost", "", "getEnableLogCost", "()Z", "factory", "getFactory", "()Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorage$Factory;", "keyCrypto", "Lcom/ss/android/lark/passport/infra/base/storage/config/Crypto;", "getKeyCrypto", "()Lcom/ss/android/lark/passport/infra/base/storage/config/Crypto;", "logger", "Lcom/ss/android/lark/passport/infra/base/storage/config/Logger;", "getLogger", "()Lcom/ss/android/lark/passport/infra/base/storage/config/Logger;", "root", "", "getRoot", "()Ljava/lang/String;", "serializerFactory", "Lcom/ss/android/lark/passport/infra/base/storage/config/Serializer$Factory;", "getSerializerFactory", "()Lcom/ss/android/lark/passport/infra/base/storage/config/Serializer$Factory;", "valueCrypto", "getValueCrypto", "clone", "ref", "newBuilder", "Lcom/ss/android/lark/passport/infra/base/storage/config/Config$Builder;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.base.c.b$c */
    public static final class C49053c implements Config {

        /* renamed from: c */
        private final Crypto f123149c = new KeyCrypto();

        /* renamed from: d */
        private final Crypto f123150d = new ValueCrypto();

        /* renamed from: e */
        private final boolean f123151e;

        /* renamed from: f */
        private final /* synthetic */ Config f123152f = Config.f123107a;

        @Override // com.ss.android.lark.passport.infra.base.storage.config.Config
        /* renamed from: a */
        public Config mo171222a(Config aVar, DataStorage.Factory bVar, Logger cVar, String str, Serializer.Factory bVar2, boolean z) {
            Intrinsics.checkParameterIsNotNull(aVar, "ref");
            Intrinsics.checkParameterIsNotNull(bVar, "factory");
            Intrinsics.checkParameterIsNotNull(cVar, "logger");
            Intrinsics.checkParameterIsNotNull(str, "root");
            Intrinsics.checkParameterIsNotNull(bVar2, "serializerFactory");
            return this.f123152f.mo171222a(aVar, bVar, cVar, str, bVar2, z);
        }

        @Override // com.ss.android.lark.passport.infra.base.storage.config.Config
        /* renamed from: d */
        public List<DataStorage.Factory> mo171226d() {
            return this.f123152f.mo171226d();
        }

        @Override // com.ss.android.lark.passport.infra.base.storage.config.Config
        /* renamed from: e */
        public DataStorage.Factory mo171227e() {
            return this.f123152f.mo171227e();
        }

        @Override // com.ss.android.lark.passport.infra.base.storage.config.Config
        /* renamed from: f */
        public Logger mo171228f() {
            return this.f123152f.mo171228f();
        }

        @Override // com.ss.android.lark.passport.infra.base.storage.config.Config
        /* renamed from: g */
        public String mo171229g() {
            return this.f123152f.mo171229g();
        }

        @Override // com.ss.android.lark.passport.infra.base.storage.config.Config
        /* renamed from: h */
        public Serializer.Factory mo171230h() {
            return this.f123152f.mo171230h();
        }

        @Override // com.ss.android.lark.passport.infra.base.storage.config.Config
        /* renamed from: a */
        public Crypto mo171223a() {
            return this.f123149c;
        }

        @Override // com.ss.android.lark.passport.infra.base.storage.config.Config
        /* renamed from: b */
        public Crypto mo171224b() {
            return this.f123150d;
        }

        @Override // com.ss.android.lark.passport.infra.base.storage.config.Config
        /* renamed from: c */
        public boolean mo171225c() {
            return this.f123151e;
        }

        C49053c() {
        }
    }

    private IsolateStorageInitializer() {
    }

    /* renamed from: a */
    public final void mo171242a() {
        Application application = LarkContext.getApplication();
        C49053c cVar = new C49053c();
        if (application != null) {
            IsolateStorage.m193173a(application, cVar);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Application");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/storage/IsolateStorageInitializer$KeyCrypto;", "Lcom/ss/android/lark/passport/infra/base/storage/config/Crypto;", "()V", "decrypt", "", "cipherText", "encrypt", "clearText", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.base.c.b$a */
    private static final class KeyCrypto implements Crypto {
        @Override // com.ss.android.lark.passport.infra.base.storage.config.Crypto
        /* renamed from: b */
        public String mo171232b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "cipherText");
            return str;
        }

        @Override // com.ss.android.lark.passport.infra.base.storage.config.Crypto
        /* renamed from: a */
        public String mo171231a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "clearText");
            IsolateStorageInitializer bVar = IsolateStorageInitializer.f123147a;
            String b = IsolateStorageInitializer.f123148b.mo171728b(str);
            Intrinsics.checkExpressionValueIsNotNull(b, "crypto.hashPrefKey(clearText)");
            return b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/storage/IsolateStorageInitializer$ValueCrypto;", "Lcom/ss/android/lark/passport/infra/base/storage/config/Crypto;", "()V", "decrypt", "", "cipherText", "encrypt", "clearText", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.base.c.b$b */
    private static final class ValueCrypto implements Crypto {
        @Override // com.ss.android.lark.passport.infra.base.storage.config.Crypto
        /* renamed from: a */
        public String mo171231a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "clearText");
            IsolateStorageInitializer bVar = IsolateStorageInitializer.f123147a;
            String c = IsolateStorageInitializer.f123148b.mo171729c(str);
            Intrinsics.checkExpressionValueIsNotNull(c, "crypto.encrypt(clearText)");
            return c;
        }

        @Override // com.ss.android.lark.passport.infra.base.storage.config.Crypto
        /* renamed from: b */
        public String mo171232b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "cipherText");
            IsolateStorageInitializer bVar = IsolateStorageInitializer.f123147a;
            String a = IsolateStorageInitializer.f123148b.mo171727a(str, "");
            Intrinsics.checkExpressionValueIsNotNull(a, "crypto.decrypt(cipherText, \"\")");
            return a;
        }
    }
}
