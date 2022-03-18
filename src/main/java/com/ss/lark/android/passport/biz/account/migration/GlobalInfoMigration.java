package com.ss.lark.android.passport.biz.account.migration;

import com.ss.android.lark.passport.infra.base.p2426c.p2430d.C49067a;
import com.ss.android.lark.passport.infra.base.storage.IsolateStorage;
import com.ss.android.lark.passport.infra.base.storage.key.Key;
import com.ss.android.lark.passport.infra.base.storage.store.DataStorage;
import com.ss.lark.android.passport.biz.account.UserGlobalKeys;
import com.ss.lark.android.passport.biz.account.UserInfoGlobalSpHelper;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, d2 = {"Lcom/ss/lark/android/passport/biz/account/migration/GlobalInfoMigration;", "Lcom/ss/lark/android/passport/biz/account/migration/IAccountRedesignMigration;", "()V", "installKeyMap", "", "migrateIfNeeded", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.account.migration.b */
public final class GlobalInfoMigration implements IAccountRedesignMigration {

    /* renamed from: a */
    public static final GlobalInfoMigration f162566a;

    private GlobalInfoMigration() {
    }

    static {
        GlobalInfoMigration bVar = new GlobalInfoMigration();
        f162566a = bVar;
        bVar.m252909b();
    }

    /* renamed from: b */
    private final void m252909b() {
        LegacyDataManager.m252915a(LegacyDataManager.f162572a, UserGlobalKeys.f162499a, LegacyDataManager.f162572a.mo222851b(), null, 4, null);
        LegacyDataManager.m252915a(LegacyDataManager.f162572a, UserGlobalKeys.f162502d, LegacyDataManager.f162572a.mo222851b(), null, 4, null);
        LegacyDataManager.m252915a(LegacyDataManager.f162572a, UserGlobalKeys.f162504f, LegacyDataManager.f162572a.mo222846a(), null, 4, null);
        LegacyDataManager.m252915a(LegacyDataManager.f162572a, UserGlobalKeys.f162505g, LegacyDataManager.f162572a.mo222846a(), null, 4, null);
    }

    @Override // com.ss.lark.android.passport.biz.account.migration.IAccountRedesignMigration
    /* renamed from: a */
    public void mo222801a() {
        UserInfoGlobalSpHelper.m252850b((String) LegacyDataManager.f162572a.mo222847a((Key) UserGlobalKeys.f162499a, (Object) ""));
        LegacyDataManager.f162572a.mo222849a((Key) UserGlobalKeys.f162502d, (DataStorage) C49067a.m193335a(IsolateStorage.f123105c));
        LegacyDataManager.f162572a.mo222849a((Key) UserGlobalKeys.f162504f, (DataStorage) C49067a.m193335a(IsolateStorage.f123105c));
        LegacyDataManager.f162572a.mo222849a((Key) UserGlobalKeys.f162505g, (DataStorage) C49067a.m193335a(IsolateStorage.f123105c));
    }
}
