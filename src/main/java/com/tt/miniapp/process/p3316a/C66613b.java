package com.tt.miniapp.process.p3316a;

import android.os.Parcelable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.process.C67562b;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3375a.C67560a;
import com.tt.miniapphost.process.p3376b.AbstractC67565b;

/* renamed from: com.tt.miniapp.process.a.b */
public class C66613b {
    /* renamed from: a */
    public static void m260242a() {
        for (String str : C67562b.C67563a.f170377a) {
            C67560a.m262960a(str, "notifyUpdateSnapshot", null, null);
        }
    }

    /* renamed from: a */
    public static void m260243a(String str) {
        C67560a.m262960a(str, "notifyUpdateSnapshot", null, null);
    }

    /* renamed from: b */
    public static void m260247b(String str) {
        CrossProcessDataEntity b = CrossProcessDataEntity.C67574a.m263013a().mo234760a("localeLang", (Object) str).mo234763b();
        for (String str2 : C67562b.C67563a.f170377a) {
            C67560a.m262960a(str2, "notifyLanguageChange", b, null);
        }
    }

    /* renamed from: a */
    public static void m260246a(String str, AbstractC67565b bVar) {
        C67560a.m262960a(str, "getSnapshot", null, bVar);
    }

    /* renamed from: a */
    public static void m260244a(final String str, final int i, final boolean z) {
        Observable.create(new Action() {
            /* class com.tt.miniapp.process.p3316a.C66613b.C666141 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                C67560a.m262960a(str, "savePermissionGrant", CrossProcessDataEntity.C67574a.m263013a().mo234760a("appbrandPermissionType", (Object) Integer.valueOf(i)).mo234760a("isGranted", (Object) Boolean.valueOf(z)).mo234763b(), null);
            }
        }).schudleOn(Schedulers.shortIO()).subscribeSimple();
    }

    /* renamed from: a */
    public static void m260245a(String str, AppInfoEntity appInfoEntity, String str2, String str3) {
        C67560a.m262960a(str, "prepareLaunch", CrossProcessDataEntity.C67574a.m263013a().mo234758a("appinfo", (Parcelable) appInfoEntity).mo234760a("schema", (Object) str2).mo234760a("sand_box_env_name", (Object) str3).mo234763b(), null);
    }
}
