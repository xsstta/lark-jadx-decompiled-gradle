package com.tt.miniapphost;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import com.bytedance.ee.lark.infra.config.mina.keys.Settings;
import com.bytedance.ee.lark.infra.config.mina.p614a.C12738a;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.hms.framework.common.ContainerUtils;
import com.larksuite.suite.R;
import com.tt.miniapp.AppbrandConstant;
import com.tt.miniapp.manager.p3302a.C66377a;
import com.tt.miniapp.manager.p3302a.C66399c;
import com.tt.miniapphost.entity.DisableStateEntity;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.p3368b.AbstractC67469b;
import com.tt.miniapphost.p3370d.C67478b;
import com.tt.miniapphost.util.C67590h;

/* renamed from: com.tt.miniapphost.c */
public class C67470c implements AbstractC67469b {

    /* renamed from: a */
    public String f170102a = "BundleManager";

    /* renamed from: a */
    private boolean m262431a() {
        if (Build.VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private boolean m262432b() {
        Application applicationContext = AppbrandContext.getInst().getApplicationContext();
        if (applicationContext != null && C66377a.m259531a(applicationContext).getInt("tma_switch", 0) == 0) {
            return true;
        }
        return false;
    }

    @Override // com.tt.miniapphost.p3368b.AbstractC67469b
    /* renamed from: a */
    public boolean mo234216a(int i) {
        if (mo234217b(i) == null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private boolean m262433c(int i) {
        Application applicationContext = AppbrandContext.getInst().getApplicationContext();
        if (applicationContext == null) {
            return false;
        }
        int a = C12738a.m52722a(applicationContext, 0, Settings.TT_TMA_BLACKLIST, Settings.TmaBlackList.DEVICE, Settings.TmaBlackList.DeviceBlackList.TMA);
        int a2 = C12738a.m52722a(applicationContext, 0, Settings.TT_TMA_BLACKLIST, Settings.TmaBlackList.DEVICE, Settings.TmaBlackList.DeviceBlackList.TMG);
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (a2 == 1 && a == 1) {
                        return false;
                    }
                    return true;
                } else if (a2 == 1 || a == 1) {
                    return false;
                } else {
                    return true;
                }
            } else if (a2 != 1) {
                return true;
            } else {
                return false;
            }
        } else if (a != 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override // com.tt.miniapphost.p3368b.AbstractC67469b
    /* renamed from: b */
    public DisableStateEntity mo234217b(int i) {
        if (!m262432b()) {
            String a = C67590h.m263073a((int) R.string.microapp_m_has_banned);
            return new DisableStateEntity(a, AppbrandConstant.C65701b.m257612c().mo230148m() + "?" + C67478b.m262466b());
        } else if (!m262433c(i)) {
            String a2 = C67590h.m263073a((int) R.string.microapp_m_current_device_in_blacklist);
            return new DisableStateEntity(a2, AppbrandConstant.C65701b.m257612c().mo230151p() + ContainerUtils.FIELD_DELIMITER + C67478b.m262466b());
        } else if (m262431a()) {
            return HostDependManager.getInst().checkExtraAppbrandDisableState(i);
        } else {
            String a3 = C67590h.m263073a((int) R.string.microapp_m_current_device_lower_then_miniversion);
            return new DisableStateEntity(a3, AppbrandConstant.C65701b.m257612c().mo230150o() + ContainerUtils.FIELD_DELIMITER + C67478b.m262466b());
        }
    }

    @Override // com.tt.miniapphost.p3368b.AbstractC67469b
    /* renamed from: a */
    public void mo234215a(final Context context, final AbstractC67433a aVar) {
        Observable.create(new Action() {
            /* class com.tt.miniapphost.C67470c.C674711 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                C66399c.m259608a().mo231915a(context, (IAppContext) aVar);
                AppBrandLogger.m52830i(C67470c.this.f170102a, "updateInfo : ");
                C66399c.m259608a().mo231917a(context, false, aVar);
            }
        }).schudleOn(Schedulers.longIO()).subscribeSimple();
    }
}
