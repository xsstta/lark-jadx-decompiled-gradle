package com.ss.android.lark.passport.infra.base.storage.config;

import com.ss.android.lark.passport.infra.base.storage.config.Serializer;
import com.ss.android.lark.passport.infra.base.storage.store.DataStorage;
import com.ss.android.lark.passport.infra.base.storage.store.MMKVDataStorage;
import com.ss.android.lark.passport.infra.base.storage.store.MemoryDataStorage;
import com.ss.android.lark.passport.infra.base.storage.store.SPDataStorage;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 %2\u00020\u0001:\u0002$%JD\u0010 \u001a\u00020\u00002\b\b\u0002\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\"\u001a\u00020#H\u0016R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0012\u0010\u001a\u001a\u00020\u001bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0012\u0010\u001e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0011\u0002\u0007\n\u0005\bF0\u0001¨\u0006&"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/storage/config/Config;", "", "allFactories", "", "Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorage$Factory;", "getAllFactories", "()Ljava/util/List;", "enableLogCost", "", "getEnableLogCost", "()Z", "factory", "getFactory", "()Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorage$Factory;", "keyCrypto", "Lcom/ss/android/lark/passport/infra/base/storage/config/Crypto;", "getKeyCrypto", "()Lcom/ss/android/lark/passport/infra/base/storage/config/Crypto;", "logger", "Lcom/ss/android/lark/passport/infra/base/storage/config/Logger;", "getLogger", "()Lcom/ss/android/lark/passport/infra/base/storage/config/Logger;", "root", "", "getRoot", "()Ljava/lang/String;", "serializerFactory", "Lcom/ss/android/lark/passport/infra/base/storage/config/Serializer$Factory;", "getSerializerFactory", "()Lcom/ss/android/lark/passport/infra/base/storage/config/Serializer$Factory;", "valueCrypto", "getValueCrypto", "clone", "ref", "newBuilder", "Lcom/ss/android/lark/passport/infra/base/storage/config/Config$Builder;", "Builder", "Companion", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.base.c.a.a */
public interface Config {

    /* renamed from: a */
    public static final Config f123107a = new C49042b.C49043a();

    /* renamed from: b */
    public static final Companion f123108b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.base.c.a.a$b */
    public static final class C49042b {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000?\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0017XD¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u000fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0011¨\u0006 "}, d2 = {"com/ss/android/lark/passport/infra/base/storage/config/Config$Companion$DEFAULT$1", "Lcom/ss/android/lark/passport/infra/base/storage/config/Config;", "allFactories", "", "Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorage$Factory;", "getAllFactories", "()Ljava/util/List;", "enableLogCost", "", "getEnableLogCost", "()Z", "factory", "getFactory", "()Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorage$Factory;", "keyCrypto", "Lcom/ss/android/lark/passport/infra/base/storage/config/Crypto;", "getKeyCrypto", "()Lcom/ss/android/lark/passport/infra/base/storage/config/Crypto;", "logger", "Lcom/ss/android/lark/passport/infra/base/storage/config/Logger;", "getLogger", "()Lcom/ss/android/lark/passport/infra/base/storage/config/Logger;", "root", "", "getRoot", "()Ljava/lang/String;", "serializerFactory", "Lcom/ss/android/lark/passport/infra/base/storage/config/Serializer$Factory;", "getSerializerFactory", "()Lcom/ss/android/lark/passport/infra/base/storage/config/Serializer$Factory;", "valueCrypto", "getValueCrypto", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.passport.infra.base.c.a.a$b$a */
        public static final class C49043a implements Config {

            /* renamed from: c */
            private final Crypto f123109c = Crypto.f123131a.mo171233a();

            /* renamed from: d */
            private final Crypto f123110d = Crypto.f123131a.mo171233a();

            /* renamed from: e */
            private final DataStorage.Factory f123111e = MMKVDataStorage.f123167d.mo171271b();

            /* renamed from: f */
            private final Serializer.Factory f123112f = Serializer.f123140a.mo171239b();

            /* renamed from: g */
            private final Logger f123113g = Logger.f123135a.mo171235a();

            /* renamed from: h */
            private final String f123114h = "Passport";

            /* renamed from: i */
            private final boolean f123115i = true;

            /* renamed from: j */
            private final List<DataStorage.Factory> f123116j = CollectionsKt.listOf((Object[]) new DataStorage.Factory[]{SPDataStorage.f123189c.mo171274a(), MMKVDataStorage.f123167d.mo171271b(), MemoryDataStorage.f123183c.mo171273a()});

            @Override // com.ss.android.lark.passport.infra.base.storage.config.Config
            /* renamed from: a */
            public Crypto mo171223a() {
                return this.f123109c;
            }

