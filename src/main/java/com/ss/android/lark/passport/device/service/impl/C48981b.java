package com.ss.android.lark.passport.device.service.impl;

import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.entity.DevicesStatus;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49399l;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49400m;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.passport.device.service.impl.b */
public class C48981b {

    /* renamed from: a */
    public final List<AbstractC49400m> f122998a;

    /* renamed from: b */
    public final List<AbstractC49399l> f122999b;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.passport.device.service.impl.b$a */
    public static class C48986a {

        /* renamed from: a */
        public static final C48981b f123004a = new C48981b();
    }

    /* renamed from: a */
    public static final C48981b m192898a() {
        return C48986a.f123004a;
    }

    private C48981b() {
        this.f122998a = new CopyOnWriteArrayList();
        this.f122999b = new CopyOnWriteArrayList();
    }

    /* renamed from: b */
    public void mo171014b() {
        ServiceFinder.m193752g().getPush().mo145159a(new AbstractC49352d<Boolean>() {
            /* class com.ss.android.lark.passport.device.service.impl.C48981b.C489843 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
            /* renamed from: a */
            public void mo145178a(NetworkErrorResult networkErrorResult) {
            }

            /* renamed from: a */
            public void mo145179a(Boolean bool) {
                for (AbstractC49399l lVar : C48981b.this.f122999b) {
                    lVar.mo143847a(bool.booleanValue());
                }
            }
        });
        ServiceFinder.m193752g().getPush().mo145165b(new AbstractC49352d<DevicesStatus.DeviceStatus>() {
            /* class com.ss.android.lark.passport.device.service.impl.C48981b.C489854 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
            /* renamed from: a */
            public void mo145178a(NetworkErrorResult networkErrorResult) {
            }

            /* renamed from: a */
            public void mo145179a(DevicesStatus.DeviceStatus deviceStatus) {
                for (AbstractC49400m mVar : C48981b.this.f122998a) {
                    mVar.mo133520a(deviceStatus);
                }
            }
        });
    }

    /* renamed from: b */
    public void mo171015b(AbstractC49399l lVar) {
        ServiceFinder.m193752g().getPush().mo145160a(this.f122999b, lVar);
    }

    /* renamed from: a */
    public void mo171012a(AbstractC49399l lVar) {
        ServiceFinder.m193752g().getPush().mo145161a(this.f122999b, lVar, new AbstractC49352d<Boolean>() {
            /* class com.ss.android.lark.passport.device.service.impl.C48981b.C489832 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
            /* renamed from: a */
            public void mo145178a(NetworkErrorResult networkErrorResult) {
            }

            /* renamed from: a */
            public void mo145179a(Boolean bool) {
                for (AbstractC49399l lVar : C48981b.this.f122999b) {
                    lVar.mo143847a(bool.booleanValue());
                }
            }
        });
    }

    /* renamed from: b */
    public void mo171016b(AbstractC49400m mVar) {
        ServiceFinder.m193752g().getPush().mo145162a(this.f122998a, mVar);
    }

    /* renamed from: a */
    public void mo171013a(AbstractC49400m mVar) {
        ServiceFinder.m193752g().getPush().mo145163a(this.f122998a, mVar, new AbstractC49352d<DevicesStatus.DeviceStatus>() {
            /* class com.ss.android.lark.passport.device.service.impl.C48981b.C489821 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
            /* renamed from: a */
            public void mo145178a(NetworkErrorResult networkErrorResult) {
            }

            /* renamed from: a */
            public void mo145179a(DevicesStatus.DeviceStatus deviceStatus) {
                for (AbstractC49400m mVar : C48981b.this.f122998a) {
                    mVar.mo133520a(deviceStatus);
                }
            }
        });
    }
}
