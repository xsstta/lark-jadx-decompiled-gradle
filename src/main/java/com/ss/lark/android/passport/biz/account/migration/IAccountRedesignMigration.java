package com.ss.lark.android.passport.biz.account.migration;

import com.google.gson.reflect.TypeToken;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.passport.infra.base.storage.key.Key;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/ss/lark/android/passport/biz/account/migration/IAccountRedesignMigration;", "", "migrateIfNeeded", "", "Companion", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.account.migration.c */
public interface IAccountRedesignMigration {

    /* renamed from: b */
    public static final Companion f162567b = Companion.f162568a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ss/lark/android/passport/biz/account/migration/IAccountRedesignMigration$Companion;", "", "()V", "KeyAccountRedesignMigrated", "Lcom/ss/android/lark/passport/infra/base/storage/key/Key;", "", "getKeyAccountRedesignMigrated", "()Lcom/ss/android/lark/passport/infra/base/storage/key/Key;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.account.migration.c$a */
    public static final class Companion {

        /* renamed from: a */
        static final /* synthetic */ Companion f162568a = new Companion();

        /* renamed from: b */
        private static final Key<Boolean> f162569b = new C64325a("AccountRedesignMigrated");

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n¸\u0006\u0000"}, d2 = {"com/ss/android/lark/passport/infra/base/storage/key/Key$Companion$newKey$1", "Lcom/ss/android/lark/passport/infra/base/storage/key/Key;", "key", "", "getKey", "()Ljava/lang/String;", ShareHitPoint.f121869d, "Ljava/lang/reflect/Type;", "getType", "()Ljava/lang/reflect/Type;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.lark.android.passport.biz.account.migration.c$a$a */
        public static final class C64325a implements Key<Boolean> {

            /* renamed from: b */
            final /* synthetic */ String f162570b;

            /* renamed from: c */
            private final String f162571c;

            @Override // com.ss.android.lark.passport.infra.base.storage.key.Key
            /* renamed from: a */
            public String mo171118a() {
                return this.f162571c;
            }

            @Override // com.ss.android.lark.passport.infra.base.storage.key.Key
            /* renamed from: b */
            public Type mo171119b() {
                Type type = new TypeToken<Boolean>() {
                    /* class com.ss.lark.android.passport.biz.account.migration.IAccountRedesignMigration.Companion.C64325a.C643261 */
                }.getType();
                Intrinsics.checkExpressionValueIsNotNull(type, "object : TypeToken<T>() {}.type");
                return type;
            }

            public C64325a(String str) {
                this.f162570b = str;
                this.f162571c = str;
            }
        }

        private Companion() {
        }

        /* renamed from: a */
        public final Key<Boolean> mo222844a() {
            return f162569b;
        }

        static {
            Key.Companion aVar = Key.f123153a;
        }
    }

    /* renamed from: a */
    void mo222801a();
}
