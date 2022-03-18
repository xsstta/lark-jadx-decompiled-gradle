package com.ss.lark.android.passport.biz.account;

import android.util.SparseArray;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.google.gson.reflect.TypeToken;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.infra.base.p2426c.p2430d.C49067a;
import com.ss.android.lark.passport.infra.base.storage.IsolateStorage;
import com.ss.android.lark.passport.infra.base.storage.key.Key;
import com.ss.android.lark.passport.infra.base.storage.store.DataStorageDelegate;
import com.ss.android.lark.passport.infra.service.IUserListStorageService;
import com.ss.android.lark.passport.infra.util.C49224w;
import com.ss.android.lark.passport.infra.util.collection.AbstractC49181c;
import com.ss.android.lark.passport.infra.util.collection.C49184d;
import com.ss.android.lark.passport.infra.util.collection.ObservableArrayList;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.entity.LoginInfo;
import com.ss.android.lark.utils.LarkContext;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
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
import kotlin.text.StringsKt;

@ClaymoreImpl(IUserListStorageService.class)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001f\n\u0002\b\u0012\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 >2\u00020\u0001:\u0001>B\u0005¢\u0006\u0002\u0010\u0002J,\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J$\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u0016\u0010\u0017\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0005H\u0016J\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001d\u001a\u00020\u0005H\u0016J\u001e\u0010\u001f\u001a\u00020\u00152\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0!2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0010H\u0016J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0012\u0010%\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001d\u001a\u00020\u0005H\u0002J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH\u0002J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0002J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0016J\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH\u0002J\b\u0010+\u001a\u00020\u0015H\u0002J$\u0010,\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J$\u0010.\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00192\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0012\u0010/\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u00100\u001a\u00020\u00152\u0006\u00101\u001a\u00020\fH\u0016J\u001c\u00102\u001a\u00020\u00072\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001004H\u0016J\u0016\u00105\u001a\u00020\u00152\f\u00106\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0016J\u0010\u00107\u001a\u00020\u00152\u0006\u00108\u001a\u00020\fH\u0016J\u0014\u00109\u001a\u0004\u0018\u00010:2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010;\u001a\u00020\u0015H\u0002J\u0016\u0010<\u001a\u00020\u00152\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\f0\u0019H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lcom/ss/lark/android/passport/biz/account/UserListStorageService;", "Lcom/ss/android/lark/passport/infra/service/IUserListStorageService;", "()V", "blockedUserIdSet", "", "", "isInMainProgress", "", "storage", "Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorageDelegate;", "users", "Lcom/ss/android/lark/passport/infra/util/collection/ObservableArrayList;", "Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "addOrUpdateUsers", "", "index", "", "addedUsers", "op", "Lcom/ss/android/lark/passport/infra/service/IUserListStorageService$BlockListOp;", "clean", "", "cleanAllBlockUsers", "clearUsersById", "userIds", "", "getLastUserId", "getLoginInfo", "Lcom/ss/android/lark/passport/signinsdk_api/entity/LoginInfo;", "userId", "getUser", "handleBlockSetOp", "opUsers", "", "moveUser", "toIndex", "readBlockUserIdSet", "readUserFromDisk", "readUserIdList", "readUserList", "readUsers", "readUsersFromDisk", "userIdList", "registerUsersObserver", "removeUsers", "removedUsers", "removeUsersById", "setLastUserId", "updateUser", "updatedUser", "updateUserStatus", "statusByUser", "", "updateUsers", "updatedUsers", "userMigrated", "user", "userStorage", "Lcom/ss/lark/android/passport/biz/account/UserStorageService;", "writeBlockUserListToDisk", "writeUsers", "writtenUsers", "Companion", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class UserListStorageService implements IUserListStorageService {
    public static final Companion Companion = new Companion(null);
    private static final Key<UserStorageService> KeyIUserInfoStorageService = new C64284a("UserInfoStorageService");
    private final Set<String> blockedUserIdSet;
    private final boolean isInMainProgress;
    public final DataStorageDelegate storage = C49067a.m193335a(IsolateStorage.f123105c);
    public final ObservableArrayList<User> users;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n¸\u0006\u0000"}, d2 = {"com/ss/android/lark/passport/infra/base/storage/key/Key$Companion$newKey$1", "Lcom/ss/android/lark/passport/infra/base/storage/key/Key;", "key", "", "getKey", "()Ljava/lang/String;", ShareHitPoint.f121869d, "Ljava/lang/reflect/Type;", "getType", "()Ljava/lang/reflect/Type;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.account.UserListStorageService$a */
    public static final class C64284a implements Key<UserStorageService> {

        /* renamed from: b */
        final /* synthetic */ String f162495b;

        /* renamed from: c */
        private final String f162496c;

        @Override // com.ss.android.lark.passport.infra.base.storage.key.Key
        /* renamed from: a */
        public String mo171118a() {
            return this.f162496c;
        }

        @Override // com.ss.android.lark.passport.infra.base.storage.key.Key
        /* renamed from: b */
        public Type mo171119b() {
            Type type = new TypeToken<UserStorageService>() {
                /* class com.ss.lark.android.passport.biz.account.UserListStorageService.C64284a.C642851 */
            }.getType();
            Intrinsics.checkExpressionValueIsNotNull(type, "object : TypeToken<T>() {}.type");
            return type;
        }

        public C64284a(String str) {
            this.f162495b = str;
            this.f162496c = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/lark/android/passport/biz/account/UserListStorageService$Companion;", "", "()V", "KeyIUserInfoStorageService", "Lcom/ss/android/lark/passport/infra/base/storage/key/Key;", "Lcom/ss/lark/android/passport/biz/account/UserStorageService;", "TAG", "", "loge", "", "msg", "throwable", "", "logi", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.account.UserListStorageService$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo222768a(String str) {
            Log.m165389i("UserListStorageService", str);
        }

        /* renamed from: a */
        private final void m252799a(String str, Throwable th) {
            Log.m165384e("UserListStorageService", str, th);
        }

        /* renamed from: a */
        static /* synthetic */ void m252798a(Companion bVar, String str, Throwable th, int i, Object obj) {
            if ((i & 2) != 0) {
                th = null;
            }
            bVar.m252799a(str, th);
        }
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserListStorageService
    public String getLastUserId() {
        return UserInfoGlobalSpHelper.m252847a();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.account.UserListStorageService$c */
    public static final class C64286c extends Lambda implements Function0<Set<String>> {
        public static final C64286c INSTANCE = new C64286c();

        C64286c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Set<String> invoke() {
            return new LinkedHashSet();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.account.UserListStorageService$g */
    public static final class C64290g extends Lambda implements Function0<List<? extends String>> {
        public static final C64290g INSTANCE = new C64290g();

        C64290g() {
            super(0);
        }

        /* Return type fixed from 'java.util.List<java.lang.String>' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final List<? extends String> invoke() {
            return CollectionsKt.emptyList();
        }
    }

    private final Set<String> readBlockUserIdSet() {
        return (Set) this.storage.mo171244a((Key) UserGlobalKeys.f162503e, (Function0) C64286c.INSTANCE);
    }

    private final void registerUsersObserver() {
        this.users.addOnListChangedCallback(new C64287d(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "Lcom/ss/lark/android/passport/biz/account/UserStorageService;", "invoke", "com/ss/lark/android/passport/biz/account/UserListStorageService$userStorage$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.account.UserListStorageService$f */
    public static final class C64289f extends Lambda implements Function0<UserStorageService> {
        final /* synthetic */ String $userId$inlined;
        final /* synthetic */ UserListStorageService this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64289f(UserListStorageService userListStorageService, String str) {
            super(0);
            this.this$0 = userListStorageService;
            this.$userId$inlined = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final UserStorageService invoke() {
            return new UserStorageService(this.$userId$inlined, C49067a.m193337a(IsolateStorage.f123105c, this.$userId$inlined, null, 2, null));
        }
    }

    static {
        Key.Companion aVar = Key.f123153a;
    }

    private final List<String> readUserIdList() {
        List<String> list = (List) this.storage.mo171255c(UserGlobalKeys.f162500b);
        if (list != null) {
            return list;
        }
        return CollectionsKt.emptyList();
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserListStorageService
    public void clean() {
        synchronized (this) {
            Companion.mo222768a("clean");
            removeUsers(this.users, IUserListStorageService.BlockListOp.RemoveFromBlockList);
            cleanAllBlockUsers();
            setLastUserId(null);
            Unit unit = Unit.INSTANCE;
        }
    }

    public void cleanAllBlockUsers() {
        synchronized (this) {
            Companion.mo222768a("cleanAllBlockUsers");
            this.blockedUserIdSet.clear();
            writeBlockUserListToDisk();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserListStorageService
    public List<User> readUsers() {
        ObservableArrayList<User> observableArrayList;
        synchronized (this) {
            if (this.isInMainProgress) {
                observableArrayList = this.users;
            } else {
                observableArrayList = readUserList();
            }
        }
        return observableArrayList;
    }

    private final List<User> readUserList() {
        List<String> readUserIdList = readUserIdList();
        Companion bVar = Companion;
        bVar.mo222768a("userIdList read from disk, size:" + readUserIdList.size() + " content: " + readUserIdList);
        return readUsersFromDisk(readUserIdList);
    }

    private final void writeBlockUserListToDisk() {
        synchronized (this) {
            Companion bVar = Companion;
            bVar.mo222768a("writeBlockUserListToDisk, user id set: " + this.blockedUserIdSet);
            this.storage.mo171253b(UserGlobalKeys.f162503e, this.blockedUserIdSet);
        }
    }

    public UserListStorageService() {
        boolean b = C49224w.m194054b(LarkContext.getApplication());
        this.isInMainProgress = b;
        ObservableArrayList<User> observableArrayList = new ObservableArrayList<>();
        this.users = observableArrayList;
        this.blockedUserIdSet = new LinkedHashSet();
        if (b || C49224w.m194052a()) {
            registerUsersObserver();
        }
        observableArrayList.addAll(readUserList());
        Companion bVar = Companion;
        StringBuilder sb = new StringBuilder();
        sb.append("users read from disk, size: ");
        sb.append(observableArrayList.size());
        sb.append(", user is valid: ");
        ObservableArrayList<User> observableArrayList2 = observableArrayList;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(observableArrayList2, 10)), 16));
        for (User user : observableArrayList2) {
            linkedHashMap.put(user.userId, Boolean.valueOf(user.hasValidSession()));
        }
        sb.append(linkedHashMap);
        bVar.mo222768a(sb.toString());
        this.blockedUserIdSet.addAll(readBlockUserIdSet());
        Companion bVar2 = Companion;
        bVar2.mo222768a("blockUserIdSet read from disk, " + this.blockedUserIdSet);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/ss/lark/android/passport/biz/account/UserListStorageService$registerUsersObserver$observer$1", "Lcom/ss/android/lark/passport/infra/util/collection/ObservableList$WhateverOnListChangedCallback;", "Lcom/ss/android/lark/passport/infra/util/collection/ObservableArrayList;", "Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "onChanged", "", "sender", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.account.UserListStorageService$d */
    public static final class C64287d extends AbstractC49181c.AbstractC49183b<ObservableArrayList<User>> {

        /* renamed from: a */
        final /* synthetic */ UserListStorageService f162497a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C64287d(UserListStorageService userListStorageService) {
            this.f162497a = userListStorageService;
        }

        /* renamed from: a */
        public void mo171683a(ObservableArrayList<User> observableArrayList) {
            Intrinsics.checkParameterIsNotNull(observableArrayList, "sender");
            ObservableArrayList<User> observableArrayList2 = observableArrayList;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(observableArrayList2, 10));
            for (User user : observableArrayList2) {
                arrayList.add(user.userId);
            }
            ArrayList arrayList2 = arrayList;
            Companion bVar = UserListStorageService.Companion;
            bVar.mo222768a("write user id list, " + arrayList2);
            this.f162497a.storage.mo171253b(UserGlobalKeys.f162500b, arrayList2);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.account.UserListStorageService$e */
    public static final class C64288e extends Lambda implements Function1<User, Boolean> {
        final /* synthetic */ Set $userIdSet;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64288e(Set set) {
            super(1);
            this.$userIdSet = set;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Boolean invoke(User user) {
            return Boolean.valueOf(invoke(user));
        }

        public final boolean invoke(User user) {
            return this.$userIdSet.contains(user.userId);
        }
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserListStorageService
    public LoginInfo getLoginInfo(String str) {
        UserStorageService userStorage = userStorage(str);
        if (userStorage != null) {
            return userStorage.mo222773b();
        }
        return null;
    }

    public void updateUser(User user) {
        Intrinsics.checkParameterIsNotNull(user, "updatedUser");
        updateUsers(CollectionsKt.listOf(user));
    }

    private final void writeUsers(Collection<? extends User> collection) {
        for (T t : collection) {
            UserStorageService userStorage = userStorage(t.userId);
            if (userStorage != null) {
                userStorage.mo222772a((User) t);
            }
        }
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserListStorageService
    public void setLastUserId(String str) {
        Companion bVar = Companion;
        bVar.mo222768a("setLastUserId: " + str);
        UserInfoGlobalSpHelper.m252850b(str);
    }

    private final void clearUsersById(Collection<String> collection) {
        Companion bVar = Companion;
        bVar.mo222768a("clearUsersById, user ids: " + collection);
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            UserStorageService userStorage = userStorage(it.next());
            if (userStorage != null) {
                userStorage.mo222774c();
            }
        }
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserListStorageService
    public User getUser(String str) {
        T t;
        T t2;
        Intrinsics.checkParameterIsNotNull(str, "userId");
        synchronized (this) {
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
            t2 = t;
        }
        return t2;
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserListStorageService
    public void userMigrated(User user) {
        Intrinsics.checkParameterIsNotNull(user, "user");
        Companion bVar = Companion;
        bVar.mo222768a("userMigrated, user: " + user);
        addOrUpdateUsers(CollectionsKt.listOf(user), IUserListStorageService.BlockListOp.Filter);
    }

    private final User readUserFromDisk(String str) {
        User user;
        String str2;
        boolean z;
        UserStorageService userStorage = userStorage(str);
        if (userStorage != null) {
            user = userStorage.mo222771a();
        } else {
            user = null;
        }
        if (user != null) {
            str2 = user.userId;
        } else {
            str2 = null;
        }
        String str3 = str2;
        if (str3 == null || StringsKt.isBlank(str3)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return user;
        }
        Companion.m252798a(Companion, "readUserFromDisk, user: " + str + " not found", null, 2, null);
        return null;
    }

    private final List<User> readUsersFromDisk(List<String> list) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            User readUserFromDisk = readUserFromDisk(it.next());
            if (readUserFromDisk != null) {
                arrayList.add(readUserFromDisk);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            String str = ((User) obj).userId;
            if (str == null || StringsKt.isBlank(str)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    private final UserStorageService userStorage(String str) {
        boolean z;
        String str2 = str;
        if (str2 == null || StringsKt.isBlank(str2)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Companion.m252798a(Companion, "userId isNullOrBlank", null, 2, null);
            return null;
        }
        synchronized (this) {
            if (!((List) this.storage.mo171244a((Key) UserGlobalKeys.f162500b, (Function0) C64290g.INSTANCE)).contains(str)) {
                Companion bVar = Companion;
                Companion.m252798a(bVar, "user not found, userId = " + str, null, 2, null);
                return null;
            }
            return (UserStorageService) C49067a.m193337a(IsolateStorage.f123105c, str, null, 2, null).mo171266d().mo171244a((Key) KeyIUserInfoStorageService, (Function0) new C64289f(this, str));
        }
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserListStorageService
    public boolean updateUserStatus(Map<String, Integer> map) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(map, "statusByUser");
        synchronized (this) {
            z = false;
            for (User user : this.users) {
                Integer num = map.get(user.userId);
                if (num != null) {
                    int intValue = num.intValue();
                    Intrinsics.checkExpressionValueIsNotNull(user, "it");
                    int status = user.getStatus();
                    if (status != intValue) {
                        user.setStatus(intValue);
                        z = true;
                        Companion bVar = Companion;
                        bVar.mo222768a("user: " + user.userId + " status from " + status + " to " + intValue);
                        UserStorageService userStorage = userStorage(user.userId);
                        if (userStorage != null) {
                            userStorage.mo222772a(user);
                        }
                    }
                }
            }
            Unit unit = Unit.INSTANCE;
        }
        Companion bVar2 = Companion;
        bVar2.mo222768a("update user status: " + map + ", changed: " + z);
        return z;
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserListStorageService
    public void updateUsers(List<? extends User> list) {
        Intrinsics.checkParameterIsNotNull(list, "updatedUsers");
        synchronized (this) {
            Companion bVar = Companion;
            StringBuilder sb = new StringBuilder();
            sb.append("update users: ");
            List<? extends User> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().userId);
            }
            sb.append(arrayList);
            bVar.mo222768a(sb.toString());
            ObservableArrayList<User> observableArrayList = this.users;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(observableArrayList, 10));
            int i = 0;
            for (User user : observableArrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                arrayList2.add(TuplesKt.to(user.userId, Integer.valueOf(i)));
                i = i2;
            }
            Map map = MapsKt.toMap(arrayList2);
            for (T t : list) {
                Integer num = (Integer) map.get(t.userId);
                if (num != null) {
                    this.users.set(num.intValue(), t);
                }
            }
            writeUsers(list);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserListStorageService
    public List<User> addOrUpdateUsers(List<? extends User> list, IUserListStorageService.BlockListOp blockListOp) {
        List<User> addOrUpdateUsers;
        Intrinsics.checkParameterIsNotNull(list, "addedUsers");
        Intrinsics.checkParameterIsNotNull(blockListOp, "op");
        synchronized (this) {
            addOrUpdateUsers = addOrUpdateUsers(this.users.size(), list, blockListOp);
        }
        return addOrUpdateUsers;
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserListStorageService
    public List<User> removeUsersById(Collection<String> collection, IUserListStorageService.BlockListOp blockListOp) {
        List<User> removeUsers;
        Intrinsics.checkParameterIsNotNull(collection, "userIds");
        Intrinsics.checkParameterIsNotNull(blockListOp, "op");
        synchronized (this) {
            Set set = CollectionsKt.toSet(collection);
            ArrayList arrayList = new ArrayList();
            for (User user : this.users) {
                if (set.contains(user.userId)) {
                    arrayList.add(user);
                }
            }
            removeUsers = removeUsers(arrayList, blockListOp);
        }
        return removeUsers;
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserListStorageService
    public List<User> moveUser(String str, int i) {
        boolean z;
        boolean z2;
        Intrinsics.checkParameterIsNotNull(str, "userId");
        synchronized (this) {
            Iterator<E> it = this.users.iterator();
            boolean z3 = false;
            int i2 = 0;
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
            Companion bVar = Companion;
            bVar.mo222768a("moveUser, move " + str + " from " + i2 + " to " + i + ", users size: " + this.users.size());
            if (i2 == i) {
                bVar.mo222768a("moveUser, same index, skip");
                return this.users;
            } else if (i < 0 || i2 < 0 || i > this.users.size()) {
                StringBuilder sb = new StringBuilder();
                sb.append("moveUser, invalid operation: toIndex < 0? ");
                if (i < 0) {
                    z = true;
                } else {
                    z = false;
                }
                sb.append(z);
                sb.append(", indexOfMovedUser < 0? ");
                if (i2 < 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                sb.append(z2);
                sb.append(", toIndex > users.size? ");
                if (i > this.users.size()) {
                    z3 = true;
                }
                sb.append(z3);
                Companion.m252798a(bVar, sb.toString(), null, 2, null);
                return this.users;
            } else {
                ObservableArrayList<User> observableArrayList = this.users;
                observableArrayList.add(Math.min(i, observableArrayList.size()), this.users.remove(i2));
                bVar.mo222768a("after move, userIdList: " + readUserIdList());
                return this.users;
            }
        }
    }

    public List<User> removeUsers(List<? extends User> list, IUserListStorageService.BlockListOp blockListOp) {
        ObservableArrayList<User> observableArrayList;
        Intrinsics.checkParameterIsNotNull(list, "removedUsers");
        Intrinsics.checkParameterIsNotNull(blockListOp, "op");
        synchronized (this) {
            List<? extends User> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().userId);
            }
            Set set = CollectionsKt.toSet(arrayList);
            clearUsersById(set);
            handleBlockSetOp(CollectionsKt.toMutableList((Collection) list), blockListOp);
            CollectionsKt.removeAll((List) this.users, (Function1) new C64288e(set));
            Companion bVar = Companion;
            bVar.mo222768a("remove users: " + set + ", after removed, userIdList: " + readUserIdList());
            observableArrayList = this.users;
        }
        return observableArrayList;
    }

    private final void handleBlockSetOp(Collection<User> collection, IUserListStorageService.BlockListOp blockListOp) {
        synchronized (this) {
            int i = C64316f.f162538a[blockListOp.ordinal()];
            if (i == 1) {
                Iterator<User> it = collection.iterator();
                while (it.hasNext()) {
                    User next = it.next();
                    if (this.blockedUserIdSet.contains(next.userId)) {
                        it.remove();
                    }
                    Companion bVar = Companion;
                    bVar.mo222768a("handle block set op, user: " + next.userId + " be blocked");
                }
            } else if (i == 2) {
                Collection<User> collection2 = collection;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection2, 10));
                Iterator<T> it2 = collection2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().userId);
                }
                ArrayList arrayList2 = arrayList;
                this.blockedUserIdSet.removeAll(arrayList2);
                Companion bVar2 = Companion;
                bVar2.mo222768a("handle block set op, remove from block list, user id list: " + arrayList2);
            } else if (i == 3) {
                Collection<User> collection3 = collection;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection3, 10));
                Iterator<T> it3 = collection3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(it3.next().userId);
                }
                ArrayList arrayList4 = arrayList3;
                this.blockedUserIdSet.addAll(arrayList4);
                Companion bVar3 = Companion;
                bVar3.mo222768a("handle block set op, add into block list, user id list: " + arrayList4);
            } else if (i == 4) {
                Collection<User> collection4 = collection;
                ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection4, 10));
                Iterator<T> it4 = collection4.iterator();
                while (it4.hasNext()) {
                    arrayList5.add(it4.next().userId);
                }
                Companion bVar4 = Companion;
                bVar4.mo222768a("handle block set op, do nothing, user id list: " + arrayList5);
            }
            writeBlockUserListToDisk();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserListStorageService
    public List<User> addOrUpdateUsers(int i, List<? extends User> list, IUserListStorageService.BlockListOp blockListOp) {
        ObservableArrayList<User> observableArrayList;
        ObservableArrayList<User> observableArrayList2;
        Intrinsics.checkParameterIsNotNull(list, "addedUsers");
        Intrinsics.checkParameterIsNotNull(blockListOp, "op");
        if (list.isEmpty()) {
            Companion bVar = Companion;
            bVar.mo222768a("addOrUpdateUsers, index: " + i + ", op: " + blockListOp + ", added users is empty, skip");
            synchronized (this) {
                observableArrayList2 = this.users;
            }
            return observableArrayList2;
        }
        synchronized (this) {
            ObservableArrayList<User> observableArrayList3 = this.users;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(observableArrayList3, 10));
            int i2 = 0;
            for (User user : observableArrayList3) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                arrayList.add(TuplesKt.to(user.userId, Integer.valueOf(i2)));
                i2 = i3;
            }
            Map map = MapsKt.toMap(arrayList);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            SparseArray sparseArray = new SparseArray();
            for (T t : list) {
                Integer num = (Integer) map.get(t.userId);
                if (num != null) {
                    sparseArray.put(num.intValue(), t);
                } else {
                    linkedHashSet.add(t);
                }
            }
            Companion bVar2 = Companion;
            StringBuilder sb = new StringBuilder();
            sb.append("addOrUpdate, update users size: ");
            sb.append(sparseArray.size());
            sb.append(", content: ");
            Collection<User> a = C49184d.m193924a(sparseArray);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(a, 10));
            for (User user2 : a) {
                arrayList2.add(user2.userId);
            }
            sb.append(arrayList2);
            bVar2.mo222768a(sb.toString());
            int size = sparseArray.size();
            for (int i4 = 0; i4 < size; i4++) {
                int keyAt = sparseArray.keyAt(i4);
                User user3 = (User) sparseArray.valueAt(i4);
                if (user3 != null) {
                    this.users.set(keyAt, user3);
                }
            }
            writeUsers(C49184d.m193924a(sparseArray));
            handleBlockSetOp(linkedHashSet, blockListOp);
            Companion bVar3 = Companion;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("addOrUpdate, new users size: ");
            sb2.append(linkedHashSet.size());
            sb2.append(", content: ");
            LinkedHashSet<User> linkedHashSet2 = linkedHashSet;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(linkedHashSet2, 10));
            for (User user4 : linkedHashSet2) {
                arrayList3.add(user4.userId);
            }
            sb2.append(arrayList3);
            bVar3.mo222768a(sb2.toString());
            this.users.addAll(i, linkedHashSet);
            writeUsers(linkedHashSet);
            Companion bVar4 = Companion;
            bVar4.mo222768a("addUsers to " + i + ", after add, size: " + this.users.size() + " userIdList: " + readUserIdList());
            observableArrayList = this.users;
        }
        return observableArrayList;
    }
}
