package com.ss.lark.android.passport.biz.account.migration;

import com.google.gson.reflect.TypeToken;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.p2069j.p2070a.C40659z;
import com.ss.android.lark.passport.infra.base.p2426c.p2430d.C49067a;
import com.ss.android.lark.passport.infra.base.storage.IsolateStorage;
import com.ss.android.lark.passport.infra.base.storage.key.Key;
import com.ss.android.lark.passport.infra.base.storage.store.DataStorage;
import com.ss.android.lark.passport.infra.base.storage.store.DataStorageDelegate;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49202p;
import com.ss.android.lark.passport.infra.util.p2441c.C49167b;
import com.ss.android.lark.passport.infra.watcher.WatcherHelper;
import com.ss.android.lark.passport.infra.watcher.WatcherUniContext;
import com.ss.android.lark.passport.signinsdk_api.account.SessionInfo;
import com.ss.android.lark.passport.signinsdk_api.account.Tenant;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.entity.LoginInfo;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.lark.android.passport.biz.account.UserGlobalKeys;
import com.ss.lark.android.passport.biz.account.UserInfoKeys;
import com.ss.lark.android.passport.biz.account.migration.bean.LegacyTenant;
import com.ss.lark.android.passport.biz.account.migration.bean.LegacyUser;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014R\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/lark/android/passport/biz/account/migration/UserInfoMigration;", "Lcom/ss/lark/android/passport/biz/account/migration/IAccountRedesignMigration;", "()V", "legacyUser", "Lcom/ss/lark/android/passport/biz/account/migration/bean/LegacyUser;", "getLegacyUser", "()Lcom/ss/lark/android/passport/biz/account/migration/bean/LegacyUser;", "legacyUser$delegate", "Lkotlin/Lazy;", "loginDidKey", "Lcom/ss/android/lark/passport/infra/base/storage/key/Key;", "", "logoutTokenKey", "sessionKey", "installKeyMap", "", "migrateIfNeeded", "migrateUser", "Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "legacyLoginInfo", "Lcom/ss/android/lark/passport/signinsdk_api/entity/LoginInfo;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.account.migration.f */
public final class UserInfoMigration implements IAccountRedesignMigration {

    /* renamed from: a */
    public static final UserInfoMigration f162580a;

    /* renamed from: c */
    private static final Key<String> f162581c = new C64332a("key_token");

    /* renamed from: d */
    private static final Key<String> f162582d = new C64334b("key_logout_token");

    /* renamed from: e */
    private static final Key<String> f162583e = new C64336c("key_login_device_id");

    /* renamed from: f */
    private static final Lazy f162584f = LazyKt.lazy(C64338d.INSTANCE);