            @Override // com.ss.android.lark.passport.infra.base.storage.config.Config
            /* renamed from: b */
            public Crypto mo171224b() {
                return this.f123110d;
            }

            @Override // com.ss.android.lark.passport.infra.base.storage.config.Config
            /* renamed from: c */
            public boolean mo171225c() {
                return this.f123115i;
            }

            @Override // com.ss.android.lark.passport.infra.base.storage.config.Config
            /* renamed from: d */
            public List<DataStorage.Factory> mo171226d() {
                return this.f123116j;
            }

            @Override // com.ss.android.lark.passport.infra.base.storage.config.Config
            /* renamed from: e */
            public DataStorage.Factory mo171227e() {
                return this.f123111e;
            }

            @Override // com.ss.android.lark.passport.infra.base.storage.config.Config
            /* renamed from: f */
            public Logger mo171228f() {
                return this.f123113g;
            }

            @Override // com.ss.android.lark.passport.infra.base.storage.config.Config
            /* renamed from: g */
            public String mo171229g() {
                return this.f123114h;
            }

            @Override // com.ss.android.lark.passport.infra.base.storage.config.Config
            /* renamed from: h */
            public Serializer.Factory mo171230h() {
                return this.f123112f;
            }

            C49043a() {
            }

            @Override // com.ss.android.lark.passport.infra.base.storage.config.Config
            /* renamed from: a */
            public Config mo171222a(Config aVar, DataStorage.Factory bVar, Logger cVar, String str, Serializer.Factory bVar2, boolean z) {
                Intrinsics.checkParameterIsNotNull(aVar, "ref");
                Intrinsics.checkParameterIsNotNull(bVar, "factory");
                Intrinsics.checkParameterIsNotNull(cVar, "logger");
                Intrinsics.checkParameterIsNotNull(str, "root");
                Intrinsics.checkParameterIsNotNull(bVar2, "serializerFactory");
                return C49042b.m193185a(this, aVar, bVar, cVar, str, bVar2, z);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000?\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u000fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0011¨\u0006 "}, d2 = {"com/ss/android/lark/passport/infra/base/storage/config/Config$clone$1", "Lcom/ss/android/lark/passport/infra/base/storage/config/Config;", "allFactories", "", "Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorage$Factory;", "getAllFactories", "()Ljava/util/List;", "enableLogCost", "", "getEnableLogCost", "()Z", "factory", "getFactory", "()Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorage$Factory;", "keyCrypto", "Lcom/ss/android/lark/passport/infra/base/storage/config/Crypto;", "getKeyCrypto", "()Lcom/ss/android/lark/passport/infra/base/storage/config/Crypto;", "logger", "Lcom/ss/android/lark/passport/infra/base/storage/config/Logger;", "getLogger", "()Lcom/ss/android/lark/passport/infra/base/storage/config/Logger;", "root", "", "getRoot", "()Ljava/lang/String;", "serializerFactory", "Lcom/ss/android/lark/passport/infra/base/storage/config/Serializer$Factory;", "getSerializerFactory", "()Lcom/ss/android/lark/passport/infra/base/storage/config/Serializer$Factory;", "valueCrypto", "getValueCrypto", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.passport.infra.base.c.a.a$b$b */
        public static final class C49044b implements Config {

            /* renamed from: c */
            final /* synthetic */ Config f123117c;

            /* renamed from: d */
            final /* synthetic */ DataStorage.Factory f123118d;

            /* renamed from: e */
            final /* synthetic */ Logger f123119e;

            /* renamed from: f */
            final /* synthetic */ String f123120f;

            /* renamed from: g */
            final /* synthetic */ Serializer.Factory f123121g;

            /* renamed from: h */
            final /* synthetic */ boolean f123122h;

            /* renamed from: i */
            private final Crypto f123123i;

            /* renamed from: j */
            private final Crypto f123124j;

            /* renamed from: k */
            private final DataStorage.Factory f123125k;

            /* renamed from: l */
            private final Logger f123126l;

            /* renamed from: m */
            private final String f123127m;

            /* renamed from: n */
            private final List<DataStorage.Factory> f123128n;

            /* renamed from: o */
            private final Serializer.Factory f123129o;

            /* renamed from: p */
            private final boolean f123130p;

            @Override // com.ss.android.lark.passport.infra.base.storage.config.Config
            /* renamed from: a */
            public Crypto mo171223a() {
                return this.f123123i;
            }

            @Override // com.ss.android.lark.passport.infra.base.storage.config.Config
            /* renamed from: b */
            public Crypto mo171224b() {
                return this.f123124j;
            }

            @Override // com.ss.android.lark.passport.infra.base.storage.config.Config
            /* renamed from: c */
            public boolean mo171225c() {
                return this.f123130p;
            }

            @Override // com.ss.android.lark.passport.infra.base.storage.config.Config
            /* renamed from: d */
            public List<DataStorage.Factory> mo171226d() {
                return this.f123128n;
            }

            @Override // com.ss.android.lark.passport.infra.base.storage.config.Config
            /* renamed from: e */
            public DataStorage.Factory mo171227e() {
                return this.f123125k;
            }

            @Override // com.ss.android.lark.passport.infra.base.storage.config.Config
            /* renamed from: f */
            public Logger mo171228f() {
                return this.f123126l;
            }

            @Override // com.ss.android.lark.passport.infra.base.storage.config.Config
            /* renamed from: g */
            public String mo171229g() {
                return this.f123127m;
            }

            @Override // com.ss.android.lark.passport.infra.base.storage.config.Config
            /* renamed from: h */
            public Serializer.Factory mo171230h() {
                return this.f123129o;
            }

            @Override // com.ss.android.lark.passport.infra.base.storage.config.Config
            /* renamed from: a */
            public Config mo171222a(Config aVar, DataStorage.Factory bVar, Logger cVar, String str, Serializer.Factory bVar2, boolean z) {
                Intrinsics.checkParameterIsNotNull(aVar, "ref");
                Intrinsics.checkParameterIsNotNull(bVar, "factory");
                Intrinsics.checkParameterIsNotNull(cVar, "logger");
                Intrinsics.checkParameterIsNotNull(str, "root");
                Intrinsics.checkParameterIsNotNull(bVar2, "serializerFactory");
                return C49042b.m193185a(this, aVar, bVar, cVar, str, bVar2, z);
            }

            C49044b(Config aVar, DataStorage.Factory bVar, Logger cVar, String str, Serializer.Factory bVar2, boolean z) {
                this.f123117c = aVar;
                this.f123118d = bVar;
                this.f123119e = cVar;
                this.f123120f = str;
                this.f123121g = bVar2;
                this.f123122h = z;
                this.f123123i = aVar.mo171223a();
                this.f123124j = aVar.mo171224b();
                this.f123125k = bVar;
                this.f123126l = cVar;
                this.f123127m = str;
                this.f123128n = aVar.mo171226d();
                this.f123129o = bVar2;
                this.f123130p = z;
            }
        }

        /* renamed from: a */
        public static Config m193185a(Config aVar, Config aVar2, DataStorage.Factory bVar, Logger cVar, String str, Serializer.Factory bVar2, boolean z) {
            Intrinsics.checkParameterIsNotNull(aVar2, "ref");
            Intrinsics.checkParameterIsNotNull(bVar, "factory");
            Intrinsics.checkParameterIsNotNull(cVar, "logger");
            Intrinsics.checkParameterIsNotNull(str, "root");
            Intrinsics.checkParameterIsNotNull(bVar2, "serializerFactory");
            return new C49044b(aVar2, bVar, cVar, str, bVar2, z);
        }

        /* renamed from: a */
        public static /* synthetic */ Config m193186a(Config aVar, Config aVar2, DataStorage.Factory bVar, Logger cVar, String str, Serializer.Factory bVar2, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    aVar2 = aVar;
                }
                if ((i & 2) != 0) {
                    bVar = aVar2.mo171227e();
                }
                if ((i & 4) != 0) {
                    cVar = aVar2.mo171228f();
                }
                if ((i & 8) != 0) {
                    str = aVar2.mo171229g();
                }
                if ((i & 16) != 0) {
                    bVar2 = aVar2.mo171230h();
                }
                if ((i & 32) != 0) {
                    z = aVar2.mo171225c();
                }
                return aVar.mo171222a(aVar2, bVar, cVar, str, bVar2, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clone");
        }
    }

    /* renamed from: a */
    Config mo171222a(Config aVar, DataStorage.Factory bVar, Logger cVar, String str, Serializer.Factory bVar2, boolean z);

    /* renamed from: a */
    Crypto mo171223a();

    /* renamed from: b */
    Crypto mo171224b();

    /* renamed from: c */
    boolean mo171225c();

    /* renamed from: d */
    List<DataStorage.Factory> mo171226d();

    /* renamed from: e */
    DataStorage.Factory mo171227e();

    /* renamed from: f */
    Logger mo171228f();

    /* renamed from: g */
    String mo171229g();

    /* renamed from: h */
    Serializer.Factory mo171230h();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000¨\u0006\u0001\u0002\u0007\n\u0005\bF0\u0001¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/storage/config/Config$Companion;", "", "()V", "DEFAULT", "Lcom/ss/android/lark/passport/infra/base/storage/config/Config;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.base.c.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
