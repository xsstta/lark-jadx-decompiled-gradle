package com.ss.android.lark.passport.infra.base.storage.store;

import android.content.Context;
import android.content.SharedPreferences;
import com.ss.android.lark.passport.infra.base.storage.config.Config;
import com.ss.android.lark.passport.infra.base.storage.store.DataStorage;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0002\u0010\nJ\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0014J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0014J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0005H\u0014R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/storage/store/SPDataStorage;", "Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorage;", "context", "Landroid/content/Context;", "spName", "", "config", "Lcom/ss/android/lark/passport/infra/base/storage/config/Config;", "allLayers", "", "(Landroid/content/Context;Ljava/lang/String;Lcom/ss/android/lark/passport/infra/base/storage/config/Config;Ljava/util/List;)V", "sp", "Landroid/content/SharedPreferences;", "getInternal", "cipherKey", "putInternal", "", "serializedCipherValue", "removeAll", "removeInternal", "Companion", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.base.c.c.f */
public final class SPDataStorage extends DataStorage {

    /* renamed from: b */
    public static final DataStorage.Factory f123188b = new C49065b();

    /* renamed from: c */
    public static final Companion f123189c = new Companion(null);

    /* renamed from: d */
    private final SharedPreferences f123190d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/storage/store/SPDataStorage$Companion;", "", "()V", "FACTORY", "Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorage$Factory;", "getFACTORY", "()Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorage$Factory;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.base.c.c.f$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final DataStorage.Factory mo171274a() {
            return SPDataStorage.f123188b;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\rH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003XD¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000e"}, d2 = {"com/ss/android/lark/passport/infra/base/storage/store/SPDataStorage$Companion$FACTORY$1", "Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorage$Factory;", "name", "", "getName", "()Ljava/lang/String;", "createDataStorage", "Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorage;", "context", "Landroid/content/Context;", "config", "Lcom/ss/android/lark/passport/infra/base/storage/config/Config;", "allLayers", "", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.base.c.c.f$b */
    public static final class C49065b implements DataStorage.Factory {

        /* renamed from: a */
        private final String f123191a = "SharedPreferences";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.passport.infra.base.c.c.f$b$a */
        static final class C49066a extends Lambda implements Function1<String, String> {
            public static final C49066a INSTANCE = new C49066a();

            C49066a() {
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
            return this.f123191a;
        }

        C49065b() {
        }

        @Override // com.ss.android.lark.passport.infra.base.storage.store.DataStorage.Factory
        /* renamed from: a */
        public DataStorage mo171264a(Context context, Config aVar, List<String> list) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(aVar, "config");
            Intrinsics.checkParameterIsNotNull(list, "allLayers");
            return new SPDataStorage(context, CollectionsKt.joinToString$default(list, "_", null, null, 0, null, C49066a.INSTANCE, 30, null), aVar, list);
        }
    }

    @Override // com.ss.android.lark.passport.infra.base.storage.store.DataStorage
    /* renamed from: a */
    public void mo171248a() {
        this.f123190d.edit().clear().apply();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.storage.store.DataStorage
    /* renamed from: c */
    public String mo171256c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "cipherKey");
        String string = this.f123190d.getString(str, "");
        if (string != null) {
            return string;
        }
        return "";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.storage.store.DataStorage
    /* renamed from: d */
    public void mo171261d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "cipherKey");
        this.f123190d.edit().remove(str).apply();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.storage.store.DataStorage
    /* renamed from: a */
    public void mo171249a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "cipherKey");
        Intrinsics.checkParameterIsNotNull(str2, "serializedCipherValue");
        this.f123190d.edit().putString(str, str2).apply();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SPDataStorage(Context context, String str, Config aVar, List<String> list) {
        super(aVar, list);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "spName");
        Intrinsics.checkParameterIsNotNull(aVar, "config");
        Intrinsics.checkParameterIsNotNull(list, "allLayers");
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        Intrinsics.checkExpressionValueIsNotNull(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
        this.f123190d = sharedPreferences;
    }
}
