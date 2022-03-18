package com.ss.lark.android.passport.biz.service.impl;

import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.google.gson.reflect.TypeToken;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.passport.infra.base.p2426c.p2430d.C49067a;
import com.ss.android.lark.passport.infra.base.storage.IsolateStorage;
import com.ss.android.lark.passport.infra.base.storage.key.Key;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ILegacyUserListStorageService;
import com.ss.android.lark.passport.infra.service.IUserListStorageService;
import com.ss.android.lark.passport.infra.util.C49202p;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.entity.LoginInfo;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.C57852m;
import com.ss.android.lark.utils.LarkContext;
import com.ss.lark.android.passport.biz.account.UserGlobalKeys;
import com.ss.lark.android.passport.biz.account.UserInfoKeys;
import com.ss.lark.android.passport.biz.account.migration.LegacyDataManager;
import com.ss.lark.android.passport.biz.account.migration.bean.LegacyUser;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@ClaymoreImpl(ILegacyUserListStorageService.class)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001+B\u0005¢\u0006\u0002\u0010\u0002J,\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0016J$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011H\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\tH\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J$\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0016J$\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u001d2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\u001e\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0007H\u0016J\u001c\u0010!\u001a\u00020\"2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0$H\u0016J\u0016\u0010%\u001a\u00020\u000e2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0010\u0010'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u0007H\u0016J\u0014\u0010)\u001a\u0004\u0018\u00010*2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/ss/lark/android/passport/biz/service/impl/LegacyUserListStorageService;", "Lcom/ss/android/lark/passport/infra/service/ILegacyUserListStorageService;", "()V", "legacyUser", "Lcom/ss/lark/android/passport/biz/account/migration/bean/LegacyUser;", "addOrUpdateUsers", "", "Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "index", "", "addedUsers", "op", "Lcom/ss/android/lark/passport/infra/service/IUserListStorageService$BlockListOp;", "clean", "", "cleanAllBlockUsers", "getLastUserId", "", "getLoginInfo", "Lcom/ss/android/lark/passport/signinsdk_api/entity/LoginInfo;", "userId", "getUser", "moveUser", "toIndex", "readUsers", "removeUsers", "removedUsers", "removeUsersById", "userIds", "", "setLastUserId", "updateUser", "updatedUser", "updateUserStatus", "", "statusByUser", "", "updateUsers", "updatedUsers", "userMigrated", "user", "userStorage", "Lcom/ss/lark/android/passport/biz/service/impl/LegacyUserStorageService;", "Companion", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class LegacyUserListStorageService implements ILegacyUserListStorageService {
    public static final Companion Companion = new Companion(null);
    private static final Key<LegacyUserStorageService> KeyILegacyUserInfoStorageService = new C65199a("LegacyUserStorageService");
    private LegacyUser legacyUser;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n¸\u0006\u0000"}, d2 = {"com/ss/android/lark/passport/infra/base/storage/key/Key$Companion$newKey$1", "Lcom/ss/android/lark/passport/infra/base/storage/key/Key;", "key", "", "getKey", "()Ljava/lang/String;", ShareHitPoint.f121869d, "Ljava/lang/reflect/Type;", "getType", "()Ljava/lang/reflect/Type;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.service.impl.LegacyUserListStorageService$a */
    public static final class C65199a implements Key<LegacyUserStorageService> {

        /* renamed from: b */
        final /* synthetic */ String f164162b;

        /* renamed from: c */
        private final String f164163c;

        @Override // com.ss.android.lark.passport.infra.base.storage.key.Key
        /* renamed from: a */
        public String mo171118a() {
            return this.f164163c;
        }

        @Override // com.ss.android.lark.passport.infra.base.storage.key.Key
        /* renamed from: b */
        public Type mo171119b() {
            Type type = new TypeToken<LegacyUserStorageService>() {
                /* class com.ss.lark.android.passport.biz.service.impl.LegacyUserListStorageService.C65199a.C652001 */
            }.getType();
            Intrinsics.checkExpressionValueIsNotNull(type, "object : TypeToken<T>() {}.type");
            return type;
        }

        public C65199a(String str) {
            this.f164162b = str;
            this.f164163c = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0002J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0007H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/lark/android/passport/biz/service/impl/LegacyUserListStorageService$Companion;", "", "()V", "KeyILegacyUserInfoStorageService", "Lcom/ss/android/lark/passport/infra/base/storage/key/Key;", "Lcom/ss/lark/android/passport/biz/service/impl/LegacyUserStorageService;", "TAG", "", "logUnexpectedInvoked", "", "method", "loge", "msg", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.service.impl.LegacyUserListStorageService$b */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        private final void m256043b(String str) {
            PassportLog.f123351c.mo171474a().mo171471d("LegacyUserListStorageService", str);
        }

        /* renamed from: a */
        public final void mo224412a(String str) {
            m256043b("unexpected method invoked: " + str);
            if (C57852m.m224554a(LarkContext.getApplication())) {
                throw new UnsupportedOperationException("unexpected method invoked: " + str);
            }
        }
    }

    public void cleanAllBlockUsers() {
        Companion.mo224412a("cleanAllBlockUsers");
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserListStorageService
    public String getLastUserId() {
        String str = (String) LegacyDataManager.f162572a.mo222847a((Key) UserGlobalKeys.f162499a, (Object) "");
        if (str != null) {
            return str;
        }
        return "";
    }

    static {
        Key.Companion aVar = Key.f123153a;
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserListStorageService
    public List<User> readUsers() {
        String str;
        LegacyUser legacyUser2 = this.legacyUser;
        if (legacyUser2 != null) {
            str = legacyUser2.userId;
        } else {
            str = null;
        }
        LegacyUserStorageService userStorage = userStorage(str);
        if (userStorage != null) {
            return CollectionsKt.listOf(userStorage.mo224464a());
        }
        return CollectionsKt.emptyList();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/lark/android/passport/biz/service/impl/LegacyUserStorageService;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.service.impl.LegacyUserListStorageService$c */
    public static final class C65201c extends Lambda implements Function0<LegacyUserStorageService> {
        final /* synthetic */ LegacyUser $localLegacyUser;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65201c(LegacyUser legacyUser) {
            super(0);
            this.$localLegacyUser = legacyUser;
        }

        @Override // kotlin.jvm.functions.Function0
        public final LegacyUserStorageService invoke() {
            return new LegacyUserStorageService(this.$localLegacyUser, (LoginInfo) C49202p.m193969a(C57744a.m224104a().getString(UserInfoKeys.f162530c.mo171118a(), ""), UserInfoKeys.f162530c.mo171119b()));
        }
    }

    public LegacyUserListStorageService() {
        LegacyUser legacyUser2 = (LegacyUser) C49202p.m193969a(LegacyDataManager.f162572a.mo222851b().mo222853a(UserInfoKeys.f162529b.mo171118a(), ""), (Type) LegacyUser.class);
        this.legacyUser = legacyUser2;
        if (legacyUser2 == null) {
            Companion.mo224412a("init, but user not found");
        }
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserListStorageService
    public void clean() {
        LegacyDataManager.f162572a.mo222846a().mo222854a(UserInfoKeys.f162530c.mo171118a());
        LegacyDataManager.f162572a.mo222851b().mo222854a("key_account_name");
        LegacyDataManager.f162572a.mo222851b().mo222854a("key_token");
        LegacyDataManager.f162572a.mo222851b().mo222854a("key_user");
        LegacyDataManager.f162572a.mo222851b().mo222854a("key_login_device_id");
        LegacyDataManager.f162572a.mo222851b().mo222854a("key_fast_switch_sessions");
        LegacyDataManager.f162572a.mo222851b().mo222854a("key_user_list");
        LegacyDataManager.f162572a.mo222851b().mo222854a("key_country_code");
        LegacyDataManager.f162572a.mo222851b().mo222854a("key_login_input_content");
        LegacyDataManager.f162572a.mo222851b().mo222854a("key_login_region_code");
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserListStorageService
    public LoginInfo getLoginInfo(String str) {
        LegacyUserStorageService userStorage = userStorage(str);
        if (userStorage != null) {
            return userStorage.mo224465b();
        }
        return null;
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserListStorageService
    public void setLastUserId(String str) {
        Companion bVar = Companion;
        bVar.mo224412a("setLastUserId, userId: " + str);
    }

    public void updateUser(User user) {
        Intrinsics.checkParameterIsNotNull(user, "updatedUser");
        Companion bVar = Companion;
        bVar.mo224412a("updateUser, updatedUser: " + user);
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserListStorageService
    public boolean updateUserStatus(Map<String, Integer> map) {
        Intrinsics.checkParameterIsNotNull(map, "statusByUser");
        Companion bVar = Companion;
        bVar.mo224412a("updateUserStatus, statusByUser: " + map);
        return false;
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserListStorageService
    public void updateUsers(List<? extends User> list) {
        Intrinsics.checkParameterIsNotNull(list, "updatedUsers");
        Companion bVar = Companion;
        bVar.mo224412a("updateUsers, updatedUsers: " + list);
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserListStorageService
    public void userMigrated(User user) {
        Intrinsics.checkParameterIsNotNull(user, "user");
        Companion bVar = Companion;
        bVar.mo224412a("userMigrated, user: " + user);
    }

    private final LegacyUserStorageService userStorage(String str) {
        boolean z;
        LegacyUser legacyUser2 = this.legacyUser;
        if (legacyUser2 == null) {
            return null;
        }
        String str2 = str;
        if (str2 == null || StringsKt.isBlank(str2)) {
            z = true;
        } else {
            z = false;
        }
        if (z || !Intrinsics.areEqual(str, legacyUser2.userId)) {
            return null;
        }
        return (LegacyUserStorageService) C49067a.m193335a(IsolateStorage.f123105c).mo171266d().mo171244a((Key) KeyILegacyUserInfoStorageService, (Function0) new C65201c(legacyUser2));
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserListStorageService
    public User getUser(String str) {
        T t;
        Intrinsics.checkParameterIsNotNull(str, "userId");
        Iterator<T> it = readUsers().iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (Intrinsics.areEqual(t.userId, str)) {
                break;
            }
        }
        return t;
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserListStorageService
    public List<User> moveUser(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        Companion bVar = Companion;
        bVar.mo224412a("moveUser, userId: " + str + ", to: " + i);
        return readUsers();
    }

    public List<User> removeUsers(List<? extends User> list, IUserListStorageService.BlockListOp blockListOp) {
        Intrinsics.checkParameterIsNotNull(list, "removedUsers");
        Intrinsics.checkParameterIsNotNull(blockListOp, "op");
        Companion bVar = Companion;
        bVar.mo224412a("removeUsers, removedUsers: " + list + ", op: " + blockListOp);
        return readUsers();
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserListStorageService
    public List<User> removeUsersById(Collection<String> collection, IUserListStorageService.BlockListOp blockListOp) {
        Intrinsics.checkParameterIsNotNull(collection, "userIds");
        Intrinsics.checkParameterIsNotNull(blockListOp, "op");
        Companion bVar = Companion;
        bVar.mo224412a("removeUsersById, userId: " + collection + ", op: " + blockListOp);
        return readUsers();
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserListStorageService
    public List<User> addOrUpdateUsers(List<? extends User> list, IUserListStorageService.BlockListOp blockListOp) {
        Intrinsics.checkParameterIsNotNull(list, "addedUsers");
        Intrinsics.checkParameterIsNotNull(blockListOp, "op");
        Companion bVar = Companion;
        bVar.mo224412a("addOrUpdateUsers, addedUsers: " + list + ", op: " + blockListOp);
        return readUsers();
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserListStorageService
    public List<User> addOrUpdateUsers(int i, List<? extends User> list, IUserListStorageService.BlockListOp blockListOp) {
        Intrinsics.checkParameterIsNotNull(list, "addedUsers");
        Intrinsics.checkParameterIsNotNull(blockListOp, "op");
        Companion bVar = Companion;
        bVar.mo224412a("addOrUpdateUsers, index: " + i + ", addedUsers: " + list + ", op: " + blockListOp);
        return readUsers();
    }
}
