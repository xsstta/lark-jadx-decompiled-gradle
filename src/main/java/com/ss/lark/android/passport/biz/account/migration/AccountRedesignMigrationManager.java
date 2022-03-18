package com.ss.lark.android.passport.biz.account.migration;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.p2069j.p2070a.C40656w;
import com.ss.android.lark.passport.infra.base.p2425b.C49038b;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49224w;
import com.ss.android.lark.passport.infra.watcher.WatcherHelper;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.lark.android.passport.biz.account.UserInfoKeys;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0011\u001a\u00020\nJ\b\u0010\u0012\u001a\u00020\u0013H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/lark/android/passport/biz/account/migration/AccountRedesignMigrationManager;", "", "()V", "MIGRATE_DOING", "", "MIGRATE_DONE", "MIGRATE_READY", "TAG", "", "isMigrationCompleted", "", "()Z", "migrateStatus", "Ljava/util/concurrent/atomic/AtomicInteger;", "migrationTasks", "", "Lcom/ss/lark/android/passport/biz/account/migration/IAccountRedesignMigration;", "hasLegacyUser", "migrateIfNeeded", "", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.account.migration.a */
public final class AccountRedesignMigrationManager {

    /* renamed from: a */
    public static final AccountRedesignMigrationManager f162563a = new AccountRedesignMigrationManager();

    /* renamed from: b */
    private static final List<IAccountRedesignMigration> f162564b = CollectionsKt.listOf((Object[]) new IAccountRedesignMigration[]{UserInfoMigration.f162580a, GlobalInfoMigration.f162566a});

    /* renamed from: c */
    private static final AtomicInteger f162565c;

    private AccountRedesignMigrationManager() {
    }

    /* renamed from: a */
    public final boolean mo222799a() {
        if (f162565c.get() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo222800b() {
        String b = C49038b.m193165a().mo171219b(UserInfoKeys.f162529b.mo171118a(), "");
        Intrinsics.checkExpressionValueIsNotNull(b, "SPHelper.getInstance().g…serInfoKeys.User.key, \"\")");
        return !StringsKt.isBlank(b);
    }

    static {
        int i = 2;
        boolean z = true;
        AtomicInteger atomicInteger = new AtomicInteger(0);
        f162565c = atomicInteger;
        boolean z2 = C57744a.m224104a().getBoolean(IAccountRedesignMigration.f162567b.mo222844a().mo171118a(), false);
        boolean c = SessionUpgradeChecker.f162576a.mo222856c();
        if (!SessionUpgradeChecker.f162576a.mo222855b() || C49224w.m194052a()) {
            z = false;
        }
        Log.m165389i("MigrationManager", "init, migrated: " + z2 + ", upgraded: " + c + ", upgradeNotStartInCurrentProcess: " + z);
        if (!z2 && !c && !z) {
            i = 0;
        }
        atomicInteger.set(i);
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m252906c() {
        Object obj;
        AtomicInteger atomicInteger = f162565c;
        if (atomicInteger.get() == 0) {
            UniContext uniContext = UniContext.CONTEXT_EMPTY;
            C40656w wVar = C40656w.f103219a;
            Intrinsics.checkExpressionValueIsNotNull(wVar, "EPMClientPassportMonitor…ode.ACCOUNT_MIGRATE_START");
            WatcherHelper.m193666a(uniContext, wVar, null, 4, null);
            long currentTimeMillis = System.currentTimeMillis();
            Log.m165389i("MigrationManager", "migrateIfNeeded: start");
            atomicInteger.set(1);
            try {
                Result.Companion aVar = Result.Companion;
                Iterator<T> it = f162564b.iterator();
                while (it.hasNext()) {
                    it.next().mo222801a();
                }
                obj = Result.m271569constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion aVar2 = Result.Companion;
                obj = Result.m271569constructorimpl(C69097g.m265890a(th));
            }
            Throwable r0 = Result.m271572exceptionOrNullimpl(obj);
            f162565c.set(2);
            if (r0 != null) {
                Log.m165384e("MigrationManager", "migrate failed", r0);
                UniContext uniContext2 = UniContext.CONTEXT_EMPTY;
                C40656w wVar2 = C40656w.f103220b;
                Intrinsics.checkExpressionValueIsNotNull(wVar2, "EPMClientPassportMonitor…Code.ACCOUNT_MIGRATE_FAIL");
                WatcherHelper.m193666a(uniContext2, wVar2, null, 4, null);
                ServiceFinder.m193757l().appendAllUserToOfflineLogoutTask();
                ServiceFinder.m193744a().removeAllUsers();
            }
            Log.m165389i("MigrationManager", "migrateIfNeeded: end, cost: " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
            C57744a.m224104a().putBoolean(IAccountRedesignMigration.f162567b.mo222844a().mo171118a(), true);
        }
    }
}