    /* renamed from: b */
    private final LegacyUser m252944b() {
        return (LegacyUser) f162584f.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n¸\u0006\u0000"}, d2 = {"com/ss/android/lark/passport/infra/base/storage/key/Key$Companion$newKey$1", "Lcom/ss/android/lark/passport/infra/base/storage/key/Key;", "key", "", "getKey", "()Ljava/lang/String;", ShareHitPoint.f121869d, "Ljava/lang/reflect/Type;", "getType", "()Ljava/lang/reflect/Type;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.account.migration.f$a */
    public static final class C64332a implements Key<String> {

        /* renamed from: b */
        final /* synthetic */ String f162585b;

        /* renamed from: c */
        private final String f162586c;

        @Override // com.ss.android.lark.passport.infra.base.storage.key.Key
        /* renamed from: a */
        public String mo171118a() {
            return this.f162586c;
        }

        @Override // com.ss.android.lark.passport.infra.base.storage.key.Key
        /* renamed from: b */
        public Type mo171119b() {
            Type type = new TypeToken<String>() {
                /* class com.ss.lark.android.passport.biz.account.migration.UserInfoMigration.C64332a.C643331 */
            }.getType();
            Intrinsics.checkExpressionValueIsNotNull(type, "object : TypeToken<T>() {}.type");
            return type;
        }

        public C64332a(String str) {
            this.f162585b = str;
            this.f162586c = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n¸\u0006\u0000"}, d2 = {"com/ss/android/lark/passport/infra/base/storage/key/Key$Companion$newKey$1", "Lcom/ss/android/lark/passport/infra/base/storage/key/Key;", "key", "", "getKey", "()Ljava/lang/String;", ShareHitPoint.f121869d, "Ljava/lang/reflect/Type;", "getType", "()Ljava/lang/reflect/Type;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.account.migration.f$b */
    public static final class C64334b implements Key<String> {

        /* renamed from: b */
        final /* synthetic */ String f162587b;

        /* renamed from: c */
        private final String f162588c;

        @Override // com.ss.android.lark.passport.infra.base.storage.key.Key
        /* renamed from: a */
        public String mo171118a() {
            return this.f162588c;
        }

        @Override // com.ss.android.lark.passport.infra.base.storage.key.Key
        /* renamed from: b */
        public Type mo171119b() {
            Type type = new TypeToken<String>() {
                /* class com.ss.lark.android.passport.biz.account.migration.UserInfoMigration.C64334b.C643351 */
            }.getType();
            Intrinsics.checkExpressionValueIsNotNull(type, "object : TypeToken<T>() {}.type");
            return type;
        }

        public C64334b(String str) {
            this.f162587b = str;
            this.f162588c = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n¸\u0006\u0000"}, d2 = {"com/ss/android/lark/passport/infra/base/storage/key/Key$Companion$newKey$1", "Lcom/ss/android/lark/passport/infra/base/storage/key/Key;", "key", "", "getKey", "()Ljava/lang/String;", ShareHitPoint.f121869d, "Ljava/lang/reflect/Type;", "getType", "()Ljava/lang/reflect/Type;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.account.migration.f$c */
    public static final class C64336c implements Key<String> {

        /* renamed from: b */
        final /* synthetic */ String f162589b;

        /* renamed from: c */
        private final String f162590c;

        @Override // com.ss.android.lark.passport.infra.base.storage.key.Key
        /* renamed from: a */
        public String mo171118a() {
            return this.f162590c;
        }

        @Override // com.ss.android.lark.passport.infra.base.storage.key.Key
        /* renamed from: b */
        public Type mo171119b() {
            Type type = new TypeToken<String>() {
                /* class com.ss.lark.android.passport.biz.account.migration.UserInfoMigration.C64336c.C643371 */
            }.getType();
            Intrinsics.checkExpressionValueIsNotNull(type, "object : TypeToken<T>() {}.type");
            return type;
        }

        public C64336c(String str) {
            this.f162589b = str;
            this.f162590c = str;
        }
    }

    private UserInfoMigration() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/lark/android/passport/biz/account/migration/bean/LegacyUser;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.account.migration.f$d */
    static final class C64338d extends Lambda implements Function0<LegacyUser> {
        public static final C64338d INSTANCE = new C64338d();

        C64338d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final LegacyUser invoke() {
            return (LegacyUser) C49202p.m193969a(LegacyDataManager.f162572a.mo222851b().mo222853a(UserInfoKeys.f162529b.mo171118a(), ""), (Type) LegacyUser.class);
        }
    }

    static {
        UserInfoMigration fVar = new UserInfoMigration();
        f162580a = fVar;
        Key.Companion aVar = Key.f123153a;
        Key.Companion aVar2 = Key.f123153a;
        Key.Companion aVar3 = Key.f123153a;
        fVar.m252945c();
    }

    /* renamed from: c */
    private final void m252945c() {
        LegacyDataManager.m252915a(LegacyDataManager.f162572a, f162582d, LegacyDataManager.f162572a.mo222851b(), null, 4, null);
        LegacyDataManager.m252915a(LegacyDataManager.f162572a, UserInfoKeys.f162528a, LegacyDataManager.f162572a.mo222851b(), null, 4, null);
        LegacyDataManager.m252915a(LegacyDataManager.f162572a, f162581c, LegacyDataManager.f162572a.mo222851b(), null, 4, null);
        LegacyDataManager.m252915a(LegacyDataManager.f162572a, UserGlobalKeys.f162507i, LegacyDataManager.f162572a.mo222851b(), null, 4, null);
        LegacyDataManager.m252915a(LegacyDataManager.f162572a, UserInfoKeys.f162529b, LegacyDataManager.f162572a.mo222851b(), null, 4, null);
        LegacyDataManager.m252915a(LegacyDataManager.f162572a, f162583e, LegacyDataManager.f162572a.mo222851b(), null, 4, null);
        LegacyDataManager.m252915a(LegacyDataManager.f162572a, UserInfoKeys.f162530c, LegacyDataManager.f162572a.mo222846a(), null, 4, null);
    }

    @Override // com.ss.lark.android.passport.biz.account.migration.IAccountRedesignMigration
    /* renamed from: a */
    public void mo222801a() {
        LegacyUser b = m252944b();
        if (b != null) {
            DataStorageDelegate a = C49067a.m193335a(IsolateStorage.f123105c);
            IsolateStorage aVar = IsolateStorage.f123105c;
            String str = b.userId;
            Intrinsics.checkExpressionValueIsNotNull(str, "legacyUser.userId");
            String str2 = null;
            DataStorageDelegate a2 = C49067a.m193337a(aVar, str, null, 2, null);
            if (!((Boolean) a2.mo171260d(IAccountRedesignMigration.f162567b.mo222844a(), false)).booleanValue()) {
                UniContext a3 = WatcherUniContext.f123348l.mo171433a();
                C40659z zVar = C40659z.f103252b;
                Intrinsics.checkExpressionValueIsNotNull(zVar, "EPMClientPassportMonitor…ADE_SESSION_REQUEST_START");
                WatcherHelper.m193666a(a3, zVar, null, 4, null);
                LegacyDataManager.f162572a.mo222849a((Key) UserInfoKeys.f162528a, (DataStorage) a2);
                LegacyDataManager.f162572a.mo222849a((Key) UserGlobalKeys.f162507i, (DataStorage) a);
                LoginInfo loginInfo = (LoginInfo) C49202p.m193969a(C57744a.m224104a().getString(UserInfoKeys.f162530c.mo171118a(), ""), UserInfoKeys.f162530c.mo171119b());
                if (loginInfo != null) {
                    str2 = loginInfo.getUserId();
                }
                if (Intrinsics.areEqual(str2, b.userId)) {
                    a2.mo171253b(UserInfoKeys.f162530c, loginInfo);
                }
                ServiceFinder.m193744a().onUserMigrationCompleted(mo222857a(b, loginInfo));
                a2.mo171253b(IAccountRedesignMigration.f162567b.mo222844a(), true);
            }
        }
    }

    /* renamed from: a */
    public final User mo222857a(LegacyUser legacyUser, LoginInfo loginInfo) {
        String str;
        String str2;
        Intrinsics.checkParameterIsNotNull(legacyUser, "legacyUser");
        User user = new User();
        user.userId = legacyUser.userId;
        user.name = legacyUser.name;
        User.I18Name i18Name = new User.I18Name();
        i18Name.enUs = legacyUser.enName;
        user.i18Name = i18Name;
        LegacyUser.I18Name i18Name2 = legacyUser.i18Name;
        Map<String, SessionInfo> map = null;
        if (i18Name2 != null) {
            String[] strArr = {i18Name.enUs, i18Name2.enUs};
            int i = 0;
            while (true) {
                if (i >= 2) {
                    str2 = null;
                    break;
                }
                str2 = strArr[i];
                if (C49167b.m193878a(str2)) {
                    break;
                }
                i++;
            }
            if (str2 == null) {
                str2 = "";
            }
            i18Name.enUs = str2;
            String str3 = i18Name2.jaJp;
            if (str3 == null) {
                str3 = "";
            }
            i18Name.jaJp = str3;
            String str4 = i18Name2.zhCn;
            if (str4 == null) {
                str4 = "";
            }
            i18Name.zhCn = str4;
        }
        user.setStatus(0);
        if (legacyUser.tenant != null) {
            Tenant tenant = new Tenant();
            LegacyTenant legacyTenant = legacyUser.tenant;
            if (legacyTenant != null) {
                tenant.tenantId = legacyTenant.tenantId;
                tenant.name = legacyTenant.name;
                tenant.iconUrl = legacyTenant.iconUrl;
                tenant.tag = legacyTenant.tag;
                tenant.tenantDomain = legacyTenant.tenantDomain;
                tenant.suiteFullDomain = legacyTenant.suiteFullDomain;
            }
            user.tenant = tenant;
        }
        user.avatarUrl = legacyUser.avatarUrl;
        user.avatarKey = legacyUser.avatarKey;
        user.createTime = 0;
        user.setLoginCredentialId(null);
        user.userUnit = legacyUser.userUnit;
        user.setExcludeLogin(false);
        user.configEnv = legacyUser.configEnv;
        user.setLastUseTimestamp(System.currentTimeMillis());
        user.setSession((String) LegacyDataManager.f162572a.mo222847a((Key) f162581c, (Object) ""));
        user.setCurrentEnv(legacyUser.configEnv);
        user.setLogoutToken((String) LegacyDataManager.f162572a.mo222847a((Key) f162582d, (Object) ""));
        user.setDeviceLoginId((String) LegacyDataManager.f162572a.mo222847a((Key) f162583e, (Object) ""));
        user.setAnonymous(false);
        if (loginInfo != null) {
            str = loginInfo.getUserId();
        } else {
            str = null;
        }
        if (Intrinsics.areEqual(str, legacyUser.userId) && loginInfo != null) {
            map = loginInfo.getSessionInfoMap();
        }
        user.setSessionWithDomainMap(map);
        return user;
    }
}
