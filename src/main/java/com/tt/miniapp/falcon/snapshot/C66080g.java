package com.tt.miniapp.falcon.snapshot;

import android.content.SharedPreferences;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.storage.p640c.C12899a;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.tt.miniapp.falcon.snapshot.C66071b;
import com.tt.miniapphost.AppbrandContext;

/* renamed from: com.tt.miniapp.falcon.snapshot.g */
public class C66080g extends C66071b {

    /* renamed from: a */
    public final SharedPreferences f166793a;

    /* renamed from: b */
    public final String f166794b = mo231218a().mo231215b().mo231234a();

    /* renamed from: e */
    private boolean m258778e() {
        return "SNAPSHOT_CREATING_STATE_START".equals(this.f166793a.getString(this.f166794b, ""));
    }

    /* renamed from: c */
    public boolean mo231232c() {
        if (!mo231218a().mo231216c().mo231225a() || mo231218a().mo231215b().mo231237d()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public void mo231233d() {
        if (m258778e()) {
            AppBrandLogger.m52829e("SnapshotCreator", "createSnapshot: isCreatingSnapshot");
        } else if (mo231218a().mo231215b().mo231237d()) {
            AppBrandLogger.m52829e("SnapshotCreator", "createSnapshot: SnapshotFile exists");
        } else {
            AppBrandLogger.m52830i("SnapshotCreator", "createSnapshot: ");
            final String tracingID = AppbrandContext.getInst().getTracing().getTracingID();
            mo231219a(new C66071b.AbstractC66073a() {
                /* class com.tt.miniapp.falcon.snapshot.C66080g.C660811 */

                @Override // com.tt.miniapp.falcon.snapshot.C66071b.AbstractC66073a
                /* renamed from: a */
                public void mo231221a() {
                }

                @Override // com.tt.miniapp.falcon.snapshot.C66071b.AbstractC66073a
                /* renamed from: d */
                public void mo231224d() {
                }

                @Override // com.tt.miniapp.falcon.snapshot.C66071b.AbstractC66073a
                /* renamed from: b */
                public void mo231222b() {
                    new OPMonitor("mp_snapshot_create_start").tracing(tracingID).flush();
                    C66080g.this.f166793a.edit().putString(C66080g.this.f166794b, "SNAPSHOT_CREATING_STATE_START").commit();
                }

                @Override // com.tt.miniapp.falcon.snapshot.C66071b.AbstractC66073a
                /* renamed from: c */
                public void mo231223c() {
                    C66080g.this.f166793a.edit().remove(C66080g.this.f166794b).commit();
                    new OPMonitor("mp_snapshot_create_end").tracing(tracingID).flush();
                }
            });
        }
    }

    public C66080g(IAppContext iAppContext, String str, SnapshotType snapshotType) {
        super(iAppContext, str, snapshotType);
        this.f166793a = C12899a.m53203a(iAppContext.getApplicationContext(), "snapshot_creating_state_prefs");
    }
}
