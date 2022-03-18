package com.ss.android.lark.passport.infra.base.storage.store;

import android.content.Context;
import com.google.gson.reflect.TypeToken;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.passport.infra.base.storage.IsolateStorage;
import com.ss.android.lark.passport.infra.base.storage.config.Config;
import com.ss.android.lark.passport.infra.base.storage.config.Crypto;
import com.ss.android.lark.passport.infra.base.storage.config.Logger;
import com.ss.android.lark.passport.infra.base.storage.config.Serializer;
import com.ss.android.lark.passport.infra.base.storage.key.Key;
import com.ss.android.lark.passport.infra.base.storage.store.DataStorage;
import com.tencent.mmkv.MMKV;
import java.io.File;
import java.lang.reflect.Type;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0002\u0010\tJ\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0014J/\u0010\u000f\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\u00122\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0013H\u0016¢\u0006\u0002\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003H\u0014J\b\u0010\u0018\u001a\u00020\u0016H\u0016J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u0003H\u0014R\u000e\u0010\n\u001a\u00020\u0001X.¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/storage/store/MMKVDataStorage;", "Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorage;", "fileName", "", "rootPath", "config", "Lcom/ss/android/lark/passport/infra/base/storage/config/Config;", "allLayers", "", "(Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/passport/infra/base/storage/config/Config;Ljava/util/List;)V", "fallback", "storage", "Lcom/tencent/mmkv/MMKV;", "getInternal", "cipherKey", "getOrPut", "T", "key", "Lcom/ss/android/lark/passport/infra/base/storage/key/Key;", "Lkotlin/Function0;", "(Lcom/ss/android/lark/passport/infra/base/storage/key/Key;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "putInternal", "", "serializedCipherValue", "removeAll", "removeInternal", "Companion", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.base.c.c.c */
public final class MMKVDataStorage extends DataStorage {

    /* renamed from: b */
    public static AtomicBoolean f123165b = new AtomicBoolean();

    /* renamed from: c */
    public static final DataStorage.Factory f123166c = new C49061e();

    /* renamed from: d */
    public static final Companion f123167d = new Companion(null);

    /* renamed from: e */
    private final MMKV f123168e;

    /* renamed from: f */
    private DataStorage f123169f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n¸\u0006\u0000"}, d2 = {"com/ss/android/lark/passport/infra/base/storage/key/Key$Companion$newKey$1", "Lcom/ss/android/lark/passport/infra/base/storage/key/Key;", "key", "", "getKey", "()Ljava/lang/String;", ShareHitPoint.f121869d, "Ljava/lang/reflect/Type;", "getType", "()Ljava/lang/reflect/Type;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.base.c.c.c$a */
    public static final class C49055a implements Key<String> {

        /* renamed from: b */
        final /* synthetic */ String f123175b;

        /* renamed from: c */
        private final String f123176c;

        @Override // com.ss.android.lark.passport.infra.base.storage.key.Key
        /* renamed from: a */
        public String mo171118a() {
            return this.f123176c;
        }

        @Override // com.ss.android.lark.passport.infra.base.storage.key.Key
        /* renamed from: b */
        public Type mo171119b() {
            Type type = new TypeToken<String>() {
                /* class com.ss.android.lark.passport.infra.base.storage.store.MMKVDataStorage.C49055a.C490561 */
            }.getType();
            Intrinsics.checkExpressionValueIsNotNull(type, "object : TypeToken<T>() {}.type");
            return type;
        }

        public C49055a(String str) {
            this.f123175b = str;
            this.f123176c = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n¸\u0006\u0000"}, d2 = {"com/ss/android/lark/passport/infra/base/storage/key/Key$Companion$newKey$1", "Lcom/ss/android/lark/passport/infra/base/storage/key/Key;", "key", "", "getKey", "()Ljava/lang/String;", ShareHitPoint.f121869d, "Ljava/lang/reflect/Type;", "getType", "()Ljava/lang/reflect/Type;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.base.c.c.c$b */
    public static final class C49057b implements Key<String> {

        /* renamed from: b */
        final /* synthetic */ String f123177b;

        /* renamed from: c */
        private final String f123178c;

        @Override // com.ss.android.lark.passport.infra.base.storage.key.Key
        /* renamed from: a */
        public String mo171118a() {
            return this.f123178c;
        }

        @Override // com.ss.android.lark.passport.infra.base.storage.key.Key
        /* renamed from: b */
        public Type mo171119b() {
            Type type = new TypeToken<String>() {
                /* class com.ss.android.lark.passport.infra.base.storage.store.MMKVDataStorage.C49057b.C490581 */
            }.getType();
            Intrinsics.checkExpressionValueIsNotNull(type, "object : TypeToken<T>() {}.type");
            return type;
        }

        public C49057b(String str) {
            this.f123177b = str;
            this.f123178c = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n¸\u0006\u0000"}, d2 = {"com/ss/android/lark/passport/infra/base/storage/key/Key$Companion$newKey$1", "Lcom/ss/android/lark/passport/infra/base/storage/key/Key;", "key", "", "getKey", "()Ljava/lang/String;", ShareHitPoint.f121869d, "Ljava/lang/reflect/Type;", "getType", "()Ljava/lang/reflect/Type;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.base.c.c.c$c */
    public static final class C49059c implements Key<String> {

        /* renamed from: b */
        final /* synthetic */ String f123179b;

        /* renamed from: c */
        private final String f123180c;

        @Override // com.ss.android.lark.passport.infra.base.storage.key.Key
        /* renamed from: a */
        public String mo171118a() {
            return this.f123180c;
        }

        @Override // com.ss.android.lark.passport.infra.base.storage.key.Key
        /* renamed from: b */
        public Type mo171119b() {
            Type type = new TypeToken<String>() {
                /* class com.ss.android.lark.passport.infra.base.storage.store.MMKVDataStorage.C49059c.C490601 */
            }.getType();
            Intrinsics.checkExpressionValueIsNotNull(type, "object : TypeToken<T>() {}.type");
            return type;
        }

        public C49059c(String str) {
            this.f123179b = str;
            this.f123180c = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/storage/store/MMKVDataStorage$Companion;", "", "()V", "FACTORY", "Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorage$Factory;", "getFACTORY", "()Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorage$Factory;", "isMMKVInitialized", "", "()Z", "mmkvInitialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initializeMMKV", "", "initializer", "Lkotlin/Function0;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.base.c.c.c$d */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: b */
        public final DataStorage.Factory mo171271b() {
            return MMKVDataStorage.f123166c;
        }

        /* renamed from: a */
        public final boolean mo171270a() {
            return MMKVDataStorage.f123165b.get();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo171269a(Function0<Unit> function0) {
            Intrinsics.checkParameterIsNotNull(function0, "initializer");
            if (MMKVDataStorage.f123165b.compareAndSet(false, true)) {
                function0.invoke();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\rH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003XD¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000e"}, d2 = {"com/ss/android/lark/passport/infra/base/storage/store/MMKVDataStorage$Companion$FACTORY$1", "Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorage$Factory;", "name", "", "getName", "()Ljava/lang/String;", "createDataStorage", "Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorage;", "context", "Landroid/content/Context;", "config", "Lcom/ss/android/lark/passport/infra/base/storage/config/Config;", "allLayers", "", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.base.c.c.c$e */
    public static final class C49061e implements DataStorage.Factory {

        /* renamed from: a */
        private final String f123181a = "MMKV";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.passport.infra.base.c.c.c$e$b */
        static final class C49063b extends Lambda implements Function1<String, String> {
            public static final C49063b INSTANCE = new C49063b();

            C49063b() {
                super(1);
            }

            public final String invoke(String str) {
                Intrinsics.checkParameterIsNotNull(str, "it");
                return str;
            }
        }

        @Override // com.ss.android.lark.passport.infra.base.storage.store.DataStorage.Factory
        /* renamed from: a */
        public String mo171265a() {
            return this.f123181a;
        }

        C49061e() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.passport.infra.base.c.c.c$e$a */
        static final class C49062a extends Lambda implements Function0<Unit> {
            final /* synthetic */ Context $context;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C49062a(Context context) {
                super(0);
                this.$context = context;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                MMKV.initialize(this.$context);
            }
        }

        @Override // com.ss.android.lark.passport.infra.base.storage.store.DataStorage.Factory
        /* renamed from: a */
        public DataStorage mo171264a(Context context, Config aVar, List<String> list) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(aVar, "config");
            Intrinsics.checkParameterIsNotNull(list, "allLayers");
            if (!MMKVDataStorage.f123167d.mo171270a()) {
                MMKVDataStorage.f123167d.mo171269a(new C49062a(context));
            }
            List dropLast = CollectionsKt.dropLast(list, 1);
            String str = File.separator;
            Intrinsics.checkExpressionValueIsNotNull(str, "File.separator");
            String joinToString$default = CollectionsKt.joinToString$default(dropLast, str, null, null, 0, null, C49063b.INSTANCE, 30, null);
            StringBuilder sb = new StringBuilder();
            File filesDir = context.getFilesDir();
            Intrinsics.checkExpressionValueIsNotNull(filesDir, "context.filesDir");
            sb.append(filesDir.getAbsolutePath());
            sb.append(File.separator);
            sb.append(joinToString$default);
            return new MMKVDataStorage((String) CollectionsKt.last((List) list), sb.toString(), aVar, list);
        }
    }

    @Override // com.ss.android.lark.passport.infra.base.storage.store.DataStorage
    /* renamed from: a */
    public void mo171248a() {
        synchronized (this) {
            MMKV mmkv = this.f123168e;
            if (mmkv != null) {
                mmkv.clearAll();
            } else {
                DataStorage aVar = this.f123169f;
                if (aVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("fallback");
                }
                aVar.mo171248a();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.storage.store.DataStorage
    /* renamed from: c */
    public String mo171256c(String str) {
        String str2;
        Intrinsics.checkParameterIsNotNull(str, "cipherKey");
        synchronized (this) {
            MMKV mmkv = this.f123168e;
            if (mmkv != null) {
                str2 = mmkv.decodeString(str);
            } else {
                DataStorage aVar = this.f123169f;
                if (aVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("fallback");
                }
                Key.Companion aVar2 = Key.f123153a;
                str2 = (String) aVar.mo171255c(new C49057b(str));
            }
            if (str2 == null) {
                str2 = "";
            }
        }
        return str2;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.storage.store.DataStorage
    /* renamed from: d */
    public void mo171261d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "cipherKey");
        synchronized (this) {
            MMKV mmkv = this.f123168e;
            if (mmkv != null) {
                mmkv.remove(str);
            } else {
                DataStorage aVar = this.f123169f;
                if (aVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("fallback");
                }
                Key.Companion aVar2 = Key.f123153a;
                aVar.mo171262e(new C49059c(str));
            }
        }
    }

    @Override // com.ss.android.lark.passport.infra.base.storage.store.DataStorage
    /* renamed from: a */
    public <T> T mo171244a(Key<T> aVar, Function0<? extends T> function0) {
        Intrinsics.checkParameterIsNotNull(aVar, "key");
        Intrinsics.checkParameterIsNotNull(function0, "fallback");
        synchronized (this) {
            T t = (T) mo171255c(aVar);
            if (t != null) {
                return t;
            }
            T t2 = (T) function0.invoke();
            mo171253b(aVar, t2);
            return t2;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.storage.store.DataStorage
    /* renamed from: a */
    public void mo171249a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "cipherKey");
        Intrinsics.checkParameterIsNotNull(str2, "serializedCipherValue");
        synchronized (this) {
            MMKV mmkv = this.f123168e;
            if (mmkv != null) {
                Boolean.valueOf(mmkv.encode(str, str2));
            } else {
                DataStorage aVar = this.f123169f;
                if (aVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("fallback");
                }
                Key.Companion aVar2 = Key.f123153a;
                aVar.mo171253b(new C49055a(str), str2);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMKVDataStorage(String str, String str2, Config aVar, List<String> list) {
        super(aVar, list);
        Object obj;
        Intrinsics.checkParameterIsNotNull(str, "fileName");
        Intrinsics.checkParameterIsNotNull(str2, "rootPath");
        Intrinsics.checkParameterIsNotNull(aVar, "config");
        Intrinsics.checkParameterIsNotNull(list, "allLayers");
        MMKV mmkv = null;
        try {
            Result.Companion aVar2 = Result.Companion;
            MMKVDataStorage cVar = this;
            obj = Result.m271569constructorimpl(MMKV.mmkvWithID(str, 2, null, str2));
        } catch (Throwable th) {
            Result.Companion aVar3 = Result.Companion;
            obj = Result.m271569constructorimpl(C69097g.m265890a(th));
        }
        Throwable r2 = Result.m271572exceptionOrNullimpl(obj);
        if (r2 == null) {
            mmkv = obj;
        } else {
            Logger f = aVar.mo171228f();
            f.mo171234a("create mmkv failed fileName = " + str + ", rootPath = " + str2, "ERROR");
            r2.printStackTrace();
        }
        MMKV mmkv2 = mmkv;
        this.f123168e = mmkv2;
        if (mmkv2 == null) {
            this.f123169f = IsolateStorage.m193170a(CollectionsKt.minus(list, aVar.mo171229g()), new Config(aVar) {
                /* class com.ss.android.lark.passport.infra.base.storage.store.MMKVDataStorage.C490541 */

                /* renamed from: c */
                final /* synthetic */ Config f123170c;

                /* renamed from: d */
                private final Crypto f123171d = Crypto.f123131a.mo171233a();

                /* renamed from: e */
                private final Crypto f123172e = Crypto.f123131a.mo171233a();

                /* renamed from: f */
                private final DataStorage.Factory f123173f = SPDataStorage.f123189c.mo171274a();

                /* renamed from: g */
                private final /* synthetic */ Config f123174g;

                @Override // com.ss.android.lark.passport.infra.base.storage.config.Config
                /* renamed from: a */
                public Config mo171222a(Config aVar, DataStorage.Factory bVar, Logger cVar, String str, Serializer.Factory bVar2, boolean z) {
                    Intrinsics.checkParameterIsNotNull(aVar, "ref");
                    Intrinsics.checkParameterIsNotNull(bVar, "factory");
                    Intrinsics.checkParameterIsNotNull(cVar, "logger");
                    Intrinsics.checkParameterIsNotNull(str, "root");
                    Intrinsics.checkParameterIsNotNull(bVar2, "serializerFactory");
                    return this.f123174g.mo171222a(aVar, bVar, cVar, str, bVar2, z);
                }

                @Override // com.ss.android.lark.passport.infra.base.storage.config.Config
                /* renamed from: c */
                public boolean mo171225c() {
                    return this.f123174g.mo171225c();
                }

                @Override // com.ss.android.lark.passport.infra.base.storage.config.Config
                /* renamed from: d */
                public List<DataStorage.Factory> mo171226d() {
                    return this.f123174g.mo171226d();
                }

                @Override // com.ss.android.lark.passport.infra.base.storage.config.Config
                /* renamed from: f */
                public Logger mo171228f() {
                    return this.f123174g.mo171228f();
                }

                @Override // com.ss.android.lark.passport.infra.base.storage.config.Config
                /* renamed from: g */
                public String mo171229g() {
                    return this.f123174g.mo171229g();
                }

                @Override // com.ss.android.lark.passport.infra.base.storage.config.Config
                /* renamed from: h */
                public Serializer.Factory mo171230h() {
                    return this.f123174g.mo171230h();
                }

                @Override // com.ss.android.lark.passport.infra.base.storage.config.Config
                /* renamed from: a */
                public Crypto mo171223a() {
                    return this.f123171d;
                }

                @Override // com.ss.android.lark.passport.infra.base.storage.config.Config
                /* renamed from: b */
                public Crypto mo171224b() {
                    return this.f123172e;
                }

                @Override // com.ss.android.lark.passport.infra.base.storage.config.Config
                /* renamed from: e */
                public DataStorage.Factory mo171227e() {
                    return this.f123173f;
                }

                {
                    this.f123170c = r1;
                    this.f123174g = r1;
                }
            });
        }
    }
}
