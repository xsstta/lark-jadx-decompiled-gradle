package com.ss.android.lark.passport.infra.serviceimpl;

import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.google.gson.reflect.TypeToken;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.infra.base.p2426c.p2430d.C49067a;
import com.ss.android.lark.passport.infra.base.storage.IsolateStorage;
import com.ss.android.lark.passport.infra.base.storage.key.Key;
import com.ss.android.lark.passport.infra.listenermanage.UserListChangeListenerManager;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ICommonService;
import com.ss.android.lark.passport.infra.service.ILegacyUserListStorageService;
import com.ss.android.lark.passport.infra.service.IUserListService;
import com.ss.android.lark.passport.infra.service.IUserListStorageService;
import com.ss.android.lark.passport.infra.service.IUserService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49224w;
import com.ss.android.lark.passport.infra.util.p2440b.C49160a;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.util.share_preference.UserSP;
import com.ss.android.lark.utils.LarkContext;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import kotlin.sequences.C69294l;
import kotlin.text.StringsKt;

@ClaymoreImpl(IUserListService.class)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 P2\u00020\u0001:\u0001PB\u0005¢\u0006\u0002\u0010\u0002J.\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u001e\u0010\u001c\u001a\u00020\u001d2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0002J\u0016\u0010\u001f\u001a\u00020\u001d2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0012H\u0002J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u0012H\u0016J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00190\u0012H\u0016J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u0016H\u0016J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\u0012H\u0016J\n\u0010$\u001a\u0004\u0018\u00010\bH\u0016J\n\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0014\u0010'\u001a\u0004\u0018\u00010&2\b\u0010(\u001a\u0004\u0018\u00010\u0019H\u0016J$\u0010)\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00190*j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0019`+H\u0016J\u0012\u0010,\u001a\u00020\n2\b\u0010(\u001a\u0004\u0018\u00010\u0019H\u0016J&\u0010-\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\u00192\n\b\u0002\u0010/\u001a\u0004\u0018\u0001002\b\b\u0002\u00101\u001a\u00020\nH\u0002J4\u00102\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\u00192\u0018\b\u0002\u00103\u001a\u0012\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u000105\u0018\u0001042\b\b\u0002\u00101\u001a\u00020\nH\u0002J\u001a\u00106\u001a\u00020\u001d2\b\u0010(\u001a\u0004\u0018\u00010\u00192\u0006\u00107\u001a\u00020\nH\u0016J\u001e\u00108\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\u0006\u0010(\u001a\u00020\u00192\u0006\u00109\u001a\u00020\u0004H\u0016J\u0010\u0010:\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020\bH\u0016J\u0016\u0010<\u001a\u00020\u001d2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\b0\u0016H\u0016J\b\u0010>\u001a\u00020\u001dH\u0002J\b\u0010?\u001a\u00020\u001dH\u0016J\u0016\u0010@\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010A\u001a\u00020\u0019H\u0016J\u001c\u0010B\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00190DH\u0016J\u0012\u0010E\u001a\u00020\u001d2\b\u0010(\u001a\u0004\u0018\u00010\u0019H\u0016J\u0012\u0010F\u001a\u00020\u001d2\b\u0010;\u001a\u0004\u0018\u00010\bH\u0016J.\u0010F\u001a\u00020\u001d2\b\u0010(\u001a\u0004\u0018\u00010\u00192\u0006\u0010G\u001a\u00020\u00192\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d0IH\u0016J\u001c\u0010J\u001a\u00020\u001d2\u0012\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000404H\u0016J\u0016\u0010L\u001a\u00020\u001d2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020\b0\u0012H\u0016J\b\u0010N\u001a\u00020\u001dH\u0002J\f\u0010O\u001a\u00020\u001d*\u00020\bH\u0002R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00128BX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006Q"}, d2 = {"Lcom/ss/android/lark/passport/infra/serviceimpl/UserListService;", "Lcom/ss/android/lark/passport/infra/service/IUserListService;", "()V", "firstInvalidUserIndex", "", "getFirstInvalidUserIndex", "()I", "foregroundUser", "Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "hasInvalidUser", "", "getHasInvalidUser", "()Z", "logger", "Lcom/ss/android/lark/passport/infra/log/PassportLog;", "storageService", "Lcom/ss/android/lark/passport/infra/service/IUserListStorageService;", "users", "", "getUsers", "()Ljava/util/List;", "addOrUpdateUsers", "", "loginUsers", "activeUserId", "", ShareHitPoint.f121868c, "Lcom/ss/android/lark/passport/infra/service/IUserListService$UserLoginSource;", "addUsers", "", "cleanIfNeeded", "dispatchUserListChanged", "getAllExpiredUserList", "getAllSessions", "getAllUserList", "getAllValidUserList", "getForegroundUser", "getForegroundUserService", "Lcom/ss/android/lark/passport/infra/service/IUserService;", "getUserService", "userId", "getValidUserSessionMap", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "isUserHasValidSession", "loge", "msg", "e", "", "localLog", "logi", "params", "", "", "moveUserToForeground", "dispatchChangeEvent", "moveUserToIndex", "toIndex", "onUserMigrationCompleted", "user", "onUserSessionInvalid", "newInvalidUsers", "readForegroundUserFromLocal", "removeAllUsers", "removeUserById", "removedUserId", "removeUsersById", "removedUserIds", "", "switchUser", "updateUser", "updateMsg", "updater", "Lkotlin/Function1;", "updateUserStatus", "statusByUser", "updateUsers", "updatedUsers", "useNewStorageService", "refreshLastUseTimestamp", "Companion", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class UserListService implements IUserListService {
    public static final Companion Companion = new Companion(null);
    private static final Key<IUserService> KeyUserService = new C49130a("IUserService");
    private volatile User foregroundUser;
    private final PassportLog logger = PassportLog.f123351c.mo171474a();
    public volatile IUserListStorageService storageService;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n¸\u0006\u0000"}, d2 = {"com/ss/android/lark/passport/infra/base/storage/key/Key$Companion$newKey$1", "Lcom/ss/android/lark/passport/infra/base/storage/key/Key;", "key", "", "getKey", "()Ljava/lang/String;", ShareHitPoint.f121869d, "Ljava/lang/reflect/Type;", "getType", "()Ljava/lang/reflect/Type;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.serviceimpl.UserListService$a */
    public static final class C49130a implements Key<IUserService> {

        /* renamed from: b */
        final /* synthetic */ String f123387b;

        /* renamed from: c */
        private final String f123388c;

        @Override // com.ss.android.lark.passport.infra.base.storage.key.Key
        /* renamed from: a */
        public String mo171118a() {
            return this.f123388c;
        }

        @Override // com.ss.android.lark.passport.infra.base.storage.key.Key
        /* renamed from: b */
        public Type mo171119b() {
            Type type = new TypeToken<IUserService>() {
                /* class com.ss.android.lark.passport.infra.serviceimpl.UserListService.C49130a.C491311 */
            }.getType();
            Intrinsics.checkExpressionValueIsNotNull(type, "object : TypeToken<T>() {}.type");
            return type;
        }

        public C49130a(String str) {
            this.f123387b = str;
            this.f123388c = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/passport/infra/serviceimpl/UserListService$Companion;", "", "()V", "KeyUserService", "Lcom/ss/android/lark/passport/infra/base/storage/key/Key;", "Lcom/ss/android/lark/passport/infra/service/IUserService;", "TAG", "", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.serviceimpl.UserListService$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/passport/infra/serviceimpl/UserService;", "invoke", "com/ss/android/lark/passport/infra/serviceimpl/UserListService$getUserService$2$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.serviceimpl.UserListService$e */
    public static final class C49134e extends Lambda implements Function0<UserService> {
        final /* synthetic */ String $userId$inlined;
        final /* synthetic */ UserListService this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49134e(UserListService userListService, String str) {
            super(0);
            this.this$0 = userListService;
            this.$userId$inlined = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final UserService invoke() {
            return new UserService(this.$userId$inlined, this.this$0.storageService);
        }
    }

    private final boolean getHasInvalidUser() {
        boolean z;
        synchronized (this) {
            if (getFirstInvalidUserIndex() >= 0) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    private final List<User> getUsers() {
        List<User> readUsers;
        synchronized (this) {
            readUsers = this.storageService.readUsers();
        }
        return readUsers;
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserListService
    public List<User> getAllUserList() {
        List<User> mutableList;
        synchronized (this) {
            mutableList = CollectionsKt.toMutableList((Collection) getUsers());
        }
        return mutableList;
    }

    static {
        Key.Companion aVar = Key.f123153a;
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserListService
    public IUserService getForegroundUserService() {
        String str;
        IUserService userService;
        synchronized (this) {
            User foregroundUser2 = getForegroundUser();
            if (foregroundUser2 != null) {
                str = foregroundUser2.userId;
            } else {
                str = null;
            }
            userService = getUserService(str);
        }
        return userService;
    }

    private final int getFirstInvalidUserIndex() {
        int i;
        synchronized (this) {
            i = 0;
            Iterator<User> it = getUsers().iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (!it.next().hasValidSession()) {
                    break;
                } else {
                    i++;
                }
            }
        }
        return i;
    }

    public List<User> getAllExpiredUserList() {
        ArrayList arrayList;
        synchronized (this) {
            ArrayList arrayList2 = new ArrayList();
            for (T t : getUsers()) {
                if (!isUserHasValidSession(t.userId)) {
                    arrayList2.add(t);
                }
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserListService
    public List<String> getAllSessions() {
        List<String> i;
        synchronized (this) {
            i = C69294l.m266145i(C69294l.m266131a(C69294l.m266142f(CollectionsKt.asSequence(getUsers()), C49132c.INSTANCE), (Function1) C49133d.INSTANCE));
        }
        return i;
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserListService
    public List<User> getAllValidUserList() {
        ArrayList arrayList;
        synchronized (this) {
            ArrayList arrayList2 = new ArrayList();
            for (T t : getUsers()) {
                if (isUserHasValidSession(t.userId)) {
                    arrayList2.add(t);
                }
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserListService
    public User getForegroundUser() {
        T t;
        T t2;
        synchronized (this) {
            if (C49224w.m194054b(LarkContext.getApplication())) {
                t = this.foregroundUser;
            } else {
                Iterator<T> it = getUsers().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t2 = null;
                        break;
                    }
                    t2 = it.next();
                    if (Intrinsics.areEqual(t2.userId, this.storageService.getLastUserId())) {
                        break;
                    }
                }
                t = t2;
            }
        }
        return t;
    }

    public UserListService() {
        boolean z;
        IUserListStorageService iUserListStorageService;
        String str;
        ICommonService c = ServiceFinder.m193748c();
        if (c.isAccountRedesignMigrationCompleted() || !c.hasLegacyUser()) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            ServiceFinder rVar = ServiceFinder.f123386a;
            iUserListStorageService = (IUserListStorageService) ServiceFinder.m193746a(IUserListStorageService.class);
        } else {
            ServiceFinder rVar2 = ServiceFinder.f123386a;
            iUserListStorageService = (IUserListStorageService) ServiceFinder.m193746a(ILegacyUserListStorageService.class);
        }
        this.storageService = iUserListStorageService;
        logi$default(this, "init, using legacy storage? " + z, null, false, 6, null);
        readForegroundUserFromLocal();
        StringBuilder sb = new StringBuilder();
        sb.append("init, foreground user: ");
        User user = this.foregroundUser;
        if (user != null) {
            str = user.userId;
        } else {
            str = null;
        }
        sb.append(str);
        logi$default(this, sb.toString(), null, false, 6, null);
    }

    private final void cleanIfNeeded() {
        boolean z;
        synchronized (this) {
            List<User> users = getUsers();
            if (!(users instanceof Collection) || !users.isEmpty()) {
                Iterator<T> it = users.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().hasValidSession()) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = false;
            if (!z) {
                logi$default(this, "cleanIfNeeded, no more valid user", null, false, 6, null);
                moveUserToForeground(null, false);
                this.storageService.clean();
                useNewStorageService();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    private final void useNewStorageService() {
        synchronized (this) {
            if (this.storageService instanceof ILegacyUserListStorageService) {
                logi$default(this, "replace to new storage service", null, false, 6, null);
                Iterator<T> it = getUsers().iterator();
                while (it.hasNext()) {
                    IsolateStorage aVar = IsolateStorage.f123105c;
                    String str = it.next().userId;
                    Intrinsics.checkExpressionValueIsNotNull(str, "it.userId");
                    C49067a.m193337a(aVar, str, null, 2, null).mo171266d().mo171262e(KeyUserService);
                }
                this.storageService.clean();
                ServiceFinder rVar = ServiceFinder.f123386a;
                this.storageService = (IUserListStorageService) ServiceFinder.m193746a(IUserListStorageService.class);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserListService
    public LinkedHashMap<User, String> getValidUserSessionMap() {
        LinkedHashMap<User, String> linkedHashMap;
        boolean z;
        synchronized (this) {
            linkedHashMap = new LinkedHashMap<>();
            for (T t : getAllValidUserList()) {
                String session = t.getSession();
                String str = session;
                if (str != null) {
                    if (!StringsKt.isBlank(str)) {
                        z = false;
                        if (!z && t.hasValidSession()) {
                            linkedHashMap.put(t, session);
                        }
                    }
                }
                z = true;
                linkedHashMap.put(t, session);
            }
        }
        return linkedHashMap;
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserListService
    public void removeAllUsers() {
        synchronized (this) {
            List<User> users = getUsers();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(users, 10));
            Iterator<T> it = users.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().userId);
            }
            ArrayList arrayList2 = arrayList;
            logi$default(this, "removeAllUsers, user ids: " + arrayList2, null, false, 6, null);
            removeUsersById(arrayList2);
            cleanIfNeeded();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a8 A[EDGE_INSN: B:22:0x00a8->B:19:0x00a8 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void readForegroundUserFromLocal() {
        /*
        // Method dump skipped, instructions count: 173
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.passport.infra.serviceimpl.UserListService.readForegroundUserFromLocal():void");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.serviceimpl.UserListService$f */
    public static final class C49135f extends Lambda implements Function1<User, Unit> {
        public static final C49135f INSTANCE = new C49135f();

        C49135f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(User user) {
            invoke(user);
            return Unit.INSTANCE;
        }

        public final void invoke(User user) {
            Intrinsics.checkParameterIsNotNull(user, "it");
            user.setLastUseTimestamp(System.currentTimeMillis());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.serviceimpl.UserListService$c */
    static final class C49132c extends Lambda implements Function1<User, String> {
        public static final C49132c INSTANCE = new C49132c();

        C49132c() {
            super(1);
        }

        public final String invoke(User user) {
            Intrinsics.checkParameterIsNotNull(user, "it");
            return user.getSession();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.serviceimpl.UserListService$d */
    static final class C49133d extends Lambda implements Function1<String, Boolean> {
        public static final C49133d INSTANCE = new C49133d();

        C49133d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Boolean invoke(String str) {
            return Boolean.valueOf(invoke(str));
        }

        public final boolean invoke(String str) {
            Intrinsics.checkParameterIsNotNull(str, "it");
            return !StringsKt.isBlank(str);
        }
    }

    private final void refreshLastUseTimestamp(User user) {
        updateUser(user.userId, "update last use timestamp", C49135f.INSTANCE);
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserListService
    public void updateUser(User user) {
        if (user != null) {
            updateUsers(CollectionsKt.listOf(user));
        }
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserListService
    public boolean isUserHasValidSession(String str) {
        User e;
        IUserService userService = getUserService(str);
        if (userService == null || (e = userService.mo171597e()) == null) {
            return false;
        }
        return e.hasValidSession();
    }

    public List<User> removeUserById(String str) {
        Intrinsics.checkParameterIsNotNull(str, "removedUserId");
        return removeUsersById(CollectionsKt.mutableListOf(str));
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserListService
    public void switchUser(String str) {
        if (str != null) {
            synchronized (this) {
                moveUserToForeground(str, false);
                moveUserToIndex(str, 0);
            }
            return;
        }
        loge$default(this, "switchUser, user id is null", null, false, 6, null);
    }

    private final void dispatchUserListChanged(List<? extends User> list) {
        String str;
        T t;
        synchronized (this) {
            User user = this.foregroundUser;
            if (user != null && (str = user.userId) != null) {
                Iterator<T> it = list.iterator();
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
                T t2 = t;
                if (t2 != null) {
                    this.foregroundUser = t2;
                }
                Unit unit = Unit.INSTANCE;
                UserListChangeListenerManager.m193640a(list);
            }
        }
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserListService
    public void onUserMigrationCompleted(User user) {
        Intrinsics.checkParameterIsNotNull(user, "user");
        synchronized (this) {
            logi$default(this, "onUserMigrationCompleted, user: " + user, null, false, 6, null);
            useNewStorageService();
            this.storageService.userMigrated(user);
            moveUserToForeground(user.userId, true);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserListService
    public void updateUserStatus(Map<String, Integer> map) {
        Intrinsics.checkParameterIsNotNull(map, "statusByUser");
        synchronized (this) {
            boolean updateUserStatus = this.storageService.updateUserStatus(map);
            logi$default(this, "updateUserStatus, statusByUser: " + map + ", changed: " + updateUserStatus, null, false, 6, null);
            if (updateUserStatus) {
                dispatchUserListChanged(getUsers());
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserListService
    public void updateUsers(List<? extends User> list) {
        Intrinsics.checkParameterIsNotNull(list, "updatedUsers");
        synchronized (this) {
            StringBuilder sb = new StringBuilder();
            sb.append("updateUsers, updated users: ");
            List<User> users = getUsers();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(users, 10));
            Iterator<T> it = users.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().userId);
            }
            sb.append(arrayList);
            logi$default(this, sb.toString(), null, false, 6, null);
            this.storageService.updateUsers(list);
            dispatchUserListChanged(getAllUserList());
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserListService
    public IUserService getUserService(String str) {
        T t;
        if (str != null) {
            synchronized (this) {
                Iterator<T> it = getUsers().iterator();
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
                if (t == null) {
                    loge$default(this, "user not found, userId = " + str + ", users = " + getUsers(), null, false, 6, null);
                    return null;
                }
                return (IUserService) C49067a.m193337a(IsolateStorage.f123105c, str, null, 2, null).mo171266d().mo171244a((Key) KeyUserService, (Function0) new C49134e(this, str));
            }
        }
        if (getForegroundUser() != null) {
            loge$default(this, "get user service userId = null", null, false, 6, null);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bc, code lost:
        if (kotlin.collections.CollectionsKt.contains(r13, r1) != false) goto L_0x00be;
     */
    @Override // com.ss.android.lark.passport.infra.service.IUserListService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.ss.android.lark.passport.signinsdk_api.account.User> removeUsersById(java.util.Collection<java.lang.String> r13) {
        /*
        // Method dump skipped, instructions count: 214
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.passport.infra.serviceimpl.UserListService.removeUsersById(java.util.Collection):java.util.List");
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserListService
    public void onUserSessionInvalid(List<User> list) {
        int i;
        Intrinsics.checkParameterIsNotNull(list, "newInvalidUsers");
        if (!list.isEmpty()) {
            synchronized (this) {
                StringBuilder sb = new StringBuilder();
                sb.append("onUserSessionInvalid, start, input users: ");
                List<User> list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().userId);
                }
                sb.append(arrayList);
                logi$default(this, sb.toString(), null, false, 6, null);
                Iterator<User> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (!it2.next().hasValidSession()) {
                        it2.remove();
                    }
                }
                if (list.isEmpty()) {
                    logi$default(this, "onUserSessionInvalid, all input users already invalid, skip", null, false, 6, null);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onUserSessionInvalid, new invalid users: ");
                List<User> list3 = list;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                Iterator<T> it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(it3.next().userId);
                }
                sb2.append(arrayList2);
                logi$default(this, sb2.toString(), null, false, 6, null);
                for (T t : list) {
                    List<User> users = getUsers();
                    ListIterator<User> listIterator = users.listIterator(users.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            if (listIterator.previous().hasValidSession()) {
                                i = listIterator.nextIndex();
                                break;
                            }
                        } else {
                            i = -1;
                            break;
                        }
                    }
                    if (i >= 0) {
                        IUserListStorageService iUserListStorageService = this.storageService;
                        String str = t.userId;
                        Intrinsics.checkExpressionValueIsNotNull(str, "it.userId");
                        iUserListStorageService.moveUser(str, i);
                    }
                    t.setSessionValid(false);
                }
                this.storageService.updateUsers(list);
                List<User> allUserList = getAllUserList();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("onUserSessionInvalid end, user valid map: ");
                List<User> allUserList2 = getAllUserList();
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(allUserList2, 10)), 16));
                for (T t2 : allUserList2) {
                    linkedHashMap.put(t2.userId, Boolean.valueOf(t2.hasValidSession()));
                }
                sb3.append(linkedHashMap);
                logi$default(this, sb3.toString(), null, false, 6, null);
                dispatchUserListChanged(allUserList);
                cleanIfNeeded();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public List<User> moveUserToIndex(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        synchronized (this) {
            logi$default(this, "move user " + str + " to index = " + i, null, false, 6, null);
            int i2 = 0;
            Iterator<User> it = getUsers().iterator();
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                } else if (Intrinsics.areEqual(it.next().userId, str)) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == i) {
                return getAllUserList();
            }
            List<User> mutableList = CollectionsKt.toMutableList((Collection) this.storageService.moveUser(str, i));
            dispatchUserListChanged(mutableList);
            return mutableList;
        }
    }

    public void moveUserToForeground(String str, boolean z) {
        String str2;
        T t;
        synchronized (this) {
            logi$default(this, "moveUserToForeground, user: " + str, null, false, 6, null);
            Iterator<T> it = getUsers().iterator();
            while (true) {
                str2 = null;
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (Intrinsics.areEqual(t.userId, str)) {
                    break;
                }
            }
            T t2 = t;
            if (Intrinsics.areEqual(this.foregroundUser, t2)) {
                logi$default(this, "moveUserToForeground, user: " + str + " already in foreground, skip", null, false, 6, null);
                return;
            }
            logi$default(this, "moveUserToForeground, foregroundUser changed, previous = " + this.foregroundUser + " new = " + ((Object) t2), null, false, 6, null);
            this.foregroundUser = t2;
            if (t2 != null) {
                refreshLastUseTimestamp(t2);
            }
            IUserListStorageService iUserListStorageService = this.storageService;
            if (t2 != null) {
                str2 = t2.userId;
            }
            iUserListStorageService.setLastUserId(str2);
            if (z) {
                dispatchUserListChanged(getAllUserList());
            }
            Unit unit = Unit.INSTANCE;
            UserSP.resetInstance();
            StringBuilder sb = new StringBuilder();
            sb.append("moveUserToForeground, UserSP.resetInstance end, spNameSuffix = ");
            UserSP instance = UserSP.getInstance();
            Intrinsics.checkExpressionValueIsNotNull(instance, "UserSP.getInstance()");
            sb.append(instance.getSpNameSuffix());
            logi$default(this, sb.toString(), null, false, 6, null);
        }
    }

    private final void addUsers(List<? extends User> list, IUserListService.UserLoginSource userLoginSource) {
        IUserListStorageService.BlockListOp blockListOp;
        int i;
        Object obj;
        List<? extends User> list2 = list;
        ArrayList arrayList = new ArrayList();
        for (T t : list2) {
            if (t.hasValidSession()) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = arrayList;
        StringBuilder sb = new StringBuilder();
        sb.append("addUsers, validNewUsers: ");
        ArrayList<User> arrayList3 = arrayList2;
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
        for (User user : arrayList3) {
            arrayList4.add(user.userId);
        }
        sb.append(arrayList4);
        logi$default(this, sb.toString(), null, false, 6, null);
        ArrayList arrayList5 = new ArrayList();
        for (T t2 : getAllExpiredUserList()) {
            Iterator it = arrayList3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((User) obj).userId, t2.userId)) {
                    break;
                }
            }
            if (obj != null) {
                arrayList5.add(t2);
            }
        }
        if (!arrayList5.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("addUsers, invalidToValidUsers: ");
            ArrayList<User> arrayList6 = arrayList5;
            ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList6, 10));
            for (User user2 : arrayList6) {
                arrayList7.add(user2.userId);
            }
            sb2.append(arrayList7);
            logi$default(this, sb2.toString(), null, false, 6, null);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List<User> allExpiredUserList = getAllExpiredUserList();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(allExpiredUserList, 10)), 16));
            for (T t3 : allExpiredUserList) {
                linkedHashMap2.put(t3.userId, C49160a.m193857b(t3.getSession()));
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList6, 10)), 16));
            for (Object obj2 : arrayList6) {
                linkedHashMap3.put(((User) obj2).userId, obj2);
            }
            LinkedHashMap linkedHashMap4 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap3.size()));
            for (Map.Entry entry : linkedHashMap3.entrySet()) {
                linkedHashMap4.put(entry.getKey(), TuplesKt.to(linkedHashMap2.get(entry.getKey()), C49160a.m193857b(((User) entry.getValue()).getSession())));
            }
            linkedHashMap.put("compared_session_map", linkedHashMap4);
            logi$default(this, "addUsers, invalidToValidUsers", linkedHashMap, false, 4, null);
        }
        IUserListStorageService iUserListStorageService = this.storageService;
        ArrayList<User> arrayList8 = arrayList5;
        ArrayList arrayList9 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList8, 10));
        for (User user3 : arrayList8) {
            arrayList9.add(user3.userId);
        }
        iUserListStorageService.removeUsersById(arrayList9, IUserListStorageService.BlockListOp.Noop);
        ArrayList arrayList10 = new ArrayList();
        for (T t4 : list2) {
            if (!t4.hasValidSession()) {
                arrayList10.add(t4);
            }
        }
        ArrayList arrayList11 = arrayList10;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("addUsers, invalidNewUsers: ");
        ArrayList<User> arrayList12 = arrayList11;
        ArrayList arrayList13 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList12, 10));
        for (User user4 : arrayList12) {
            arrayList13.add(user4.userId);
        }
        sb3.append(arrayList13);
        logi$default(this, sb3.toString(), null, false, 6, null);
        int i2 = C49136a.f123389a[userLoginSource.ordinal()];
        if (i2 == 1 || i2 == 2) {
            blockListOp = IUserListStorageService.BlockListOp.Filter;
        } else if (i2 == 3) {
            blockListOp = IUserListStorageService.BlockListOp.RemoveFromBlockList;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        List<User> users = getUsers();
        ListIterator<User> listIterator = users.listIterator(users.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (listIterator.previous().hasValidSession()) {
                    i = listIterator.nextIndex();
                    break;
                }
            } else {
                i = -1;
                break;
            }
        }
        this.storageService.addOrUpdateUsers(i + 1, arrayList2, blockListOp);
        this.storageService.addOrUpdateUsers(arrayList11, blockListOp);
    }

    private final void loge(String str, Throwable th, boolean z) {
        if (z) {
            Log.m165389i("n_action_user_manager", str);
        } else {
            this.logger.mo171462a("n_action_user_manager", str, th);
        }
    }

    private final void logi(String str, Map<String, Object> map, boolean z) {
        if (z) {
            Log.m165389i("n_action_user_manager", str);
        } else {
            this.logger.mo171467b("n_action_user_manager", str, map);
        }
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserListService
    public void updateUser(String str, String str2, Function1<? super User, Unit> function1) {
        T t;
        Intrinsics.checkParameterIsNotNull(str2, "updateMsg");
        Intrinsics.checkParameterIsNotNull(function1, "updater");
        synchronized (this) {
            Iterator<T> it = getUsers().iterator();
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
            T t2 = t;
            if (t2 != null) {
                function1.invoke(t2);
                updateUser(t2);
                logi$default(this, "updateTargetUser, user id: " + str + ", msg: " + str2, null, false, 6, null);
            } else {
                loge$default(this, "updateTargetUser, user: " + str + " not found", null, false, 6, null);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserListService
    public List<User> addOrUpdateUsers(List<User> list, String str, IUserListService.UserLoginSource userLoginSource) {
        List<User> allUserList;
        IUserService userService;
        Intrinsics.checkParameterIsNotNull(list, "loginUsers");
        Intrinsics.checkParameterIsNotNull(userLoginSource, ShareHitPoint.f121868c);
        synchronized (this) {
            StringBuilder sb = new StringBuilder();
            sb.append("addOrUpdateUsers by ");
            sb.append(userLoginSource);
            sb.append(", users: ");
            List<User> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().userId);
            }
            sb.append(arrayList);
            sb.append(", active: ");
            sb.append(str);
            logi$default(this, sb.toString(), null, false, 6, null);
            if (userLoginSource != IUserListService.UserLoginSource.ByLogin) {
                List<User> users = getUsers();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(users, 10));
                Iterator<T> it2 = users.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(it2.next().userId);
                }
                Set set = CollectionsKt.toSet(arrayList2);
                for (User user : list) {
                    if (set.contains(user.userId) && (userService = getUserService(user.userId)) != null) {
                        userService.mo171596a(user);
                    }
                }
            } else {
                List<User> list3 = list;
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list3, 10)), 16));
                for (T t : list3) {
                    linkedHashMap.put(t.userId, C49160a.m193857b(t.getSession()));
                }
                logi$default(this, "addOrUpdateUsers, sessions", MapsKt.mutableMapOf(TuplesKt.to("session by user", linkedHashMap)), false, 4, null);
            }
            addUsers(list, userLoginSource);
            if (getForegroundUser() == null) {
                moveUserToForeground(str, false);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("after add users, valid users: ");
            List<User> allValidUserList = getAllValidUserList();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(allValidUserList, 10));
            Iterator<T> it3 = allValidUserList.iterator();
            while (it3.hasNext()) {
                arrayList3.add(it3.next().userId);
            }
            sb2.append(arrayList3);
            sb2.append(", invalid users: ");
            List<User> allExpiredUserList = getAllExpiredUserList();
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(allExpiredUserList, 10));
            Iterator<T> it4 = allExpiredUserList.iterator();
            while (it4.hasNext()) {
                arrayList4.add(it4.next().userId);
            }
            sb2.append(arrayList4);
            logi$default(this, sb2.toString(), null, false, 6, null);
            allUserList = getAllUserList();
            dispatchUserListChanged(allUserList);
        }
        return allUserList;
    }

    static /* synthetic */ void loge$default(UserListService userListService, String str, Throwable th, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        userListService.loge(str, th, z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.passport.infra.serviceimpl.UserListService */
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void logi$default(UserListService userListService, String str, Map map, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        userListService.logi(str, map, z);
    }
}
